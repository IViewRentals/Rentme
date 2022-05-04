package com.example.rentsummary.controller;

import com.example.rentsummary.model.AjaxResult;
import com.example.rentsummary.model.RentRequestParaForAllhomes;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The basic controller which is used to get and assemble address data.
 */
public class BaseController {

    /**
     * Response to the return result
     *
     * @param rows rows
     * @return operation result
     */
    protected AjaxResult toAjax(int rows)
    {
        return rows > 0 ? success() : error();
    }

    /**
     * Response to the return result
     *
     * @param result result
     * @return operation result
     */
    protected AjaxResult toAjax(boolean result)
    {
        return result ? success() : error();
    }

    /**
     * Return a success
     */
    public AjaxResult success()
    {
        return AjaxResult.success();
    }

    /**
     * Return a failure
     */
    public AjaxResult error()
    {
        return AjaxResult.error();
    }

    /**
     * Return a success message
     */
    public AjaxResult success(String message)
    {
        return AjaxResult.success(message);
    }

    /**
     * Return a failure message
     */
    public AjaxResult error(String message)
    {
        return AjaxResult.error(message);
    }

    /**
     * Return an error code message
     */
    public AjaxResult error(AjaxResult.Type type, String message)
    {
        return new AjaxResult(type, message);
    }


    // Parse request parameters
    public RentRequestParaForAllhomes parseParaForAllhomes(HttpServletRequest request,String id, String name, String type) {
        // para
        String region = request.getParameter("region");
//        String district=request.getParameter("DISTRICT");

        int currentPage = Integer.parseInt(request.getParameter("currentPage"));

        String[] propertyTypes = request.getParameterValues("propertyTypes");

        int minprice = Integer.parseInt(request.getParameter("minprice"));
        int maxprice = Integer.parseInt(request.getParameter("maxprice"));

        String keywords = request.getParameter("keywords");

        // Assemble rentrequestparaforallhomes

        RentRequestParaForAllhomes para = new RentRequestParaForAllhomes();

        // Set current page
        para.setPage(currentPage);

        RentRequestParaForAllhomes.FiltersBean filtersBean = new RentRequestParaForAllhomes.FiltersBean();
        para.setFilters(filtersBean);

        // Set rent
        RentRequestParaForAllhomes.FiltersBean.PriceBean priceBean = new RentRequestParaForAllhomes.FiltersBean.PriceBean();
        para.getFilters().setPrice(priceBean);
        para.getFilters().getPrice().setMin(minprice);
        para.getFilters().getPrice().setMax(maxprice);

        if (null != request.getParameter("Bedrooms") && StringUtils.isNotEmpty(request.getParameter("Bedrooms"))) {
            // Set bed number
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
            // Set bed number
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
            // Set bed number
            RentRequestParaForAllhomes.FiltersBean.ParkingBean bedsBean = new RentRequestParaForAllhomes.FiltersBean.ParkingBean();
            para.getFilters().setParking(bedsBean);
            para.getFilters().getParking().setMin(Integer.parseInt(request.getParameter("Parking")));
            if ("5".equals(request.getParameter("Parking"))) {
                para.getFilters().getParking().setMax(null);
            } else {
                para.getFilters().getParking().setMax(Integer.parseInt(request.getParameter("Parking")));
            }
        }

        // Set keyword
        para.getFilters().setKeywords(null);
        if (StringUtils.isNotEmpty(keywords)) {
            para.getFilters().setKeywords(keywords);
        }

        // Set location
        List<RentRequestParaForAllhomes.FiltersBean.LocalitiesBean> localitiesBeanslist = new ArrayList<RentRequestParaForAllhomes.FiltersBean.LocalitiesBean>();
        para.getFilters().setLocalities(localitiesBeanslist);

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

        // Set property type, propertyTypes: ["HOUSE", "TOWNHOUSE"]
        if(null!= propertyTypes && propertyTypes.length >0) {
            List<String> propertiesList = Arrays.asList(propertyTypes);
            para.getFilters().setPropertyTypes(null);
            if (!propertiesList.contains("__ALL__")) {
                para.getFilters().setPropertyTypes(propertiesList);
            }
        }
        return para;
    }

    // Parse request parameters
    public String parseParaForDomain(HttpServletRequest request) {

        // https://www.domain.com.au/rent/canberra-act/apartment/?bedrooms=1-any&price=100-2000&keywords=test
        // https://www.domain.com.au/rent/canberra-act/?ptype=apartment-unit-flat,block-of-units,new-apartments,pent-house,studio,town-house&bedrooms=1-any&price=100-2000&keywords=test
        // para
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));

        String[] propertyTypes = request.getParameterValues("propertyTypes");

        int minprice = Integer.parseInt(request.getParameter("minprice"));
        int maxprice = Integer.parseInt(request.getParameter("maxprice"));

        String keywords = request.getParameter("keywords");

        //  Assemble get request parameters
        StringBuffer para = new StringBuffer();

        String region = request.getParameter("name");

        if(StringUtils.isNotEmpty(region)) {
            // Assemble region parameters
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

        // Set rent
        para.append("&price=" + minprice + "-"+maxprice);

        if (null != request.getParameter("Bedrooms") && StringUtils.isNotEmpty(request.getParameter("Bedrooms"))) {
            int minbedrooms = Integer.parseInt(request.getParameter("Bedrooms"));
            // Set bed number
            para.append("&bedrooms=" + minbedrooms + "-"+minbedrooms);
        }

        // Set bathroom number
        if (null != request.getParameter("Bathrooms") && StringUtils.isNotEmpty(request.getParameter("Bathrooms"))) {
            int bathrooms = Integer.parseInt(request.getParameter("Bathrooms"));
            // Set bed number
            para.append("&bathrooms=" + bathrooms + "-"+bathrooms);
        }

        // Set parking slot
        if (null != request.getParameter("Parking") && StringUtils.isNotEmpty(request.getParameter("Parking"))) {
            int Parking = Integer.parseInt(request.getParameter("Parking"));
            // Set bed number
            para.append("&carspaces="+ Parking + "-"+Parking);
        }

        // Set keyword
        if (StringUtils.isNotEmpty(keywords)) {
            para.append("&keywords=" + keywords);
        }
        return para.toString();
    }

    public String parseParaForZango(HttpServletRequest request,String type) {

        // para
        int minprice = Integer.parseInt(request.getParameter("minprice"));
        int maxprice = Integer.parseInt(request.getParameter("maxprice"));

        // Assemble get request parameters
        StringBuffer para = new StringBuffer();
        String region = request.getParameter("name");

        if(StringUtils.isNotEmpty(region)) {
            // Assemble region parameters
            String regiontmp = region.split("-")[0];
            if (regiontmp.split(",").length>2) {
                para.append(regiontmp.split(",")[0]+","+regiontmp.split(",")[2]+","+regiontmp.split(",")[1]);
            } else {
                para.append(regiontmp.split(",")[0]+","+regiontmp.split(",")[1]);
            }
        }

        para.append("&");
        // Set rent
        para.append("price__gte="+ minprice);
        para.append("&");
        para.append("price__lte=" + maxprice);
        para.append("&");

        if (null != request.getParameter("Bedrooms") && StringUtils.isNotEmpty(request.getParameter("Bedrooms"))) {
            // Set bed number
            para.append("&bedrooms__gte=" + Integer.parseInt(request.getParameter("Bedrooms")));
            if (!"5".equals(request.getParameter("Bedrooms"))) {
                para.append("&bedrooms__lte=" + Integer.parseInt(request.getParameter("Bedrooms")));
            }
        }

        if (null != request.getParameter("Bathrooms") && StringUtils.isNotEmpty(request.getParameter("Bathrooms"))) {
            // Set bathroom
            para.append("&bathrooms__gte=" + Integer.parseInt(request.getParameter("Bathrooms")));
            if (!"5".equals(request.getParameter("Bathrooms"))) {
                para.append("&bathrooms__lte=" + Integer.parseInt(request.getParameter("Bathrooms")));
            }
        }

        if (null != request.getParameter("Parking") && StringUtils.isNotEmpty(request.getParameter("Parking"))) {
            // Set bed number
            RentRequestParaForAllhomes.FiltersBean.ParkingBean bedsBean = new RentRequestParaForAllhomes.FiltersBean.ParkingBean();
            para.append("&parking__gte=" + Integer.parseInt(request.getParameter("Parking")));
            if (!"5".equals(request.getParameter("Parking"))) {
                para.append("&parking__lte=" + Integer.parseInt(request.getParameter("Parking")));
            }
        }

        // Set keyword
        String keywords = request.getParameter("keywords");
        if (keywords.length()!=0){
            para.append("&keywords=" + keywords);
        }
        return para.toString();
    }

    // Parse request parameters
    public String parseParaForRealestate(HttpServletRequest request) {
        // para
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));

        String[] propertyTypes = request.getParameterValues("propertyTypes");

        String keywords = request.getParameter("keywords");

        String region = request.getParameter("name");

        // query: "{\"channel\":\"rent\",\"page\":1,\"pageSize\":25,\"filters\":{\"surroundingSuburbs\":false,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"furnished\":false,\"keywords\":{\"terms\":[\"test\"]},\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[{\"searchLocation\":\"canberra - greater region, act\"}]}"
        if(StringUtils.isNotEmpty(region)) {
            // Assemble region parameters
            // String regiontmp = region.split("-")[0];
            // para.append("&address_suburb="+regiontmp.split(",")[0]+","+regiontmp.split(",")[2]+","+regiontmp.split(",")[1]);
        }

        // query: "{\"channel\":\"rent\",\"page\":1,\"pageSize\":25,\"filters\":{\"bedroomsRange\":{\"minimum\":\"1\",\"maximum\":\"1\"},\"minimumBathroom\":\"1\",\"minimumCars\":\"1\",\"surroundingSuburbs\":true,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"ex-deposit-taken\":false,\"furnished\":false,\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[]}"
        String query="";
        String querytmp="";

        if (null != request.getParameter("Bedrooms") && StringUtils.isNotEmpty(request.getParameter("Bedrooms"))) {
            // Set bed number
            querytmp+="\\\"bedroomsRange\\\":{\\\"minimum\\\":\\\""+Integer.parseInt(request.getParameter("Bedrooms"))+"\\\",\\\"maximum\\\":\\\""+Integer.parseInt(request.getParameter("Bedrooms"))+"\\\"},";
        }

        if (null != request.getParameter("Bathrooms") && StringUtils.isNotEmpty(request.getParameter("Bathrooms"))) {
            // Set bathroom
            querytmp+="\\\"maximumBathroom\\\":\\\""+Integer.parseInt(request.getParameter("Bathrooms"))+"\\\",";
        }

        if (null != request.getParameter("Parking") && StringUtils.isNotEmpty(request.getParameter("Parking"))) {
            // Set parking slot
            querytmp+="\\\"maxnimumCars\\\":\\\""+Integer.parseInt(request.getParameter("Parking"))+"\\\",";
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
        }
        return query;
    }
}
