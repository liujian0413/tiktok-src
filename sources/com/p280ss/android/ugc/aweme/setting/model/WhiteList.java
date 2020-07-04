package com.p280ss.android.ugc.aweme.setting.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.setting.model.WhiteList */
public class WhiteList {
    @C6593c(mo15949a = "long_whitelist")
    public String[] longWhiteList;
    @C6593c(mo15949a = "short_whitelist")
    public String[] shortWhiteList;

    public String[] getLongWhiteList() {
        if (this.longWhiteList == null) {
            this.longWhiteList = new String[0];
        }
        return this.longWhiteList;
    }

    public String[] getShortWhiteList() {
        if (this.shortWhiteList == null) {
            this.shortWhiteList = new String[0];
        }
        return this.shortWhiteList;
    }
}
