package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.InquiryStruct */
public class InquiryStruct implements Serializable {
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "icon")
    private UrlModel icon;
    @C6593c(mo15949a = "open_url")
    private String openUrl;
    @C6593c(mo15949a = "web_url")
    private String webUrl;

    public String getDesc() {
        return this.desc;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }
}
