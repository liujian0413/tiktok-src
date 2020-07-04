package com.p280ss.android.p817ad.splash.core;

import android.text.TextUtils;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19008g;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.p817ad.splash.p836g.C19126e;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.p */
class C19051p {

    /* renamed from: a */
    private static C19051p f51482a;

    private C19051p() {
    }

    /* renamed from: a */
    public static C19051p m62290a() {
        if (f51482a == null) {
            synchronized (C19051p.class) {
                if (f51482a == null) {
                    f51482a = new C19051p();
                }
            }
        }
        return f51482a;
    }

    /* renamed from: c */
    public final List<C19001b> mo50554c() {
        long currentTimeMillis = System.currentTimeMillis();
        String h = C19062u.m62368a().mo50623h();
        new StringBuilder("load splashAdData from local time : ").append(System.currentTimeMillis() - currentTimeMillis);
        return m62291a(h);
    }

    /* renamed from: d */
    public static List<C19001b> m62293d() {
        JSONArray jSONArray;
        try {
            String b = C19062u.m62368a().mo50611b();
            if (!C19132j.m62736a(b)) {
                jSONArray = new JSONArray(b);
            } else {
                jSONArray = new JSONArray();
            }
            return C19129h.m62703a(jSONArray, 0, true);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private C19008g m62294f() {
        long currentTimeMillis = System.currentTimeMillis();
        String k = C19062u.m62368a().mo50630k();
        String u = C19062u.m62368a().mo50640u();
        new StringBuilder("read sp data time cost: ").append(System.currentTimeMillis() - currentTimeMillis);
        C19008g gVar = new C19008g();
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            List<C19001b> b = m62292b(k);
            List<C19001b> b2 = m62292b(u);
            Map<String, C19001b> a = C19129h.m62705a(b);
            gVar.f51336b = b2;
            gVar.f51337c = a;
            gVar.f51335a = b;
            if (!C19126e.m62680a(b2)) {
                gVar.f51339e = C19008g.m62068a(b2);
            } else {
                gVar.f51339e = C19008g.m62068a(b);
            }
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis2);
            return gVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50553b() {
        if (!C19025f.m62187r()) {
            C19025f.m62188s();
            C190521 r0 = new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:16:0x00cd A[Catch:{ Exception -> 0x00e1 }] */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x00d0 A[Catch:{ Exception -> 0x00e1 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r24 = this;
                        long r0 = java.lang.System.currentTimeMillis()
                        r2 = r24
                        com.ss.android.ad.splash.core.p r3 = com.p280ss.android.p817ad.splash.core.C19051p.this     // Catch:{ Exception -> 0x00e1 }
                        java.util.List r3 = r3.mo50554c()     // Catch:{ Exception -> 0x00e1 }
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
                        java.lang.String r5 = "wait for load local:"
                        r4.<init>(r5)     // Catch:{ Exception -> 0x00e1 }
                        long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e1 }
                        r7 = 0
                        long r5 = r5 - r0
                        r4.append(r5)     // Catch:{ Exception -> 0x00e1 }
                        boolean r4 = com.p280ss.android.p817ad.splash.core.C19025f.m62172i()     // Catch:{ Exception -> 0x00e1 }
                        if (r4 == 0) goto L_0x0023
                        return
                    L_0x0023:
                        com.ss.android.ad.splash.core.j r4 = com.p280ss.android.p817ad.splash.core.C19044j.m62231a()     // Catch:{ Exception -> 0x00e1 }
                        boolean r5 = com.p280ss.android.p817ad.splash.core.C19025f.m62135ad()     // Catch:{ Exception -> 0x00e1 }
                        if (r5 == 0) goto L_0x0033
                        java.util.List r5 = com.p280ss.android.p817ad.splash.core.C19051p.m62293d()     // Catch:{ Exception -> 0x00e1 }
                        r4.f51461b = r5     // Catch:{ Exception -> 0x00e1 }
                    L_0x0033:
                        com.ss.android.ad.splash.core.u r5 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()     // Catch:{ Exception -> 0x00e1 }
                        long r5 = r5.mo50631l()     // Catch:{ Exception -> 0x00e1 }
                        com.ss.android.ad.splash.core.u r7 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()     // Catch:{ Exception -> 0x00e1 }
                        long r7 = r7.mo50632m()     // Catch:{ Exception -> 0x00e1 }
                        com.ss.android.ad.splash.core.u r9 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()     // Catch:{ Exception -> 0x00e1 }
                        java.lang.String r9 = r9.mo50641v()     // Catch:{ Exception -> 0x00e1 }
                        com.ss.android.ad.splash.core.u r10 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()     // Catch:{ Exception -> 0x00e1 }
                        java.lang.String r10 = r10.mo50642w()     // Catch:{ Exception -> 0x00e1 }
                        com.ss.android.ad.splash.core.u r11 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()     // Catch:{ Exception -> 0x00e1 }
                        boolean r11 = r11.mo50635p()     // Catch:{ Exception -> 0x00e1 }
                        java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
                        java.lang.String r13 = "wait for load sp:"
                        r12.<init>(r13)     // Catch:{ Exception -> 0x00e1 }
                        long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e1 }
                        r15 = 0
                        long r13 = r13 - r0
                        r12.append(r13)     // Catch:{ Exception -> 0x00e1 }
                        boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x00e1 }
                        r13 = 0
                        if (r12 != 0) goto L_0x00a2
                        org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ Exception -> 0x00e1 }
                        r12.<init>(r9)     // Catch:{ Exception -> 0x00e1 }
                        int r9 = r12.length()     // Catch:{ Exception -> 0x00e1 }
                        r14 = 2
                        if (r9 != r14) goto L_0x00a2
                        long r14 = r12.getLong(r13)     // Catch:{ Exception -> 0x00e1 }
                        r16 = 1000(0x3e8, double:4.94E-321)
                        long r14 = r14 * r16
                        r9 = 1
                        long r18 = r12.getLong(r9)     // Catch:{ Exception -> 0x00e1 }
                        r20 = r14
                        long r13 = r18 * r16
                        com.ss.android.ad.splash.core.j r9 = com.p280ss.android.p817ad.splash.core.C19044j.m62231a()     // Catch:{ Exception -> 0x00e1 }
                        r22 = r0
                        r0 = r20
                        r9.mo50539a(r0)     // Catch:{ Exception -> 0x00e1 }
                        com.ss.android.ad.splash.core.j r0 = com.p280ss.android.p817ad.splash.core.C19044j.m62231a()     // Catch:{ Exception -> 0x00e1 }
                        r0.mo50540b(r13)     // Catch:{ Exception -> 0x00e1 }
                        goto L_0x00a4
                    L_0x00a2:
                        r22 = r0
                    L_0x00a4:
                        r4.f51460a = r3     // Catch:{ Exception -> 0x00e1 }
                        r4.f51464e = r5     // Catch:{ Exception -> 0x00e1 }
                        r4.f51463d = r7     // Catch:{ Exception -> 0x00e1 }
                        r4.f51469j = r10     // Catch:{ Exception -> 0x00e1 }
                        r4.f51467h = r11     // Catch:{ Exception -> 0x00e1 }
                        com.p280ss.android.p817ad.splash.core.C19025f.m62173j()     // Catch:{ Exception -> 0x00e1 }
                        long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e1 }
                        r3 = 0
                        long r0 = r0 - r22
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
                        java.lang.String r4 = "load local and init time:"
                        r3.<init>(r4)     // Catch:{ Exception -> 0x00e1 }
                        r3.append(r0)     // Catch:{ Exception -> 0x00e1 }
                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e1 }
                        r3.<init>()     // Catch:{ Exception -> 0x00e1 }
                        boolean r4 = com.p280ss.android.p817ad.splash.core.C19025f.m62138ag()     // Catch:{ Exception -> 0x00e1 }
                        if (r4 == 0) goto L_0x00d0
                        java.lang.String r4 = "dur_use_file"
                        goto L_0x00d2
                    L_0x00d0:
                        java.lang.String r4 = "dur_use_sp"
                    L_0x00d2:
                        r3.put(r4, r0)     // Catch:{ Exception -> 0x00e1 }
                        com.ss.android.ad.splash.b.a r0 = com.p280ss.android.p817ad.splash.p824b.C18949a.m61865a()     // Catch:{ Exception -> 0x00e1 }
                        java.lang.String r1 = "service_load_local_data"
                        r4 = 0
                        r5 = 0
                        r0.mo50363a(r1, r5, r3, r4)     // Catch:{ Exception -> 0x00e1 }
                        return
                    L_0x00e1:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.splash.core.C19051p.C190521.run():void");
                }
            };
            if (C19025f.m62137af()) {
                C19025f.m62089C().execute(r0);
            } else {
                r0.run();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo50555e() {
        if (!C19025f.m62187r()) {
            long currentTimeMillis = System.currentTimeMillis();
            C19025f.m62188s();
            try {
                C19008g f = m62294f();
                if (!C19025f.m62172i()) {
                    C19044j a = C19044j.m62231a();
                    a.f51462c = f;
                    long l = C19062u.m62368a().mo50631l();
                    long m = C19062u.m62368a().mo50632m();
                    String v = C19062u.m62368a().mo50641v();
                    String w = C19062u.m62368a().mo50642w();
                    boolean p = C19062u.m62368a().mo50635p();
                    if (!TextUtils.isEmpty(v)) {
                        JSONArray jSONArray = new JSONArray(v);
                        if (jSONArray.length() == 2) {
                            long j = jSONArray.getLong(1) * 1000;
                            C19044j.m62231a().mo50539a(jSONArray.getLong(0) * 1000);
                            C19044j.m62231a().mo50540b(j);
                        }
                    }
                    a.f51464e = l;
                    a.f51463d = m;
                    a.f51462c = f;
                    a.f51469j = w;
                    a.f51467h = p;
                    C19025f.m62173j();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration_load_local_data_time", currentTimeMillis2 - currentTimeMillis);
                    C18949a.m61865a().mo50363a("service_ad_load_local_sync_data", 0, jSONObject, null);
                }
            } catch (Exception e) {
                C18949a.m61865a().mo50361a(e, "key_exception_local_data");
            }
        }
    }

    /* renamed from: a */
    private static List<C19001b> m62291a(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!C19132j.m62736a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            new StringBuilder("generate json array time : ").append(System.currentTimeMillis() - currentTimeMillis);
            List<C19001b> a = C19129h.m62703a(jSONArray, 0, true);
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis);
            return a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static List<C19001b> m62292b(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!C19132j.m62736a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            List<C19001b> a = C19129h.m62701a(jSONArray);
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis);
            return a;
        } catch (Exception unused) {
            return null;
        }
    }
}
