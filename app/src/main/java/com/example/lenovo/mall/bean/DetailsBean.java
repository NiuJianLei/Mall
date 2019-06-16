package com.example.lenovo.mall.bean;

import java.util.List;

public class DetailsBean  {

    /**
     * dlist : [{"subTitle":null,"originalPrice":null,"price":null,"name":"","id":0,"pic":null},{"subTitle":"风格很反感","originalPrice":"30.00","price":"23.00","name":"林立","id":1,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=443cb0b4b4c83916dc27d7e632c8a6c0&amp;imgtype=0&amp;src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg"},{"subTitle":"hgjgh","originalPrice":"30.00","price":"30.00","name":"特步","id":2,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=443cb0b4b4c83916dc27d7e632c8a6c0&amp;imgtype=0&amp;src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg"},{"subTitle":"啊啊啊","originalPrice":"30.00","price":"20.00","name":"耐克","id":8,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=443cb0b4b4c83916dc27d7e632c8a6c0&amp;imgtype=0&amp;src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg"},{"subTitle":"烦烦烦","originalPrice":"30.00","price":"20.00","name":"打底裤","id":9,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=443cb0b4b4c83916dc27d7e632c8a6c0&amp;imgtype=0&amp;src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg"},{"subTitle":"烦烦烦","originalPrice":"30.00","price":"20.00","name":"鞋子","id":10,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=443cb0b4b4c83916dc27d7e632c8a6c0&amp;imgtype=0&amp;src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg"},{"subTitle":"烦烦烦","originalPrice":"30.00","price":"20.00","name":"水杯","id":11,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=443cb0b4b4c83916dc27d7e632c8a6c0&amp;imgtype=0&amp;src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg"},{"subTitle":"烦烦烦阿三","originalPrice":"30.00","price":"20.00","name":"一次性纸杯","id":12,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=443cb0b4b4c83916dc27d7e632c8a6c0&amp;imgtype=0&amp;src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg"}]
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
         * subTitle : null
         * originalPrice : null
         * price : null
         * name :
         * id : 0
         * pic : null
         */
        private String subTitle;
        private String originalPrice;
        private String price;
        private String name;
        private int id;
        private String pic;

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public void setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public String getOriginalPrice() {
            return originalPrice;
        }

        public String getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String getPic() {
            return pic;
        }
    }
}
