package com.zego.p1851ve;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.zego.ve.VeBitmap */
public class VeBitmap {
    public static int saveBitmap(Bitmap bitmap) {
        StringBuilder sb = new StringBuilder("snapshot-");
        sb.append(SystemClock.uptimeMillis());
        sb.append(".jpg");
        File file = new File("/sdcard/", sb.toString());
        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Bitmap createBitmapRGBA(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
    }

    public static Bitmap getBitmapFromAsset(Context context, String str) {
        try {
            return BitmapFactory.decodeStream(context.getAssets().open(str));
        } catch (IOException unused) {
            return null;
        }
    }

    public static int calculateInSampleSize(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static Bitmap getBitmapFromPath(Context context, int i, int i2, String str) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap getBitmap(Context context, int i, int i2, String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return null;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1, str.length());
        if (substring.compareTo("asset") == 0) {
            return getBitmapFromAsset(context, substring2);
        }
        if (substring.compareTo("file") == 0) {
            return getBitmapFromPath(context, i, i2, substring2);
        }
        return null;
    }
}
