package com.p280ss.base.p1786b;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.base.b.b */
public final class C45779b {
    /* renamed from: a */
    public static String m143733a(Context context, String str, String str2) {
        return C7285c.m22838a(context, str, 0).getString(str2, "");
    }

    /* renamed from: b */
    public static void m143735b(Context context, String str, String str2) {
        Editor edit = C7285c.m22838a(context, str, 0).edit();
        edit.remove(str2);
        edit.apply();
    }

    /* renamed from: c */
    public static boolean m143736c(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(m143733a(context, str, str2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m143734a(Context context, String str, String str2, String str3) {
        Editor edit = C7285c.m22838a(context, str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
