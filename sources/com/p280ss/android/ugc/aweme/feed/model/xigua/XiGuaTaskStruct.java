package com.p280ss.android.ugc.aweme.feed.model.xigua;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct */
public class XiGuaTaskStruct implements Serializable {
    static final long serialVersionUID = 18;
    @C6593c(mo15949a = "desc")
    public String desc;
    @C6593c(mo15949a = "entrance_url")
    public String entranceUrl;
    @C6593c(mo15949a = "icon_url")
    public String iconUrl;
    @C6593c(mo15949a = "is_xigua_task")
    public boolean isXiGuaTask;
    @C6593c(mo15949a = "jump_url")
    public String jumpUrl;
    @C6593c(mo15949a = "switch_type")
    public int switchType;
    @C6593c(mo15949a = "title")
    public String title;

    public String getDesc() {
        return this.desc;
    }

    public String getEntranceUrl() {
        return this.entranceUrl;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isXiGuaTask() {
        return this.isXiGuaTask;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEntranceUrl(String str) {
        this.entranceUrl = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setXiGuaTask(boolean z) {
        this.isXiGuaTask = z;
    }
}
