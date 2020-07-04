package com.p280ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MvModel */
public final class MvModel implements Serializable {
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "extra")
    private String extra;
    @C6593c(mo15949a = "icon_url")
    private UrlModel iconUrl;
    @C6593c(mo15949a = "id")
    private String mvId;
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "user_count")
    private Long userCount;

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getMvId() {
        return this.mvId;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setMvId(String str) {
        this.mvId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }
}
