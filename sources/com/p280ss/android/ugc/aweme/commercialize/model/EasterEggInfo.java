package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.EasterEggInfo */
public class EasterEggInfo implements Serializable {
    @C6593c(mo15949a = "easter_egg_id")

    /* renamed from: id */
    String f65869id;
    @C6593c(mo15949a = "is_h5")
    boolean isH5;
    @C6593c(mo15949a = "easter_egg_name")
    String name;
    @C6593c(mo15949a = "open_url")
    String openUrl;
    @C6593c(mo15949a = "source_type")
    String sourceType;
    @C6593c(mo15949a = "source_url")
    UrlModel sourceUrl;
    @C6593c(mo15949a = "web_title")
    String webTitle;
    @C6593c(mo15949a = "web_url")
    String webUrl;

    public String getId() {
        return this.f65869id;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isH5() {
        return this.isH5;
    }

    public void setId(String str) {
        this.f65869id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setSourceUrl(UrlModel urlModel) {
        this.sourceUrl = urlModel;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
