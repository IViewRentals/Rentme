package com.example.rentsummary.server;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.rentsummary.model.*;
//import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RentContextGet {

    public static void main(String[] args) {
//        getRentFromDomain();
//        getRentFromAllHomes();
//        getRentFromRealestate();  //有问题，查询参数待确认
//        getRentFromzango();
    }

    public static String getRentFromAllHomes(RentRequestParaForAllhomes rent) {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        //2.创建get请求，相当于在浏览器地址栏输入 网址

        HttpPost request = new HttpPost("https://www.allhomes.com.au/wsvc/search/rent-residential");
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Accept-Encoding", "gzip, deflate, br");
        request.setHeader("Accept", "*/*");
        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");

        try {

            //allhomes
//            String paraJson = "{\"page\":1,\"pageSize\":50,\"sort\":{\"criteria\":\"PRICE\",\"order\":\"ASC\"},\"filters\":{\"localities\":[{\"type\":\"REGION\",\"slug\":\"canberra-act\"},{\"type\":\"DISTRICT\",\"slug\":\"greater-queanbeyan-queanbeyan-region-nsw\"}],\"beds\":{\"min\":4,\"max\":4}},\"results\":{\"type\":\"LIST\"}}";
            String paraJson=JSON.toJSONString(rent);
            System.out.println("rentrequestforallhomes:"+paraJson);
            StringEntity entity = new StringEntity(paraJson, "UTF-8");
            request.setEntity(entity);

            //3.执行get请求，相当于在输入地址栏后敲回车键
            response = httpClient.execute(request);

            //4.判断响应状态为200，进行处理
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");
//                AllHomesEntity allHomesEntity = JSONObject.parseObject(html, AllHomesEntity.class);
//                System.out.println("Allhomes get!!!");
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("<table>");
//                //生成一个表格
//                for (AllHomesEntitySearchResultsBean item :allHomesEntity.getSearchResults()) {
//                    stringBuilder.append("<tr>");
//                    stringBuilder.append("<td><a href="+item.getListing().getUrl()+">" + item.getListing().getTitle()+"</a><td>");
//                    stringBuilder.append("<td><img src=" + item.getListing().getFirstImage()+"/><td>");
//                    stringBuilder.append("<td>" + item.getListing().getPriceLabel()+"<td>");
//                    stringBuilder.append("<td>" + item.getAddress().getState()+"<td>");
//                    stringBuilder.append("<td>" + item.getAddress().getPostcode()+"<td>");
//                    stringBuilder.append("</tr>");
//                }
//
//                stringBuilder.append("</table>");
//                //return allHomesEntity.getSearchResults().toString();
                return html;

            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
//                System.out.println("返回状态不是200");
//                System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
                return null;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }


    public static JsonsRootBean searchallbyname(String name) {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        //2.创建get请求，相当于在浏览器地址栏输入 网址

        HttpGet request = new HttpGet("https://www.allhomes.com.au/wsvc/locality/searchallbyname?st=ACT&n="+name);
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Accept-Encoding", "gzip, deflate, br");
        request.setHeader("Accept", "*/*");
        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");

        try {

            //3.执行get请求，相当于在输入地址栏后敲回车键
            response = httpClient.execute(request);

            //4.判断响应状态为200，进行处理
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");
                JsonsRootBean allHomesEntity = JSONObject.parseObject(html, JsonsRootBean.class);

                return allHomesEntity;
            } else {
                return null;
            }

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }


    public static String getRentFromDomain(String queryPara) {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        //2.创建get请求，相当于在浏览器地址栏输入 网址
        String url="https://www.domain.com.au/rent/";
        url=url+queryPara;

        //eg:https://www.domain.com.au/rent/
        // st-leonards-vic-3223/house/?bedrooms=2-any&bathrooms=1-any&price=0-2000&availableto=2021-03-23&excludedeposittaken=1&carspaces=3-any&landsize=100-any&keywords=vic

//      availableto=2021-03-23
//      excludedeposittaken=1

//        https://www.domain.com.au/rent/
//        geelong-vic-3220/?ptype=apartment-unit-flat,block-of-units,duplex,free-standing,new-apartments,new-home-designs,new-house-land,pent-house,semi-detached,studio,terrace,town-house,villa&excludedeposittaken=1

        HttpGet request = new HttpGet(url);
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36");
        request.setHeader("Content-Type", "application/json; charset=utf-8");
        request.setHeader("Accept-Encoding", "gzip, deflate, br");
//        request.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
//        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        request.setHeader("Accept-Encoding", "gzip, deflate, br");
        request.setHeader("Accept", "application/json");
        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
      //  request.setHeader("referer", "https://www.domain.com.au/rent/canberra-act/");

        try {
            //3.执行get请求，相当于在输入地址栏后敲回车键
            System.out.println("domain url is :"+url);
            response = httpClient.execute(request);

            //4.判断响应状态为200，进行处理
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");

                return  html;
            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
              /*  System.out.println("返回状态不是200");
                System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));*/
                return null;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }

    public static String getRentFromRealestate(String realestateRequest) {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        //2.创建get请求，相当于在浏览器地址栏输入 网址


        // https://lexa.realestate.com.au/graphql

//        extensions: {,…}
//        persistedQuery: {version: 1, sha256Hash: "f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570"}
//        sha256Hash: "f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570"
//        version: 1
//        operationName: "searchByQuery"
//        variables: {,…}
//        nullifyOptionals: false
//        query: "{\"channel\":\"rent\",\"page\":2,\"pageSize\":25,\"filters\":{\"surroundingSuburbs\":true,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"furnished\":false,\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[{\"searchLocation\":\"canberra - greater region, act\"}]}"
//        recentHides: []
//        testListings: false

      //{"operationName":"searchByQuery","variables":{"query":"{\"channel\":\"rent\",\"page\":2,\"pageSize\":25,\"filters\":{\"surroundingSuburbs\":true,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"furnished\":false,\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[{\"searchLocation\":\"canberra - greater region, act\"}]}","testListings":false,"nullifyOptionals":false,"recentHides":[]},"extensions":{"persistedQuery":{"version":1,"sha256Hash":"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570"}}}


        HttpPost post= new HttpPost("https://lexa.realestate.com.au/graphql");

        // 构造消息头
//        post.setHeader(":authority", "lexa.realestate.com.au");
//        post.setHeader(":method", "POST");
//        post.setHeader(":path", "/graphql");
//        post.setHeader(":scheme", "https");
       // post.setHeader("content-length", "600");
      //  post.setHeader("cookie", "reauid=975732b8d01f0000b91291608e0200005f050000; mid=10840510357694114096; OB-USER-TOKEN=a1a5922f-7e22-4f4b-b9bb-8888659a902f; s_vi=[CS]v1|3048895EDE068B11-40001470AD5F376F[CE]; s_ecid=MCMID|45325729729226658543005150810279199149; s_nr=1620121788954; Country=CN; AMCVS_341225BE55BBF7E17F000101@AdobeOrg=1; AMCV_341225BE55BBF7E17F000101@AdobeOrg=-330454231|MCIDTS|18758|MCMID|45325729729226658543005150810279199149|MCAAMLH-1621213056|11|MCAAMB-1621213056|RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y|MCOPTOUT-1620615456s|NONE|MCAID|3048895EDE068B11-40001470AD5F376F|vVersion|3.1.2; s_cc=true; _sp_ses.2fe7=*; _gid=GA1.3.778828004.1620608257; VT_LANG=language=zh-CN; _ga=GA1.3.756611187.1620120251; _ga_F962Q8PWJ0=GS1.1.1620608256.2.1.1620609139.0; pageview_counter.srs=3; External=/APPNEXUS=8763141472639825573/PUBMATIC=026656C6-334A-437A-B36B-3F1EEB9A071F/TRIPLELIFT=13722139133845422146/_EXP=1652145120/_exp=1652145144; _sp_id.2fe7=ca25ee3e-f862-47c3-9f72-5c1316f51530.1620120251.2.1620610588.1620121789.e73a0d4a-bbb3-4ece-8425-8dad9a2b7a6a; utag_main=v_id:017936b12166001adcbba0a7f37103072002306a00bd0$_sn:2$_ss:0$_st:1620612387789$vapi_domain:realestate.com.au$dc_visit:2$ses_id:1620608254469;exp-session$_pn:7;exp-session$dc_event:11;exp-session$dc_region:ap-southeast-2;exp-session; s_sq=rea-live=%26c.%26a.%26activitymap.%26page%3Drea%253Arent%253Asearch%2520result%2520-%2520list%26link%3DSearch%26region%3DBODY%26pageIDType%3D1%26.activitymap%26.a%26.c%26pid%3Drea%253Arent%253Asearch%2520result%2520-%2520list%26pidt%3D1%26oid%3Dfunctionsn%2528%2529%257B%257D%26oidt%3D2%26ot%3DSUBMIT");
        post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36");
        post.setHeader("Content-Type", "application/json");
        post.setHeader("Accept-Encoding", "gzip, deflate, br");
        post.setHeader("Accept", "*/*");
//        post.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
    //        post.setHeader("origin", "https://www.realestate.com.au");
//        post.setHeader("referer", "https://www.realestate.com.au/");
//
//        post.setHeader("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\", \"Google Chrome\";v=\"90\"");
//        post.setHeader("sec-ch-ua-mobile", "?0");
//        post.setHeader("sec-fetch-dest", "empty");
//        post.setHeader("sec-fetch-mode", "cors");
//        post.setHeader("sec-fetch-site", "same-site");
        // 构建消息实体
       // String paraJson=JSON.toJSONString(realestateRequest);
        //String test = "{\"operationName\":\"searchByQuery\",\"variables\":{\"query\":\"{\\\"channel\\\":\\\"rent\\\",\\\"page\\\":1,\\\"pageSize\\\":25,\\\"filters\\\":{\\\"surroundingSuburbs\\\":false,\\\"excludeNoSalePrice\\\":false,\\\"ex-under-contract\\\":false,\\\"furnished\\\":false,\\\"petsAllowed\\\":false,\\\"hasScheduledAuction\\\":false},\\\"localities\\\":[{\\\"searchLocation\\\":\\\"acton, act 2601\\\"}]}\",\"testListings\":false,\"nullifyOptionals\":false,\"recentHides\":[]},\"extensions\":{\"persistedQuery\":{\"version\":1,\"sha256Hash\":\"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570\"}}}";
        StringEntity entity = new StringEntity(realestateRequest, Charset.forName("UTF-8"));
        entity.setContentEncoding("UTF-8");
        // 发送Json格式的数据请求
       entity.setContentType("application/json");
        post.setEntity(entity);

        try {
            //3.执行get请求，相当于在输入地址栏后敲回车键
            response = httpClient.execute(post);

            //4.判断响应状态为200，进行处理
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");
                System.out.println("Realestate get!!!");
                System.out.println(realestateRequest);
                return html;
            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
                System.out.println("返回状态不是200");
//                System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
//        return "返回状态不是200,是429状态码：too many request,反爬虫检测";
        return "Pending";
    }

    public static String getRentFromzango(String queryPara,int currentPage, String categories) throws UnsupportedEncodingException {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        //2.创建get请求，相当于在浏览器地址栏输入 order_by 网址current,underOffer,includePrivate
        String url="https://zango.com.au/api/pages/70/?property_class=rental&listing_type=lease"+
                "&surrounding=true&order_by=price&property_status_groups=current%2CunderOffer%2CincludePrivate&view_as=list"+categories+"&address_suburb=";
        url=url+java.net.URLEncoder.encode(queryPara,"utf-8")+"&page="+currentPage;

        // https://zango.com.au/api/pages/70/?property_class=rental&listing_type=lease&address_suburb=Acton%2C+2601%2C+ACT&surrounding=true&order_by=price&property_status_groups=current%2CunderOffer%2CincludePrivate&page=1


        System.out.println("get rent inf from ZangoURL:"+url);
//        HttpGet request = new HttpGet("https://zango.com.au/api/pages/70/?property_class=rental&listing_type=lease&surrounding=true&bedrooms__gte=2&price__gte=350&price__lte=1700&order_by=price&property_status_groups=current%2CunderOffer%2CincludePrivate&region_group=ACT+%26+Surrounds&bedrooms__lte=4&filters=1&page=1&view_as=list");
        HttpGet request = new HttpGet(url);
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Accept", "*/*");
        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");

        try {

            //3.执行get请求，相当于在输入地址栏后敲回车键
            response = httpClient.execute(request);

            //4.判断响应状态为200，进行处理
           /* if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");
                System.out.println("Zango get!!!");

                String results=JSONObject.parseObject(html).getString("results");
                String listings=JSONObject.parseObject(results).getString("listings");
                List<ZangoEntity> zanGoList=JSONArray.parseArray(listings,ZangoEntity.class);

                //金额排序
                //金额升序排序
                String regEx="[^0-9]";
                Pattern p = Pattern.compile(regEx);
                Collections.sort(zanGoList, new Comparator<ZangoEntity>() {
                    @Override
                    public int compare(ZangoEntity domain1, ZangoEntity domain2) {
                        int price1=domain1.getPrice();
                        int price2=domain2.getPrice();
                        return price1-price2;
                    }
                });

                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<table>");
                //生成一个表格
                for(ZangoEntity zango :zanGoList){
                    stringBuilder.append("<tr>");
                    stringBuilder.append("<td><a href="+urltmp+zango.getUrl_path()+">" + zango.getAddress_display_string()+"</a><td>");
                    stringBuilder.append("<td><img src=" + zango.getImages().get(0).getImage().getImage_480_270()+"/><td>");
                    stringBuilder.append("<td>" + zango.getPriceView()+"<td>");
                    stringBuilder.append("<td>" + zango.getAddress_street_string()+"<td>");
                    stringBuilder.append("<td>" + zango.getAddress_postcode()+"<td>");
                    stringBuilder.append("</tr>");
                }

                return stringBuilder.toString();
            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
                System.out.println("返回状态不是200");
//                System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
            }*/

            //4.判断响应状态为200，进行处理
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");

                return  html;
            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
                return null;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }
}
