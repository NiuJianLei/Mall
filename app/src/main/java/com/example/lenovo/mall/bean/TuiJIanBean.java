package com.example.lenovo.mall.bean;

import java.util.List;

public class TuiJIanBean {

    /**
     * dlist : [{"note":"这秋季的风","note_s":"其实也没啥","amount":"99.00","name":"八月的风","description":"阿萨德撒大所大三大","pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412964&amp;di=4934e86ac0dd4fb834848c7313d8c8bb&amp;imgtype=0&amp;src=http%3A%2F%2Fpic25.nipic.com%2F20121205%2F10197997_003647426000_2.jpg","id":1},{"note":"这七月的雨","note_s":"还不错","amount":"66.00","name":"七月的月","description":"发鬼地方个电饭锅地方","pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&amp;imgtype=0&amp;src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg","id":2},{"note":"这刘悦的烈焰","note_s":"挺好的","amount":"88.00","name":"六月烈焰","description":"电饭锅电饭锅电饭锅发的","pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412966&amp;di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&amp;imgtype=0&amp;src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg","id":3}]
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
         * note : 这秋季的风
         * note_s : 其实也没啥
         * amount : 99.00
         * name : 八月的风
         * description : 阿萨德撒大所大三大
         * pic : https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412964&amp;di=4934e86ac0dd4fb834848c7313d8c8bb&amp;imgtype=0&amp;src=http%3A%2F%2Fpic25.nipic.com%2F20121205%2F10197997_003647426000_2.jpg
         * id : 1
         */
        private String note;
        private String note_s;
        private String amount;
        private String name;
        private String description;
        private String pic;
        private int id;

        public void setNote(String note) {
            this.note = note;
        }

        public void setNote_s(String note_s) {
            this.note_s = note_s;
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

        public String getNote_s() {
            return note_s;
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
