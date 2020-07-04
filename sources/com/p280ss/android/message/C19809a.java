package com.p280ss.android.message;

import android.app.Application;
import com.bytedance.common.p478b.C9680a;
import com.p280ss.android.message.p885a.C19826j;

/* renamed from: com.ss.android.message.a */
public final class C19809a {

    /* renamed from: a */
    private static Application f53762a;

    /* renamed from: b */
    private static boolean f53763b;

    /* renamed from: a */
    public static Application m65408a() {
        return f53762a;
    }

    /* renamed from: b */
    public static int m65410b() {
        return f53762a.getApplicationInfo().targetSdkVersion;
    }

    /* renamed from: a */
    public static void m65409a(Application application) {
        f53762a = application;
        if (!f53763b) {
            f53763b = true;
            if (C19826j.m65474c(application)) {
                f53762a.registerActivityLifecycleCallbacks(C9680a.m28603a());
            }
        }
    }
}
