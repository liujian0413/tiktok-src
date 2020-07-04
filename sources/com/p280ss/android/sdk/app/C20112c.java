package com.p280ss.android.sdk.app;

import java.util.HashMap;

/* renamed from: com.ss.android.sdk.app.c */
public final class C20112c {

    /* renamed from: a */
    public static HashMap<Integer, Integer> f54439a;

    /* renamed from: a */
    public static int m66309a(int i, boolean z) {
        if (z && f54439a != null && !f54439a.isEmpty()) {
            Integer num = (Integer) f54439a.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        }
        return i;
    }
}
