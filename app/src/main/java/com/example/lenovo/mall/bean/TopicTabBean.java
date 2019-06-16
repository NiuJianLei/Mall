package com.example.lenovo.mall.bean;

import java.util.List;

public class TopicTabBean {
    /**
     * code : 200
     * category : [{"name":"张","icon":"http://img2.cheshi-img.com/product/1_1024/p/40600/40629/56680656ee3ac.jpg","id":1,"list":[{"category_name":"分类名称","price":74,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412964&amp;di=4934e86ac0dd4fb834848c7313d8c8bb&amp;imgtype=0&amp;src=http%3A%2F%2Fpic25.nipic.com%2F20121205%2F10197997_003647426000_2.jpg","title":"阿斯达四大","subheading":"副标题一"},{"category_name":"分类名称","price":88,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&imgtype=0&src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg  ","title":"规划法规回复","subheading":"副标题一"}]},{"name":"张","icon":"http://img2.cheshi-img.com/product/1_1024/p/40600/40629/56680656ee3ac.jpg","id":1,"list":[{"category_name":"分类名称","price":74,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412964&amp;di=4934e86ac0dd4fb834848c7313d8c8bb&amp;imgtype=0&amp;src=http%3A%2F%2Fpic25.nipic.com%2F20121205%2F10197997_003647426000_2.jpg","title":"阿斯达四大","subheading":"副标题一"},{"category_name":"分类名称","price":88,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&imgtype=0&src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg  ","title":"规划法规回复","subheading":"副标题一"}]}]
     */
    private int code;
    private List<CategoryEntity> category;

    public void setCode(int code) {
        this.code = code;
    }

    public void setCategory(List<CategoryEntity> category) {
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public List<CategoryEntity> getCategory() {
        return category;
    }

    public class CategoryEntity {
        /**
         * name : 张
         * icon : http://img2.cheshi-img.com/product/1_1024/p/40600/40629/56680656ee3ac.jpg
         * id : 1
         * list : [{"category_name":"分类名称","price":74,"pic":"https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412964&amp;di=4934e86ac0dd4fb834848c7313d8c8bb&amp;imgtype=0&amp;src=http%3A%2F%2Fpic25.nipic.com%2F20121205%2F10197997_003647426000_2.jpg","title":"阿斯达四大","subheading":"副标题一"},{"category_name":"分类名称","price":88,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&imgtype=0&src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg  ","title":"规划法规回复","subheading":"副标题一"}]
         */
        private String name;
        private String icon;
        private int id;
        private List<ListEntity> list;

        public void setName(String name) {
            this.name = name;
        }

        public void setIcon(String icon) {
            this.icon = icon;
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

        public String getIcon() {
            return icon;
        }

        public int getId() {
            return id;
        }

        public List<ListEntity> getList() {
            return list;
        }

        public class ListEntity {
            /**
             * category_name : 分类名称
             * price : 74
             * pic : https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1558012412964&amp;di=4934e86ac0dd4fb834848c7313d8c8bb&amp;imgtype=0&amp;src=http%3A%2F%2Fpic25.nipic.com%2F20121205%2F10197997_003647426000_2.jpg
             * title : 阿斯达四大
             * subheading : 副标题一
             */
            private String category_name;
            private int price;
            private String pic;
            private String title;
            private String subheading;

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setSubheading(String subheading) {
                this.subheading = subheading;
            }

            public String getCategory_name() {
                return category_name;
            }

            public int getPrice() {
                return price;
            }

            public String getPic() {
                return pic;
            }

            public String getTitle() {
                return title;
            }

            public String getSubheading() {
                return subheading;
            }
        }
    }
}
