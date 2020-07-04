package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.cj */
final class C15117cj extends C15085bh {

    /* renamed from: a */
    private final /* synthetic */ Dialog f39087a;

    /* renamed from: b */
    private final /* synthetic */ C15116ci f39088b;

    C15117cj(C15116ci ciVar, Dialog dialog) {
        this.f39088b = ciVar;
        this.f39087a = dialog;
    }

    /* renamed from: a */
    public final void mo38309a() {
        this.f39088b.f39085a.mo38377f();
        if (this.f39087a.isShowing()) {
            C15118ck.m43872a(this.f39087a);
        }
    }
}
