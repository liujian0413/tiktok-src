package com.p280ss.caijing.globaliap.pay;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.base.p1786b.C45779b;

/* renamed from: com.ss.caijing.globaliap.pay.d */
public final class C45873d {

    /* renamed from: a */
    private static int f117291a = 600000;

    /* renamed from: b */
    public static String m143957b(Context context) {
        if (context == null) {
            return "";
        }
        return C45779b.m143733a(context, "pay_controll", "cj_appid");
    }

    /* renamed from: a */
    public static int m143954a(Context context) {
        if (context == null) {
            return f117291a;
        }
        int i = C7285c.m22838a(context, "pay_controll", 0).getInt("retry_sleep_time", -1);
        if (i == -1) {
            i = f117291a;
        }
        return i;
    }

    /* renamed from: a */
    public static void m143956a(Context context, String str) {
        C45779b.m143734a(context, "pay_controll", "cj_appid", str);
    }

    /* renamed from: a */
    public static void m143955a(Context context, int i) {
        Editor edit = C7285c.m22838a(context, "pay_controll", 0).edit();
        edit.putInt("retry_sleep_time", i);
        edit.apply();
    }
}
