package com.facebook;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.C13499h.C13505a;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.login.C32643a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.facebook.i */
final class C13506i {
    /* renamed from: a */
    static ApplicationInfo m39740a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C6399b.m19921a().getPackageName())) {
            return packageManager.getApplicationInfo(str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        if (C7108b.f19972a == null) {
            C7108b.f19972a = packageManager.getApplicationInfo(str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        return C7108b.f19972a;
    }

    /* renamed from: a */
    static void m39741a(Context context, C13505a aVar) {
        C32643a.m105728a();
        C13499h.m39704a(context, aVar);
    }
}
