
// 分页用
function initPage(element,currentPage,numberOfPages,totalPages,tabid){

    //获得数据装配的位置
   // var element = $('#pagebar');

    //初始化所需数据
    var options = {
        bootstrapMajorVersion:3,//版本号。3代表的是第三版本
        currentPage: currentPage, //当前页数
       // numberOfPages: numberOfPages, //显示页码数标个数
        totalPages:totalPages, //总共的数据所需要的总页数
        itemTexts: function (type, page, current) {
            //图标的更改显示可以在这里修改。
            switch (type) {
                case "first":
                    return "Home";
                case "prev":
                    return "Previous Page";
                case "next":
                    return "Next Page";
                case "last":
                    return "Last Page";
                case "page":
                    return  page;
            }
        },
        tooltipTitles: function (type, page, current) {
            //如果想要去掉页码数字上面的预览功能，则在此操作。例如：可以直接return。
            switch (type) {
                case "first":
                    return "Jump to Start";
                case "prev":
                    return "Jump to Previous";
                case "next":
                    return "Jump to Next";
                case "last":
                    return "Jump to Last";
                case "page":
                    return (page === current) ? "Current " + page : "to " + page;
            }
        },
        onPageClicked: function (e, originalEvent, type, page) {
            document.body.scrollTop = document.documentElement.scrollTop = 0;
            //   document.location = changeURLArg(document.location.href,"pageNo",page);
            // 页数
            //currentPage=page;
             if (tabid==1) {
                 searchHref($("#basic_searchbox").getParamList(),page,$('#searchInput').val(),$('#searchInput').selectPageText(),
                     $('#hidType').val());
             } else if (tabid==2) {
                 initDomainData($("#basic_searchbox").getParamList(),page,$('#searchInput').val(),$('#searchInput').selectPageText(),
                     $('#hidType').val());
             } else if (tabid==3) {
                 initZangoData($("#basic_searchbox").getParamList(),page,$('#searchInput').val(),$('#searchInput').selectPageText(),
                     $('#hidType').val());
             }

        }
    };

    $(element).bootstrapPaginator(options);	//进行初始化
}


//基本例子
function  initBasic() {

    // var obj= {"address":[],"street":[{"priority":1,"value":314410,"name":"Canberra Avenue, Capital Hill, ACT, 2600","type":"STREET"},{"priority":1,"value":314473,"name":"Canberra Avenue, Forrest, ACT, 2603","type":"STREET"},{"priority":1,"value":314557,"name":"Canberra Avenue, Fyshwick, ACT, 2609","type":"STREET"},{"priority":1,"value":2059,"name":"Canberra Avenue, Griffith, ACT, 2603","type":"STREET"},{"priority":1,"value":769385,"name":"Canberra Avenue, Jerrabomberra, ACT","type":"STREET"},{"priority":1,"value":4790,"name":"Canberra Avenue, Symonston, ACT, 2609","type":"STREET"},{"priority":2,"value":233013,"name":"Canberra Avenue, Berwick, VIC, 3806","type":"STREET"},{"priority":2,"value":83758,"name":"Canberra Avenue, Casula, NSW, 2170","type":"STREET"},{"priority":2,"value":148244,"name":"Canberra Avenue, Cooloola Cove, QLD, 4580","type":"STREET"},{"priority":2,"value":320159,"name":"Canberra Avenue, Crestwood, NSW, 2620","type":"STREET"},{"priority":2,"value":265930,"name":"Canberra Avenue, Dandenong, VIC, 3175","type":"STREET"},{"priority":2,"value":644962,"name":"Canberra Avenue, Greenwich, NSW, 2065","type":"STREET"},{"priority":2,"value":513453,"name":"Canberra Avenue, Hoppers Crossing, VIC, 3029","type":"STREET"},{"priority":2,"value":526338,"name":"Canberra Avenue, Mildura, VIC, 3500","type":"STREET"},{"priority":2,"value":364409,"name":"Canberra Avenue, Queanbeyan, NSW, 2620","type":"STREET"},{"priority":2,"value":364548,"name":"Canberra Avenue, Queanbeyan West, NSW, 2620","type":"STREET"},{"priority":2,"value":365843,"name":"Canberra Avenue, Richmond, NSW, 2753","type":"STREET"},{"priority":2,"value":369644,"name":"Canberra Avenue, South Durras, NSW, 2536","type":"STREET"},{"priority":2,"value":59305,"name":"Canberra Avenue, St Leonards, NSW, 2065","type":"STREET"},{"priority":2,"value":377590,"name":"Canberra Avenue, Turramurra, NSW, 2074","type":"STREET"}],"division":[{"priority":1,"value":18010,"name":"Canberra, ACT, 2601","type":"DIVISION"},{"priority":1,"value":26187,"name":"Canberra Airport, ACT, 2609","type":"DIVISION"}],"district":[],"region":[{"priority":1,"value":391,"name":"Canberra, ACT","type":"REGION"},{"priority":1,"value":391,"name":"Canberra - Greater Region, ACT","type":"REGION"}],"state":[],"postcode":[]}
    //  var street =[];
    // for(var i=1;i<obj.street.length;i++) {
    //     street.push({"value": obj.street[i].value, "text": obj.street[i].name})
    // }
    var options = {
        //查询事件
        "search": function (paramList) {
            //  $("#basic_searchbox_param").html('查询参数:'+JSON.stringify(paramList));
        },

        //默认展开条件数
        "expandRow": 2,
        //Conditions
        "searchBoxs": [
            {
                "id": "propertyTypes",
                "title": "allhomes(Types)",
                "isShowAll": false,//Display all
                "data": [
                    {"value": "__ALL__", "text": "ALL"},
                    {"value": "HOUSE", "text": "House"},
                    {"value": "TOWNHOUSE", "text": "TOWNHOUSE"},
                    {"value": "UNIT", "text": "Unit/Apartment"},
                    {"value": "Rural", "text": "Rural"},
                    {"Duplex": "Studio", "text": "Duplex"},
                    {"value": "Studio", "text": "Studio"},
                    {"value": "Other", "text": "Other"}
                ]
            }
        ]
    };
    $("#basic_searchbox").fiterMore(options);
}




// www.domain.com.au
function initDomainData(paramList,currentPage,id,name,type){
    var ps= {};
    for(var i=0;i<paramList.length;i++){
        for(var j = 0;j<paramList[i].ValueList.length;j++){
            // ps.push(paramList[i].id+":"+paramList[i].ValueList[j]);
            ps[paramList[i].id] = paramList[i].ValueList[j];
        }
    }
   // ps["keywords"]= encodeURIComponent($("#searchInput").val().trim());
    ps["keywords"]= encodeURIComponent($("#keywords").val().trim());
    ps["currentPage"]= currentPage;
    //ps["region"]= "canberra-act";
    ps["id"]= id;
    ps["name"]= name;
    ps["type"]= type;
    var objHtml=[];

    $.ajax({
        type: 'POST',
        // contentType : "application/json",
        data: ps,

        url: '/getDomainList',
        beforeSend:function(XMLHttpRequest){

            var o = document.getElementById("tab2");
            var w = o.clientWidth||o.offsetWidth;
            var h = o.clientHeight||o.offsetHeight;
            $("#loading-mask-tab2").css({ display: "block", width: w, height: h})
            $("#loading-tab2").css({ display: "block"})

            $("#page4041").css({ display: "none"})

        },
        success: function (result) {

            // Return Success
            if (result.code == 0) {
                var obj = $.parseJSON(result.data);
                // 总的页码数
                var  numPages =obj.props.totalPages;
                // 总记录数
                var totalListings =obj.props.totalListings;
                if (totalListings==0) {
                    $("#page4041").css({ display: "block"})
                }
                // 分页组件初始化
                if (currentPage ==1) {
                   // initPage(obj.props.currentPage,5,numPages);
                    initPage("#pagebartab2",obj.props.currentPage,5,numPages,2);
                }
                //     layer.msg(result.msg);
                //     reLoad();
                // } else {
                //     layer.msg(result.msg);
                $("#objTab2Div").empty();

                for(var i in obj.props.listingsMap){


                    //  for(var i=0;i<obj.props.listingsMap.length;i++) {

                    var listing= obj.props.listingsMap[i].listingModel;
                    var address= obj.props.listingsMap[i].listingModel.address;
                    var property= obj.props.listingsMap[i].listingModel.features;
                    // var agency= obj.props.listingsMap[i].branding;

                    objHtml.push('<div class="col-lg-4 col-md-6">');
                    objHtml.push('<div class="property-grid-box mb-xl-20">');
                    objHtml.push('<div class="property-grid-wrapper">');
                    objHtml.push('<div class="property-img animate-img">');
                    objHtml.push('<a href="'+obj.props.baseUrl+listing.url+'"  target="_blank" style="height: 190px;background-color: #f2f5f7;color: #7e8594">');
                    if (listing.images.length >0) {
                        // objHtml.push('<img src="assets/images/homepage-1/recent-350x235.jpg" class="img-fluid full-width" alt="#">');
                        objHtml.push('<img src="'+listing.images[0]+'" class="img-fluid full-width" alt="#" style="height: 190px" alt="#"/></a>');
                    }  else {
                        objHtml.push('<div class="null-img-text" style="text-align: center;width: 100%;padding-top: 58px;">Image not available</div>');
                    }

                    objHtml.push('</a>');
                    objHtml.push('<div class="property-type">');
                  //  objHtml.push('<a href="#" class="property-tag-1 bg-theme text-custom-white">Sale</a>');
                  //  objHtml.push('<a href="#" class="property-tag-2 bg-custom-blue text-custom-white">Featured</a>');
                    objHtml.push('</div>');
                    objHtml.push('<div class="property-address bg-custom-blue">');
                    objHtml.push('<a href="#"><i class="flaticon-pin"></i>'+ address.street + ' ' + address.suburb + '  '+ address.state + ' '+ address.postcode+'</a>');
                    objHtml.push('</div>');
                    /*   objHtml.push('<div class="property-save-btn transform-center">');
                       objHtml.push('<ul class="custom">');
                       objHtml.push('<li class="custom-tooltip" data-tip="Photos">');
                       objHtml.push('<a href="#"><i class="fas fa-camera"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('<li class="custom-tooltip" data-tip="Bookmark">');
                       objHtml.push('<a href="#"><i class="fas fa-star"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('<li class="custom-tooltip" data-tip="Compare">');
                       objHtml.push('<a href="#"><i class="fas fa-arrows-alt-h"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('</ul>');
                       objHtml.push('</div>');*/
                    objHtml.push('</div>');
                    objHtml.push('<div class="property-grid-caption padding-20">');
                    objHtml.push('<h5><a href="#" class="text-theme">'+property.propertyTypeFormatted+'</a></h5>');
                    objHtml.push('<div class="price mb-xl-20 fs-16 fw-700 text-custom-blue">'+listing.price+'</div>');
                    objHtml.push('<ul class="custom property-feature">');
                    objHtml.push('<li> <i class="flaticon-bed-1"></i>');
                    objHtml.push('<span>'+property.beds+'</span>');
                    objHtml.push('</li>');
                    objHtml.push('<li> <i class="flaticon-bath-1"></i>');
                    objHtml.push('<span>'+property.baths+'</span>');
                    objHtml.push('</li>');
                  /*  objHtml.push('<li> <i class="flaticon-selection-1"></i>');
                    objHtml.push('<span>530 sq ft</span>');
                    objHtml.push('</li>');*/
                    objHtml.push('<li> <i class="flaticon-car-inside-a-garage"></i>');
                    objHtml.push('<span>'+property.parking+'</span>');
                    objHtml.push('</li>');
                    objHtml.push('</ul>');
                    objHtml.push('</div>');
                   // objHtml.push('<div class="property-grid-footer">');
                  //  objHtml.push('<a href="#" class="text-theme fs-14 fw-600">Read More <span class="flaticon-right-arrow ml-1"></span></a>');
                    // objHtml.push('<div class="ratings">');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-light-white"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-light-white"><i class="fas fa-star"></i></span>');
                    // objHtml.push('</div>');
                   // objHtml.push('</div>');
                    objHtml.push('</div>');
                    objHtml.push('</div>');
                    objHtml.push('</div>');


                }


                $("#objTab2Div").html(objHtml.join(''));

            }
        },
        complete:function(XMLHttpRequest,textStatus){
            $("#loading-mask-tab2").remove();
            $("#loading-tab2").remove();
        },
        error:function(XMLHttpRequest,textStatus,errorThrown){
           // alert('error...状态文本值：'+textStatus+" 异常信息："+errorThrown);
            $("#loading-mask-tab2").remove();
            $("#loading-tab2").remove();
            $("#objTab2Div").empty();
            $("#page4041").css({ display: "block"})
        }
    });
}


function initZangoData(paramList,currentPage,id,name,type){
    var ps= {};
    for(var i=0;i<paramList.length;i++){
        for(var j = 0;j<paramList[i].ValueList.length;j++){
            // ps.push(paramList[i].id+":"+paramList[i].ValueList[j]);
            ps[paramList[i].id] = paramList[i].ValueList[j];
        }
    }
    // ps["keywords"]= encodeURIComponent($("#searchInput").val().trim());
    ps["keywords"]= encodeURIComponent($("#keywords").val().trim());
    ps["currentPage"]= currentPage;
    //ps["region"]= "canberra-act";
    ps["id"]= id;
    ps["name"]= name;
    ps["type"]= type;
    var objHtml=[];

    $.ajax({
        type: 'POST',
        // contentType : "application/json",
        data: ps,

        url: '/getZangoList',
        beforeSend:function(XMLHttpRequest){

            var o = document.getElementById("tab3");
            var w = o.clientWidth||o.offsetWidth;
            var h = o.clientHeight||o.offsetHeight;
            $("#loading-mask-tab2").css({ display: "block", width: w, height: h})
            $("#loading-tab2").css({ display: "block"})

            $("#page40413").css({ display: "none"})

        },
        success: function (result) {

            var obj = $.parseJSON(result.data);

            // 返回成功的处理
            if (result.code == 0) {

                // 总的页码数
                var  numPages =obj.results.meta.total_pages;
                // 总记录数
                var totalListings =obj.results.meta.total_results;
                if (totalListings==0) {
                    $("#page40413").css({ display: "block"})
                }
                // 分页组件初始化
                if (currentPage ==1) {
                    // initPage(obj.props.currentPage,5,numPages);
                    initPage("#pagebartab3",obj.results.meta.page,5,numPages,3);
                }
                //     layer.msg(result.msg);
                //     reLoad();
                // } else {
                //     layer.msg(result.msg);
                $("#objTab3Div").empty();

                for(var i in obj.results.listings){


                    //  for(var i=0;i<obj.props.listingsMap.length;i++) {

                    var listing= obj.results.listings[i];

                    objHtml.push('<div class="col-lg-4 col-md-6">');
                    objHtml.push('<div class="property-grid-box mb-xl-20">');
                    objHtml.push('<div class="property-grid-wrapper">');
                    objHtml.push('<div class="property-img animate-img">');
                    objHtml.push('<a href="https://zango.com.au/'+listing.url_path+'" target="_blank" style="height: 190px;background-color: #f2f5f7;color: #7e8594">');
                    if (listing.images.length >0) {
                        // objHtml.push('<img src="assets/images/homepage-1/recent-350x235.jpg" class="img-fluid full-width" alt="#">');
                        objHtml.push('<img src="'+listing.images[0].image.image_320_240+'" class="img-fluid full-width" alt="#" style="height: 190px" alt="#"/></a>');
                    }  else {
                        objHtml.push('<div class="null-img-text" style="text-align: center;width: 100%;padding-top: 58px;">Image not available</div>');
                    }

                    objHtml.push('</a>');
                    objHtml.push('<div class="property-type">');
                    //  objHtml.push('<a href="#" class="property-tag-1 bg-theme text-custom-white">Sale</a>');
                    //  objHtml.push('<a href="#" class="property-tag-2 bg-custom-blue text-custom-white">Featured</a>');
                    objHtml.push('</div>');
                    objHtml.push('<div class="property-address bg-custom-blue">');
                    objHtml.push('<a href="#"><i class="flaticon-pin"></i>'+listing.address_display_string+'</a>');
                    //objHtml.push('<a href="#"><i class="flaticon-pin"></i>'+ address.street + ' ' + address.suburb + '  '+ address.state + ' '+ address.address_postcode+'</a>');
                    objHtml.push('</div>');
                    /*   objHtml.push('<div class="property-save-btn transform-center">');
                       objHtml.push('<ul class="custom">');
                       objHtml.push('<li class="custom-tooltip" data-tip="Photos">');
                       objHtml.push('<a href="#"><i class="fas fa-camera"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('<li class="custom-tooltip" data-tip="Bookmark">');
                       objHtml.push('<a href="#"><i class="fas fa-star"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('<li class="custom-tooltip" data-tip="Compare">');
                       objHtml.push('<a href="#"><i class="fas fa-arrows-alt-h"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('</ul>');
                       objHtml.push('</div>');*/
                    objHtml.push('</div>');
                    objHtml.push('<div class="property-grid-caption padding-20">');
                    objHtml.push('<h5><a href="#" class="text-theme">'+listing.category+'</a></h5>');
                    objHtml.push('<div class="price mb-xl-20 fs-16 fw-700 text-custom-blue">'+listing.priceView+'</div>');
                    objHtml.push('<ul class="custom property-feature">');
                    objHtml.push('<li> <i class="flaticon-bed-1"></i>');
                    objHtml.push('<span>'+listing.bedrooms+'</span>');
                    objHtml.push('</li>');
                    objHtml.push('<li> <i class="flaticon-bath-1"></i>');
                    objHtml.push('<span>'+listing.bathrooms+'</span>');
                    objHtml.push('</li>');
                    /*  objHtml.push('<li> <i class="flaticon-selection-1"></i>');
                      objHtml.push('<span>530 sq ft</span>');
                      objHtml.push('</li>');*/
                    objHtml.push('<li> <i class="flaticon-car-inside-a-garage"></i>');
                    objHtml.push('<span>'+listing.parking+'</span>');
                    objHtml.push('</li>');
                    objHtml.push('</ul>');
                    objHtml.push('</div>');
                    // objHtml.push('<div class="property-grid-footer">');
                    //  objHtml.push('<a href="#" class="text-theme fs-14 fw-600">Read More <span class="flaticon-right-arrow ml-1"></span></a>');
                    // objHtml.push('<div class="ratings">');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-light-white"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-light-white"><i class="fas fa-star"></i></span>');
                    // objHtml.push('</div>');
                    // objHtml.push('</div>');
                    objHtml.push('</div>');
                    objHtml.push('</div>');
                    objHtml.push('</div>');


                }


                $("#objTab3Div").html(objHtml.join(''));

            }
        },
        complete:function(XMLHttpRequest,textStatus){
            $("#loading-mask-tab3").remove();
            $("#loading-tab3").remove();
        },
        error:function(XMLHttpRequest,textStatus,errorThrown){
            // alert('error...状态文本值：'+textStatus+" 异常信息："+errorThrown);
            $("#loading-mask-tab3").remove();
            $("#loading-tab3").remove();
            $("#objTab3Div").empty();
            $("#page40413").css({ display: "block"})
        }
    });
}



function initRealestateData(paramList,currentPage,id,name,type){
    var ps= {};
    for(var i=0;i<paramList.length;i++){
        for(var j = 0;j<paramList[i].ValueList.length;j++){
            // ps.push(paramList[i].id+":"+paramList[i].ValueList[j]);
            ps[paramList[i].id] = paramList[i].ValueList[j];
        }
    }
    // ps["keywords"]= encodeURIComponent($("#searchInput").val().trim());
    ps["keywords"]= encodeURIComponent($("#keywords").val().trim());
    ps["currentPage"]= currentPage;
    //ps["region"]= "canberra-act";
    ps["id"]= id;
    ps["name"]= name;
    ps["type"]= type;
    var objHtml=[];

    $.ajax({
        type: 'POST',
        // contentType : "application/json",
        data: ps,

        url: '/getRealestateList',
        beforeSend:function(XMLHttpRequest){

            var o = document.getElementById("tab4");
            var w = o.clientWidth||o.offsetWidth;
            var h = o.clientHeight||o.offsetHeight;
            $("#loading-mask-tab4").css({ display: "block", width: w, height: h})
            $("#loading-tab4").css({ display: "block"})

            $("#page40414").css({ display: "none"})

        },
        success: function (result) {

            var obj = $.parseJSON(result.data);

            // 返回成功的处理
            if (result.code == 0) {

                // 总的页码数
                var  numPages =obj.data.rentSearch.results.pagination.maxPageNumberAvailable;
                // 总记录数
                var totalListings =obj.data.rentSearch.results.totalResultsCount;
                if (totalListings==0) {
                    $("#page40414").css({ display: "block"})
                }
                // 分页组件初始化
                if (currentPage ==1) {
                    // initPage(obj.props.currentPage,5,numPages);
                    initPage("#pagebartab4",obj.data.rentSearch.results.pagination.page,5,numPages,4);
                }
                //     layer.msg(result.msg);
                //     reLoad();
                // } else {
                //     layer.msg(result.msg);
                $("#objTab4Div").empty();

                for(var i in obj.data.rentSearch.results.exact.items){


                    //  for(var i=0;i<obj.props.listingsMap.length;i++) {

                    var listing= obj.data.rentSearch.results.exact.items[i].listing;

                    objHtml.push('<div class="col-lg-4 col-md-6">');
                    objHtml.push('<div class="property-grid-box mb-xl-20">');
                    objHtml.push('<div class="property-grid-wrapper">');
                    objHtml.push('<div class="property-img animate-img">');
                    objHtml.push('<a href="'+listing._links.canonical.href+'" target="_blank" style="height: 190px;background-color: #f2f5f7;color: #7e8594">');
                    if (listing.media.images.length >0) {
                        // objHtml.push('<img src="assets/images/homepage-1/recent-350x235.jpg" class="img-fluid full-width" alt="#">');
                        objHtml.push('<img src="'+listing.media.mainImage.templatedUrl.replace("{size}","800x600")+'" class="img-fluid full-width" alt="#" style="height: 190px" alt="#"/></a>');
                    }  else {
                        objHtml.push('<div class="null-img-text" style="text-align: center;width: 100%;padding-top: 58px;">Image not available</div>');
                    }

                    objHtml.push('</a>');
                    objHtml.push('<div class="property-type">');
                    //  objHtml.push('<a href="#" class="property-tag-1 bg-theme text-custom-white">Sale</a>');
                    //  objHtml.push('<a href="#" class="property-tag-2 bg-custom-blue text-custom-white">Featured</a>');
                    objHtml.push('</div>');
                    objHtml.push('<div class="property-address bg-custom-blue">');
                    objHtml.push('<a href="#"><i class="flaticon-pin"></i>'+listing.address.display.fullAddress+'</a>');
                    //objHtml.push('<a href="#"><i class="flaticon-pin"></i>'+ address.street + ' ' + address.suburb + '  '+ address.state + ' '+ address.address_postcode+'</a>');
                    objHtml.push('</div>');
                    /*   objHtml.push('<div class="property-save-btn transform-center">');
                       objHtml.push('<ul class="custom">');
                       objHtml.push('<li class="custom-tooltip" data-tip="Photos">');
                       objHtml.push('<a href="#"><i class="fas fa-camera"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('<li class="custom-tooltip" data-tip="Bookmark">');
                       objHtml.push('<a href="#"><i class="fas fa-star"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('<li class="custom-tooltip" data-tip="Compare">');
                       objHtml.push('<a href="#"><i class="fas fa-arrows-alt-h"></i></a>');
                       objHtml.push('</li>');
                       objHtml.push('</ul>');
                       objHtml.push('</div>');*/
                    objHtml.push('</div>');
                    objHtml.push('<div class="property-grid-caption padding-20">');
                    objHtml.push('<h5><a href="#" class="text-theme">'+listing.propertyType.display+'</a></h5>');
                    objHtml.push('<div class="price mb-xl-20 fs-16 fw-700 text-custom-blue">'+listing.price.display+'</div>');
                    objHtml.push('<ul class="custom property-feature">');
                    objHtml.push('<li> <i class="flaticon-bed-1"></i>');
                    objHtml.push('<span>'+listing.generalFeatures.bedrooms.value+'</span>');
                    objHtml.push('</li>');
                    objHtml.push('<li> <i class="flaticon-bath-1"></i>');
                    objHtml.push('<span>'+listing.generalFeatures.bathrooms.value+'</span>');
                    objHtml.push('</li>');
                    /*  objHtml.push('<li> <i class="flaticon-selection-1"></i>');
                      objHtml.push('<span>530 sq ft</span>');
                      objHtml.push('</li>');*/
                    objHtml.push('<li> <i class="flaticon-car-inside-a-garage"></i>');
                    objHtml.push('<span>'+listing.generalFeatures.parkingSpaces.value+'</span>');
                    objHtml.push('</li>');
                    objHtml.push('</ul>');
                    objHtml.push('</div>');
                    // objHtml.push('<div class="property-grid-footer">');
                    //  objHtml.push('<a href="#" class="text-theme fs-14 fw-600">Read More <span class="flaticon-right-arrow ml-1"></span></a>');
                    // objHtml.push('<div class="ratings">');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-custom-yellow"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-light-white"><i class="fas fa-star"></i></span>');
                    // objHtml.push('<span class="fs-16 text-light-white"><i class="fas fa-star"></i></span>');
                    // objHtml.push('</div>');
                    // objHtml.push('</div>');
                    objHtml.push('</div>');
                    objHtml.push('</div>');
                    objHtml.push('</div>');


                }


                $("#objTab4Div").html(objHtml.join(''));

            }
        },
        complete:function(XMLHttpRequest,textStatus){
            $("#loading-mask-tab4").remove();
            $("#loading-tab4").remove();
        },
        error:function(XMLHttpRequest,textStatus,errorThrown){
            // alert('error...状态文本值：'+textStatus+" 异常信息："+errorThrown);
            $("#loading-mask-tab4").remove();
            $("#loading-tab4").remove();
            $("#objTab4Div").empty();
            $("#page40414").css({ display: "block"})
        }
    });
}
