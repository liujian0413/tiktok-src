package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ed */
final class C5687ed {
    /* renamed from: a */
    static void m18042a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
