package com.zhihu.matisse.internal.p1855a;

import android.content.Context;

/* renamed from: com.zhihu.matisse.internal.a.f */
public final class C47332f {
    /* renamed from: a */
    public static int m147786a(Context context, int i) {
        int round = Math.round(((float) context.getResources().getDisplayMetrics().widthPixels) / ((float) i));
        if (round == 0) {
            return 1;
        }
        return round;
    }
}
