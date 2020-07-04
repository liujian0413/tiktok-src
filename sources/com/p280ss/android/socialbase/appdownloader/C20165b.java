package com.p280ss.android.socialbase.appdownloader;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.socialbase.appdownloader.b */
final class C20165b {
    /* renamed from: a */
    static void m66425a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
