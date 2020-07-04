package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.m */
final class C41705m {
    /* renamed from: a */
    static void m132819a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C41705m.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
