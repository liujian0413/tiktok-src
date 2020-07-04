package com.p280ss.android.newmedia.p897ui.webview;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.newmedia.ui.webview.e */
final class C20003e {
    /* renamed from: a */
    static void m65922a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
