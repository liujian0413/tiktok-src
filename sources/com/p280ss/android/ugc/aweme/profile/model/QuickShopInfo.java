package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.QuickShopInfo */
public class QuickShopInfo implements Serializable {
    @C6593c(mo15949a = "quick_shop_name")
    public String quickShopName;
    @C6593c(mo15949a = "quick_shop_url")
    public String quickShopUrl;
    @C6593c(mo15949a = "second_floor_info")
    public QuickShopSecondFloorInfo secondFloorInfo;
    @C6593c(mo15949a = "with_text_entry")
    public boolean withTextEntry;

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public QuickShopSecondFloorInfo getSecondFloorInfo() {
        return this.secondFloorInfo;
    }

    public boolean isWithTextEntry() {
        return this.withTextEntry;
    }

    public void setQuickShopName(String str) {
        this.quickShopName = str;
    }

    public void setQuickShopUrl(String str) {
        this.quickShopUrl = str;
    }

    public void setSecondFloorInfo(QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        this.secondFloorInfo = quickShopSecondFloorInfo;
    }

    public void setWithTextEntry(boolean z) {
        this.withTextEntry = z;
    }
}
