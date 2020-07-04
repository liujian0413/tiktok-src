package com.p280ss.android.ugc.aweme.p313im.sdk.group.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.GroupCheckMsg */
public final class GroupCheckMsg implements Serializable {
    @C6593c(mo15949a = "invalid_members")
    private List<? extends IMUser> invalidMembers;
    @C6593c(mo15949a = "status_code")
    private Integer statusCode;
    @C6593c(mo15949a = "status_msg")
    private String statusMsg;

    public final List<IMUser> getInvalidMembers() {
        return this.invalidMembers;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setInvalidMembers(List<? extends IMUser> list) {
        this.invalidMembers = list;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
