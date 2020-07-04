package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.TabSetting */
public class TabSetting implements Serializable {
    @C6593c(mo15949a = "aggregation_tab")
    AggregationTab aggregationTab;
    @C6593c(mo15949a = "brand_tab")
    BrandTab brandTab;
    @C6593c(mo15949a = "enterprise_tab")
    EnterpriseTab enterpriseTab;
    @C6593c(mo15949a = "hide_like_tab")
    boolean hideLikeTab;

    public AggregationTab getAggregationTab() {
        return this.aggregationTab;
    }

    public BrandTab getBrandTab() {
        return this.brandTab;
    }

    public EnterpriseTab getEnterpriseTab() {
        return this.enterpriseTab;
    }

    public boolean isHideLikeTab() {
        return this.hideLikeTab;
    }

    public void setAggregationTab(AggregationTab aggregationTab2) {
        this.aggregationTab = aggregationTab2;
    }

    public void setBrandTab(BrandTab brandTab2) {
        this.brandTab = brandTab2;
    }

    public void setEnterpriseTab(EnterpriseTab enterpriseTab2) {
        this.enterpriseTab = enterpriseTab2;
    }

    public void setHideLikeTab(boolean z) {
        this.hideLikeTab = z;
    }
}
