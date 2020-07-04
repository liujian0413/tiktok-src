package com.p280ss.android.ttplatformsdk.p910a;

import android.content.Context;

/* renamed from: com.ss.android.ttplatformsdk.a.b */
public class C20425b {

    /* renamed from: a */
    private static volatile C20424a f55155a;

    private C20425b() {
    }

    /* renamed from: a */
    public static String m67767a(Context context) {
        return m67774b(context, "platform_user_name", "");
    }

    /* renamed from: b */
    public static String m67773b(Context context) {
        return m67774b(context, "platform_user_avatar", "");
    }

    /* renamed from: c */
    public static boolean m67776c(Context context) {
        return m67772a(context, "platform_is_login", Boolean.valueOf(false));
    }

    /* renamed from: d */
    private static void m67777d(Context context) {
        if (f55155a == null) {
            synchronized (C20425b.class) {
                if (f55155a == null) {
                    f55155a = C20424a.m67762a(context.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m67768a(Context context, String str) {
        m67769a(context, "platform_user_name", str);
    }

    /* renamed from: b */
    public static void m67775b(Context context, String str) {
        m67769a(context, "platform_user_avatar", str);
    }

    /* renamed from: a */
    public static void m67771a(Context context, boolean z) {
        m67770a(context, "platform_is_login", z);
    }

    /* renamed from: a */
    private static void m67769a(Context context, String str, String str2) {
        m67777d(context);
        f55155a.mo54968a(str, str2);
    }

    /* renamed from: b */
    private static String m67774b(Context context, String str, String str2) {
        m67777d(context);
        return f55155a.mo54971b(str, str2);
    }

    /* renamed from: a */
    private static void m67770a(Context context, String str, boolean z) {
        m67777d(context);
        f55155a.mo54969a(str, z);
    }

    /* renamed from: a */
    private static boolean m67772a(Context context, String str, Boolean bool) {
        m67777d(context);
        return f55155a.mo54970a(str, bool);
    }
}
