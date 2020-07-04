package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1598d;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.b */
final class C40456b {
    /* renamed from: a */
    static void m129369a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C40456b.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
