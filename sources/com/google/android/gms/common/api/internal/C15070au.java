package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16967e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.au */
public final class C15070au implements C15086bi, C15121cn {

    /* renamed from: a */
    final Map<C15020c<?>, C15028f> f38989a;

    /* renamed from: b */
    final Map<C15020c<?>, ConnectionResult> f38990b = new HashMap();

    /* renamed from: c */
    int f38991c;

    /* renamed from: d */
    final C15061al f38992d;

    /* renamed from: e */
    final C15087bj f38993e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f38994f;

    /* renamed from: g */
    private final Condition f38995g;

    /* renamed from: h */
    private final Context f38996h;

    /* renamed from: i */
    private final C15167c f38997i;

    /* renamed from: j */
    private final C15072aw f38998j;

    /* renamed from: k */
    private final C15244e f38999k;

    /* renamed from: l */
    private final Map<C15017a<?>, Boolean> f39000l;

    /* renamed from: m */
    private final C15018a<? extends C16967e, C16962a> f39001m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile C15069at f39002n;

    /* renamed from: o */
    private ConnectionResult f39003o = null;

    public C15070au(Context context, C15061al alVar, Lock lock, Looper looper, C15167c cVar, Map<C15020c<?>, C15028f> map, C15244e eVar, Map<C15017a<?>, Boolean> map2, C15018a<? extends C16967e, C16962a> aVar, ArrayList<C15120cm> arrayList, C15087bj bjVar) {
        this.f38996h = context;
        this.f38994f = lock;
        this.f38997i = cVar;
        this.f38989a = map;
        this.f38999k = eVar;
        this.f39000l = map2;
        this.f39001m = aVar;
        this.f38992d = alVar;
        this.f38993e = bjVar;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((C15120cm) obj).f39090b = this;
        }
        this.f38998j = new C15072aw(this, looper);
        this.f38995g = lock.newCondition();
        this.f39002n = new C15060ak(this);
    }

    /* renamed from: a */
    public final boolean mo38317a(C15144k kVar) {
        return false;
    }

    /* renamed from: g */
    public final void mo38323g() {
    }

    /* renamed from: a */
    public final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38310a(T t) {
        t.mo38272f();
        return this.f39002n.mo38291a(t);
    }

    /* renamed from: a */
    public final void mo38311a() {
        this.f39002n.mo38297c();
    }

    /* renamed from: b */
    public final ConnectionResult mo38318b() {
        mo38311a();
        while (m43730i()) {
            try {
                this.f38995g.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo38322f()) {
            return ConnectionResult.f38845a;
        }
        if (this.f39003o != null) {
            return this.f39003o;
        }
        return new ConnectionResult(13, null);
    }

    /* renamed from: c */
    public final void mo38319c() {
        if (this.f39002n.mo38296b()) {
            this.f38990b.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo38320d() {
        this.f38994f.lock();
        try {
            C15159z zVar = new C15159z(this, this.f38999k, this.f39000l, this.f38997i, this.f39001m, this.f38994f, this.f38996h);
            this.f39002n = zVar;
            this.f39002n.mo38292a();
            this.f38995g.signalAll();
        } finally {
            this.f38994f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo38321e() {
        this.f38994f.lock();
        try {
            this.f38992d.mo38301l();
            this.f39002n = new C15156w(this);
            this.f39002n.mo38292a();
            this.f38995g.signalAll();
        } finally {
            this.f38994f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38312a(ConnectionResult connectionResult) {
        this.f38994f.lock();
        try {
            this.f39003o = connectionResult;
            this.f39002n = new C15060ak(this);
            this.f39002n.mo38292a();
            this.f38995g.signalAll();
        } finally {
            this.f38994f.unlock();
        }
    }

    /* renamed from: f */
    public final boolean mo38322f() {
        return this.f39002n instanceof C15156w;
    }

    /* renamed from: i */
    private boolean m43730i() {
        return this.f39002n instanceof C15159z;
    }

    /* renamed from: h */
    public final void mo38324h() {
        if (mo38322f()) {
            ((C15156w) this.f39002n).mo38442d();
        }
    }

    /* renamed from: a */
    public final void mo38313a(ConnectionResult connectionResult, C15017a<?> aVar, boolean z) {
        this.f38994f.lock();
        try {
            this.f39002n.mo38295a(connectionResult, aVar, z);
        } finally {
            this.f38994f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo38258a(Bundle bundle) {
        this.f38994f.lock();
        try {
            this.f39002n.mo38294a(bundle);
        } finally {
            this.f38994f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo38257a(int i) {
        this.f38994f.lock();
        try {
            this.f39002n.mo38293a(i);
        } finally {
            this.f38994f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38314a(C15071av avVar) {
        this.f38998j.sendMessage(this.f38998j.obtainMessage(1, avVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38315a(RuntimeException runtimeException) {
        this.f38998j.sendMessage(this.f38998j.obtainMessage(2, runtimeException));
    }

    /* renamed from: a */
    public final void mo38316a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f39002n);
        for (C15017a aVar : this.f39000l.keySet()) {
            printWriter.append(str).append(aVar.f38879b).println(":");
            ((C15028f) this.f38989a.get(aVar.mo38208b())).mo38214a(concat, fileDescriptor, printWriter, strArr);
        }
    }
}
