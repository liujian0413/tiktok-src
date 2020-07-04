package com.bytedance.android.livesdk.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdkapi.depend.p442e.C9312a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.sharedpref.d */
public final class C8948d {

    /* renamed from: a */
    protected static C6600e f24497a = C2317a.m9932a();

    /* renamed from: b */
    private static SharedPreferences f24498b;

    /* renamed from: c */
    private static Map<String, Object> f24499c = new HashMap();

    /* renamed from: a */
    private static boolean m26776a(String str, boolean z) {
        return m26771a().getBoolean(str, z);
    }

    /* renamed from: a */
    public static <T> void m26775a(C9312a aVar, T t) {
        if (t == null) {
            f24499c.remove(aVar.f25503a);
            m26771a().edit().remove(aVar.f25503a).apply();
            return;
        }
        f24499c.put(aVar.f25503a, t);
        if (aVar.f25506d == Boolean.class) {
            m26771a().edit().putBoolean(aVar.f25503a, ((Boolean) t).booleanValue()).apply();
        } else if (aVar.f25506d == Integer.class) {
            m26771a().edit().putInt(aVar.f25503a, ((Integer) t).intValue()).apply();
        } else if (aVar.f25506d == Float.class) {
            m26771a().edit().putFloat(aVar.f25503a, ((Float) t).floatValue()).apply();
        } else if (aVar.f25506d == Long.class) {
            m26771a().edit().putLong(aVar.f25503a, ((Long) t).longValue()).apply();
        } else if (aVar.f25506d == Double.class) {
            m26771a().edit().putString(aVar.f25503a, t.toString()).apply();
        } else if (aVar.f25506d == String.class) {
            m26771a().edit().putString(aVar.f25503a, (String) t).apply();
        } else {
            m26771a().edit().putString(aVar.f25503a, f24497a.mo15979b((Object) t)).apply();
        }
    }

    /* renamed from: b */
    private static Context m26777b() {
        return C3358ac.m12528e();
    }

    /* renamed from: a */
    private static SharedPreferences m26771a() {
        if (f24498b == null) {
            f24498b = C7285c.m22838a(m26777b(), "live_sdk_core", 0);
        }
        return f24498b;
    }

    /* renamed from: a */
    public static <T> T m26772a(C9312a<T> aVar) {
        if (f24499c.containsKey(aVar.f25503a)) {
            return f24499c.get(aVar.f25503a);
        }
        if (aVar.f25506d == Boolean.class) {
            T valueOf = Boolean.valueOf(m26776a(aVar.f25503a, ((Boolean) aVar.f25505c).booleanValue()));
            f24499c.put(aVar.f25503a, valueOf);
            return valueOf;
        } else if (aVar.f25506d == Integer.class || aVar.f25506d == Short.class) {
            T valueOf2 = Integer.valueOf(m26769a(aVar.f25503a, ((Integer) aVar.f25505c).intValue()));
            f24499c.put(aVar.f25503a, valueOf2);
            return valueOf2;
        } else if (aVar.f25506d == Float.class) {
            T valueOf3 = Float.valueOf(m26768a(aVar.f25503a, ((Float) aVar.f25505c).floatValue()));
            f24499c.put(aVar.f25503a, valueOf3);
            return valueOf3;
        } else if (aVar.f25506d == Long.class) {
            T valueOf4 = Long.valueOf(m26770a(aVar.f25503a, ((Long) aVar.f25505c).longValue()));
            f24499c.put(aVar.f25503a, valueOf4);
            return valueOf4;
        } else if (aVar.f25506d == Double.class) {
            T valueOf5 = Double.valueOf(m26767a(aVar.f25503a, ((Double) aVar.f25505c).doubleValue()));
            f24499c.put(aVar.f25503a, valueOf5);
            return valueOf5;
        } else if (aVar.f25506d != String.class) {
            return m26773a(aVar.f25503a, aVar.f25506d, aVar.f25505c);
        } else {
            T a = m26774a(aVar.f25503a, (String) aVar.f25505c);
            if (a == null) {
                f24499c.remove(aVar.f25503a);
            } else {
                f24499c.put(aVar.f25503a, a);
            }
            return a;
        }
    }

    /* renamed from: a */
    private static float m26768a(String str, float f) {
        return m26771a().getFloat(str, f);
    }

    /* renamed from: a */
    private static double m26767a(String str, double d) {
        try {
            return Double.parseDouble(m26771a().getString(str, String.valueOf(d)));
        } catch (Exception unused) {
            return d;
        }
    }

    /* renamed from: a */
    private static int m26769a(String str, int i) {
        return m26771a().getInt(str, i);
    }

    /* renamed from: a */
    private static long m26770a(String str, long j) {
        return m26771a().getLong(str, j);
    }

    /* renamed from: a */
    private static String m26774a(String str, String str2) {
        return m26771a().getString(str, str2);
    }

    /* renamed from: a */
    private static <T> T m26773a(String str, Class<T> cls, T t) {
        try {
            if (f24499c.containsKey(str)) {
                return f24499c.get(str);
            }
            T a = f24497a.mo15974a(m26771a().getString(str, ""), cls);
            if (a == null) {
                f24499c.remove(str);
            } else {
                f24499c.put(str, a);
            }
            return a;
        } catch (Exception unused) {
            f24499c.remove(str);
            return t;
        }
    }
}
