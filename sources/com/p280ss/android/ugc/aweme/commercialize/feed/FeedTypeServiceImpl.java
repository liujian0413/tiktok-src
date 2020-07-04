package com.p280ss.android.ugc.aweme.commercialize.feed;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.FeedTypeServiceImpl */
public class FeedTypeServiceImpl implements IFeedTypeService {
    public C24711ae getNonAdType() {
        return FeedType.NONE;
    }

    public C24711ae getRawAdType() {
        return FeedType.RAW_AD;
    }

    public C24711ae valueOf(Aweme aweme) {
        return FeedType.valueOf(aweme);
    }
}
