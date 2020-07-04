package com.p280ss.android.p817ad.splash.core.p827b;

import android.text.TextUtils;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.p836g.C19127f;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.b.b */
public class C18985b {

    /* renamed from: a */
    private static volatile C18985b f51203a;

    /* renamed from: b */
    private List<C18983a> f51204b = new ArrayList();

    private C18985b() {
    }

    /* renamed from: c */
    public final void mo50446c() {
        if (this.f51204b != null) {
            this.f51204b.clear();
        }
    }

    /* renamed from: a */
    public static C18985b m61973a() {
        if (f51203a == null) {
            synchronized (C18985b.class) {
                if (f51203a == null) {
                    f51203a = new C18985b();
                }
            }
        }
        return f51203a;
    }

    /* renamed from: b */
    public final void mo50445b() {
        if (this.f51204b == null) {
            this.f51204b = new ArrayList();
        }
        this.f51204b.clear();
    }

    /* renamed from: d */
    public static void m61981d() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("start_time", Long.valueOf(System.currentTimeMillis()));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", "");
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        C19025f.m62115a(84378473382L, "splash_ad", "request", jSONObject);
    }

    /* renamed from: a */
    public final void mo50443a(C18983a aVar) {
        if (aVar != null && this.f51204b != null) {
            this.f51204b.add(aVar);
        }
    }

    /* renamed from: a */
    public static void m61974a(C19001b bVar) {
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(bVar.mo50376p())) {
                    jSONObject.put("log_extra", bVar.mo50376p());
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C19025f.m62115a(bVar.mo50375n(), "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: b */
    public static void m61977b(C18983a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f51196b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f51196b);
                }
                if (!TextUtils.isEmpty(aVar.f51198d)) {
                    jSONObject.put("log_extra", aVar.f51198d);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C19025f.m62115a(aVar.f51195a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: c */
    public static void m61980c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("status", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", "");
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        C19025f.m62115a(84378473382L, "splash_ad", "response", jSONObject);
    }

    /* renamed from: b */
    public static void m61978b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("is_empty_data", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", "");
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        C19025f.m62115a(84378473382L, "splash_ad", "parse_finished", jSONObject);
    }

    /* renamed from: c */
    public static void m61979c(C18983a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f51196b > 0 && aVar.f51197c > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f51196b);
                    jSONObject2.put("ad_error_code", aVar.f51197c);
                }
                if (!TextUtils.isEmpty(aVar.f51198d)) {
                    jSONObject.put("log_extra", aVar.f51198d);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C19025f.m62115a(aVar.f51195a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: d */
    public static void m61982d(C18983a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (aVar.f51196b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f51196b);
                }
                if (aVar.f51197c > 0) {
                    jSONObject2.put("ad_error_code", aVar.f51197c);
                }
                if (!TextUtils.isEmpty(aVar.f51198d)) {
                    jSONObject.put("log_extra", aVar.f51198d);
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C19025f.m62115a(aVar.f51195a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo50444a(boolean z) {
        if (this.f51204b != null) {
            try {
                if (this.f51204b.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    for (C18983a aVar : this.f51204b) {
                        if (aVar != null && aVar.f51197c > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.f51195a);
                            jSONObject.put(sb.toString(), aVar.f51197c);
                        }
                    }
                    jSONObject3.put("ad_show_fail_list", jSONObject);
                    jSONObject3.put("ad_show_fail_type", 3);
                    jSONObject2.put("log_extra", "{}");
                    jSONObject2.putOpt("is_ad_event", "1");
                    jSONObject2.put("ad_extra_data", jSONObject3);
                    C19025f.m62115a(84378473382L, "splash_ad", "open_splash", jSONObject2);
                }
                mo50446c();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m61975a(C19001b bVar, C19001b bVar2) {
        if (bVar != null && bVar2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar2.mo50376p())) {
                    jSONObject.put("log_extra", bVar2.mo50376p());
                }
                if (!TextUtils.isEmpty(bVar.mo50380x())) {
                    jSONObject2.put("topview_ad_id", bVar.mo50380x());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
                jSONObject.put("ad_fetch_time", bVar2.mo50374f());
            } catch (Exception unused) {
            }
            C19025f.m62115a(bVar2.mo50375n(), "splash_ad", "topview_other_show", jSONObject);
        }
    }

    /* renamed from: a */
    public static void m61976a(C19001b bVar, String str) {
        if (bVar != null && !C19132j.m62736a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo50376p())) {
                    jSONObject.put("log_extra", bVar.mo50376p());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo50374f());
            } catch (Exception unused) {
                C19127f.m62684a("error in putting log_extra into json");
            }
            C19025f.m62115a(bVar.mo50375n(), "splash_ad", str, jSONObject);
        }
    }
}
