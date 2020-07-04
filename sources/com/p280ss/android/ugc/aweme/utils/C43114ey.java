package com.p280ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.widget.Toast;

/* renamed from: com.ss.android.ugc.aweme.utils.ey */
final class C43114ey {
    /* renamed from: a */
    static void m136742a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
