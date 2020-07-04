package com.bytedance.android.livesdk.chatroom.interact;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.z */
final class C4846z {
    /* renamed from: a */
    static void m15868a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
