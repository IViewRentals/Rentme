package com.example.rentsummary.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.rentsummary.model.*;
import com.example.rentsummary.server.RentContextGet;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.internal.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class RentController extends BaseController {

    @GetMapping(value = "getrent")
    public String getRent(Model model,String keywords) {


       // model.addAttribute("allhomes",RentContextGet.getRentFromAllHomes(keywords));
//       model.addAttribute("domain",RentContextGet.getRentFromDomain());
//        model.addAttribute("zango",RentContextGet.getRentFromzango());
//        model.addAttribute("realestate",RentContextGet.getRentFromRealestate());

        return "rentsummary";
//        return RentContextGet.getRent();
//        return RentContextGet.getRent();
//        return RentContextGet.getRentFromAllHomes();
//        return RentContextGet.getRentFromDomain();
    }

//    @GetMapping(value = "search")
//    public String search(Model model,String keywords) {
//
//        model.addAttribute("allhomes",RentContextGet.getRentFromAllHomes(keywords));
//
//        return RentContextGet.getRentFromAllHomes(keywords);
//    }

    @GetMapping(value = "search")
    public String search(Model model,String keywords) {

       //model.addAttribute("allhomes",RentContextGet.getRentFromAllHomes(keywords));

     return "common";

        //return RentContextGet.getRentFromAllHomes(keywords);
    }

    @PostMapping(value = "searchallbyname")
    @ResponseBody
    public AjaxResult searchallbyname(HttpServletRequest httpServletRequest,String name,String searchKey) {

       // String searchKey = httpServletRequest.getParameter("searchKey");
        String searchValue = httpServletRequest.getParameter("searchValue");

        // 根据解析参数获取数据
        JsonsRootBean result = RentContextGet.searchallbyname(name);


        List<CommonBean> commonBeanList= new ArrayList<>();

        if (null !=result) {

            // Division
            for (Division division:result.getDivision()) {

                if(division.getName().split(",")[1].contains("ACT")) {
                    CommonBean item = new CommonBean();
                    item.setId(division.getValue());
                    item.setName(division.getName());
                    item.setType(division.getType());
                    commonBeanList.add(item);
                }

            }

            // Region
            for (Region region:result.getRegion()) {
                if(region.getName().split(",")[1].contains("ACT")) {
                    CommonBean item = new CommonBean();
                    item.setId(region.getValue());
                    item.setName(region.getName());
                    item.setType(region.getType());
                    commonBeanList.add(item);
                }

            }

            // District
            for (District district:result.getDistrict()) {
                if(district.getName().split(",")[1].contains("ACT")) {
                    CommonBean item = new CommonBean();
                    item.setId(district.getValue());
                    item.setName(district.getName());
                    item.setType(district.getType());
                    commonBeanList.add(item);
                }
            }
        }

        //服务端返回的JSON数据格式
        //最重要的是list和totalRow两个节点必须存在
        HashMap<String,Object> resultMap = new HashMap<>();
        HashMap<String,Object> resultSubMap = new HashMap<>();
        resultSubMap.put("totalRow",commonBeanList.size());
        resultSubMap.put("list",commonBeanList);
        resultMap.put("gridResult",resultSubMap );
        // 判断返回数据，进行处理
        if (commonBeanList.size() >0) {
            return   AjaxResult.success("ok",resultMap);
        }

        return  AjaxResult.error();

    }

    /**
     *  获取www.allhomes.com.au数据
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

        // 解析参数
        RentRequestParaForAllhomes rentRequestParaForAllhomes = parseParaForAllhomes(httpServletRequest,id,name,type);

        // 根据解析参数获取数据
        String result = RentContextGet.getRentFromAllHomes(rentRequestParaForAllhomes);

        // 判断返回数据，进行处理
        if (StringUtils.isNotEmpty(result)) {
            return   AjaxResult.success("ok",result);
        }

        return   AjaxResult.error();

    }

    @PostMapping("/getDomainList")
    @ResponseBody
    public AjaxResult getDomainList(HttpServletRequest httpServletRequest, int currentPage,String keywords) {

        String queryParaForDomain = parseParaForDomain(httpServletRequest);

        // 根据解析参数获取数据
        String result = RentContextGet.getRentFromDomain(queryParaForDomain);

        // 判断返回数据，进行处理
        if (StringUtils.isNotEmpty(result)) {
            return   AjaxResult.success("ok",result);
        }

        return   AjaxResult.error();

    }


    @PostMapping("/getZangoList")
    @ResponseBody
    public AjaxResult getZangoList(HttpServletRequest httpServletRequest, String keywords, String type) throws UnsupportedEncodingException {

        String queryParaForDomain = parseParaForZango(httpServletRequest,type);

        int currentPage = Integer.parseInt(httpServletRequest.getParameter("currentPage"));
        // 根据解析参数获取数据
        String result = RentContextGet.getRentFromzango(queryParaForDomain,currentPage);

        // 判断返回数据，进行处理
        if (StringUtils.isNotEmpty(result)) {
            return   AjaxResult.success("ok",result);
        }

        return   AjaxResult.error();

    }

    @PostMapping("/getRealestateList")
    @ResponseBody
    public AjaxResult getRealestateList(HttpServletRequest httpServletRequest, int currentPage,String keywords) throws UnsupportedEncodingException {

        String queryParaForDomain = parseParaForRealestate(httpServletRequest);

        // 根据解析参数获取数据
        String result = RentContextGet.getRentFromRealestate(queryParaForDomain);

        // 判断返回数据，进行处理
        if (StringUtils.isNotEmpty(result)) {
            return   AjaxResult.success("ok",result);
        }

        return   AjaxResult.error();

    }

//    @PostMapping("/getList")
//    @ResponseBody
//    public AjaxResult getList(HttpServletRequest httpServletRequest, String keywords, String region, String street) {
//
//
//        RentRequestParaForAllhomes rentRequestParaForAllhomes = parseParaForAllhomes(httpServletRequest);
//       // String queryParaForDomain = parseParaForDomain(request);
//       // String queryParaForZango = parseParaForZango(request);
//
//        //1.生成httpclient，相当于该打开一个浏览器
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        CloseableHttpResponse response = null;
//        //2.创建get请求，相当于在浏览器地址栏输入 网址
//        HttpPost request = new HttpPost("https://www.allhomes.com.au/wsvc/search/rent-residential");
//        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
//        request.setHeader("Content-Type", "application/json");
//        request.setHeader("Accept-Encoding", "gzip, deflate, br");
//        request.setHeader("Accept", "*/*");
//        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
//
//        try {
//
//            // {"page":1,"pageSize":50,"sort":{"criteria":"PRICE","order":"ASC"},"filters":{"localities":[{"type":"REGION","id":391}]},"results":{"type":"LIST"}}
//// ,{\"type\":\"DISTRICT\",\"slug\":\""+region+"\"}
//            //allhomes
//            //	{"address":[],"street":[{"priority":1,"value":314410,"name":"Canberra Avenue, Capital Hill, ACT, 2600","type":"STREET"},{"priority":1,"value":314473,"name":"Canberra Avenue, Forrest, ACT, 2603","type":"STREET"},{"priority":1,"value":314557,"name":"Canberra Avenue, Fyshwick, ACT, 2609","type":"STREET"},{"priority":1,"value":2059,"name":"Canberra Avenue, Griffith, ACT, 2603","type":"STREET"},{"priority":1,"value":769385,"name":"Canberra Avenue, Jerrabomberra, ACT","type":"STREET"},{"priority":1,"value":4790,"name":"Canberra Avenue, Symonston, ACT, 2609","type":"STREET"},{"priority":2,"value":233013,"name":"Canberra Avenue, Berwick, VIC, 3806","type":"STREET"},{"priority":2,"value":83758,"name":"Canberra Avenue, Casula, NSW, 2170","type":"STREET"},{"priority":2,"value":148244,"name":"Canberra Avenue, Cooloola Cove, QLD, 4580","type":"STREET"},{"priority":2,"value":320159,"name":"Canberra Avenue, Crestwood, NSW, 2620","type":"STREET"},{"priority":2,"value":265930,"name":"Canberra Avenue, Dandenong, VIC, 3175","type":"STREET"},{"priority":2,"value":644962,"name":"Canberra Avenue, Greenwich, NSW, 2065","type":"STREET"},{"priority":2,"value":513453,"name":"Canberra Avenue, Hoppers Crossing, VIC, 3029","type":"STREET"},{"priority":2,"value":526338,"name":"Canberra Avenue, Mildura, VIC, 3500","type":"STREET"},{"priority":2,"value":364409,"name":"Canberra Avenue, Queanbeyan, NSW, 2620","type":"STREET"},{"priority":2,"value":364548,"name":"Canberra Avenue, Queanbeyan West, NSW, 2620","type":"STREET"},{"priority":2,"value":365843,"name":"Canberra Avenue, Richmond, NSW, 2753","type":"STREET"},{"priority":2,"value":369644,"name":"Canberra Avenue, South Durras, NSW, 2536","type":"STREET"},{"priority":2,"value":59305,"name":"Canberra Avenue, St Leonards, NSW, 2065","type":"STREET"},{"priority":2,"value":377590,"name":"Canberra Avenue, Turramurra, NSW, 2074","type":"STREET"}],"division":[{"priority":1,"value":18010,"name":"Canberra, ACT, 2601","type":"DIVISION"},{"priority":1,"value":26187,"name":"Canberra Airport, ACT, 2609","type":"DIVISION"}],"district":[],"region":[{"priority":1,"value":391,"name":"Canberra, ACT","type":"REGION"},{"priority":1,"value":391,"name":"Canberra - Greater Region, ACT","type":"REGION"}],"state":[],"postcode":[]}
//            // String paraJson = "{\"page\":1,\"pageSize\":50,\"sort\":{\"criteria\":\"PRICE\",\"order\":\"ASC\"},\"filters\":{\"localities\":[{\"type\":\"REGION\",\"slug\":\"canberra-act\"},{\"type\":\"DISTRICT\",\"slug\":\"greater-queanbeyan-queanbeyan-region-nsw\"}],\"beds\":{\"min\":4,\"max\":4}},\"results\":{\"type\":\"LIST\"}}";
//            //{"page":1,"pageSize":50,"sort":{"criteria":"PRICE","order":"ASC"},"filters":{"localities":[{"type":"REGION","slug":"canberra-act"}],"price":{"min":50,"max":100}},"results":{"type":"LIST"}}
//            // String paraJson = "{\"page\":1,\"pageSize\":50,\"sort\":{\"criteria\":\"PRICE\",\"order\":\"ASC\"},\"filters\":{\"localities\":[{\"type\":\"REGION\",\"slug\":\""+region+"\"} ] },\"results\":{\"type\":\"LIST\"}}";
//            String streetparam="";
//            if (!StringUtils.isEmpty(street)) {
//                streetparam = ",{\"type\":\"STREET\",\"id\":\""+street+"\"}";
//            }
//            String paraJson = "{\"page\":1,\"pageSize\":50,\"sort\":{\"criteria\":\"PRICE\",\"order\":\"ASC\"},\"filters\":{\"localities\":[{\"type\":\"REGION\",\"id\":\""+region+"\"} " + streetparam + "] },\"results\":{\"type\":\"LIST\"}}";
//
//            // {"page":1,"pageSize":50,"sort":{"criteria":"PRICE","order":"ASC"},"filters":{"localities":[{"type":"REGION","slug":act},{"type":"DISTRICT","slug":"greater-queanbeyan-queanbeyan-region-nsw"}],"beds":{"min":4,"max":4}},"results":{"type":"LIST"}}
//            StringEntity entity = new StringEntity(paraJson, "UTF-8");
//            request.setEntity(entity);
//
//            //3.执行get请求，相当于在输入地址栏后敲回车键
//            response = httpClient.execute(request);
//
//           // System.out.println("Allhomes get!!!");
//            //4.判断响应状态为200，进行处理
//            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                //5.获取响应内容
//                String html = EntityUtils.toString(response.getEntity(), "utf-8");
//                //AllHomesEntity allHomesEntity = JSONObject.parseObject(html, AllHomesEntity.class);
//                return   AjaxResult.success("ok",html);
//            }
//
//            return   AjaxResult.error();
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            //6.关闭
//            HttpClientUtils.closeQuietly(response);
//            HttpClientUtils.closeQuietly(httpClient);
//        }
//        return null;
//    }


    @GetMapping("/listcontent")
    public ModelAndView firstpage() {

        return new ModelAndView("listcontent");
    }


    @GetMapping(value = "/")
    public String toIndex(){

        return "index.html";
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
