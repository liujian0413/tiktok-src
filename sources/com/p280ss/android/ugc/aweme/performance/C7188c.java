package com.p280ss.android.ugc.aweme.performance;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Pair;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.performance.c */
public final class C7188c {

    /* renamed from: a */
    private static final List<String> f20114a = Arrays.asList(new String[]{"REDMI 6A", "VIVO 1812", "MRD-LX1F", "VIVO 1908", "MRD-LX1", "AMN-LX9", "TECNO ID3K", "TECNO KB2", "TECNO KB3", "KSA-LX9", "INFINIX X627V"});

    /* renamed from: b */
    private static boolean f20115b = false;

    /* renamed from: a */
    public static boolean m22428a() {
        return f20115b;
    }

    /* renamed from: a */
    public static void m22427a(C29349b bVar) {
        if (!m22428a()) {
            bVar.mo74432a();
        }
    }

    /* renamed from: a */
    public static Pair<Boolean, String> m22424a(Context context) {
        long a = C29345a.m96311a(context);
        if (a <= 1610612736) {
            return new Pair<>(Boolean.valueOf(true), "1.5G内存及以下");
        }
        int a2 = C29345a.m96307a();
        int b = C29345a.m96313b();
        if (a2 <= 4 && b <= 2048000) {
            return new Pair<>(Boolean.valueOf(true), "4核及以下 && 主频低于2GHZ");
        }
        if (a <= 2147483648L && VERSION.SDK_INT < 24) {
            return new Pair<>(Boolean.valueOf(true), "内存2G及以下 && Android7.0以下");
        }
        if (b > 0 && b <= 1620000) {
            return new Pair<>(Boolean.valueOf(true), "主频低于1.6GHZ");
        }
        String str = Build.MODEL;
        for (String equalsIgnoreCase : f20114a) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                Boolean valueOf = Boolean.valueOf(true);
                StringBuilder sb = new StringBuilder("过滤单独机型为低端机： ");
                sb.append(str);
                return new Pair<>(valueOf, sb.toString());
            }
        }
        return new Pair<>(Boolean.valueOf(false), "");
    }

    /* renamed from: a */
    public static void m22426a(Context context, boolean z) {
        if (context != null) {
            C7285c.m22838a(context, "performance_sp", 0).edit().putBoolean("is_performance_poor", z).apply();
            f20115b = z;
        }
    }

    /* renamed from: a */
    public static void m22425a(Context context, int i) {
        if (context != null) {
            SharedPreferences a = C7285c.m22838a(context, "performance_sp", 0);
            if (a.getInt("update_version", -1) == 1) {
                f20115b = a.getBoolean("is_performance_poor", false);
                return;
            }
            f20115b = ((Boolean) m22424a(context).first).booleanValue();
            a.edit().putInt("update_version", 1).putBoolean("is_performance_poor", f20115b).commit();
        }
    }
}
