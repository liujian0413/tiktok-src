package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.DescendantsModel */
public class DescendantsModel implements Serializable {
    @C6593c(mo15949a = "notify_msg")
    public String notifyMsg;
    @C6593c(mo15949a = "platforms")
    public List<String> platforms;

    public String getNotifyMsg() {
        return this.notifyMsg;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public void setNotifyMsg(String str) {
        this.notifyMsg = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }
}
