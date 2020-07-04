package com.p280ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.utils.u */
public final class C43170u {
    /* renamed from: a */
    private static void m136918a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m136917a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static boolean m136919a(Bitmap bitmap, File file, int i, CompressFormat compressFormat) {
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m136918a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m136918a((OutputStream) bufferedOutputStream2);
            } catch (Exception unused) {
                bufferedOutputStream = bufferedOutputStream2;
                m136918a((OutputStream) bufferedOutputStream);
                return z;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                m136918a((OutputStream) bufferedOutputStream);
                throw th;
            }
            return z;
        } catch (Exception unused2) {
            m136918a((OutputStream) bufferedOutputStream);
            return z;
        } catch (Throwable th2) {
            th = th2;
            m136918a((OutputStream) bufferedOutputStream);
            throw th;
        }
    }
}
