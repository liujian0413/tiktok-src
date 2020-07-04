package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C14823e;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.vt */
public final class C16122vt extends C14823e<C16128vz> {
    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.ads.service.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public C16122vt(Context context, Looper looper, C15232a aVar, C15233b bVar) {
        super(C16178xv.m52403a(context), looper, 8, aVar, bVar, null);
    }

    /* renamed from: q */
    public final C16128vz mo39918q() throws DeadObjectException {
        return (C16128vz) super.mo38568o();
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof C16128vz) {
            return (C16128vz) queryLocalInterface;
        }
        return new C16131wb(iBinder);
    }
}
