package com.example.rentsummary.model;

import java.util.List;

public class RentRequestParaForAllhomes {

    /**
     * page : 1
     * pageSize : 50
     * sort : {"criteria":"PRICE","order":"ASC"}
     * filters : {"localities":[{"type":"REGION","slug":"canberra-act"},{"type":"DISTRICT","slug":"greater-queanbeyan-queanbeyan-region-nsw"}],"propertyTypes":["HOUSE"],"price":{"min":50,"max":150},"beds":{"min":1,"max":3},"baths":{"min":1,"max":3},"parking":{"min":1,"max":3},"blockSize":{"min":100,"max":1000},"keywords":"street","availability":{"min":"2021-03-02","max":null}}
     * results : {"type":"LIST"}
     */

    private Integer page=1;
    private Integer pageSize=50;
    private SortBean sort;
    private FiltersBean filters;
    private ResultsBean results;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
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

        private String criteria="PRICE";
        private String order="ASC";

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
         * propertyTypes : ["HOUSE"]
         * price : {"min":50,"max":150}
         * beds : {"min":1,"max":3}
         * baths : {"min":1,"max":3}
         * parking : {"min":1,"max":3}
         * blockSize : {"min":100,"max":1000}
         * keywords : street
         * availability : {"min":"2021-03-02","max":null}
         */

        private PriceBean price;
        private BedsBean beds;
        private BathsBean baths;
        private ParkingBean parking;
        private BlockSizeBean blockSize;
        private String keywords;
        private AvailabilityBean availability;
        private List<LocalitiesBean> localities;
        private List<String> propertyTypes;

        public PriceBean getPrice() {
            return price;
        }

        public void setPrice(PriceBean price) {
            this.price = price;
        }

        public BedsBean getBeds() {
            return beds;
        }

        public void setBeds(BedsBean beds) {
            this.beds = beds;
        }

        public BathsBean getBaths() {
            return baths;
        }

        public void setBaths(BathsBean baths) {
            this.baths = baths;
        }

        public ParkingBean getParking() {
            return parking;
        }

        public void setParking(ParkingBean parking) {
            this.parking = parking;
        }

        public BlockSizeBean getBlockSize() {
            return blockSize;
        }

        public void setBlockSize(BlockSizeBean blockSize) {
            this.blockSize = blockSize;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public AvailabilityBean getAvailability() {
            return availability;
        }

        public void setAvailability(AvailabilityBean availability) {
            this.availability = availability;
        }

        public List<LocalitiesBean> getLocalities() {
            return localities;
        }

        public void setLocalities(List<LocalitiesBean> localities) {
            this.localities = localities;
        }

        public List<String> getPropertyTypes() {
            return propertyTypes;
        }

        public void setPropertyTypes(List<String> propertyTypes) {
            this.propertyTypes = propertyTypes;
        }

        public static class PriceBean {
            /**
             * min : 50
             * max : 150
             */

            private Integer min;
            private Integer max;

            public Integer getMin() {
                return min;
            }

            public void setMin(Integer min) {
                this.min = min;
            }

            public Integer getMax() {
                return max;
            }

            public void setMax(Integer max) {
                this.max = max;
            }
        }

        public static class BedsBean {
            /**
             * min : 1
             * max : 3
             */

            private Integer min;
            private Integer max;

            public Integer getMin() {
                return min;
            }

            public void setMin(Integer min) {
                this.min = min;
            }

            public Integer getMax() {
                return max;
            }

            public void setMax(Integer max) {
                this.max = max;
            }
        }

        public static class BathsBean {
            /**
             * min : 1
             * max : 3
             */

            private Integer min;
            private Integer max;

            public Integer getMin() {
                return min;
            }

            public void setMin(Integer min) {
                this.min = min;
            }

            public Integer getMax() {
                return max;
            }

            public void setMax(Integer max) {
                this.max = max;
            }
        }

        public static class ParkingBean {
            /**
             * min : 1
             * max : 3
             */

            private Integer min;
            private Integer max;

            public Integer getMin() {
                return min;
            }

            public void setMin(Integer min) {
                this.min = min;
            }

            public Integer getMax() {
                return max;
            }

            public void setMax(Integer max) {
                this.max = max;
            }
        }

        public static class BlockSizeBean {
            /**
             * min : 100
             * max : 1000
             */

            private Integer min;
            private Integer max;

            public Integer getMin() {
                return min;
            }

            public void setMin(Integer min) {
                this.min = min;
            }

            public Integer getMax() {
                return max;
            }

            public void setMax(Integer max) {
                this.max = max;
            }
        }

        public static class AvailabilityBean {
            /**
             * min : 2021-03-02
             * max : null
             */

            private String min;
            private Object max;

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }

            public Object getMax() {
                return max;
            }

            public void setMax(Object max) {
                this.max = max;
            }
        }

        public static class LocalitiesBean {

            /**
             * type : REGION
             * slug : canberra-act
             */
            private String id;
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

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

        }
    }

    public static class ResultsBean {
        /**
         * type : LIST
         */

        private String type="LIST";

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
