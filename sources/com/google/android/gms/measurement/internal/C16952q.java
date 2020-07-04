package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.internal.C15231d;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C16952q extends C15231d<C16944i> {
    public C16952q(Context context, Looper looper, C15232a aVar, C15233b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: e */
    public final int mo38134e() {
        return C15181e.f39276b;
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C16944i) {
            return (C16944i) queryLocalInterface;
        }
        return new C16946k(iBinder);
    }
}
