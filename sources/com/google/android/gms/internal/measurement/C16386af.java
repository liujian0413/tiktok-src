package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.C14924c;
import com.google.android.gms.analytics.C14930i;
import com.google.android.gms.analytics.C14931j;
import com.google.android.gms.analytics.C14933l;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.af */
final class C16386af extends C16695r {

    /* renamed from: b */
    private boolean f45866b;

    /* renamed from: c */
    private final C16383ac f45867c;

    /* renamed from: d */
    private final C16418bk f45868d;

    /* renamed from: e */
    private final C16417bj f45869e;

    /* renamed from: f */
    private final C16701x f45870f;

    /* renamed from: g */
    private long f45871g = Long.MIN_VALUE;

    /* renamed from: h */
    private final C16400at f45872h;

    /* renamed from: i */
    private final C16400at f45873i;

    /* renamed from: j */
    private final C16431bx f45874j;

    /* renamed from: k */
    private long f45875k;

    /* renamed from: l */
    private boolean f45876l;

    protected C16386af(C16697t tVar, C16699v vVar) {
        super(tVar);
        C15267r.m44384a(vVar);
        this.f45869e = new C16417bj(tVar);
        this.f45867c = new C16383ac(tVar);
        this.f45868d = new C16418bk(tVar);
        this.f45870f = new C16701x(tVar);
        this.f45874j = new C16431bx(mo43203g());
        this.f45872h = new C16387ag(this, tVar);
        this.f45873i = new C16388ah(this, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
        this.f45867c.mo43215t();
        this.f45868d.mo43215t();
        this.f45870f.mo43215t();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42499b() {
        mo43214s();
        C15267r.m44391a(!this.f45866b, (Object) "Analytics backend already started");
        this.f45866b = true;
        mo43207k().mo38003a((Runnable) new C16389ai(this));
    }

    /* renamed from: g */
    private final boolean m53395g(String str) {
        return C15176d.m44159a(mo43204h()).mo38460a(str) == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo42500c() {
        mo43214s();
        C14933l.m43382c();
        Context context = this.f46634a.f46639a;
        if (!C16424bq.m53530a(context)) {
            mo43200e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C16425br.m53533a(context)) {
            mo43202f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.m43331a(context)) {
            mo43200e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        mo43211o().mo42551b();
        if (!m53395g("android.permission.ACCESS_NETWORK_STATE")) {
            mo43202f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m53391C();
        }
        if (!m53395g("android.permission.INTERNET")) {
            mo43202f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m53391C();
        }
        if (C16425br.m53533a(mo43204h())) {
            mo43190b("AnalyticsService registered in the app manifest and enabled");
        } else {
            mo43200e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.f45876l && !this.f45867c.mo42485e()) {
            m53398w();
        }
        mo42503f();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m53396u() {
        mo42495a((C16404ax) new C16390aj(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo42501d() {
        C14933l.m43382c();
        this.f45875k = mo43203g().mo38684a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[LOOP:1: B:15:0x0044->B:23:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0040 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42502e() {
        /*
            r5 = this;
            com.google.android.gms.analytics.C14933l.m43382c()
            com.google.android.gms.analytics.C14933l.m43382c()
            r5.mo43214s()
            boolean r0 = com.google.android.gms.internal.measurement.C16398ar.m53430b()
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.mo43200e(r0)
        L_0x0014:
            com.google.android.gms.internal.measurement.x r0 = r5.f45870f
            boolean r0 = r0.mo43229b()
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Service not connected"
            r5.mo43190b(r0)
            return
        L_0x0022:
            com.google.android.gms.internal.measurement.ac r0 = r5.f45867c
            boolean r0 = r0.mo42485e()
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.mo43190b(r0)
        L_0x002f:
            com.google.android.gms.internal.measurement.ac r0 = r5.f45867c     // Catch:{ SQLiteException -> 0x0072 }
            int r1 = com.google.android.gms.internal.measurement.C16398ar.m53434f()     // Catch:{ SQLiteException -> 0x0072 }
            long r1 = (long) r1     // Catch:{ SQLiteException -> 0x0072 }
            java.util.List r0 = r0.mo42475a(r1)     // Catch:{ SQLiteException -> 0x0072 }
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0044
            r5.mo42503f()     // Catch:{ SQLiteException -> 0x0072 }
            return
        L_0x0044:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x002f
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.be r1 = (com.google.android.gms.internal.measurement.C16412be) r1
            com.google.android.gms.internal.measurement.x r2 = r5.f45870f
            boolean r2 = r2.mo43228a(r1)
            if (r2 != 0) goto L_0x005d
            r5.mo42503f()
            return
        L_0x005d:
            r0.remove(r1)
            com.google.android.gms.internal.measurement.ac r2 = r5.f45867c     // Catch:{ SQLiteException -> 0x0068 }
            long r3 = r1.f45956c     // Catch:{ SQLiteException -> 0x0068 }
            r2.mo42480b(r3)     // Catch:{ SQLiteException -> 0x0068 }
            goto L_0x0044
        L_0x0068:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.mo43201e(r1, r0)
            r5.m53389A()
            return
        L_0x0072:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.mo43201e(r1, r0)
            r5.m53389A()
            return
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16386af.mo42502e():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m53397v() {
        try {
            this.f45867c.mo42486f();
            mo42503f();
        } catch (SQLiteException e) {
            mo43198d("Failed to delete stale hits", e);
        }
        this.f45873i.mo42521a(86400000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42497a(C16700w wVar) {
        C14933l.m43382c();
        mo43191b("Sending first hit to property", wVar.f46659c);
        if (!mo43211o().mo42552c().mo42567a(C16398ar.m53439l())) {
            String f = mo43211o().mo42555f();
            if (!TextUtils.isEmpty(f)) {
                C16677kn a = C16432by.m53547a(mo43205i(), f);
                mo43191b("Found relevant installation campaign", a);
                m53393a(wVar, a);
            }
        }
    }

    /* renamed from: w */
    private final void m53398w() {
        if (!this.f45876l && C16398ar.m53430b() && !this.f45870f.mo43229b()) {
            if (this.f45874j.mo42567a(((Long) C16406az.f45902C.f45945a).longValue())) {
                this.f45874j.mo42566a();
                mo43190b("Connecting to service");
                if (this.f45870f.mo43230c()) {
                    mo43190b("Connected to service");
                    this.f45874j.mo42568b();
                    mo42502e();
                }
            }
        }
    }

    /* renamed from: a */
    public final long mo42494a(C16700w wVar, boolean z) {
        C15267r.m44384a(wVar);
        mo43214s();
        C14933l.m43382c();
        try {
            this.f45867c.mo42479b();
            C16383ac acVar = this.f45867c;
            long j = wVar.f46657a;
            String str = wVar.f46658b;
            C15267r.m44386a(str);
            acVar.mo43214s();
            C14933l.m43382c();
            int delete = acVar.mo42488v().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(j), str});
            if (delete > 0) {
                acVar.mo43187a("Deleted property records", Integer.valueOf(delete));
            }
            long a = this.f45867c.mo42474a(wVar.f46657a, wVar.f46658b, wVar.f46659c);
            wVar.f46661e = 1 + a;
            C16383ac acVar2 = this.f45867c;
            C15267r.m44384a(wVar);
            acVar2.mo43214s();
            C14933l.m43382c();
            SQLiteDatabase v = acVar2.mo42488v();
            Map<String, String> map = wVar.f46662f;
            C15267r.m44384a(map);
            Builder builder = new Builder();
            for (Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_uid", Long.valueOf(wVar.f46657a));
            contentValues.put("cid", wVar.f46658b);
            contentValues.put("tid", wVar.f46659c);
            contentValues.put("adid", Integer.valueOf(wVar.f46660d ? 1 : 0));
            contentValues.put("hits_count", Long.valueOf(wVar.f46661e));
            contentValues.put("params", encodedQuery);
            try {
                if (v.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                    acVar2.mo43202f("Failed to insert/update a property (got -1)");
                }
            } catch (SQLiteException e) {
                acVar2.mo43201e("Error storing a property", e);
            }
            this.f45867c.mo42482c();
            try {
            } catch (SQLiteException e2) {
                mo43201e("Failed to end transaction", e2);
            }
            return a;
        } catch (SQLiteException e3) {
            mo43201e("Failed to update Analytics property", e3);
            try {
            } catch (SQLiteException e4) {
                mo43201e("Failed to end transaction", e4);
            }
            return -1;
        } finally {
            try {
                this.f45867c.mo42484d();
            } catch (SQLiteException e5) {
                mo43201e("Failed to end transaction", e5);
            }
        }
    }

    /* renamed from: a */
    public final void mo42496a(C16412be beVar) {
        C15267r.m44384a(beVar);
        C14933l.m43382c();
        mo43214s();
        if (this.f45876l) {
            mo43194c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            mo43187a("Delivering hit", beVar);
        }
        if (TextUtils.isEmpty(beVar.mo42534b())) {
            Pair a = mo43211o().f45973b.mo42556a();
            if (a != null) {
                Long l = (Long) a.second;
                String str = (String) a.first;
                String valueOf = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str);
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap(beVar.f45954a);
                hashMap.put("_m", sb2);
                C16412be beVar2 = new C16412be(this, hashMap, beVar.f45957d, beVar.f45959f, beVar.f45956c, beVar.f45958e, beVar.f45955b);
                beVar = beVar2;
            }
        }
        m53398w();
        if (this.f45870f.mo43228a(beVar)) {
            mo43194c("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.f45867c.mo42477a(beVar);
            mo42503f();
        } catch (SQLiteException e) {
            mo43201e("Delivery failed to save hit to a database", e);
            mo43205i().mo42538a(beVar, "deliver: failed to insert hit to database");
        }
    }

    /* renamed from: x */
    private final boolean m53399x() {
        C14933l.m43382c();
        mo43214s();
        mo43190b("Dispatching a batch of local hits");
        boolean z = !this.f45868d.mo42547b();
        if (!(!this.f45870f.mo43229b()) || !z) {
            long max = (long) Math.max(C16398ar.m53434f(), C16398ar.m53435g());
            ArrayList arrayList = new ArrayList();
            long j = 0;
            while (true) {
                this.f45867c.mo42479b();
                arrayList.clear();
                try {
                    List<C16412be> a = this.f45867c.mo42475a(max);
                    if (a.isEmpty()) {
                        mo43190b("Store is empty, nothing to dispatch");
                        m53389A();
                        try {
                            this.f45867c.mo42482c();
                            this.f45867c.mo42484d();
                            return false;
                        } catch (SQLiteException e) {
                            mo43201e("Failed to commit local dispatch transaction", e);
                            m53389A();
                            return false;
                        }
                    } else {
                        mo43187a("Hits loaded from store. count", Integer.valueOf(a.size()));
                        for (C16412be beVar : a) {
                            if (beVar.f45956c == j) {
                                mo43199d("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(a.size()));
                                m53389A();
                                try {
                                    this.f45867c.mo42482c();
                                    this.f45867c.mo42484d();
                                    return false;
                                } catch (SQLiteException e2) {
                                    mo43201e("Failed to commit local dispatch transaction", e2);
                                    m53389A();
                                    return false;
                                }
                            }
                        }
                        if (this.f45870f.mo43229b()) {
                            mo43190b("Service connected, sending hits to the service");
                            while (!a.isEmpty()) {
                                C16412be beVar2 = (C16412be) a.get(0);
                                if (this.f45870f.mo43228a(beVar2)) {
                                    j = Math.max(j, beVar2.f45956c);
                                    a.remove(beVar2);
                                    mo43191b("Hit sent do device AnalyticsService for delivery", beVar2);
                                    try {
                                        this.f45867c.mo42480b(beVar2.f45956c);
                                        arrayList.add(Long.valueOf(beVar2.f45956c));
                                    } catch (SQLiteException e3) {
                                        mo43201e("Failed to remove hit that was send for delivery", e3);
                                        m53389A();
                                        try {
                                            return false;
                                        } catch (SQLiteException e4) {
                                            mo43201e("Failed to commit local dispatch transaction", e4);
                                            m53389A();
                                            return false;
                                        }
                                    } finally {
                                        try {
                                            this.f45867c.mo42482c();
                                            this.f45867c.mo42484d();
                                        } catch (SQLiteException e5) {
                                            mo43201e("Failed to commit local dispatch transaction", e5);
                                            m53389A();
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        if (this.f45868d.mo42547b()) {
                            List<Long> a2 = this.f45868d.mo42546a(a);
                            for (Long longValue : a2) {
                                j = Math.max(j, longValue.longValue());
                            }
                            try {
                                this.f45867c.mo42478a(a2);
                                arrayList.addAll(a2);
                            } catch (SQLiteException e6) {
                                mo43201e("Failed to remove successfully uploaded hits", e6);
                                m53389A();
                                try {
                                    this.f45867c.mo42482c();
                                    this.f45867c.mo42484d();
                                    return false;
                                } catch (SQLiteException e7) {
                                    mo43201e("Failed to commit local dispatch transaction", e7);
                                    m53389A();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                return false;
                            } catch (SQLiteException e8) {
                                mo43201e("Failed to commit local dispatch transaction", e8);
                                m53389A();
                                return false;
                            }
                        } else {
                            try {
                                this.f45867c.mo42482c();
                                this.f45867c.mo42484d();
                            } catch (SQLiteException e9) {
                                mo43201e("Failed to commit local dispatch transaction", e9);
                                m53389A();
                                return false;
                            }
                        }
                    }
                } catch (SQLiteException e10) {
                    mo43198d("Failed to read hits from persisted store", e10);
                    m53389A();
                    try {
                        this.f45867c.mo42482c();
                        this.f45867c.mo42484d();
                        return false;
                    } catch (SQLiteException e11) {
                        mo43201e("Failed to commit local dispatch transaction", e11);
                        m53389A();
                        return false;
                    }
                }
            }
        } else {
            mo43190b("No network or service available. Will retry later");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo42495a(C16404ax axVar) {
        long j = this.f45875k;
        C14933l.m43382c();
        mo43214s();
        long d = mo43211o().mo42553d();
        mo43191b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(d != 0 ? Math.abs(mo43203g().mo38684a() - d) : -1));
        m53398w();
        try {
            m53399x();
            mo43211o().mo42554e();
            mo42503f();
            if (axVar != null) {
                axVar.mo42506a(null);
            }
            if (this.f45875k != j) {
                this.f45869e.mo42542c();
            }
        } catch (Exception e) {
            mo43201e("Local dispatch failed", e);
            mo43211o().mo42554e();
            mo42503f();
            if (axVar != null) {
                axVar.mo42506a(e);
            }
        }
    }

    /* renamed from: y */
    private final long m53400y() {
        C14933l.m43382c();
        mo43214s();
        try {
            return this.f45867c.mo42487u();
        } catch (SQLiteException e) {
            mo43201e("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    /* renamed from: f */
    public final void mo42503f() {
        long j;
        C14933l.m43382c();
        mo43214s();
        boolean z = true;
        if (!(!this.f45876l && m53390B() > 0)) {
            this.f45869e.mo42541b();
            m53389A();
        } else if (this.f45867c.mo42485e()) {
            this.f45869e.mo42541b();
            m53389A();
        } else {
            if (!((Boolean) C16406az.f45943z.f45945a).booleanValue()) {
                this.f45869e.mo42540a();
                z = this.f45869e.mo42543d();
            }
            if (z) {
                m53401z();
                long B = m53390B();
                long d = mo43211o().mo42553d();
                if (d != 0) {
                    j = B - Math.abs(mo43203g().mo38684a() - d);
                    if (j <= 0) {
                        j = Math.min(C16398ar.m53432d(), B);
                    }
                } else {
                    j = Math.min(C16398ar.m53432d(), B);
                }
                mo43187a("Dispatch scheduled (ms)", Long.valueOf(j));
                if (this.f45872h.mo42524c()) {
                    this.f45872h.mo42523b(Math.max(1, j + this.f45872h.mo42522b()));
                } else {
                    this.f45872h.mo42521a(j);
                }
            } else {
                m53389A();
                m53401z();
            }
        }
    }

    /* renamed from: z */
    private final void m53401z() {
        C16403aw m = mo43209m();
        if (m.f45896b && !m.f45897c) {
            long y = m53400y();
            if (y != 0 && Math.abs(mo43203g().mo38684a() - y) <= ((Long) C16406az.f45925h.f45945a).longValue()) {
                mo43187a("Dispatch alarm scheduled (ms)", Long.valueOf(C16398ar.m53433e()));
                m.mo42528b();
            }
        }
    }

    /* renamed from: A */
    private final void m53389A() {
        if (this.f45872h.mo42524c()) {
            mo43190b("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f45872h.mo42525d();
        C16403aw m = mo43209m();
        if (m.f45897c) {
            m.mo42529c();
        }
    }

    /* renamed from: B */
    private final long m53390B() {
        if (this.f45871g != Long.MIN_VALUE) {
            return this.f45871g;
        }
        long longValue = ((Long) C16406az.f45922e.f45945a).longValue();
        C16433bz n = mo43210n();
        n.mo43214s();
        if (n.f45998b) {
            C16433bz n2 = mo43210n();
            n2.mo43214s();
            longValue = ((long) n2.f45999c) * 1000;
        }
        return longValue;
    }

    /* renamed from: a */
    public final void mo42498a(String str) {
        C15267r.m44386a(str);
        C14933l.m43382c();
        C16677kn a = C16432by.m53547a(mo43205i(), str);
        if (a == null) {
            mo43198d("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String f = mo43211o().mo42555f();
        if (str.equals(f)) {
            mo43200e("Ignoring duplicate install campaign");
        } else if (!TextUtils.isEmpty(f)) {
            mo43199d("Ignoring multiple install campaigns. original, new", f, str);
        } else {
            mo43211o().mo42550a(str);
            if (mo43211o().mo42552c().mo42567a(C16398ar.m53439l())) {
                mo43198d("Campaign received too late, ignoring", a);
                return;
            }
            mo43191b("Received installation campaign", a);
            for (C16700w a2 : this.f45867c.mo42481c(0)) {
                m53393a(a2, a);
            }
        }
    }

    /* renamed from: a */
    private final void m53393a(C16700w wVar, C16677kn knVar) {
        C15267r.m44384a(wVar);
        C15267r.m44384a(knVar);
        C14924c cVar = new C14924c(this.f46634a);
        cVar.mo37984a(wVar.f46659c);
        cVar.f38594d = wVar.f46660d;
        C14930i d = cVar.mo37985d();
        C16545g gVar = (C16545g) d.mo37993b(C16545g.class);
        gVar.f46333a = "data";
        gVar.mo42758a(true);
        d.mo37992a((C14931j) knVar);
        C16407b bVar = (C16407b) d.mo37993b(C16407b.class);
        C16648jp jpVar = (C16648jp) d.mo37993b(C16648jp.class);
        for (Entry entry : wVar.f46662f.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                jpVar.f46519a = str2;
            } else if ("av".equals(str)) {
                jpVar.f46520b = str2;
            } else if ("aid".equals(str)) {
                jpVar.f46521c = str2;
            } else if ("aiid".equals(str)) {
                jpVar.f46522d = str2;
            } else if ("uid".equals(str)) {
                gVar.f46335c = str2;
            } else {
                bVar.mo42531a(str, str2);
            }
        }
        mo43192b("Sending installation campaign to", wVar.f46659c, knVar);
        d.f38605d = mo43211o().mo42551b();
        d.mo37995c();
    }

    /* renamed from: C */
    private final void m53391C() {
        mo43214s();
        C14933l.m43382c();
        this.f45876l = true;
        this.f45870f.mo43231d();
        mo42503f();
    }
}
