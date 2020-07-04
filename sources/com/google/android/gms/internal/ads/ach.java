package com.google.android.gms.internal.ads;

import android.content.Context;

final /* synthetic */ class ach implements Runnable {

    /* renamed from: a */
    private final acg f39994a;

    /* renamed from: b */
    private final Context f39995b;

    /* renamed from: c */
    private final String f39996c;

    ach(acg acg, Context context, String str) {
        this.f39994a = acg;
        this.f39995b = context;
        this.f39996c = str;
    }

    public final void run() {
        this.f39994a.mo39164a(this.f39995b, this.f39996c);
    }
}
