package com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a */
final class C41632a {
    /* renamed from: a */
    static void m132541a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C41632a.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
