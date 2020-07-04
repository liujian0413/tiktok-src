package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C14941a.C14942a;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15249h;

/* renamed from: com.google.android.gms.internal.auth-api.f */
public final class C16325f extends C15249h<C16327h> {

    /* renamed from: a */
    public final C14942a f45813a;

    public C16325f(Context context, Looper looper, C15244e eVar, C14942a aVar, C15039b bVar, C15040c cVar) {
        super(context, looper, 68, eVar, bVar, cVar);
        this.f45813a = aVar;
    }

    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: e */
    public final int mo38134e() {
        return 12800000;
    }

    /* renamed from: n */
    public final Bundle mo38567n() {
        return this.f45813a == null ? new Bundle() : this.f45813a.mo38023a();
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C16327h) {
            return (C16327h) queryLocalInterface;
        }
        return new C16328i(iBinder);
    }
}
