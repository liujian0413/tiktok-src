package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorInfo */
public final class AnchorInfo implements Serializable {
    @C6593c(mo15949a = "extra")
    public String extra;
    @C6593c(mo15949a = "icon")
    public UrlModel icon;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public String f75159id;
    @C6593c(mo15949a = "mp_url")
    public String mpUrl;
    @C6593c(mo15949a = "open_url")
    public String openUrl;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "type")
    public Integer type = Integer.valueOf(-1);
    @C6593c(mo15949a = "web_url")
    public String webUrl;

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f75159id;
    }

    public final String getMpUrl() {
        return this.mpUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(String str) {
        this.f75159id = str;
    }

    public final void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
