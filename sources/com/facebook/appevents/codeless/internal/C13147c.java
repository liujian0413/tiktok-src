package com.facebook.appevents.codeless.internal;

/* renamed from: com.facebook.appevents.codeless.internal.c */
public class C13147c {

    /* renamed from: a */
    private static final String f34838a = C13147c.class.getCanonicalName();

    /* renamed from: b */
    private static Class<?> f34839b;

    /* renamed from: a */
    public static void m38425a() {
        m38427a("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: a */
    public static void m38426a(String str) {
        m38427a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: a */
    private static void m38427a(String str, String str2, String str3) {
        try {
            if (f34839b == null) {
                f34839b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f34839b.getMethod("UnitySendMessage", new Class[]{String.class, String.class, String.class}).invoke(f34839b, new Object[]{str, str2, str3});
        } catch (Exception unused) {
        }
    }
}
