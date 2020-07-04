package com.p280ss.android.ugc.aweme.p313im.sdk.detail.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.model.GroupShareInfo */
public final class GroupShareInfo extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "data")
    private GroupPasswordInfo groupPasswordInfo;

    public final GroupPasswordInfo getGroupPasswordInfo() {
        return this.groupPasswordInfo;
    }

    public final void setGroupPasswordInfo(GroupPasswordInfo groupPasswordInfo2) {
        this.groupPasswordInfo = groupPasswordInfo2;
    }
}
