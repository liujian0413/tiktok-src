package com.p280ss.android.ugc.aweme.feed.cache;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.a */
public final class C28273a {
    /* renamed from: a */
    public static void m92979a(FeedItemList feedItemList) {
        if (!m92982d(feedItemList)) {
            m92980b(feedItemList);
            m92981c(feedItemList);
        }
    }

    /* renamed from: d */
    private static boolean m92982d(FeedItemList feedItemList) {
        if (feedItemList == null || feedItemList.getItems() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m92980b(FeedItemList feedItemList) {
        try {
            C24671f.m80863m().mo64354a(C22704b.f60414c, feedItemList.getItems());
        } catch (Throwable unused) {
            C6921a.m21562b("CacheDataProcessor", "requestLinkData error");
        }
    }

    /* renamed from: c */
    private static void m92981c(FeedItemList feedItemList) {
        if (!TextUtils.isEmpty(feedItemList.getRequestId())) {
            try {
                C28199ae.m92689a().mo71792a(feedItemList.getRequestId(), feedItemList.logPb);
            } catch (Throwable unused) {
                C6921a.m21562b("CacheDataProcessor", "putAwemeLogPbData error");
            }
        }
    }
}
