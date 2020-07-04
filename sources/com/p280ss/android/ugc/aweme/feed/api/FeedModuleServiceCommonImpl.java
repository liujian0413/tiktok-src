package com.p280ss.android.ugc.aweme.feed.api;

import android.support.p022v4.app.Fragment;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.C28696u;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.cache.C28288d;
import com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl */
public abstract class FeedModuleServiceCommonImpl implements IFeedModuleService {
    public C28288d getFeedCacheLoader() {
        return C28275c.f74526b;
    }

    public void mobStartRequest(Fragment fragment, String str) {
        new C28696u(fragment).mo73764a(str);
    }

    public void logFeedV3(Fragment fragment, int i, String str, FeedAppLogParams feedAppLogParams) {
        new C28696u(fragment).mo73765b(i, str, feedAppLogParams);
    }

    public void commitFeedRequest(int i, C6309f fVar, Callable callable, int i2, boolean z) {
        C28434i.m93456a(i, fVar, callable, i2, z);
    }

    public void log(Fragment fragment, int i, String str, FeedAppLogParams feedAppLogParams, Exception exc) {
        new C28696u(fragment).mo73762a(i, str, feedAppLogParams, exc);
    }
}
