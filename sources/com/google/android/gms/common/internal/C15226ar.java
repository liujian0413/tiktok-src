package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p749d.C15176d;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.google.android.gms.common.internal.ar */
public final class C15226ar {

    /* renamed from: a */
    private static Object f39371a = new Object();

    /* renamed from: b */
    private static boolean f39372b;

    /* renamed from: c */
    private static String f39373c;

    /* renamed from: d */
    private static int f39374d;

    /* renamed from: a */
    public static String m44247a(Context context) {
        m44249c(context);
        return f39373c;
    }

    /* renamed from: b */
    public static int m44248b(Context context) {
        m44249c(context);
        return f39374d;
    }

    /* renamed from: c */
    private static void m44249c(Context context) {
        synchronized (f39371a) {
            if (!f39372b) {
                f39372b = true;
                try {
                    Bundle bundle = C15176d.m44159a(context).mo38462a(context.getPackageName(), (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData;
                    if (bundle != null) {
                        f39373c = bundle.getString("com.google.app.id");
                        f39374d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
