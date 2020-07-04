package com.zhihu.matisse.internal.entity;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.zhihu.matisse.internal.entity.c */
final class C47337c {
    /* renamed from: a */
    static void m147802a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
