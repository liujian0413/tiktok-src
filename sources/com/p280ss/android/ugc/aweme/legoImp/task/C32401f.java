package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.ContentResolver;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.provider.Settings.System;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.p327a.C32273a;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.f */
final class C32401f {
    /* renamed from: a */
    static ApplicationInfo m104969a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C6399b.m19921a().getPackageName())) {
            return packageManager.getApplicationInfo(str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        if (C7108b.f19972a == null) {
            C7108b.f19972a = packageManager.getApplicationInfo(str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        return C7108b.f19972a;
    }

    /* renamed from: a */
    static String m104970a(ContentResolver contentResolver, String str) {
        if (!TextUtils.equals(str, "android_id")) {
            return System.getString(contentResolver, str);
        }
        if (TextUtils.isEmpty(C32273a.f84338a)) {
            C32273a.f84338a = System.getString(contentResolver, str);
        }
        return C32273a.f84338a;
    }
}
