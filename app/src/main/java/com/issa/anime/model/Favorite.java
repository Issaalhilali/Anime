package com.issa.anime.model;

public class Favorite {
    private String cartoonTitle;

    private int id;

    private String imgUrl;

    private String playlistTitle;

    private String title;

    private String videoUrl;

    public Favorite() {}

    public Favorite(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
        this.id = paramInt;
        this.title = paramString1;
        this.playlistTitle = paramString2;
        this.cartoonTitle = paramString3;
        this.imgUrl = paramString4;
        this.videoUrl = paramString5;
    }

    public String getCartoonTitle() { return this.cartoonTitle; }

    public int getId() { return this.id; }

    public String getImgUrl() { return this.imgUrl; }

    public String getPlaylistTitle() { return this.playlistTitle; }

    public String getTitle() { return this.title; }

    public String getVideoUrl() { return this.videoUrl; }

    public void setCartoonTitle(String paramString) { this.cartoonTitle = paramString; }

    public void setId(int paramInt) { this.id = paramInt; }

    public void setImgUrl(String paramString) { this.imgUrl = paramString; }

    public void setPlaylistTitle(String paramString) { this.playlistTitle = paramString; }

    public void setTitle(String paramString) { this.title = paramString; }

    public void setVideoUrl(String paramString) { this.videoUrl = paramString; }
}
