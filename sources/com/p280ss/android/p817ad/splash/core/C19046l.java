package com.p280ss.android.p817ad.splash.core;

import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.p817ad.splash.p836g.C19124c;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.l */
class C19046l {

    /* renamed from: a */
    private static volatile C19046l f51470a;

    private C19046l() {
    }

    /* renamed from: a */
    public static C19046l m62236a() {
        if (f51470a == null) {
            synchronized (C19046l.class) {
                if (f51470a == null) {
                    f51470a = new C19046l();
                }
            }
        }
        return f51470a;
    }

    /* renamed from: c */
    public final void mo50542c() {
        m62239f();
        m62238e();
        C19062u.m62368a().mo50619f().mo50628j();
    }

    /* renamed from: d */
    public static void m62237d() {
        try {
            String E = C19025f.m62091E();
            if (!C19132j.m62736a(E)) {
                long a = C19124c.m62673a(new File(E)) / 1024;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key_splash_cache_size", a);
                C18949a.m61865a().mo50364a("service_ad_res_disk_cache_size_in_mb", jSONObject, (JSONObject) null);
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50541b() {
        if (C19025f.m62131a()) {
            if (Math.abs(System.currentTimeMillis() - C19062u.m62368a().mo50621g()) >= Math.min(C19025f.m62092F(), 3600000)) {
                C19025f.m62089C().execute(new Runnable() {
                    public final void run() {
                        C19046l.this.mo50542c();
                    }
                });
            }
        }
    }

    /* renamed from: e */
    private static void m62238e() {
        try {
            JSONArray jSONArray = new JSONArray(C19062u.m62368a().mo50626i());
            JSONArray jSONArray2 = new JSONArray();
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("local_url");
                    long optLong = optJSONObject.optLong("local_data_expire_time");
                    if (!C19132j.m62736a(optString)) {
                        File file = new File(optString);
                        if (file.exists()) {
                            if (currentTimeMillis <= optLong) {
                                jSONArray2.put(optJSONObject);
                            } else {
                                file.delete();
                                StringBuilder sb = new StringBuilder("文件 ");
                                sb.append(optString);
                                sb.append("已过期，被系统删除");
                            }
                        }
                    }
                }
            }
            C19062u.m62368a().mo50625i(jSONArray2.toString()).mo50628j();
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private static void m62239f() {
        try {
            String E = C19025f.m62091E();
            if (!C19132j.m62736a(E)) {
                File file = new File(E);
                if (file.exists()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length > 0) {
                            for (File file2 : listFiles) {
                                if (C19124c.m62678a(file2, C19025f.m62092F())) {
                                    if (file2 != null && file2.exists()) {
                                        file2.delete();
                                    }
                                    StringBuilder sb = new StringBuilder("文件 ");
                                    sb.append(E);
                                    sb.append("已过期，被系统删除");
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
