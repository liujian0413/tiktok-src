package com.p280ss.android.ugc.aweme.shortvideo.edit;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel */
public class MicroAppModel implements Serializable {
    String appId;
    private String appTitle;
    private String appUrl;
    private String cardCode;
    private String cardImage;
    private String description;
    private String extra;
    private String schema;

    public String getAnchorTitle() {
        return this.appTitle;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppTitle() {
        return this.appTitle;
    }

    public String getAppUrl() {
        return this.appUrl;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public String getCardImage() {
        return this.cardImage;
    }

    public String getDescription() {
        return this.description;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getSchema() {
        return this.schema;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppTitle(String str) {
        this.appTitle = str;
    }

    public void setAppUrl(String str) {
        this.appUrl = str;
    }

    public void setCardCode(String str) {
        this.cardCode = str;
    }

    public void setCardImage(String str) {
        this.cardImage = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }
}
