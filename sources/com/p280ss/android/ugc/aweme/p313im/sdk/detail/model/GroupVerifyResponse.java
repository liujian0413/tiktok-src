package com.p280ss.android.ugc.aweme.p313im.sdk.detail.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.model.GroupVerifyResponse */
public final class GroupVerifyResponse extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "data")
    private GroupVerifyInfo groupVerifyInfo;

    public final GroupVerifyInfo getGroupVerifyInfo() {
        return this.groupVerifyInfo;
    }

    public final void setGroupVerifyInfo(GroupVerifyInfo groupVerifyInfo2) {
        this.groupVerifyInfo = groupVerifyInfo2;
    }
}
