package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class aij {

    /* renamed from: a */
    public final boolean f40311a;

    /* renamed from: b */
    public final int f40312b;

    /* renamed from: c */
    public final int f40313c;

    /* renamed from: d */
    public final int f40314d;

    /* renamed from: e */
    public final String f40315e;

    /* renamed from: f */
    public final int f40316f;

    /* renamed from: g */
    public final int f40317g;

    /* renamed from: h */
    public final int f40318h;

    /* renamed from: i */
    public final int f40319i;

    /* renamed from: j */
    public final boolean f40320j;

    public aij(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f40311a = m45987a(jSONObject, "aggressive_media_codec_release", C15585bw.f43731E);
        this.f40312b = m45989b(jSONObject, "byte_buffer_precache_limit", C15585bw.f44025o);
        this.f40313c = m45989b(jSONObject, "exo_cache_buffer_size", C15585bw.f44029s);
        this.f40314d = m45989b(jSONObject, "exo_connect_timeout_millis", C15585bw.f44021k);
        this.f40315e = m45990c(jSONObject, "exo_player_version", C15585bw.f44020j);
        this.f40316f = m45989b(jSONObject, "exo_read_timeout_millis", C15585bw.f44022l);
        this.f40317g = m45989b(jSONObject, "load_check_interval_bytes", C15585bw.f44023m);
        this.f40318h = m45989b(jSONObject, "player_precache_limit", C15585bw.f44024n);
        this.f40319i = m45989b(jSONObject, "socket_receive_buffer_size", C15585bw.f44026p);
        this.f40320j = m45987a(jSONObject, "use_cache_data_source", C15585bw.f43898cm);
    }

    /* renamed from: a */
    private static boolean m45987a(JSONObject jSONObject, String str, C15573bl<Boolean> blVar) {
        return m45988a(jSONObject, str, ((Boolean) bym.m50299d().mo41272a(blVar)).booleanValue());
    }

    /* renamed from: a */
    private static boolean m45988a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    private static int m45989b(JSONObject jSONObject, String str, C15573bl<Integer> blVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) bym.m50299d().mo41272a(blVar)).intValue();
    }

    /* renamed from: c */
    private static String m45990c(JSONObject jSONObject, String str, C15573bl<String> blVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) bym.m50299d().mo41272a(blVar);
    }
}
