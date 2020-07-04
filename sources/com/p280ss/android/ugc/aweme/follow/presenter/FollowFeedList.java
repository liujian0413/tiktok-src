package com.p280ss.android.ugc.aweme.follow.presenter;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.follow.C29436a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.FollowFeedList */
public class FollowFeedList extends BaseResponse implements C6866d, Cloneable {
    @C6593c(mo15949a = "snapshot_control")
    private int cacheControl;
    long cursor;
    @C6593c(mo15949a = "err_msg")
    private String errMsg;
    @C6593c(mo15949a = "feed_type")
    private int feedType;
    @C6593c(mo15949a = "fetch_recommend")
    private int fetchRecommend;
    @C6593c(mo15949a = "has_more")
    private int hasMore;
    @C6593c(mo15949a = "is_recommend")
    int isRecommend;
    @C6593c(mo15949a = "last_view")
    C29436a lastViewData;
    int level;
    @C6593c(mo15949a = "log_pb")
    private LogPbBean logPb;
    @C6593c(mo15949a = "data")
    private List<FollowFeed> mItems;
    @C6593c(mo15949a = "max_cursor")
    long maxCursor;
    @C6593c(mo15949a = "min_cursor")
    long minCursor;
    @C6593c(mo15949a = "need_change_snapshot")
    private int needCache;
    @C6593c(mo15949a = "need_delete_snapshot")
    private int needDeleteCache;
    @C6593c(mo15949a = "new_item_count")
    private int newItemCount;
    @C6593c(mo15949a = "new_room_count")
    private int newLiveCount;
    @C6593c(mo15949a = "rid")
    String requestId;
    @C6593c(mo15949a = "up_phone_notice")
    int upPhoneNotice;
    @C6593c(mo15949a = "update_item_count")
    private int updateItemCount;

    public long getCursor() {
        return this.cursor;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getFetchRecommend() {
        return this.fetchRecommend;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public int getIsRecommend() {
        return this.isRecommend;
    }

    public List<FollowFeed> getItems() {
        return this.mItems;
    }

    public C29436a getLastViewData() {
        return this.lastViewData;
    }

    public int getLevel() {
        return this.level;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getNewItemCount() {
        return this.newItemCount;
    }

    public int getNewLiveCount() {
        return this.newLiveCount;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getUpPhoneNotice() {
        return this.upPhoneNotice;
    }

    public int getUpdateItemCount() {
        return this.updateItemCount;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean needCache() {
        if (this.needCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needDeleteCache() {
        if (this.needDeleteCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needUseCache() {
        if (this.cacheControl == 1) {
            return true;
        }
        return false;
    }

    public FollowFeedList clone() {
        try {
            FollowFeedList followFeedList = (FollowFeedList) super.clone();
            followFeedList.errMsg = this.errMsg;
            followFeedList.hasMore = this.hasMore;
            followFeedList.minCursor = this.minCursor;
            followFeedList.maxCursor = this.maxCursor;
            followFeedList.requestId = this.requestId;
            followFeedList.mItems = (ArrayList) ((ArrayList) this.mItems).clone();
            followFeedList.fetchRecommend = this.fetchRecommend;
            followFeedList.logPb = this.logPb;
            followFeedList.cursor = this.cursor;
            followFeedList.level = this.level;
            followFeedList.lastViewData = this.lastViewData;
            followFeedList.newItemCount = this.newItemCount;
            followFeedList.newLiveCount = this.newLiveCount;
            followFeedList.feedType = this.feedType;
            followFeedList.updateItemCount = this.updateItemCount;
            return followFeedList;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setFetchRecommend(int i) {
        this.fetchRecommend = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setIsRecommend(int i) {
        this.isRecommend = i;
    }

    public void setItems(List<FollowFeed> list) {
        this.mItems = list;
    }

    public void setLastViewData(C29436a aVar) {
        this.lastViewData = aVar;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setNewItemCount(int i) {
        this.newItemCount = i;
    }

    public void setNewLiveCount(int i) {
        this.newLiveCount = i;
    }

    public void setUpPhoneNotice(int i) {
        this.upPhoneNotice = i;
    }

    public void setUpdateItemCount(int i) {
        this.updateItemCount = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
        for (FollowFeed requestId2 : this.mItems) {
            requestId2.setRequestId(str);
        }
    }
}
