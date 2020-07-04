package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.HomePageBottomToast */
public final class HomePageBottomToast implements Serializable {
    @C6593c(mo15949a = "icon_url")
    private UrlModel iconUrl;
    @C6593c(mo15949a = "jump_url")
    private String jumpUrl;
    @C6593c(mo15949a = "jump_url_title")
    private String jumpUrlTitle;
    @C6593c(mo15949a = "toast")
    private String toast;
    @C6593c(mo15949a = "toast_type")
    private Integer toastType = Integer.valueOf(0);

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getJumpUrlTitle() {
        return this.jumpUrlTitle;
    }

    public final String getToast() {
        return this.toast;
    }

    public final Integer getToastType() {
        return this.toastType;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setJumpUrlTitle(String str) {
        this.jumpUrlTitle = str;
    }

    public final void setToast(String str) {
        this.toast = str;
    }

    public final void setToastType(Integer num) {
        this.toastType = num;
    }
}
