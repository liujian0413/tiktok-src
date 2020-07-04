package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.j.g */
final /* synthetic */ class C28484g implements Callable {

    /* renamed from: a */
    private final C28318an f75079a;

    /* renamed from: b */
    private final String f75080b;

    /* renamed from: c */
    private final FeedParam f75081c;

    C28484g(C28318an anVar, String str, FeedParam feedParam) {
        this.f75079a = anVar;
        this.f75080b = str;
        this.f75081c = feedParam;
    }

    public final Object call() {
        return C28483f.m93624a(this.f75079a, this.f75080b, this.f75081c);
    }
}
