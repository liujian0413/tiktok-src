package com.bytedance.sdk.account.bdplatform.impl;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.b */
final class C12780b {
    /* renamed from: a */
    static void m37109a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
