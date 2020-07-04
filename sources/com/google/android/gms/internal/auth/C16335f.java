package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C14952b;
import com.google.android.gms.auth.api.C14953c;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15249h;

/* renamed from: com.google.android.gms.internal.auth.f */
public final class C16335f extends C15249h<C16336g> {

    /* renamed from: a */
    private final Bundle f45818a;

    public C16335f(Context context, Looper looper, C15244e eVar, C14953c cVar, C15039b bVar, C15040c cVar2) {
        super(context, looper, 16, eVar, bVar, cVar2);
        if (cVar == null) {
            this.f45818a = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: e */
    public final int mo38134e() {
        return C15181e.f39276b;
    }

    /* renamed from: i */
    public final boolean mo38562i() {
        C15244e eVar = this.f39440i;
        return !TextUtils.isEmpty(eVar.mo38582a()) && !eVar.mo38583a(C14952b.f38695a).isEmpty();
    }

    /* renamed from: n */
    public final Bundle mo38567n() {
        return this.f45818a;
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C16336g) {
            return (C16336g) queryLocalInterface;
        }
        return new C16337h(iBinder);
    }
}
