package com.example.lenovo.mall.bean;

import java.util.List;

public class MiaoShaBean {

    /**
     * dlist : [{"ceckil_price":"99.00","quen_id":{"start_time":"2019-04-30 16:00:00","name":"春季促销","end_time":"2019-04-30 20:00:00","id":1,"state":1},"price":"203.00","name":"秒杀商品1","description":"这个没啥","id":1},{"ceckil_price":"99.00","quen_id":{"start_time":"2019-09-30 16:00:00","name":"秋季促销","end_time":"2019-10-30 16:00:00","id":3,"state":1},"price":"250.00","name":"秒杀商品2","description":"阿斯达四大","id":2},{"ceckil_price":"66.00","quen_id":{"start_time":"2019-05-15 16:00:00","name":"冬季促销","end_time":"2019-05-30 16:00:00","id":4,"state":1},"price":"120.00","name":"秒杀商品3","description":"阿斯达四大","id":4},{"ceckil_price":"299.00","quen_id":{"start_time":"2019-05-30 16:00:00","name":"夏季促销","end_time":"2019-06-03 16:00:00","id":2,"state":1},"price":"520.00","name":"秒杀商品4","description":"阿斯达四大","id":5},{"ceckil_price":"4999.00","quen_id":{"start_time":"2019-04-30 16:00:00","name":"春季促销","end_time":"2019-04-30 20:00:00","id":1,"state":1},"price":"5287.00","name":"秒杀商品5","description":"更好更符合法规","id":6},{"ceckil_price":"999.00","quen_id":{"start_time":"2019-04-30 16:00:00","name":"春季促销","end_time":"2019-04-30 20:00:00","id":1,"state":1},"price":"2000.00","name":"秒杀商品6","description":"范德萨发放给","id":7}]
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
         * ceckil_price : 99.00
         * quen_id : {"start_time":"2019-04-30 16:00:00","name":"春季促销","end_time":"2019-04-30 20:00:00","id":1,"state":1}
         * price : 203.00
         * name : 秒杀商品1
         * description : 这个没啥
         * id : 1
         */
        private String ceckil_price;
        private Quen_idEntity quen_id;
        private String price;
        private String name;
        private String description;
        private int id;

        public void setCeckil_price(String ceckil_price) {
            this.ceckil_price = ceckil_price;
        }

        public void setQuen_id(Quen_idEntity quen_id) {
            this.quen_id = quen_id;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCeckil_price() {
            return ceckil_price;
        }

        public Quen_idEntity getQuen_id() {
            return quen_id;
        }

        public String getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getId() {
            return id;
        }

        public class Quen_idEntity {
            /**
             * start_time : 2019-04-30 16:00:00
             * name : 春季促销
             * end_time : 2019-04-30 20:00:00
             * id : 1
             * state : 1
             */
            private String start_time;
            private String name;
            private String end_time;
            private int id;
            private int state;

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getStart_time() {
                return start_time;
            }

            public String getName() {
                return name;
            }

            public String getEnd_time() {
                return end_time;
            }

            public int getId() {
                return id;
            }

            public int getState() {
                return state;
            }
        }
    }
}
