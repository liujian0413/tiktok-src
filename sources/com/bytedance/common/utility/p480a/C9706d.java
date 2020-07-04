package com.bytedance.common.utility.p480a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.bytedance.common.utility.a.d */
public final class C9706d {
    /* renamed from: a */
    public static String m28642a(Context context, String str) {
        return (String) m28644c(context, str);
    }

    /* renamed from: b */
    public static int m28643b(Context context, String str) {
        return ((Integer) m28644c(context, str)).intValue();
    }

    /* renamed from: c */
    private static Object m28644c(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return C9707e.m28645a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
