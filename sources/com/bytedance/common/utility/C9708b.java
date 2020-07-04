package com.bytedance.common.utility;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.utility.b */
public final class C9708b {

    /* renamed from: a */
    private static Boolean f26433a;

    /* renamed from: a */
    public static boolean m28646a() {
        if (f26433a != null) {
            return f26433a.booleanValue();
        }
        boolean z = false;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[]{"ro.build.version.emui"});
            if ((invoke instanceof String) && !C6319n.m19593a((String) invoke) && !"unknown".equals((String) invoke)) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        f26433a = Boolean.valueOf(z);
        return z;
    }
}
