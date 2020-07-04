package com.bytedance.ies.dmt.p262ui.bubbleview;

import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.bytedance.ies.dmt.ui.bubbleview.b */
final class C10760b {
    /* renamed from: a */
    static void m31382a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C10760b.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
