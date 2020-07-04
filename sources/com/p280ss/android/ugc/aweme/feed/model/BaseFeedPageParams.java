package com.p280ss.android.ugc.aweme.feed.model;

import com.p280ss.android.ugc.aweme.feed.param.FeedParam;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams */
public class BaseFeedPageParams {
    public int awemeFromPage;
    public String cid;
    public String eventType;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public int pageType;
    public FeedParam param = new FeedParam();
    public boolean showVote;

    public static BaseFeedPageParams newBuilder() {
        return new BaseFeedPageParams();
    }

    public String getPoiTabType() {
        if (this.param != null) {
            return this.param.getPoiTabType();
        }
        return null;
    }

    public String getPreviousPage() {
        if (this.param != null) {
            return this.param.getPreviousPage();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseFeedPageParams{awemeFromPage=");
        sb.append(this.awemeFromPage);
        sb.append(", eventType='");
        sb.append(this.eventType);
        sb.append('\'');
        sb.append(", isMyProfile=");
        sb.append(this.isMyProfile);
        sb.append(", isFromPostList=");
        sb.append(this.isFromPostList);
        sb.append(", pageType=");
        sb.append(this.pageType);
        sb.append('}');
        return sb.toString();
    }

    public BaseFeedPageParams setAwemeFromPage(int i) {
        this.awemeFromPage = i;
        return this;
    }

    public BaseFeedPageParams setCid(String str) {
        this.cid = str;
        return this;
    }

    public BaseFeedPageParams setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public BaseFeedPageParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public BaseFeedPageParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public BaseFeedPageParams setPageType(int i) {
        this.pageType = i;
        return this;
    }

    public BaseFeedPageParams setParam(FeedParam feedParam) {
        this.param = feedParam;
        return this;
    }

    public BaseFeedPageParams setShowVote(boolean z) {
        this.showVote = z;
        return this;
    }
}
