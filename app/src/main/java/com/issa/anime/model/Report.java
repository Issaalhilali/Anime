package com.issa.anime.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Report {
    @Expose
    @SerializedName("cartoon_title")
    private String cartoonTitle;

    @Expose
    @SerializedName("episode_id")
    private int episodeId;

    @Expose
    @SerializedName("episode_title")
    private String episodeTitle;

    @Expose
    @SerializedName("episode_video")
    private String episodeUrl;

    @Expose
    @SerializedName("playlist_title")
    private String playlistTitle;

    public Report() {}

    public Report(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4) {
        this.episodeId = paramInt;
        this.episodeTitle = paramString1;
        this.episodeUrl = paramString2;
        this.playlistTitle = paramString3;
        this.cartoonTitle = paramString4;
    }

    public String getCartoonTitle() { return this.cartoonTitle; }

    public int getEpisodeId() { return this.episodeId; }

    public String getEpisodeTitle() { return this.episodeTitle; }

    public String getEpisodeUrl() { return this.episodeUrl; }

    public String getPlaylistTitle() { return this.playlistTitle; }

    public void setCartoonTitle(String paramString) { this.cartoonTitle = paramString; }

    public void setEpisodeId(int paramInt) { this.episodeId = paramInt; }

    public void setEpisodeTitle(String paramString) { this.episodeTitle = paramString; }

    public void setEpisodeUrl(String paramString) { this.episodeUrl = paramString; }

    public void setPlaylistTitle(String paramString) { this.playlistTitle = paramString; }
}
