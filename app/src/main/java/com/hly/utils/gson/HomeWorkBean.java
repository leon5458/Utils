package com.hly.utils.gson;

public class HomeWorkBean {

    /**
     * home : {"name":"外滩","address":"上海市黄浦区中山东一路(临黄浦江)","lat":3123777,"lng":12149060}
     * company : {"name":"华为研发中心","address":"上海市浦东新区新金桥路2222号","lat":3126255,"lng":12163020}
     */

    private HomeBean home;
    private CompanyBean company;

    public HomeBean getHome() {
        return home;
    }

    public void setHome(HomeBean home) {
        this.home = home;
    }

    public CompanyBean getCompany() {
        return company;
    }

    public void setCompany(CompanyBean company) {
        this.company = company;
    }

    public static class HomeBean {
        /**
         * name : 外滩
         * address : 上海市黄浦区中山东一路(临黄浦江)
         * lat : 3123777
         * lng : 12149060
         */

        private String name;
        private String address;
        private int lat;
        private int lng;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getLat() {
            return lat;
        }

        public void setLat(int lat) {
            this.lat = lat;
        }

        public int getLng() {
            return lng;
        }

        public void setLng(int lng) {
            this.lng = lng;
        }
    }

    public static class CompanyBean {
        /**
         * name : 华为研发中心
         * address : 上海市浦东新区新金桥路2222号
         * lat : 3126255
         * lng : 12163020
         */

        private String name;
        private String address;
        private int lat;
        private int lng;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getLat() {
            return lat;
        }

        public void setLat(int lat) {
            this.lat = lat;
        }

        public int getLng() {
            return lng;
        }

        public void setLng(int lng) {
            this.lng = lng;
        }
    }
}
