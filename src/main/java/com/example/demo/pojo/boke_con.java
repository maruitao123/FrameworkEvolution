package com.example.demo.pojo;

import java.util.Date;

public class boke_con {
    private Integer id;

    private String userid;

    private String img;

    private String con;

    private Date time;

    private String title;

    private String articleCon;

    public boke_con(Integer id, String userid, String img, String con, Date time, String title, String articleCon) {
        this.id = id;
        this.userid = userid;
        this.img = img;
        this.con = con;
        this.time = time;
        this.title = title;
        this.articleCon = articleCon;
    }

    public boke_con() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con == null ? null : con.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getArticleCon() {
        return articleCon;
    }

    public void setArticleCon(String articleCon) {
        this.articleCon = articleCon == null ? null : articleCon.trim();
    }
}