package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.internal.measurement.v */
public final class C16699v {

    /* renamed from: a */
    public final Context f46655a;

    /* renamed from: b */
    public final Context f46656b;

    public C16699v(Context context) {
        C15267r.m44384a(context);
        Context applicationContext = context.getApplicationContext();
        C15267r.m44385a(applicationContext, (Object) "Application context can't be null");
        this.f46655a = applicationContext;
        this.f46656b = applicationContext;
    }
}
