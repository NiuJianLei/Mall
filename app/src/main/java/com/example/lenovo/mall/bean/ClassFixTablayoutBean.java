package com.example.lenovo.mall.bean;

import java.io.Serializable;
import java.util.List;

public class ClassFixTablayoutBean implements Serializable{

    /**
     * dlist : [{"name":"上衣","id":1,"list":[{"name":"毛衣","id":2},{"name":"夹克","id":3}]},{"name":"上衣","id":1,"list":[{"name":"毛衣","id":2},{"name":"夹克","id":3}]},{"name":"电器","id":4,"list":[{"name":"大哥大","id":5}]},{"name":"球鞋","id":6,"list":[{"name":"阿三","id":7}]}]
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

    public class DlistEntity implements Serializable {
        /**
         * name : 上衣
         * id : 1
         * list : [{"name":"毛衣","id":2},{"name":"夹克","id":3}]
         */
        private String name;
        private int id;
        private List<ListEntity> list;

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setList(List<ListEntity> list) {
            this.list = list;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public List<ListEntity> getList() {
            return list;
        }

        public class ListEntity {
            /**
             * name : 毛衣
             * id : 2
             */
            private String name;
            private int id;

            public void setName(String name) {
                this.name = name;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public int getId() {
                return id;
            }
        }
    }
}
