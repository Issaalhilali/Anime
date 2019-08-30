package com.issa.anime.model;

import java.io.Serializable;

public class Download implements Serializable {
    private  int id;
    private String path;
    private String title;
    public Download(){}

    public Download(int paramInt, String paramString1, String paramString2) {
        this.id = paramInt;
        this.title = paramString1;
        this.path = paramString2;
    }

    public int getId() { return this.id; }

    public String getPath() { return this.path; }

    public String getTitle() { return this.title; }

    public void setId(int paramInt) { this.id = paramInt; }

    public void setPath(String paramString) { this.path = paramString; }

    public void setTitle(String paramString) { this.title = paramString; }
}
