package com.p280ss.android.ugc.aweme.p313im.sdk.detail.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.model.GroupPasswordInfo */
public final class GroupPasswordInfo implements Serializable {
    @C6593c(mo15949a = "expire_time")
    private long expireTime;
    @C6593c(mo15949a = "share_data")
    private List<GroupPasswordDetail> groupPasswordDetailList;

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final List<GroupPasswordDetail> getGroupPasswordDetailList() {
        return this.groupPasswordDetailList;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setGroupPasswordDetailList(List<GroupPasswordDetail> list) {
        this.groupPasswordDetailList = list;
    }
}
