package com.p280ss.android.ugc.aweme.tools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.tools.f */
public final class C42341f {
    /* renamed from: a */
    public static void m134635a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m134634a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static Bitmap m134633a(String str, int[] iArr) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Config.RGB_565;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (i2 >= i3 && i2 > i4) {
            i = i2 / i4;
        } else if (i2 >= i3 || i3 <= i5) {
            i = 1;
        } else {
            i = i3 / i5;
        }
        if (i <= 0) {
            i = 1;
        }
        options.inSampleSize = i;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static boolean m134636a(Bitmap bitmap, File file, int i, CompressFormat compressFormat) {
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m134635a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, i, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m134635a((OutputStream) bufferedOutputStream2);
            } catch (Exception unused) {
                bufferedOutputStream = bufferedOutputStream2;
                m134635a((OutputStream) bufferedOutputStream);
                return z;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                m134635a((OutputStream) bufferedOutputStream);
                throw th;
            }
            return z;
        } catch (Exception unused2) {
            m134635a((OutputStream) bufferedOutputStream);
            return z;
        } catch (Throwable th2) {
            th = th2;
            m134635a((OutputStream) bufferedOutputStream);
            throw th;
        }
    }
}
