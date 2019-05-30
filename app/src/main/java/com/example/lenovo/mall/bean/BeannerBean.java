package com.example.lenovo.mall.bean;

import java.util.List;

public class BeannerBean {

    /**
     * dlist : [{"id":1,"pic":"http://img2.cheshi-img.com/product/1_1024/p/40600/40629/56680656ee3ac.jpg"},{"id":2,"pic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg"},{"id":3,"pic":"http://imgsrc.baidu.com/baike/pic/item/570f8c58885d84f19c8204a0.jpg"},{"id":4,"pic":"http://img2.cheshi-img.com/product/1_1024/p/40600/40629/56680656ee3ac.jpg"},{"id":5,"pic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg"}]
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
         * id : 1
         * pic : http://img2.cheshi-img.com/product/1_1024/p/40600/40629/56680656ee3ac.jpg
         */
        private int id;
        private String pic;

        public void setId(int id) {
            this.id = id;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public int getId() {
            return id;
        }

        public String getPic() {
            return pic;
        }
    }
}
