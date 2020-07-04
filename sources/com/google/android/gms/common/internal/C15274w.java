package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.w */
final class C15274w extends C15248g {

    /* renamed from: a */
    private final /* synthetic */ Intent f39468a;

    /* renamed from: b */
    private final /* synthetic */ Activity f39469b;

    /* renamed from: c */
    private final /* synthetic */ int f39470c;

    C15274w(Intent intent, Activity activity, int i) {
        this.f39468a = intent;
        this.f39469b = activity;
        this.f39470c = i;
    }

    /* renamed from: a */
    public final void mo38590a() {
        if (this.f39468a != null) {
            this.f39469b.startActivityForResult(this.f39468a, this.f39470c);
        }
    }
}
