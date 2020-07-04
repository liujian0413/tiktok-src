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
/* renamed from: com.google.android.gms.internal.ads.ik */
public final class C15763ik extends C14823e<C15769iq> {
    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    C15763ik(Context context, Looper looper, C15232a aVar, C15233b bVar) {
        super(C16178xv.m52403a(context), looper, 166, aVar, bVar, null);
    }

    /* renamed from: q */
    public final C15769iq mo39918q() throws DeadObjectException {
        return (C15769iq) super.mo38568o();
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof C15769iq) {
            return (C15769iq) queryLocalInterface;
        }
        return new C15770ir(iBinder);
    }
}
