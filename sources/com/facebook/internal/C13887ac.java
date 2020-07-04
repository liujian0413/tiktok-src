package com.facebook.internal;

import android.app.Dialog;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.C32278e;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.facebook.internal.ac */
final class C13887ac {
    /* renamed from: a */
    static ApplicationInfo m41008a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C6399b.m19921a().getPackageName())) {
            return packageManager.getApplicationInfo(str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        if (C7108b.f19972a == null) {
            C7108b.f19972a = packageManager.getApplicationInfo(str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        return C7108b.f19972a;
    }

    /* renamed from: a */
    static void m41009a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C13887ac.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    /* renamed from: a */
    static void m41010a(WebView webView, String str) {
        C32278e.m104800a(str);
        webView.loadUrl(str);
    }
}
