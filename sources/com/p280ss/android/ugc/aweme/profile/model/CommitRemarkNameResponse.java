package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse */
public class CommitRemarkNameResponse {
    @C6593c(mo15949a = "remark_name")
    public String remarkName;
    @C6593c(mo15949a = "status_code")
    public int statusCode;
    @C6593c(mo15949a = "status_msg")
    public String statusMsg;

    public boolean isOK() {
        if (this.statusCode == 0) {
            return true;
        }
        return false;
    }
}
