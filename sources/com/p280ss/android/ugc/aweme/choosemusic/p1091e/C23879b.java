package com.p280ss.android.ugc.aweme.choosemusic.p1091e;

import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.e.b */
final class C23879b {
    /* renamed from: a */
    static void m78164a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C23879b.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
