package com.p280ss.android.ugc.aweme.poi.widget;

import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.d */
final class C35487d {
    /* renamed from: a */
    static void m114651a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C35487d.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
