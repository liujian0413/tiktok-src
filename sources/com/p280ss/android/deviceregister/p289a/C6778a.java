package com.p280ss.android.deviceregister.p289a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.deviceregister.p290b.p291a.p292a.C6785c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.deviceregister.a.a */
public final class C6778a {

    /* renamed from: a */
    private static volatile String f19296a = "applog_stats";

    /* renamed from: b */
    private static String f19297b;

    /* renamed from: c */
    private static boolean f19298c;

    /* renamed from: a */
    public static String m20960a() {
        return f19296a;
    }

    /* renamed from: b */
    public static boolean m20963b() {
        return f19298c;
    }

    /* renamed from: c */
    public static String m20964c() {
        if (TextUtils.isEmpty(f19297b)) {
            f19297b = C6785c.m21011a("c25zc2RrX29wZW51ZGlk");
        }
        return f19297b;
    }

    /* renamed from: a */
    public static void m20962a(boolean z) {
        f19298c = z;
    }

    /* renamed from: a */
    public static SharedPreferences m20959a(Context context) {
        return C7285c.m22838a(context, m20960a(), 0);
    }

    /* renamed from: a */
    public static void m20961a(String str) {
        if (!C6319n.m19593a(str)) {
            f19296a = str;
        }
    }
}
