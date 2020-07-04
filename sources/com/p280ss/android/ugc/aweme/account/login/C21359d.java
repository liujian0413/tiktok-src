package com.p280ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.account.login.d */
final class C21359d {
    /* renamed from: a */
    static void m71809a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    /* renamed from: a */
    static boolean m71810a(Context context) {
        try {
            return C6900g.m21454b().mo16943d();
        } catch (Exception unused) {
            return false;
        }
    }
}
