package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.r */
final class C30910r {
    /* renamed from: a */
    static void m100636a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            popupWindow.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
