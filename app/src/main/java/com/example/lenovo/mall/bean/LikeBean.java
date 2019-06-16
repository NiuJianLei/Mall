package com.example.lenovo.mall.bean;

import java.util.List;

public class LikeBean {
    /**
     * dlist : [{"note":"风火山林","amount":"200.00","name":"风火山林","description":"这个邪不错","pic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg","id":1},{"note":"艾克凯特","amount":"522.00","name":"艾克凯特","description":"这个争夺挺好","pic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg","id":2},{"note":"i内特卡莱","amount":"300.00","name":"i内特卡莱","description":"i内特卡莱不错不错","pic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg","id":3},{"note":"阿九阿九急啊急啊","amount":"666.00","name":"阿达","description":"实打实大苏打","pic":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg","id":4}]
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
         * note : 风火山林
         * amount : 200.00
         * name : 风火山林
         * description : 这个邪不错
         * pic : http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg
         * id : 1
         */
        private String note;
        private String amount;
        private String name;
        private String description;
        private String pic;
        private int id;

        public void setNote(String note) {
            this.note = note;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNote() {
            return note;
        }

        public String getAmount() {
            return amount;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getPic() {
            return pic;
        }

        public int getId() {
            return id;
        }
    }
}
