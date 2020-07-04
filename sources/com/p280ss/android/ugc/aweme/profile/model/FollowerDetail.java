package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.FollowerDetail */
public class FollowerDetail implements Serializable {
    @C6593c(mo15949a = "app_name")
    public String appName;
    @C6593c(mo15949a = "apple_id")
    public String appleId;
    @C6593c(mo15949a = "download_url")
    public String downloadUrl;
    @C6593c(mo15949a = "fans_count")
    public int fansCount;
    @C6593c(mo15949a = "icon")
    public String icon;
    @C6593c(mo15949a = "name")
    public String name;
    @C6593c(mo15949a = "open_url")
    public String openUrl;
    @C6593c(mo15949a = "package_name")
    public String packageName;

    public String getAppName() {
        return this.appName;
    }

    public String getAppleId() {
        return this.appleId;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppleId(String str) {
        this.appleId = str;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setFansCount(int i) {
        this.fansCount = i;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
