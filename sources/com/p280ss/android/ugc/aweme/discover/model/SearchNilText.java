package com.p280ss.android.ugc.aweme.discover.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchNilText */
public class SearchNilText implements Serializable {
    private String content;
    private String link;
    private String url;

    public String getContent() {
        return this.content;
    }

    public String getLink() {
        return this.link;
    }

    public String getUrl() {
        return this.url;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
