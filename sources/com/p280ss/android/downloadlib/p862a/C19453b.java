package com.p280ss.android.downloadlib.p862a;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.downloadlib.a.b */
final class C19453b {
    /* renamed from: a */
    static void m63983a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
