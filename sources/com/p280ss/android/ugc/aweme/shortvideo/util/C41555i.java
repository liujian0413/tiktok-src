package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.i */
public final class C41555i {
    /* renamed from: a */
    public static int m132331a(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return NormalGiftView.ALPHA_180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static Bitmap m132332a(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (createBitmap.equals(bitmap)) {
            return createBitmap;
        }
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m132333a(String str, int i, int i2) {
        int i3;
        Options options = new Options();
        int i4 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i5 = options.outWidth;
        int i6 = options.outHeight;
        if (i5 > i6 && i5 > 90) {
            i3 = options.outWidth / 90;
        } else if (i5 >= i6 || i6 <= 110) {
            i3 = 1;
        } else {
            i3 = options.outHeight / OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED;
        }
        if (i3 > 0) {
            i4 = i3;
        }
        options.inSampleSize = i4;
        return BitmapFactory.decodeFile(str, options);
    }
}
