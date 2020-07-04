package com.p280ss.android.ugc.aweme.p313im.sdk.debug;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.debug.a */
final class C31099a {
    /* renamed from: a */
    static void m101413a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
