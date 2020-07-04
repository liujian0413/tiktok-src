package com.bytedance.android.live.broadcast;

import com.bytedance.android.livesdk.log.C8444d;
import com.p280ss.avframework.utils.AVLog.ILogFilter;

/* renamed from: com.bytedance.android.live.broadcast.c */
final /* synthetic */ class C2502c implements ILogFilter {

    /* renamed from: a */
    private final C8444d f8091a;

    /* renamed from: b */
    private final String f8092b;

    C2502c(C8444d dVar, String str) {
        this.f8091a = dVar;
        this.f8092b = str;
    }

    public final void print(int i, String str, String str2, Throwable th) {
        LiveBroadcastFragment.m10049a(this.f8091a, this.f8092b, i, str, str2, th);
    }
}
