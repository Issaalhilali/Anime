package com.issa.anime.model;

import java.io.Serializable;

public class Cartoon implements Serializable {
    private int id;

    private String thumb;

    private String title;

    private int type;

    public Cartoon() {}

    public Cartoon(int paramInt1, String paramString1, String paramString2, int paramInt2) {
        this.id = paramInt1;
        this.title = paramString1;
        this.thumb = paramString2;
        this.type = paramInt2;
    }

    public int getId() { return this.id; }

    public String getThumb() { return this.thumb; }

    public String getTitle() { return this.title; }

    public int getType() { return this.type; }

    public void setId(int paramInt) { this.id = paramInt; }

    public void setThumb(String paramString) { this.thumb = paramString; }

    public void setTitle(String paramString) { this.title = paramString; }

    public void setType(int paramInt) { this.type = paramInt; }
}
