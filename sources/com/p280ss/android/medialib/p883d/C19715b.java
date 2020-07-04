package com.p280ss.android.medialib.p883d;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.ss.android.medialib.d.b */
public class C19715b {

    /* renamed from: a */
    private static boolean f53464a;

    /* renamed from: b */
    private static String f53465b;

    /* renamed from: c */
    private static String f53466c;

    /* renamed from: d */
    private static String f53467d;

    /* renamed from: e */
    private static String f53468e;

    /* renamed from: f */
    private static String f53469f;

    /* renamed from: g */
    private static String f53470g;

    /* renamed from: h */
    private static String f53471h;

    /* renamed from: i */
    private static String f53472i;

    /* renamed from: j */
    private static String f53473j;

    /* renamed from: k */
    private static String f53474k;

    /* renamed from: l */
    private static String f53475l;

    /* renamed from: m */
    private static String f53476m;

    /* renamed from: n */
    private static String f53477n;

    /* renamed from: o */
    private static String f53478o;

    /* renamed from: p */
    private static String f53479p;

    /* renamed from: a */
    private static String m65002a() {
        if (VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.CPU_ABI);
        sb2.append(",");
        sb2.append(Build.CPU_ABI2);
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m65003a(Context context) {
        if (!f53464a) {
            synchronized (C19715b.class) {
                if (!f53464a) {
                    m65004b(context.getApplicationContext());
                    f53464a = true;
                }
            }
        }
    }

    /* renamed from: b */
    private static void m65004b(Context context) {
        String str;
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(country)) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("_");
            sb.append(country.toUpperCase());
            str = sb.toString();
        }
        f53465b = Build.MODEL;
        f53466c = C19716c.m65006a();
        f53467d = C19716c.m65009b();
        f53468e = String.valueOf(C19716c.m65010c());
        f53469f = String.valueOf(C19716c.m65012d());
        f53470g = String.valueOf(C19716c.m65014e());
        f53471h = String.valueOf(C19716c.m65005a(context));
        f53474k = String.valueOf(VERSION.SDK_INT);
        f53472i = String.valueOf(C19716c.m65008b(context));
        f53473j = String.valueOf(C19716c.m65011c(context));
        f53475l = C19714a.m65001a(context);
        f53476m = context.getPackageName();
        f53477n = m65002a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(language);
        sb2.append(str);
        f53478o = sb2.toString();
        f53479p = C19716c.m65013d(context);
    }
}
