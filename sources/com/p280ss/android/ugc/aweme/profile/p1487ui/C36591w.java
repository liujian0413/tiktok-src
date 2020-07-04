package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.w */
final class C36591w {
    /* renamed from: a */
    static void m118073a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C36591w.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
