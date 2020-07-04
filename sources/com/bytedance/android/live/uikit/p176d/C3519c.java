package com.bytedance.android.live.uikit.p176d;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.android.live.uikit.d.c */
public final class C3519c {
    /* renamed from: a */
    public static boolean m12965a(Context context) {
        if (context == null || VERSION.SDK_INT <= 16) {
            return false;
        }
        if (context.getResources().getConfiguration().locale.getLanguage().equals("ar") || context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
