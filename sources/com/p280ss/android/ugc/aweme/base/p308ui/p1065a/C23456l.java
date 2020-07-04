package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.l */
final class C23456l {
    /* renamed from: a */
    static void m77019a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
