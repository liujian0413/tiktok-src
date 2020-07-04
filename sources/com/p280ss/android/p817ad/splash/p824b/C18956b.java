package com.p280ss.android.p817ad.splash.p824b;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.b.b */
public class C18956b {

    /* renamed from: b */
    private static volatile C18956b f51120b;

    /* renamed from: a */
    public volatile boolean f51121a = true;

    /* renamed from: c */
    private volatile long f51122c;

    /* renamed from: d */
    private volatile long f51123d;

    /* renamed from: c */
    public final void mo50371c() {
        this.f51121a = false;
    }

    private C18956b() {
    }

    /* renamed from: b */
    public final void mo50370b() {
        this.f51122c = System.currentTimeMillis();
        this.f51121a = true;
    }

    /* renamed from: d */
    public final void mo50372d() {
        this.f51123d = System.currentTimeMillis();
        m61886f();
    }

    /* renamed from: a */
    public static C18956b m61883a() {
        if (f51120b == null) {
            synchronized (C18956b.class) {
                if (f51120b == null) {
                    f51120b = new C18956b();
                }
            }
        }
        return f51120b;
    }

    /* renamed from: e */
    public final void mo50373e() {
        long currentTimeMillis = System.currentTimeMillis() - this.f51123d;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_ad_show_total_time", currentTimeMillis);
            C18949a.m61865a().mo50364a("service_splash_ad_show_time", jSONObject, (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m61886f() {
        if (m61883a().f51121a) {
            try {
                long j = this.f51123d - this.f51122c;
                if (j > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("duration_init_to_show_ad", Long.valueOf(j));
                    C18949a.m61865a().mo50364a("service_init_to_show_ad", jSONObject, (JSONObject) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m61884a(int i) {
        C18949a.m61865a().mo50362a("service_splash_ad_show_result", i, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m61885a(Integer num, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_video_play_error_msg", str);
            C18949a.m61865a().mo50362a("service_video_play_error", num.intValue(), jSONObject);
        } catch (Exception unused) {
        }
    }
}
