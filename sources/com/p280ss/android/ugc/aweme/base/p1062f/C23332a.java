package com.p280ss.android.ugc.aweme.base.p1062f;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.f.a */
public final class C23332a {

    /* renamed from: a */
    private static final HashMap<String, Boolean> f61406a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Integer> f61407b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<String, Long> f61408c = new HashMap<>();

    /* renamed from: d */
    private static final HashMap<String, String> f61409d = new HashMap<>();

    /* renamed from: a */
    private static String m76556a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m76558b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m76557a(String str, String str2, boolean z) {
        C7285c.m22838a(C6399b.m19921a(), str, 0).edit().putBoolean(str2, z).apply();
        f61406a.put(m76556a(str, str2), Boolean.valueOf(z));
    }

    /* renamed from: b */
    public static boolean m76559b(String str, String str2, boolean z) {
        if (m76558b(str, str2)) {
            return z;
        }
        String a = m76556a(str, str2);
        if (f61406a.containsKey(a)) {
            return ((Boolean) f61406a.get(a)).booleanValue();
        }
        return C7285c.m22838a(C6399b.m19921a(), str, 0).getBoolean(str2, z);
    }
}
