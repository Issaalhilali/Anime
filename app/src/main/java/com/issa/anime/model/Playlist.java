package com.issa.anime.model;

import java.io.Serializable;

public class Playlist implements Serializable {
    private int cartoonId;

    private int id;

    private String thumb;

    private String title;

    public Playlist() {}

    public Playlist(int paramInt1, String paramString1, String paramString2, int paramInt2) {
        this.id = paramInt1;
        this.title = paramString1;
        this.thumb = paramString2;
        this.cartoonId = paramInt2;
    }

    public int getCartoonId() { return this.cartoonId; }

    public int getId() { return this.id; }

    public String getThumb() { return this.thumb; }

    public String getTitle() { return this.title; }

    public void setCartoonId(int paramInt) { this.cartoonId = paramInt; }

    public void setId(int paramInt) { this.id = paramInt; }

    public void setThumb(String paramString) { this.thumb = paramString; }

    public void setTitle(String paramString) { this.title = paramString; }
}
