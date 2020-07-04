package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TaskAnchorInfo */
public class TaskAnchorInfo implements Serializable {
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "icon")
    UrlModel icon;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    String f70743id;
    @C6593c(mo15949a = "mp_url")
    String mpUrl;
    @C6593c(mo15949a = "open_url")
    String openUrl;
    @C6593c(mo15949a = "title")
    String title;
    @C6593c(mo15949a = "type")
    int type = -1;
    @C6593c(mo15949a = "web_url")
    String webUrl;

    public String getContent() {
        return this.content;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f70743id;
    }

    public String getMpUrl() {
        return this.mpUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
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

    public void setContent(String str) {
        this.content = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setId(String str) {
        this.f70743id = str;
    }

    public void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
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
