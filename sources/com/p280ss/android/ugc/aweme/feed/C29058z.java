package com.p280ss.android.ugc.aweme.feed;

import com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.z */
final /* synthetic */ class C29058z implements Callable {

    /* renamed from: a */
    private final boolean f76654a;

    /* renamed from: b */
    private final int f76655b;

    /* renamed from: c */
    private final long f76656c;

    /* renamed from: d */
    private final FeedAppLogParams f76657d;

    /* renamed from: e */
    private final String f76658e;

    /* renamed from: f */
    private final long f76659f;

    C29058z(boolean z, int i, long j, FeedAppLogParams feedAppLogParams, String str, long j2) {
        this.f76654a = z;
        this.f76655b = i;
        this.f76656c = j;
        this.f76657d = feedAppLogParams;
        this.f76658e = str;
        this.f76659f = j2;
    }

    public final Object call() {
        return C28696u.m94414a(this.f76654a, this.f76655b, this.f76656c, this.f76657d, this.f76658e, this.f76659f);
    }
}
