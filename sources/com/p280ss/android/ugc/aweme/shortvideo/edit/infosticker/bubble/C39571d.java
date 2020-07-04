package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.d */
final class C39571d {
    /* renamed from: a */
    static void m126453a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C39571d.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
