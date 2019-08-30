package com.issa.anime.model;

public class Admob {
    private String app_id;

    private String banner;

    private String interstitial;

    private String interstitial2;

    public Admob() {}

    public Admob(String paramString1, String paramString2, String paramString3) {
        this.app_id = paramString1;
        this.banner = paramString2;
        this.interstitial = paramString3;
    }

    public String getApp_id() { return this.app_id; }

    public String getBanner() { return this.banner; }

    public String getInterstitial() { return this.interstitial; }

    public String getInterstitial2() { return this.interstitial2; }

    public void setApp_id(String paramString) { this.app_id = paramString; }

    public void setBanner(String paramString) { this.banner = paramString; }

    public void setInterstitial(String paramString) { this.interstitial = paramString; }

    public void setInterstitial2(String paramString) { this.interstitial2 = paramString; }
}
