package com.bytedance.android.livesdk.adapter;

import android.app.ProgressDialog;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.adapter.c */
final /* synthetic */ class C3880c implements C7326g {

    /* renamed from: a */
    private final C38762 f11596a;

    /* renamed from: b */
    private final ProgressDialog f11597b;

    C3880c(C38762 r1, ProgressDialog progressDialog) {
        this.f11596a = r1;
        this.f11597b = progressDialog;
    }

    public final void accept(Object obj) {
        this.f11596a.mo11416a(this.f11597b, (Throwable) obj);
    }
}
