package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0888a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15021d;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15034c;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C15076b.C15077a;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.api.internal.C15140h.C15141a;
import com.google.android.gms.common.internal.C15231d.C15234c;
import com.google.android.gms.common.internal.C15231d.C15236e;
import com.google.android.gms.common.internal.C15255l;
import com.google.android.gms.common.internal.C15256m;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.C15268s;
import com.google.android.gms.common.util.C15319b;
import com.google.android.gms.internal.base.C16355d;
import com.google.android.gms.signin.C16967e;
import com.google.android.gms.tasks.C17057f;
import com.google.android.gms.tasks.C17058g;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.d */
public final class C15133d implements Callback {

    /* renamed from: a */
    public static final Status f39142a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Status f39143b = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f39144f = new Object();

    /* renamed from: g */
    private static C15133d f39145g;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f39146c = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f39147d = 120000;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f39148e = 10000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f39149h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final GoogleApiAvailability f39150i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C15255l f39151j;

    /* renamed from: k */
    private final AtomicInteger f39152k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f39153l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<C15110cd<?>, C15134a<?>> f39154m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C15153t f39155n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Set<C15110cd<?>> f39156o = new C0888a();

    /* renamed from: p */
    private final Set<C15110cd<?>> f39157p = new C0888a();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f39158q;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public class C15134a<O extends C15021d> implements C15039b, C15040c, C15121cn {

        /* renamed from: a */
        public final C15028f f39159a;

        /* renamed from: b */
        public final Map<C15141a<?>, C15089bl> f39160b = new HashMap();

        /* renamed from: c */
        public final int f39161c;

        /* renamed from: e */
        private final Queue<C15065ap> f39163e = new LinkedList();

        /* renamed from: f */
        private final C15019b f39164f;

        /* renamed from: g */
        private final C15110cd<O> f39165g;

        /* renamed from: h */
        private final C15150q f39166h;

        /* renamed from: i */
        private final Set<C15113cf> f39167i = new HashSet();

        /* renamed from: j */
        private final C15093bp f39168j;

        /* renamed from: k */
        private boolean f39169k;

        /* renamed from: l */
        private final List<C15135b> f39170l = new ArrayList();

        /* renamed from: m */
        private ConnectionResult f39171m = null;

        public C15134a(C15034c<O> cVar) {
            this.f39159a = cVar.mo38224a(C15133d.this.f39158q.getLooper(), this);
            if (this.f39159a instanceof C15268s) {
                this.f39164f = ((C15268s) this.f39159a).f39465a;
            } else {
                this.f39164f = this.f39159a;
            }
            this.f39165g = cVar.f38886d;
            this.f39166h = new C15150q();
            this.f39161c = cVar.f38888f;
            if (this.f39159a.mo38218i()) {
                this.f39168j = cVar.mo38225a(C15133d.this.f39149h, C15133d.this.f39158q);
            } else {
                this.f39168j = null;
            }
        }

        /* renamed from: a */
        public final void mo38258a(Bundle bundle) {
            if (Looper.myLooper() == C15133d.this.f39158q.getLooper()) {
                m44002k();
            } else {
                C15133d.this.f39158q.post(new C15078ba(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final void m44002k() {
            mo38412b();
            m44001d(ConnectionResult.f38845a);
            m44005n();
            Iterator it = this.f39160b.values().iterator();
            while (it.hasNext()) {
                if (m43988a(((C15089bl) it.next()).f39025a.f39191a) != null) {
                    it.remove();
                } else {
                    try {
                        new C17058g();
                    } catch (DeadObjectException unused) {
                        mo38257a(1);
                        this.f39159a.mo38215f();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m44004m();
            m44006o();
        }

        /* renamed from: a */
        public final void mo38257a(int i) {
            if (Looper.myLooper() == C15133d.this.f39158q.getLooper()) {
                m44003l();
            } else {
                C15133d.this.f39158q.post(new C15079bb(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m44003l() {
            mo38412b();
            this.f39169k = true;
            this.f39166h.mo38441c();
            C15133d.this.f39158q.sendMessageDelayed(Message.obtain(C15133d.this.f39158q, 9, this.f39165g), C15133d.this.f39146c);
            C15133d.this.f39158q.sendMessageDelayed(Message.obtain(C15133d.this.f39158q, 11, this.f39165g), C15133d.this.f39147d);
            C15133d.this.f39151j.mo38607a();
        }

        /* renamed from: b */
        public final void mo38413b(ConnectionResult connectionResult) {
            C15267r.m44389a(C15133d.this.f39158q);
            this.f39159a.mo38215f();
            mo38259a(connectionResult);
        }

        /* renamed from: c */
        private final boolean m44000c(ConnectionResult connectionResult) {
            synchronized (C15133d.f39144f) {
                if (C15133d.this.f39155n == null || !C15133d.this.f39156o.contains(this.f39165g)) {
                    return false;
                }
                C15133d.this.f39155n.mo38376b(connectionResult, this.f39161c);
                return true;
            }
        }

        /* renamed from: a */
        public final void mo38313a(ConnectionResult connectionResult, C15017a<?> aVar, boolean z) {
            if (Looper.myLooper() == C15133d.this.f39158q.getLooper()) {
                mo38259a(connectionResult);
            } else {
                C15133d.this.f39158q.post(new C15080bc(this, connectionResult));
            }
        }

        /* renamed from: a */
        public final void mo38259a(ConnectionResult connectionResult) {
            C15267r.m44389a(C15133d.this.f39158q);
            if (this.f39168j != null) {
                this.f39168j.mo38348a();
            }
            mo38412b();
            C15133d.this.f39151j.mo38607a();
            m44001d(connectionResult);
            if (connectionResult.f38846b == 4) {
                mo38409a(C15133d.f39143b);
            } else if (this.f39163e.isEmpty()) {
                this.f39171m = connectionResult;
            } else {
                if (!m44000c(connectionResult) && !C15133d.this.mo38401a(connectionResult, this.f39161c)) {
                    if (connectionResult.f38846b == 18) {
                        this.f39169k = true;
                    }
                    if (this.f39169k) {
                        C15133d.this.f39158q.sendMessageDelayed(Message.obtain(C15133d.this.f39158q, 9, this.f39165g), C15133d.this.f39146c);
                        return;
                    }
                    String a = this.f39165g.mo38366a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                    sb.append("API: ");
                    sb.append(a);
                    sb.append(" is not available on this device.");
                    mo38409a(new Status(17, sb.toString()));
                }
            }
        }

        /* renamed from: m */
        private final void m44004m() {
            ArrayList arrayList = new ArrayList(this.f39163e);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C15065ap apVar = (C15065ap) obj;
                if (!this.f39159a.mo38216g()) {
                    return;
                }
                if (m43997b(apVar)) {
                    this.f39163e.remove(apVar);
                }
            }
        }

        /* renamed from: a */
        public final void mo38410a(C15065ap apVar) {
            C15267r.m44389a(C15133d.this.f39158q);
            if (!this.f39159a.mo38216g()) {
                this.f39163e.add(apVar);
                if (this.f39171m == null || !this.f39171m.mo38153a()) {
                    mo38418g();
                } else {
                    mo38259a(this.f39171m);
                }
            } else if (m43997b(apVar)) {
                m44006o();
            } else {
                this.f39163e.add(apVar);
            }
        }

        /* renamed from: a */
        public final void mo38408a() {
            C15267r.m44389a(C15133d.this.f39158q);
            mo38409a(C15133d.f39142a);
            this.f39166h.mo38440b();
            for (C15141a ccVar : (C15141a[]) this.f39160b.keySet().toArray(new C15141a[this.f39160b.size()])) {
                mo38410a((C15065ap) new C15109cc(ccVar, new C17058g()));
            }
            m44001d(new ConnectionResult(4));
            if (this.f39159a.mo38216g()) {
                this.f39159a.mo38212a((C15236e) new C15081bd(this));
            }
        }

        /* renamed from: b */
        public final void mo38412b() {
            C15267r.m44389a(C15133d.this.f39158q);
            this.f39171m = null;
        }

        /* renamed from: c */
        public final ConnectionResult mo38414c() {
            C15267r.m44389a(C15133d.this.f39158q);
            return this.f39171m;
        }

        /* renamed from: b */
        private final boolean m43997b(C15065ap apVar) {
            if (!(apVar instanceof C15090bm)) {
                m43999c(apVar);
                return true;
            }
            C15090bm bmVar = (C15090bm) apVar;
            Feature a = m43988a(bmVar.mo38346b(this));
            if (a == null) {
                m43999c(apVar);
                return true;
            }
            if (bmVar.mo38347c(this)) {
                C15135b bVar = new C15135b(this.f39165g, a, null);
                int indexOf = this.f39170l.indexOf(bVar);
                if (indexOf >= 0) {
                    C15135b bVar2 = (C15135b) this.f39170l.get(indexOf);
                    C15133d.this.f39158q.removeMessages(15, bVar2);
                    C15133d.this.f39158q.sendMessageDelayed(Message.obtain(C15133d.this.f39158q, 15, bVar2), C15133d.this.f39146c);
                } else {
                    this.f39170l.add(bVar);
                    C15133d.this.f39158q.sendMessageDelayed(Message.obtain(C15133d.this.f39158q, 15, bVar), C15133d.this.f39146c);
                    C15133d.this.f39158q.sendMessageDelayed(Message.obtain(C15133d.this.f39158q, 16, bVar), C15133d.this.f39147d);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!m44000c(connectionResult)) {
                        C15133d.this.mo38401a(connectionResult, this.f39161c);
                    }
                }
            } else {
                bmVar.mo38307a((RuntimeException) new UnsupportedApiCallException(a));
            }
            return false;
        }

        /* renamed from: c */
        private final void m43999c(C15065ap apVar) {
            apVar.mo38306a(this.f39166h, mo38420i());
            try {
                apVar.mo38305a(this);
            } catch (DeadObjectException unused) {
                mo38257a(1);
                this.f39159a.mo38215f();
            }
        }

        /* renamed from: a */
        public final void mo38409a(Status status) {
            C15267r.m44389a(C15133d.this.f39158q);
            for (C15065ap a : this.f39163e) {
                a.mo38304a(status);
            }
            this.f39163e.clear();
        }

        /* renamed from: d */
        public final void mo38415d() {
            C15267r.m44389a(C15133d.this.f39158q);
            if (this.f39169k) {
                mo38418g();
            }
        }

        /* renamed from: n */
        private final void m44005n() {
            if (this.f39169k) {
                C15133d.this.f39158q.removeMessages(11, this.f39165g);
                C15133d.this.f39158q.removeMessages(9, this.f39165g);
                this.f39169k = false;
            }
        }

        /* renamed from: e */
        public final void mo38416e() {
            Status status;
            C15267r.m44389a(C15133d.this.f39158q);
            if (this.f39169k) {
                m44005n();
                if (C15133d.this.f39150i.isGooglePlayServicesAvailable(C15133d.this.f39149h) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                mo38409a(status);
                this.f39159a.mo38215f();
            }
        }

        /* renamed from: o */
        private final void m44006o() {
            C15133d.this.f39158q.removeMessages(12, this.f39165g);
            C15133d.this.f39158q.sendMessageDelayed(C15133d.this.f39158q.obtainMessage(12, this.f39165g), C15133d.this.f39148e);
        }

        /* renamed from: f */
        public final boolean mo38417f() {
            return m43993a(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m43993a(boolean z) {
            C15267r.m44389a(C15133d.this.f39158q);
            if (!this.f39159a.mo38216g() || this.f39160b.size() != 0) {
                return false;
            }
            if (this.f39166h.mo38439a()) {
                if (z) {
                    m44006o();
                }
                return false;
            }
            this.f39159a.mo38215f();
            return true;
        }

        /* renamed from: g */
        public final void mo38418g() {
            C15267r.m44389a(C15133d.this.f39158q);
            if (!this.f39159a.mo38216g() && !this.f39159a.mo38217h()) {
                int a = C15133d.this.f39151j.mo38606a(C15133d.this.f39149h, this.f39159a);
                if (a != 0) {
                    mo38259a(new ConnectionResult(a, null));
                    return;
                }
                C15136c cVar = new C15136c(this.f39159a, this.f39165g);
                if (this.f39159a.mo38218i()) {
                    this.f39168j.mo38349a((C15096bs) cVar);
                }
                this.f39159a.mo38211a((C15234c) cVar);
            }
        }

        /* renamed from: a */
        public final void mo38411a(C15113cf cfVar) {
            C15267r.m44389a(C15133d.this.f39158q);
            this.f39167i.add(cfVar);
        }

        /* renamed from: d */
        private final void m44001d(ConnectionResult connectionResult) {
            for (C15113cf cfVar : this.f39167i) {
                String str = null;
                if (C15265q.m44381a(connectionResult, ConnectionResult.f38845a)) {
                    str = this.f39159a.mo38219j();
                }
                cfVar.mo38374a(this.f39165g, connectionResult, str);
            }
            this.f39167i.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public final boolean mo38419h() {
            return this.f39159a.mo38216g();
        }

        /* renamed from: i */
        public final boolean mo38420i() {
            return this.f39159a.mo38218i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public final C16967e mo38421j() {
            if (this.f39168j == null) {
                return null;
            }
            return this.f39168j.f39029a;
        }

        /* renamed from: a */
        private final Feature m43988a(Feature[] featureArr) {
            if (featureArr == null || featureArr.length == 0) {
                return null;
            }
            Feature[] k = this.f39159a.mo38220k();
            if (k == null) {
                k = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(k.length);
            for (Feature feature : k) {
                arrayMap.put(feature.f38850a, Long.valueOf(feature.mo38159a()));
            }
            for (Feature feature2 : featureArr) {
                if (!arrayMap.containsKey(feature2.f38850a) || ((Long) arrayMap.get(feature2.f38850a)).longValue() < feature2.mo38159a()) {
                    return feature2;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m43991a(C15135b bVar) {
            if (this.f39170l.contains(bVar) && !this.f39169k) {
                if (!this.f39159a.mo38216g()) {
                    mo38418g();
                    return;
                }
                m44004m();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m43996b(C15135b bVar) {
            if (this.f39170l.remove(bVar)) {
                C15133d.this.f39158q.removeMessages(15, bVar);
                C15133d.this.f39158q.removeMessages(16, bVar);
                Feature b = bVar.f39173b;
                ArrayList arrayList = new ArrayList(this.f39163e.size());
                for (C15065ap apVar : this.f39163e) {
                    if (apVar instanceof C15090bm) {
                        Feature[] b2 = ((C15090bm) apVar).mo38346b(this);
                        if (b2 != null && C15319b.m44556a((T[]) b2, b)) {
                            arrayList.add(apVar);
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    C15065ap apVar2 = (C15065ap) obj;
                    this.f39163e.remove(apVar2);
                    apVar2.mo38307a((RuntimeException) new UnsupportedApiCallException(b));
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    static class C15135b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C15110cd<?> f39172a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f39173b;

        private C15135b(C15110cd<?> cdVar, Feature feature) {
            this.f39172a = cdVar;
            this.f39173b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C15135b)) {
                return false;
            }
            C15135b bVar = (C15135b) obj;
            if (!C15265q.m44381a(this.f39172a, bVar.f39172a) || !C15265q.m44381a(this.f39173b, bVar.f39173b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C15265q.m44379a(this.f39172a, this.f39173b);
        }

        public final String toString() {
            return C15265q.m44380a((Object) this).mo38611a("key", this.f39172a).mo38611a("feature", this.f39173b).toString();
        }

        /* synthetic */ C15135b(C15110cd cdVar, Feature feature, C15075az azVar) {
            this(cdVar, feature);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$c */
    class C15136c implements C15096bs, C15234c {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C15028f f39175b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C15110cd<?> f39176c;

        /* renamed from: d */
        private C15256m f39177d;

        /* renamed from: e */
        private Set<Scope> f39178e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f39179f;

        public C15136c(C15028f fVar, C15110cd<?> cdVar) {
            this.f39175b = fVar;
            this.f39176c = cdVar;
        }

        /* renamed from: a */
        public final void mo38286a(ConnectionResult connectionResult) {
            C15133d.this.f39158q.post(new C15083bf(this, connectionResult));
        }

        /* renamed from: b */
        public final void mo38353b(ConnectionResult connectionResult) {
            ((C15134a) C15133d.this.f39154m.get(this.f39176c)).mo38413b(connectionResult);
        }

        /* renamed from: a */
        public final void mo38352a(C15256m mVar, Set<Scope> set) {
            if (mVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo38353b(new ConnectionResult(4));
                return;
            }
            this.f39177d = mVar;
            this.f39178e = set;
            m44028a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m44028a() {
            if (this.f39179f && this.f39177d != null) {
                this.f39175b.mo38213a(this.f39177d, this.f39178e);
            }
        }
    }

    /* renamed from: a */
    public static C15133d m43962a(Context context) {
        C15133d dVar;
        synchronized (f39144f) {
            if (f39145g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f39145g = new C15133d(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            dVar = f39145g;
        }
        return dVar;
    }

    /* renamed from: a */
    public static C15133d m43961a() {
        C15133d dVar;
        synchronized (f39144f) {
            C15267r.m44385a(f39145g, (Object) "Must guarantee manager is non-null before using getInstance");
            dVar = f39145g;
        }
        return dVar;
    }

    /* renamed from: b */
    public static void m43964b() {
        synchronized (f39144f) {
            if (f39145g != null) {
                C15133d dVar = f39145g;
                dVar.f39153l.incrementAndGet();
                dVar.f39158q.sendMessageAtFrontOfQueue(dVar.f39158q.obtainMessage(10));
            }
        }
    }

    private C15133d(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f39149h = context;
        this.f39158q = new C16355d(looper, this);
        this.f39150i = googleApiAvailability;
        this.f39151j = new C15255l(googleApiAvailability);
        this.f39158q.sendMessage(this.f39158q.obtainMessage(6));
    }

    /* renamed from: c */
    public final int mo38404c() {
        return this.f39152k.getAndIncrement();
    }

    /* renamed from: a */
    public final void mo38397a(C15034c<?> cVar) {
        this.f39158q.sendMessage(this.f39158q.obtainMessage(7, cVar));
    }

    /* renamed from: b */
    private final void m43965b(C15034c<?> cVar) {
        C15110cd<O> cdVar = cVar.f38886d;
        C15134a aVar = (C15134a) this.f39154m.get(cdVar);
        if (aVar == null) {
            aVar = new C15134a(cVar);
            this.f39154m.put(cdVar, aVar);
        }
        if (aVar.mo38420i()) {
            this.f39157p.add(cdVar);
        }
        aVar.mo38418g();
    }

    /* renamed from: a */
    public final void mo38400a(C15153t tVar) {
        synchronized (f39144f) {
            if (this.f39155n != tVar) {
                this.f39155n = tVar;
                this.f39156o.clear();
            }
            this.f39156o.addAll(tVar.f39204b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo38403b(C15153t tVar) {
        synchronized (f39144f) {
            if (this.f39155n == tVar) {
                this.f39155n = null;
                this.f39156o.clear();
            }
        }
    }

    /* renamed from: a */
    public final C17057f<Map<C15110cd<?>, String>> mo38396a(Iterable<? extends C15034c<?>> iterable) {
        C15113cf cfVar = new C15113cf(iterable);
        this.f39158q.sendMessage(this.f39158q.obtainMessage(2, cfVar));
        return cfVar.mo38375b();
    }

    /* renamed from: d */
    public final void mo38405d() {
        this.f39158q.sendMessage(this.f39158q.obtainMessage(3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo38406e() {
        this.f39153l.incrementAndGet();
        this.f39158q.sendMessage(this.f39158q.obtainMessage(10));
    }

    /* renamed from: a */
    public final <O extends C15021d> void mo38398a(C15034c<O> cVar, int i, C15105a<? extends C15044g, C15019b> aVar) {
        this.f39158q.sendMessage(this.f39158q.obtainMessage(4, new C15088bk(new C15107ca(i, aVar), this.f39153l.get(), cVar)));
    }

    /* renamed from: a */
    public final <O extends C15021d, ResultT> void mo38399a(C15034c<O> cVar, int i, C15147n<C15019b, ResultT> nVar, C17058g<ResultT> gVar, C15145l lVar) {
        this.f39158q.sendMessage(this.f39158q.obtainMessage(4, new C15088bk(new C15108cb(i, nVar, gVar, lVar), this.f39153l.get(), cVar)));
    }

    public final boolean handleMessage(Message message) {
        C15134a aVar;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f39148e = j;
                this.f39158q.removeMessages(12);
                for (C15110cd obtainMessage : this.f39154m.keySet()) {
                    this.f39158q.sendMessageDelayed(this.f39158q.obtainMessage(12, obtainMessage), this.f39148e);
                }
                break;
            case 2:
                C15113cf cfVar = (C15113cf) message.obj;
                Iterator it = cfVar.mo38373a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C15110cd cdVar = (C15110cd) it.next();
                        C15134a aVar2 = (C15134a) this.f39154m.get(cdVar);
                        if (aVar2 == null) {
                            cfVar.mo38374a(cdVar, new ConnectionResult(13), null);
                            break;
                        } else if (aVar2.mo38419h()) {
                            cfVar.mo38374a(cdVar, ConnectionResult.f38845a, aVar2.f39159a.mo38219j());
                        } else if (aVar2.mo38414c() != null) {
                            cfVar.mo38374a(cdVar, aVar2.mo38414c(), null);
                        } else {
                            aVar2.mo38411a(cfVar);
                            aVar2.mo38418g();
                        }
                    }
                }
            case 3:
                for (C15134a aVar3 : this.f39154m.values()) {
                    aVar3.mo38412b();
                    aVar3.mo38418g();
                }
                break;
            case 4:
            case 8:
            case 13:
                C15088bk bkVar = (C15088bk) message.obj;
                C15134a aVar4 = (C15134a) this.f39154m.get(bkVar.f39024c.f38886d);
                if (aVar4 == null) {
                    m43965b(bkVar.f39024c);
                    aVar4 = (C15134a) this.f39154m.get(bkVar.f39024c.f38886d);
                }
                if (aVar4.mo38420i() && this.f39153l.get() != bkVar.f39023b) {
                    bkVar.f39022a.mo38304a(f39142a);
                    aVar4.mo38408a();
                    break;
                } else {
                    aVar4.mo38410a(bkVar.f39022a);
                    break;
                }
                break;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f39154m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = (C15134a) it2.next();
                        if (aVar.f39161c == i) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String errorString = this.f39150i.getErrorString(connectionResult.f38846b);
                    String str = connectionResult.f38848d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(str).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(errorString);
                    sb2.append(": ");
                    sb2.append(str);
                    aVar.mo38409a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.f39149h.getApplicationContext() instanceof Application) {
                    C15076b.m43754a((Application) this.f39149h.getApplicationContext());
                    C15076b.m43753a().mo38328a((C15077a) new C15075az(this));
                    if (!C15076b.m43753a().mo38329a(true)) {
                        this.f39148e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m43965b((C15034c) message.obj);
                break;
            case 9:
                if (this.f39154m.containsKey(message.obj)) {
                    ((C15134a) this.f39154m.get(message.obj)).mo38415d();
                    break;
                }
                break;
            case 10:
                for (C15110cd remove : this.f39157p) {
                    ((C15134a) this.f39154m.remove(remove)).mo38408a();
                }
                this.f39157p.clear();
                break;
            case 11:
                if (this.f39154m.containsKey(message.obj)) {
                    ((C15134a) this.f39154m.get(message.obj)).mo38416e();
                    break;
                }
                break;
            case 12:
                if (this.f39154m.containsKey(message.obj)) {
                    ((C15134a) this.f39154m.get(message.obj)).mo38417f();
                    break;
                }
                break;
            case 14:
                C15154u uVar = (C15154u) message.obj;
                C15110cd<?> cdVar2 = uVar.f39206a;
                if (this.f39154m.containsKey(cdVar2)) {
                    uVar.f39207b.mo44299a(Boolean.valueOf(((C15134a) this.f39154m.get(cdVar2)).m43993a(false)));
                    break;
                } else {
                    uVar.f39207b.mo44299a(Boolean.valueOf(false));
                    break;
                }
            case 15:
                C15135b bVar = (C15135b) message.obj;
                if (this.f39154m.containsKey(bVar.f39172a)) {
                    ((C15134a) this.f39154m.get(bVar.f39172a)).m43991a(bVar);
                    break;
                }
                break;
            case 16:
                C15135b bVar2 = (C15135b) message.obj;
                if (this.f39154m.containsKey(bVar2.f39172a)) {
                    ((C15134a) this.f39154m.get(bVar2.f39172a)).m43996b(bVar2);
                    break;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PendingIntent mo38395a(C15110cd<?> cdVar, int i) {
        C15134a aVar = (C15134a) this.f39154m.get(cdVar);
        if (aVar == null) {
            return null;
        }
        C16967e j = aVar.mo38421j();
        if (j == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f39149h, i, j.mo38133d(), 134217728);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo38401a(ConnectionResult connectionResult, int i) {
        return this.f39150i.zaa(this.f39149h, connectionResult, i);
    }

    /* renamed from: b */
    public final void mo38402b(ConnectionResult connectionResult, int i) {
        if (!mo38401a(connectionResult, i)) {
            this.f39158q.sendMessage(this.f39158q.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
