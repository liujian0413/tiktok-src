package com.bytedance.ies.dmt.p262ui.p563c;

import android.os.Build.VERSION;
import android.os.Looper;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.ies.dmt.ui.c.d */
final class C10768d {
    /* renamed from: a */
    static void m31435a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C10768d.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    /* renamed from: a */
    static void m31436a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
