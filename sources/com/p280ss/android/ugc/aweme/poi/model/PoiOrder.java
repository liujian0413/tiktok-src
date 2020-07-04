package com.p280ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiOrder */
public class PoiOrder implements Serializable {
    @C6593c(mo15949a = "app_url")
    public String app_url;
    @C6593c(mo15949a = "h5_url")
    public String h5_url;
    @C6593c(mo15949a = "icon")
    public UrlModel icon;
    @C6593c(mo15949a = "price")
    public double price;
    @C6593c(mo15949a = "provider")
    public String provider;
    @C6593c(mo15949a = "title")
    public String title;

    public String getPrice() {
        return String.valueOf(Math.round(this.price));
    }

    public boolean isValid() {
        if (!C6319n.m19593a(this.h5_url) || !C6319n.m19593a(this.app_url)) {
            return true;
        }
        return false;
    }
}
