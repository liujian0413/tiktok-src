package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15037d.C15038a;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.api.C15041e;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.C15045h;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15250i;
import com.google.android.gms.common.internal.C15250i.C15251a;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.p750a.C15195a;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16967e;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.al */
public final class C15061al extends C15037d implements C15087bj {

    /* renamed from: a */
    final Queue<C15105a<?, ?>> f38952a = new LinkedList();

    /* renamed from: b */
    final Map<C15020c<?>, C15028f> f38953b;

    /* renamed from: c */
    Set<Scope> f38954c = new HashSet();

    /* renamed from: d */
    Set<C15097bt> f38955d = null;

    /* renamed from: e */
    final C15100bw f38956e;

    /* renamed from: f */
    private final Lock f38957f;

    /* renamed from: g */
    private boolean f38958g;

    /* renamed from: h */
    private final C15250i f38959h;

    /* renamed from: i */
    private C15086bi f38960i;

    /* renamed from: j */
    private final int f38961j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Context f38962k;

    /* renamed from: l */
    private final Looper f38963l;

    /* renamed from: m */
    private volatile boolean f38964m;

    /* renamed from: n */
    private long f38965n = 120000;

    /* renamed from: o */
    private long f38966o = DouPlusShareGuideExperiment.MIN_VALID_DURATION;

    /* renamed from: p */
    private final C15067ar f38967p;

    /* renamed from: q */
    private final GoogleApiAvailability f38968q;

    /* renamed from: r */
    private zabq f38969r;

    /* renamed from: s */
    private final C15244e f38970s;

    /* renamed from: t */
    private final Map<C15017a<?>, Boolean> f38971t;

    /* renamed from: u */
    private final C15018a<? extends C16967e, C16962a> f38972u;

    /* renamed from: v */
    private final C15142i f38973v = new C15142i();

    /* renamed from: w */
    private final ArrayList<C15120cm> f38974w;

    /* renamed from: x */
    private Integer f38975x = null;

    /* renamed from: y */
    private final C15251a f38976y = new C15062am(this);

    public C15061al(Context context, Lock lock, Looper looper, C15244e eVar, GoogleApiAvailability googleApiAvailability, C15018a<? extends C16967e, C16962a> aVar, Map<C15017a<?>, Boolean> map, List<C15039b> list, List<C15040c> list2, Map<C15020c<?>, C15028f> map2, int i, int i2, ArrayList<C15120cm> arrayList, boolean z) {
        Looper looper2 = looper;
        this.f38962k = context;
        this.f38957f = lock;
        this.f38958g = false;
        this.f38959h = new C15250i(looper, this.f38976y);
        this.f38963l = looper2;
        this.f38967p = new C15067ar(this, looper);
        this.f38968q = googleApiAvailability;
        this.f38961j = i;
        if (this.f38961j >= 0) {
            this.f38975x = Integer.valueOf(i2);
        }
        this.f38971t = map;
        this.f38953b = map2;
        this.f38974w = arrayList;
        this.f38956e = new C15100bw(this.f38953b);
        for (C15039b a : list) {
            this.f38959h.mo38596a(a);
        }
        for (C15040c a2 : list2) {
            this.f38959h.mo38597a(a2);
        }
        this.f38970s = eVar;
        this.f38972u = aVar;
    }

    /* renamed from: c */
    private static String m43681c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38232a(T t) {
        C15267r.m44395b(t.f39058a != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f38953b.containsKey(t.f39058a);
        String str = t.f39059b != null ? t.f39059b.f38879b : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C15267r.m44395b(containsKey, sb.toString());
        this.f38957f.lock();
        try {
            if (this.f38960i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.f38964m) {
                this.f38952a.add(t);
                while (!this.f38952a.isEmpty()) {
                    C15105a aVar = (C15105a) this.f38952a.remove();
                    this.f38956e.mo38359a(aVar);
                    aVar.mo38364b(Status.f38869c);
                }
                return t;
            } else {
                T a = this.f38960i.mo38310a(t);
                this.f38957f.unlock();
                return a;
            }
        } finally {
            this.f38957f.unlock();
        }
    }

    /* renamed from: a */
    public final <C extends C15028f> C mo38231a(C15020c<C> cVar) {
        C c = (C15028f) this.f38953b.get(cVar);
        C15267r.m44385a(c, (Object) "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: e */
    public final void mo38244e() {
        this.f38957f.lock();
        try {
            boolean z = false;
            if (this.f38961j >= 0) {
                if (this.f38975x != null) {
                    z = true;
                }
                C15267r.m44391a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f38975x == null) {
                this.f38975x = Integer.valueOf(m43674a((Iterable<C15028f>) this.f38953b.values(), false));
            } else if (this.f38975x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo38233a(this.f38975x.intValue());
        } finally {
            this.f38957f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo38233a(int i) {
        this.f38957f.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C15267r.m44395b(z, sb.toString());
            m43678b(i);
            m43682n();
        } finally {
            this.f38957f.unlock();
        }
    }

    /* renamed from: f */
    public final ConnectionResult mo38245f() {
        boolean z = true;
        C15267r.m44391a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f38957f.lock();
        try {
            if (this.f38961j >= 0) {
                if (this.f38975x == null) {
                    z = false;
                }
                C15267r.m44391a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f38975x == null) {
                this.f38975x = Integer.valueOf(m43674a((Iterable<C15028f>) this.f38953b.values(), false));
            } else if (this.f38975x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m43678b(this.f38975x.intValue());
            this.f38959h.mo38598b();
            return this.f38960i.mo38318b();
        } finally {
            this.f38957f.unlock();
        }
    }

    /* renamed from: g */
    public final void mo38246g() {
        this.f38957f.lock();
        try {
            this.f38956e.mo38358a();
            if (this.f38960i != null) {
                this.f38960i.mo38319c();
            }
            this.f38973v.mo38433a();
            for (C15105a aVar : this.f38952a) {
                aVar.mo38268a((C15102by) null);
                aVar.mo38260a();
            }
            this.f38952a.clear();
            if (this.f38960i != null) {
                mo38301l();
                this.f38959h.mo38592a();
                this.f38957f.unlock();
            }
        } finally {
            this.f38957f.unlock();
        }
    }

    /* renamed from: h */
    public final void mo38247h() {
        mo38246g();
        mo38244e();
    }

    /* renamed from: i */
    public final C15041e<Status> mo38248i() {
        C15267r.m44391a(mo38249j(), (Object) "GoogleApiClient is not connected yet.");
        C15267r.m44391a(this.f38975x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C15146m mVar = new C15146m(this);
        if (this.f38953b.containsKey(C15195a.f39347a)) {
            m43675a(this, mVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C15037d a = new C15038a(this.f38962k).mo38252a(C15195a.f39348b).mo38254a((C15039b) new C15063an(this, atomicReference, mVar)).mo38255a((C15040c) new C15064ao(this, mVar)).mo38250a((Handler) this.f38967p).mo38256a();
            atomicReference.set(a);
            a.mo38244e();
        }
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m43675a(C15037d dVar, C15146m mVar, boolean z) {
        C15195a.f39349c.mo38516a(dVar).mo38262a((C15045h<? super R>) new C15066aq<Object>(this, mVar, z, dVar));
    }

    /* renamed from: a */
    public final void mo38234a(FragmentActivity fragmentActivity) {
        C15138f fVar = new C15138f(fragmentActivity);
        if (this.f38961j >= 0) {
            C15111ce.m43849b(fVar).mo38369a(this.f38961j);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    /* renamed from: j */
    public final boolean mo38249j() {
        return this.f38960i != null && this.f38960i.mo38322f();
    }

    /* renamed from: b */
    private final void m43678b(int i) {
        if (this.f38975x == null) {
            this.f38975x = Integer.valueOf(i);
        } else if (this.f38975x.intValue() != i) {
            String c = m43681c(i);
            String c2 = m43681c(this.f38975x.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f38960i == null) {
            boolean z = false;
            boolean z2 = false;
            for (C15028f fVar : this.f38953b.values()) {
                if (fVar.mo38218i()) {
                    z = true;
                }
                if (fVar.mo38132c()) {
                    z2 = true;
                }
            }
            switch (this.f38975x.intValue()) {
                case 1:
                    if (!z) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z2) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z) {
                        if (this.f38958g) {
                            C15127ct ctVar = new C15127ct(this.f38962k, this.f38957f, this.f38963l, this.f38968q, this.f38953b, this.f38970s, this.f38971t, this.f38972u, this.f38974w, this, true);
                            this.f38960i = ctVar;
                            return;
                        }
                        this.f38960i = C15122co.m43879a(this.f38962k, this, this.f38957f, this.f38963l, this.f38968q, this.f38953b, this.f38970s, this.f38971t, this.f38972u, this.f38974w);
                        return;
                    }
                    break;
            }
            if (!this.f38958g || z2) {
                C15070au auVar = new C15070au(this.f38962k, this, this.f38957f, this.f38963l, this.f38968q, this.f38953b, this.f38970s, this.f38971t, this.f38972u, this.f38974w, this);
                this.f38960i = auVar;
                return;
            }
            C15127ct ctVar2 = new C15127ct(this.f38962k, this.f38957f, this.f38963l, this.f38968q, this.f38953b, this.f38970s, this.f38971t, this.f38972u, this.f38974w, this, false);
            this.f38960i = ctVar2;
        }
    }

    /* renamed from: n */
    private final void m43682n() {
        this.f38959h.mo38598b();
        this.f38960i.mo38311a();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m43683o() {
        this.f38957f.lock();
        try {
            if (this.f38964m) {
                m43682n();
            }
        } finally {
            this.f38957f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m43684p() {
        this.f38957f.lock();
        try {
            if (mo38301l()) {
                m43682n();
            }
        } finally {
            this.f38957f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo38301l() {
        if (!this.f38964m) {
            return false;
        }
        this.f38964m = false;
        this.f38967p.removeMessages(2);
        this.f38967p.removeMessages(1);
        if (this.f38969r != null) {
            this.f38969r.mo38443a();
            this.f38969r = null;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo38235a(C15040c cVar) {
        this.f38959h.mo38597a(cVar);
    }

    /* renamed from: b */
    public final void mo38240b(C15040c cVar) {
        this.f38959h.mo38599b(cVar);
    }

    /* renamed from: a */
    public final void mo38299a(Bundle bundle) {
        while (!this.f38952a.isEmpty()) {
            mo38232a((C15105a) this.f38952a.remove());
        }
        this.f38959h.mo38594a(bundle);
    }

    /* renamed from: a */
    public final void mo38300a(ConnectionResult connectionResult) {
        if (!this.f38968q.isPlayServicesPossiblyUpdating(this.f38962k, connectionResult.f38846b)) {
            mo38301l();
        }
        if (!this.f38964m) {
            this.f38959h.mo38595a(connectionResult);
            this.f38959h.mo38592a();
        }
    }

    /* renamed from: a */
    public final void mo38298a(int i, boolean z) {
        if (i == 1 && !z && !this.f38964m) {
            this.f38964m = true;
            if (this.f38969r == null) {
                this.f38969r = this.f38968q.zaa(this.f38962k.getApplicationContext(), (C15085bh) new C15068as(this));
            }
            this.f38967p.sendMessageDelayed(this.f38967p.obtainMessage(1), this.f38965n);
            this.f38967p.sendMessageDelayed(this.f38967p.obtainMessage(2), this.f38966o);
        }
        this.f38956e.mo38360b();
        this.f38959h.mo38593a(i);
        this.f38959h.mo38592a();
        if (i == 2) {
            m43682n();
        }
    }

    /* renamed from: b */
    public final Context mo38239b() {
        return this.f38962k;
    }

    /* renamed from: c */
    public final Looper mo38242c() {
        return this.f38963l;
    }

    /* renamed from: a */
    public final boolean mo38238a(C15144k kVar) {
        return this.f38960i != null && this.f38960i.mo38317a(kVar);
    }

    /* renamed from: d */
    public final void mo38243d() {
        if (this.f38960i != null) {
            this.f38960i.mo38323g();
        }
    }

    /* renamed from: a */
    public final void mo38236a(C15097bt btVar) {
        this.f38957f.lock();
        try {
            if (this.f38955d == null) {
                this.f38955d = new HashSet();
            }
            this.f38955d.add(btVar);
        } finally {
            this.f38957f.unlock();
        }
    }

    /* renamed from: b */
    public final void mo38241b(C15097bt btVar) {
        this.f38957f.lock();
        try {
            if (this.f38955d == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f38955d.remove(btVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!mo38302m()) {
                this.f38960i.mo38324h();
            }
        } finally {
            this.f38957f.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo38302m() {
        this.f38957f.lock();
        try {
            if (this.f38955d == null) {
                this.f38957f.unlock();
                return false;
            }
            boolean z = !this.f38955d.isEmpty();
            this.f38957f.unlock();
            return z;
        } catch (Throwable th) {
            this.f38957f.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo38237a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f38962k);
        printWriter.append(str).append("mResuming=").print(this.f38964m);
        printWriter.append(" mWorkQueue.size()=").print(this.f38952a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f38956e.f39053b.size());
        if (this.f38960i != null) {
            this.f38960i.mo38316a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public static int m43674a(Iterable<C15028f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C15028f fVar : iterable) {
            if (fVar.mo38218i()) {
                z2 = true;
            }
            if (fVar.mo38132c()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
