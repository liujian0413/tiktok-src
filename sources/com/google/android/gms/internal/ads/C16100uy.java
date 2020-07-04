package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.internal.ads.zzxh.zza.zzb;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.uy */
public final class C16100uy extends abz implements C16114vl {

    /* renamed from: a */
    private final C16099ux f45136a;

    /* renamed from: b */
    private final C16123vu f45137b;

    /* renamed from: c */
    private final Object f45138c = new Object();

    /* renamed from: d */
    private final Context f45139d;

    /* renamed from: e */
    private final bwl f45140e;

    /* renamed from: f */
    private final bwp f45141f;

    /* renamed from: g */
    private zzaxe f45142g;

    /* renamed from: h */
    private Runnable f45143h;

    /* renamed from: i */
    private boolean f45144i;

    /* renamed from: j */
    private adi f45145j;

    /* renamed from: k */
    private zzaxi f45146k;

    /* renamed from: l */
    private C15916ob f45147l;

    public C16100uy(Context context, C16123vu vuVar, C16099ux uxVar, bwp bwp) {
        this.f45136a = uxVar;
        this.f45139d = context;
        this.f45137b = vuVar;
        this.f45141f = bwp;
        this.f45140e = new bwl(this.f45141f);
        this.f45140e.mo41409a((bwm) new C16101uz(this));
        bxo bxo = new bxo();
        bxo.f44113c = Integer.valueOf(this.f45137b.f45212j.f45678b);
        bxo.f44114d = Integer.valueOf(this.f45137b.f45212j.f45679c);
        bxo.f44115e = Integer.valueOf(this.f45137b.f45212j.f45680d ? 0 : 2);
        this.f45140e.mo41409a((bwm) new C16103va(bxo));
        if (this.f45137b.f45208f != null) {
            this.f45140e.mo41409a((bwm) new C16104vb(this));
        }
        zzyz zzyz = this.f45137b.f45205c;
        if (zzyz.f45801d && "interstitial_mb".equals(zzyz.f45798a)) {
            this.f45140e.mo41409a(C16105vc.f45151a);
        } else if (zzyz.f45801d && "reward_mb".equals(zzyz.f45798a)) {
            this.f45140e.mo41409a(C16106vd.f45152a);
        } else if (zzyz.f45805h || zzyz.f45801d) {
            this.f45140e.mo41409a(C16108vf.f45154a);
        } else {
            this.f45140e.mo41409a(C16107ve.f45153a);
        }
        this.f45140e.mo41410a(zzb.AD_REQUEST);
    }

    /* renamed from: a */
    public final void mo37835a() {
        acd.m45777b("AdLoaderBackgroundTask started.");
        this.f45143h = new C16109vg(this);
        acl.f40003a.postDelayed(this.f45143h, ((Long) bym.m50299d().mo41272a(C15585bw.f43847bo)).longValue());
        long b = C14793ay.m42901g().mo38685b();
        if (this.f45137b.f45204b.f45779c != null) {
            String string = this.f45137b.f45204b.f45779c.getString("_ad");
            if (string != null) {
                zzaxe zzaxe = new zzaxe(this.f45137b, b, null, null, null, null);
                this.f45142g = zzaxe;
                mo42023a(C16160xd.m52360a(this.f45139d, this.f45142g, string));
                return;
            }
        }
        aha aha = new aha();
        acj.m45508a((Runnable) new C16110vh(this, aha));
        zzaxe zzaxe2 = new zzaxe(this.f45137b, b, C14793ay.m42913s().mo39046c(this.f45139d), C14793ay.m42913s().mo39048d(this.f45139d), C14793ay.m42913s().mo39050e(this.f45139d), C14793ay.m42913s().mo39052f(this.f45139d));
        this.f45142g = zzaxe2;
        aha.mo39340a(this.f45142g);
    }

    /* renamed from: a */
    private final void m52261a(int i, String str) {
        zzaxe zzaxe;
        int i2 = i;
        if (i2 == 3 || i2 == -1) {
            acd.m45781d(str);
        } else {
            acd.m45783e(str);
        }
        if (this.f45146k == null) {
            this.f45146k = new zzaxi(i2);
        } else {
            this.f45146k = new zzaxi(i2, this.f45146k.f45633j);
        }
        if (this.f45142g != null) {
            zzaxe = this.f45142g;
        } else {
            zzaxe = new zzaxe(this.f45137b, -1, null, null, null, null);
        }
        abk abk = new abk(zzaxe, this.f45146k, this.f45147l, null, i, -1, this.f45146k.f45636m, null, this.f45140e, null);
        this.f45136a.mo37586a(abk);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42023a(com.google.android.gms.internal.ads.zzaxi r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Received ad response."
            com.google.android.gms.internal.ads.acd.m45777b(r0)
            r13.f45146k = r14
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k
            java.lang.String r14 = r14.f45617U
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x001a
            com.google.android.gms.internal.ads.aal r0 = com.google.android.gms.ads.internal.C14793ay.m42913s()
            android.content.Context r1 = r13.f45139d
            r0.mo39053f(r1, r14)
        L_0x001a:
            com.google.android.gms.common.util.e r14 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r6 = r14.mo38685b()
            java.lang.Object r14 = r13.f45138c
            monitor-enter(r14)
            r0 = 0
            r13.f45145j = r0     // Catch:{ all -> 0x022d }
            monitor-exit(r14)     // Catch:{ all -> 0x022d }
            com.google.android.gms.internal.ads.abp r14 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r14 = r14.mo39100j()
            com.google.android.gms.internal.ads.zzaxi r1 = r13.f45146k
            boolean r1 = r1.f45602F
            r14.mo39149d(r1)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C15585bw.f43766aM
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r14 = r1.mo41272a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k
            boolean r14 = r14.f45610N
            if (r14 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.abp r14 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r14 = r14.mo39100j()
            com.google.android.gms.internal.ads.zzaxe r1 = r13.f45142g
            java.lang.String r1 = r1.f45575e
            r14.mo39144c(r1)
            goto L_0x006f
        L_0x0060:
            com.google.android.gms.internal.ads.abp r14 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r14 = r14.mo39100j()
            com.google.android.gms.internal.ads.zzaxe r1 = r13.f45142g
            java.lang.String r1 = r1.f45575e
            r14.mo39148d(r1)
        L_0x006f:
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            int r14 = r14.f45627d     // Catch:{ vi -> 0x0219 }
            r1 = -2
            r2 = -3
            if (r14 == r1) goto L_0x009f
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            int r14 = r14.f45627d     // Catch:{ vi -> 0x0219 }
            if (r14 != r2) goto L_0x007e
            goto L_0x009f
        L_0x007e:
            com.google.android.gms.internal.ads.vi r14 = new com.google.android.gms.internal.ads.vi     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r0 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            int r0 = r0.f45627d     // Catch:{ vi -> 0x0219 }
            r1 = 66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ vi -> 0x0219 }
            r2.<init>(r1)     // Catch:{ vi -> 0x0219 }
            java.lang.String r1 = "There was a problem getting an ad response. ErrorCode: "
            r2.append(r1)     // Catch:{ vi -> 0x0219 }
            r2.append(r0)     // Catch:{ vi -> 0x0219 }
            java.lang.String r0 = r2.toString()     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r1 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            int r1 = r1.f45627d     // Catch:{ vi -> 0x0219 }
            r14.<init>(r0, r1)     // Catch:{ vi -> 0x0219 }
            throw r14     // Catch:{ vi -> 0x0219 }
        L_0x009f:
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            int r14 = r14.f45627d     // Catch:{ vi -> 0x0219 }
            r1 = 0
            if (r14 == r2) goto L_0x013c
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            java.lang.String r14 = r14.f45625b     // Catch:{ vi -> 0x0219 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ vi -> 0x0219 }
            if (r14 != 0) goto L_0x0133
            com.google.android.gms.internal.ads.abp r14 = com.google.android.gms.ads.internal.C14793ay.m42898d()     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.acf r14 = r14.mo39100j()     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            boolean r2 = r2.f45643t     // Catch:{ vi -> 0x0219 }
            r14.mo39138a(r2)     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            boolean r14 = r14.f45630g     // Catch:{ vi -> 0x0219 }
            if (r14 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.ob r14 = new com.google.android.gms.internal.ads.ob     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r2 = r2.f45625b     // Catch:{ JSONException -> 0x00dc }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x00dc }
            r13.f45147l = r14     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.abp r14 = com.google.android.gms.ads.internal.C14793ay.m42898d()     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.ob r2 = r13.f45147l     // Catch:{ JSONException -> 0x00dc }
            boolean r2 = r2.f44745h     // Catch:{ JSONException -> 0x00dc }
            r14.mo39090a(r2)     // Catch:{ JSONException -> 0x00dc }
            goto L_0x010e
        L_0x00dc:
            r14 = move-exception
            java.lang.String r0 = "Could not parse mediation config."
            com.google.android.gms.internal.ads.acd.m45778b(r0, r14)     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.vi r14 = new com.google.android.gms.internal.ads.vi     // Catch:{ vi -> 0x0219 }
            java.lang.String r0 = "Could not parse mediation config: "
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            java.lang.String r2 = r2.f45625b     // Catch:{ vi -> 0x0219 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ vi -> 0x0219 }
            int r3 = r2.length()     // Catch:{ vi -> 0x0219 }
            if (r3 == 0) goto L_0x00f9
            java.lang.String r0 = r0.concat(r2)     // Catch:{ vi -> 0x0219 }
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r2 = new java.lang.String     // Catch:{ vi -> 0x0219 }
            r2.<init>(r0)     // Catch:{ vi -> 0x0219 }
            r0 = r2
        L_0x00ff:
            r14.<init>(r0, r1)     // Catch:{ vi -> 0x0219 }
            throw r14     // Catch:{ vi -> 0x0219 }
        L_0x0103:
            com.google.android.gms.internal.ads.abp r14 = com.google.android.gms.ads.internal.C14793ay.m42898d()     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            boolean r2 = r2.f45605I     // Catch:{ vi -> 0x0219 }
            r14.mo39090a(r2)     // Catch:{ vi -> 0x0219 }
        L_0x010e:
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            java.lang.String r14 = r14.f45603G     // Catch:{ vi -> 0x0219 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ vi -> 0x0219 }
            if (r14 != 0) goto L_0x013c
            java.lang.String r14 = "Received cookie from server. Setting webview cookie in CookieManager."
            com.google.android.gms.internal.ads.acd.m45777b(r14)     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.acv r14 = com.google.android.gms.ads.internal.C14793ay.m42896b()     // Catch:{ vi -> 0x0219 }
            android.content.Context r2 = r13.f45139d     // Catch:{ vi -> 0x0219 }
            android.webkit.CookieManager r14 = r14.mo39204c(r2)     // Catch:{ vi -> 0x0219 }
            if (r14 == 0) goto L_0x013c
            java.lang.String r2 = "googleads.g.doubleclick.net"
            com.google.android.gms.internal.ads.zzaxi r3 = r13.f45146k     // Catch:{ vi -> 0x0219 }
            java.lang.String r3 = r3.f45603G     // Catch:{ vi -> 0x0219 }
            r14.setCookie(r2, r3)     // Catch:{ vi -> 0x0219 }
            goto L_0x013c
        L_0x0133:
            com.google.android.gms.internal.ads.vi r14 = new com.google.android.gms.internal.ads.vi     // Catch:{ vi -> 0x0219 }
            java.lang.String r0 = "No fill from ad server."
            r1 = 3
            r14.<init>(r0, r1)     // Catch:{ vi -> 0x0219 }
            throw r14     // Catch:{ vi -> 0x0219 }
        L_0x013c:
            com.google.android.gms.internal.ads.zzaxe r14 = r13.f45142g     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.zzyz r14 = r14.f45574d     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.zzyz[] r14 = r14.f45804g     // Catch:{ vi -> 0x0219 }
            if (r14 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzaxe r14 = r13.f45142g     // Catch:{ vi -> 0x0219 }
            com.google.android.gms.internal.ads.zzyz r14 = r13.m52260a(r14)     // Catch:{ vi -> 0x0219 }
            r4 = r14
            goto L_0x014d
        L_0x014c:
            r4 = r0
        L_0x014d:
            com.google.android.gms.internal.ads.abp r14 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r14 = r14.mo39100j()
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k
            boolean r2 = r2.f45644u
            r14.mo39142b(r2)
            com.google.android.gms.internal.ads.abp r14 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r14 = r14.mo39100j()
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k
            boolean r2 = r2.f45609M
            r14.mo39145c(r2)
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45146k
            java.lang.String r14 = r14.f45640q
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0186
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0180 }
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k     // Catch:{ Exception -> 0x0180 }
            java.lang.String r2 = r2.f45640q     // Catch:{ Exception -> 0x0180 }
            r14.<init>(r2)     // Catch:{ Exception -> 0x0180 }
            r10 = r14
            goto L_0x0187
        L_0x0180:
            r14 = move-exception
            java.lang.String r2 = "Error parsing the JSON for Active View."
            com.google.android.gms.internal.ads.acd.m45778b(r2, r14)
        L_0x0186:
            r10 = r0
        L_0x0187:
            com.google.android.gms.internal.ads.zzaxe r14 = r13.f45142g
            com.google.android.gms.internal.ads.zzyv r14 = r14.f45573c
            android.os.Bundle r14 = r14.f45789m
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k
            int r2 = r2.f45612P
            r3 = 2
            r5 = 1
            if (r2 != r3) goto L_0x01ba
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r1 = r1.getName()
            android.os.Bundle r1 = r14.getBundle(r1)
            if (r1 != 0) goto L_0x01b3
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            r14.putBundle(r2, r1)
        L_0x01b3:
            java.lang.String r2 = "render_test_ad_label"
            r1.putBoolean(r2, r5)
        L_0x01b8:
            r12 = r0
            goto L_0x01d4
        L_0x01ba:
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k
            int r2 = r2.f45612P
            if (r2 != r5) goto L_0x01c5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x01b8
        L_0x01c5:
            com.google.android.gms.internal.ads.zzaxi r1 = r13.f45146k
            int r1 = r1.f45612P
            if (r1 != 0) goto L_0x01b8
            boolean r0 = com.google.android.gms.internal.ads.aeu.m45704a(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01b8
        L_0x01d4:
            com.google.android.gms.internal.ads.zzaxi r0 = r13.f45146k
            boolean r0 = r0.f45618V
            if (r0 == 0) goto L_0x01f9
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r0 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r0 = r0.getName()
            android.os.Bundle r0 = r14.getBundle(r0)
            if (r0 != 0) goto L_0x01f4
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r1 = r1.getName()
            r14.putBundle(r1, r0)
        L_0x01f4:
            java.lang.String r14 = "is_analytics_logging_enabled"
            r0.putBoolean(r14, r5)
        L_0x01f9:
            com.google.android.gms.internal.ads.abk r14 = new com.google.android.gms.internal.ads.abk
            com.google.android.gms.internal.ads.zzaxe r1 = r13.f45142g
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45146k
            com.google.android.gms.internal.ads.ob r3 = r13.f45147l
            r5 = -2
            com.google.android.gms.internal.ads.zzaxi r0 = r13.f45146k
            long r8 = r0.f45636m
            com.google.android.gms.internal.ads.bwl r11 = r13.f45140e
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            com.google.android.gms.internal.ads.ux r0 = r13.f45136a
            r0.mo37586a(r14)
            android.os.Handler r14 = com.google.android.gms.internal.ads.acl.f40003a
            java.lang.Runnable r0 = r13.f45143h
            r14.removeCallbacks(r0)
            return
        L_0x0219:
            r14 = move-exception
            int r0 = r14.mo42028a()
            java.lang.String r14 = r14.getMessage()
            r13.m52261a(r0, r14)
            android.os.Handler r14 = com.google.android.gms.internal.ads.acl.f40003a
            java.lang.Runnable r0 = r13.f45143h
            r14.removeCallbacks(r0)
            return
        L_0x022d:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x022d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16100uy.mo42023a(com.google.android.gms.internal.ads.zzaxi):void");
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
        synchronized (this.f45138c) {
            if (this.f45145j != null) {
                this.f45145j.mo39127b();
            }
        }
    }

    /* renamed from: a */
    private final zzyz m52260a(zzaxe zzaxe) throws C16111vi {
        int i;
        zzyz[] zzyzArr;
        if (((this.f45142g == null || this.f45142g.f45559V == null || this.f45142g.f45559V.size() <= 1) ? false : true) && this.f45147l != null && !this.f45147l.f44758u) {
            return null;
        }
        if (this.f45146k.f45648y) {
            for (zzyz zzyz : zzaxe.f45574d.f45804g) {
                if (zzyz.f45806i) {
                    return new zzyz(zzyz, zzaxe.f45574d.f45804g);
                }
            }
        }
        if (this.f45146k.f45635l != null) {
            String[] split = this.f45146k.f45635l.split("x");
            if (split.length != 2) {
                String str = "Invalid ad size format from the ad response: ";
                String valueOf = String.valueOf(this.f45146k.f45635l);
                throw new C16111vi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                zzyz[] zzyzArr2 = zzaxe.f45574d.f45804g;
                int length = zzyzArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    zzyz zzyz2 = zzyzArr2[i2];
                    float f = this.f45139d.getResources().getDisplayMetrics().density;
                    int i3 = zzyz2.f45802e == -1 ? (int) (((float) zzyz2.f45803f) / f) : zzyz2.f45802e;
                    if (zzyz2.f45799b == -2) {
                        i = (int) (((float) zzyz2.f45800c) / f);
                    } else {
                        i = zzyz2.f45799b;
                    }
                    if (parseInt == i3 && parseInt2 == i && !zzyz2.f45806i) {
                        return new zzyz(zzyz2, zzaxe.f45574d.f45804g);
                    }
                }
                String str2 = "The ad size from the ad response was not one of the requested sizes: ";
                String valueOf2 = String.valueOf(this.f45146k.f45635l);
                throw new C16111vi(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), 0);
            } catch (NumberFormatException unused) {
                String str3 = "Invalid ad size number from the ad response: ";
                String valueOf3 = String.valueOf(this.f45146k.f45635l);
                throw new C16111vi(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), 0);
            }
        } else {
            throw new C16111vi("The ad response must specify one of the supported ad sizes.", 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo42021a(com.google.android.gms.internal.ads.agw r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f45138c
            monitor-enter(r0)
            boolean r1 = r4.f45144i     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x000e
            java.lang.String r5 = "Request task was already canceled"
            com.google.android.gms.internal.ads.acd.m45783e(r5)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x000e:
            com.google.android.gms.internal.ads.vu r1 = r4.f45137b     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzbgz r1 = r1.f45212j     // Catch:{ all -> 0x005d }
            android.content.Context r2 = r4.f45139d     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.vk r3 = new com.google.android.gms.internal.ads.vk     // Catch:{ all -> 0x005d }
            r3.<init>(r2)     // Catch:{ all -> 0x005d }
            boolean r3 = r3.mo42029a(r1)     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x002d
            java.lang.String r1 = "Fetching ad response from local ad request service."
            com.google.android.gms.internal.ads.acd.m45777b(r1)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.vr r1 = new com.google.android.gms.internal.ads.vr     // Catch:{ all -> 0x005d }
            r1.<init>(r2, r5, r4)     // Catch:{ all -> 0x005d }
            r1.mo39128c()     // Catch:{ all -> 0x005d }
            goto L_0x0048
        L_0x002d:
            java.lang.String r3 = "Fetching ad response from remote ad request service."
            com.google.android.gms.internal.ads.acd.m45777b(r3)     // Catch:{ all -> 0x005d }
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r3 = com.google.android.gms.internal.ads.afb.m45738c(r2, r3)     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x0042
            java.lang.String r5 = "Failed to connect to remote ad request service."
            com.google.android.gms.internal.ads.acd.m45783e(r5)     // Catch:{ all -> 0x005d }
            r1 = 0
            goto L_0x0048
        L_0x0042:
            com.google.android.gms.internal.ads.vs r3 = new com.google.android.gms.internal.ads.vs     // Catch:{ all -> 0x005d }
            r3.<init>(r2, r1, r5, r4)     // Catch:{ all -> 0x005d }
            r1 = r3
        L_0x0048:
            r4.f45145j = r1     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.adi r5 = r4.f45145j     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x005b
            r5 = 0
            java.lang.String r1 = "Could not start the ad request service."
            r4.m52261a(r5, r1)     // Catch:{ all -> 0x005d }
            android.os.Handler r5 = com.google.android.gms.internal.ads.acl.f40003a     // Catch:{ all -> 0x005d }
            java.lang.Runnable r1 = r4.f45143h     // Catch:{ all -> 0x005d }
            r5.removeCallbacks(r1)     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x005d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16100uy.mo42021a(com.google.android.gms.internal.ads.agw):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo42025d() {
        synchronized (this.f45138c) {
            this.f45144i = true;
            if (this.f45145j != null) {
                mo37836u_();
            }
            m52261a(2, "Timed out waiting for ad response.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo42022a(bxn bxn) {
        bxn.f44104e.f44094c = this.f45137b.f45208f.packageName;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo42024b(bxn bxn) {
        bxn.f44102c = this.f45137b.f45224v;
    }
}
