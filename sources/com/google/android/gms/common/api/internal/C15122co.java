package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.base.C16355d;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16967e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.co */
final class C15122co implements C15086bi {

    /* renamed from: a */
    private final Context f39092a;

    /* renamed from: b */
    private final C15061al f39093b;

    /* renamed from: c */
    private final Looper f39094c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C15070au f39095d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15070au f39096e;

    /* renamed from: f */
    private final Map<C15020c<?>, C15070au> f39097f;

    /* renamed from: g */
    private final Set<C15144k> f39098g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final C15028f f39099h;

    /* renamed from: i */
    private Bundle f39100i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ConnectionResult f39101j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ConnectionResult f39102k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f39103l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Lock f39104m;

    /* renamed from: n */
    private int f39105n = 0;

    /* renamed from: a */
    public static C15122co m43879a(Context context, C15061al alVar, Lock lock, Looper looper, C15167c cVar, Map<C15020c<?>, C15028f> map, C15244e eVar, Map<C15017a<?>, Boolean> map2, C15018a<? extends C16967e, C16962a> aVar, ArrayList<C15120cm> arrayList) {
        Map<C15017a<?>, Boolean> map3 = map2;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        C15028f fVar = null;
        for (Entry entry : map.entrySet()) {
            C15028f fVar2 = (C15028f) entry.getValue();
            if (fVar2.mo38132c()) {
                fVar = fVar2;
            }
            if (fVar2.mo38218i()) {
                arrayMap.put((C15020c) entry.getKey(), fVar2);
            } else {
                arrayMap2.put((C15020c) entry.getKey(), fVar2);
            }
        }
        C15267r.m44391a(!arrayMap.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (C15017a aVar2 : map2.keySet()) {
            C15020c b = aVar2.mo38208b();
            if (arrayMap.containsKey(b)) {
                arrayMap3.put(aVar2, (Boolean) map3.get(aVar2));
            } else if (arrayMap2.containsKey(b)) {
                arrayMap4.put(aVar2, (Boolean) map3.get(aVar2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            C15120cm cmVar = (C15120cm) obj;
            if (arrayMap3.containsKey(cmVar.f39089a)) {
                arrayList2.add(cmVar);
            } else if (arrayMap4.containsKey(cmVar.f39089a)) {
                arrayList3.add(cmVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        C15122co coVar = new C15122co(context, alVar, lock, looper, cVar, arrayMap, arrayMap2, eVar, aVar, fVar, arrayList2, arrayList3, arrayMap3, arrayMap4);
        return coVar;
    }

    private C15122co(Context context, C15061al alVar, Lock lock, Looper looper, C15167c cVar, Map<C15020c<?>, C15028f> map, Map<C15020c<?>, C15028f> map2, C15244e eVar, C15018a<? extends C16967e, C16962a> aVar, C15028f fVar, ArrayList<C15120cm> arrayList, ArrayList<C15120cm> arrayList2, Map<C15017a<?>, Boolean> map3, Map<C15017a<?>, Boolean> map4) {
        this.f39092a = context;
        this.f39093b = alVar;
        this.f39104m = lock;
        this.f39094c = looper;
        this.f39099h = fVar;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C15167c cVar2 = cVar;
        C15070au auVar = r3;
        C15070au auVar2 = new C15070au(context2, this.f39093b, lock2, looper2, cVar2, map2, null, map4, null, arrayList2, new C15124cq(this, null));
        this.f39095d = auVar;
        C15070au auVar3 = new C15070au(context2, this.f39093b, lock2, looper2, cVar2, map, eVar, map3, aVar, arrayList, new C15125cr(this, null));
        this.f39096e = auVar3;
        ArrayMap arrayMap = new ArrayMap();
        for (C15020c put : map2.keySet()) {
            arrayMap.put(put, this.f39095d);
        }
        for (C15020c put2 : map.keySet()) {
            arrayMap.put(put2, this.f39096e);
        }
        this.f39097f = Collections.unmodifiableMap(arrayMap);
    }

    /* renamed from: a */
    public final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38310a(T t) {
        if (!m43890b((C15105a<? extends C15044g, ? extends C15019b>) t)) {
            return this.f39095d.mo38310a(t);
        }
        if (!m43898j()) {
            return this.f39096e.mo38310a(t);
        }
        t.mo38364b(new Status(4, null, m43899k()));
        return t;
    }

    /* renamed from: a */
    public final void mo38311a() {
        this.f39105n = 2;
        this.f39103l = false;
        this.f39102k = null;
        this.f39101j = null;
        this.f39095d.mo38311a();
        this.f39096e.mo38311a();
    }

    /* renamed from: b */
    public final ConnectionResult mo38318b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo38319c() {
        this.f39102k = null;
        this.f39101j = null;
        this.f39105n = 0;
        this.f39095d.mo38319c();
        this.f39096e.mo38319c();
        m43897i();
    }

    /* renamed from: f */
    public final boolean mo38322f() {
        this.f39104m.lock();
        try {
            boolean z = true;
            if (!this.f39095d.mo38322f() || (!this.f39096e.mo38322f() && !m43898j() && this.f39105n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f39104m.unlock();
        }
    }

    /* renamed from: d */
    private boolean m43893d() {
        this.f39104m.lock();
        try {
            return this.f39105n == 2;
        } finally {
            this.f39104m.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo38317a(C15144k kVar) {
        this.f39104m.lock();
        try {
            if ((m43893d() || mo38322f()) && !this.f39096e.mo38322f()) {
                this.f39098g.add(kVar);
                if (this.f39105n == 0) {
                    this.f39105n = 1;
                }
                this.f39102k = null;
                this.f39096e.mo38311a();
                return true;
            }
            this.f39104m.unlock();
            return false;
        } finally {
            this.f39104m.unlock();
        }
    }

    /* renamed from: h */
    public final void mo38324h() {
        this.f39095d.mo38324h();
        this.f39096e.mo38324h();
    }

    /* renamed from: g */
    public final void mo38323g() {
        this.f39104m.lock();
        try {
            boolean d = m43893d();
            this.f39096e.mo38319c();
            this.f39102k = new ConnectionResult(4);
            if (d) {
                new C16355d(this.f39094c).post(new C15123cp(this));
            } else {
                m43897i();
            }
        } finally {
            this.f39104m.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m43895e() {
        if (m43889b(this.f39101j)) {
            if (m43889b(this.f39102k) || m43898j()) {
                switch (this.f39105n) {
                    case 1:
                        break;
                    case 2:
                        this.f39093b.mo38299a(this.f39100i);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
                m43897i();
                this.f39105n = 0;
            } else if (this.f39102k != null) {
                if (this.f39105n == 1) {
                    m43897i();
                    return;
                }
                m43883a(this.f39102k);
                this.f39095d.mo38319c();
            }
        } else if (this.f39101j != null && m43889b(this.f39102k)) {
            this.f39096e.mo38319c();
            m43883a(this.f39101j);
        } else if (!(this.f39101j == null || this.f39102k == null)) {
            ConnectionResult connectionResult = this.f39101j;
            if (this.f39096e.f38991c < this.f39095d.f38991c) {
                connectionResult = this.f39102k;
            }
            m43883a(connectionResult);
        }
    }

    /* renamed from: a */
    private final void m43883a(ConnectionResult connectionResult) {
        switch (this.f39105n) {
            case 1:
                break;
            case 2:
                this.f39093b.mo38300a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m43897i();
        this.f39105n = 0;
    }

    /* renamed from: i */
    private final void m43897i() {
        for (C15144k h : this.f39098g) {
            h.mo38146h();
        }
        this.f39098g.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m43881a(int i, boolean z) {
        this.f39093b.mo38298a(i, z);
        this.f39102k = null;
        this.f39101j = null;
    }

    /* renamed from: j */
    private final boolean m43898j() {
        return this.f39102k != null && this.f39102k.f38846b == 4;
    }

    /* renamed from: b */
    private final boolean m43890b(C15105a<? extends C15044g, ? extends C15019b> aVar) {
        C15020c<A> cVar = aVar.f39058a;
        C15267r.m44395b(this.f39097f.containsKey(cVar), "GoogleApiClient is not configured to use the API required for this call.");
        return ((C15070au) this.f39097f.get(cVar)).equals(this.f39096e);
    }

    /* renamed from: k */
    private final PendingIntent m43899k() {
        if (this.f39099h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f39092a, System.identityHashCode(this.f39093b), this.f39099h.mo38133d(), 134217728);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m43882a(Bundle bundle) {
        if (this.f39100i == null) {
            this.f39100i = bundle;
            return;
        }
        if (bundle != null) {
            this.f39100i.putAll(bundle);
        }
    }

    /* renamed from: b */
    private static boolean m43889b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo38154b();
    }

    /* renamed from: a */
    public final void mo38316a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f39096e.mo38316a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f39095d.mo38316a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
