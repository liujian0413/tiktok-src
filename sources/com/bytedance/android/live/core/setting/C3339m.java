package com.bytedance.android.live.core.setting;

import com.bytedance.android.live.C2317a;
import com.google.gson.C6600e;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.core.setting.m */
public final class C3339m {

    /* renamed from: a */
    private static boolean f10098a;

    /* renamed from: b */
    private static boolean f10099b;

    /* renamed from: c */
    private static C6600e f10100c = C2317a.m9932a();

    /* renamed from: b */
    public static boolean m12452b() {
        return f10099b;
    }

    /* renamed from: c */
    public static C6600e m12453c() {
        return f10100c;
    }

    /* renamed from: a */
    public static boolean m12449a() {
        return f10098a;
    }

    /* renamed from: a */
    public static void m12448a(boolean z) {
        f10098a = true;
    }

    /* renamed from: d */
    public static String m12455d(C3338l lVar) {
        return lVar.f10093b;
    }

    /* renamed from: e */
    public static Type m12456e(C3338l lVar) {
        return lVar.f10096e;
    }

    /* renamed from: f */
    public static String[] m12457f(C3338l lVar) {
        return lVar.f10097f;
    }

    /* renamed from: g */
    public static <T> T m12458g(C3338l<T> lVar) {
        return lVar.f10094c;
    }

    /* renamed from: h */
    public static <T> T m12459h(C3338l<T> lVar) {
        return lVar.f10095d;
    }

    /* renamed from: b */
    public static String m12451b(C3338l lVar) {
        return C3333g.m12434a(lVar);
    }

    /* renamed from: c */
    public static String m12454c(C3338l lVar) {
        return lVar.f10092a;
    }

    /* renamed from: a */
    public static String m12447a(C3338l lVar) {
        return C3333g.m12435a("key_ttlive_sdk_setting", lVar);
    }

    /* renamed from: a */
    public static boolean m12450a(C3338l lVar, String str) {
        return C3333g.m12440a(lVar, str);
    }

    /* renamed from: a */
    public static <T> T m12446a(String str, String str2, Type type, T t) {
        return C3333g.m12433a(str, str2, type, t);
    }
}
