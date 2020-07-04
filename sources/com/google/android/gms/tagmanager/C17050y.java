package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.y */
public class C17050y {

    /* renamed from: a */
    static Map<String, String> f47726a = new HashMap();

    /* renamed from: b */
    private static String f47727b;

    /* renamed from: a */
    public static void m56571a(String str) {
        synchronized (C17050y.class) {
            f47727b = str;
        }
    }

    /* renamed from: a */
    static void m56570a(Context context, String str) {
        C17010ba.m56481a(context, "gtm_install_referrer", "referrer", str);
        m56572b(context, str);
    }

    /* renamed from: b */
    public static void m56572b(Context context, String str) {
        String a = m56569a(str, "conv");
        if (a != null && a.length() > 0) {
            f47726a.put(a, str);
            C17010ba.m56481a(context, "gtm_click_referrers", a, str);
        }
    }

    /* renamed from: a */
    private static String m56569a(String str, String str2) {
        String str3 = "http://hostname/?";
        String valueOf = String.valueOf(str);
        return Uri.parse(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)).getQueryParameter(str2);
    }
}
