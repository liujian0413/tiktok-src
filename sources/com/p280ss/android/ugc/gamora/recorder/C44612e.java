package com.p280ss.android.ugc.gamora.recorder;

import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.gamora.recorder.e */
final class C44612e {
    /* renamed from: a */
    static void m140931a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C44612e.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
