package com.example.rentsummary.model;

import java.util.List;

public class AllHomesEntitySearchResultsBean {

    /**
     * listing : {"id":173455572,"type":"RENTAL_RESIDENTIAL","url":"https://www.allhomes.com.au/chifley-act-2606?tid=173455572","title":"ROOMS AVAILABLE IN GREAT LOCATION","firstImage":"https://images.allhomes.com.au/property/photo/85f14360974a6ffcd346deff5d801c26_m.jpg","priceLabel":"$160 per week","numPhotos":3,"has3dTour":false,"hasVideo":false,"badges":{},"events":[],"publicVisibleDate":1487312513797,"relistedDate":1487312513797}
     * address : {"suppression":"NAMEANDNUMBER","street":"(no street name provided)","division":"Chifley","state":"ACT","postcode":"2606","coordinates":{"lat":-35.3568281,"lon":149.075456}}
     * property : {"types":["HOUSE"],"beds":4,"baths":2,"cars":0,"size":764,"features":["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","CEILING_FANS","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","PETS_ALLOWED","STUDY"]}
     * agency : {"id":65555,"type":"PrivateLister","name":"Private Lister"}
     */

    private ListingBean listing;
    private AddressBean address;
    private PropertyBean property;
    private AgencyBean agency;

    @Override
    public String toString() {
        return "AllHomesEntitySearchResultsBean{" +
                "listing=" + listing +
                ", address=" + address +
                ", property=" + property +
                ", agency=" + agency +
                '}';
    }

    public ListingBean getListing() {
        return listing;
    }

    public void setListing(ListingBean listing) {
        this.listing = listing;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public PropertyBean getProperty() {
        return property;
    }

    public void setProperty(PropertyBean property) {
        this.property = property;
    }

    public AgencyBean getAgency() {
        return agency;
    }

    public void setAgency(AgencyBean agency) {
        this.agency = agency;
    }

    public static class ListingBean {
        /**
         * id : 173455572
         * type : RENTAL_RESIDENTIAL
         * url : https://www.allhomes.com.au/chifley-act-2606?tid=173455572
         * title : ROOMS AVAILABLE IN GREAT LOCATION
         * firstImage : https://images.allhomes.com.au/property/photo/85f14360974a6ffcd346deff5d801c26_m.jpg
         * priceLabel : $160 per week
         * numPhotos : 3
         * has3dTour : false
         * hasVideo : false
         * badges : {}
         * events : []
         * publicVisibleDate : 1487312513797
         * relistedDate : 1487312513797
         */

        private int id;
        private String type;
        private String url;
        private String title;
        private String firstImage;
        private String priceLabel;
        private int numPhotos;
        private boolean has3dTour;
        private boolean hasVideo;
        private BadgesBean badges;
        private long publicVisibleDate;
        private long relistedDate;
        private List<?> events;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirstImage() {
            return firstImage;
        }

        public void setFirstImage(String firstImage) {
            this.firstImage = firstImage;
        }

        public String getPriceLabel() {
            return priceLabel;
        }

        public void setPriceLabel(String priceLabel) {
            this.priceLabel = priceLabel;
        }

        public int getNumPhotos() {
            return numPhotos;
        }

        public void setNumPhotos(int numPhotos) {
            this.numPhotos = numPhotos;
        }

        public boolean isHas3dTour() {
            return has3dTour;
        }

        public void setHas3dTour(boolean has3dTour) {
            this.has3dTour = has3dTour;
        }

        public boolean isHasVideo() {
            return hasVideo;
        }

        public void setHasVideo(boolean hasVideo) {
            this.hasVideo = hasVideo;
        }

        public BadgesBean getBadges() {
            return badges;
        }

        public void setBadges(BadgesBean badges) {
            this.badges = badges;
        }

        public long getPublicVisibleDate() {
            return publicVisibleDate;
        }

        public void setPublicVisibleDate(long publicVisibleDate) {
            this.publicVisibleDate = publicVisibleDate;
        }

        public long getRelistedDate() {
            return relistedDate;
        }

        public void setRelistedDate(long relistedDate) {
            this.relistedDate = relistedDate;
        }

        public List<?> getEvents() {
            return events;
        }

        public void setEvents(List<?> events) {
            this.events = events;
        }

        public static class BadgesBean {
        }
    }

    public static class AddressBean {
        /**
         * suppression : NAMEANDNUMBER
         * street : (no street name provided)
         * division : Chifley
         * state : ACT
         * postcode : 2606
         * coordinates : {"lat":-35.3568281,"lon":149.075456}
         */

        private String suppression;
        private String street;
        private String division;
        private String state;
        private String postcode;
        private CoordinatesBean coordinates;

        public String getSuppression() {
            return suppression;
        }

        public void setSuppression(String suppression) {
            this.suppression = suppression;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public CoordinatesBean getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(CoordinatesBean coordinates) {
            this.coordinates = coordinates;
        }

        public static class CoordinatesBean {
            /**
             * lat : -35.3568281
             * lon : 149.075456
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

    public static class PropertyBean {
        /**
         * types : ["HOUSE"]
         * beds : 4
         * baths : 2
         * cars : 0
         * size : 764
         * features : ["AIR_CONDITIONING","AIR_CONDITIONING_OTHER","CEILING_FANS","DINING_ROOM","ENCLOSED_BACKYARD","FAMILY_ROOM","PETS_ALLOWED","STUDY"]
         */

        private int beds;
        private int baths;
        private int cars;
        private int size;
        private List<String> types;
        private List<String> features;

        public int getBeds() {
            return beds;
        }

        public void setBeds(int beds) {
            this.beds = beds;
        }

        public int getBaths() {
            return baths;
        }

        public void setBaths(int baths) {
            this.baths = baths;
        }

        public int getCars() {
            return cars;
        }

        public void setCars(int cars) {
            this.cars = cars;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public List<String> getFeatures() {
            return features;
        }

        public void setFeatures(List<String> features) {
            this.features = features;
        }
    }

    public static class AgencyBean {
        /**
         * id : 65555
         * type : PrivateLister
         * name : Private Lister
         */

        private int id;
        private String type;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
