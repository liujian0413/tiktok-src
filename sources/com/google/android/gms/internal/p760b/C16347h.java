package com.google.android.gms.internal.p760b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15249h;

/* renamed from: com.google.android.gms.internal.b.h */
public final class C16347h extends C15249h<C16343d> {
    public C16347h(Context context, Looper looper, C15244e eVar, C15039b bVar, C15040c cVar) {
        super(context, looper, 126, eVar, bVar, cVar);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof C16343d ? (C16343d) queryLocalInterface : new C16344e(iBinder);
    }

    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* renamed from: e */
    public final int mo38134e() {
        return C15181e.f39276b;
    }
}
