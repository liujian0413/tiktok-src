package com.p280ss.android.ugc.aweme.filter;

import com.C1642a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.filter.bh */
public final class C29248bh {

    /* renamed from: a */
    public static final int f77165a = m95941c();

    /* renamed from: b */
    public static final String[] f77166b = new String[3];

    /* renamed from: c */
    public static String f77167c;

    /* renamed from: d */
    public static String f77168d;

    /* renamed from: e */
    public static String f77169e;

    /* renamed from: f */
    public static String f77170f;

    /* renamed from: g */
    public static String f77171g;

    /* renamed from: a */
    public static String m95936a() {
        return f77171g;
    }

    /* renamed from: b */
    private static void m95940b() {
        int length = f77166b.length;
        for (int i = 0; i < length; i++) {
            f77166b[i] = m95942c(i);
        }
    }

    /* renamed from: c */
    private static int m95941c() {
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getShortVideoPluginService();
        return R.raw.filters;
    }

    /* renamed from: a */
    public static String m95937a(int i) {
        return C29341z.m96267d(i);
    }

    /* renamed from: b */
    public static String m95939b(int i) {
        return C29341z.m96264c(i);
    }

    /* renamed from: d */
    public static String m95943d(int i) {
        if (i != 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f77170f);
        sb.append("beautify_filter");
        return sb.toString();
    }

    /* renamed from: e */
    public static String m95944e(int i) {
        if (i != 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f77170f);
        sb.append("beautify_filter_korean");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m95942c(int i) {
        if (i != 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f77170f);
        sb.append(C1642a.m8034a("beauty_%s/", new Object[]{Integer.valueOf(12)}));
        return sb.toString();
    }

    /* renamed from: a */
    public static void m95938a(String str, String str2, String str3, String str4, String str5) {
        m95940b();
        f77167c = str;
        f77169e = str2;
        f77170f = str3;
        f77171g = str4;
        f77168d = str5;
    }
}
