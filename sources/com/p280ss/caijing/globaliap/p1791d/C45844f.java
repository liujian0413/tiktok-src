package com.p280ss.caijing.globaliap.p1791d;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.ss.caijing.globaliap.d.f */
public final class C45844f {

    /* renamed from: a */
    private static HashSet<String> f117250a = new HashSet<>();

    /* renamed from: b */
    static void m143859b(String str) {
        f117250a.remove(str);
    }

    /* renamed from: a */
    static void m143858a(String str) {
        if (!f117250a.contains(str)) {
            f117250a.add(str);
        }
    }

    /* renamed from: a */
    public static synchronized void m143857a(Context context, String str, String str2, boolean z) {
        synchronized (C45844f.class) {
            if (!f117250a.contains(str2)) {
                new Thread(new C45814b(context, str, str2, z), "cj_bg_check_consume").start();
            }
        }
    }
}
