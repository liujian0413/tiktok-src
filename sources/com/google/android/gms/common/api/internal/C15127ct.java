package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15034c;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15244e.C15246b;
import com.google.android.gms.common.util.p751a.C15315a;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16967e;
import com.google.android.gms.tasks.C17054c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.ct */
public final class C15127ct implements C15086bi {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C15020c<?>, C15126cs<?>> f39113a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C15020c<?>, C15126cs<?>> f39114b = new HashMap();

    /* renamed from: c */
    private final Map<C15017a<?>, Boolean> f39115c;

    /* renamed from: d */
    private final C15133d f39116d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15061al f39117e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f39118f;

    /* renamed from: g */
    private final Looper f39119g;

    /* renamed from: h */
    private final C15167c f39120h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Condition f39121i;

    /* renamed from: j */
    private final C15244e f39122j;

    /* renamed from: k */
    private final boolean f39123k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f39124l;

    /* renamed from: m */
    private final Queue<C15105a<?, ?>> f39125m = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f39126n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Map<C15110cd<?>, ConnectionResult> f39127o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Map<C15110cd<?>, ConnectionResult> f39128p;

    /* renamed from: q */
    private C15149p f39129q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ConnectionResult f39130r;

    public C15127ct(Context context, Lock lock, Looper looper, C15167c cVar, Map<C15020c<?>, C15028f> map, C15244e eVar, Map<C15017a<?>, Boolean> map2, C15018a<? extends C16967e, C16962a> aVar, ArrayList<C15120cm> arrayList, C15061al alVar, boolean z) {
        this.f39118f = lock;
        this.f39119g = looper;
        this.f39121i = lock.newCondition();
        this.f39120h = cVar;
        this.f39117e = alVar;
        this.f39115c = map2;
        this.f39122j = eVar;
        this.f39123k = z;
        HashMap hashMap = new HashMap();
        for (C15017a aVar2 : map2.keySet()) {
            hashMap.put(aVar2.mo38208b(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C15120cm cmVar = (C15120cm) obj;
            hashMap2.put(cmVar.f39089a, cmVar);
        }
        for (Entry entry : map.entrySet()) {
            C15017a aVar3 = (C15017a) hashMap.get(entry.getKey());
            C15028f fVar = (C15028f) entry.getValue();
            ((Boolean) this.f39115c.get(aVar3)).booleanValue();
            C15126cs csVar = r1;
            C15126cs csVar2 = new C15126cs(context, aVar3, looper, fVar, (C15120cm) hashMap2.get(aVar3), eVar, aVar);
            this.f39113a.put((C15020c) entry.getKey(), csVar);
            if (fVar.mo38218i()) {
                this.f39114b.put((C15020c) entry.getKey(), csVar);
            }
        }
        this.f39124l = false;
        this.f39116d = C15133d.m43961a();
    }

    /* renamed from: a */
    public final void mo38316a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: h */
    public final void mo38324h() {
    }

    /* renamed from: a */
    public final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38310a(T t) {
        C15020c<A> cVar = t.f39058a;
        if (this.f39123k && m43926b(t)) {
            return t;
        }
        this.f39117e.f38956e.mo38359a(t);
        return ((C15126cs) this.f39113a.get(cVar)).mo38226a(t);
    }

    /* renamed from: b */
    private final <T extends C15105a<? extends C15044g, ? extends C15019b>> boolean m43926b(T t) {
        C15020c<A> cVar = t.f39058a;
        ConnectionResult a = m43917a(cVar);
        if (a == null || a.f38846b != 4) {
            return false;
        }
        t.mo38364b(new Status(4, null, this.f39116d.mo38395a(((C15126cs) this.f39113a.get(cVar)).f38886d, System.identityHashCode(this.f39117e))));
        return true;
    }

    /* renamed from: a */
    public final void mo38311a() {
        this.f39118f.lock();
        try {
            if (!this.f39126n) {
                this.f39126n = true;
                this.f39127o = null;
                this.f39128p = null;
                this.f39129q = null;
                this.f39130r = null;
                this.f39116d.mo38405d();
                this.f39116d.mo38396a((Iterable<? extends C15034c<?>>) this.f39113a.values()).mo44288a((Executor) new C15315a(this.f39119g), (C17054c<TResult>) new C15129cv<TResult>(this));
                this.f39118f.unlock();
            }
        } finally {
            this.f39118f.unlock();
        }
    }

    /* renamed from: b */
    public final ConnectionResult mo38318b() {
        mo38311a();
        while (m43930d()) {
            try {
                this.f39121i.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo38322f()) {
            return ConnectionResult.f38845a;
        }
        if (this.f39130r != null) {
            return this.f39130r;
        }
        return new ConnectionResult(13, null);
    }

    /* renamed from: c */
    public final void mo38319c() {
        this.f39118f.lock();
        try {
            this.f39126n = false;
            this.f39127o = null;
            this.f39128p = null;
            if (this.f39129q != null) {
                this.f39129q.mo38436a();
                this.f39129q = null;
            }
            this.f39130r = null;
            while (!this.f39125m.isEmpty()) {
                C15105a aVar = (C15105a) this.f39125m.remove();
                aVar.mo38268a((C15102by) null);
                aVar.mo38260a();
            }
            this.f39121i.signalAll();
        } finally {
            this.f39118f.unlock();
        }
    }

    /* renamed from: a */
    private ConnectionResult m43918a(C15017a<?> aVar) {
        return m43917a(aVar.mo38208b());
    }

    /* renamed from: a */
    private final ConnectionResult m43917a(C15020c<?> cVar) {
        this.f39118f.lock();
        try {
            C15126cs csVar = (C15126cs) this.f39113a.get(cVar);
            if (this.f39127o != null && csVar != null) {
                return (ConnectionResult) this.f39127o.get(csVar.f38886d);
            }
            this.f39118f.unlock();
            return null;
        } finally {
            this.f39118f.unlock();
        }
    }

    /* renamed from: f */
    public final boolean mo38322f() {
        this.f39118f.lock();
        try {
            return this.f39127o != null && this.f39130r == null;
        } finally {
            this.f39118f.unlock();
        }
    }

    /* renamed from: d */
    private boolean m43930d() {
        this.f39118f.lock();
        try {
            return this.f39127o == null && this.f39126n;
        } finally {
            this.f39118f.unlock();
        }
    }

    /* renamed from: e */
    private final boolean m43931e() {
        this.f39118f.lock();
        try {
            if (this.f39126n) {
                if (this.f39123k) {
                    for (C15020c a : this.f39114b.keySet()) {
                        ConnectionResult a2 = m43917a(a);
                        if (a2 != null) {
                            if (!a2.mo38154b()) {
                            }
                        }
                        this.f39118f.unlock();
                        return false;
                    }
                    this.f39118f.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f39118f.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo38317a(C15144k kVar) {
        this.f39118f.lock();
        try {
            if (!this.f39126n || m43931e()) {
                this.f39118f.unlock();
                return false;
            }
            this.f39116d.mo38405d();
            this.f39129q = new C15149p(this, kVar);
            this.f39116d.mo38396a((Iterable<? extends C15034c<?>>) this.f39114b.values()).mo44288a((Executor) new C15315a(this.f39119g), (C17054c<TResult>) this.f39129q);
            this.f39118f.unlock();
            return true;
        } catch (Throwable th) {
            this.f39118f.unlock();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo38323g() {
        this.f39118f.lock();
        try {
            this.f39116d.mo38406e();
            if (this.f39129q != null) {
                this.f39129q.mo38436a();
                this.f39129q = null;
            }
            if (this.f39128p == null) {
                this.f39128p = new ArrayMap(this.f39114b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (C15126cs csVar : this.f39114b.values()) {
                this.f39128p.put(csVar.f38886d, connectionResult);
            }
            if (this.f39127o != null) {
                this.f39127o.putAll(this.f39128p);
            }
        } finally {
            this.f39118f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m43936i() {
        if (this.f39122j == null) {
            this.f39117e.f38954c = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f39122j.f39420b);
        Map<C15017a<?>, C15246b> map = this.f39122j.f39422d;
        for (C15017a aVar : map.keySet()) {
            ConnectionResult a = m43918a(aVar);
            if (a != null && a.mo38154b()) {
                hashSet.addAll(((C15246b) map.get(aVar)).f39437a);
            }
        }
        this.f39117e.f38954c = hashSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m43938j() {
        while (!this.f39125m.isEmpty()) {
            mo38310a((T) (C15105a) this.f39125m.remove());
        }
        this.f39117e.mo38299a((Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m43922a(C15126cs<?> csVar, ConnectionResult connectionResult) {
        return !connectionResult.mo38154b() && !connectionResult.mo38153a() && ((Boolean) this.f39115c.get(csVar.f38884b)).booleanValue() && this.f39120h.isUserResolvableError(connectionResult.f38846b);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final ConnectionResult m43940k() {
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        char c = 0;
        char c2 = 0;
        for (C15126cs csVar : this.f39113a.values()) {
            C15017a<O> aVar = csVar.f38884b;
            ConnectionResult connectionResult3 = (ConnectionResult) this.f39127o.get(csVar.f38886d);
            if (!connectionResult3.mo38154b() && (!((Boolean) this.f39115c.get(aVar)).booleanValue() || connectionResult3.mo38153a() || this.f39120h.isUserResolvableError(connectionResult3.f38846b))) {
                if (connectionResult3.f38846b != 4 || !this.f39123k) {
                    if (connectionResult == null || c > 65535) {
                        connectionResult = connectionResult3;
                        c = 65535;
                    }
                } else if (connectionResult2 == null || c2 > 65535) {
                    connectionResult2 = connectionResult3;
                    c2 = 65535;
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || c <= c2) ? connectionResult : connectionResult2;
    }
}
