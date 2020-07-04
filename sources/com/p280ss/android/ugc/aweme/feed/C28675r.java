package com.p280ss.android.ugc.aweme.feed;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFollowFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedTimeLineFragment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.StubFragment;

/* renamed from: com.ss.android.ugc.aweme.feed.r */
public final class C28675r {
    /* renamed from: a */
    private static Fragment m94343a(int i) {
        switch (i) {
            case 1:
                return new FeedFollowFragment();
            case 2:
                return new FeedTimeLineFragment();
            case 7:
                return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getNearbyFragment();
            case 8:
                return new StubFragment();
            default:
                return new FeedRecommendFragment();
        }
    }

    /* renamed from: a */
    public static Fragment m94344a(int i, String str) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", i);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str);
        Fragment a = m94343a(i);
        a.setArguments(bundle);
        return a;
    }
}
