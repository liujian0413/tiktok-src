package com.p280ss.android.ugc.aweme.main;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.os.Looper;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.main.ap */
final class C32880ap {
    /* renamed from: a */
    static void m106464a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    /* renamed from: a */
    static void m106465a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
