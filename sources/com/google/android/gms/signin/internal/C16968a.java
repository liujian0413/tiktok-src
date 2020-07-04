package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C14984b;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15231d.C15234c;
import com.google.android.gms.common.internal.C15231d.C15235d;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15249h;
import com.google.android.gms.common.internal.C15256m;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16967e;

/* renamed from: com.google.android.gms.signin.internal.a */
public final class C16968a extends C15249h<C16973f> implements C16967e {

    /* renamed from: a */
    private final boolean f47576a;

    /* renamed from: j */
    private final C15244e f47577j;

    /* renamed from: k */
    private final Bundle f47578k;

    /* renamed from: l */
    private Integer f47579l;

    private C16968a(Context context, Looper looper, boolean z, C15244e eVar, Bundle bundle, C15039b bVar, C15040c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.f47576a = true;
        this.f47577j = eVar;
        this.f47578k = bundle;
        this.f47579l = eVar.f39428j;
    }

    /* renamed from: a */
    public final String mo38130a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: b */
    public final String mo38131b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: e */
    public final int mo38134e() {
        return C15181e.f39276b;
    }

    public C16968a(Context context, Looper looper, boolean z, C15244e eVar, C16962a aVar, C15039b bVar, C15040c cVar) {
        this(context, looper, true, eVar, m56403a(eVar), bVar, cVar);
    }

    /* renamed from: i */
    public final boolean mo38562i() {
        return this.f47576a;
    }

    /* renamed from: a */
    public final void mo44182a(C15256m mVar, boolean z) {
        try {
            ((C16973f) mo38568o()).mo44189a(mVar, this.f47579l.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: q */
    public final void mo39918q() {
        try {
            ((C16973f) mo38568o()).mo44188a(this.f47579l.intValue());
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo44183a(C16971d dVar) {
        C15267r.m44385a(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f47577j.mo38584b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = C14984b.m43475a(this.f39380b).mo38118a();
            }
            ((C16973f) mo38568o()).mo44190a(new zah(new ResolveAccountRequest(b, this.f47579l.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            try {
                dVar.mo38289a(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: n */
    public final Bundle mo38567n() {
        if (!this.f39380b.getPackageName().equals(this.f47577j.f39425g)) {
            this.f47578k.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f47577j.f39425g);
        }
        return this.f47578k;
    }

    /* renamed from: r */
    public final void mo44185r() {
        mo38555a((C15234c) new C15235d());
    }

    /* renamed from: a */
    private static Bundle m56403a(C15244e eVar) {
        C16962a aVar = eVar.f39427i;
        Integer num = eVar.f39428j;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.f39419a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aVar != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", aVar.f47560b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", aVar.f47561c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", aVar.f47562d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", aVar.f47563e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", aVar.f47564f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", aVar.f47565g);
            if (aVar.f47566h != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", aVar.f47566h.longValue());
            }
            if (aVar.f47567i != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", aVar.f47567i.longValue());
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo38129a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C16973f) {
            return (C16973f) queryLocalInterface;
        }
        return new C16974g(iBinder);
    }
}
