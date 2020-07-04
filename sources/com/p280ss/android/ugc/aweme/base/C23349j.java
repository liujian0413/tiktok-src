package com.p280ss.android.ugc.aweme.base;

import android.net.Uri;

/* renamed from: com.ss.android.ugc.aweme.base.j */
final /* synthetic */ class C23349j implements Runnable {

    /* renamed from: a */
    private final Uri f61435a;

    /* renamed from: b */
    private final long f61436b;

    /* renamed from: c */
    private final boolean f61437c;

    C23349j(Uri uri, long j, boolean z) {
        this.f61435a = uri;
        this.f61436b = j;
        this.f61437c = z;
    }

    public final void run() {
        C23347h.m76606a(this.f61435a, this.f61436b, this.f61437c);
    }
}
