package com.p280ss.android.ugc.aweme.splash;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import com.google.android.play.core.splitcompat.C6546a;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30472f;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p995ag.C22473a;

/* renamed from: com.ss.android.ugc.aweme.splash.g */
final class C41742g {
    /* renamed from: a */
    static void m132934a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    /* renamed from: a */
    static void m132935a(SplashActivity splashActivity, Context context) {
        C22473a.m74358a(context);
        Context b = C30472f.m99537b(context);
        C6546a.m20342b(b);
        splashActivity.attachBaseContext$___twin___(b);
    }
}
