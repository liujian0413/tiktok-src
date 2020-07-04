package com.google.android.gms.common.internal.p750a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15249h;

/* renamed from: com.google.android.gms.common.internal.a.j */
public final class C15204j extends C15249h<C15207m> {
    public C15204j(Context context, Looper looper, C15244e eVar, C15039b bVar, C15040c cVar) {
        super(context, looper, 39, eVar, bVar, cVar);
    }

    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.common.service.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof C15207m) {
            return (C15207m) queryLocalInterface;
        }
        return new C15208n(iBinder);
    }
}
