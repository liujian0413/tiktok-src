package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16964b;
import com.google.android.gms.signin.C16967e;
import com.google.android.gms.signin.internal.C16970c;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.bp */
public final class C15093bp extends C16970c implements C15039b, C15040c {

    /* renamed from: b */
    private static C15018a<? extends C16967e, C16962a> f39028b = C16964b.f47568a;

    /* renamed from: a */
    public C16967e f39029a;

    /* renamed from: c */
    private final Context f39030c;

    /* renamed from: d */
    private final Handler f39031d;

    /* renamed from: e */
    private final C15018a<? extends C16967e, C16962a> f39032e;

    /* renamed from: f */
    private Set<Scope> f39033f;

    /* renamed from: g */
    private C15244e f39034g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C15096bs f39035h;

    public C15093bp(Context context, Handler handler, C15244e eVar) {
        this(context, handler, eVar, f39028b);
    }

    public C15093bp(Context context, Handler handler, C15244e eVar, C15018a<? extends C16967e, C16962a> aVar) {
        this.f39030c = context;
        this.f39031d = handler;
        this.f39034g = (C15244e) C15267r.m44385a(eVar, (Object) "ClientSettings must not be null");
        this.f39033f = eVar.f39420b;
        this.f39032e = aVar;
    }

    /* renamed from: a */
    public final void mo38349a(C15096bs bsVar) {
        if (this.f39029a != null) {
            this.f39029a.mo38215f();
        }
        this.f39034g.f39428j = Integer.valueOf(System.identityHashCode(this));
        this.f39029a = (C16967e) this.f39032e.mo38026a(this.f39030c, this.f39031d.getLooper(), this.f39034g, this.f39034g.f39427i, this, this);
        this.f39035h = bsVar;
        if (this.f39033f == null || this.f39033f.isEmpty()) {
            this.f39031d.post(new C15094bq(this));
        } else {
            this.f39029a.mo44185r();
        }
    }

    /* renamed from: a */
    public final void mo38348a() {
        if (this.f39029a != null) {
            this.f39029a.mo38215f();
        }
    }

    /* renamed from: a */
    public final void mo38258a(Bundle bundle) {
        this.f39029a.mo44183a(this);
    }

    /* renamed from: a */
    public final void mo38257a(int i) {
        this.f39029a.mo38215f();
    }

    /* renamed from: a */
    public final void mo38259a(ConnectionResult connectionResult) {
        this.f39035h.mo38353b(connectionResult);
    }

    /* renamed from: a */
    public final void mo38289a(zaj zaj) {
        this.f39031d.post(new C15095br(this, zaj));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m43789b(zaj zaj) {
        ConnectionResult connectionResult = zaj.f47585a;
        if (connectionResult.mo38154b()) {
            ResolveAccountResponse resolveAccountResponse = zaj.f47586b;
            ConnectionResult connectionResult2 = resolveAccountResponse.f39338a;
            if (!connectionResult2.mo38154b()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f39035h.mo38353b(connectionResult2);
                this.f39029a.mo38215f();
                return;
            }
            this.f39035h.mo38352a(resolveAccountResponse.mo38509a(), this.f39033f);
        } else {
            this.f39035h.mo38353b(connectionResult);
        }
        this.f39029a.mo38215f();
    }
}
