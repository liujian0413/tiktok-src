package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AggregationTab */
public class AggregationTab implements Serializable {
    @C6593c(mo15949a = "show_tab")
    boolean showTab;
    @C6593c(mo15949a = "title")
    String title;

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTab() {
        return this.showTab;
    }

    public void setShowTab(boolean z) {
        this.showTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
