package com.p280ss.android.ugc.aweme.p1168df.base.p1169a;

import com.bytedance.morpheus.C12249c;
import com.bytedance.morpheus.core.C12250a;
import com.google.android.play.core.splitinstall.C6563f;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.df.base.a.b */
public final class C26223b {
    /* renamed from: a */
    private static int m86214a(int i) {
        if (i == 8) {
            return 2;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
                return 3;
            case 5:
                return 1;
            default:
                return 4;
        }
    }

    /* renamed from: a */
    public static void m86215a(String str) {
        String str2;
        try {
            C12250a b = C12249c.m35635b(str);
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", str);
                jSONObject.put("status", b.f32568c);
                if (b.f32568c == 2) {
                    jSONObject.put("bytes_downloaded", b.f32570e);
                    jSONObject.put("bytes_to_download", b.f32569d);
                }
                if (b.f32568c == 4) {
                    jSONObject.put("download_speed_per_second", (double) (((((float) b.f32569d) / ((float) b.f32571f)) / 1024.0f) * 1000.0f));
                }
                if (b.f32568c == 6 || b.f32568c == 0) {
                    jSONObject.put("error_code", b.f32572g);
                    String str3 = "error_msg";
                    if (b.f32574i != null) {
                        str2 = b.f32574i.getMessage();
                    } else {
                        str2 = "";
                    }
                    jSONObject.put(str3, str2);
                    jSONObject.put("internal_size", C26222a.m86212b());
                    jSONObject.put("external_size", C26222a.m86213c());
                    jSONObject.put("is_external_storage", C26222a.m86209a());
                }
                C6907h.m21528b("df_state_change", jSONObject);
                C6893q.m21444a("df_state_change", b.f32568c, jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m86219b(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            jSONObject.put("status", i);
            C6907h.m21528b("df_install", jSONObject);
            C6893q.m21444a("df_install", m86214a(i), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static void m86220c(String str, int i) {
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            jSONObject.put("result_code", i);
            C6907h.m21528b("df_click_permission_dialog", jSONObject);
            String str2 = "df_click_permission_dialog";
            if (i == 0) {
                i2 = 5;
            } else {
                i2 = 6;
            }
            C6893q.m21444a(str2, i2, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m86216a(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            jSONObject.put("status", i);
            C6907h.m21528b("df_deferred_install", jSONObject);
            C6893q.m21444a("df_deferred_install", m86214a(i), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m86217a(String str, Locale locale, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            jSONObject.put("language", locale.getLanguage());
            jSONObject.put("status", i);
            C6907h.m21528b("df_install", jSONObject);
            C6893q.m21444a("df_install", m86214a(i), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m86218a(String str, Locale locale, C6563f fVar) {
        if (fVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", str);
                jSONObject.put("language", locale.getLanguage());
                jSONObject.put("status", fVar.f18875b);
                if (fVar.f18875b == 2) {
                    jSONObject.put("bytes_downloaded", fVar.f18877d);
                    jSONObject.put("bytes_to_download", fVar.f18878e);
                }
                if (fVar.f18875b == 6 || fVar.f18875b == 0) {
                    jSONObject.put("error_code", fVar.f18876c);
                    jSONObject.put("internal_size", C26222a.m86212b());
                    jSONObject.put("external_size", C26222a.m86213c());
                    jSONObject.put("is_external_storage", C26222a.m86209a());
                }
                C6907h.m21528b("df_state_change", jSONObject);
                C6893q.m21444a("df_state_change", fVar.f18875b, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
