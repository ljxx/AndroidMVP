package com.ylx.androidmvp.bean;

import java.util.List;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  下午3:26
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class LatestNewsBean {
    /**
     * date : 20140523
     * stories : [{"title":"中国古代家具发展到今天有两个高峰，一个两宋一个明末（多图）","ga_prefix":"052321","images":["http://p1.zhimg.com/45/b9/45b9f057fc1957ed2c946814342c0f02.jpg"],"type":0,"id":3930445},"..."]
     * top_stories : [{"title":"商场和很多人家里，竹制家具越来越多（多图）","image":"http://p2.zhimg.com/9a/15/9a1570bb9e5fa53ae9fb9269a56ee019.jpg","ga_prefix":"052315","type":0,"id":3930883},"..."]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * title : 中国古代家具发展到今天有两个高峰，一个两宋一个明末（多图）
         * ga_prefix : 052321
         * images : ["http://p1.zhimg.com/45/b9/45b9f057fc1957ed2c946814342c0f02.jpg"]
         * type : 0
         * id : 3930445
         */

        private String title;
        private String ga_prefix;
        private int type;
        private int id;
        private List<String> images;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "StoriesBean{" +
                    "title='" + title + '\'' +
                    ", ga_prefix='" + ga_prefix + '\'' +
                    ", type=" + type +
                    ", id=" + id +
                    ", images=" + images +
                    '}';
        }
    }

    public static class TopStoriesBean {
        /**
         * title : 商场和很多人家里，竹制家具越来越多（多图）
         * image : http://p2.zhimg.com/9a/15/9a1570bb9e5fa53ae9fb9269a56ee019.jpg
         * ga_prefix : 052315
         * type : 0
         * id : 3930883
         */

        private String title;
        private String image;
        private String ga_prefix;
        private int type;
        private int id;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "TopStoriesBean{" +
                    "title='" + title + '\'' +
                    ", image='" + image + '\'' +
                    ", ga_prefix='" + ga_prefix + '\'' +
                    ", type=" + type +
                    ", id=" + id +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LatestNewsBean{" +
                "date='" + date + '\'' +
                ", stories=" + stories.toString() +
                ", top_stories=" + top_stories.toString() +
                '}';
    }
}
