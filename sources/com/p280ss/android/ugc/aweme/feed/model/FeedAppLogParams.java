package com.p280ss.android.ugc.aweme.feed.model;

import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedAppLogParams */
public class FeedAppLogParams {
    public FeedItemList mData;
    public List<Aweme> mItems;
    public FeedItemList mLastFeedItemList;

    public FeedAppLogParams(FeedItemList feedItemList, FeedItemList feedItemList2, List<Aweme> list) {
        this.mData = feedItemList;
        this.mLastFeedItemList = feedItemList2;
        this.mItems = list;
    }
}
