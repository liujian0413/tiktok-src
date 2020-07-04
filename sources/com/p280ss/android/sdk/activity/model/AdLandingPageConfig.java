package com.p280ss.android.sdk.activity.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.sdk.activity.model.AdLandingPageConfig */
public class AdLandingPageConfig implements Serializable {
    @C6593c(mo15949a = "ad_landing_page_auto_jump_allow_list")
    List<String> autoJumpAllowList;
    @C6593c(mo15949a = "ad_landing_page_auto_jump_intercept_list")
    List<String> autoJumpInterceptList;
    @C6593c(mo15949a = "ad_landing_page_click_jump_interval")
    int autoJumpInterval;
    @C6593c(mo15949a = "ad_landing_page_click_jump_interval_tips")
    String autoJumpIntervalTips;
    @C6593c(mo15949a = "ad_landing_page_click_jump_control_enabled")
    boolean clickControlEnabled = true;
    @C6593c(mo15949a = "ad_landing_page_click_jump_allow_list")
    List<String> clickJumpAllowList;
    @C6593c(mo15949a = "ad_landing_page_auto_jump_control_enabled")
    boolean jumpControlEnabled = true;
    @C6593c(mo15949a = "ad_landing_page_pause_list")
    List<String> pauseList;

    public List<String> getAutoJumpAllowList() {
        return this.autoJumpAllowList;
    }

    public List<String> getAutoJumpInterceptList() {
        return this.autoJumpInterceptList;
    }

    public int getAutoJumpInterval() {
        return this.autoJumpInterval;
    }

    public String getAutoJumpIntervalTips() {
        return this.autoJumpIntervalTips;
    }

    public List<String> getClickJumpAllowList() {
        return this.clickJumpAllowList;
    }

    public List<String> getPauseList() {
        return this.pauseList;
    }

    public boolean isClickControlEnabled() {
        return this.clickControlEnabled;
    }

    public boolean isJumpControlEnabled() {
        return this.jumpControlEnabled;
    }

    public void setAutoJumpAllowList(List<String> list) {
        this.autoJumpAllowList = list;
    }

    public void setAutoJumpInterceptList(List<String> list) {
        this.autoJumpInterceptList = list;
    }

    public void setAutoJumpInterval(int i) {
        this.autoJumpInterval = i;
    }

    public void setAutoJumpIntervalTips(String str) {
        this.autoJumpIntervalTips = str;
    }

    public void setClickControlEnabled(boolean z) {
        this.clickControlEnabled = z;
    }

    public void setClickJumpAllowList(List<String> list) {
        this.clickJumpAllowList = list;
    }

    public void setJumpControlEnabled(boolean z) {
        this.jumpControlEnabled = z;
    }

    public void setPauseList(List<String> list) {
        this.pauseList = list;
    }
}
