package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.p022v4.util.C0904k;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15686fo;
import com.google.android.gms.internal.ads.C15690fs;
import com.google.android.gms.internal.ads.C15693fv;
import com.google.android.gms.internal.ads.C15696fy;
import com.google.android.gms.internal.ads.C15700gb;
import com.google.android.gms.internal.ads.C15703ge;
import com.google.android.gms.internal.ads.C15791jl;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C16076u;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.bys;
import com.google.android.gms.internal.ads.byw;
import com.google.android.gms.internal.ads.zzafl;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.j */
public final class C14828j extends byw {

    /* renamed from: a */
    private final Context f38353a;

    /* renamed from: b */
    private final bys f38354b;

    /* renamed from: c */
    private final C15931oq f38355c;

    /* renamed from: d */
    private final C15686fo f38356d;

    /* renamed from: e */
    private final C15703ge f38357e;

    /* renamed from: f */
    private final C15791jl f38358f;

    /* renamed from: g */
    private final C15690fs f38359g;

    /* renamed from: h */
    private final C15700gb f38360h;

    /* renamed from: i */
    private final zzyz f38361i;

    /* renamed from: j */
    private final PublisherAdViewOptions f38362j;

    /* renamed from: k */
    private final C0904k<String, C15696fy> f38363k;

    /* renamed from: l */
    private final C0904k<String, C15693fv> f38364l;

    /* renamed from: m */
    private final zzafl f38365m;

    /* renamed from: n */
    private final zzaks f38366n;

    /* renamed from: o */
    private final C16076u f38367o;

    /* renamed from: p */
    private final String f38368p;

    /* renamed from: q */
    private final zzbgz f38369q;

    /* renamed from: r */
    private WeakReference<C14797bb> f38370r;

    /* renamed from: s */
    private final C14816bu f38371s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Object f38372t = new Object();

    C14828j(Context context, String str, C15931oq oqVar, zzbgz zzbgz, bys bys, C15686fo foVar, C15703ge geVar, C15791jl jlVar, C15690fs fsVar, C0904k<String, C15696fy> kVar, C0904k<String, C15693fv> kVar2, zzafl zzafl, zzaks zzaks, C16076u uVar, C14816bu buVar, C15700gb gbVar, zzyz zzyz, PublisherAdViewOptions publisherAdViewOptions) {
        this.f38353a = context;
        this.f38368p = str;
        this.f38355c = oqVar;
        this.f38369q = zzbgz;
        this.f38354b = bys;
        this.f38359g = fsVar;
        this.f38356d = foVar;
        this.f38357e = geVar;
        this.f38358f = jlVar;
        this.f38363k = kVar;
        this.f38364l = kVar2;
        this.f38365m = zzafl;
        this.f38366n = zzaks;
        this.f38367o = uVar;
        this.f38371s = buVar;
        this.f38360h = gbVar;
        this.f38361i = zzyz;
        this.f38362j = publisherAdViewOptions;
        C15585bw.m50188a(this.f38353a);
    }

    /* renamed from: a */
    public final void mo37781a(zzyv zzyv) {
        m43050a((Runnable) new C14829k(this, zzyv));
    }

    /* renamed from: a */
    public final void mo37782a(zzyv zzyv, int i) {
        if (i > 0) {
            m43050a((Runnable) new C14830l(this, zzyv, i));
            return;
        }
        throw new IllegalArgumentException("Number of ads has to be more than 0");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m43051b(zzyv zzyv) {
        C14810bo boVar = new C14810bo(this.f38353a, this.f38371s, this.f38361i, this.f38368p, this.f38355c, this.f38369q);
        this.f38370r = new WeakReference<>(boVar);
        C15700gb gbVar = this.f38360h;
        C15267r.m44393b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        boVar.f38140e.f38247B = gbVar;
        if (this.f38362j != null) {
            if (this.f38362j.f38110b != null) {
                boVar.mo37593a(this.f38362j.f38110b);
            }
            boVar.mo37607a(this.f38362j.f38109a);
        }
        C15686fo foVar = this.f38356d;
        C15267r.m44393b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        boVar.f38140e.f38283r = foVar;
        C15703ge geVar = this.f38357e;
        C15267r.m44393b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
        boVar.f38140e.f38285t = geVar;
        C15690fs fsVar = this.f38359g;
        C15267r.m44393b("setOnContentAdLoadedListener must be called on the main UI thread.");
        boVar.f38140e.f38284s = fsVar;
        C0904k<String, C15696fy> kVar = this.f38363k;
        C15267r.m44393b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        boVar.f38140e.f38288w = kVar;
        C0904k<String, C15693fv> kVar2 = this.f38364l;
        C15267r.m44393b("setOnCustomClickListener must be called on the main UI thread.");
        boVar.f38140e.f38287v = kVar2;
        zzafl zzafl = this.f38365m;
        C15267r.m44393b("setNativeAdOptions must be called on the main UI thread.");
        boVar.f38140e.f38289x = zzafl;
        boVar.mo37752b(m43056f());
        boVar.mo37589a(this.f38354b);
        boVar.mo37596a(this.f38367o);
        ArrayList arrayList = new ArrayList();
        if (m43055e()) {
            arrayList.add(Integer.valueOf(1));
        }
        if (this.f38360h != null) {
            arrayList.add(Integer.valueOf(2));
        }
        boVar.mo37753c((List<Integer>) arrayList);
        if (m43055e()) {
            zzyv.f45779c.putBoolean("ina", true);
        }
        if (this.f38360h != null) {
            zzyv.f45779c.putBoolean("iba", true);
        }
        boVar.mo37614b(zzyv);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m43052b(zzyv zzyv, int i) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43828bV)).booleanValue() || this.f38358f == null) {
            C14772ad adVar = new C14772ad(this.f38353a, this.f38371s, zzyz.m53264a(this.f38353a), this.f38368p, this.f38355c, this.f38369q);
            this.f38370r = new WeakReference<>(adVar);
            C15686fo foVar = this.f38356d;
            C15267r.m44393b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            adVar.f38140e.f38283r = foVar;
            C15703ge geVar = this.f38357e;
            C15267r.m44393b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            adVar.f38140e.f38285t = geVar;
            C15791jl jlVar = this.f38358f;
            C15267r.m44393b("#008 Must be called on the main UI thread.: setInstreamAdLoadCallback");
            adVar.f38140e.f38286u = jlVar;
            C15690fs fsVar = this.f38359g;
            C15267r.m44393b("setOnContentAdLoadedListener must be called on the main UI thread.");
            adVar.f38140e.f38284s = fsVar;
            C0904k<String, C15696fy> kVar = this.f38363k;
            C15267r.m44393b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            adVar.f38140e.f38288w = kVar;
            adVar.mo37589a(this.f38354b);
            C0904k<String, C15693fv> kVar2 = this.f38364l;
            C15267r.m44393b("setOnCustomClickListener must be called on the main UI thread.");
            adVar.f38140e.f38287v = kVar2;
            adVar.mo37662b(m43056f());
            zzafl zzafl = this.f38365m;
            C15267r.m44393b("setNativeAdOptions must be called on the main UI thread.");
            adVar.f38140e.f38289x = zzafl;
            zzaks zzaks = this.f38366n;
            C15267r.m44393b("#008 Must be called on the main UI thread.: setInstreamAdConfiguration");
            adVar.f38140e.f38291z = zzaks;
            adVar.mo37596a(this.f38367o);
            adVar.mo37656a(i);
            adVar.mo37614b(zzyv);
            return;
        }
        if (this.f38354b != null) {
            try {
                this.f38354b.mo41420a(0);
            } catch (RemoteException e) {
                acd.m45780c("Failed calling onAdFailedToLoad.", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m43054d() {
        return this.f38358f == null && this.f38360h != null;
    }

    /* renamed from: e */
    private final boolean m43055e() {
        return (this.f38356d == null && this.f38359g == null && this.f38357e == null && (this.f38363k == null || this.f38363k.size() <= 0)) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo37780a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38372t
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.bb> r1 = r3.f38370r     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.bb> r1 = r3.f38370r     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.bb r1 = (com.google.android.gms.ads.internal.C14797bb) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.mo37684a()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14828j.mo37780a():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo37783b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38372t
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.bb> r1 = r3.f38370r     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.bb> r1 = r3.f38370r     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.bb r1 = (com.google.android.gms.ads.internal.C14797bb) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.mo37689y_()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14828j.mo37783b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo37784c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38372t
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.bb> r1 = r3.f38370r     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.bb> r1 = r3.f38370r     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.bb r1 = (com.google.android.gms.ads.internal.C14797bb) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r2 = r1.mo37626p()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14828j.mo37784c():boolean");
    }

    /* renamed from: f */
    private final List<String> m43056f() {
        ArrayList arrayList = new ArrayList();
        if (this.f38359g != null) {
            arrayList.add("1");
        }
        if (this.f38356d != null) {
            arrayList.add("2");
        }
        if (this.f38357e != null) {
            arrayList.add("6");
        }
        if (this.f38363k.size() > 0) {
            arrayList.add("3");
        }
        if (this.f38358f != null) {
            arrayList.add("2");
            arrayList.add("1");
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m43050a(Runnable runnable) {
        acl.f40003a.post(runnable);
    }
}
