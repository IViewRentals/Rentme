/**
 * 实现的思路是利用JS创建一个Form表单，然后将参数用Input元素的方式添加到Form表单中，最后提交Form表单从而实现跳转。
	Form创建工具类
 */ 
(function(){
    //设置命名空间
    var CodeSTD = window.CodeSTD || {};

    window.CodeSTD = CodeSTD; 

    /**
     * 创建Form表单
     * @author moyq
     * @param config Object
     *  <p>url:form的Action，提交的后台地址</p>
     *  <p>method:使用POST还是GET提交表单</p>
     *  <p>params:参数 K-V</p>
     * @return Form
     */
    CodeSTD.form = function(config){
        config = config || {};

        var url = config.url,
            method = config.method || 'GET',
            target = config.target || '_blank',
            params = config.params || {};

        var form = document.createElement('form');
        form.action = url;
        form.method = method;
        form.target = target;

        for(var param in params){
            var value = params[param],
                input = document.createElement('input');

            input.type = 'hidden';
            input.name = param;
            input.value = value;

            form.appendChild(input);
        }

        return form;
    }
    
    String.prototype.endWith=function(str){
		 if(str==null||str==""||this.length==0||str.length>this.length)
		   return false;
		 if(this.substring(this.length-str.length)==str)
		   return true;
		 else
		   return false;
		 return true;
		 };

	String.prototype.startWith=function(str){
		 if(str==null||str==""||this.length==0||str.length>this.length)
		   return false;
		 if(this.substr(0,str.length)==str)
		   return true;
		 else
		   return false;
		 return true;
		};

})()


//获取URL参数
function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
var r = decodeURI(window.location.search).substr(1).match(reg);  //匹配目标参数
if (r != null) return unescape(r[2]); return null; //返回参数值
}

/* 
    * url 目标url 
    * arg 需要替换的参数名称 
    * arg_val 替换后的参数的值 
    * return url 参数替换后的url 
    */ 
    function changeURLArg(url,arg,arg_val){ 
        var pattern=arg+'=([^&]*)'; 
        var replaceText=arg+'='+arg_val; 
        if(url.match(pattern)){ 
            var tmp='/('+ arg+'=)([^&]*)/gi'; 
            tmp=url.replace(eval(tmp),replaceText); 
            return tmp; 
        }else{ 
            if(url.match('[\?]')){ 
                return url+'&'+replaceText; 
            }else{ 
                return url+'?'+replaceText; 
            } 
        } 
        return url+'\n'+arg+'\n'+arg_val; 
    } 
    
    //去除空格 
    String.prototype.Trim = function() 
    { 
      return this.replace(/\s+/g, ""); 
    } 
    //去除换行 
    function clearBr(key) 
    { 
        key = key.replace(/<\/?.+?>/g,""); 
        key = key.replace(/[\r\n]/g, ""); 
        return key; 
    } 

    //去除左侧空格 
    function LTrim(str) 
    { 
    return str.replace(/^\s*/g,""); 
    } 
    //去右空格 
    function RTrim(str) 
    { 
    return str.replace(/\s*$/g,""); 
    } 
    //去掉字符串两端的空格 
    function trim(str) 
    { 
    return str.replace(/(^\s*)|(\s*$)/g, ""); 
    } 
    //去除字符串中间空格 
    function CTim(str) 
    { 
    return str.replace(/\s/g,''); 
    } 
    //是否为由数字组成的字符串 
    function is_digitals(str) 
    { 
    var reg=/^[0-9]*$/;//匹配整数 

    return reg.test(str);   
    } 


    function get(objId){
    	var obj=document.getElementById(objId);
    	return obj;
    	
    }

    function getVal(objId){
    	var val=document.getElementById(objId).value;
    	return val;
    	
    }

    function replaceAll(str,from,to){
    	  
        var arr=new Array(str.length);
         for(var i=0;i<str.length;i++){
          arr[i]=str[i].replace(from,to);
        }
        
        str="";
        for(var i=0;i<arr.length;i++){
        str+=arr[i];
        }
        return str;
     }  


    	
    function daysBetween(DateOne,DateTwo)  
    {   
        var OneMonth = DateOne.substring(5,DateOne.lastIndexOf ('-'));  
        var OneDay = DateOne.substring(DateOne.length,DateOne.lastIndexOf ('-')+1);  
        var OneYear = DateOne.substring(0,DateOne.indexOf ('-'));  
      
        var TwoMonth = DateTwo.substring(5,DateTwo.lastIndexOf ('-'));  
        var TwoDay = DateTwo.substring(DateTwo.length,DateTwo.lastIndexOf ('-')+1);  
        var TwoYear = DateTwo.substring(0,DateTwo.indexOf ('-'));  
      
        var cha=((Date.parse(OneMonth+'/'+OneDay+'/'+OneYear)- Date.parse(TwoMonth+'/'+TwoDay+'/'+TwoYear))/86400000);   
        return Math.abs(cha);  
    } 	


    function findPosition( oElement ) 
    {
      //alert(oElement.offsetWidth)
      var x2 = 0;
      var y2 = 0;
      var width = oElement.offsetWidth;
      var height = oElement.offsetHeight;
     // alert(width + "=" + height);
      if( typeof( oElement.offsetParent ) != 'undefined' ) 
      {
        for( var posX = 0, posY = 0; oElement; oElement = oElement.offsetParent ) 
        {
          posX += oElement.offsetLeft;
          posY += oElement.offsetTop;      
        }
        x2 = posX + width;
        y2 = posY + height;
        return [ posX+(width/2), posY+25 ,x2, y2];
        
      } else{
          x2 = oElement.x + width;
          y2 = oElement.y + height;
          return [ oElement.x, oElement.y, x2, y2];
      }
    }



    /**************************************************************

    	Script		: js 常用方法
    	Authors		: 莫怡齐
    	
    **************************************************************/

    var REGS=new Object();
    REGS.email="^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";
    REGS.url="^[a-zA-z]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\S*)?$";
    REGS.datetime="^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$"; 
    REGS.date="^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$"; 
    REGS.time="^(20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$";
    REGS.timehm="^(20|21|22|23|[0-1]?\\d):[0-5]?\\d$";
    REGS.timehm2="^(\\d+):(\\d+)$";
    REGS.pass="^\\w+$";
    REGS.float="^(-?\\d+)(\\.\\d+)?$";
    REGS.int="^-?\\d+$";
    REGS.handtel="^13[5,6,7,8,9]\\d{8}$";
    REGS.hz="^[^\\x00-\\xff]+$";
    REGS.mancode="^d{15}|d{}18$";

    /**数字校验，莫怡齐
     * return -1 无法判断检验类型;return 0 不合法;return 1 合法;*/
    function isvalidvalue(v,type){  if(trimA(v)=="") return 1;
      var ireg="";for (var T in REGS) if(type==T){ireg=REGS[T];break;}   if(ireg=="") return -1;
      var re = new RegExp(ireg,"ig");  return re.test(v)?1:0;  
     }
    function ispass(value){return (trimA(value)!=""&&isvalidvalue(value,"pass")==1);}
    function isint(value){return (trimA(value)!=""&&isvalidvalue(value,"int")==1);}
    function isfloat(value){return (trimA(value)!=""&&isvalidvalue(value,"float")==1);}
    function hashz(value){return (trimA(value)!=""&&isvalidvalue(value,"hz")==1);}
    function isdate(value){return (trimA(value)!=""&&isvalidvalue(value,"date")==1);}
    function isdatetime(value){return (trimA(value)!=""&&isvalidvalue(value,"datetime")==1);}	
    function istime(value){return (trimA(value)!=""&&isvalidvalue(value,"time")==1);}	
    function istimehm(value){return (trimA(value)!=""&&isvalidvalue(value,"timehm")==1);}	
    function istimehm2(value){return (trimA(value)!=""&&isvalidvalue(value,"timehm2")==1);}	

    function replace(str,oldsub,newsub){   var strs=str.split(oldsub);   return strs.join(newsub);}
    function trimA(str){	var temp = str.replace(/^[ ]*/g,"");	return temp.replace(/[ ]*$/g,"");}
    function trimL(str){	return str.replace(/^[ ]*/g,"");}
    function trimR(str){	return str.replace(/[\s]*$/g,"");}//str.replace(/[ ]*$/g,"");

    //myd="y|m|d|h|n|s",默认为'd'.年按365天,月按365/12天,24小时制
    function datediff(bgnDate, endDate,myd){
    	  bgnDate=trimA(bgnDate);
    	  endDate=trimA(endDate);      
    	  var hhmmss1="00:00:00",hhmmss2="00:00:00";	  
    	  var d1=bgnDate,d2=endDate;
    	  if(bgnDate.indexOf(" ")!=-1){ hhmmss1=bgnDate.substr(bgnDate.indexOf(" ")+1);		  d1=bgnDate.substr(0,bgnDate.indexOf(" ")); }
     	  if(endDate.indexOf(" ")!=-1){hhmmss2=endDate.substr(endDate.indexOf(" ")+1);		  d2=endDate.substr(0,endDate.indexOf(" "));}
    	  var temp1=d1.split("-");	   
    	  var temp2=d2.split("-");
    	   try{
    		   strDate1=new Date(temp1[1]+"-"+temp1[2]+"-"+temp1[0]+" "+hhmmss1);
    		   steDate2=new Date(temp2[1]+"-"+temp2[2]+"-"+temp2[0]+" "+hhmmss2);
               var ret = strDate1- steDate2;
    		   if(typeof(myd)=="undefined")myd='d';
    		   var i=1000*3600*24;
    		   if(myd=='y')i=i*365;
    		   else  if(myd=='m')i=i*365/12;
    		   else if(myd=='h')i=i/24;	
    		   else if(myd=='n')i=i/24/60;
    		   else if(myd=='s')i=i/24/60/60;
    		   return (ret/i).toFixed(0)*1;    
            }catch(e){	
            	return 0;
    		}
     }
    //两日期相差的天数
     function compareDate(bgnDate,endDate){	 return datediff(bgnDate,endDate,'d');}
    //某月的天数(yearmonth=2006-01)
    function daysOfYM(yearmonth){
     var yms=yearmonth.split("-"); if(yms.length<2) return 0;
     var t1=new Date(yms[0],yms[1],1); var d1=t1.getTime(); var t2=t1.setMonth(t1.getMonth()-1)  ;var d2=t1.getTime();    
     return  (d1-d2)/(1000*3600*24);    
    }

    //获得星期。style="str|num",num-0,1,2,3,4,5,6
    function getWeek(strdate,style){
       var tmp =strdate.split("-");   var  d =new Date(tmp[1]+"-"+tmp[2]+"-"+tmp[0])
       var x = new Array("星期日", "星期一", "星期二","星期三","星期四", "星期五","星期六");
       var day = d.getDay();
       if(style=="num") return day;   return( x[day]);
    }
    //日期加减得到新日期;strdate="2006-01-01",n=2(-2),myd="m|d|y",默认为'd'
     function toDate(strdate,n,myd){
        var tmp =strdate.split("-");
        if(strdate.length!=10||isNaN(parseInt(tmp[0]))||isNaN(parseInt(tmp[1]))||isNaN(parseInt(tmp[2]))){alert("第一个值日期值不合法!函数返回错误值-1"); return -1; }
      if(n=='')n=0;
      if(isNaN(parseInt(n)))     alert("第二个参数必须为数字!否则系统视同0!");
      	date1 = new Date(parseInt(tmp[0],10),parseInt(tmp[1],10)-1,parseInt(tmp[2],10)+parseInt(n,10))
    	if("m"==myd) date1 = new Date(parseInt(tmp[0],10),parseInt(tmp[1],10)-1+parseInt(n,10),parseInt(tmp[2],10))
    	else if("y"==myd) date1 = new Date(parseInt(tmp[0],10)+parseInt(n,10),parseInt(tmp[1],10)-1,parseInt(tmp[2],10))
            m=(date1.getMonth()+1)<10?("0"+(date1.getMonth()+1)):(date1.getMonth()+1)
            d=date1.getDate()<10?("0"+date1.getDate()):date1.getDate()
           return date1.getFullYear()+"-"+m+"-"+d
      }
    //加减月份得新年月
    function getAddMonth(yearmonth,n){
    	if(n>1900||n<-1900) return "";
      var month=parseInt(yearmonth.substring(5,7),10);  
      var year=parseInt(yearmonth.substring(0,4),10);      year=Math.floor((year*12+(month+n-1))/12)
    	  month=(year*12+(month+n-1))%12+1;
          return year+'-'+((month)<10?'0'+month:month)+yearmonth.substr(7)
    }  

    /*************************************************************/
