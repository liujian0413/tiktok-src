package com.bytedance.android.live.core.utils;

import com.C1642a;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.utils.i */
public final class C3389i {
    /* renamed from: a */
    public static String m12608a(int i, Object... objArr) {
        if (C3358ac.m12528e() == null) {
            return null;
        }
        String a = C3358ac.m12515a(i);
        if (a == null) {
            return null;
        }
        return C1642a.m8035a(Locale.US, a, objArr);
    }
}
