package com.p280ss.android.ugc.aweme.p313im.sdk.relations.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationResponse */
public class RelationResponse extends BaseResponse {
    @C6593c(mo15949a = "followings")
    List<IMUser> followings;
    @C6593c(mo15949a = "has_more")
    int hasMore;
    @C6593c(mo15949a = "max_time")
    long maxTime;
    @C6593c(mo15949a = "min_time")
    long minTime;
    @C6593c(mo15949a = "next_req_count")
    int nextReqCount;

    public List<IMUser> getFollowings() {
        return this.followings;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getNextReqCount() {
        return this.nextReqCount;
    }

    public void setFollowings(List<IMUser> list) {
        this.followings = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setNextReqCount(int i) {
        this.nextReqCount = i;
    }
}
