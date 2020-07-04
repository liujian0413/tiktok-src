package com.p280ss.android.ugc.aweme.account.view;

import android.app.Dialog;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.account.view.a */
final class C22359a {
    /* renamed from: a */
    static void m74043a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C22359a.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
