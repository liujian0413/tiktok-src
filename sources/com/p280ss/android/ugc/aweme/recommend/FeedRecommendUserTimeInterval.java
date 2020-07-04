package com.p280ss.android.ugc.aweme.recommend;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "feed_recommend_user_time_interval")
/* renamed from: com.ss.android.ugc.aweme.recommend.FeedRecommendUserTimeInterval */
public final class FeedRecommendUserTimeInterval {
    public static final FeedRecommendUserTimeInterval INSTANCE = new FeedRecommendUserTimeInterval();
    @C6382b
    private static final int ONE = 1;
    @C6382b
    private static final int SEVEN = 7;
    @C6382b(mo15285a = true)
    private static final int THREE = 3;

    private FeedRecommendUserTimeInterval() {
    }

    public static final int getDays() {
        return C6384b.m19835a().mo15287a(FeedRecommendUserTimeInterval.class, true, "feed_recommend_user_time_interval", C6384b.m19835a().mo15295d().feed_recommend_user_time_interval, 3);
    }
}
