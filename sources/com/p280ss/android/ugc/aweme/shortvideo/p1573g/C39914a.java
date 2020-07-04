package com.p280ss.android.ugc.aweme.shortvideo.p1573g;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.g.a */
public final class C39914a {
    /* renamed from: a */
    public static int m127681a(Options options, int i, int i2) {
        int i3 = 1;
        if (i == 0 || i2 == 0) {
            return 1;
        }
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 > i || i5 > i2) {
            int i6 = i4 >> 1;
            int i7 = i5 >> 1;
            while (i6 / i3 > i && i7 / i3 > i2) {
                i3 <<= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static BitmapDrawable m127683a(Resources resources, int i, Options options) {
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(resources.openRawResource(i), null, options);
            if (decodeStream != null) {
                return new BitmapDrawable(resources, decodeStream);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static BitmapDrawable m127685a(Resources resources, String str, Options options) {
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile != null) {
                return new BitmapDrawable(resources, decodeFile);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static BitmapDrawable m127682a(Resources resources, int i, int i2, int i3, float f, int i4, C39915b bVar) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(resources.openRawResource(i), null, options);
        options.inSampleSize = m127681a(options, i2, i3);
        if (f > 0.0f && i4 > 0) {
            options.inScaled = true;
            options.inDensity = (int) (((float) i4) / f);
            options.inTargetDensity = i4;
        }
        String resourceName = resources.getResourceName(i);
        BitmapDrawable a = bVar.mo99321a(resourceName);
        if (a != null) {
            return a;
        }
        BitmapDrawable a2 = m127683a(resources, i, options);
        if (a2 != null) {
            bVar.mo99322a(resourceName, a2);
        }
        return a2;
    }

    /* renamed from: a */
    public static BitmapDrawable m127684a(Resources resources, String str, int i, int i2, float f, int i3, C39915b bVar) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m127681a(options, i, i2);
        if (f > 0.0f && i3 > 0) {
            options.inScaled = true;
            options.inDensity = (int) (((float) i3) / f);
            options.inTargetDensity = i3;
        }
        BitmapDrawable a = bVar.mo99321a(str);
        if (a != null) {
            return a;
        }
        BitmapDrawable a2 = m127685a(resources, str, options);
        if (a2 != null) {
            bVar.mo99322a(str, a2);
        }
        return a2;
    }
}
