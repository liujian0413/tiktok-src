package com.p280ss.android.ugc.aweme.property;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.property.q */
final class C36982q {
    /* renamed from: a */
    static void m118976a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
