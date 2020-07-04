package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ies.ugc.appcontext.g */
public final class C6412g {

    /* renamed from: a */
    private static WeakReference<Bundle> f18756a;

    /* renamed from: a */
    public static String m20003a(Context context, String str) {
        return (String) m20005c(context, str);
    }

    /* renamed from: b */
    public static int m20004b(Context context, String str) {
        return ((Integer) m20005c(context, str)).intValue();
    }

    /* renamed from: c */
    private static Object m20005c(Context context, String str) {
        Bundle bundle;
        if (context == null) {
            return null;
        }
        try {
            if (f18756a != null) {
                bundle = (Bundle) f18756a.get();
            } else {
                bundle = null;
            }
            if (bundle == null) {
                bundle = C6413h.m20006a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData;
                f18756a = new WeakReference<>(bundle);
            }
            return bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
