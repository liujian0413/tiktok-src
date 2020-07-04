package com.bytedance.android.live.core.performance;

import android.arch.lifecycle.C0043i;
import android.content.Context;

/* renamed from: com.bytedance.android.live.core.performance.c */
final /* synthetic */ class C3226c implements Runnable {

    /* renamed from: a */
    private final C3222b f9926a;

    /* renamed from: b */
    private final String f9927b;

    /* renamed from: c */
    private final C0043i f9928c;

    /* renamed from: d */
    private final Context f9929d;

    /* renamed from: e */
    private final String f9930e;

    C3226c(C3222b bVar, String str, C0043i iVar, Context context, String str2) {
        this.f9926a = bVar;
        this.f9927b = str;
        this.f9928c = iVar;
        this.f9929d = context;
        this.f9930e = str2;
    }

    public final void run() {
        this.f9926a.mo10139a(this.f9927b, this.f9928c, this.f9929d, this.f9930e);
    }
}
