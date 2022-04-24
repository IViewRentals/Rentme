package com.example.rentsummary.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.rentsummary.model.*;
import com.example.rentsummary.server.RentContextGet;
import com.example.rentsummary.server.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The controller to get rent data from each rent website.
 */
@Controller
public class RentController extends BaseController {

    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(value = "addUserHistory")
    public String addUserHistory(UserEntity userEntity) {
        System.out.println(userEntity);
        userService.addUserHistory(userEntity);
        return "success";
    }

    @ResponseBody
    @PostMapping(value = "getUserById")
    public String getUserById(int id) {
        UserEntity user = userService.getUserById(id);
        System.out.println(user.toString());
        JSONObject result = new JSONObject();
        if (user!= null) {
            result.put("result", user);
        } else {
            result.put("result", null);
        }
        return result.toString();
    }

    @GetMapping(value = "/toLogin")
    public String toLogin() { return "login.html"; }

    @GetMapping(value = "getrent")
    public String getRent(Model model,String keywords) {
        return "rentsummary";
    }

    @GetMapping(value = "search")
    public String search(Model model,String keywords) {
        return "common";
    }

    @PostMapping(value = "searchallbyname")
    @ResponseBody
    public AjaxResult searchallbyname(HttpServletRequest httpServletRequest,String name,String searchKey) {

       // String searchKey = httpServletRequest.getParameter("searchKey");
        String searchValue = httpServletRequest.getParameter("searchValue");

        // Get data based on parsed parameters
        JsonsRootBean result = RentContextGet.searchallbyname(name);

        List<CommonBean> commonBeanList= new ArrayList<>();

        if (null !=result) {
            // Division
            for (Division division:result.getDivision()) {
//                if(division.getName().split(",")[1].contains("ACT")) {
                    CommonBean item = new CommonBean();
                    item.setId(division.getValue());
                    item.setName(division.getName());
                    item.setType(division.getType());
                    commonBeanList.add(item);
//                }
            }

            // Region
            for (Region region:result.getRegion()) {
//                if(region.getName().split(",")[1].contains("ACT")) {
                    CommonBean item = new CommonBean();
                    item.setId(region.getValue());
                    item.setName(region.getName());
                    item.setType(region.getType());
                    commonBeanList.add(item);
//                }
            }

            // District
            for (District district:result.getDistrict()) {
//                if(district.getName().split(",")[1].contains("ACT")) {
                    CommonBean item = new CommonBean();
                    item.setId(district.getValue());
                    item.setName(district.getName());
                    item.setType(district.getType());
                    commonBeanList.add(item);
//                }
            }
        }

        // The return JSON data type from server, where list and totalRow must exist
        HashMap<String,Object> resultMap = new HashMap<>();
        HashMap<String,Object> resultSubMap = new HashMap<>();
        resultSubMap.put("totalRow",commonBeanList.size());
        resultSubMap.put("list",commonBeanList);
        resultMap.put("gridResult",resultSubMap );
        // Determine and process the return data
        if (commonBeanList.size() >0) {
            return AjaxResult.success("ok",resultMap);
        }
        return AjaxResult.error();
    }

    /**
     * Get data from www.allhomes.com.au
     *
     * @param httpServletRequest
     * @param currentPage
     * @param id
     * @param name
     * @param type
     * @return
     */
    @PostMapping("/getList")
    @ResponseBody
    public AjaxResult getList(HttpServletRequest httpServletRequest, int currentPage,String id, String name, String type) {

        // Determine parameters
        RentRequestParaForAllhomes rentRequestParaForAllhomes = parseParaForAllhomes(httpServletRequest,id,name,type);

        // Get data based on parsed parameters
        String result = RentContextGet.getRentFromAllHomes(rentRequestParaForAllhomes);

        // Determine and process the returned data
        if (StringUtils.isNotEmpty(result)) {
            return AjaxResult.success("ok",result);
        }
        return AjaxResult.error();
    }

    @PostMapping("/getDomainList")
    @ResponseBody
    public AjaxResult getDomainList(HttpServletRequest httpServletRequest, int currentPage,String keywords) {

        String queryParaForDomain = parseParaForDomain(httpServletRequest);

        // Get data based on parsed parameters
        String result = RentContextGet.getRentFromDomain(queryParaForDomain);

        // Determine and process the returned data
        if (StringUtils.isNotEmpty(result)) {
            return AjaxResult.success("ok",result);
        }
        return AjaxResult.error();
    }

    @PostMapping("/getZangoList")
    @ResponseBody
    public AjaxResult getZangoList(HttpServletRequest httpServletRequest, String keywords, String type) throws UnsupportedEncodingException {

        String queryParaForDomain = parseParaForZango(httpServletRequest,type);
        String[] propertyTypes = httpServletRequest.getParameterValues("propertyTypes");
        String categories="";

        int minprice = Integer.parseInt(httpServletRequest.getParameter("minprice"));
        int maxprice = Integer.parseInt(httpServletRequest.getParameter("maxprice"));

        if(null!= propertyTypes && propertyTypes.length >0) {
            //  bedrooms__gte=1&bathrooms__gte=1&parking__gte=1
            categories = "&categories="+StringUtils.join(propertyTypes, ",");
        }

        if (null != httpServletRequest.getParameter("Bedrooms") && StringUtils.isNotEmpty(httpServletRequest.getParameter("Bedrooms"))) {
            int minbedrooms = Integer.parseInt(httpServletRequest.getParameter("Bedrooms"));
            // Set bed number
            categories+="&bedrooms__gte=" + minbedrooms + "&bedrooms__lte="+minbedrooms;
        }

        // Set bathroom
        if (null != httpServletRequest.getParameter("Bathrooms") && StringUtils.isNotEmpty(httpServletRequest.getParameter("Bathrooms"))) {
            int bathrooms = Integer.parseInt(httpServletRequest.getParameter("Bathrooms"));
            // Set bed number
            categories+="&bathrooms__gte=" + bathrooms + "&bathrooms__lte="+bathrooms;
        }

        // Set parking slot
        if (null != httpServletRequest.getParameter("Parking") && StringUtils.isNotEmpty(httpServletRequest.getParameter("Parking"))) {
            int Parking = Integer.parseInt(httpServletRequest.getParameter("Parking"));
            // Set bed number
            categories+="&parking__gte="+ Parking + "&parking__lte="+Parking;
        }

        // price__gte=50&price__lte=450
        categories+="&price__gte=" + minprice + "&price__lte="+maxprice;

        int currentPage = Integer.parseInt(httpServletRequest.getParameter("currentPage"));
        // Get data based on parsed parameters
        String result = RentContextGet.getRentFromzango(queryParaForDomain,currentPage,categories);

        // Determine and process the returned data
        if (StringUtils.isNotEmpty(result)) {
            return AjaxResult.success("ok",result);
        }
        return AjaxResult.error();
    }

    @PostMapping("/getRealestateList")
    @ResponseBody
    public AjaxResult getRealestateList(HttpServletRequest httpServletRequest, int currentPage,String keywords) throws UnsupportedEncodingException {

        String queryParaForDomain = parseParaForRealestate(httpServletRequest);

        // Get data based on parsed parameters
        String result = RentContextGet.getRentFromRealestate(queryParaForDomain);

        // Determine and process the returned data
        if (StringUtils.isNotEmpty(result)) {
            return   AjaxResult.success("ok",result);
        }

        return   AjaxResult.error();

    }

    @GetMapping("/listcontent")
    public ModelAndView firstpage() {
        return new ModelAndView("listcontent");
    }

    @GetMapping(value = "/")
    public String toIndex(){
        return "homepage.html";
    }

    @GetMapping(value = "/rentme")
    public String rentme(HttpServletRequest httpServletRequest, String hidType){
        return "rentme.html";
    }

    @GetMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "rentsummary";
    }


    @GetMapping(value = "/allhomes")
    public String allhomes(){
        return "allhomes";
    }
    @GetMapping(value = "/domain")
    public String domain(){
        return "domain";
    }
    @GetMapping(value = "/realestate")
    public String realestate(){
        return "realestate";
    }
    @GetMapping(value = "/zango")
    public String zango(){
        return "zango";
    }

}
