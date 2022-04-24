//tealium universal tag - utag.28 ut4.0.201911120056, Copyright 2019 Tealium.com Inc. All Rights Reserved.
try{(function(id,loader){var u={"id":id};utag.o[loader].sender[id]=u;if(utag.ut===undefined){utag.ut={};}
var match=/ut\d\.(\d*)\..*/.exec(utag.cfg.v);if(utag.ut.loader===undefined||!match||parseInt(match[1])<41){u.loader=function(o,a,b,c,l,m){utag.DB(o);a=document;if(o.type=="iframe"){m=a.getElementById(o.id);if(m&&m.tagName=="IFRAME"){b=m;}else{b=a.createElement("iframe");}o.attrs=o.attrs||{};utag.ut.merge(o.attrs,{"height":"1","width":"1","style":"display:none"},0);}else if(o.type=="img"){utag.DB("Attach img: "+o.src);b=new Image();}else{b=a.createElement("script");b.language="javascript";b.type="text/javascript";b.async=1;b.charset="utf-8";}if(o.id){b.id=o.id;}for(l in utag.loader.GV(o.attrs)){b.setAttribute(l,o.attrs[l]);}b.setAttribute("src",o.src);if(typeof o.cb=="function"){if(b.addEventListener){b.addEventListener("load",function(){o.cb();},false);}else{b.onreadystatechange=function(){if(this.readyState=="complete"||this.readyState=="loaded"){this.onreadystatechange=null;o.cb();}};}}if(o.type!="img"&&!m){l=o.loc||"head";c=a.getElementsByTagName(l)[0];if(c){utag.DB("Attach to "+l+": "+o.src);if(l=="script"){c.parentNode.insertBefore(b,c);}else{c.appendChild(b);}}}};}else{u.loader=utag.ut.loader;}
if(utag.ut.typeOf===undefined){u.typeOf=function(e){return({}).toString.call(e).match(/\s([a-zA-Z]+)/)[1].toLowerCase();};}else{u.typeOf=utag.ut.typeOf;}
u.ev={"view":1,"link":1};u.map={"event.krux_id":"event_id","event.krux_type":"event_type"};u.extend=[function(a,b){try{if(1){b['event.krux_type']='rtg';if(b['event.event_name']=='share_listing'){if(b['event.share_type']=='facebook'){b['event.krux_id']='KdHyeDAK';}
if(b['event.share_type']=='twitter'){b['event.krux_id']='KdHzents';}
if(b['event.share_type']=='email'){b['event.krux_id']='Jst_hF23';}
if(b['event.share_type']=='copy link'){}}
if(b['event.event_name']=='saveProperty'||b['event.event_name']=='save_property'){b['event.krux_id']='KdHvHYkE';}
if(b['event.event_name']=='clickToShowContactAgentForm'){if(b['page.site_section']=='buy'){b['event.krux_id']='KdghNOdm';}
if(b['page.site_section']=='rent'){b['event.krux_id']='KdghhVFW';}
if(b['page.site_section']=='sold'){b['event.krux_id']='KdgiF-f0';}}
if(b['event.event_name']=='emailAgent'){if(b['page.site_section']=='buy'){b['event.krux_id']='Jq-Qs_Ar';}
if(b['page.site_section']=='rent'){b['event.krux_id']='J05pQmlz';}
if(b['page.site_section']=='sold'){b['event.krux_id']='J05pfnrZ';}}
if(b['event.event_name']=='email_lead_to_agent'){b['event.krux_id']='MTTPYgBS';if(b['event.about_me']=='Buyer'){b['event.krux_id']='MS8jMgOO';}
if(b['event.about_me']=='First home buyer'){b['event.krux_id']='MS8jlOeJ';}
if(b['event.about_me']=='Investor'){b['event.krux_id']='MS8kLx2S';}
if(b['event.about_me']=='Monitoring the market'){b['event.krux_id']='MS8koPLZ';}
if(b['event.about_me']=='Seller'){b['event.krux_id']='MS8k7mXY';}
if(b['event.about_me']=='Other'){b['event.krux_id']='MS882zRD';}}
if(b['event.event_name']=='renovation_calculator_open'||b['event.event_name']=='renovation_calculator_close'){if(b['event.room_type']=='paintinterior'){b['event.krux_id']='LfLwACvy';}
if(b['event.room_type']=='paintexterior'){b['event.krux_id']='LfLvqbfk';}
if(b['event.room_type']=='kitchen'){b['event.krux_id']='LfLvVFqu';}
if(b['event.room_type']=='bathroom'){b['event.krux_id']='LfLuTggY';}}
if(b['event.event_name']=='calendar_save'){b['event.krux_id']='KdH0ByN4';}
if(b['event.event_name']=='agent_match_submit'){b['event.krux_id']='MTzQUDBJ';}
if(b['event.event_name']=='click_add_my_location'){b['event.krux_id']='MnklKwBW';}
if(b['event.event_name']=='home_loan_calculator_interaction'&&b['event.user_action']=='field_change'){b['event.krux_id']='MIoss_xL';if(b['event.field_updated']=='home-loan-calculator:interestRate'){b['event.krux_id']='MIXj0uSR';}
if(b['event.field_updated']=='home-loan-calculator:firstHomeBuyer'){b['event.krux_id']='MIXkQYKl';}
if(b['event.field_updated']=='home-loan-calculator:purchaseIntent'){b['event.krux_id']='MIXkylDl';}}
if(b['event.event_name']=='contact_form_modal_open'&&b['event.form_name']=='home_loan_lead'){b['event.krux_id']='MIXlQt4A';}
if(b['event.event_name']=='home_loan_click_to_dial'&&b['page.page_name']=='rea:home-loans:next-steps'){b['event.krux_id']='MIXlkj34';}
if(b['event.event_name']=='download_document'){b['event.krux_id']='M-ccKObm';}
if(b['event.event_name']=='home_loan_click_to_dial'&&b['event.fulfilment_channel']=='broker'){b['event.krux_id']='M_DOiPhI';}
if(b['event.event_name']=='home_loan_click_to_dial'&&b['event.fulfilment_channel']=='bank'){b['event.krux_id']='M_EFZVLD';}
if(b['event.event_name']=='contact_form_submitted'&&b['event.form_name']=='callback_request'){b['event.krux_id']='M_UZUbMB';}
if(b['event.event_name']=='contact_form_submitted'&&b['event.form_name']=='broker_campaign'){b['event.krux_id']='M_VEHLrE';}
if(b['ut.event']=='view'){if(b['page.page_name']=='rea:home-loans:next-steps'){b['event.krux_id']='MIXk9pAO';}
if(b['page.page_name']=='rea:home-loans:OCA:bridging'){b['event.krux_id']='MIXmSuAI';}
if(b['page.page_name']=='nab:home-loans:OCA-form-standard:get-started'){b['event.krux_id']='MIXmdw6p';}
if(b['page.page_name']=='nab:home-loans:OCA-form-standard:next-steps'){b['event.krux_id']='MIXm3mo6';}
if(b['page.page_name']=='nab:home-loans:OCA-form-standard:Exit1'){b['event.krux_id']='MIXnF6by';}
if(b['page.page_name']=='nab:home-loans:OCA-form-standard:Outcome'){b['event.krux_id']='MIXnPp1n';}
if(b['page.page_name']=='rea:home-loans:my-finances:homepage'||b['page.page_name']=='rea:home-loans:my-finances:my-finances'||b['page.page_name']=='rea:home-loans:my-finances:my-preferences'||b['page.page_name']=='rea:home-loans:my-finances:my-homeloan'||b['page.page_name']=='rea:home-loans:my-finances:about-reahl'||b['page.page_name']=='rea:home-loans:my-finances:secure-data'){b['event.krux_id']='MIXo4iWp';}
if(b['page.page_name']=='rea:home-loans:find-a-home-loan'){b['event.krux_id']='MIXphWLI';}
if(b['page.page_name']=='rea:home-loans:homepage'){b['event.krux_id']='MIXphWLI';}
if(b['page.page_name']=='rea:home-loans:guides:landing'){b['event.krux_id']='M-MaZTD';}
if(b['page.page_name']=='rea:home-loans:guides:first-home-buyer'){b['event.krux_id']='M-MaZTD';}
if(b['page.page_name']=='rea:home-loans:guides:next-home'){b['event.krux_id']='M-MaZTD';}
if(b['page.page_name']=='rea:home-loans:guides:investment'){b['event.krux_id']='M-MaZTD';}
if(b['page.page_name']=='rea:home-loans:guides:refinance'){b['event.krux_id']='M-MaZTD';}
if(b['page.page_name']=='rea:home-loans:guides:selling-a-home'){b['event.krux_id']='M-MaZTD';}
if(b['page.page_name']=='rea:home-loans:guides:understanding-home-loans'){b['event.krux_id']='M-MaZTD';}
if(b['page.page_name']=='rea:home-loans:guides:article'){b['event.krux_id']='M-MaZTD';}
if(b['page.page_name']=='rea:home-loans:calculators:confidence-builder:intro'){b['event.krux_id']='M-82mrqg';}
if(b['page.page_name']=='rea:home-loans:calculators:confidence-builder:details'||b['page.page_name']=='rea:home-loans:calculators:confidence-builder:result'){b['event.krux_id']='M-9TsDWN';}
if(b['page.page_name']=='rea:home-loans:calculators:stamp-duty-calculator'){b['event.krux_id']='M-9e1kLZ';}
if(b['page.page_name']=='rea:home-loans:bank-or-broker:homepage'){b['event.krux_id']='M_DB9icQ';}
if(b['page.page_name']=='rea:home-loans:bank-or-broker:homepage-refi'||b['page.page_name']=='rea:home-loans:calculators:refinance-calculator'||b['page.page_name']=='rea:home-loans:loans:refinance-home-loan'){b['event.krux_id']='M_ELVZYM';}
if(b['page.page_name']=='rea:home-loans:enquiry-forms:form-general'||b['page.page_name']=='rea:home-loans:enquiry-forms:form-scheduled-maintenance'){b['event.krux_id']='M_UX4Pir';}
if(b['page.page_name']=='rea:home-loans:mortgage-brokers:search-page'){b['event.krux_id']='M_U2ac9B';}
if(b['page.page_name']=='rea:home-loans:mortgage-brokers:search-results-page'){b['event.krux_id']='M_U3JFv8';}
if(b['page.page_name']=='rea:home-loans:mortgage-brokers:profile-page'){b['event.krux_id']='M_U_Nkvy';}}
}}catch(e){utag.DB(e)}}];u.send=function(a,b){if(u.ev[a]||u.ev.all!==undefined){utag.DB("send:28");utag.DB(b);var c,d,e,f;u.data={"qsp_delim":"&","kvp_delim":"=","base_url":"//beacon.krxd.net/event.gif?","pub_id":"","event_id":"","event_type":""};for(c=0;c<u.extend.length;c++){try{d=u.extend[c](a,b);if(d==false)return}catch(e){}};utag.DB("send:28:EXTENSIONS");utag.DB(b);c=[];for(d in utag.loader.GV(u.map)){if(b[d]!==undefined&&b[d]!==""){e=u.map[d].split(",");for(f=0;f<e.length;f++){if(u.data[e[f]]===undefined){c.push(e[f]+u.data.kvp_delim+b[d]);}else{u.data[e[f]]=b[d];}}}}
utag.DB("send:28:MAPPINGS");utag.DB(u.data);if(!u.data.event_id){utag.DB(u.id+": Tag not fired: Required attribute not populated");return;}
if(u.data.pub_id){c.unshift("pub_id"+u.data.kvp_delim+u.data.pub_id);}
if(u.data.event_type){c.unshift("event_type"+u.data.kvp_delim+u.data.event_type);}
c.unshift("event_id"+u.data.kvp_delim+u.data.event_id);u.loader({"type":"img","src":u.data.base_url+c.join(u.data.qsp_delim)});utag.DB("send:28:COMPLETE");}};utag.o[loader].loader.LOAD(id);}("28","rea-group.main"));}catch(error){utag.DB(error);}
