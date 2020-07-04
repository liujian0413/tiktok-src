package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.C15322e;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C16947l extends C16896do {

    /* renamed from: a */
    private String f47464a;

    /* renamed from: b */
    private String f47465b;

    /* renamed from: c */
    private int f47466c;

    /* renamed from: d */
    private String f47467d;

    /* renamed from: e */
    private String f47468e;

    /* renamed from: f */
    private long f47469f;

    /* renamed from: g */
    private long f47470g;

    /* renamed from: h */
    private int f47471h;

    /* renamed from: i */
    private String f47472i;

    /* renamed from: j */
    private String f47473j;

    C16947l(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo43740t() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0179 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0198 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c9  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43824u() {
        /*
            r10 = this;
            java.lang.String r0 = "unknown"
            java.lang.String r1 = "Unknown"
            java.lang.String r2 = "Unknown"
            android.content.Context r3 = r10.mo43581m()
            java.lang.String r3 = r3.getPackageName()
            android.content.Context r4 = r10.mo43581m()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.r r4 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a
            java.lang.String r7 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)
            r4.mo44161a(r7, r8)
            goto L_0x0085
        L_0x002b:
            java.lang.String r7 = r4.getInstallerPackageName(r3)     // Catch:{ IllegalArgumentException -> 0x0031 }
            r0 = r7
            goto L_0x0040
        L_0x0031:
            com.google.android.gms.measurement.internal.r r7 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r7 = r7.f47487a
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)
            r7.mo44161a(r8, r9)
        L_0x0040:
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "manual_install"
            goto L_0x004f
        L_0x0045:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004f
            java.lang.String r0 = ""
        L_0x004f:
            android.content.Context r7 = r10.mo43581m()     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0076 }
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r7 == 0) goto L_0x0085
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.CharSequence r4 = r4.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0076 }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r8 != 0) goto L_0x006e
            java.lang.String r4 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0076 }
            r2 = r4
        L_0x006e:
            java.lang.String r4 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r1 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0075 }
            r6 = r1
            r1 = r4
            goto L_0x0085
        L_0x0075:
            r1 = r4
        L_0x0076:
            com.google.android.gms.measurement.internal.r r4 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a
            java.lang.String r7 = "Error retrieving package info. appId, appName"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)
            r4.mo44162a(r7, r8, r2)
        L_0x0085:
            r10.f47464a = r3
            r10.f47467d = r0
            r10.f47465b = r1
            r10.f47466c = r6
            r10.f47468e = r2
            r0 = 0
            r10.f47469f = r0
            android.content.Context r2 = r10.mo43581m()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C15137e.m44035a(r2)
            r4 = 1
            if (r2 == 0) goto L_0x00a6
            boolean r6 = r2.mo38201c()
            if (r6 == 0) goto L_0x00a6
            r6 = 1
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            com.google.android.gms.measurement.internal.ay r7 = r10.f47095q
            java.lang.String r7 = r7.f47005a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00bf
            java.lang.String r7 = "am"
            com.google.android.gms.measurement.internal.ay r8 = r10.f47095q
            java.lang.String r8 = r8.f47006b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00bf
            r7 = 1
            goto L_0x00c0
        L_0x00bf:
            r7 = 0
        L_0x00c0:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.r r2 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47487a
            java.lang.String r7 = "GoogleService failed to initialize (no status)"
            r2.mo44160a(r7)
            goto L_0x00e4
        L_0x00d1:
            com.google.android.gms.measurement.internal.r r7 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r7 = r7.f47487a
            java.lang.String r8 = "GoogleService failed to initialize, status"
            int r9 = r2.f38874g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.f38875h
            r7.mo44162a(r8, r9, r2)
        L_0x00e4:
            if (r6 == 0) goto L_0x0148
            com.google.android.gms.measurement.internal.eu r2 = r10.mo43587s()
            java.lang.Boolean r2 = r2.mo44059g()
            com.google.android.gms.measurement.internal.eu r6 = r10.mo43587s()
            boolean r6 = r6.mo44057f()
            if (r6 == 0) goto L_0x010c
            com.google.android.gms.measurement.internal.ay r2 = r10.f47095q
            boolean r2 = r2.mo43665i()
            if (r2 == 0) goto L_0x0148
            com.google.android.gms.measurement.internal.r r2 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47493g
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r2.mo44160a(r4)
            goto L_0x0148
        L_0x010c:
            if (r2 == 0) goto L_0x0128
            boolean r6 = r2.booleanValue()
            if (r6 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.ay r2 = r10.f47095q
            boolean r2 = r2.mo43665i()
            if (r2 == 0) goto L_0x0148
            com.google.android.gms.measurement.internal.r r2 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47493g
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r2.mo44160a(r4)
            goto L_0x0148
        L_0x0128:
            if (r2 != 0) goto L_0x013c
            boolean r2 = com.google.android.gms.common.api.internal.C15137e.m44038b()
            if (r2 == 0) goto L_0x013c
            com.google.android.gms.measurement.internal.r r2 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47493g
            java.lang.String r4 = "Collection disabled with google_app_measurement_enable=0"
            r2.mo44160a(r4)
            goto L_0x0148
        L_0x013c:
            com.google.android.gms.measurement.internal.r r2 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47495i
            java.lang.String r6 = "Collection enabled"
            r2.mo44160a(r6)
            goto L_0x0149
        L_0x0148:
            r4 = 0
        L_0x0149:
            java.lang.String r2 = ""
            r10.f47472i = r2
            java.lang.String r2 = ""
            r10.f47473j = r2
            r10.f47470g = r0
            com.google.android.gms.measurement.internal.ay r0 = r10.f47095q
            java.lang.String r0 = r0.f47005a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x016f
            java.lang.String r0 = "am"
            com.google.android.gms.measurement.internal.ay r1 = r10.f47095q
            java.lang.String r1 = r1.f47006b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016f
            com.google.android.gms.measurement.internal.ay r0 = r10.f47095q
            java.lang.String r0 = r0.f47005a
            r10.f47473j = r0
        L_0x016f:
            java.lang.String r0 = com.google.android.gms.common.api.internal.C15137e.m44037a()     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r1 == 0) goto L_0x017c
            java.lang.String r1 = ""
            goto L_0x017d
        L_0x017c:
            r1 = r0
        L_0x017d:
            r10.f47472i = r1     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r0 != 0) goto L_0x0196
            com.google.android.gms.common.internal.t r0 = new com.google.android.gms.common.internal.t     // Catch:{ IllegalStateException -> 0x01a8 }
            android.content.Context r1 = r10.mo43581m()     // Catch:{ IllegalStateException -> 0x01a8 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r1 = "admob_app_id"
            java.lang.String r0 = r0.mo38614a(r1)     // Catch:{ IllegalStateException -> 0x01a8 }
            r10.f47473j = r0     // Catch:{ IllegalStateException -> 0x01a8 }
        L_0x0196:
            if (r4 == 0) goto L_0x01b8
            com.google.android.gms.measurement.internal.r r0 = r10.mo43585q()     // Catch:{ IllegalStateException -> 0x01a8 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r1 = "App package, google app id"
            java.lang.String r2 = r10.f47464a     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r4 = r10.f47472i     // Catch:{ IllegalStateException -> 0x01a8 }
            r0.mo44162a(r1, r2, r4)     // Catch:{ IllegalStateException -> 0x01a8 }
            goto L_0x01b8
        L_0x01a8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r1 = r10.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a
            java.lang.String r2 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)
            r1.mo44162a(r2, r3, r0)
        L_0x01b8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x01c9
            android.content.Context r0 = r10.mo43581m()
            boolean r0 = com.google.android.gms.common.p749d.C15173a.m44148a(r0)
            r10.f47471h = r0
            return
        L_0x01c9:
            r10.f47471h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16947l.mo43824u():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzk mo44134a(String str) {
        String str2;
        mo43571c();
        String v = mo44135v();
        String w = mo44136w();
        mo43821B();
        String str3 = this.f47465b;
        long y = (long) mo44138y();
        mo43821B();
        String str4 = this.f47467d;
        mo43821B();
        mo43571c();
        if (this.f47469f == 0) {
            this.f47469f = this.f47095q.mo43662f().mo43895a(mo43581m(), mo43581m().getPackageName());
        }
        long j = this.f47469f;
        boolean t = this.f47095q.mo43672t();
        boolean z = !mo43586r().f46930p;
        mo43571c();
        if (!mo43587s().mo44062i(this.f47464a) || this.f47095q.mo43672t()) {
            str2 = m56255E();
        } else {
            str2 = null;
        }
        String str5 = str2;
        mo43821B();
        long j2 = this.f47470g;
        long u = this.f47095q.mo43673u();
        int z2 = mo44139z();
        Boolean b = mo43587s().mo44050b("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(b == null || b.booleanValue()).booleanValue();
        Boolean b2 = mo43587s().mo44050b("google_analytics_ssaid_collection_enabled");
        zzk zzk = new zzk(v, w, str3, y, str4, 14710, j, str, t, z, str5, j2, u, z2, booleanValue, Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue(), mo43586r().mo43610u(), mo44137x());
        return zzk;
    }

    /* renamed from: E */
    private final String m56255E() {
        try {
            Class loadClass = mo43581m().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{mo43581m()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    mo43585q().f47492f.mo44160a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                mo43585q().f47491e.mo44160a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final String mo44135v() {
        mo43821B();
        return this.f47464a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final String mo44136w() {
        mo43821B();
        return this.f47472i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final String mo44137x() {
        mo43821B();
        return this.f47473j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final int mo44138y() {
        mo43821B();
        return this.f47466c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final int mo44139z() {
        mo43821B();
        return this.f47471h;
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
