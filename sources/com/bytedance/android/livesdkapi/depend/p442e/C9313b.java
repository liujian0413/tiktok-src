package com.bytedance.android.livesdkapi.depend.p442e;

import android.content.SharedPreferences;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.depend.e.b */
public final class C9313b {

    /* renamed from: a */
    private static Map<String, Map<String, Object>> f25507a = new HashMap();

    /* renamed from: b */
    private static C6600e f25508b = C2317a.m9932a();

    /* renamed from: a */
    private static boolean m27687a(String str, String str2, boolean z) {
        return m27682a(str).getBoolean(str2, z);
    }

    /* renamed from: a */
    public static <T> void m27686a(C9312a<T> aVar, T t) {
        String str = aVar.f25504b;
        if (t == null) {
            m27682a(str).edit().remove(aVar.f25503a).apply();
        } else if (aVar.f25506d == Boolean.class) {
            m27693b(str, aVar.f25503a, ((Boolean) t).booleanValue());
        } else if (aVar.f25506d == Integer.class) {
            m27690b(str, aVar.f25503a, ((Integer) t).intValue());
        } else if (aVar.f25506d == Float.class) {
            m27689b(str, aVar.f25503a, ((Float) t).floatValue());
        } else if (aVar.f25506d == Long.class) {
            m27691b(str, aVar.f25503a, ((Long) t).longValue());
        } else if (aVar.f25506d == Double.class) {
            m27688b(str, aVar.f25503a, ((Double) t).doubleValue());
        } else if (aVar.f25506d == String.class) {
            m27692b(str, aVar.f25503a, (String) t);
        } else {
            Map map = (Map) f25507a.get(str);
            if (map != null) {
                map.put(aVar.f25503a, t);
            }
            m27682a(str).edit().putString(aVar.f25503a, f25508b.mo15979b((Object) t)).apply();
        }
    }

    /* renamed from: a */
    private static SharedPreferences m27682a(String str) {
        return C7285c.m22838a(((IHostContext) C3596c.m13172a(IHostContext.class)).context(), str, 0);
    }

    /* renamed from: a */
    public static <T> T m27683a(C9312a<T> aVar) {
        if (aVar.f25506d == Boolean.class) {
            return Boolean.valueOf(m27687a(aVar.f25504b, aVar.f25503a, ((Boolean) aVar.f25505c).booleanValue()));
        }
        if (aVar.f25506d == Integer.class || aVar.f25506d == Short.class) {
            return Integer.valueOf(m27680a(aVar.f25504b, aVar.f25503a, ((Integer) aVar.f25505c).intValue()));
        }
        if (aVar.f25506d == Float.class) {
            return Float.valueOf(m27679a(aVar.f25504b, aVar.f25503a, ((Float) aVar.f25505c).floatValue()));
        }
        if (aVar.f25506d == Long.class) {
            return Long.valueOf(m27681a(aVar.f25504b, aVar.f25503a, ((Long) aVar.f25505c).longValue()));
        }
        if (aVar.f25506d == Double.class) {
            return Double.valueOf(m27678a(aVar.f25504b, aVar.f25503a, ((Double) aVar.f25505c).doubleValue()));
        }
        if (aVar.f25506d == String.class) {
            return m27685a(aVar.f25504b, aVar.f25503a, (String) aVar.f25505c);
        }
        return m27684a(aVar.f25504b, aVar.f25503a, aVar.f25506d, aVar.f25505c);
    }

    /* renamed from: a */
    private static float m27679a(String str, String str2, float f) {
        return m27682a(str).getFloat(str2, f);
    }

    /* renamed from: b */
    private static void m27689b(String str, String str2, float f) {
        m27682a(str).edit().putFloat(str2, f).apply();
    }

    /* renamed from: a */
    private static double m27678a(String str, String str2, double d) {
        try {
            return Double.parseDouble(m27682a(str).getString(str2, String.valueOf(d)));
        } catch (Exception unused) {
            return d;
        }
    }

    /* renamed from: b */
    private static void m27688b(String str, String str2, double d) {
        m27682a(str).edit().putString(str2, String.valueOf(d)).apply();
    }

    /* renamed from: a */
    private static int m27680a(String str, String str2, int i) {
        return m27682a(str).getInt(str2, i);
    }

    /* renamed from: b */
    private static void m27690b(String str, String str2, int i) {
        m27682a(str).edit().putInt(str2, i).apply();
    }

    /* renamed from: a */
    private static long m27681a(String str, String str2, long j) {
        return m27682a(str).getLong(str2, j);
    }

    /* renamed from: b */
    private static void m27691b(String str, String str2, long j) {
        m27682a(str).edit().putLong(str2, j).apply();
    }

    /* renamed from: b */
    private static void m27692b(String str, String str2, String str3) {
        m27682a(str).edit().putString(str2, str3).apply();
    }

    /* renamed from: b */
    private static void m27693b(String str, String str2, boolean z) {
        m27682a(str).edit().putBoolean(str2, z).apply();
    }

    /* renamed from: a */
    private static String m27685a(String str, String str2, String str3) {
        return m27682a(str).getString(str2, str3);
    }

    /* renamed from: a */
    private static <T> T m27684a(String str, String str2, Class<T> cls, T t) {
        Map map = (Map) f25507a.get(str);
        if (map == null) {
            map = new HashMap();
            f25507a.put(str, map);
        }
        try {
            if (map.containsKey(str2)) {
                return map.get(str2);
            }
            T a = f25508b.mo15974a(m27682a(str).getString(str2, ""), cls);
            if (a == null) {
                map.remove(str2);
                return t;
            }
            map.put(str2, a);
            return a;
        } catch (Exception unused) {
            map.remove(str2);
            return t;
        }
    }
}
