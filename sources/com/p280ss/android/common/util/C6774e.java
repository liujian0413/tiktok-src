package com.p280ss.android.common.util;

import android.content.Context;
import com.p280ss.android.common.util.MultiProcessSharedProvider.C19285a;
import com.p280ss.android.common.util.MultiProcessSharedProvider.C19286b;

/* renamed from: com.ss.android.common.util.e */
public final class C6774e {
    /* renamed from: a */
    public static String m20938a(Context context, int i) {
        String str;
        String str2;
        try {
            C19286b b = MultiProcessSharedProvider.m63193b(context);
            if (b == null) {
                return "";
            }
            str = b.mo51183a("dns", "");
            if (str instanceof String) {
                str2 = String.valueOf(str);
            } else {
                str2 = "";
            }
            return str2;
        } catch (Exception unused) {
            str = "";
        }
    }

    /* renamed from: a */
    public static void m20939a(Context context, int i, String str) {
        try {
            C19286b b = MultiProcessSharedProvider.m63193b(context);
            if (b != null) {
                C19285a a = b.mo51182a();
                a.mo51178a("dns", str);
                a.mo51180a();
            }
        } catch (Exception unused) {
        }
    }
}
