package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.WatchStatus */
public class WatchStatus extends BaseResponse {
    @C6593c(mo15949a = "follow_status")
    public int followStatus;
    public String userId;
    @C6593c(mo15949a = "watch_status")
    public int watchStatus;

    public FollowStatus cpoyToFollowStatus() {
        FollowStatus followStatus2 = new FollowStatus();
        followStatus2.userId = this.userId;
        followStatus2.followStatus = this.followStatus;
        followStatus2.watchStatus = this.watchStatus;
        return followStatus2;
    }
}
