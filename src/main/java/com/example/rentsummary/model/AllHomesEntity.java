/**
 * define AllHomesEntity class to query information from AllHomes
 *
 * @author rentme
 */
package com.example.rentsummary.model;

import java.util.List;

public class AllHomesEntity {
    /**
     * meta : {"backend":"lambda-listing-search","environment":"live","version":"9890b48fa1b294a5263b8c22e7c67e4f36712baa"}
     * searchResults : [{"listing":{"id":173455572,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/chifley-act-2606?tid=173455572","title":"ROOMS AVAILABLE IN GREAT LOCATION","firstImage":"https://images.allhomes.com.au/property/photo/85f14360974a6ffcd346deff5d801c26_m.jpg","priceLabel":"$160 per week","numPhotos":3,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1487312513797,"relistedDate":1487312513797},"address":{"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Chifley","state":"ACT","postcode":"2606","coordinates":{"lat":-35.3568281,"lon":149.075456}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":0,"size":764,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","CEILING_FANS","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","PETS_ALLOWED","STUDY"]},"agency":{"id":65555,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":176584036,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/jacka-act-2914?tid=176584036","title":"APPLICATION TAKEN","priceLabel":"$550-$580 per week","numPhotos":0,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1553857527581,"relistedDate":1553857527581},"address":{"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Bonner","state":"ACT","postcode":"2914","coordinates":{"lat":-35.1616172,"lon":149.1298764}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":1,"eer":6,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","HEATING_CENTRAL","SEPARATE_TOILET"]},"agency":{"id":220055,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179148250,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/46-moonlight-avenue-harrison-act-2914","title":"MODERN FAMILY HOME!","firstImage":"https://images.allhomes.com.au/property/photo/a234e10fd1ae7049500ab9cad2b64d95_m.jpg","priceLabel":"$550 per week","numPhotos":15,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1611729129247,"relistedDate":1611729129247,"availableFrom":1613566800000},"address":{"street":"46 Moonlight Avenue","division":"Harrison","state":"ACT","postcode":"2914","coordinates":{"lat":-35.190242,"lon":149.1547281}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":0,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DISHWASHER","HEATING_GAS"]},"agency":{"id":51,"type":"Agent","name":"Badenoch Real Estate Rentals","url":"https://www.allhomes.com.au/agency/badenoch-real-estate-rentals-51/","logo":"https://images.allhomes.com.au/agent/logo/aead56809818ed7c5bc78cf31efe948a_agency_t.jpg","agents":[{"name":"Jayne Spice","image":"https://images.allhomes.com.au/agent/staff/63b79078e301a371fc12c98e3051ddf8_110x110.jpg"}]}},{"listing":{"id":179234367,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/8a-eckley-street-gungahlin-act-2912","title":"Four bedroom Plus Study","firstImage":"https://images.allhomes.com.au/property/photo/5d85b6c87b84227f601348b78e9fe6cb_m.jpg","priceLabel":"$550 per week","numPhotos":17,"has3dTour":false,"hasVideo":false,"badges":{"underApplication":true},"events":[],"publicVisibleDate":1613702471725,"relistedDate":1613702471725,"availableFrom":1613653200000},"address":{"street":"8A Eckley Street","division":"Gungahlin","state":"ACT","postcode":"2912","coordinates":{"lat":-35.18137173,"lon":149.1340154}},"property":{"types":["TOWNHOUSE"],"beds":4,"baths":2,"cars":2,"eer":0,"size":220.9,"features":["STUDY"]},"agency":{"id":386,"type":"Agent","name":"Premier Capital Properties","url":"https://www.allhomes.com.au/agency/premier-capital-properties-386/","logo":"https://images.allhomes.com.au/agent/logo/976b266c30e3b1c6a3665940a810d29b_agency_t.gif","agents":[{"name":"Kylie Campbell","image":"https://images.allhomes.com.au/agent/staff/36ae7717d14cb226ba3afd4a5c619e6c_110x110.jpg"}]}},{"listing":{"id":179258399,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/14-banksia-crescent-karabar-nsw-2620","title":"Gorgeous 4 bedroom 2 bathroom family home","firstImage":"https://images.allhomes.com.au/property/photo/9510e77e892ffda80bc64e363726f6b7_m.jpg","priceLabel":"$550 per week","numPhotos":10,"has3dTour":false,"hasVideo":false,"badges":{"new":true},"events":[],"publicVisibleDate":1615210180618,"relistedDate":1615210180618,"availableFrom":1615640400000},"address":{"street":"14 Banksia Crescent","division":"Karabar","state":"NSW","postcode":"2620","coordinates":{"lat":-35.3713366,"lon":149.2260125}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","CEILING_FANS","HEATING_REVERSE_CYCLE"]},"agency":{"id":168105,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179259331,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/67-hurley-street-mawson-act-2607","title":"Four bedroom family home","firstImage":"https://images.allhomes.com.au/property/photo/9a52db256384a8b53e9f997fa8272d35_m.jpg","priceLabel":"$560 per week","numPhotos":10,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614303091265,"relistedDate":1614303091265,"availableFrom":1615726800000},"address":{"street":"67 Hurley Street","division":"Mawson","state":"ACT","postcode":"2607","coordinates":{"lat":-35.3611431193461,"lon":149.094128311051}},"property":{"types":["HOUSE"],"beds":4,"baths":1,"cars":1,"size":0,"features":["AIR_CONDITIONING_REVERSE_CYCLE","HEATING_CENTRAL"]},"agency":{"id":184995,"type":"Agent","name":"Distinct Property Management","url":"https://www.allhomes.com.au/agency/distinct-property-management-184995/","logo":"https://images.allhomes.com.au/agent/logo/65c35bb94a77d2ea92bb90a8d50b41b2_agency_t.jpg","agents":[{"name":"Rentals at DPM","image":"https://images.allhomes.com.au/agent/staff/67ff734980a66a37ae654c861e1a8d44_110x110.jpg"},{"name":"Chris Winslade","image":"https://images.allhomes.com.au/agent/staff/d4958a2137ec8548498aad1b237dac8c_110x110.jpg"}]}},{"listing":{"id":176759661,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/forwood-street-monash-act-2904?tid=176759661","title":"GREAT FAMILY HOME","firstImage":"https://images.allhomes.com.au/property/photo/d6e56d0520ded69c9d329c63b3e83387_m.jpg","priceLabel":"$560 per week","numPhotos":7,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1558954537943,"relistedDate":1558954537943},"address":{"suppression":"NUMBER","street":"Forwood Street","division":"Monash","state":"ACT","postcode":"2904","coordinates":{"lat":-35.4131117,"lon":149.0894003}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":0,"size":799,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","CEILING_FANS","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","HEATING_REVERSE_CYCLE","SEPARATE_TOILET"]},"agency":{"id":854013,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":169675854,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/322-flemington-road-gungahlin-act-2912","title":"Spacious four bedroom house near Gungahlin town centre","firstImage":"https://images.allhomes.com.au/property/photo/87fbaa799b5ee9765d5fe403d0477ef7_m.jpg","priceLabel":"$570 per week","numPhotos":7,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1427240335932,"relistedDate":1427240335932},"address":{"street":"322 Flemington Road","division":"Gungahlin","state":"ACT","postcode":"2912","coordinates":{"lat":-35.18738669,"lon":149.14517558}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":463.6,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","HEATING_REVERSE_CYCLE"]},"agency":{"id":313725,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179279767,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/44-galloway-street-isabella-plains-act-2905","title":"Lots of living space!","firstImage":"https://images.allhomes.com.au/property/photo/27340c504f4ef395647e662f1838b2ba_m.jpg","priceLabel":"$575 per week","numPhotos":9,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614838161578,"relistedDate":1614838161578,"availableFrom":1615554000000},"address":{"street":"44 Galloway Street","division":"Isabella Plains","state":"ACT","postcode":"2905","coordinates":{"lat":-35.4293616394633,"lon":149.091859962787}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"features":[]},"agency":{"id":928773,"type":"Agent","name":"Richmond Properties Canberra","url":"https://www.allhomes.com.au/agency/richmond-properties-canberra-928773/","logo":"https://images.allhomes.com.au/agent/logo/5b855a71fe77a4fa235dbc7c83ca4598_agency_t.png","agents":[{"name":"Mary Richmond","image":"https://images.allhomes.com.au/agent/staff/281272d28bcd8a11e9e266e036173d1f_110x110.jpg"}]}},{"listing":{"id":179249474,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/9-auburn-street-amaroo-act-2914","title":"Great family home","firstImage":"https://images.allhomes.com.au/property/photo/b45b32c3d0a8a2eb8ce0b0aec15b425d_m.jpg","priceLabel":"$590 per week","numPhotos":10,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614655562478,"relistedDate":1614655562478,"availableFrom":1617022800000},"address":{"street":"9 Auburn Street","division":"Amaroo","state":"ACT","postcode":"2914","coordinates":{"lat":-35.16908049,"lon":149.12739905}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"features":["AIR_CONDITIONING_REVERSE_CYCLE","DISHWASHER","ENTRANCE_HALL","FAMILY_ROOM","FENCING"]},"agency":{"id":197165,"type":"Agent","name":"Key Real Estate ACT","url":"https://www.allhomes.com.au/agency/key-real-estate-act-197165/","logo":"https://images.allhomes.com.au/agent/logo/8e7e23a698f6c8febf05be0a18bce122_agency_t.png","agents":[{"name":"Michelle Gibb","image":"https://images.allhomes.com.au/agent/staff/60a906f48e82d271a7ced082df0f2618_110x110.jpg"}]}},{"listing":{"id":179279986,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/4-sherwin-place-melba-act-2615","title":"Fantastic Family Home","firstImage":"https://images.allhomes.com.au/property/photo/5ddc87dd32bfca1628dd017399d17640_m.jpg","priceLabel":"$590 per week","numPhotos":10,"has3dTour":false,"hasVideo":false,"badges":{"underApplication":true},"events":[],"publicVisibleDate":1614817859519,"relistedDate":1614817859519,"availableFrom":1616504400000},"address":{"street":"4 Sherwin Place","division":"Melba","state":"ACT","postcode":"2615","coordinates":{"lat":-35.2108470651039,"lon":149.054301685766}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":0,"size":0,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DISHWASHER"]},"agency":{"id":489,"type":"Agent","name":"En Vogue Property Management","url":"https://www.allhomes.com.au/agency/en-vogue-property-management-489/","logo":"https://images.allhomes.com.au/agent/logo/3f26f4a1f4a7edd097f55370398982c2_agency_t.jpg","agents":[{"name":"Paul Kerin","image":"https://images.allhomes.com.au/agent/staff/e2d120289fe69fb591f7679d048710b9_110x110.jpg"},{"name":"Brittany Bremer","image":"https://images.allhomes.com.au/agent/staff/83ce5c70a6210ca402c0cd0d626a887e_110x110.jpg"}]}},{"listing":{"id":175585148,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/throsby-act-2914?tid=175585148","title":"4 Bedroom family home - Available now","priceLabel":"$595 per week","numPhotos":0,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1565051977326,"relistedDate":1565051977326},"address":{"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Throsby","state":"ACT","postcode":"2914","coordinates":{"lat":-35.19087715,"lon":149.16605105}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"eer":7,"size":250,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","ELECTRIC_HEATING","ENCLOSED_BACKYARD","HEATING_CENTRAL","HEATING_REVERSE_CYCLE","NEW_CONSTRUCTION","RUMPUS_ROOM","SEPARATE_TOILET"]},"agency":{"id":461667,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179281987,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/1-moor-place-evatt-act-2617","title":"Picture perfect 4 bedroom home","firstImage":"https://images.allhomes.com.au/property/photo/d57cfd060f74fef3a0005875d631c6fa_m.jpg","priceLabel":"$600 per week","numPhotos":8,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614833450763,"relistedDate":1614833450763,"availableFrom":1615208400000},"address":{"street":"1 Moor Place","division":"Evatt","state":"ACT","postcode":"2617","coordinates":{"lat":-35.2075280173749,"lon":149.067335495696}},"property":{"types":["HOUSE"],"beds":4,"baths":1,"cars":2,"size":0,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER"]},"agency":{"id":643351,"type":"Agent","name":"Blackshaw Belconnen","url":"https://www.allhomes.com.au/agency/blackshaw-belconnen-643351/","logo":"https://images.allhomes.com.au/agent/logo/65b5b76845237cf0ecf042f480f570cb_agency_t.jpg","agents":[{"name":"Tanja Huovinen","image":"https://images.allhomes.com.au/agent/staff/fd4efb8c43f31d7b99400ef38a9e2398_110x110.jpg"}]}},{"listing":{"id":179270509,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/2-furlong-road-queanbeyan-nsw-2620?tid=179270509","title":"FREE STANDING TOWNHOUSE","firstImage":"https://images.allhomes.com.au/property/photo/d1529fe660bb7118dd15dc975666c469_m.jpg","priceLabel":"$600 per week","numPhotos":18,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614652873876,"relistedDate":1614652873876,"availableFrom":1614603600000},"address":{"street":"2 Furlong Road","division":"Queanbeyan","state":"NSW","postcode":"2620","coordinates":{"lat":-35.362567,"lon":149.206325}},"property":{"types":["TOWNHOUSE"],"beds":4,"baths":2,"cars":2,"size":0,"features":[]},"agency":{"id":3967,"type":"Agent","name":"Blackshaw Queanbeyan & Jerrabomberra","url":"https://www.allhomes.com.au/agency/blackshaw-queanbeyan-jerrabomberra-3967/","logo":"https://images.allhomes.com.au/agent/logo/65b5b76845237cf0ecf042f480f570cb_agency_t.jpg","agents":[{"name":"Queanbeyan Property Management","image":"https://images.allhomes.com.au/agent/staff/6e44ba6676ce261c54f92da11f033b74_110x110.jpg"}]}},{"listing":{"id":179279559,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/unit-7-27-paperbark-street-banks-act-2906","title":"Family Home!","firstImage":"https://images.allhomes.com.au/property/photo/51d8665d5e7ed8f6ad63c00159e7ccc5_m.jpg","priceLabel":"$600 per week","numPhotos":13,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614812450179,"relistedDate":1614812450179,"availableFrom":1617282000000},"address":{"street":"7/27 Paperbark Street","division":"Banks","state":"ACT","postcode":"2906","coordinates":{"lat":-35.46945148,"lon":149.10583396}},"property":{"types":["TOWNHOUSE"],"beds":4,"baths":2,"cars":2,"eer":0,"size":0,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER"]},"agency":{"id":1517,"type":"Agent","name":"Blackshaw Tuggeranong","url":"https://www.allhomes.com.au/agency/blackshaw-tuggeranong-1517/","logo":"https://images.allhomes.com.au/agent/logo/65b5b76845237cf0ecf042f480f570cb_agency_t.jpg","agents":[{"name":"Rachel Tynan","image":"https://images.allhomes.com.au/agent/staff/5fd56b076cbdd113387f69e7b61442f4_110x110.jpg"}]}},{"listing":{"id":179263857,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/55-lindrum-crescent-holt-act-2615","title":"55 Lindrum Crescent Holt","firstImage":"https://images.allhomes.com.au/property/photo/efb5a2b5859c26cafabd5fe444065478_m.jpg","priceLabel":"$600 per week","numPhotos":13,"has3dTour":false,"hasVideo":false,"badges":{"new":true},"events":[],"publicVisibleDate":1615603488980,"relistedDate":1615603488980,"availableFrom":1616936400000},"address":{"street":"55 Lindrum Crescent","division":"Holt","state":"ACT","postcode":"2615","coordinates":{"lat":-35.2250961,"lon":149.0068786}},"property":{"types":["HOUSE"],"beds":4,"baths":1,"cars":2,"eer":1,"size":895,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","ALLOCATED_CAR_SPACE","HEATING_CENTRAL","SEPARATE_TOILET"]},"agency":{"id":865356,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179266330,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/55-mannheim-street-kambah-act-2902","title":"Four bedroom home in heart of Kambah","firstImage":"https://images.allhomes.com.au/property/photo/908d842e00c458b293f19985ee079b39_m.jpg","priceLabel":"$620 per week","numPhotos":13,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614574244359,"relistedDate":1614574244359,"availableFrom":1616590800000},"address":{"street":"55 Mannheim Street","division":"Kambah","state":"ACT","postcode":"2902","coordinates":{"lat":-35.384899017124,"lon":149.072623013473}},"property":{"types":["HOUSE"],"beds":4,"baths":1,"cars":2,"size":0,"features":["AIR_CONDITIONING_SPLIT_SYSTEM","DISHWASHER","HEATING_GAS"]},"agency":{"id":184995,"type":"Agent","name":"Distinct Property Management","url":"https://www.allhomes.com.au/agency/distinct-property-management-184995/","logo":"https://images.allhomes.com.au/agent/logo/65c35bb94a77d2ea92bb90a8d50b41b2_agency_t.jpg","agents":[{"name":"Rentals at DPM","image":"https://images.allhomes.com.au/agent/staff/67ff734980a66a37ae654c861e1a8d44_110x110.jpg"},{"name":"Chris Winslade","image":"https://images.allhomes.com.au/agent/staff/d4958a2137ec8548498aad1b237dac8c_110x110.jpg"}]}},{"listing":{"id":179267506,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/unit-28-24-railway-street-oaks-estate-act-2620","title":"Brand new villa in Oaks Estate","firstImage":"https://images.allhomes.com.au/property/photo/0d34dc71ae879610264bd0d412471be9_m.jpg","priceLabel":"$620 per week","numPhotos":11,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614580863884,"relistedDate":1614580863884,"availableFrom":1614862800000},"address":{"street":"28/24 Railway Street","division":"Oaks Estate","state":"ACT","postcode":"2620","coordinates":{"lat":-35.34163065,"lon":149.22576561}},"property":{"types":["VILLA"],"beds":4,"baths":2,"cars":2,"eer":6.5,"size":0,"features":["AIR_CONDITIONING_REVERSE_CYCLE","DISHWASHER","HEATING_CENTRAL"]},"agency":{"id":184995,"type":"Agent","name":"Distinct Property Management","url":"https://www.allhomes.com.au/agency/distinct-property-management-184995/","logo":"https://images.allhomes.com.au/agent/logo/65c35bb94a77d2ea92bb90a8d50b41b2_agency_t.jpg","agents":[{"name":"Rentals at DPM","image":"https://images.allhomes.com.au/agent/staff/67ff734980a66a37ae654c861e1a8d44_110x110.jpg"},{"name":"Chris Winslade","image":"https://images.allhomes.com.au/agent/staff/d4958a2137ec8548498aad1b237dac8c_110x110.jpg"}]}},{"listing":{"id":175368633,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/7-huxley-place-palmerston-act-2913","title":"CLOSE TO BUS STOP, PALMERSTON SCHOOL AND SHOP","firstImage":"https://images.allhomes.com.au/property/photo/58a6e12d4e6565d5e1b72946e10fd2ec_m.jpg","priceLabel":"$620 per week","numPhotos":7,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1528333067228,"relistedDate":1598596846075,"availableFrom":1600092000000},"address":{"street":"7 Huxley Place","division":"Palmerston","state":"ACT","postcode":"2913","coordinates":{"lat":-35.1944496835,"lon":149.1236754135}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":4,"size":573.5,"features":["DINING_ROOM","FAMILY_ROOM","HEATING_CENTRAL","PETS_ALLOWED"]},"agency":{"id":166285,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179268687,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/unit-27-24-railway-street-oaks-estate-act-2620","title":"Brand new family sized villa!","firstImage":"https://images.allhomes.com.au/property/photo/91b9db37fde64ad07996a9dd7808d23c_m.jpg","priceLabel":"$620 per week","numPhotos":11,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614631813081,"relistedDate":1614631813081,"availableFrom":1614862800000},"address":{"street":"27/24 Railway Street","division":"Oaks Estate","state":"ACT","postcode":"2620","coordinates":{"lat":-35.34163065,"lon":149.22576561}},"property":{"types":["VILLA"],"beds":4,"baths":2,"cars":2,"eer":6,"size":0,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DISHWASHER","HEATING_CENTRAL"]},"agency":{"id":184995,"type":"Agent","name":"Distinct Property Management","url":"https://www.allhomes.com.au/agency/distinct-property-management-184995/","logo":"https://images.allhomes.com.au/agent/logo/65c35bb94a77d2ea92bb90a8d50b41b2_agency_t.jpg","agents":[{"name":"Rentals at DPM","image":"https://images.allhomes.com.au/agent/staff/67ff734980a66a37ae654c861e1a8d44_110x110.jpg"},{"name":"Chris Winslade","image":"https://images.allhomes.com.au/agent/staff/d4958a2137ec8548498aad1b237dac8c_110x110.jpg"}]}},{"listing":{"id":179295359,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/unit-7-8-burgoyne-street-bonython-act-2905","title":"7/8 Burgoyne Street, Bonython","firstImage":"https://images.allhomes.com.au/property/photo/f3eed0d6c0a21e9d83bee74d9d2470e3_m.jpg","priceLabel":"$630 per week","numPhotos":10,"has3dTour":false,"hasVideo":false,"badges":{"new":true},"events":[],"publicVisibleDate":1615346545882,"relistedDate":1615346545882},"address":{"street":"7/8 Burgoyne Street","division":"Bonython","state":"ACT","postcode":"2905","coordinates":{"lat":-35.4266379400205,"lon":149.073384993706}},"property":{"types":["TOWNHOUSE"],"beds":4,"baths":2,"cars":2,"features":["AIR_CONDITIONING_REVERSE_CYCLE","DISHWASHER","SEPARATE_TOILET","SHOWER"]},"agency":{"id":1342,"type":"Builder","name":"M & R Investments Pty Ltd","url":"https://www.allhomes.com.au/agency/m-r-investments-pty-ltd-1342/","agents":[{"name":"Robert Vidovic"}]}},{"listing":{"id":179259074,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/73-turbayne-street-forde-act-2914?tid=179259074","title":"Fabulous in Forde!","firstImage":"https://images.allhomes.com.au/property/photo/475a93a8291aa63751bf3d344c6ef71b_m.jpg","priceLabel":"$630 per week","numPhotos":14,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614300640794,"relistedDate":1614300640794,"availableFrom":1615813200000},"address":{"street":"73 Turbayne Street","division":"Forde","state":"ACT","postcode":"2914","coordinates":{"lat":-35.1607429,"lon":149.1508035}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":0,"features":["AIR_CONDITIONING_REVERSE_CYCLE","DISHWASHER","HEATING_CENTRAL","OUTDOOR_ENTERTAINING_AREA"]},"agency":{"id":51,"type":"Agent","name":"Badenoch Real Estate Rentals","url":"https://www.allhomes.com.au/agency/badenoch-real-estate-rentals-51/","logo":"https://images.allhomes.com.au/agent/logo/aead56809818ed7c5bc78cf31efe948a_agency_t.jpg","agents":[{"name":"Jayne Spice","image":"https://images.allhomes.com.au/agent/staff/63b79078e301a371fc12c98e3051ddf8_110x110.jpg"}]}},{"listing":{"id":179074580,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/126-kosciuszko-avenue-palmerston-act-2913","title":"Family Home in Great Location","firstImage":"https://images.allhomes.com.au/property/photo/c760dc1d0667a03d336588d881a98a4b_m.jpg","priceLabel":"$640 per week","numPhotos":15,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1610080341076,"relistedDate":1610080341076},"address":{"street":"126 Kosciuszko Avenue","division":"Palmerston","state":"ACT","postcode":"2913","coordinates":{"lat":-35.19598948,"lon":149.11612308}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"features":[]},"agency":{"id":633372,"type":"Agent","name":"Bolton & Co Gungahlin","url":"https://www.allhomes.com.au/agency/bolton-co-gungahlin-633372/","logo":"https://images.allhomes.com.au/agent/logo/6d834fd9d47d281411030cb7cd4bac42_agency_t.jpg","agents":[{"name":"Jade O'Brien"}]}},{"listing":{"id":179043012,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/bonner-act-2914?tid=179043012","title":"39 Mobourne Street Bonner","firstImage":"https://images.allhomes.com.au/property/photo/1fd978218942fb05e71fb6352756c0ce_m.jpg","priceLabel":"$640-$660 per week","numPhotos":16,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1609291350636,"relistedDate":1609291350636,"availableFrom":1611061200000},"address":{"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Bonner","state":"ACT","postcode":"2914","coordinates":{"lat":-35.160706,"lon":149.1375919}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"eer":5,"size":334,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","HEATING_CENTRAL","HEATING_REVERSE_CYCLE","NEW_CONSTRUCTION","PETS_ALLOWED","RUMPUS_ROOM"]},"agency":{"id":357186,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":177263420,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/gungahlin-act-2912?tid=177263420","title":"Gunghalin","priceLabel":"$650 per week","numPhotos":0,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1568447585785,"relistedDate":1568447585785},"address":{"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Gungahlin","state":"ACT","postcode":"2912","coordinates":{"lat":-35.1830624,"lon":149.1478293}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":470,"features":[]},"agency":{"id":867125,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179042844,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/20-gungurra-crescent-rivett-act-2611","title":"Your own private oasis","firstImage":"https://images.allhomes.com.au/property/photo/6325bcf9869989bb9c86288e10d1bc32_m.jpg","priceLabel":"$650 per week","numPhotos":13,"has3dTour":true,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1609871574045,"relistedDate":1609871574045},"address":{"street":"20 Gungurra Crescent","division":"Rivett","state":"ACT","postcode":"2611","coordinates":{"lat":-35.3450585,"lon":149.04185982}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":3,"features":[]},"agency":{"id":197165,"type":"Agent","name":"Key Real Estate ACT","url":"https://www.allhomes.com.au/agency/key-real-estate-act-197165/","logo":"https://images.allhomes.com.au/agent/logo/8e7e23a698f6c8febf05be0a18bce122_agency_t.png","agents":[{"name":"Paul Huskinson","image":"https://images.allhomes.com.au/agent/staff/9975bd53c647c6c0c20890c5c74b2a08_110x110.jpg"}]}},{"listing":{"id":179299027,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/41-moonlight-avenue-harrison-act-2914","title":"SPACIOUS FURNISHED/UNFURNISHED 4-BEDROOM HOUSE FOR RENT","firstImage":"https://images.allhomes.com.au/property/photo/57b2be653379390b47fb3b62e5508399_m.jpg","priceLabel":"$650 per week","numPhotos":12,"has3dTour":false,"hasVideo":false,"badges":{"new":true,"fullyFurnished":true},"events":[],"publicVisibleDate":1615350394892,"relistedDate":1615350394892,"availableFrom":1615726800000},"address":{"street":"41 Moonlight Avenue","division":"Harrison","state":"ACT","postcode":"2914","coordinates":{"lat":-35.1899763191473,"lon":149.154179517214}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"features":["FULLY_FURNISHED"]},"agency":{"id":906013,"type":"Agent","name":"Clover Canberra","url":"https://www.allhomes.com.au/agency/clover-canberra-906013/","logo":"https://images.allhomes.com.au/agent/logo/d2138d267ef8ebb7892a3188450b97bc_agency_t.png","agents":[{"name":"Clover Property Management"}]}},{"listing":{"id":179285012,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/13-etheridge-street-page-act-2614","title":"LARGE YARD, FAMILY HOME, ON A QUIET STREET","firstImage":"https://images.allhomes.com.au/property/photo/4977237f3db44f0344149f524be232d1_m.jpg","priceLabel":"$650 per week","numPhotos":10,"has3dTour":false,"hasVideo":false,"badges":{"new":true,"propertyOfTheWeek":true},"events":[],"publicVisibleDate":1615270136392,"relistedDate":1615270136392,"availableFrom":1617195600000},"address":{"street":"13 Etheridge Street","division":"Page","state":"ACT","postcode":"2614","coordinates":{"lat":-35.2381812786374,"lon":149.04527977815}},"property":{"types":["HOUSE"],"beds":4,"baths":1,"cars":2,"features":["AIR_CONDITIONING_SPLIT_SYSTEM","ALLOCATED_CAR_SPACE","DISHWASHER","ENCLOSED_BACKYARD","ENTRANCE_HALL","FAMILY_ROOM","FENCING","GARDEN_SHED","HEATING_GAS_CENTRAL","OFF_STREET_PARKING","OUTDOOR_ENTERTAINING_AREA","SEPARATE_TOILET","STUDY_NOOK"]},"agency":{"id":378306,"type":"Agent","name":"Manage Me Property Sales","url":"https://www.allhomes.com.au/agency/manage-me-property-sales-378306/","logo":"https://images.allhomes.com.au/agent/logo/fbff2ad1d00cf30ffa6c39ca279f980f_agency_t.jpg","agents":[{"name":"Amy Taylor","image":"https://images.allhomes.com.au/agent/staff/b73b2350965f6be86e17d1dc814c5a9f_110x110.jpg"},{"name":"Charlotte Forester","image":"https://images.allhomes.com.au/agent/staff/30a98d61c3f8589802c74ce2e83d8a69_110x110.jpg"}]}},{"listing":{"id":179293782,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/unit-4-101-o-keefe-avenue-moncrieff-act-2914","title":"Modern family home","firstImage":"https://images.allhomes.com.au/property/photo/7ac916909aa2e8affb2622f22fafc1f6_m.jpg","priceLabel":"$650 per week","numPhotos":9,"has3dTour":false,"hasVideo":false,"badges":{"new":true},"events":[],"publicVisibleDate":1615436754017,"relistedDate":1615436754017},"address":{"street":"4/101 O'Keefe Avenue","division":"Moncrieff","state":"ACT","postcode":"2914","coordinates":{"lat":-35.1569993,"lon":149.12127065}},"property":{"types":["TOWNHOUSE"],"beds":4,"baths":2,"cars":2,"eer":6.5,"size":3353,"features":[]},"agency":{"id":617829,"type":"Agent","name":"Capital Partner Real Estate","url":"https://www.allhomes.com.au/agency/capital-partner-real-estate-617829/","logo":"https://images.allhomes.com.au/agent/logo/3585a37afd2905b2794ee7a872b115d0_agency_t.jpg","agents":[{"name":"Alicia Bai","image":"https://images.allhomes.com.au/agent/staff/35d4cb2c431d88fefb889fecf314ae7a_110x110.jpg"},{"name":"Lily Liu","image":"https://images.allhomes.com.au/agent/staff/396a2d980626b31682b1cdfc117b18de_110x110.jpg"}]}},{"listing":{"id":179301467,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/61-frome-street-griffith-act-2603","title":"Original Retro Charm in Griffith","firstImage":"https://images.allhomes.com.au/property/photo/bcc2f27602ce1628637bbacd75666ad9_m.jpg","priceLabel":"$650 per week","numPhotos":24,"has3dTour":false,"hasVideo":false,"badges":{"new":true},"events":[],"publicVisibleDate":1615353652438,"relistedDate":1615353652438,"availableFrom":1615208400000},"address":{"street":"61 Frome Street","division":"Griffith","state":"ACT","postcode":"2603","coordinates":{"lat":-35.3240035113276,"lon":149.142378488241}},"property":{"types":["HOUSE"],"beds":4,"baths":3,"cars":2,"size":0,"features":["AIR_CONDITIONING_REVERSE_CYCLE","HEATING_GAS"]},"agency":{"id":51,"type":"Agent","name":"Badenoch Real Estate Rentals","url":"https://www.allhomes.com.au/agency/badenoch-real-estate-rentals-51/","logo":"https://images.allhomes.com.au/agent/logo/aead56809818ed7c5bc78cf31efe948a_agency_t.jpg","agents":[{"name":"Jayne Spice","image":"https://images.allhomes.com.au/agent/staff/63b79078e301a371fc12c98e3051ddf8_110x110.jpg"}]}},{"listing":{"id":179314622,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/6-pring-place-latham-act-2615","title":"Updated Large family home","firstImage":"https://images.allhomes.com.au/property/photo/667a3b0e8d05f93c1fa914ec859cce6a_m.jpg","priceLabel":"$650 per week","numPhotos":12,"has3dTour":false,"hasVideo":false,"badges":{"new":true},"events":[{"id":114858550,"startTime":"2021-03-16T12:30:00","endTime":"2021-03-16T12:45:00","type":"EXHIBITION"}],"publicVisibleDate":1615771271531,"relistedDate":1615771271531,"availableFrom":1617195600000},"address":{"street":"6 Pring Place","division":"Latham","state":"ACT","postcode":"2615","coordinates":{"lat":-35.217763233764,"lon":149.023762871311}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":0,"features":["AIR_CONDITIONING_REVERSE_CYCLE","DISHWASHER"]},"agency":{"id":435947,"type":"Agent","name":"Leader Capital Real Estate","url":"https://www.allhomes.com.au/agency/leader-capital-real-estate-435947/","logo":"https://images.allhomes.com.au/agent/logo/7b2dc91c592e627c180f58936a9b4013_agency_t.jpg","agents":[{"name":"Tony Yip","image":"https://images.allhomes.com.au/agent/staff/7478d1bf67f0aa5486cc20b1b658a42e_110x110.jpg"},{"name":"Anissa Wong","image":"https://images.allhomes.com.au/agent/staff/de70267748ddf9d88e65ae38e686ddaa_110x110.jpg"}]}},{"listing":{"id":179186926,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/90-mary-gillespie-avenue-gungahlin-act-2912","title":"4 Bedroom , 1+E Bathrooms, 2 Garage Two Floors with beauttiful views","firstImage":"https://images.allhomes.com.au/property/photo/9168ec7627667f71bb2c984c0f2434c0_m.jpg","priceLabel":"$650 per week","numPhotos":11,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1612502119282,"relistedDate":1612502119282,"availableFrom":1614430800000},"address":{"street":"90 Mary Gillespie Avenue","division":"Gungahlin","state":"ACT","postcode":"2912","coordinates":{"lat":-35.1879069,"lon":149.1511534}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"eer":3,"size":389,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","ALARM","DINING_ROOM","DUCTED_VACCUM","ENCLOSED_BACKYARD","FAMILY_ROOM","HEATING_CENTRAL","PETS_ALLOWED","SEPARATE_TOILET"]},"agency":{"id":70775,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179099541,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/47-thomas-royal-gardens-queanbeyan-east-nsw-2620","title":"COMFORTABLE 4 BEDROOM FAMILY HOME","firstImage":"https://images.allhomes.com.au/property/photo/15475ad801e7afc19b69eee23abad1fc_m.jpg","priceLabel":"$650-$680 per week","numPhotos":9,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1611921045146,"relistedDate":1611921045146},"address":{"street":"47 Thomas Royal Gardens","division":"Queanbeyan East","state":"NSW","postcode":"2620","coordinates":{"lat":-35.3523934,"lon":149.2504796}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"features":["ENCLOSED_BACKYARD","FAMILY_ROOM","SEPARATE_TOILET","STUDY"]},"agency":{"id":336915,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":175468931,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/118-osburn-drive-macgregor-act-2615","title":"Near New Beautiful 4 Bedrooms Home","firstImage":"https://images.allhomes.com.au/property/photo/7935cada88d9431f5df5e1645d1bbf01_m.jpg","priceLabel":"$650-$750 per week","numPhotos":9,"has3dTour":false,"hasVideo":false,"badges":{"priceReduced":true},"events":[],"publicVisibleDate":1530248953432,"relistedDate":1530248953432,"availableFrom":1620050400000},"address":{"street":"118 Osburn Drive","division":"MacGregor","state":"ACT","postcode":"2615","coordinates":{"lat":-35.211414614018,"lon":149.009715542591}},"property":{"types":["HOUSE"],"beds":4,"baths":3,"cars":2,"eer":6,"size":890,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DINING_ROOM","DISABILITY_FRIENDLY","ENCLOSED_BACKYARD","HEATING_CENTRAL","PETS_ALLOWED"]},"agency":{"id":39305,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179254250,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/42-arabanoo-crescent-ngunnawal-act-2913","title":"Spacious Family Home!","firstImage":"https://images.allhomes.com.au/property/photo/d12b70daa9e820fd2cbddcf52c66d73f_m.jpg","priceLabel":"$650 per week","numPhotos":8,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1607985249442,"relistedDate":1607985249442,"availableFrom":1610456400000},"address":{"street":"42 Arabanoo Cres","division":"Ngunnawal","state":"ACT","postcode":"2913","coordinates":{"lat":-35.1751241924897,"lon":149.110169975695}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":0,"features":[]},"agency":{"id":653133,"type":"Agent","name":"Bolton & Co O'Connor","url":"https://www.allhomes.com.au/agency/bolton-co-o-connor-653133/","logo":"https://images.allhomes.com.au/agent/logo/6d834fd9d47d281411030cb7cd4bac42_agency_t.jpg","agents":[{"name":"Jacqui Turner"}]}},{"listing":{"id":169519524,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/14-dookie-street-farrer-act-2607","title":"Lovely PET-FRIENDLY family home close to Farrer primary school // REVERSE-CYCLE air conditioning and gas ducted heating // freshly painted throughout LARGE 4 bedroom, ensuite home // Fully enclosed rear garden sanctuary + 2-car lockup garage","firstImage":"https://images.allhomes.com.au/property/photo/73eb076e41af167bbf0b27f23ea55a24_m.jpg","priceLabel":"$650 per week","numPhotos":18,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1578574800000,"relistedDate":1580767906843,"availableFrom":1580043600000},"address":{"street":"14 Dookie Street","division":"Farrer","state":"ACT","postcode":"2607","coordinates":{"lat":-35.3759087,"lon":149.1093555}},"property":{"types":["HOUSE"],"beds":4,"baths":3,"cars":2,"size":952,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","HEATING_CENTRAL","PETS_ALLOWED","RUMPUS_ROOM","SEPARATE_TOILET"]},"agency":{"id":468517,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":177684876,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/bonner-act-2914?tid=177684876","title":"Spacious 4 bedroom home in great location","priceLabel":"$675 per week","numPhotos":0,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1575971587751,"relistedDate":1575971587751,"availableFrom":1579438800000},"address":{"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Bonner","state":"ACT","postcode":"2914","coordinates":{"lat":-35.1554611,"lon":149.1506664}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"eer":6.5,"size":450,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DINING_ROOM","DUCTED_VACCUM","ENCLOSED_BACKYARD","FAMILY_ROOM","HEATING_CENTRAL","SEPARATE_TOILET","WASH_CLOSET"]},"agency":{"id":131055,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179295926,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/13-lester-terrace-moncrieff-act-2914","title":"Thoughtfully designed Family Home","firstImage":"https://images.allhomes.com.au/property/photo/7957f6eb502625f3b81d9bbdf5421fb2_m.jpg","priceLabel":"$680-$700 per week","numPhotos":8,"has3dTour":false,"hasVideo":false,"badges":{"new":true},"events":[],"publicVisibleDate":1615265829457,"relistedDate":1615265829457,"availableFrom":1616936400000},"address":{"street":"13 Lester Terrace","division":"Moncrieff","state":"ACT","postcode":"2914","coordinates":{"lat":-35.1607979,"lon":149.1164059}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":439,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","HEATING_REVERSE_CYCLE"]},"agency":{"id":268925,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179271269,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/60-percival-road-googong-nsw-2620","title":"4 Bedroom Ensuite House","firstImage":"https://images.allhomes.com.au/property/photo/ab26174679be3366bf188a814244138d_m.jpg","priceLabel":"$680 per week","numPhotos":7,"has3dTour":false,"hasVideo":false,"badges":{"priceReduced":true},"events":[],"publicVisibleDate":1614725227974,"relistedDate":1614725227974,"availableFrom":1614517200000},"address":{"street":"60 Percival Road","division":"Googong","state":"NSW","postcode":"2620","coordinates":{"lat":-35.42629012,"lon":149.24127631}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"features":[]},"agency":{"id":115,"type":"Agent","name":"Elders Queanbeyan - Jerrabomberra - Googong","url":"https://www.allhomes.com.au/agency/elders-queanbeyan-jerrabomberra-googong-115/","logo":"https://images.allhomes.com.au/agent/logo/04fd20f994d50ad6c806c9ed8dc31710_agency_t.gif","agents":[{"name":"Queanbeyan Property Management"}]}},{"listing":{"id":179263106,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/26-dumaresq-street-dickson-act-2602","title":"Furnished House in a very convenient location at Dickson","firstImage":"https://images.allhomes.com.au/property/photo/f407b627f5e6cf40113bf755e585f96c_m.jpg","priceLabel":"$680 per week","numPhotos":16,"has3dTour":false,"hasVideo":false,"badges":{"fullyFurnished":true},"events":[],"publicVisibleDate":1614338382908,"relistedDate":1614338382908},"address":{"street":"26 Dumaresq Street","division":"Dickson","state":"ACT","postcode":"2602","coordinates":{"lat":-35.2515119,"lon":149.1429504}},"property":{"types":["HOUSE"],"beds":4,"baths":1,"cars":4,"size":716,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","ALLOCATED_CAR_SPACE","ENCLOSED_BACKYARD","FULLY_FURNISHED","HEATING_CENTRAL","SEPARATE_TOILET","STUDY"]},"agency":{"id":124705,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179280037,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/9-severne-crescent-kambah-act-2902","title":"SPACIOUS 4 BEDROOM FAMILY HOME","firstImage":"https://images.allhomes.com.au/property/photo/ac9c4d29d3b45b8668f24b62f99beb6e_m.jpg","priceLabel":"$680.00 per week","numPhotos":9,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614819676104,"relistedDate":1614819676104,"availableFrom":1617631200000},"address":{"street":"9 Severne Cres","division":"Kambah","state":"ACT","postcode":"2902","coordinates":{"lat":-35.3910288735838,"lon":149.070358175724}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":0,"size":0,"features":[]},"agency":{"id":919665,"type":"Agent","name":"Luton Properties Tuggeranong Property Management","url":"https://www.allhomes.com.au/agency/luton-properties-tuggeranong-property-management-919665/","logo":"https://images.allhomes.com.au/agent/logo/2ca87a516d09da84e3a662c648644369_agency_t.jpg","agents":[{"name":"Hayley Saunders"}]}},{"listing":{"id":179280437,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/303-maribyrnong-avenue-kaleen-act-2617","title":"Spacious 4 bedroom home in Kaleen","firstImage":"https://images.allhomes.com.au/property/photo/eddf8437a20cc5a75ae74407cd4b756e_m.jpg","priceLabel":"$680 per week","numPhotos":26,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614822042691,"relistedDate":1614822042691,"availableFrom":1614776400000},"address":{"street":"303 Maribyrnong Avenue","division":"Kaleen","state":"ACT","postcode":"2617","coordinates":{"lat":-35.233086733155,"lon":149.100444496271}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":0,"features":[]},"agency":{"id":5406,"type":"Agent","name":"Independent Property Management","url":"https://www.allhomes.com.au/agency/independent-property-management-5406/","logo":"https://images.allhomes.com.au/agent/logo/cd5264cb73239e7d1e37246a1182638a_agency_t.png","agents":[{"name":"Caroline Phengrasmy","image":"https://images.allhomes.com.au/agent/staff/6ed5068f73291ffe9b969b1dea058601_110x110.jpg"}]}},{"listing":{"id":179245826,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/20-ennor-crescent-florey-act-2615","title":"Great 4 bedroom + ensuite family home!","firstImage":"https://images.allhomes.com.au/property/photo/a2a83e380a660b8232fe875a4e37ced5_m.jpg","priceLabel":"$680 per week","numPhotos":16,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614054104009,"relistedDate":1614054104009,"availableFrom":1616677200000},"address":{"street":"20 Ennor Crescent","division":"Florey","state":"ACT","postcode":"2615","coordinates":{"lat":-35.2221383594095,"lon":149.045262313503}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"eer":4,"size":0,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DISHWASHER","HEATING_CENTRAL"]},"agency":{"id":184995,"type":"Agent","name":"Distinct Property Management","url":"https://www.allhomes.com.au/agency/distinct-property-management-184995/","logo":"https://images.allhomes.com.au/agent/logo/65c35bb94a77d2ea92bb90a8d50b41b2_agency_t.jpg","agents":[{"name":"Rentals at DPM","image":"https://images.allhomes.com.au/agent/staff/67ff734980a66a37ae654c861e1a8d44_110x110.jpg"},{"name":"Monike Kemp"}]}},{"listing":{"id":175451307,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/holder-act-2611?tid=175451307","title":"4 Bedroom furnished house, and gardens maintained regulary.","firstImage":"https://images.allhomes.com.au/property/photo/49b5b7632616ae2e40798495e4c18114_m.jpg","priceLabel":"$685 per week","numPhotos":6,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1529629897347,"relistedDate":1529629897347,"availableFrom":1529589600000},"address":{"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Holder","state":"ACT","postcode":"2611","coordinates":{"lat":-35.33447523,"lon":149.04615709}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":4,"size":790,"features":["ENCLOSED_BACKYARD","PARTIALLY_FURNISHED"]},"agency":{"id":578579,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179215198,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/15-saltbush-street-harrison-act-2914","title":"Rented","firstImage":"https://images.allhomes.com.au/property/photo/fbe1438e7fa78434768338fdc2e5e412_m.jpg","priceLabel":"$690 per week","numPhotos":12,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1613306294269,"relistedDate":1613306294269,"availableFrom":1613653200000},"address":{"street":"15 Saltbush Street","division":"Harrison","state":"ACT","postcode":"2914","coordinates":{"lat":-35.1905103,"lon":149.1572164}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"eer":4.5,"size":480,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","ALARM","DINING_ROOM","DISABILITY_FRIENDLY","ENCLOSED_BACKYARD","FAMILY_ROOM","SEPARATE_TOILET","SUNROOM"]},"agency":{"id":317915,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179142118,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/48-bellhouse-crescent-moncrieff-act-2914","title":"Designer home with high quality finishes","firstImage":"https://images.allhomes.com.au/property/photo/2f2fb36f7dfee79fe996e78d9e72503f_m.jpg","priceLabel":"$690 per week","numPhotos":14,"has3dTour":false,"hasVideo":true,"badges":{},"events":[],"publicVisibleDate":1611551022053,"relistedDate":1611551022053,"availableFrom":1613912400000},"address":{"street":"48 Bellhouse Crescent","division":"Moncrieff","state":"ACT","postcode":"2914","coordinates":{"lat":-35.1585009,"lon":149.1146676}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":0,"features":[]},"agency":{"id":5406,"type":"Agent","name":"Independent Property Management","url":"https://www.allhomes.com.au/agency/independent-property-management-5406/","logo":"https://images.allhomes.com.au/agent/logo/cd5264cb73239e7d1e37246a1182638a_agency_t.png","agents":[{"name":"Caroline Phengrasmy","image":"https://images.allhomes.com.au/agent/staff/6ed5068f73291ffe9b969b1dea058601_110x110.jpg"}]}},{"listing":{"id":178514002,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/stirling-act-2611?tid=178514002","title":"Cozy Family Home in Central Location","firstImage":"https://images.allhomes.com.au/property/photo/846056c6a8af479725fc9fb70aae8761_m.jpg","priceLabel":"$690 per week","numPhotos":9,"has3dTour":false,"hasVideo":false,"badges":{"priceReduced":true},"events":[{"id":114638664,"startTime":"2021-03-20T09:00:00","endTime":"2021-03-20T09:30:00","type":"EXHIBITION"}],"publicVisibleDate":1595931282312,"relistedDate":1595931282312,"availableFrom":1617195600000},"address":{"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Stirling","state":"ACT","postcode":"2611","coordinates":{"lat":-35.3498412,"lon":149.0555511}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":872,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","ALARM","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","HEATING_CENTRAL","SEPARATE_TOILET"]},"agency":{"id":167835,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179259019,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/morris-west-street-franklin-act-2913?tid=179259019","title":"Four bedroom home in Franklin","firstImage":"https://images.allhomes.com.au/property/photo/c55a9912f63d5f04d54a18f6df8378e1_m.jpg","priceLabel":"$690-$710 per week","numPhotos":14,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614586264303,"relistedDate":1614586264303,"availableFrom":1615035600000},"address":{"suppression":"NUMBER","street":"Morris West Street","division":"Franklin","state":"ACT","postcode":"2913","coordinates":{"lat":-35.2015049,"lon":149.1459207}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":354,"features":[]},"agency":{"id":530699,"type":"PrivateLister","name":"Private Lister"}},{"listing":{"id":179275221,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/15-pademelon-street-throsby-act-2914","title":"Four bedroom townhouse - brand new","firstImage":"https://images.allhomes.com.au/property/photo/808d72e6f4be2aa6659be7e2e5ee98fe_m.jpg","priceLabel":"$695 per week","numPhotos":15,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1614740455904,"relistedDate":1614740455904,"availableFrom":1614690000000},"address":{"street":"15 Pademelon Street","division":"Throsby","state":"ACT","postcode":"2914","coordinates":{"lat":-35.18384663,"lon":149.15797418}},"property":{"types":["TOWNHOUSE"],"beds":4,"baths":2,"cars":2,"eer":7.8,"size":0,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","DISHWASHER","HEATING_CENTRAL"]},"agency":{"id":584099,"type":"Agent","name":"Little Bird Properties","url":"https://www.allhomes.com.au/agency/little-bird-properties-584099/","logo":"https://images.allhomes.com.au/agent/logo/6bb477698073e6e803745fb53cdcd9e5_agency_t.jpg","agents":[{"name":"Heidi Russell","image":"https://images.allhomes.com.au/agent/staff/8816cbb738b7999e739955bb9be0cb18_110x110.jpg"}]}},{"listing":{"id":179295580,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/11-tyrrell-street-googong-nsw-2620","title":"Googong parklands close to everything","firstImage":"https://images.allhomes.com.au/property/photo/25936141c3c4f3c41a19dd7bf9311104_m.jpg","priceLabel":"$700 per week","numPhotos":8,"has3dTour":false,"hasVideo":false,"badges":{"new":true},"events":[],"publicVisibleDate":1615263080870,"relistedDate":1615263080870,"availableFrom":1616072400000},"address":{"street":"11 Tyrrell Street","division":"Googong","state":"NSW","postcode":"2620","coordinates":{"lat":-35.42384245,"lon":149.24297614}},"property":{"types":["HOUSE"],"beds":4,"baths":2,"cars":2,"size":0,"features":[]},"agency":{"id":3967,"type":"Agent","name":"Blackshaw Queanbeyan & Jerrabomberra","url":"https://www.allhomes.com.au/agency/blackshaw-queanbeyan-jerrabomberra-3967/","logo":"https://images.allhomes.com.au/agent/logo/65b5b76845237cf0ecf042f480f570cb_agency_t.jpg","agents":[{"name":"Queanbeyan Property Management","image":"https://images.allhomes.com.au/agent/staff/6e44ba6676ce261c54f92da11f033b74_110x110.jpg"}]}}]
     * bounds : {"from":{"lat":-35.15316441189498,"lon":148.99444959126413},"to":{"lat":-35.46945150475949,"lon":149.25047951750457}}
     * totalHits : 120
     * numPages : 3
     * query : {"page":1,"pageSize":50,"sort":{"criteria":"PRICE","order":"ASC"},"filters":{"localities":[{"type":"REGION","slug":"canberra-act"},{"type":"DISTRICT","slug":"greater-queanbeyan-queanbeyan-region-nsw"}],"beds":{"min":4,"max":4}},"results":{"type":"LIST"}}
     * suppressedResults : 10
     */


    private MetaBean meta;
    private BoundsBean bounds;
    private int totalHits;
    private int numPages;
    private QueryBean query;
    private int suppressedResults;
    private List<AllHomesEntitySearchResultsBean> searchResults;

    public static class MetaBean {
        /**
         * backend : lambda-listing-search
         * environment : live
         * version : 9890b48fa1b294a5263b8c22e7c67e4f36712baa
         */

        private String backend;
        private String environment;
        private String version;

        public String getBackend() {
            return backend;
        }

        public void setBackend(String backend) {
            this.backend = backend;
        }

        public String getEnvironment() {
            return environment;
        }

        public void setEnvironment(String environment) {
            this.environment = environment;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }

    public static class BoundsBean {
        /**
         * from : {"lat":-35.15316441189498,"lon":148.99444959126413}
         * to : {"lat":-35.46945150475949,"lon":149.25047951750457}
         */

        private FromBean from;
        private ToBean to;

        public FromBean getFrom() {
            return from;
        }

        public void setFrom(FromBean from) {
            this.from = from;
        }

        public ToBean getTo() {
            return to;
        }

        public void setTo(ToBean to) {
            this.to = to;
        }

        public static class FromBean {
            /**
             * lat : -35.15316441189498
             * lon : 148.99444959126413
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }

        public static class ToBean {
            /**
             * lat : -35.46945150475949
             * lon : 149.25047951750457
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class QueryBean {
        /**
         * page : 1
         * pageSize : 50
         * sort : {"criteria":"PRICE","order":"ASC"}
         * filters : {"localities":[{"type":"REGION","slug":"canberra-act"},{"type":"DISTRICT","slug":"greater-queanbeyan-queanbeyan-region-nsw"}],"beds":{"min":4,"max":4}}
         * results : {"type":"LIST"}
         */

        private int page;
        private int pageSize;
        private SortBean sort;
        private FiltersBean filters;
        private ResultsBean results;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public SortBean getSort() {
            return sort;
        }

        public void setSort(SortBean sort) {
            this.sort = sort;
        }

        public FiltersBean getFilters() {
            return filters;
        }

        public void setFilters(FiltersBean filters) {
            this.filters = filters;
        }

        public ResultsBean getResults() {
            return results;
        }

        public void setResults(ResultsBean results) {
            this.results = results;
        }

        public static class SortBean {
            /**
             * criteria : PRICE
             * order : ASC
             */

            private String criteria;
            private String order;

            public String getCriteria() {
                return criteria;
            }

            public void setCriteria(String criteria) {
                this.criteria = criteria;
            }

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }
        }

        public static class FiltersBean {
            /**
             * localities : [{"type":"REGION","slug":"canberra-act"},{"type":"DISTRICT","slug":"greater-queanbeyan-queanbeyan-region-nsw"}]
             * beds : {"min":4,"max":4}
             */

            private BedsBean beds;
            private List<LocalitiesBean> localities;

            public BedsBean getBeds() {
                return beds;
            }

            public void setBeds(BedsBean beds) {
                this.beds = beds;
            }

            public List<LocalitiesBean> getLocalities() {
                return localities;
            }

            public void setLocalities(List<LocalitiesBean> localities) {
                this.localities = localities;
            }

            public static class BedsBean {
                /**
                 * min : 4
                 * max : 4
                 */

                private int min;
                private int max;

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }
            }

            public static class LocalitiesBean {
                /**
                 * type : REGION
                 * slug : canberra-act
                 */

                private String type;
                private String slug;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getSlug() {
                    return slug;
                }

                public void setSlug(String slug) {
                    this.slug = slug;
                }
            }
        }

        public static class ResultsBean {
            /**
             * type : LIST
             */

            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public BoundsBean getBounds() {
        return bounds;
    }

    public void setBounds(BoundsBean bounds) {
        this.bounds = bounds;
    }

    public int getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public QueryBean getQuery() {
        return query;
    }

    public void setQuery(QueryBean query) {
        this.query = query;
    }

    public int getSuppressedResults() {
        return suppressedResults;
    }

    public void setSuppressedResults(int suppressedResults) {
        this.suppressedResults = suppressedResults;
    }

    public List<AllHomesEntitySearchResultsBean> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<AllHomesEntitySearchResultsBean> searchResults) {
        this.searchResults = searchResults;
    }
}
