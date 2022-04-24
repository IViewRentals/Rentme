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

/**
 * The class is used to get rent post data from 4 websites.
 */
public class RentContextGet {

    public static String getRentFromAllHomes(RentRequestParaForAllhomes rent) {
        // 1. Generate httpclient, which equals open a browser
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        // 2. Create a get request, which equals enter URL in a browser

        HttpPost request = new HttpPost("https://www.allhomes.com.au/wsvc/search/rent-residential");
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Accept-Encoding", "gzip, deflate, br");
        request.setHeader("Accept", "*/*");
        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");

        try {
            // AllHomes
            String paraJson=JSON.toJSONString(rent);
            System.out.println("rentrequestforallhomes:"+paraJson);
            StringEntity entity = new StringEntity(paraJson, "UTF-8");
            request.setEntity(entity);

            // 3. Execute the request, which equals press Enter on the keyboard
            response = httpClient.execute(request);

            // 4. Process if the response status is 200
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                // 5. Get the response content
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");

                return html;
            } else {
                // Process if the response status is not 200 (e.g. 404)
                return null;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6. Close
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }


    public static JsonsRootBean searchallbyname(String name) {
        // 1. Generate httpclient, which equals open a browser
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        // 2. Create a get request, which equals enter URL in a browser

        HttpGet request = new HttpGet("https://www.allhomes.com.au/wsvc/locality/searchallbyname?st=ACT&n="+name);
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Accept-Encoding", "gzip, deflate, br");
        request.setHeader("Accept", "*/*");
        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");

        try {
            // 3. Execute the request, which equals press Enter on the keyboard
            response = httpClient.execute(request);

            // 4. Process if the response status is 200
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                // 5. Get the response content
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
            // 6. Close
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }


    public static String getRentFromDomain(String queryPara) {
        // 1. Generate httpclient, which equals open a browser
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        // 2. Create a get request, which equals enter URL in a browser
        String url="https://www.domain.com.au/rent/";
        url=url+queryPara;

        // e.g., https://www.domain.com.au/rent/st-leonards-vic-3223/house/?bedrooms=2-any&bathrooms=1-any&price=0-2000&availableto=2021-03-23&excludedeposittaken=1&carspaces=3-any&landsize=100-any&keywords=vic
        // availableto=2021-03-23
        // excludedeposittaken=1
        // https://www.domain.com.au/rent/geelong-vic-3220/?ptype=apartment-unit-flat,block-of-units,duplex,free-standing,new-apartments,new-home-designs,new-house-land,pent-house,semi-detached,studio,terrace,town-house,villa&excludedeposittaken=1
        HttpGet request = new HttpGet(url);
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36");
        request.setHeader("Content-Type", "application/json; charset=utf-8");
        request.setHeader("Accept-Encoding", "gzip, deflate, br");
        request.setHeader("Accept-Encoding", "gzip, deflate, br");
        request.setHeader("Accept", "application/json");
        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");

        try {
            // 3. Execute the request, which equals press Enter on the keyboard
            System.out.println("domain url is :"+url);
            response = httpClient.execute(request);

            // 4. Process if the response status is 200
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                // 5. Get the response content
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");

                return  html;
            } else {
                // Process if the response status is not 200 (e.g. 404)
                return null;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6. Close
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }

    public static String getRentFromRealestate(String realestateRequest) {
        // 1. Generate httpclient, which equals open a browser
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        // 2. Create a get request, which equals enter URL in a browser

        // https://lexa.realestate.com.au/graphql

        // extensions: {,…}
        // persistedQuery: {version: 1, sha256Hash: "f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570"}
        // sha256Hash: "f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570"
        // version: 1
        // operationName: "searchByQuery"
        // variables: {,…}
        // nullifyOptionals: false
        // query: "{\"channel\":\"rent\",\"page\":2,\"pageSize\":25,\"filters\":{\"surroundingSuburbs\":true,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"furnished\":false,\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[{\"searchLocation\":\"canberra - greater region, act\"}]}"
        // recentHides: []
        //testListings: false

        // {"operationName":"searchByQuery","variables":{"query":"{\"channel\":\"rent\",\"page\":2,\"pageSize\":25,\"filters\":{\"surroundingSuburbs\":true,\"excludeNoSalePrice\":false,\"ex-under-contract\":false,\"furnished\":false,\"petsAllowed\":false,\"hasScheduledAuction\":false},\"localities\":[{\"searchLocation\":\"canberra - greater region, act\"}]}","testListings":false,"nullifyOptionals":false,"recentHides":[]},"extensions":{"persistedQuery":{"version":1,"sha256Hash":"f8a7353b213f7dbce77ad95aa4cae9558511cd0617d3f10f5c26b534a480b570"}}}
        HttpPost post= new HttpPost("https://lexa.realestate.com.au/graphql");

        // Set post header
        post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36");
        post.setHeader("Content-Type", "application/json");
        post.setHeader("Accept-Encoding", "gzip, deflate, br");
        post.setHeader("Accept", "*/*");

        // Set poster entity
        StringEntity entity = new StringEntity(realestateRequest, Charset.forName("UTF-8"));
        entity.setContentEncoding("UTF-8");

        // Send Json format data request
        entity.setContentType("application/json");
        post.setEntity(entity);

        try {
            // 3. Execute the request, which equals press Enter on the keyboard
            response = httpClient.execute(post);

            // 4. Process if the response status is 200
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                // 5. Get the response content
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");
                System.out.println("Realestate get!!!");
                return html;
            } else {
                // Process if the response status is not 200 (e.g. 404)
                System.out.println("Return status is not 200");
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6. Close
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return "Pending";
    }

    public static String getRentFromzango(String queryPara,int currentPage, String categories) throws UnsupportedEncodingException {
        // 1. Generate httpclient, which equals open a browser
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        // 2. Create a get request, which equals enter order_by URL current, underOffer, includePrivate in the browser address bar

        // bedrooms__gte=1&bathrooms__gte=1&parking__gte=1

        String url="https://zango.com.au/api/pages/70/?property_class=rental&listing_type=lease"+
                "&surrounding=true&order_by=price&property_status_groups=current%2CunderOffer%2CincludePrivate&view_as=list"+categories+"&address_suburb=";
        url=url+java.net.URLEncoder.encode(queryPara,"utf-8")+"&page="+currentPage;

        // https://zango.com.au/api/pages/70/?property_class=rental&listing_type=lease&address_suburb=Acton%2C+2601%2C+ACT&surrounding=true&order_by=price&property_status_groups=current%2CunderOffer%2CincludePrivate&page=1

        System.out.println("get rent inf from ZangoURL:"+url);
        HttpGet request = new HttpGet(url);
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Accept", "*/*");
        request.setHeader("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");

        try {
            // 3. Execute the request, which equals press Enter on the keyboard
            response = httpClient.execute(request);

            // 4. Process if the response status is 200
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                // 5. Get the response content
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");

                return  html;
            } else {
                // Process if the response status is not 200 (e.g. 404)
                return null;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6. Close
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return null;
    }
}
