package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.ArrayMap;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15017a.C15021d;
import com.google.android.gms.common.api.C15017a.C15021d.C15024c;
import com.google.android.gms.common.api.C15017a.C15021d.C15025d;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.internal.C15061al;
import com.google.android.gms.common.api.internal.C15097bt;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.api.internal.C15111ce;
import com.google.android.gms.common.api.internal.C15120cm;
import com.google.android.gms.common.api.internal.C15138f;
import com.google.android.gms.common.api.internal.C15144k;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.common.internal.C15244e.C15246b;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16964b;
import com.google.android.gms.signin.C16967e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.common.api.d */
public abstract class C15037d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<C15037d> f38897a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.d$a */
    public static final class C15038a {

        /* renamed from: a */
        private Account f38898a;

        /* renamed from: b */
        private final Set<Scope> f38899b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f38900c = new HashSet();

        /* renamed from: d */
        private int f38901d;

        /* renamed from: e */
        private View f38902e;

        /* renamed from: f */
        private String f38903f;

        /* renamed from: g */
        private String f38904g;

        /* renamed from: h */
        private final Map<C15017a<?>, C15246b> f38905h = new ArrayMap();

        /* renamed from: i */
        private final Context f38906i;

        /* renamed from: j */
        private final Map<C15017a<?>, C15021d> f38907j = new ArrayMap();

        /* renamed from: k */
        private C15138f f38908k;

        /* renamed from: l */
        private int f38909l = -1;

        /* renamed from: m */
        private C15040c f38910m;

        /* renamed from: n */
        private Looper f38911n;

        /* renamed from: o */
        private GoogleApiAvailability f38912o = GoogleApiAvailability.getInstance();

        /* renamed from: p */
        private C15018a<? extends C16967e, C16962a> f38913p = C16964b.f47568a;

        /* renamed from: q */
        private final ArrayList<C15039b> f38914q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<C15040c> f38915r = new ArrayList<>();

        /* renamed from: s */
        private boolean f38916s = false;

        public C15038a(Context context) {
            this.f38906i = context;
            this.f38911n = context.getMainLooper();
            this.f38903f = context.getPackageName();
            this.f38904g = context.getClass().getName();
        }

        /* renamed from: a */
        public final C15038a mo38250a(Handler handler) {
            C15267r.m44385a(handler, (Object) "Handler must not be null");
            this.f38911n = handler.getLooper();
            return this;
        }

        /* renamed from: a */
        public final C15038a mo38254a(C15039b bVar) {
            C15267r.m44385a(bVar, (Object) "Listener must not be null");
            this.f38914q.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C15038a mo38255a(C15040c cVar) {
            C15267r.m44385a(cVar, (Object) "Listener must not be null");
            this.f38915r.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C15038a mo38252a(C15017a<? extends C15025d> aVar) {
            C15267r.m44385a(aVar, (Object) "Api must not be null");
            this.f38907j.put(aVar, null);
            List a = aVar.f38878a.mo38069a(null);
            this.f38900c.addAll(a);
            this.f38899b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends C15024c> C15038a mo38253a(C15017a<O> aVar, O o) {
            C15267r.m44385a(aVar, (Object) "Api must not be null");
            C15267r.m44385a(o, (Object) "Null options are not permitted for this Api");
            this.f38907j.put(aVar, o);
            List a = aVar.f38878a.mo38069a(o);
            this.f38900c.addAll(a);
            this.f38899b.addAll(a);
            return this;
        }

        /* renamed from: a */
        private C15038a m43606a(FragmentActivity fragmentActivity, int i, C15040c cVar) {
            C15138f fVar = new C15138f(fragmentActivity);
            C15267r.m44395b(true, "clientId must be non-negative");
            this.f38909l = 0;
            this.f38910m = cVar;
            this.f38908k = fVar;
            return this;
        }

        /* renamed from: a */
        public final C15038a mo38251a(FragmentActivity fragmentActivity, C15040c cVar) {
            return m43606a(fragmentActivity, 0, cVar);
        }

        /* renamed from: b */
        private C15244e m43607b() {
            C16962a aVar = C16962a.f47559a;
            if (this.f38907j.containsKey(C16964b.f47569b)) {
                aVar = (C16962a) this.f38907j.get(C16964b.f47569b);
            }
            C15244e eVar = new C15244e(this.f38898a, this.f38899b, this.f38905h, this.f38901d, this.f38902e, this.f38903f, this.f38904g, aVar);
            return eVar;
        }

        /* renamed from: a */
        public final C15037d mo38256a() {
            C15267r.m44395b(!this.f38907j.isEmpty(), "must call addApi() to add at least one API");
            C15244e b = m43607b();
            C15017a aVar = null;
            Map<C15017a<?>, C15246b> map = b.f39422d;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f38907j.keySet().iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    C15017a aVar2 = (C15017a) it.next();
                    Object obj = this.f38907j.get(aVar2);
                    if (map.get(aVar2) != null) {
                        z = true;
                    }
                    arrayMap.put(aVar2, Boolean.valueOf(z));
                    C15120cm cmVar = new C15120cm(aVar2, z);
                    arrayList.add(cmVar);
                    C15017a aVar3 = aVar2;
                    C15028f a = aVar2.mo38207a().mo38026a(this.f38906i, this.f38911n, b, obj, cmVar, cmVar);
                    arrayMap2.put(aVar3.mo38208b(), a);
                    if (a.mo38132c()) {
                        if (aVar == null) {
                            aVar = aVar3;
                        } else {
                            String str = aVar3.f38879b;
                            String str2 = aVar.f38879b;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                            sb.append(str);
                            sb.append(" cannot be used with ");
                            sb.append(str2);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    if (aVar != null) {
                        C15267r.m44392a(this.f38898a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.f38879b);
                        C15267r.m44392a(this.f38899b.equals(this.f38900c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.f38879b);
                    }
                    int a2 = C15061al.m43674a((Iterable<C15028f>) arrayMap2.values(), true);
                    C15244e eVar = b;
                    C15061al alVar = new C15061al(this.f38906i, new ReentrantLock(), this.f38911n, eVar, this.f38912o, this.f38913p, arrayMap, this.f38914q, this.f38915r, arrayMap2, this.f38909l, a2, arrayList, false);
                    synchronized (C15037d.f38897a) {
                        C15037d.f38897a.add(alVar);
                    }
                    if (this.f38909l >= 0) {
                        C15111ce.m43849b(this.f38908k).mo38370a(this.f38909l, alVar, this.f38910m);
                    }
                    return alVar;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.d$b */
    public interface C15039b {
        /* renamed from: a */
        void mo38257a(int i);

        /* renamed from: a */
        void mo38258a(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.api.d$c */
    public interface C15040c {
        /* renamed from: a */
        void mo38259a(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    public abstract void mo38234a(FragmentActivity fragmentActivity);

    /* renamed from: a */
    public abstract void mo38235a(C15040c cVar);

    /* renamed from: a */
    public abstract void mo38237a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo38240b(C15040c cVar);

    /* renamed from: e */
    public abstract void mo38244e();

    /* renamed from: f */
    public abstract ConnectionResult mo38245f();

    /* renamed from: g */
    public abstract void mo38246g();

    /* renamed from: h */
    public abstract void mo38247h();

    /* renamed from: i */
    public abstract C15041e<Status> mo38248i();

    /* renamed from: j */
    public abstract boolean mo38249j();

    /* renamed from: a */
    public static Set<C15037d> m43585a() {
        Set<C15037d> set;
        synchronized (f38897a) {
            set = f38897a;
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38232a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <C extends C15028f> C mo38231a(C15020c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Context mo38239b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Looper mo38242c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo38238a(C15144k kVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo38243d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo38233a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo38236a(C15097bt btVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo38241b(C15097bt btVar) {
        throw new UnsupportedOperationException();
    }
}
