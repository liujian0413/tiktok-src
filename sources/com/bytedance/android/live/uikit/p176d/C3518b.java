package com.bytedance.android.live.uikit.p176d;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.android.live.uikit.d.b */
final class C3518b {
    /* renamed from: a */
    static void m12964a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
