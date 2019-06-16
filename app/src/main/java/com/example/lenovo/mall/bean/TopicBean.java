package com.example.lenovo.mall.bean;

import java.util.List;

public class TopicBean {
    /**
     * dlist : [{"comment_count":30,"category_name":"分类名称","price":"74.00","id":1,"title":"阿斯达四大","collect_count":50,"read_count":856},{"comment_count":525,"category_name":"分类名称","price":"85.00","id":2,"title":"发的发的发","collect_count":20,"read_count":85},{"comment_count":85,"category_name":"分类名称","price":"88.00","id":3,"title":"规划法规回复","collect_count":302,"read_count":52},{"comment_count":85,"category_name":"分类名称","price":"99.00","id":4,"title":"更好更符合法规","collect_count":20,"read_count":90},{"comment_count":null,"category_name":null,"price":null,"id":5,"title":null,"collect_count":null,"read_count":null}]
     * code : 200
     */
    private List<DlistEntity> dlist;
    private int code;

    public void setDlist(List<DlistEntity> dlist) {
        this.dlist = dlist;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DlistEntity> getDlist() {
        return dlist;
    }

    public int getCode() {
        return code;
    }

    public class DlistEntity {
        /**
         * comment_count : 30
         * category_name : 分类名称
         * price : 74.00
         * id : 1
         * title : 阿斯达四大
         * collect_count : 50
         * read_count : 856
         */
        private int comment_count;
        private String category_name;
        private String price;
        private int id;
        private String title;
        private int collect_count;
        private int read_count;

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public void setRead_count(int read_count) {
            this.read_count = read_count;
        }

        public int getComment_count() {
            return comment_count;
        }

        public String getCategory_name() {
            return category_name;
        }

        public String getPrice() {
            return price;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public int getRead_count() {
            return read_count;
        }
    }
}
