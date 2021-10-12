package com.example.rentsummary.controller;

import com.example.rentsummary.model.*;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseController {

    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected AjaxResult toAjax(int rows)
    {
        return rows > 0 ? success() : error();
    }

    /**
     * 响应返回结果
     *
     * @param result 结果
     * @return 操作结果
     */
    protected AjaxResult toAjax(boolean result)
    {
        return result ? success() : error();
    }

    /**
     * 返回成功
     */
    public AjaxResult success()
    {
        return AjaxResult.success();
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error()
    {
        return AjaxResult.error();
    }

    /**
     * 返回成功消息
     */
    public AjaxResult success(String message)
    {
        return AjaxResult.success(message);
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error(String message)
    {
        return AjaxResult.error(message);
    }

    /**
     * 返回错误码消息
     */
    public AjaxResult error(AjaxResult.Type type, String message)
    {
        return new AjaxResult(type, message);
    }


    //解析请求参数
    public RentRequestParaForAllhomes parseParaForAllhomes(HttpServletRequest request,String id, String name, String type) {
        //para
        String region = request.getParameter("region");
//        String district=request.getParameter("DISTRICT");

        int currentPage = Integer.parseInt(request.getParameter("currentPage"));

        String[] propertyTypes = request.getParameterValues("propertyTypes");

        int minprice = Integer.parseInt(request.getParameter("minprice"));
        int maxprice = Integer.parseInt(request.getParameter("maxprice"));
//
////        String anydate=request.getParameter("anydate"));
////        String datetype=request.getParameter("datetype"));
////        String date=request.getParameter("date");
//

       /* int minbedrooms = Integer.parseInt(request.getParameter("minbedrooms"));
        int maxbedrooms = Integer.parseInt(request.getParameter("maxbedrooms"));*/
//
      /*   int minbathrooms = Integer.parseInt(request.getParameter("minbathrooms"));
        int maxbathrooms = Integer.parseInt(request.getParameter("maxbathrooms"));
//
        int minparkings = Integer.parseInt(request.getParameter("minparking"));
        int maxparkings = Integer.parseInt(request.getParameter("maxparking"));*/
//
//        int minlandsize = Integer.parseInt(request.getParameter("minlandsize"));
//        int maxlandsize = Integer.parseInt(request.getParameter("maxlandsize"));

        String keywords = request.getParameter("keywords");

//        组装rentrequestparaforallhomes

        RentRequestParaForAllhomes para = new RentRequestParaForAllhomes();

        // 设置当前页数
        para.setPage(currentPage);

        RentRequestParaForAllhomes.FiltersBean filtersBean = new RentRequestParaForAllhomes.FiltersBean();
        para.setFilters(filtersBean);


        //设置租金
        RentRequestParaForAllhomes.FiltersBean.PriceBean priceBean = new RentRequestParaForAllhomes.FiltersBean.PriceBean();
        para.getFilters().setPrice(priceBean);
        para.getFilters().getPrice().setMin(minprice);
        para.getFilters().getPrice().setMax(maxprice);

        if (null != request.getParameter("Bedrooms") && StringUtils.isNotEmpty(request.getParameter("Bedrooms"))) {
            //设置床数
            RentRequestParaForAllhomes.FiltersBean.BedsBean bedsBean = new RentRequestParaForAllhomes.FiltersBean.BedsBean();
            para.getFilters().setBeds(bedsBean);

            para.getFilters().getBeds().setMin(Integer.parseInt(request.getParameter("Bedrooms")));
            if ("5".equals(request.getParameter("Bedrooms"))) {
                para.getFilters().getBeds().setMax(null);
            } else {
                para.getFilters().getBeds().setMax(Integer.parseInt(request.getParameter("Bedrooms")));
            }

        }
        if (null != request.getParameter("Bathrooms") && StringUtils.isNotEmpty(request.getParameter("Bathrooms"))) {
            //设置床数
            RentRequestParaForAllhomes.FiltersBean.BathsBean bedsBean = new RentRequestParaForAllhomes.FiltersBean.BathsBean();
            para.getFilters().setBaths(bedsBean);
            para.getFilters().getBaths().setMin(Integer.parseInt(request.getParameter("Bathrooms")));
            if ("5".equals(request.getParameter("Bathrooms"))) {
                para.getFilters().getBaths().setMax(null);
            } else {
                para.getFilters().getBaths().setMax(Integer.parseInt(request.getParameter("Bathrooms")));
            }

        }

        if (null != request.getParameter("Parking") && StringUtils.isNotEmpty(request.getParameter("Parking"))) {
            //设置床数
            RentRequestParaForAllhomes.FiltersBean.ParkingBean bedsBean = new RentRequestParaForAllhomes.FiltersBean.ParkingBean();
            para.getFilters().setParking(bedsBean);
            para.getFilters().getParking().setMin(Integer.parseInt(request.getParameter("Parking")));
            if ("5".equals(request.getParameter("Parking"))) {
                para.getFilters().getParking().setMax(null);
            } else {
                para.getFilters().getParking().setMax(Integer.parseInt(request.getParameter("Parking")));
            }

        }

        //设置浴室
//        RentRequestParaForAllhomes.FiltersBean.BathsBean bathsBean = new RentRequestParaForAllhomes.FiltersBean.BathsBean();
//        para.getFilters().setBaths(bathsBean);
//        para.getFilters().getBaths().setMin(minbathrooms);
//        para.getFilters().getBaths().setMax(maxbathrooms);

        //设置车位
//        RentRequestParaForAllhomes.FiltersBean.ParkingBean parkingBean = new RentRequestParaForAllhomes.FiltersBean.ParkingBean();
//        para.getFilters().setParking(parkingBean);
//        para.getFilters().getParking().setMin(minparkings);
//        para.getFilters().getParking().setMax(maxparkings);

        //设置区域大小
//        RentRequestParaForAllhomes.FiltersBean.BlockSizeBean blockSizeBean = new RentRequestParaForAllhomes.FiltersBean.BlockSizeBean();
//        para.getFilters().setBlockSize(blockSizeBean);
//        para.getFilters().getBlockSize().setMin(minlandsize);
//        para.getFilters().getBlockSize().setMax(maxlandsize);

        //设置关键字
        para.getFilters().setKeywords(null);
        if (StringUtils.isNotEmpty(keywords)) {
            para.getFilters().setKeywords(keywords);
        }

        //设置可用日期
//        RentRequestParaForAllhomes.FiltersBean.AvailabilityBean availabilityBean=new RentRequestParaForAllhomes.FiltersBean.AvailabilityBean();
//        para.getFilters().setAvailability(availabilityBean);
//        para.getFilters().getAvailability().setMin(null);
//        para.getFilters().getAvailability().setMax(null);
//        if(!anydate.equals("anydate")){
//            if (datetype.equals("before")){
//                para.getFilters().getAvailability().setMax(date);
//            }else {
//                para.getFilters().getAvailability().setMin(date);
//            }
//        }

        //设置地区
        List<RentRequestParaForAllhomes.FiltersBean.LocalitiesBean> localitiesBeanslist = new ArrayList<RentRequestParaForAllhomes.FiltersBean.LocalitiesBean>();
        para.getFilters().setLocalities(localitiesBeanslist);
   /*     RentRequestParaForAllhomes.FiltersBean.LocalitiesBean localitiesBean = new RentRequestParaForAllhomes.FiltersBean.LocalitiesBean();
        localitiesBean.setType("REGION");
        localitiesBean.setId(region);
       // localitiesBean.setSlug("canberra-act");
        para.getFilters().getLocalities().add(localitiesBean);*/

     /*   RentRequestParaForAllhomes.FiltersBean.LocalitiesBean localitiesBean1=new RentRequestParaForAllhomes.FiltersBean.LocalitiesBean();
        localitiesBean1.setType("state");
        localitiesBean1.setSlug("act");
        para.getFilters().getLocalities().add(localitiesBean1);*/

        if ("DIVISION".equals(type.toUpperCase())) {
            RentRequestParaForAllhomes.FiltersBean.LocalitiesBean DIVISIONlocalitiesBean1=new RentRequestParaForAllhomes.FiltersBean.LocalitiesBean();
            DIVISIONlocalitiesBean1.setType("DIVISION");
            DIVISIONlocalitiesBean1.setId(id);
            para.getFilters().getLocalities().add(DIVISIONlocalitiesBean1);
        }

        if ("REGION".equals(type.toUpperCase())) {
            RentRequestParaForAllhomes.FiltersBean.LocalitiesBean DIVISIONlocalitiesBean1=new RentRequestParaForAllhomes.FiltersBean.LocalitiesBean();
            DIVISIONlocalitiesBean1.setType("REGION");
            DIVISIONlocalitiesBean1.setId(id);
            para.getFilters().getLocalities().add(DIVISIONlocalitiesBean1);
        }

        if ("DISTRICT".equals(type.toUpperCase())) {
            RentRequestParaForAllhomes.FiltersBean.LocalitiesBean DIVISIONlocalitiesBean1=new RentRequestParaForAllhomes.FiltersBean.LocalitiesBean();
            DIVISIONlocalitiesBean1.setType("DISTRICT");
            DIVISIONlocalitiesBean1.setId(id);
            para.getFilters().getLocalities().add(DIVISIONlocalitiesBean1);
        }
       /* if(StringUtils.isNotEmpty(keywords)) {

           RentRequestParaForAllhomes.FiltersBean.LocalitiesBean DIVISIONlocalitiesBean1=new RentRequestParaForAllhomes.FiltersBean.LocalitiesBean();
            DIVISIONlocalitiesBean1.setType("DIVISION");
            DIVISIONlocalitiesBean1.setId("354");
            para.getFilters().getLocalities().add(DIVISIONlocalitiesBean1);

            // DISTRICT模糊查询
          *//*RentRequestParaForAllhomes.FiltersBean.LocalitiesBean localitiesBean1=new RentRequestParaForAllhomes.FiltersBean.LocalitiesBean();
            localitiesBean1.setType("DISTRICT");
            localitiesBean1.setSlug(keywords);
            para.getFilters().getLocalities().add(localitiesBean1);*//*
        }*/


        //设置propertyTypes
        // propertyTypes: ["HOUSE", "TOWNHOUSE"]
        if(null!= propertyTypes && propertyTypes.length >0) {
            List<String> propertiesList = Arrays.asList(propertyTypes);
            para.getFilters().setPropertyTypes(null);
            if (!propertiesList.contains("__ALL__")) {
                para.getFilters().setPropertyTypes(propertiesList);
            }

        }

        return para;


    }

    //解析请求参数
    public String parseParaForDomain(HttpServletRequest request) {


        // https://www.domain.com.au/rent/canberra-act/apartment/?bedrooms=1-any&price=100-2000&keywords=test
        // https://www.domain.com.au/rent/canberra-act/?ptype=apartment-unit-flat,block-of-units,new-apartments,pent-house,studio,town-house&bedrooms=1-any&price=100-2000&keywords=test
        //para
       // String region = request.getParameter("region");
//        String district=request.getParameter("DISTRICT");

        int currentPage = Integer.parseInt(request.getParameter("currentPage"));

        String[] propertyTypes = request.getParameterValues("propertyTypes");

        int minprice = Integer.parseInt(request.getParameter("minprice"));
        int maxprice = Integer.parseInt(request.getParameter("maxprice"));


//        String anydate=request.getParameter("anydate"));
//        String datetype=request.getParameter("datetype"));
//        String date=request.getParameter("date");

/*
        int minbedrooms = Integer.parseInt(request.getParameter("minbedrooms"));
        int maxbedrooms = Integer.parseInt(request.getParameter("maxbedrooms"));

        int minbathrooms = Integer.parseInt(request.getParameter("minbathrooms"));
        int maxbathrooms = Integer.parseInt(request.getParameter("maxbathrooms"));

        int minparkings = Integer.parseInt(request.getParameter("minparking"));
        int maxparkings = Integer.parseInt(request.getParameter("maxparking"));

        int minlandsize = Integer.parseInt(request.getParameter("minlandsize"));
        int maxlandsize = Integer.parseInt(request.getParameter("maxlandsize"));
*/

        String keywords = request.getParameter("keywords");

        //拼装get请求参数
        StringBuffer para = new StringBuffer();

        String region = request.getParameter("name");

        if(StringUtils.isNotEmpty(region)) {
            //组装地区参数
            para.append(region.split("-")[0].replaceAll(" ","").replace(",","-").trim().toLowerCase() + "/?page="+currentPage);
        } else {
            // propertyTypes: ["HOUSE", "TOWNHOUSE"]
            if(null!= propertyTypes && propertyTypes.length >0) {
               String propertyTypeTmp= StringUtils.join(propertyTypes, ",");
                if (!propertyTypeTmp.contains("Apartment")) {
                    para.append("/apartment/?page="+currentPage);
                } else if (!propertyTypeTmp.contains("House")) {
                    para.append("/house/?page="+currentPage);
                } else if (!propertyTypeTmp.contains("Townhouse")) {
                    para.append("/town-house/?page="+currentPage);
                }

            } else {
                para.append("/?page="+currentPage);
            }

        }


        //组装房屋类型为所有类型
        //不传参即可


        //设置propertyTypes
//        List<String> propertiesList = Arrays.asList(propertyTypes);
//        if (!propertiesList.contains("__ALL__")) {
//            //only test
//          //  para.append("ptype=apartment-unit-flat,block-of-units,duplex,free-standing,new-apartments,new-home-designs,new-house-land,pent-house,semi-detached,studio,terrace,town-house,villa&excludedeposittaken=1");
//        } else {
//           // para.append("ptype=apartment-unit-flat,block-of-units,duplex,free-standing,new-apartments,new-home-designs,new-house-land,pent-house,semi-detached,studio,terrace,town-house,villa&excludedeposittaken=1");
//        }
//        para.append("&");


        //设置租金
        para.append("&price=" + minprice + "-"+maxprice);

        if (null != request.getParameter("Bedrooms") && StringUtils.isNotEmpty(request.getParameter("Bedrooms"))) {
            int minbedrooms = Integer.parseInt(request.getParameter("Bedrooms"));
            //设置床数
            para.append("&bedrooms=" + minbedrooms + "-"+minbedrooms);
        }


        //设置浴室
        if (null != request.getParameter("Bathrooms") && StringUtils.isNotEmpty(request.getParameter("Bathrooms"))) {
            int bathrooms = Integer.parseInt(request.getParameter("Bathrooms"));
            //设置床数
            para.append("&bathrooms=" + bathrooms + "-"+bathrooms);
        }

        //设置车位
        if (null != request.getParameter("Parking") && StringUtils.isNotEmpty(request.getParameter("Parking"))) {
            int Parking = Integer.parseInt(request.getParameter("Parking"));
            //设置床数
            para.append("&carspaces="+ Parking + "-"+Parking);
        }





        //设置区域大小
      /*  para.append("landsize=" + minlandsize + "-any");
        para.append("&");*/

        //设置关键字
        if (StringUtils.isNotEmpty(keywords)) {
            para.append("&keywords=" + keywords);
        }

        return para.toString();
    }

    public String parseParaForZango(HttpServletRequest request,String type) {
        //para
//        String region = request.getParameter("REGION");
//        String district=request.getParameter("DISTRICT");

//        String[] propertyTypes = request.getParameterValues("propertyTypes");
//
        int minprice = Integer.parseInt(request.getParameter("minprice"));
        int maxprice = Integer.parseInt(request.getParameter("maxprice"));
//
////        String anydate=request.getParameter("anydate"));
////        String datetype=request.getParameter("datetype"));
////        String date=request.getParameter("date");
//
//        int minbedrooms = Integer.parseInt(request.getParameter("minbedrooms"));
//        int maxbedrooms = Integer.parseInt(request.getParameter("maxbedrooms"));
//
//        int minbathrooms = Integer.parseInt(request.getParameter("minbathrooms"));
//        int maxbathrooms = Integer.parseInt(request.getParameter("maxbathrooms"));
//
//        int minparkings = Integer.parseInt(request.getParameter("minparking"));
//        int maxparkings = Integer.parseInt(request.getParameter("maxparking"));
//
//        int minlandsize = Integer.parseInt(request.getParameter("minlandsize"));
//        int maxlandsize = Integer.parseInt(request.getParameter("maxlandsize"));


        //拼装get请求参数
        StringBuffer para = new StringBuffer();
        String region = request.getParameter("name");



        if(StringUtils.isNotEmpty(region)) {
            //组装地区参数
            String regiontmp = region.split("-")[0];
            if (regiontmp.split(",").length>2) {
                para.append(regiontmp.split(",")[0]+","+regiontmp.split(",")[2]+","+regiontmp.split(",")[1]);
            } else {
                para.append(regiontmp.split(",")[0]+","+regiontmp.split(",")[1]);
            }

        }
        //组装地区参数
//        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
//        para.append("&page="+currentPage);
        //para.append("&address_suburb=ACT+%26+Surrounds");



        //组装房屋类型为所有类型
        //不传参即可


        //设置propertyTypes
//        List<String> propertiesList = Arrays.asList(propertyTypes);
//        if (!propertiesList.contains("__ALL__")) {
//            //only test
//            para.append("ptype=apartment-unit-flat,block-of-units,duplex,free-standing,new-apartments,new-home-designs,new-house-land,pent-house,semi-detached,studio,terrace,town-house,villa&excludedeposittaken=1");
//        } else {
//            para.append("ptype=apartment-unit-flat,block-of-units,duplex,free-standing,new-apartments,new-home-designs,new-house-land,pent-house,semi-detached,studio,terrace,town-house,villa&excludedeposittaken=1");
//        }
//        para.append("&");


        //设置租金
        para.append("price__gte="+ minprice);
        para.append("&");
        para.append("price__lte=" + maxprice);
        para.append("&");


        if (null != request.getParameter("Bedrooms") && StringUtils.isNotEmpty(request.getParameter("Bedrooms"))) {
            //设置床数
             para.append("&bedrooms__gte=" + Integer.parseInt(request.getParameter("Bedrooms")));
            if (!"5".equals(request.getParameter("Bedrooms"))) {
              para.append("&bedrooms__lte=" + Integer.parseInt(request.getParameter("Bedrooms")));
            }

        }
        if (null != request.getParameter("Bathrooms") && StringUtils.isNotEmpty(request.getParameter("Bathrooms"))) {

            //设置浴室
            para.append("&bathrooms__gte=" + Integer.parseInt(request.getParameter("Bathrooms")));
            if (!"5".equals(request.getParameter("Bathrooms"))) {
               para.append("&bathrooms__lte=" + Integer.parseInt(request.getParameter("Bathrooms")));
            }

        }

        if (null != request.getParameter("Parking") && StringUtils.isNotEmpty(request.getParameter("Parking"))) {
            //设置床数
            RentRequestParaForAllhomes.FiltersBean.ParkingBean bedsBean = new RentRequestParaForAllhomes.FiltersBean.ParkingBean();
            para.append("&parking__gte=" + Integer.parseInt(request.getParameter("Parking")));
            if (!"5".equals(request.getParameter("Parking"))) {
                para.append("&parking__lte=" + Integer.parseInt(request.getParameter("Parking")));
            }
        }


//
//        //设置床数
//        para.append("bedrooms__gte=" + minbedrooms);
//        para.append("&");
//        para.append("bedrooms__lte=" + maxbedrooms);
//        para.append("&");
//
//        //设置浴室
//        para.append("bathrooms__gte=" + minbathrooms);
//        para.append("&");
//        para.append("bathrooms__lte=" + maxbathrooms);
//        para.append("&");
//
//        //设置车位
//        para.append("parking__gte=" + minparkings);
//        para.append("&");
//        para.append("parking__lte=" + maxparkings);
//        para.append("&");
//
//        //设置区域大小
//        para.append("area__gte=" + minlandsize);
//        para.append("&");
//        para.append("area__lte=" + maxlandsize);
//        para.append("&");

        // categories: House,Unit,Apartment

        // categories: House,Unit,Apartment,Townhouse,Villa,Studio,Flat,Warehouse,DuplexSemi-detached,Dual_occupancy,Land,Rural,MixedFarming,Alpine,AcreageSemi-rural,Retirement,BlockOfUnits,Terrace,ServicedApartment,Other
        //设置关键字
        String keywords = request.getParameter("keywords");
        if (keywords.length()!=0){
            para.append("&keywords=" + keywords);
        }

        return para.toString();
    }



    //解析请求参数
    public String parseParaForRealestate(HttpServletRequest request) {
        //para

        int currentPage = Integer.parseInt(request.getParameter("currentPage"));

        String[] propertyTypes = request.getParameterValues("propertyTypes");

        String keywords = request.getParameter("keywords");

//        // 组装RealestateRequest
//        RealestateRequest para = new RealestateRequest();
//
//        // searchByQuery
//        para.setOperationName("searchByQuery");
//
//        Extensions extensions = new Extensions();
//        PersistedQuery persistedQuery = new PersistedQuery();
//        persistedQuery.setVersion(1);
//        persistedQuery.setSha256Hash("f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570");
//        extensions.setPersistedQuery(persistedQuery);
//
//        Variables variables = new Variables();
//        variables.setNullifyOptionals(false);
//        variables.setTestListings(false);
//        variables.setRecentHides(null);

        String region = request.getParameter("name");

        // query: "{\"channel\":\"rent\",\"page\":1,\"pageSize\":25,\"filters\":{\"surroundingSuburbs\":false,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"furnished\":false,\"keywords\":{\"terms\":[\"test\"]},\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[{\"searchLocation\":\"canberra - greater region, act\"}]}"
        if(StringUtils.isNotEmpty(region)) {
            //组装地区参数
            //String regiontmp = region.split("-")[0];
            //para.append("&address_suburb="+regiontmp.split(",")[0]+","+regiontmp.split(",")[2]+","+regiontmp.split(",")[1]);
        }

        // query: "{\"channel\":\"rent\",\"page\":1,\"pageSize\":25,\"filters\":{\"bedroomsRange\":{\"minimum\":\"1\",\"maximum\":\"1\"},\"minimumBathroom\":\"1\",\"minimumCars\":\"1\",\"surroundingSuburbs\":true,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"ex-deposit-taken\":false,\"furnished\":false,\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[]}"
        String query="";
        String querytmp="";
        // \\\"bedroomsRange\\\":{\\\"minimum\\\":\\\""+Integer.parseInt(request.getParameter("Bedrooms"))+"\\\",\\\"maximum\\\":\\\""+Integer.parseInt(request.getParameter("Bedrooms"))+"\\\"},\\\"maximumBathroom\\\":\\\"1\\\",\\\"maximumCars\\\":\\\"1\\\",
        if (null != request.getParameter("Bedrooms") && StringUtils.isNotEmpty(request.getParameter("Bedrooms"))) {
            //设置床数
            querytmp+="\\\"bedroomsRange\\\":{\\\"minimum\\\":\\\""+Integer.parseInt(request.getParameter("Bedrooms"))+"\\\",\\\"maximum\\\":\\\""+Integer.parseInt(request.getParameter("Bedrooms"))+"\\\"},";

          //  querytmp+="{\\\"bedroomsRange\\\":{\\\"minimum\\\":\\\""+Integer.parseInt(request.getParameter("Bedrooms"))+"\\\",\\\"maximum\\\":\\\""+Integer.parseInt(request.getParameter("Bedrooms"))+"\\\"},";
        }
        if (null != request.getParameter("Bathrooms") && StringUtils.isNotEmpty(request.getParameter("Bathrooms"))) {

            //设置浴室
            //querytmp+="\\\"maximumBathroom\\\":"+Integer.parseInt(request.getParameter("Bathrooms")) +",";
            //  querytmp+="\\\"bathroomsRange\\\":{\"minimum\":"+Integer.parseInt(request.getParameter("Bathrooms"))+",\"maximum\":"+Integer.parseInt(request.getParameter("Bathrooms"))+"},";
            querytmp+="\\\"maximumBathroom\\\":\\\""+Integer.parseInt(request.getParameter("Bathrooms"))+"\\\",";
        }

        if (null != request.getParameter("Parking") && StringUtils.isNotEmpty(request.getParameter("Parking"))) {
            //设置床数
           // querytmp+="\\\"maxnimumCars\\\":\\\""+request.getParameter("Parking")+"\\\"" +",";
            querytmp+="\\\"maxnimumCars\\\":\\\""+Integer.parseInt(request.getParameter("Parking"))+"\\\",";
          //  querytmp+="\\\"carsRange\\\":{\"minimum\":"+Integer.parseInt(request.getParameter("Parking"))+",\"maximum\":"+Integer.parseInt(request.getParameter("Parking"))+"},";

        }

        if(null!= propertyTypes && propertyTypes.length >0) {
            String propertyTypeTmp= StringUtils.join(propertyTypes, ",");

            // \"bedroomsRange\":{\"minimum\":\"1\",\"maximum\":\"1\"},\"minimumBathroom\":\"1\",\"minimumCars\":\"1\"


            if (!propertyTypeTmp.contains("Apartment")) {
                query="{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\\\"channel\\\":\\\"rent\\\",\\\"page\\\":"+currentPage+",\\\"pageSize\\\":25,\\\"filters\\\":{ "+ querytmp +"\\\"propertyTypes\\\":[\\\"unit apartment\\\"],\\\"surroundingSuburbs\\\":false,\\\"excludeNoSalePrice\\\":false,\\\"ex-under-contract\\\":false,\\\"furnished\\\":false,\\\"petsAllowed\\\":false,\\\"hasScheduledAuction\\\":false},\\\"localities\\\":[{\\\"searchLocation\\\":\\\""+region.split("-")[0]+"\\\"}]}\",\"testListings\":false,\"nullifyOptionals\":false,\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";

            } else if (!propertyTypeTmp.contains("House")) {
                query="{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\\\"channel\\\":\\\"rent\\\",\\\"page\\\":"+currentPage+",\\\"pageSize\\\":25,\\\"filters\\\":{ "+ querytmp +"\\\"propertyTypes\\\":[\\\"house\\\"],\\\"surroundingSuburbs\\\":false,\\\"excludeNoSalePrice\\\":false,\\\"ex-under-contract\\\":false,\\\"furnished\\\":false,\\\"petsAllowed\\\":false,\\\"hasScheduledAuction\\\":false},\\\"localities\\\":[{\\\"searchLocation\\\":\\\""+region.split("-")[0]+"\\\"}]}\",\"testListings\":false,\"nullifyOptionals\":false,\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";

            } else if (!propertyTypeTmp.contains("Townhouse")) {
                query="{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\\\"channel\\\":\\\"rent\\\",\\\"page\\\":"+currentPage+",\\\"pageSize\\\":25,\\\"filters\\\":{ "+ querytmp +"\\\"propertyTypes\\\":[\\\"townhouse\\\"],\\\"surroundingSuburbs\\\":false,\\\"excludeNoSalePrice\\\":false,\\\"ex-under-contract\\\":false,\\\"furnished\\\":false,\\\"petsAllowed\\\":false,\\\"hasScheduledAuction\\\":false},\\\"localities\\\":[{\\\"searchLocation\\\":\\\""+region.split("-")[0]+"\\\"}]}\",\"testListings\":false,\"nullifyOptionals\":false,\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";

            }

        } else {

           query="{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\\\"channel\\\":\\\"rent\\\",\\\"page\\\":"+currentPage+",\\\"pageSize\\\":50,\\\"filters\\\":{ "+ querytmp +"\\\"surroundingSuburbs\\\":false,\\\"excludeNoSalePrice\\\":false,\\\"ex-under-contract\\\":false,\\\"furnished\\\":false,\\\"petsAllowed\\\":false,\\\"hasScheduledAuction\\\":false},\\\"localities\\\":[{\\\"searchLocation\\\":\\\""+region.split("-")[0]+"\\\"}]}\",\"testListings\":false,\"nullifyOptionals\":false,\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";
            // query="{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\\\"channel\\\":\\\"rent\\\",\\\"page\\\":"+currentPage+",\\\"pageSize\\\":50,\\\"filters\\\":{ \\\"surroundingSuburbs\\\":true,\\\"excludeNoSalePrice\\\":false,\\\"ex-under-contract\\\":false,\\\"ex-deposit-taken\\\":false,\\\"furnished\\\":false,\\\"petsAllowed\\\":false,\\\"hasScheduledAuction\\\":false},\\\"localities\\\":[]}\",\"testListings\":false,\"nullifyOptionals\":false,\"testId\":\"RentResults\",\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";


        }
        //String test ="{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\\\"channel\\\":\\\"rent\\\",\\\"page\\\":"+currentPage+",\\\"pageSize\\\":25,\\\"filters\\\":{\\\"propertyTypes\\\":[\\\"unit apartment\\\"],\\\"surroundingSuburbs\\\":false,\\\"excludeNoSalePrice\\\":false,\\\"ex-under-contract\\\":false,\\\"furnished\\\":false,\\\"petsAllowed\\\":false,\\\"hasScheduledAuction\\\":false},\\\"localities\\\":[{\\\"searchLocation\\\":\\\"canberra - greater region, act\\\"}]}\",\"testListings\":false,\"nullifyOptionals\":false,\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";

        // {"channel":"rent","page":1,"pageSize":25,"filters":{"propertyTypes":["house","unit apartment","townhouse","villa"],"surroundingSuburbs":false,"excludeNoSalePrice":false,"ex-under-contract":false,"furnished":false,"petsAllowed":false,"hasScheduledAuction":false},"localities":[{"searchLocation":"canberra - greater region, act"}]}
        //{"channel":"rent","page":1,"pageSize":25,"filters":{"propertyTypes":["house","unit apartment"],"surroundingSuburbs":false,"excludeNoSalePrice":false,"ex-under-contract":false,"furnished":false,"petsAllowed":false,"hasScheduledAuction":false},"localities":[{"searchLocation":"canberra - greater region, act"}]}
       // String query = "{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\"channel\":\"rent\",\"page\":"+currentPage+",\"pageSize\":25,\"filters\":{\"surroundingSuburbs\":false,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"furnished\":false,\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[{\"searchLocation\":\""+region.split("-")[0]+"\"}]}\",\"testListings\":false,\"nullifyOptionals\":false,\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";
       //  query="{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\\\"channel\\\":\\\"rent\\\",\\\"page\\\":"+currentPage+",\\\"pageSize\\\":25,\\\"filters\\\":{\\\"surroundingSuburbs\\\":false,\\\"excludeNoSalePrice\\\":false,\\\"ex-under-contract\\\":false,\\\"furnished\\\":false,\\\"petsAllowed\\\":false,\\\"hasScheduledAuction\\\":false,\"propertyTypes\":[\"house\",\"unit apartment\",\"townhouse\",\"villa\"]},\\\"localities\\\":[{\\\"searchLocation\\\":\\\""+region.split("-")[0]+"\\\"}]}\",\"testListings\":false,\"nullifyOptionals\":false,\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";
        //variables.setQuery(query);
       // para.setVariables(variables);



        return query;


    }

}
