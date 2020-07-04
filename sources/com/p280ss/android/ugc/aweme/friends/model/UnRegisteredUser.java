package com.p280ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UnRegisteredUser */
public class UnRegisteredUser {
    @C6593c(mo15949a = "invite_status")
    public int inviteStatus;
    @C6593c(mo15949a = "mobile_id")
    public String mobileId;
    @C6593c(mo15949a = "remark_name")
    public String remarkName;

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof UnRegisteredUser) && TextUtils.equals(this.mobileId, ((UnRegisteredUser) obj).mobileId)) {
            return super.equals(obj);
        }
        return false;
    }
}
