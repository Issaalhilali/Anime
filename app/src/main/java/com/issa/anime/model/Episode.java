package com.issa.anime.model;

import java.io.Serializable;

public class Episode implements Serializable {
    private int id;

    private int playlistId;

    private String thumb;

    private String title;

    private String video;

    public Episode() {}

    public Episode(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2) {
        this.id = paramInt1;
        this.title = paramString1;
        this.thumb = paramString2;
        this.video = paramString3;
        this.playlistId = paramInt2;
    }

    public int getId() { return this.id; }

    public int getPlaylistId() { return this.playlistId; }

    public String getThumb() { return this.thumb; }

    public String getTitle() { return this.title; }

    public String getVideo() { return this.video; }

    public void setId(int paramInt) { this.id = paramInt; }

    public void setPlaylistId(int paramInt) { this.playlistId = paramInt; }

    public void setThumb(String paramString) { this.thumb = paramString; }

    public void setTitle(String paramString) { this.title = paramString; }

    public void setVideo(String paramString) { this.video = paramString; }
}

