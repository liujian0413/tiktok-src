package com.p280ss.sys.p1806ck.p1807a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.sys.ck.a.f */
public final class C45980f {
    /* renamed from: a */
    public static Long m144167a(Context context, String str) {
        return m144169b(context, str, Long.valueOf(0));
    }

    /* renamed from: a */
    public static void m144168a(Context context, String str, Long l) {
        C7285c.m22838a(context, "sdk_config", 0).edit().putLong(str, l.longValue()).apply();
    }

    /* renamed from: b */
    private static Long m144169b(Context context, String str, Long l) {
        return Long.valueOf(C7285c.m22838a(context, "sdk_config", 0).getLong(str, 0));
    }
}
