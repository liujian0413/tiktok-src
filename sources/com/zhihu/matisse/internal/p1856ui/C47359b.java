package com.zhihu.matisse.internal.p1856ui;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.zhihu.matisse.internal.ui.b */
final class C47359b {
    /* renamed from: a */
    static void m147899a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
