package com.p280ss.android.ugc.aweme.feed.p1227c;

import com.p280ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.c.x */
final /* synthetic */ class C28270x implements Callable {

    /* renamed from: a */
    private final C28256q f74517a;

    /* renamed from: b */
    private final int f74518b;

    /* renamed from: c */
    private final long f74519c;

    /* renamed from: d */
    private final long f74520d;

    /* renamed from: e */
    private final Video f74521e;

    C28270x(C28256q qVar, int i, long j, long j2, Video video) {
        this.f74517a = qVar;
        this.f74518b = i;
        this.f74519c = j;
        this.f74520d = j2;
        this.f74521e = video;
    }

    public final Object call() {
        return this.f74517a.mo71913a(this.f74518b, this.f74519c, this.f74520d, this.f74521e);
    }
}
