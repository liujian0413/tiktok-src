package com.bytedance.android.livesdk.utils;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.android.livesdk.utils.t */
final class C9082t {
    /* renamed from: a */
    static void m27119a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
