package com.p280ss.android.p817ad.p818a;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.C1642a;
import com.facebook.ads.AdError;
import com.p280ss.android.p817ad.p818a.p819a.C18912a;
import com.p280ss.android.p817ad.p818a.p819a.p820a.C18913a;
import com.p280ss.android.p817ad.p818a.p821b.C18923a;
import com.p280ss.android.p817ad.p818a.p821b.C18924b.C18926a;
import com.p280ss.android.p817ad.p818a.p821b.C18927c;
import com.p280ss.android.p817ad.p818a.p821b.C18928d;
import com.p280ss.android.p817ad.p818a.p822c.C18930a;
import com.p280ss.android.p817ad.p818a.p822c.C18930a.C18933a;
import com.p280ss.android.p817ad.p818a.p822c.C18934b;
import com.p280ss.android.p817ad.p818a.p822c.C18937e;
import com.p280ss.android.p817ad.p818a.p822c.C18940g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.a.d */
public class C18941d {

    /* renamed from: i */
    private static volatile C18941d f51046i;

    /* renamed from: a */
    public C18923a f51047a = new C18923a();

    /* renamed from: b */
    public C18927c f51048b = new C18927c();

    /* renamed from: c */
    public String f51049c;

    /* renamed from: d */
    private C18909a f51050d;

    /* renamed from: e */
    private C18920b f51051e;

    /* renamed from: f */
    private C18928d f51052f;

    /* renamed from: g */
    private String f51053g;

    /* renamed from: h */
    private Context f51054h;

    private C18941d() {
    }

    /* renamed from: a */
    public static C18941d m61811a() {
        if (f51046i == null) {
            synchronized (C18941d.class) {
                if (f51046i == null) {
                    f51046i = new C18941d();
                }
            }
        }
        return f51046i;
    }

    /* renamed from: b */
    public final void mo50330b() {
        int i;
        if (this.f51051e.f50993c == 0 || TextUtils.isEmpty(this.f51051e.f50992b) || TextUtils.isEmpty(C18929c.m61785c())) {
            if (m61814a(this.f51053g)) {
                this.f51052f.mo50321b(new C18926a().mo50317a(this.f51053g).mo50316a(1).mo50318a());
            } else {
                this.f51052f.mo50321b(new C18926a().mo50317a(this.f51053g).mo50316a(4).mo50318a());
            }
            this.f51049c = null;
            return;
        }
        String a = C1642a.m8034a("%s/%s?k=%s", new Object[]{C18929c.m61785c(), "tfe/route/clue/meta/smart-phone/get-virtual-number", this.f51051e.f50992b});
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Cache-Control", "no-cache");
        hashMap.put("Postman-Token", "ca8e2443-9898-31db-e18f-131e9517cbd1");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("instance_id", Long.valueOf(this.f51051e.f50993c));
            jSONObject2.putOpt("device_id", this.f51050d.mo50277c());
            jSONObject2.putOpt("uid", this.f51050d.mo50278d());
            if (!TextUtils.isEmpty(this.f51050d.mo50279e())) {
                jSONObject2.putOpt("user_id", Long.valueOf(Long.parseLong(this.f51050d.mo50279e())));
            }
            jSONObject2.putOpt("app_version", this.f51050d.mo50276b());
            jSONObject2.putOpt("version_code", this.f51050d.mo50280f());
            jSONObject2.putOpt("app_id", this.f51050d.mo50275a());
            jSONObject2.putOpt("ad_id", this.f51051e.mo50298a());
            jSONObject2.putOpt("short_id", this.f51050d.mo50281g());
            jSONObject2.putOpt("site_id", this.f51051e.mo50303f());
            jSONObject2.putOpt("cid", this.f51051e.mo50299b());
            jSONObject2.putOpt("page_url", this.f51051e.mo50301d());
            jSONObject2.putOpt("page_type", Integer.valueOf(this.f51051e.f50991a));
            jSONObject2.putOpt("os", "android");
            jSONObject2.putOpt("log_extra", this.f51051e.mo50300c());
            if (TextUtils.isEmpty(this.f51051e.f50994d)) {
                jSONObject2.putOpt("caller", "creative");
            } else {
                jSONObject2.putOpt("caller", this.f51051e.f50994d);
            }
            jSONObject.putOpt("convert_data", jSONObject2.toString());
            String jSONObject3 = jSONObject.toString();
            hashMap.put("Agw-Auth", C18934b.m61795a(jSONObject3));
            final long currentTimeMillis = System.currentTimeMillis();
            if (C18929c.m61786d() != null) {
                new Object() {
                };
                return;
            }
            if (C18929c.m61788f() != 0) {
                i = C18929c.m61788f();
            } else {
                i = AdError.SERVER_ERROR_CODE;
            }
            C18930a.m61793a(a, hashMap, jSONObject3, i, new C18933a() {
                /* renamed from: a */
                public final void mo50324a(C18913a aVar) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("request_time", Long.valueOf(currentTimeMillis));
                    } catch (JSONException unused) {
                    }
                    C18929c.m61787e().mo50297a("service_smartphone_network", 0, jSONObject, null);
                    C18941d.this.mo50329a(aVar);
                }
            });
        } catch (Exception unused) {
            this.f51049c = null;
        }
    }

    /* renamed from: a */
    public static void m61812a(Context context) {
        C18929c.m61777a(context);
    }

    /* renamed from: a */
    private boolean m61813a(C18920b bVar) {
        String l = Long.toString(bVar.f50993c);
        String g = bVar.mo50304g();
        String a = bVar.mo50298a();
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(g);
        sb.append(a);
        String sb2 = sb.toString();
        if (TextUtils.equals(sb2, this.f51049c)) {
            return true;
        }
        this.f51049c = sb2;
        return false;
    }

    /* renamed from: a */
    private boolean m61814a(String str) {
        if (TextUtils.isEmpty(str) || this.f51054h == null) {
            return false;
        }
        C18940g.m61809a(this.f51054h, str);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c9 A[Catch:{ Exception -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00eb A[Catch:{ Exception -> 0x010d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50329a(com.p280ss.android.p817ad.p818a.p819a.p820a.C18913a r7) {
        /*
            r6 = this;
            r0 = 0
            r6.f51049c = r0
            r1 = 3
            r2 = 4
            r3 = 1
            if (r7 == 0) goto L_0x006d
            int r4 = r7.f50990b     // Catch:{ Exception -> 0x010d }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x006d
            java.lang.String r7 = r7.f50989a     // Catch:{ Exception -> 0x010d }
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x010d }
            if (r4 != 0) goto L_0x00c1
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x010d }
            r4.<init>(r7)     // Catch:{ Exception -> 0x010d }
            java.lang.String r7 = "status_code"
            int r7 = r4.optInt(r7)     // Catch:{ Exception -> 0x010d }
            java.lang.String r5 = "virtual_number"
            java.lang.String r4 = r4.optString(r5)     // Catch:{ Exception -> 0x010d }
            if (r7 != 0) goto L_0x00c1
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x010d }
            if (r7 != 0) goto L_0x00c1
            boolean r7 = r6.m61814a(r4)     // Catch:{ Exception -> 0x010d }
            if (r7 == 0) goto L_0x00c1
            com.ss.android.ad.a.b.b$a r7 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x010d }
            r7.<init>()     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50319b(r4)     // Catch:{ Exception -> 0x010d }
            r1 = 0
            com.ss.android.ad.a.b.b$a r7 = r7.mo50316a(r1)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b r7 = r7.mo50318a()     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.d r2 = r6.f51052f     // Catch:{ Exception -> 0x010d }
            r2.mo50320a(r7)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b r7 = r6.f51051e     // Catch:{ Exception -> 0x010d }
            java.lang.String r7 = r7.mo50299b()     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b r2 = r6.f51051e     // Catch:{ Exception -> 0x010d }
            java.lang.String r2 = r2.mo50304g()     // Catch:{ Exception -> 0x010d }
            java.lang.String r3 = "get_number"
            com.ss.android.ad.a.b r4 = r6.f51051e     // Catch:{ Exception -> 0x010d }
            java.lang.String r4 = r4.mo50300c()     // Catch:{ Exception -> 0x010d }
            com.p280ss.android.p817ad.p818a.C18929c.m61783a(r7, r2, r3, r4)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.a.g r7 = com.p280ss.android.p817ad.p818a.C18929c.m61787e()     // Catch:{ Exception -> 0x010d }
            java.lang.String r2 = "service_smartphone_type"
            r7.mo50297a(r2, r1, r0, r0)     // Catch:{ Exception -> 0x010d }
            return
        L_0x006d:
            if (r7 == 0) goto L_0x00c1
            int r7 = r7.f50990b     // Catch:{ Exception -> 0x010d }
            r4 = -1
            if (r7 != r4) goto L_0x00c1
            java.lang.String r7 = r6.f51053g     // Catch:{ Exception -> 0x010d }
            boolean r7 = r6.m61814a(r7)     // Catch:{ Exception -> 0x010d }
            if (r7 == 0) goto L_0x009f
            com.ss.android.ad.a.b.b$a r7 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x010d }
            r7.<init>()     // Catch:{ Exception -> 0x010d }
            java.lang.String r1 = r6.f51053g     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50317a(r1)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50316a(r3)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b r7 = r7.mo50318a()     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.d r1 = r6.f51052f     // Catch:{ Exception -> 0x010d }
            r1.mo50321b(r7)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.a.g r7 = com.p280ss.android.p817ad.p818a.C18929c.m61787e()     // Catch:{ Exception -> 0x010d }
            java.lang.String r1 = "service_smartphone_type"
            r2 = 2
            r7.mo50297a(r1, r2, r0, r0)     // Catch:{ Exception -> 0x010d }
            return
        L_0x009f:
            com.ss.android.ad.a.b.b$a r7 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x010d }
            r7.<init>()     // Catch:{ Exception -> 0x010d }
            java.lang.String r3 = r6.f51053g     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50317a(r3)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50316a(r2)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b r7 = r7.mo50318a()     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.d r2 = r6.f51052f     // Catch:{ Exception -> 0x010d }
            r2.mo50321b(r7)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.a.g r7 = com.p280ss.android.p817ad.p818a.C18929c.m61787e()     // Catch:{ Exception -> 0x010d }
            java.lang.String r2 = "service_smartphone_type"
            r7.mo50297a(r2, r1, r0, r0)     // Catch:{ Exception -> 0x010d }
            return
        L_0x00c1:
            java.lang.String r7 = r6.f51053g     // Catch:{ Exception -> 0x010d }
            boolean r7 = r6.m61814a(r7)     // Catch:{ Exception -> 0x010d }
            if (r7 == 0) goto L_0x00eb
            com.ss.android.ad.a.b.b$a r7 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x010d }
            r7.<init>()     // Catch:{ Exception -> 0x010d }
            java.lang.String r1 = r6.f51053g     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50317a(r1)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50316a(r3)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b r7 = r7.mo50318a()     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.d r1 = r6.f51052f     // Catch:{ Exception -> 0x010d }
            r1.mo50321b(r7)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.a.g r7 = com.p280ss.android.p817ad.p818a.C18929c.m61787e()     // Catch:{ Exception -> 0x010d }
            java.lang.String r1 = "service_smartphone_type"
            r7.mo50297a(r1, r3, r0, r0)     // Catch:{ Exception -> 0x010d }
            goto L_0x010d
        L_0x00eb:
            com.ss.android.ad.a.b.b$a r7 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x010d }
            r7.<init>()     // Catch:{ Exception -> 0x010d }
            java.lang.String r3 = r6.f51053g     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50317a(r3)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b$a r7 = r7.mo50316a(r2)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.b r7 = r7.mo50318a()     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.b.d r2 = r6.f51052f     // Catch:{ Exception -> 0x010d }
            r2.mo50321b(r7)     // Catch:{ Exception -> 0x010d }
            com.ss.android.ad.a.a.g r7 = com.p280ss.android.p817ad.p818a.C18929c.m61787e()     // Catch:{ Exception -> 0x010d }
            java.lang.String r2 = "service_smartphone_type"
            r7.mo50297a(r2, r1, r0, r0)     // Catch:{ Exception -> 0x010d }
            return
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.p818a.C18941d.mo50329a(com.ss.android.ad.a.a.a.a):void");
    }

    /* renamed from: a */
    public final void mo50328a(Activity activity, final C18920b bVar, final C18928d dVar) {
        if (activity == null || bVar == null) {
            dVar.mo50321b(new C18926a().mo50316a(4).mo50318a());
            this.f51049c = null;
        } else if (!m61813a(bVar)) {
            if (this.f51054h == null) {
                this.f51054h = C18929c.m61791i();
            }
            TelephonyManager telephonyManager = (TelephonyManager) this.f51054h.getSystemService("phone");
            if (telephonyManager != null && 1 == telephonyManager.getSimState()) {
                dVar.mo50321b(new C18926a().mo50316a(3).mo50318a());
                if (C18929c.m61790h() != 0) {
                    C18937e.m61801a(this.f51054h, C18929c.m61790h());
                } else {
                    C18937e.m61801a(this.f51054h, R.string.dv9);
                }
                this.f51049c = null;
            } else if (C18940g.m61810a()) {
                if (C18929c.m61789g() != 0) {
                    C18937e.m61801a(this.f51054h, C18929c.m61789g());
                } else {
                    C18937e.m61801a(this.f51054h, R.string.dv8);
                }
                this.f51049c = null;
                dVar.mo50321b(new C18926a().mo50316a(2).mo50318a());
            } else {
                this.f51051e = bVar;
                this.f51052f = dVar;
                this.f51053g = bVar.mo50302e();
                this.f51050d = C18929c.m61784b().mo50290a();
                if (VERSION.SDK_INT < 23) {
                    mo50330b();
                } else if (activity instanceof Activity) {
                    C18929c.m61775a().mo50296a(C18940g.m61808a(activity), new String[]{"android.permission.READ_PHONE_STATE"}, new C18912a() {
                        /* renamed from: a */
                        public final void mo50289a() {
                            C18941d.this.mo50330b();
                        }
                    });
                }
                C18929c.m61783a(bVar.mo50299b(), bVar.mo50304g(), "click_phone", bVar.mo50300c());
            }
        }
    }
}
