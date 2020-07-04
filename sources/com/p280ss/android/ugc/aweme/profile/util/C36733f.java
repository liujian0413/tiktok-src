package com.p280ss.android.ugc.aweme.profile.util;

import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.util.f */
final /* synthetic */ class C36733f implements Callable {

    /* renamed from: a */
    private final int f96406a;

    /* renamed from: b */
    private final String f96407b;

    /* renamed from: c */
    private final FeedItemList f96408c;

    C36733f(int i, String str, FeedItemList feedItemList) {
        this.f96406a = i;
        this.f96407b = str;
        this.f96408c = feedItemList;
    }

    public final Object call() {
        return C36729b.m118412b(this.f96406a, this.f96407b, this.f96408c);
    }
}
