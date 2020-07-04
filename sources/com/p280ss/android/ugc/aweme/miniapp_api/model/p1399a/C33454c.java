package com.p280ss.android.ugc.aweme.miniapp_api.model.p1399a;

import com.p1843tt.miniapphost.AppBrandLogger;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a.c */
public class C33454c {

    /* renamed from: c */
    public String f87320c;

    /* renamed from: d */
    public Map<String, String> f87321d = new HashMap();

    /* renamed from: e */
    public Map<String, Object> f87322e = new HashMap();

    /* renamed from: f */
    public Map<String, C33455a> f87323f = new HashMap();

    /* renamed from: g */
    public long f87324g = 10000;

    /* renamed from: h */
    public long f87325h = 10000;

    /* renamed from: i */
    public long f87326i = 10000;

    /* renamed from: j */
    public boolean f87327j = false;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a.c$a */
    public static class C33455a {

        /* renamed from: a */
        public File f87328a;

        /* renamed from: b */
        public String f87329b;

        public C33455a(File file, String str) {
            this.f87328a = file;
            this.f87329b = str;
        }
    }

    /* renamed from: a */
    public final String mo85761a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Entry entry : this.f87322e.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(5, "MicroAppRequest", e.getStackTrace());
        }
        return jSONObject.toString();
    }
}
