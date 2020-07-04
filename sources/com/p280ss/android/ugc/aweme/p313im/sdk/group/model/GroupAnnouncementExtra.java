package com.p280ss.android.ugc.aweme.p313im.sdk.group.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.GroupAnnouncementExtra */
public final class GroupAnnouncementExtra implements Serializable {
    @C6593c(mo15949a = "update_time")
    private long updateTime = -1;
    @C6593c(mo15949a = "update_im_user_id")
    private long updateUserId = -1;

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getUpdateUserId() {
        return this.updateUserId;
    }

    public final boolean isValid() {
        if (this.updateTime <= 0 || this.updateUserId <= 0) {
            return false;
        }
        return true;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUpdateUserId(long j) {
        this.updateUserId = j;
    }
}
