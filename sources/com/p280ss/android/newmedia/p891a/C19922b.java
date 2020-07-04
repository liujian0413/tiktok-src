package com.p280ss.android.newmedia.p891a;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.newmedia.a.b */
final class C19922b {
    /* renamed from: a */
    static void m65735a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
