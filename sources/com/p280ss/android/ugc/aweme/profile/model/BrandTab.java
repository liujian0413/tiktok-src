package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.BrandTab */
public class BrandTab implements Serializable {
    @C6593c(mo15949a = "industry_type")
    int industryType;
    @C6593c(mo15949a = "show_brand_tab")
    boolean showBrandTab;
    @C6593c(mo15949a = "title")
    String title;

    public int getIndustryType() {
        return this.industryType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowBrandTab() {
        return this.showBrandTab;
    }

    public void setIndustryType(int i) {
        this.industryType = i;
    }

    public void setShowBrandTab(boolean z) {
        this.showBrandTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
