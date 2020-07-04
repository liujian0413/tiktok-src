package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.EnterpriseTab */
public class EnterpriseTab implements Serializable {
    @C6593c(mo15949a = "show_tab_settings")
    boolean showTabSettings;
    @C6593c(mo15949a = "tab_link")
    String tabLink;
    @C6593c(mo15949a = "tab_type")
    int tabType;
    @C6593c(mo15949a = "title")
    String title;

    /* renamed from: com.ss.android.ugc.aweme.profile.model.EnterpriseTab$EnterpriseTabType */
    public @interface EnterpriseTabType {
    }

    public String getTabLink() {
        return this.tabLink;
    }

    public int getTabType() {
        return this.tabType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTabSettings() {
        return this.showTabSettings;
    }

    public void setShowTabSettings(boolean z) {
        this.showTabSettings = z;
    }

    public void setTabLink(String str) {
        this.tabLink = str;
    }

    public void setTabType(int i) {
        this.tabType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
