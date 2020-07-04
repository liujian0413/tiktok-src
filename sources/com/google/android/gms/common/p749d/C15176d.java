package com.google.android.gms.common.p749d;

import android.content.Context;

/* renamed from: com.google.android.gms.common.d.d */
public final class C15176d {

    /* renamed from: b */
    private static C15176d f39251b = new C15176d();

    /* renamed from: a */
    private C15174b f39252a;

    /* renamed from: b */
    private final synchronized C15174b m44160b(Context context) {
        if (this.f39252a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f39252a = new C15174b(context);
        }
        return this.f39252a;
    }

    /* renamed from: a */
    public static C15174b m44159a(Context context) {
        return f39251b.m44160b(context);
    }
}
