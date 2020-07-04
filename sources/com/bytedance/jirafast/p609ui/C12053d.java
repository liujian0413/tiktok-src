package com.bytedance.jirafast.p609ui;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.jirafast.ui.d */
final class C12053d {
    /* renamed from: a */
    static void m35118a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
