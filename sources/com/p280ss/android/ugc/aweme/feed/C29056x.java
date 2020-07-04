package com.p280ss.android.ugc.aweme.feed;

import com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.x */
final /* synthetic */ class C29056x implements Callable {

    /* renamed from: a */
    private final C28696u f76643a;

    /* renamed from: b */
    private final int f76644b;

    /* renamed from: c */
    private final FeedAppLogParams f76645c;

    /* renamed from: d */
    private final long f76646d;

    /* renamed from: e */
    private final String f76647e;

    /* renamed from: f */
    private final String f76648f;

    C29056x(C28696u uVar, int i, FeedAppLogParams feedAppLogParams, long j, String str, String str2) {
        this.f76643a = uVar;
        this.f76644b = i;
        this.f76645c = feedAppLogParams;
        this.f76646d = j;
        this.f76647e = str;
        this.f76648f = str2;
    }

    public final Object call() {
        return this.f76643a.mo73759a(this.f76644b, this.f76645c, this.f76646d, this.f76647e, this.f76648f);
    }
}
