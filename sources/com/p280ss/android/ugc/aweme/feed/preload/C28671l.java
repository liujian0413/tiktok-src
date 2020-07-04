package com.p280ss.android.ugc.aweme.feed.preload;

import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.l */
final /* synthetic */ class C28671l implements Callable {

    /* renamed from: a */
    private final C28666j f75532a;

    /* renamed from: b */
    private final FeedItemList f75533b;

    C28671l(C28666j jVar, FeedItemList feedItemList) {
        this.f75532a = jVar;
        this.f75533b = feedItemList;
    }

    public final Object call() {
        return this.f75532a.mo73727a(this.f75533b);
    }
}
