package com.p280ss.android.ugc.aweme.recommend;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "FeedRecommendUserTestMode")
/* renamed from: com.ss.android.ugc.aweme.recommend.FeedRecommendUserTestMode */
public final class FeedRecommendUserTestMode {
    @C6382b(mo15285a = true)
    private static final boolean DISABLED = false;
    @C6382b
    private static final boolean ENABLED = true;
    public static final FeedRecommendUserTestMode INSTANCE = new FeedRecommendUserTestMode();

    private FeedRecommendUserTestMode() {
    }

    public static final boolean isTestMode() {
        return C6384b.m19835a().mo15292a(FeedRecommendUserTestMode.class, true, "FeedRecommendUserTestMode", C6384b.m19835a().mo15295d().FeedRecommendUserTestMode, false);
    }
}
