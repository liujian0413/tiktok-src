package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NationalTaskLink */
public final class NationalTaskLink implements Serializable {
    @C6593c(mo15949a = "avatar_icon")
    public UrlModel avatarIcon;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public String f75161id;
    @C6593c(mo15949a = "open_url")
    public String openUrl;
    @C6593c(mo15949a = "sub_title")
    public String subTitle;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "web_url")
    public String webUrl;

    public final UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public final String getId() {
        return this.f75161id;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public final void setId(String str) {
        this.f75161id = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
