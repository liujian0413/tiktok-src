package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.measurement.internal.cb */
public final class C16856cb {

    /* renamed from: a */
    final Context f47109a;

    /* renamed from: b */
    String f47110b;

    /* renamed from: c */
    String f47111c;

    /* renamed from: d */
    String f47112d;

    /* renamed from: e */
    boolean f47113e = true;

    /* renamed from: f */
    Boolean f47114f;

    /* renamed from: g */
    C16948m f47115g;

    public C16856cb(Context context, C16948m mVar) {
        C15267r.m44384a(context);
        Context applicationContext = context.getApplicationContext();
        C15267r.m44384a(applicationContext);
        this.f47109a = applicationContext;
        if (mVar != null) {
            this.f47115g = mVar;
            this.f47110b = mVar.f47479f;
            this.f47111c = mVar.f47478e;
            this.f47112d = mVar.f47477d;
            this.f47113e = mVar.f47476c;
            if (mVar.f47480g != null) {
                this.f47114f = Boolean.valueOf(mVar.f47480g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
