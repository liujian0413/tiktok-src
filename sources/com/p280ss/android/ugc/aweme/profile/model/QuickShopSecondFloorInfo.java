package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo */
public class QuickShopSecondFloorInfo implements Serializable {
    @C6593c(mo15949a = "enter_text")
    public String enterText;
    @C6593c(mo15949a = "process_text")
    public String processText;
    @C6593c(mo15949a = "trans_bg_text")
    public String transBgText;

    public String getEnterText() {
        return this.enterText;
    }

    public String getProcessText() {
        return this.processText;
    }

    public String getTransBgText() {
        return this.transBgText;
    }

    public void setEnterText(String str) {
        this.enterText = str;
    }

    public void setProcessText(String str) {
        this.processText = str;
    }

    public void setTransBgText(String str) {
        this.transBgText = str;
    }
}
