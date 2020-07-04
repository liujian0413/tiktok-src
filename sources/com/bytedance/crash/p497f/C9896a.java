package com.bytedance.crash.p497f;

import android.text.TextUtils;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.nativecrash.C10008c;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p501j.p502a.C9921b;
import com.bytedance.crash.p504l.C9985j;
import com.bytedance.crash.p504l.C9999s;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.f.a */
public class C9896a {

    /* renamed from: a */
    public JSONObject f26984a;

    /* renamed from: b */
    protected C9898c f26985b;

    /* renamed from: c */
    public String f26986c;

    /* renamed from: a */
    public final boolean mo24493a() {
        Object opt = this.f26984a.opt("data");
        return opt instanceof JSONArray ? !C9985j.m29570a(((JSONArray) opt).optJSONObject(0), "logcat") : !C9985j.m29570a(this.f26984a, "logcat");
    }

    /* renamed from: a */
    public final C9896a mo24484a(C9898c cVar) {
        mo24492a("header", (Object) cVar.f26992a);
        this.f26985b = cVar;
        return this;
    }

    /* renamed from: a */
    public final C9896a mo24486a(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo24492a("session_id", (Object) str);
        }
        return this;
    }

    /* renamed from: a */
    public final C9896a mo24485a(C9921b bVar) {
        mo24492a("activity_trace", (Object) bVar.mo24535c());
        mo24489a("activity_track", bVar.mo24536d());
        return this;
    }

    /* renamed from: a */
    public final C9896a mo24491a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null) {
            try {
                this.f26984a.put("plugin_info", jSONArray);
                return this;
            } catch (Exception unused) {
            }
        } else {
            for (String str : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", str);
                jSONObject.put("version_code", map.get(str));
                jSONArray.put(jSONObject);
            }
            this.f26984a.put("plugin_info", jSONArray);
            return this;
        }
    }

    /* renamed from: a */
    public final C9896a mo24490a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            mo24492a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String put : list) {
            jSONArray.put(put);
        }
        mo24492a("patch_info", (Object) jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C9896a mo24488a(String str, List<String> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (String put : list) {
                jSONArray.put(put);
            }
        } catch (Throwable unused) {
        }
        mo24489a(str, jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C9896a mo24489a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = this.f26984a.optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo24492a("custom_long", (Object) optJSONObject);
        }
        try {
            optJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final C9896a mo24487a(String str, String str2) {
        Object opt = this.f26984a.opt("data");
        if (opt instanceof JSONArray) {
            m29211a(((JSONArray) opt).optJSONObject(0), "filters", str, str2);
        } else {
            m29211a(this.f26984a, "filters", str, str2);
        }
        return this;
    }

    /* renamed from: f */
    public final boolean mo24505f() {
        return m29215a(this.f26984a);
    }

    public C9896a() {
        this.f26984a = new JSONObject();
    }

    /* renamed from: b */
    public final void mo24497b() {
        mo24487a("has_logcat", String.valueOf(mo24493a()));
    }

    /* renamed from: e */
    public final boolean mo24504e() {
        return m29219b(this.f26984a);
    }

    /* renamed from: d */
    public final void mo24502d() {
        mo24487a("has_meminfo_file", String.valueOf(m29215a(this.f26984a)));
        mo24487a("memory_leak", String.valueOf(mo24504e()));
    }

    /* renamed from: g */
    public final C9898c mo24506g() {
        if (this.f26985b == null) {
            this.f26985b = new C9898c(C9918j.m29342g());
            mo24484a(this.f26985b);
        }
        return this.f26985b;
    }

    /* renamed from: c */
    public final void mo24500c() {
        mo24487a("is_64_devices", String.valueOf(C9898c.m29252a()));
        mo24487a("is_64_runtime", String.valueOf(NativeImpl.m29695e()));
        mo24487a("is_x86_devices", String.valueOf(C9898c.m29254b()));
    }

    public C9896a(JSONObject jSONObject) {
        this.f26984a = jSONObject;
    }

    /* renamed from: c */
    public final C9896a mo24499c(JSONObject jSONObject) {
        mo24492a("header", (Object) jSONObject);
        return this;
    }

    /* renamed from: d */
    public final C9896a mo24501d(JSONObject jSONObject) {
        m29214a(this.f26984a, jSONObject);
        return this;
    }

    /* renamed from: e */
    public final void mo24503e(JSONObject jSONObject) {
        m29218b(this.f26984a, jSONObject);
    }

    /* renamed from: f */
    private static JSONObject m29220f(JSONObject jSONObject) {
        Object opt = jSONObject.opt("data");
        if (opt instanceof JSONArray) {
            return ((JSONArray) opt).optJSONObject(0).optJSONObject("custom_long");
        }
        return jSONObject.optJSONObject("custom_long");
    }

    /* renamed from: b */
    public final C9896a mo24495b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        mo24492a("logcat", (Object) jSONArray);
        return this;
    }

    /* renamed from: c */
    public final C9896a mo24498c(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject b = m29217b("filters");
            for (Entry entry : map.entrySet()) {
                try {
                    b.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            mo24492a("filters", (Object) b);
        }
        return this;
    }

    /* renamed from: b */
    private JSONObject m29217b(String str) {
        JSONObject jSONObject;
        Object opt = this.f26984a.opt("data");
        if (opt instanceof JSONArray) {
            jSONObject = ((JSONArray) opt).optJSONObject(0);
        } else {
            jSONObject = this.f26984a;
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo24492a(str, (Object) optJSONObject);
        }
        return optJSONObject;
    }

    /* renamed from: b */
    public static boolean m29219b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object opt = jSONObject.opt("data");
        if (opt instanceof JSONArray) {
            jSONObject2 = ((JSONArray) opt).optJSONObject(0).optJSONObject("custom_long");
        } else {
            jSONObject2 = jSONObject.optJSONObject("custom_long");
        }
        if (jSONObject2 != null && ((long) m29216b(jSONObject2.optJSONArray("memory_info"), "VmSize:", "\\s+").intValue()) > C10008c.m29713l()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m29215a(JSONObject jSONObject) {
        JSONObject f = m29220f(jSONObject);
        if (f == null || C9985j.m29570a(f, "memory_info")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C9896a mo24483a(long j) {
        try {
            mo24492a("app_start_time", (Object) Long.valueOf(j));
            mo24492a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: b */
    public final C9896a mo24496b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException unused) {
                }
            }
            try {
                this.f26984a.put("sdk_info", jSONObject);
            } catch (JSONException unused2) {
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void mo24492a(String str, Object obj) {
        try {
            this.f26984a.put(str, obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C9896a mo24482a(int i, String str) {
        try {
            this.f26984a.put("miniapp_id", i);
            this.f26984a.put("miniapp_version", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public static void m29212a(JSONObject jSONObject, Throwable th) {
        String str = "npth_err_info";
        if (jSONObject.opt(str) == null) {
            try {
                jSONObject.put(str, C9999s.m29644a(th));
            } catch (Throwable unused) {
            }
            return;
        }
        int i = 0;
        while (i < 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i);
            if (jSONObject.opt(sb.toString()) == null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(i);
                    jSONObject.put(sb2.toString(), C9999s.m29644a(th));
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    public static void m29213a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m29218b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    Object opt = jSONObject.opt(str);
                    if (jSONObject.opt(str) instanceof JSONObject) {
                        m29218b(jSONObject.getJSONObject(str), jSONObject2.getJSONObject(str));
                    } else if (opt instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(str);
                        JSONArray jSONArray2 = (JSONArray) opt;
                        if (jSONArray2.length() != 1 || !(jSONArray2.opt(0) instanceof JSONObject) || !(jSONArray.opt(0) instanceof JSONObject)) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                jSONArray2.put(jSONArray.get(i));
                            }
                        } else {
                            m29218b(jSONArray2.getJSONObject(0), jSONArray.getJSONObject(0));
                        }
                    } else {
                        jSONObject.put(str, jSONObject2.get(str));
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29214a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        try {
            jSONObject3.put("storage", jSONObject4);
        } catch (Throwable unused) {
        }
        long optLong = jSONObject4.optLong("inner_free");
        long optLong2 = jSONObject4.optLong("sdcard_free");
        long optLong3 = jSONObject4.optLong("inner_free_real");
        if (optLong <= 1024) {
            str = "0 - 1K";
        } else if (optLong <= 65536) {
            str = "1K - 64K";
        } else if (optLong <= 524288) {
            str = "64K - 512K";
        } else if (optLong <= 1048576) {
            str = "512K - 1M";
        } else if (optLong <= 67108864) {
            str = "1M - 64M";
        } else {
            str = "64M - ";
        }
        if (optLong3 <= 1024) {
            str2 = "0 - 1K";
        } else if (optLong3 <= 65536) {
            str2 = "1K - 64K";
        } else if (optLong3 <= 524288) {
            str2 = "64K - 512K";
        } else if (optLong3 <= 1048576) {
            str2 = "512K - 1M";
        } else if (optLong3 <= 67108864) {
            str2 = "1M - 64M";
        } else {
            str2 = "64M - ";
        }
        if (optLong2 <= 1024) {
            str3 = "0 - 1K";
        } else if (optLong2 <= 65536) {
            str3 = "1K - 64K";
        } else if (optLong2 <= 524288) {
            str3 = "64K - 512K";
        } else if (optLong2 <= 1048576) {
            str3 = "512K - 1M";
        } else if (optLong2 <= 67108864) {
            str3 = "1M - 64M";
        } else {
            str3 = "64M - ";
        }
        m29211a(jSONObject3, "filters", "inner_free", str);
        m29211a(jSONObject3, "filters", "inner_free_real", str2);
        m29211a(jSONObject3, "filters", "sdcard_free", str3);
    }

    /* renamed from: b */
    public final C9896a mo24494b(String str, String str2) {
        Object opt = this.f26984a.opt("data");
        if (opt instanceof JSONArray) {
            m29211a(((JSONArray) opt).optJSONObject(0), "custom", str, str2);
        } else {
            m29211a(this.f26984a, "custom", str, str2);
        }
        return this;
    }

    /* renamed from: a */
    private static String m29210a(JSONArray jSONArray, String str, String str2) {
        if (jSONArray == null) {
            return null;
        }
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i, null);
            if (optString != null && optString.startsWith(str)) {
                str3 = optString.split(str2)[1].trim();
            }
        }
        return str3;
    }

    /* renamed from: b */
    private static Integer m29216b(JSONArray jSONArray, String str, String str2) {
        try {
            String a = m29210a(jSONArray, str, str2);
            if (a == null) {
                return Integer.valueOf(-1);
            }
            return Integer.valueOf(Integer.parseInt(a));
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            return Integer.valueOf(-1);
        }
    }

    /* renamed from: a */
    public static void m29211a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, str3);
        }
    }
}
