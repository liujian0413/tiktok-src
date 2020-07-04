package com.bytedance.android.live.base.model.share;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;

public class ShareSourceInfo {
    @C6593c(mo15949a = "app_name")
    private String appName;
    @C6593c(mo15949a = "img_title")
    private String imgTitle;
    @C6593c(mo15949a = "img_url")
    private ImageModel imgUrl;
    @C6593c(mo15949a = "pkg_name")
    private String pkgName;
    @C6593c(mo15949a = "schema_url")
    private String schemaUrl;
    @C6593c(mo15949a = "title")
    private String title;

    public String getAppName() {
        return this.appName;
    }

    public String getImgTitle() {
        return this.imgTitle;
    }

    public ImageModel getImgUrl() {
        return this.imgUrl;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setImgTitle(String str) {
        this.imgTitle = str;
    }

    public void setImgUrl(ImageModel imageModel) {
        this.imgUrl = imageModel;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
