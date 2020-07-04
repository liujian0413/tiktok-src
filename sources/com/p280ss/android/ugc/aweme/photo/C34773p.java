package com.p280ss.android.ugc.aweme.photo;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;

/* renamed from: com.ss.android.ugc.aweme.photo.p */
public final class C34773p {
    /* renamed from: a */
    public static int[] m112163a(String str) {
        if (!C38527bf.m123172a(str)) {
            return new int[]{0, 0};
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }
}
