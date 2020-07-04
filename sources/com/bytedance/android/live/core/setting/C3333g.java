package com.bytedance.android.live.core.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.Toast;
import com.C1642a;
import com.bytedance.android.live.base.p123sp.TTLiveSettingUtil;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.setting.g */
public final class C3333g {

    /* renamed from: a */
    private static final SharedPreferences f10083a;

    /* renamed from: b */
    private static Map<String, JSONObject> f10084b = new HashMap();

    /* renamed from: c */
    private static Map<String, Map<String, Object>> f10085c = new HashMap();

    /* renamed from: a */
    static final /* synthetic */ void m12437a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            try {
                m12438a("key_ttlive_sdk_setting", new JSONObject(f10083a.getString("key_ttlive_sdk_setting", "")));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m12438a(String str, JSONObject jSONObject) {
        f10084b.put(str, jSONObject);
        f10085c.clear();
        if (f10085c.get(str) != null) {
            ((Map) f10085c.get(str)).clear();
        }
        C7285c.m22838a(m12442b(), "ttlive_sdk_shared_pref_cache", 0).edit().putString(str, jSONObject.toString()).apply();
    }

    /* renamed from: a */
    private static boolean m12441a(String str, String str2, boolean z) {
        if (m12439a() && f10083a.contains(str2)) {
            return f10083a.getBoolean(str2, z);
        }
        JSONObject jSONObject = (JSONObject) f10084b.get(str);
        if (jSONObject == null) {
            return z;
        }
        return jSONObject.optBoolean(str2);
    }

    /* renamed from: a */
    private static String m12436a(String str, String str2, String str3) {
        if (!m12439a() || !f10083a.contains(str2)) {
            return f10084b.get(str) == null ? str3 : ((JSONObject) f10084b.get(str)).optString(str2, str3);
        }
        return f10083a.getString(str2, str3);
    }

    /* renamed from: a */
    public static boolean m12440a(C3338l lVar, String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (lVar.f10096e == Boolean.class) {
                        f10083a.edit().putBoolean(lVar.f10092a, Boolean.valueOf(Boolean.parseBoolean(str)).booleanValue()).apply();
                    } else if (lVar.f10096e == Integer.class) {
                        f10083a.edit().putInt(lVar.f10092a, Integer.parseInt(str)).apply();
                    } else if (lVar.f10096e == Long.class) {
                        f10083a.edit().putLong(lVar.f10092a, Long.parseLong(str)).apply();
                    } else if (lVar.f10096e == Float.class) {
                        f10083a.edit().putFloat(lVar.f10092a, Float.parseFloat(str)).apply();
                    } else if (lVar.f10096e == Double.class) {
                        f10083a.edit().putString(lVar.f10092a, String.valueOf((double) Long.parseLong(str))).apply();
                    } else if (lVar.f10096e == String.class) {
                        f10083a.edit().putString(lVar.f10092a, str).apply();
                    } else {
                        f10083a.edit().putString(lVar.f10092a, str).apply();
                        f10085c.remove(lVar.f10092a);
                    }
                    return true;
                }
            } catch (NumberFormatException unused) {
                C3335i.m12444a(Toast.makeText(m12442b(), C1642a.m8035a(Locale.US, "Illegal value of %s : %s", new Object[]{lVar.f10092a, String.valueOf(str)}), 0));
                return false;
            }
        }
        f10083a.edit().remove(lVar.f10092a).apply();
        f10085c.remove(lVar.f10092a);
        return true;
    }

    /* renamed from: a */
    private static boolean m12439a() {
        return C3339m.m12449a();
    }

    /* renamed from: b */
    private static Context m12442b() {
        if (C3596c.m13172a(IHostContext.class) == null) {
            return null;
        }
        return ((IHostContext) C3596c.m13172a(IHostContext.class)).context();
    }

    static {
        SharedPreferences sharedPreferences;
        if (m12442b() == null) {
            sharedPreferences = null;
        } else {
            sharedPreferences = C7285c.m22838a(m12442b(), "ttlive_sdk_shared_pref_cache", 0);
        }
        f10083a = sharedPreferences;
        try {
            f10084b.put("key_ttlive_sdk_setting", new JSONObject(f10083a.getString("key_ttlive_sdk_setting", "")));
        } catch (Exception unused) {
            f10084b.put("key_ttlive_sdk_setting", new JSONObject());
        }
        try {
            f10084b.put("TT_APP_SETTING", new JSONObject(f10083a.getString("TT_APP_SETTING", "")));
        } catch (Exception unused2) {
            f10084b.put("TT_APP_SETTING", new JSONObject());
        }
        try {
            f10084b.put("TT_USER_SETTING", new JSONObject(f10083a.getString("TT_USER_SETTING", "")));
        } catch (Exception unused3) {
            f10084b.put("TT_USER_SETTING", new JSONObject());
        }
        TTLiveSettingUtil.update.mo19325f(C3334h.f10086a);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        f10085c.clear();
        f10085c.put("key_ttlive_sdk_setting", hashMap);
        f10085c.put("TT_APP_SETTING", hashMap2);
        f10085c.put("TT_USER_SETTING", hashMap3);
    }

    /* renamed from: a */
    public static String m12434a(C3338l lVar) {
        if (f10083a.contains(lVar.f10092a)) {
            return f10083a.getAll().get(lVar.f10092a).toString();
        }
        return null;
    }

    /* renamed from: a */
    public static String m12435a(String str, C3338l lVar) {
        if (f10084b.containsKey(str) && !((JSONObject) f10084b.get(str)).isNull(lVar.f10092a)) {
            try {
                return String.valueOf(((JSONObject) f10084b.get(str)).get(lVar.f10092a));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static double m12429a(String str, String str2, double d) {
        if (m12439a() && f10083a.contains(str2)) {
            try {
                return Double.parseDouble(f10083a.getString(str2, String.valueOf(d)));
            } catch (Exception unused) {
                return d;
            }
        } else if (f10084b.get(str) == null) {
            return d;
        } else {
            return ((JSONObject) f10084b.get(str)).optDouble(str2, d);
        }
    }

    /* renamed from: a */
    private static float m12430a(String str, String str2, float f) {
        if (m12439a() && f10083a.contains(str2)) {
            return f10083a.getFloat(str2, f);
        }
        if (f10084b.get(str) == null) {
            return f;
        }
        return (float) ((JSONObject) f10084b.get(str)).optDouble(str2, (double) f);
    }

    /* renamed from: a */
    private static int m12431a(String str, String str2, int i) {
        if (m12439a() && f10083a.contains(str2)) {
            return f10083a.getInt(str2, i);
        }
        if (f10084b.get(str) == null) {
            return i;
        }
        return ((JSONObject) f10084b.get(str)).optInt(str2, i);
    }

    /* renamed from: a */
    private static long m12432a(String str, String str2, long j) {
        if (m12439a() && f10083a.contains(str2)) {
            return f10083a.getLong(str2, j);
        }
        if (f10084b.get(str) == null) {
            return j;
        }
        return ((JSONObject) f10084b.get(str)).optLong(str2, j);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070 A[Catch:{ Exception -> 0x007c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m12443b(java.lang.String r2, java.lang.String r3, java.lang.reflect.Type r4, T r5) {
        /*
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f10085c     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x0012
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f10085c     // Catch:{ Exception -> 0x007c }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x007c }
            r1.<init>()     // Catch:{ Exception -> 0x007c }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x007c }
        L_0x0012:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f10085c     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x007c }
            boolean r0 = r0.containsKey(r3)     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x002d
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f10085c     // Catch:{ Exception -> 0x002d }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x002d }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x002d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x002d }
            return r0
        L_0x002d:
            java.util.Map<java.lang.String, org.json.JSONObject> r0 = f10084b     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = ""
            goto L_0x0046
        L_0x0038:
            java.util.Map<java.lang.String, org.json.JSONObject> r0 = f10084b     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = ""
            java.lang.String r0 = r0.optString(r3, r1)     // Catch:{ Exception -> 0x007c }
        L_0x0046:
            boolean r1 = m12439a()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x005a
            android.content.SharedPreferences r1 = f10083a     // Catch:{ Exception -> 0x007c }
            boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x005a
            android.content.SharedPreferences r1 = f10083a     // Catch:{ Exception -> 0x007c }
            java.lang.String r0 = r1.getString(r3, r0)     // Catch:{ Exception -> 0x007c }
        L_0x005a:
            com.google.gson.e r1 = com.bytedance.android.live.core.setting.C3339m.m12453c()     // Catch:{ Exception -> 0x007c }
            java.lang.Object r4 = r1.mo15975a(r0, r4)     // Catch:{ Exception -> 0x007c }
            if (r4 != 0) goto L_0x0070
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r4 = f10085c     // Catch:{ Exception -> 0x007c }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ Exception -> 0x007c }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ Exception -> 0x007c }
            r4.remove(r3)     // Catch:{ Exception -> 0x007c }
            return r5
        L_0x0070:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f10085c     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x007c }
            r0.put(r3, r4)     // Catch:{ Exception -> 0x007c }
            return r4
        L_0x007c:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r4 = f10085c
            java.lang.Object r4 = r4.get(r2)
            if (r4 == 0) goto L_0x0090
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r4 = f10085c
            java.lang.Object r2 = r4.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r2.remove(r3)
        L_0x0090:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.setting.C3333g.m12443b(java.lang.String, java.lang.String, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public static <T> T m12433a(String str, String str2, Type type, T t) {
        if (type == Boolean.class) {
            return Boolean.valueOf(m12441a(str, str2, ((Boolean) t).booleanValue()));
        }
        if (type == Integer.class || type == Short.class) {
            return Integer.valueOf(m12431a(str, str2, ((Integer) t).intValue()));
        }
        if (type == Float.class) {
            return Float.valueOf(m12430a(str, str2, ((Float) t).floatValue()));
        }
        if (type == Long.class) {
            return Long.valueOf(m12432a(str, str2, ((Long) t).longValue()));
        }
        if (type == Double.class) {
            return Double.valueOf(m12429a(str, str2, ((Double) t).doubleValue()));
        }
        if (type == String.class) {
            return m12436a(str, str2, (String) t);
        }
        return m12443b(str, str2, type, t);
    }
}
