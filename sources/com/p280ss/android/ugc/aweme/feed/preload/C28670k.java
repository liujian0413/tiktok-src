package com.p280ss.android.ugc.aweme.feed.preload;

import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.k */
final /* synthetic */ class C28670k implements Callable {

    /* renamed from: a */
    private final C28666j f75528a;

    /* renamed from: b */
    private final List f75529b;

    /* renamed from: c */
    private final FeedItemList f75530c;

    /* renamed from: d */
    private final FeedItemList f75531d;

    C28670k(C28666j jVar, List list, FeedItemList feedItemList, FeedItemList feedItemList2) {
        this.f75528a = jVar;
        this.f75529b = list;
        this.f75530c = feedItemList;
        this.f75531d = feedItemList2;
    }

    public final Object call() {
        return this.f75528a.mo73728a(this.f75529b, this.f75530c, this.f75531d);
    }
}
