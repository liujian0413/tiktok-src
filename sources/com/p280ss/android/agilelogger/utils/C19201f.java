package com.p280ss.android.agilelogger.utils;

import android.os.Build.VERSION;

/* renamed from: com.ss.android.agilelogger.utils.f */
public class C19201f {

    /* renamed from: a */
    private static final C19201f f51866a = m62931c();

    /* renamed from: com.ss.android.agilelogger.utils.f$a */
    static class C19202a extends C19201f {
        C19202a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final String mo50911b() {
            if (VERSION.SDK_INT < 19) {
                return "\n";
            }
            return System.lineSeparator();
        }
    }

    /* renamed from: a */
    public static C19201f m62930a() {
        return f51866a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo50911b() {
        return System.lineSeparator();
    }

    /* renamed from: c */
    private static C19201f m62931c() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new C19202a();
            }
        } catch (ClassNotFoundException unused) {
        }
        return new C19201f();
    }
}
