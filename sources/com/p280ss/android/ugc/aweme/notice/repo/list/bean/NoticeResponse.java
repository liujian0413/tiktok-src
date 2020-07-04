package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse */
public class NoticeResponse extends BaseResponse {
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "notice_list")
    public List<BaseNotice> items;
    @C6593c(mo15949a = "last_read_time")
    public long lastReadTime;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPbBean;
    @C6593c(mo15949a = "max_time")
    public long maxTime;
    @C6593c(mo15949a = "min_time")
    public long minTime;
    @C6593c(mo15949a = "total")
    public int total;

    public List<BaseNotice> getItems() {
        return this.items;
    }

    public long getLastReadTime() {
        return this.lastReadTime;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<BaseNotice> list) {
        this.items = list;
    }

    public void setLastReadTime(long j) {
        this.lastReadTime = j;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setStatusCode(int i) {
        this.status_code = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
