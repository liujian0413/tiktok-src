package com.p280ss.android.deviceregister.p289a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.ss.android.deviceregister.a.e */
final class C19296e {
    /* renamed from: a */
    static ApplicationInfo m63227a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C6399b.m19921a().getPackageName())) {
            return packageManager.getApplicationInfo(str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        if (C7108b.f19972a == null) {
            C7108b.f19972a = packageManager.getApplicationInfo(str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        return C7108b.f19972a;
    }
}
