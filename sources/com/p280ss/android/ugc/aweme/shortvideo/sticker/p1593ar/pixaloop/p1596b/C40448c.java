package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1596b;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.c */
final class C40448c {
    /* renamed from: a */
    static void m129348a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C40448c.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
