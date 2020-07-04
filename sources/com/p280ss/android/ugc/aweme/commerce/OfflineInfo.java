package com.p280ss.android.ugc.aweme.commerce;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.OfflineInfo */
public class OfflineInfo implements Serializable {
    @C6593c(mo15949a = "action")
    public String action;
    @C6593c(mo15949a = "offline_info_type")
    public int offlineInfoType;
    @C6593c(mo15949a = "text")
    public String text;

    public String getAction() {
        return this.action;
    }

    public int getOfflineInfoType() {
        return this.offlineInfoType;
    }

    public String getText() {
        return this.text;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setOfflineInfoType(int i) {
        this.offlineInfoType = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
