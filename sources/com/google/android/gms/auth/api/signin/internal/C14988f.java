package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C14972a;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15249h;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
public final class C14988f extends C15249h<C15000r> {

    /* renamed from: a */
    public final GoogleSignInOptions f38834a;

    public C14988f(Context context, Looper looper, C15244e eVar, GoogleSignInOptions googleSignInOptions, C15039b bVar, C15040c cVar) {
        super(context, looper, 91, eVar, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C14972a().mo38094d();
        }
        if (!eVar.f39421c.isEmpty()) {
            C14972a aVar = new C14972a(googleSignInOptions);
            for (Scope a : eVar.f39421c) {
                aVar.mo38089a(a, new Scope[0]);
            }
            googleSignInOptions = aVar.mo38094d();
        }
        this.f38834a = googleSignInOptions;
    }

    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: c */
    public final boolean mo38132c() {
        return true;
    }

    /* renamed from: e */
    public final int mo38134e() {
        return C15181e.f39276b;
    }

    /* renamed from: d */
    public final Intent mo38133d() {
        return C14989g.m43501a(this.f39380b, this.f38834a);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C15000r) {
            return (C15000r) queryLocalInterface;
        }
        return new C15001s(iBinder);
    }
}
