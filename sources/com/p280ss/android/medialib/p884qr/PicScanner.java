package com.p280ss.android.medialib.p884qr;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.vesdk.utils.BitmapLoader;

/* renamed from: com.ss.android.medialib.qr.PicScanner */
public class PicScanner {
    public long handle = nativeCreate();
    private C19788a listener;
    private boolean success;

    /* renamed from: com.ss.android.medialib.qr.PicScanner$a */
    public interface C19788a {
        /* renamed from: a */
        void mo53086a(boolean z);
    }

    static {
        TENativeLibsLoader.m67988e();
    }

    private native long nativeCreate();

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native void nativeRelease(long j);

    private native int nativeStart(long j, Bitmap bitmap, ScanSettings scanSettings);

    private native void nativeStop(long j);

    public boolean isSuccess() {
        return this.success;
    }

    public boolean isValid() {
        if (this.handle != 0) {
            return true;
        }
        return false;
    }

    public void release() {
        if (this.handle != 0) {
            nativeRelease(this.handle);
        }
    }

    public void stop() {
        if (this.handle != 0) {
            nativeStop(this.handle);
        }
    }

    public EnigmaResult getEnigmaResult() {
        if (this.handle == 0) {
            return null;
        }
        EnigmaResult nativeGetEnigmaResult = nativeGetEnigmaResult(this.handle);
        if (!(nativeGetEnigmaResult == null || nativeGetEnigmaResult.getResult() == null)) {
            this.success = true;
        }
        return nativeGetEnigmaResult;
    }

    public void setListener(C19788a aVar) {
        this.listener = aVar;
    }

    public void onResult(boolean z) {
        if (this.listener != null) {
            this.listener.mo53086a(z);
        }
    }

    public int start(Bitmap bitmap, ScanSettings scanSettings) {
        if (bitmap == null) {
            return -1;
        }
        this.success = false;
        nativeStart(this.handle, bitmap, scanSettings);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return 0;
    }

    public int start(String str, ScanSettings scanSettings) {
        if (this.handle == 0) {
            return -1;
        }
        try {
            Bitmap loadBitmap = BitmapLoader.loadBitmap(str, scanSettings.width, scanSettings.height);
            if (loadBitmap != null) {
                int width = loadBitmap.getWidth();
                int height = loadBitmap.getHeight();
                if (width * height > 4000000) {
                    float sqrt = (float) (1.0d / Math.sqrt((double) ((((float) width) * ((float) height)) / 4000000.0f)));
                    Matrix matrix = new Matrix();
                    matrix.postScale(sqrt, sqrt);
                    Bitmap.createBitmap(loadBitmap, 0, 0, width, height, matrix, true);
                } else {
                    loadBitmap.copy(Config.ARGB_8888, true);
                }
            }
            return start(loadBitmap.copy(Config.ARGB_8888, true), scanSettings);
        } catch (Exception unused) {
            return -2;
        } catch (OutOfMemoryError unused2) {
            return -3;
        }
    }
}
