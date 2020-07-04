package com.p280ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo */
public class MicroAppInfo implements Serializable {
    @C6593c(mo15949a = "app_id")
    public String appId;
    @C6593c(mo15949a = "description")
    public String desc;
    @C6593c(mo15949a = "icon")
    public String icon;
    @C6593c(mo15949a = "card")
    public MiniAppCard miniAppCard;
    @C6593c(mo15949a = "app_name")
    public String name;
    @C6593c(mo15949a = "orientation")
    public int orientation;
    @C6593c(mo15949a = "schema")
    public String schema;
    @C6593c(mo15949a = "state")
    public int state;
    @C6593c(mo15949a = "summary")
    public String summary;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "type")
    public int type;
    @C6593c(mo15949a = "web_url")
    public String webUrl;

    public String getAppId() {
        return this.appId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public MiniAppCard getMiniAppCard() {
        return this.miniAppCard;
    }

    public String getName() {
        return this.name;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getState() {
        return this.state;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isApp() {
        if (this.type == 1 || this.type == 3) {
            return true;
        }
        return false;
    }

    public boolean isGame() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setMiniAppCard(MiniAppCard miniAppCard2) {
        this.miniAppCard = miniAppCard2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
