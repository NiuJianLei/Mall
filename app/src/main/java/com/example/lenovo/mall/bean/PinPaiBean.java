package com.example.lenovo.mall.bean;

import java.util.List;

public class PinPaiBean {

    /**
     * dlist : [{"name":"小米","bigPic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg","zuidijia":0,"id":1},{"name":"华为","bigPic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg","zuidijia":0,"id":2},{"name":"玛莎离地","bigPic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg","zuidijia":0,"id":3},{"name":"HZ","bigPic":"http://imgsrc.baidu.com/baike/pic/item/570f8c58885d84f19c8204a0.jpg","zuidijia":0,"id":4}]
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
         * name : 小米
         * bigPic : http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg
         * zuidijia : 0
         * id : 1
         */
        private String name;
        private String bigPic;
        private int zuidijia;
        private int id;

        public void setName(String name) {
            this.name = name;
        }

        public void setBigPic(String bigPic) {
            this.bigPic = bigPic;
        }

        public void setZuidijia(int zuidijia) {
            this.zuidijia = zuidijia;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getBigPic() {
            return bigPic;
        }

        public int getZuidijia() {
            return zuidijia;
        }

        public int getId() {
            return id;
        }
    }
}
