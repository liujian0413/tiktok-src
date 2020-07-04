package com.p280ss.android.ugc.aweme.followrequest.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.followrequest.model.FollowRequestResponse */
public class FollowRequestResponse extends BaseResponse {
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "max_time")
    public long maxTime;
    @C6593c(mo15949a = "min_time")
    public long minTime;
    @C6593c(mo15949a = "total")
    public int total;
    @C6593c(mo15949a = "request_users")
    public List<User> userRequestList;

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getTotal() {
        return this.total;
    }

    public List<User> getUserRequestList() {
        return this.userRequestList;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
