package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.p022v4.app.FragmentActivity;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C15138f {

    /* renamed from: a */
    public final Object f39186a;

    public C15138f(Activity activity) {
        C15267r.m44385a(activity, (Object) "Activity must not be null");
        this.f39186a = activity;
    }

    /* renamed from: a */
    public final boolean mo38425a() {
        return this.f39186a instanceof FragmentActivity;
    }

    /* renamed from: b */
    public final boolean mo38426b() {
        return this.f39186a instanceof Activity;
    }

    /* renamed from: c */
    public final Activity mo38427c() {
        return (Activity) this.f39186a;
    }

    /* renamed from: d */
    public final FragmentActivity mo38428d() {
        return (FragmentActivity) this.f39186a;
    }
}
