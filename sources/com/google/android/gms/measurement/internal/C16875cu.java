package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.C15307a;
import com.google.android.gms.common.util.C15322e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cu */
public final class C16875cu extends C16896do {

    /* renamed from: a */
    public volatile Boolean f47174a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16888dg f47175b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C16944i f47176c;

    /* renamed from: d */
    private final C16939fc f47177d;

    /* renamed from: e */
    private final C16906dy f47178e;

    /* renamed from: f */
    private final List<Runnable> f47179f = new ArrayList();

    /* renamed from: g */
    private final C16939fc f47180g;

    protected C16875cu(C16825ay ayVar) {
        super(ayVar);
        this.f47178e = new C16906dy(ayVar.mo43580l());
        this.f47175b = new C16888dg(this);
        this.f47177d = new C16876cv(this, ayVar);
        this.f47180g = new C16880cz(this, ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo43740t() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo43782v() {
        mo43571c();
        mo43821B();
        return this.f47176c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo43783w() {
        mo43571c();
        mo43821B();
        m55709a((Runnable) new C16882da(this, m55706a(true)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43775a(C16944i iVar, AbstractSafeParcelable abstractSafeParcelable, zzk zzk) {
        int i;
        mo43571c();
        mo43821B();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List a = mo43577i().mo44140a(100);
            if (a != null) {
                arrayList.addAll(a);
                i = a.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzag) {
                    try {
                        iVar.mo43687a((zzag) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e) {
                        mo43585q().f47487a.mo44161a("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzfv) {
                    try {
                        iVar.mo43689a((zzfv) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e2) {
                        mo43585q().f47487a.mo44161a("Failed to send attribute to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzo) {
                    try {
                        iVar.mo43692a((zzo) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e3) {
                        mo43585q().f47487a.mo44161a("Failed to send conditional property to the service", e3);
                    }
                } else {
                    mo43585q().f47487a.mo44160a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43776a(zzag zzag, String str) {
        C15267r.m44384a(zzag);
        mo43571c();
        mo43821B();
        C16883db dbVar = new C16883db(this, true, mo43577i().mo44141a(zzag), zzag, m55706a(true), str);
        m55709a((Runnable) dbVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43778a(zzo zzo) {
        C15267r.m44384a(zzo);
        mo43571c();
        mo43821B();
        C16884dc dcVar = new C16884dc(this, true, mo43577i().mo44143a(zzo), new zzo(zzo), m55706a(true), zzo);
        m55709a((Runnable) dcVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43780a(AtomicReference<List<zzo>> atomicReference, String str, String str2, String str3) {
        mo43571c();
        mo43821B();
        C16885dd ddVar = new C16885dd(this, atomicReference, str, str2, str3, m55706a(false));
        m55709a((Runnable) ddVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43781a(AtomicReference<List<zzfv>> atomicReference, String str, String str2, String str3, boolean z) {
        mo43571c();
        mo43821B();
        C16886de deVar = new C16886de(this, atomicReference, str, str2, str3, z, m55706a(false));
        m55709a((Runnable) deVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43777a(zzfv zzfv) {
        mo43571c();
        mo43821B();
        m55709a((Runnable) new C16887df(this, mo43577i().mo44142a(zzfv), zzfv, m55706a(true)));
    }

    /* renamed from: a */
    public final void mo43779a(AtomicReference<String> atomicReference) {
        mo43571c();
        mo43821B();
        m55709a((Runnable) new C16877cw(this, atomicReference, m55706a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo43784x() {
        mo43571c();
        mo43821B();
        m55709a((Runnable) new C16878cx(this, m55706a(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43773a(C16870cp cpVar) {
        mo43571c();
        mo43821B();
        m55709a((Runnable) new C16879cy(this, cpVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m55701E() {
        mo43571c();
        this.f47178e.mo43834a();
        this.f47177d.mo44126a(((Long) C16942h.f47394O.mo44132a()).longValue());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43785y() {
        /*
            r6 = this;
            r6.mo43571c()
            r6.mo43821B()
            boolean r0 = r6.mo43782v()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f47174a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x00fd
            r6.mo43571c()
            r6.mo43821B()
            com.google.android.gms.measurement.internal.af r0 = r6.mo43586r()
            java.lang.Boolean r0 = r0.mo43606h()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x00f7
        L_0x002c:
            com.google.android.gms.measurement.internal.l r0 = r6.mo43574f()
            int r0 = r0.mo44139z()
            if (r0 != r2) goto L_0x003a
        L_0x0036:
            r0 = 1
        L_0x0037:
            r3 = 1
            goto L_0x00d6
        L_0x003a:
            com.google.android.gms.measurement.internal.r r0 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i
            java.lang.String r3 = "Checking service availability"
            r0.mo44160a(r3)
            com.google.android.gms.measurement.internal.em r0 = r6.mo43583o()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.mo43894a(r3)
            r3 = 9
            if (r0 == r3) goto L_0x00ca
            r3 = 18
            if (r0 == r3) goto L_0x00bd
            switch(r0) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x00a3;
                case 2: goto L_0x0079;
                case 3: goto L_0x006d;
                default: goto L_0x005b;
            }
        L_0x005b:
            com.google.android.gms.measurement.internal.r r3 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r3 = r3.f47490d
            java.lang.String r4 = "Unexpected service status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo44161a(r4, r0)
        L_0x006a:
            r0 = 0
        L_0x006b:
            r3 = 0
            goto L_0x00d6
        L_0x006d:
            com.google.android.gms.measurement.internal.r r0 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d
            java.lang.String r3 = "Service disabled"
            r0.mo44160a(r3)
            goto L_0x006a
        L_0x0079:
            com.google.android.gms.measurement.internal.r r0 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47494h
            java.lang.String r3 = "Service container out of date"
            r0.mo44160a(r3)
            com.google.android.gms.measurement.internal.em r0 = r6.mo43583o()
            int r0 = r0.mo43915i()
            r3 = 14500(0x38a4, float:2.0319E-41)
            if (r0 >= r3) goto L_0x0091
            goto L_0x00ae
        L_0x0091:
            com.google.android.gms.measurement.internal.af r0 = r6.mo43586r()
            java.lang.Boolean r0 = r0.mo43606h()
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006a
        L_0x00a1:
            r0 = 1
            goto L_0x006b
        L_0x00a3:
            com.google.android.gms.measurement.internal.r r0 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i
            java.lang.String r3 = "Service missing"
            r0.mo44160a(r3)
        L_0x00ae:
            r0 = 0
            goto L_0x0037
        L_0x00b0:
            com.google.android.gms.measurement.internal.r r0 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i
            java.lang.String r3 = "Service available"
            r0.mo44160a(r3)
            goto L_0x0036
        L_0x00bd:
            com.google.android.gms.measurement.internal.r r0 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d
            java.lang.String r3 = "Service updating"
            r0.mo44160a(r3)
            goto L_0x0036
        L_0x00ca:
            com.google.android.gms.measurement.internal.r r0 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d
            java.lang.String r3 = "Service invalid"
            r0.mo44160a(r3)
            goto L_0x006a
        L_0x00d6:
            if (r0 != 0) goto L_0x00ee
            com.google.android.gms.measurement.internal.eu r4 = r6.mo43587s()
            boolean r4 = r4.mo44075u()
            if (r4 == 0) goto L_0x00ee
            com.google.android.gms.measurement.internal.r r3 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r3 = r3.f47487a
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.mo44160a(r4)
            r3 = 0
        L_0x00ee:
            if (r3 == 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.af r3 = r6.mo43586r()
            r3.mo43595a(r0)
        L_0x00f7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f47174a = r0
        L_0x00fd:
            java.lang.Boolean r0 = r6.f47174a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010b
            com.google.android.gms.measurement.internal.dg r0 = r6.f47175b
            r0.mo43802b()
            return
        L_0x010b:
            com.google.android.gms.measurement.internal.eu r0 = r6.mo43587s()
            boolean r0 = r0.mo44075u()
            if (r0 != 0) goto L_0x0163
            android.content.Context r0 = r6.mo43581m()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.mo43581m()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x013b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x013b
            r1 = 1
        L_0x013b:
            if (r1 == 0) goto L_0x0158
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.mo43581m()
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            com.google.android.gms.measurement.internal.dg r1 = r6.f47175b
            r1.mo43801a(r0)
            return
        L_0x0158:
            com.google.android.gms.measurement.internal.r r0 = r6.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.mo44160a(r1)
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16875cu.mo43785y():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43774a(C16944i iVar) {
        mo43571c();
        C15267r.m44384a(iVar);
        this.f47176c = iVar;
        m55701E();
        m55703G();
    }

    /* renamed from: z */
    public final void mo43786z() {
        mo43571c();
        mo43821B();
        this.f47175b.mo43800a();
        try {
            C15307a.m44540a();
            C15307a.m44541a(mo43581m(), this.f47175b);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f47176c = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m55707a(ComponentName componentName) {
        mo43571c();
        if (this.f47176c != null) {
            this.f47176c = null;
            mo43585q().f47495i.mo44161a("Disconnected from device MeasurementService", componentName);
            mo43571c();
            mo43785y();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m55702F() {
        mo43571c();
        if (mo43782v()) {
            mo43585q().f47495i.mo44160a("Inactivity, disconnecting from the service");
            mo43786z();
        }
    }

    /* renamed from: a */
    private final void m55709a(Runnable runnable) throws IllegalStateException {
        mo43571c();
        if (mo43782v()) {
            runnable.run();
        } else if (((long) this.f47179f.size()) >= 1000) {
            mo43585q().f47487a.mo44160a("Discarding data. Max runnable queue size reached");
        } else {
            this.f47179f.add(runnable);
            this.f47180g.mo44126a(60000);
            mo43785y();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m55703G() {
        mo43571c();
        mo43585q().f47495i.mo44161a("Processing queued up service tasks", Integer.valueOf(this.f47179f.size()));
        for (Runnable run : this.f47179f) {
            try {
                run.run();
            } catch (Exception e) {
                mo43585q().f47487a.mo44161a("Task exception while flushing queue", e);
            }
        }
        this.f47179f.clear();
        this.f47180g.mo44128c();
    }

    /* renamed from: a */
    private final zzk m55706a(boolean z) {
        return mo43574f().mo44134a(z ? mo43585q().mo44156P_() : null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C16800a mo43572d() {
        return super.mo43572d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C16858cd mo43573e() {
        return super.mo43573e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C16947l mo43574f() {
        return super.mo43574f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C16875cu mo43575g() {
        return super.mo43575g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C16871cq mo43576h() {
        return super.mo43576h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C16949n mo43577i() {
        return super.mo43577i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C16900ds mo43578j() {
        return super.mo43578j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
