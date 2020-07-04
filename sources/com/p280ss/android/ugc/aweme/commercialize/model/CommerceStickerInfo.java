package com.p280ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.CommerceStickerInfo */
public class CommerceStickerInfo implements Serializable {
    @C6593c(mo15949a = "commerce_sticker_id")
    public long commerceStickerId;
    @C6593c(mo15949a = "icon_url")
    public UrlModel iconUrl;
    @C6593c(mo15949a = "letters")
    public String letters;
    @C6593c(mo15949a = "open_url")
    public String openUrl;
    @C6593c(mo15949a = "web_url")
    public String webUrl;
    @C6593c(mo15949a = "web_url_title")
    public String webUrlTitle;

    public long getCommerceStickerId() {
        return this.commerceStickerId;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLetters() {
        return this.letters;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String getWebUrlTitle() {
        return this.webUrlTitle;
    }

    public boolean enable() {
        if (this.iconUrl == null || TextUtils.isEmpty(this.letters) || (TextUtils.isEmpty(this.webUrl) && TextUtils.isEmpty(this.openUrl))) {
            return false;
        }
        return true;
    }

    public void setCommerceStickerId(long j) {
        this.commerceStickerId = j;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLetters(String str) {
        this.letters = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebUrlTitle(String str) {
        this.webUrlTitle = str;
    }
}
