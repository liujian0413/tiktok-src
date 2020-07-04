package com.google.common.base;

import com.C1642a;
import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: com.google.common.base.l */
final class C17436l {

    /* renamed from: a */
    private static final Logger f48398a = Logger.getLogger(C17436l.class.getName());

    /* renamed from: b */
    private static final C17435k f48399b = m57959b();

    /* renamed from: com.google.common.base.l$a */
    static final class C17438a implements C17435k {
        private C17438a() {
        }
    }

    private C17436l() {
    }

    /* renamed from: a */
    static long m57956a() {
        return System.nanoTime();
    }

    /* renamed from: b */
    private static C17435k m57959b() {
        return new C17438a();
    }

    /* renamed from: a */
    static boolean m57958a(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m57957a(double d) {
        return C1642a.m8035a(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }
}
