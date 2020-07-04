package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15244e.C15246b;
import com.google.android.gms.common.internal.C15256m;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16967e;
import com.google.android.gms.signin.internal.zaj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.z */
public final class C15159z implements C15069at {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15070au f39213a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f39214b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f39215c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C15167c f39216d;

    /* renamed from: e */
    private ConnectionResult f39217e;

    /* renamed from: f */
    private int f39218f;

    /* renamed from: g */
    private int f39219g;

    /* renamed from: h */
    private int f39220h;

    /* renamed from: i */
    private final Bundle f39221i = new Bundle();

    /* renamed from: j */
    private final Set<C15020c> f39222j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C16967e f39223k;

    /* renamed from: l */
    private boolean f39224l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f39225m;

    /* renamed from: n */
    private boolean f39226n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C15256m f39227o;

    /* renamed from: p */
    private boolean f39228p;

    /* renamed from: q */
    private boolean f39229q;

    /* renamed from: r */
    private final C15244e f39230r;

    /* renamed from: s */
    private final Map<C15017a<?>, Boolean> f39231s;

    /* renamed from: t */
    private final C15018a<? extends C16967e, C16962a> f39232t;

    /* renamed from: u */
    private ArrayList<Future<?>> f39233u = new ArrayList<>();

    public C15159z(C15070au auVar, C15244e eVar, Map<C15017a<?>, Boolean> map, C15167c cVar, C15018a<? extends C16967e, C16962a> aVar, Lock lock, Context context) {
        this.f39213a = auVar;
        this.f39230r = eVar;
        this.f39231s = map;
        this.f39216d = cVar;
        this.f39232t = aVar;
        this.f39214b = lock;
        this.f39215c = context;
    }

    /* renamed from: c */
    private static String m44108c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public final void mo38297c() {
    }

    /* renamed from: a */
    public final void mo38292a() {
        this.f39213a.f38990b.clear();
        this.f39225m = false;
        this.f39217e = null;
        this.f39219g = 0;
        this.f39224l = true;
        this.f39226n = false;
        this.f39228p = false;
        HashMap hashMap = new HashMap();
        for (C15017a aVar : this.f39231s.keySet()) {
            C15028f fVar = (C15028f) this.f39213a.f38989a.get(aVar.mo38208b());
            boolean booleanValue = ((Boolean) this.f39231s.get(aVar)).booleanValue();
            if (fVar.mo38218i()) {
                this.f39225m = true;
                if (booleanValue) {
                    this.f39222j.add(aVar.mo38208b());
                } else {
                    this.f39224l = false;
                }
            }
            hashMap.put(fVar, new C15051ab(this, aVar, booleanValue));
        }
        if (this.f39225m) {
            this.f39230r.f39428j = Integer.valueOf(System.identityHashCode(this.f39213a.f38992d));
            C15058ai aiVar = new C15058ai(this, null);
            this.f39223k = (C16967e) this.f39232t.mo38026a(this.f39215c, this.f39213a.f38992d.mo38242c(), this.f39230r, this.f39230r.f39427i, aiVar, aiVar);
        }
        this.f39220h = this.f39213a.f38989a.size();
        this.f39233u.add(C15073ax.m43750a().submit(new C15052ac(this, hashMap)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m44111d() {
        this.f39220h--;
        if (this.f39220h > 0) {
            return false;
        }
        if (this.f39220h < 0) {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m44104b(new ConnectionResult(8, null));
            return false;
        } else if (this.f39217e == null) {
            return true;
        } else {
            this.f39213a.f38991c = this.f39218f;
            m44104b(this.f39217e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m44099a(zaj zaj) {
        if (m44106b(0)) {
            ConnectionResult connectionResult = zaj.f47585a;
            if (connectionResult.mo38154b()) {
                ResolveAccountResponse resolveAccountResponse = zaj.f47586b;
                ConnectionResult connectionResult2 = resolveAccountResponse.f39338a;
                if (!connectionResult2.mo38154b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    m44104b(connectionResult2);
                    return;
                }
                this.f39226n = true;
                this.f39227o = resolveAccountResponse.mo38509a();
                this.f39228p = resolveAccountResponse.f39339b;
                this.f39229q = resolveAccountResponse.f39340c;
                m44112e();
            } else if (m44101a(connectionResult)) {
                m44117g();
                m44112e();
            } else {
                m44104b(connectionResult);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m44112e() {
        if (this.f39220h == 0) {
            if (!this.f39225m || this.f39226n) {
                ArrayList arrayList = new ArrayList();
                this.f39219g = 1;
                this.f39220h = this.f39213a.f38989a.size();
                for (C15020c cVar : this.f39213a.f38989a.keySet()) {
                    if (!this.f39213a.f38990b.containsKey(cVar)) {
                        arrayList.add((C15028f) this.f39213a.f38989a.get(cVar));
                    } else if (m44111d()) {
                        m44115f();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f39233u.add(C15073ax.m43750a().submit(new C15055af(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38294a(Bundle bundle) {
        if (m44106b(1)) {
            if (bundle != null) {
                this.f39221i.putAll(bundle);
            }
            if (m44111d()) {
                m44115f();
            }
        }
    }

    /* renamed from: a */
    public final void mo38295a(ConnectionResult connectionResult, C15017a<?> aVar, boolean z) {
        if (m44106b(1)) {
            m44105b(connectionResult, aVar, z);
            if (m44111d()) {
                m44115f();
            }
        }
    }

    /* renamed from: f */
    private final void m44115f() {
        this.f39213a.mo38321e();
        C15073ax.m43750a().execute(new C15050aa(this));
        if (this.f39223k != null) {
            if (this.f39228p) {
                this.f39223k.mo44182a(this.f39227o, this.f39229q);
            }
            m44100a(false);
        }
        for (C15020c cVar : this.f39213a.f38990b.keySet()) {
            ((C15028f) this.f39213a.f38989a.get(cVar)).mo38215f();
        }
        this.f39213a.f38993e.mo38299a(this.f39221i.isEmpty() ? null : this.f39221i);
    }

    /* renamed from: a */
    public final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38291a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final boolean mo38296b() {
        m44119h();
        m44100a(true);
        this.f39213a.mo38312a((ConnectionResult) null);
        return true;
    }

    /* renamed from: a */
    public final void mo38293a(int i) {
        m44104b(new ConnectionResult(8, null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r7 != false) goto L_0x001d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m44105b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C15017a<?> r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            if (r7 == 0) goto L_0x001d
            boolean r7 = r5.mo38153a()
            if (r7 == 0) goto L_0x000f
        L_0x000d:
            r7 = 1
            goto L_0x001b
        L_0x000f:
            com.google.android.gms.common.c r7 = r4.f39216d
            int r3 = r5.f38846b
            android.content.Intent r7 = r7.getErrorResolutionIntent(r3)
            if (r7 == 0) goto L_0x001a
            goto L_0x000d
        L_0x001a:
            r7 = 0
        L_0x001b:
            if (r7 == 0) goto L_0x0026
        L_0x001d:
            com.google.android.gms.common.ConnectionResult r7 = r4.f39217e
            if (r7 == 0) goto L_0x0025
            int r7 = r4.f39218f
            if (r1 >= r7) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002c
            r4.f39217e = r5
            r4.f39218f = r1
        L_0x002c:
            com.google.android.gms.common.api.internal.au r7 = r4.f39213a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f38990b
            com.google.android.gms.common.api.a$c r6 = r6.mo38208b()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C15159z.m44105b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m44117g() {
        this.f39225m = false;
        this.f39213a.f38992d.f38954c = Collections.emptySet();
        for (C15020c cVar : this.f39222j) {
            if (!this.f39213a.f38990b.containsKey(cVar)) {
                this.f39213a.f38990b.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m44101a(ConnectionResult connectionResult) {
        return this.f39224l && !connectionResult.mo38153a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m44104b(ConnectionResult connectionResult) {
        m44119h();
        m44100a(!connectionResult.mo38153a());
        this.f39213a.mo38312a(connectionResult);
        this.f39213a.f38993e.mo38300a(connectionResult);
    }

    /* renamed from: a */
    private final void m44100a(boolean z) {
        if (this.f39223k != null) {
            if (this.f39223k.mo38216g() && z) {
                this.f39223k.mo44184q();
            }
            this.f39223k.mo38215f();
            this.f39227o = null;
        }
    }

    /* renamed from: h */
    private final void m44119h() {
        ArrayList arrayList = this.f39233u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f39233u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final Set<Scope> m44120i() {
        if (this.f39230r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f39230r.f39420b);
        Map<C15017a<?>, C15246b> map = this.f39230r.f39422d;
        for (C15017a aVar : map.keySet()) {
            if (!this.f39213a.f38990b.containsKey(aVar.mo38208b())) {
                hashSet.addAll(((C15246b) map.get(aVar)).f39437a);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m44106b(int i) {
        if (this.f39219g == i) {
            return true;
        }
        String c = m44108c(this.f39219g);
        String c2 = m44108c(i);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(c2).length());
        sb.append("GoogleApiClient connecting is in step ");
        sb.append(c);
        sb.append(" but received callback for step ");
        sb.append(c2);
        Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
        m44104b(new ConnectionResult(8, null));
        return false;
    }
}
