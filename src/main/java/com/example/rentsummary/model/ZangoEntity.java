package com.example.rentsummary.model;

import java.util.List;

public class ZangoEntity {
    /**
     * id : 39335
     * status : current
     * property_class : rental
     * listing_type : lease
     * created : 2021-03-19T10:46:33.808431+11:00
     * updated : 2021-03-25T11:16:47.846604+11:00
     * priceView : $475 Per Week
     * address_postcode : 2612
     * address_suburb : TURNER
     * address_suburb_display : true
     * address_state : ACT
     * address_region : North Canberra
     * location : {"type":"Point","coordinates":[149.1293139,-35.2674017]}
     * headline : Inner City Sanctuary
     * bedrooms : 1
     * bathrooms : 1
     * parking : 1
     * price : 475
     * price_display : true
     * underOffer : false
     * authority : sale
     * auction_date : null
     * auctionVenue : null
     * rent : null
     * rent_period : weekly
     * dateAvailable : 2021-04-22T00:00:00+10:00
     * commercialRent : 0
     * commercialRent_period : annual
     * carSpaces : 0
     * parkingComments :
     * area : 1045.00
     * area_unit : squareMeter
     * address_display_string : 3/11 Forbes Street TURNER, ACT 2612
     * address_street_string : 3/11 Forbes Street
     * images : [{"image":{"image_480_270":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-480x270-70.jpg","image_320_240":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-320x240-70.jpg","image_1200_680":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-1200x680-70.jpg","image_800_600":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-800x600-70.jpg"}},{"image":{"image_480_270":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643142217-crop-c0-5__0-5-480x270-70.jpg","image_320_240":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643142217-crop-c0-5__0-5-320x240-70.jpg","image_1200_680":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643142217-crop-c0-5__0-5-1200x680-70.jpg","image_800_600":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643142217-crop-c0-5__0-5-800x600-70.jpg"}},{"image":{"image_480_270":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643786691-crop-c0-5__0-5-480x270-70.jpg","image_320_240":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643786691-crop-c0-5__0-5-320x240-70.jpg","image_1200_680":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643786691-crop-c0-5__0-5-1200x680-70.jpg","image_800_600":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643786691-crop-c0-5__0-5-800x600-70.jpg"}},{"image":{"image_480_270":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001644446586-crop-c0-5__0-5-480x270-70.jpg","image_320_240":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001644446586-crop-c0-5__0-5-320x240-70.jpg","image_1200_680":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001644446586-crop-c0-5__0-5-1200x680-70.jpg","image_800_600":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001644446586-crop-c0-5__0-5-800x600-70.jpg"}},{"image":{"image_480_270":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645110773-crop-c0-5__0-5-480x270-70.jpg","image_320_240":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645110773-crop-c0-5__0-5-320x240-70.jpg","image_1200_680":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645110773-crop-c0-5__0-5-1200x680-70.jpg","image_800_600":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645110773-crop-c0-5__0-5-800x600-70.jpg"}},{"image":{"image_480_270":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645982124-crop-c0-5__0-5-480x270-70.jpg","image_320_240":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645982124-crop-c0-5__0-5-320x240-70.jpg","image_1200_680":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645982124-crop-c0-5__0-5-1200x680-70.jpg","image_800_600":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645982124-crop-c0-5__0-5-800x600-70.jpg"}},{"image":{"image_480_270":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001646887398-crop-c0-5__0-5-480x270-70.jpg","image_320_240":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001646887398-crop-c0-5__0-5-320x240-70.jpg","image_1200_680":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001646887398-crop-c0-5__0-5-1200x680-70.jpg","image_800_600":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001646887398-crop-c0-5__0-5-800x600-70.jpg"}}]
     * agents : [{"id":1774,"title":"Kerry Robinson","name_short":"","job_title":"Leasing Consultant","results_image":"https://zango.com.au/cms-images/2F1zTYZIqqrIQvw6OjH_qkvGf8E=/129831/fill-150x176/","profile_image":"https://zango.com.au/cms-images/pTZgKJDuEtZ_a3GqdBA21xcWcO4=/129831/original/","phone":"0478 036 220","office_phone":"02 6123 8000","slug":"kerry-robinson-2","live":true,"private_lister":false,"rei_membership":null,"rei_member_number":null}]
     * office : {"title":"McGrath North Canberra","office_name":"McGrath North Canberra","logo":"https://zango.com.au/cms-images/rHgmSo4twxzg_PSwudtuBPTqHFE=/36160/width-230/","logo_medium":"https://zango.com.au/cms-images/VZrzQMdj9SEUnMxiYlDGZKLViY0=/36160/width-600/","branding_colour":"#FFFFFF","branding_font_colour":"#000000","slug":"mcgrath-north-canberra","address":"4/3 Cape Street","suburb":"DICKSON","postcode":"2602","state":"ACT","id":410,"show_1form":false,"show_1form_url":null,"sorted_services_id":"","inspect_real_estate_id":"McGrathBelconnen","inspect_real_estate_sale_id":"","inspect_real_estate_apply_id":"","snug_office_id":"","snug_apply_now_enabled":false,"snug_book_inspections_enabled_sale":false,"snug_book_inspections_enabled_rent":false,"payment_terms":0,"phone":"02 6123 8000"}
     * url_path : /rent/3-11-forbes-street-turner-act-2612-39335/
     * category : Unit
     * slug : 3-11-forbes-street-turner-act-2612
     * landblock_slug : 311-forbes-street-turner-act-2612
     * inspections : []
     * buildingDetails_energyRating : 6.00
     * last_price_change : null
     * development : null
     * soldDetails_price : null
     * soldDetails_date : null
     * leasedDetails_price : null
     * stamp_duty : 5.70
     * development_show_full_result : false
     * has_live_auction : false
     * has_virtual_tour : false
     * first_go_live : 2021-03-19T11:01:32.243848+11:00
     * has_new_price : false
     * body_corporate_fees :
     * suburb_aliases : ["Turner"]
     * is_private_listing : false
     */

    private int id;
    private String status;
    private String property_class;
    private String listing_type;
    private String created;
    private String updated;
    private String priceView;
    private String address_postcode;
    private String address_suburb;
    private boolean address_suburb_display;
    private String address_state;
    private String address_region;
    private LocationBean location;
    private String headline;
    private int bedrooms;
    private int bathrooms;
    private int parking;
    private int price;
    private boolean price_display;
    private boolean underOffer;
    private String authority;
    private Object auction_date;
    private Object auctionVenue;
    private Object rent;
    private String rent_period;
    private String dateAvailable;
    private int commercialRent;
    private String commercialRent_period;
    private int carSpaces;
    private String parkingComments;
    private String area;
    private String area_unit;
    private String address_display_string;
    private String address_street_string;
    private OfficeBean office;
    private String url_path;
    private String category;
    private String slug;
    private String landblock_slug;
    private String buildingDetails_energyRating;
    private Object last_price_change;
    private Object development;
    private Object soldDetails_price;
    private Object soldDetails_date;
    private Object leasedDetails_price;
    private String stamp_duty;
    private boolean development_show_full_result;
    private boolean has_live_auction;
    private boolean has_virtual_tour;
    private String first_go_live;
    private boolean has_new_price;
    private String body_corporate_fees;
    private boolean is_private_listing;
    private List<ImagesBean> images;
    private List<AgentsBean> agents;
    private List<?> inspections;
    private List<String> suburb_aliases;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProperty_class() {
        return property_class;
    }

    public void setProperty_class(String property_class) {
        this.property_class = property_class;
    }

    public String getListing_type() {
        return listing_type;
    }

    public void setListing_type(String listing_type) {
        this.listing_type = listing_type;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getPriceView() {
        return priceView;
    }

    public void setPriceView(String priceView) {
        this.priceView = priceView;
    }

    public String getAddress_postcode() {
        return address_postcode;
    }

    public void setAddress_postcode(String address_postcode) {
        this.address_postcode = address_postcode;
    }

    public String getAddress_suburb() {
        return address_suburb;
    }

    public void setAddress_suburb(String address_suburb) {
        this.address_suburb = address_suburb;
    }

    public boolean isAddress_suburb_display() {
        return address_suburb_display;
    }

    public void setAddress_suburb_display(boolean address_suburb_display) {
        this.address_suburb_display = address_suburb_display;
    }

    public String getAddress_state() {
        return address_state;
    }

    public void setAddress_state(String address_state) {
        this.address_state = address_state;
    }

    public String getAddress_region() {
        return address_region;
    }

    public void setAddress_region(String address_region) {
        this.address_region = address_region;
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getParking() {
        return parking;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isPrice_display() {
        return price_display;
    }

    public void setPrice_display(boolean price_display) {
        this.price_display = price_display;
    }

    public boolean isUnderOffer() {
        return underOffer;
    }

    public void setUnderOffer(boolean underOffer) {
        this.underOffer = underOffer;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Object getAuction_date() {
        return auction_date;
    }

    public void setAuction_date(Object auction_date) {
        this.auction_date = auction_date;
    }

    public Object getAuctionVenue() {
        return auctionVenue;
    }

    public void setAuctionVenue(Object auctionVenue) {
        this.auctionVenue = auctionVenue;
    }

    public Object getRent() {
        return rent;
    }

    public void setRent(Object rent) {
        this.rent = rent;
    }

    public String getRent_period() {
        return rent_period;
    }

    public void setRent_period(String rent_period) {
        this.rent_period = rent_period;
    }

    public String getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(String dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public int getCommercialRent() {
        return commercialRent;
    }

    public void setCommercialRent(int commercialRent) {
        this.commercialRent = commercialRent;
    }

    public String getCommercialRent_period() {
        return commercialRent_period;
    }

    public void setCommercialRent_period(String commercialRent_period) {
        this.commercialRent_period = commercialRent_period;
    }

    public int getCarSpaces() {
        return carSpaces;
    }

    public void setCarSpaces(int carSpaces) {
        this.carSpaces = carSpaces;
    }

    public String getParkingComments() {
        return parkingComments;
    }

    public void setParkingComments(String parkingComments) {
        this.parkingComments = parkingComments;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea_unit() {
        return area_unit;
    }

    public void setArea_unit(String area_unit) {
        this.area_unit = area_unit;
    }

    public String getAddress_display_string() {
        return address_display_string;
    }

    public void setAddress_display_string(String address_display_string) {
        this.address_display_string = address_display_string;
    }

    public String getAddress_street_string() {
        return address_street_string;
    }

    public void setAddress_street_string(String address_street_string) {
        this.address_street_string = address_street_string;
    }

    public OfficeBean getOffice() {
        return office;
    }

    public void setOffice(OfficeBean office) {
        this.office = office;
    }

    public String getUrl_path() {
        return url_path;
    }

    public void setUrl_path(String url_path) {
        this.url_path = url_path;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getLandblock_slug() {
        return landblock_slug;
    }

    public void setLandblock_slug(String landblock_slug) {
        this.landblock_slug = landblock_slug;
    }

    public String getBuildingDetails_energyRating() {
        return buildingDetails_energyRating;
    }

    public void setBuildingDetails_energyRating(String buildingDetails_energyRating) {
        this.buildingDetails_energyRating = buildingDetails_energyRating;
    }

    public Object getLast_price_change() {
        return last_price_change;
    }

    public void setLast_price_change(Object last_price_change) {
        this.last_price_change = last_price_change;
    }

    public Object getDevelopment() {
        return development;
    }

    public void setDevelopment(Object development) {
        this.development = development;
    }

    public Object getSoldDetails_price() {
        return soldDetails_price;
    }

    public void setSoldDetails_price(Object soldDetails_price) {
        this.soldDetails_price = soldDetails_price;
    }

    public Object getSoldDetails_date() {
        return soldDetails_date;
    }

    public void setSoldDetails_date(Object soldDetails_date) {
        this.soldDetails_date = soldDetails_date;
    }

    public Object getLeasedDetails_price() {
        return leasedDetails_price;
    }

    public void setLeasedDetails_price(Object leasedDetails_price) {
        this.leasedDetails_price = leasedDetails_price;
    }

    public String getStamp_duty() {
        return stamp_duty;
    }

    public void setStamp_duty(String stamp_duty) {
        this.stamp_duty = stamp_duty;
    }

    public boolean isDevelopment_show_full_result() {
        return development_show_full_result;
    }

    public void setDevelopment_show_full_result(boolean development_show_full_result) {
        this.development_show_full_result = development_show_full_result;
    }

    public boolean isHas_live_auction() {
        return has_live_auction;
    }

    public void setHas_live_auction(boolean has_live_auction) {
        this.has_live_auction = has_live_auction;
    }

    public boolean isHas_virtual_tour() {
        return has_virtual_tour;
    }

    public void setHas_virtual_tour(boolean has_virtual_tour) {
        this.has_virtual_tour = has_virtual_tour;
    }

    public String getFirst_go_live() {
        return first_go_live;
    }

    public void setFirst_go_live(String first_go_live) {
        this.first_go_live = first_go_live;
    }

    public boolean isHas_new_price() {
        return has_new_price;
    }

    public void setHas_new_price(boolean has_new_price) {
        this.has_new_price = has_new_price;
    }

    public String getBody_corporate_fees() {
        return body_corporate_fees;
    }

    public void setBody_corporate_fees(String body_corporate_fees) {
        this.body_corporate_fees = body_corporate_fees;
    }

    public boolean isIs_private_listing() {
        return is_private_listing;
    }

    public void setIs_private_listing(boolean is_private_listing) {
        this.is_private_listing = is_private_listing;
    }

    public List<ImagesBean> getImages() {
        return images;
    }

    public void setImages(List<ImagesBean> images) {
        this.images = images;
    }

    public List<AgentsBean> getAgents() {
        return agents;
    }

    public void setAgents(List<AgentsBean> agents) {
        this.agents = agents;
    }

    public List<?> getInspections() {
        return inspections;
    }

    public void setInspections(List<?> inspections) {
        this.inspections = inspections;
    }

    public List<String> getSuburb_aliases() {
        return suburb_aliases;
    }

    public void setSuburb_aliases(List<String> suburb_aliases) {
        this.suburb_aliases = suburb_aliases;
    }

    public static class LocationBean {
        /**
         * type : Point
         * coordinates : [149.1293139,-35.2674017]
         */

        private String type;
        private List<Double> coordinates;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<Double> getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(List<Double> coordinates) {
            this.coordinates = coordinates;
        }
    }

    public static class OfficeBean {
        /**
         * title : McGrath North Canberra
         * office_name : McGrath North Canberra
         * logo : https://zango.com.au/cms-images/rHgmSo4twxzg_PSwudtuBPTqHFE=/36160/width-230/
         * logo_medium : https://zango.com.au/cms-images/VZrzQMdj9SEUnMxiYlDGZKLViY0=/36160/width-600/
         * branding_colour : #FFFFFF
         * branding_font_colour : #000000
         * slug : mcgrath-north-canberra
         * address : 4/3 Cape Street
         * suburb : DICKSON
         * postcode : 2602
         * state : ACT
         * id : 410
         * show_1form : false
         * show_1form_url : null
         * sorted_services_id :
         * inspect_real_estate_id : McGrathBelconnen
         * inspect_real_estate_sale_id :
         * inspect_real_estate_apply_id :
         * snug_office_id :
         * snug_apply_now_enabled : false
         * snug_book_inspections_enabled_sale : false
         * snug_book_inspections_enabled_rent : false
         * payment_terms : 0
         * phone : 02 6123 8000
         */

        private String title;
        private String office_name;
        private String logo;
        private String logo_medium;
        private String branding_colour;
        private String branding_font_colour;
        private String slug;
        private String address;
        private String suburb;
        private String postcode;
        private String state;
        private int id;
        private boolean show_1form;
        private Object show_1form_url;
        private String sorted_services_id;
        private String inspect_real_estate_id;
        private String inspect_real_estate_sale_id;
        private String inspect_real_estate_apply_id;
        private String snug_office_id;
        private boolean snug_apply_now_enabled;
        private boolean snug_book_inspections_enabled_sale;
        private boolean snug_book_inspections_enabled_rent;
        private int payment_terms;
        private String phone;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOffice_name() {
            return office_name;
        }

        public void setOffice_name(String office_name) {
            this.office_name = office_name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getLogo_medium() {
            return logo_medium;
        }

        public void setLogo_medium(String logo_medium) {
            this.logo_medium = logo_medium;
        }

        public String getBranding_colour() {
            return branding_colour;
        }

        public void setBranding_colour(String branding_colour) {
            this.branding_colour = branding_colour;
        }

        public String getBranding_font_colour() {
            return branding_font_colour;
        }

        public void setBranding_font_colour(String branding_font_colour) {
            this.branding_font_colour = branding_font_colour;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSuburb() {
            return suburb;
        }

        public void setSuburb(String suburb) {
            this.suburb = suburb;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isShow_1form() {
            return show_1form;
        }

        public void setShow_1form(boolean show_1form) {
            this.show_1form = show_1form;
        }

        public Object getShow_1form_url() {
            return show_1form_url;
        }

        public void setShow_1form_url(Object show_1form_url) {
            this.show_1form_url = show_1form_url;
        }

        public String getSorted_services_id() {
            return sorted_services_id;
        }

        public void setSorted_services_id(String sorted_services_id) {
            this.sorted_services_id = sorted_services_id;
        }

        public String getInspect_real_estate_id() {
            return inspect_real_estate_id;
        }

        public void setInspect_real_estate_id(String inspect_real_estate_id) {
            this.inspect_real_estate_id = inspect_real_estate_id;
        }

        public String getInspect_real_estate_sale_id() {
            return inspect_real_estate_sale_id;
        }

        public void setInspect_real_estate_sale_id(String inspect_real_estate_sale_id) {
            this.inspect_real_estate_sale_id = inspect_real_estate_sale_id;
        }

        public String getInspect_real_estate_apply_id() {
            return inspect_real_estate_apply_id;
        }

        public void setInspect_real_estate_apply_id(String inspect_real_estate_apply_id) {
            this.inspect_real_estate_apply_id = inspect_real_estate_apply_id;
        }

        public String getSnug_office_id() {
            return snug_office_id;
        }

        public void setSnug_office_id(String snug_office_id) {
            this.snug_office_id = snug_office_id;
        }

        public boolean isSnug_apply_now_enabled() {
            return snug_apply_now_enabled;
        }

        public void setSnug_apply_now_enabled(boolean snug_apply_now_enabled) {
            this.snug_apply_now_enabled = snug_apply_now_enabled;
        }

        public boolean isSnug_book_inspections_enabled_sale() {
            return snug_book_inspections_enabled_sale;
        }

        public void setSnug_book_inspections_enabled_sale(boolean snug_book_inspections_enabled_sale) {
            this.snug_book_inspections_enabled_sale = snug_book_inspections_enabled_sale;
        }

        public boolean isSnug_book_inspections_enabled_rent() {
            return snug_book_inspections_enabled_rent;
        }

        public void setSnug_book_inspections_enabled_rent(boolean snug_book_inspections_enabled_rent) {
            this.snug_book_inspections_enabled_rent = snug_book_inspections_enabled_rent;
        }

        public int getPayment_terms() {
            return payment_terms;
        }

        public void setPayment_terms(int payment_terms) {
            this.payment_terms = payment_terms;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public static class ImagesBean {
        /**
         * image : {"image_480_270":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-480x270-70.jpg","image_320_240":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-320x240-70.jpg","image_1200_680":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-1200x680-70.jpg","image_800_600":"https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-800x600-70.jpg"}
         */

        private ImageBean image;

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public static class ImageBean {
            /**
             * image_480_270 : https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-480x270-70.jpg
             * image_320_240 : https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-320x240-70.jpg
             * image_1200_680 : https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-1200x680-70.jpg
             * image_800_600 : https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-800x600-70.jpg
             */

            private String image_480_270;
            private String image_320_240;
            private String image_1200_680;
            private String image_800_600;

            public String getImage_480_270() {
                return image_480_270;
            }

            public void setImage_480_270(String image_480_270) {
                this.image_480_270 = image_480_270;
            }

            public String getImage_320_240() {
                return image_320_240;
            }

            public void setImage_320_240(String image_320_240) {
                this.image_320_240 = image_320_240;
            }

            public String getImage_1200_680() {
                return image_1200_680;
            }

            public void setImage_1200_680(String image_1200_680) {
                this.image_1200_680 = image_1200_680;
            }

            public String getImage_800_600() {
                return image_800_600;
            }

            public void setImage_800_600(String image_800_600) {
                this.image_800_600 = image_800_600;
            }
        }
    }

    public static class AgentsBean {
        /**
         * id : 1774
         * title : Kerry Robinson
         * name_short :
         * job_title : Leasing Consultant
         * results_image : https://zango.com.au/cms-images/2F1zTYZIqqrIQvw6OjH_qkvGf8E=/129831/fill-150x176/
         * profile_image : https://zango.com.au/cms-images/pTZgKJDuEtZ_a3GqdBA21xcWcO4=/129831/original/
         * phone : 0478 036 220
         * office_phone : 02 6123 8000
         * slug : kerry-robinson-2
         * live : true
         * private_lister : false
         * rei_membership : null
         * rei_member_number : null
         */

        private int id;
        private String title;
        private String name_short;
        private String job_title;
        private String results_image;
        private String profile_image;
        private String phone;
        private String office_phone;
        private String slug;
        private boolean live;
        private boolean private_lister;
        private Object rei_membership;
        private Object rei_member_number;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getName_short() {
            return name_short;
        }

        public void setName_short(String name_short) {
            this.name_short = name_short;
        }

        public String getJob_title() {
            return job_title;
        }

        public void setJob_title(String job_title) {
            this.job_title = job_title;
        }

        public String getResults_image() {
            return results_image;
        }

        public void setResults_image(String results_image) {
            this.results_image = results_image;
        }

        public String getProfile_image() {
            return profile_image;
        }

        public void setProfile_image(String profile_image) {
            this.profile_image = profile_image;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getOffice_phone() {
            return office_phone;
        }

        public void setOffice_phone(String office_phone) {
            this.office_phone = office_phone;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public boolean isLive() {
            return live;
        }

        public void setLive(boolean live) {
            this.live = live;
        }

        public boolean isPrivate_lister() {
            return private_lister;
        }

        public void setPrivate_lister(boolean private_lister) {
            this.private_lister = private_lister;
        }

        public Object getRei_membership() {
            return rei_membership;
        }

        public void setRei_membership(Object rei_membership) {
            this.rei_membership = rei_membership;
        }

        public Object getRei_member_number() {
            return rei_member_number;
        }

        public void setRei_member_number(Object rei_member_number) {
            this.rei_member_number = rei_member_number;
        }
    }
//    {
//        "id": 39335,
//            "status": "current",
//            "property_class": "rental",
//            "listing_type": "lease",
//            "created": "2021-03-19T10:46:33.808431+11:00",
//            "updated": "2021-03-25T11:16:47.846604+11:00",
//            "priceView": "$475 Per Week",
//            "address_postcode": "2612",
//            "address_suburb": "TURNER",
//            "address_suburb_display": true,
//            "address_state": "ACT",
//            "address_region": "North Canberra",
//            "location": {
//        "type": "Point",
//                "coordinates": [
//        149.1293139,
//                -35.2674017
//          ]
//    },
//        "headline": "Inner City Sanctuary",
//            "bedrooms": 1,
//            "bathrooms": 1,
//            "parking": 1,
//            "price": 475,
//            "price_display": true,
//            "underOffer": false,
//            "authority": "sale",
//            "auction_date": null,
//            "auctionVenue": null,
//            "rent": null,
//            "rent_period": "weekly",
//            "dateAvailable": "2021-04-22T00:00:00+10:00",
//            "commercialRent": 0,
//            "commercialRent_period": "annual",
//            "carSpaces": 0,
//            "parkingComments": "",
//            "area": "1045.00",
//            "area_unit": "squareMeter",
//            "address_display_string": "3/11 Forbes Street TURNER, ACT 2612",
//            "address_street_string": "3/11 Forbes Street",
//            "images": [
//        {
//            "image": {
//            "image_480_270": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-480x270-70.jpg",
//                    "image_320_240": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-320x240-70.jpg",
//                    "image_1200_680": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-1200x680-70.jpg",
//                    "image_800_600": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001642324969-crop-c0-5__0-5-800x600-70.jpg"
//        }
//        },
//        {
//            "image": {
//            "image_480_270": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643142217-crop-c0-5__0-5-480x270-70.jpg",
//                    "image_320_240": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643142217-crop-c0-5__0-5-320x240-70.jpg",
//                    "image_1200_680": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643142217-crop-c0-5__0-5-1200x680-70.jpg",
//                    "image_800_600": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643142217-crop-c0-5__0-5-800x600-70.jpg"
//        }
//        },
//        {
//            "image": {
//            "image_480_270": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643786691-crop-c0-5__0-5-480x270-70.jpg",
//                    "image_320_240": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643786691-crop-c0-5__0-5-320x240-70.jpg",
//                    "image_1200_680": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643786691-crop-c0-5__0-5-1200x680-70.jpg",
//                    "image_800_600": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001643786691-crop-c0-5__0-5-800x600-70.jpg"
//        }
//        },
//        {
//            "image": {
//            "image_480_270": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001644446586-crop-c0-5__0-5-480x270-70.jpg",
//                    "image_320_240": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001644446586-crop-c0-5__0-5-320x240-70.jpg",
//                    "image_1200_680": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001644446586-crop-c0-5__0-5-1200x680-70.jpg",
//                    "image_800_600": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001644446586-crop-c0-5__0-5-800x600-70.jpg"
//        }
//        },
//        {
//            "image": {
//            "image_480_270": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645110773-crop-c0-5__0-5-480x270-70.jpg",
//                    "image_320_240": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645110773-crop-c0-5__0-5-320x240-70.jpg",
//                    "image_1200_680": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645110773-crop-c0-5__0-5-1200x680-70.jpg",
//                    "image_800_600": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645110773-crop-c0-5__0-5-800x600-70.jpg"
//        }
//        },
//        {
//            "image": {
//            "image_480_270": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645982124-crop-c0-5__0-5-480x270-70.jpg",
//                    "image_320_240": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645982124-crop-c0-5__0-5-320x240-70.jpg",
//                    "image_1200_680": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645982124-crop-c0-5__0-5-1200x680-70.jpg",
//                    "image_800_600": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001645982124-crop-c0-5__0-5-800x600-70.jpg"
//        }
//        },
//        {
//            "image": {
//            "image_480_270": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001646887398-crop-c0-5__0-5-480x270-70.jpg",
//                    "image_320_240": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001646887398-crop-c0-5__0-5-320x240-70.jpg",
//                    "image_1200_680": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001646887398-crop-c0-5__0-5-1200x680-70.jpg",
//                    "image_800_600": "https://d2t3vhau9g43uy.cloudfront.net/media/__sized__/properties/images/3-11-forbes-street-turner-act-2612-39335-image-0-20210325001646887398-crop-c0-5__0-5-800x600-70.jpg"
//        }
//        }
//        ],
//        "agents": [
//        {
//            "id": 1774,
//                "title": "Kerry Robinson",
//                "name_short": "",
//                "job_title": "Leasing Consultant",
//                "results_image": "https://zango.com.au/cms-images/2F1zTYZIqqrIQvw6OjH_qkvGf8E=/129831/fill-150x176/",
//                "profile_image": "https://zango.com.au/cms-images/pTZgKJDuEtZ_a3GqdBA21xcWcO4=/129831/original/",
//                "phone": "0478 036 220",
//                "office_phone": "02 6123 8000",
//                "slug": "kerry-robinson-2",
//                "live": true,
//                "private_lister": false,
//                "rei_membership": null,
//                "rei_member_number": null
//        }
//        ],
//        "office": {
//        "title": "McGrath North Canberra",
//                "office_name": "McGrath North Canberra",
//                "logo": "https://zango.com.au/cms-images/rHgmSo4twxzg_PSwudtuBPTqHFE=/36160/width-230/",
//                "logo_medium": "https://zango.com.au/cms-images/VZrzQMdj9SEUnMxiYlDGZKLViY0=/36160/width-600/",
//                "branding_colour": "#FFFFFF",
//                "branding_font_colour": "#000000",
//                "slug": "mcgrath-north-canberra",
//                "address": "4/3 Cape Street",
//                "suburb": "DICKSON",
//                "postcode": "2602",
//                "state": "ACT",
//                "id": 410,
//                "show_1form": false,
//                "show_1form_url": null,
//                "sorted_services_id": "",
//                "inspect_real_estate_id": "McGrathBelconnen",
//                "inspect_real_estate_sale_id": "",
//                "inspect_real_estate_apply_id": "",
//                "snug_office_id": "",
//                "snug_apply_now_enabled": false,
//                "snug_book_inspections_enabled_sale": false,
//                "snug_book_inspections_enabled_rent": false,
//                "payment_terms": 0,
//                "phone": "02 6123 8000"
//    },
//        "url_path": "/rent/3-11-forbes-street-turner-act-2612-39335/",
//            "category": "Unit",
//            "slug": "3-11-forbes-street-turner-act-2612",
//            "landblock_slug": "311-forbes-street-turner-act-2612",
//            "inspections": [],
//        "buildingDetails_energyRating": "6.00",
//            "last_price_change": null,
//            "development": null,
//            "soldDetails_price": null,
//            "soldDetails_date": null,
//            "leasedDetails_price": null,
//            "stamp_duty": "5.70",
//            "development_show_full_result": false,
//            "has_live_auction": false,
//            "has_virtual_tour": false,
//            "first_go_live": "2021-03-19T11:01:32.243848+11:00",
//            "has_new_price": false,
//            "body_corporate_fees": "",
//            "suburb_aliases": [
//        "Turner"
//        ],
//        "is_private_listing": false
//    }


}
