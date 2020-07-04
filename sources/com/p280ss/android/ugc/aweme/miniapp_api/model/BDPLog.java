package com.p280ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.BDPLog */
public class BDPLog {
    @C6593c(mo15949a = "biz_location")
    public String bizLocation;
    @C6593c(mo15949a = "group_id")
    public String groupId;
    @C6593c(mo15949a = "launch_from")
    public String launchFrom;
    @C6593c(mo15949a = "location")
    public String location;
    @C6593c(mo15949a = "ttid")
    public String ttid;

    public BDPLog() {
    }

    public BDPLog(String str, String str2, String str3) {
        this.launchFrom = str;
        this.location = str2;
        this.groupId = str3;
    }
}
