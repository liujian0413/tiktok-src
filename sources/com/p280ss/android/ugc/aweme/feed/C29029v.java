package com.p280ss.android.ugc.aweme.feed;

import com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.v */
final /* synthetic */ class C29029v implements Callable {

    /* renamed from: a */
    private final int f76461a;

    /* renamed from: b */
    private final FeedAppLogParams f76462b;

    /* renamed from: c */
    private final Exception f76463c;

    /* renamed from: d */
    private final long f76464d;

    /* renamed from: e */
    private final String f76465e;

    /* renamed from: f */
    private final String f76466f;

    /* renamed from: g */
    private final String f76467g;

    /* renamed from: h */
    private final String f76468h;

    /* renamed from: i */
    private final boolean f76469i;

    /* renamed from: j */
    private final long f76470j;

    C29029v(int i, FeedAppLogParams feedAppLogParams, Exception exc, long j, String str, String str2, String str3, String str4, boolean z, long j2) {
        this.f76461a = i;
        this.f76462b = feedAppLogParams;
        this.f76463c = exc;
        this.f76464d = j;
        this.f76465e = str;
        this.f76466f = str2;
        this.f76467g = str3;
        this.f76468h = str4;
        this.f76469i = z;
        this.f76470j = j2;
    }

    public final Object call() {
        return C28696u.m94413a(this.f76461a, this.f76462b, this.f76463c, this.f76464d, this.f76465e, this.f76466f, this.f76467g, this.f76468h, this.f76469i, this.f76470j);
    }
}
