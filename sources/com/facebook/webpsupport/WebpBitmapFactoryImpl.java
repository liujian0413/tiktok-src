package com.facebook.webpsupport;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.TypedValue;
import com.facebook.common.p689f.C13293a;
import com.facebook.common.p689f.C13294b;
import com.facebook.common.p689f.C13294b.C13295a;
import com.facebook.common.p689f.C13296c;
import com.facebook.imagepipeline.nativecode.C13838d;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebpBitmapFactoryImpl implements C13294b {
    public static final boolean IN_BITMAP_SUPPORTED;
    private static C13293a mBitmapCreator;
    private static C13295a mWebpErrorLogger;

    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, Options options, float f, byte[] bArr2);

    private static native Bitmap nativeDecodeStream(InputStream inputStream, Options options, float f, byte[] bArr);

    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, Options options) {
        return C14641a.m42349a(bArr, i, i2, options);
    }

    private static Bitmap originalDecodeFile(String str) {
        return C14641a.m42347a(str);
    }

    private static Bitmap originalDecodeFile(String str, Options options) {
        return C14641a.m42348a(str, options);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return C14641a.m42343a(fileDescriptor);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options) {
        return C14641a.m42344a(fileDescriptor, rect, options);
    }

    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return C14641a.m42345a(inputStream);
    }

    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, Options options) {
        return C14641a.m42346a(inputStream, rect, options);
    }

    static {
        boolean z;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        } else {
            z = false;
        }
        IN_BITMAP_SUPPORTED = z;
    }

    public void setBitmapCreator(C13293a aVar) {
        mBitmapCreator = aVar;
    }

    public void setWebpErrorLogger(C13295a aVar) {
        mWebpErrorLogger = aVar;
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    public static Bitmap originalDecodeFile$___twin___(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap originalDecodeFileDescriptor$___twin___(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap originalDecodeStream$___twin___(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    private static byte[] getInTempStorageFromOptions(Options options) {
        if (options == null || options.inTempStorage == null) {
            return new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        }
        return options.inTempStorage;
    }

    private static void sendWebpErrorLog(String str) {
        if (mWebpErrorLogger != null) {
            mWebpErrorLogger.onWebpErrorLog(str, "decoding_failure");
        }
    }

    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static boolean shouldPremultiply(Options options) {
        if (VERSION.SDK_INT < 19 || options == null) {
            return true;
        }
        return options.inPremultiplied;
    }

    private static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            return new BufferedInputStream(inputStream, 20);
        }
        return inputStream;
    }

    private static float getScaleFromOptions(Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        int i4 = options.inScreenDensity;
        if (i2 == 0 || i3 == 0 || i2 == i4) {
            return f;
        }
        return ((float) i3) / ((float) i2);
    }

    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    public Bitmap decodeFile(String str, Options options) {
        return hookDecodeFile(str, options);
    }

    public static Bitmap originalDecodeFile$___twin___(String str, Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private static void setWebpBitmapOptions(Bitmap bitmap, Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    private static byte[] getWebpHeader(InputStream inputStream, Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || options.inTempStorage == null || options.inTempStorage.length < 20) {
            bArr = new byte[20];
        } else {
            bArr = options.inTempStorage;
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    public static Bitmap hookDecodeFile(String str, Options options) {
        Throwable th;
        Throwable th2;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                Bitmap hookDecodeStream = hookDecodeStream(fileInputStream, null, options);
                try {
                    fileInputStream.close();
                    return hookDecodeStream;
                } catch (Exception unused) {
                    return hookDecodeStream;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th = r3;
                th2 = th4;
            }
            throw th2;
            if (th != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    C6497a.m20181a(th, th5);
                }
            } else {
                fileInputStream.close();
            }
            throw th2;
        } catch (Exception unused2) {
            return null;
        }
    }

    private static void setDensityFromOptions(Bitmap bitmap, Options options) {
        if (bitmap != null && options != null) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (!(i2 == 0 || i == i2 || i == options.inScreenDensity || !options.inScaled)) {
                    bitmap.setDensity(i2);
                }
                return;
            }
            if (IN_BITMAP_SUPPORTED && options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    private static void setBitmapSize(Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    public Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    public Bitmap decodeStream(InputStream inputStream, Rect rect, Options options) {
        return hookDecodeStream(inputStream, rect, options);
    }

    public static Bitmap originalDecodeFileDescriptor$___twin___(FileDescriptor fileDescriptor, Rect rect, Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    private static Bitmap originalDecodeResource(Resources resources, int i, Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static Bitmap originalDecodeStream$___twin___(InputStream inputStream, Rect rect, Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    private static boolean setOutDimensions(Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    private static Bitmap createBitmap(int i, int i2, Options options) {
        if (!IN_BITMAP_SUPPORTED || options == null || options.inBitmap == null || !options.inBitmap.isMutable()) {
            return mBitmapCreator.createNakedBitmap(i, i2, Config.ARGB_8888);
        }
        return options.inBitmap;
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, Options options) {
        Bitmap bitmap;
        C13838d.m40862a();
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        byte[] webpHeader = getWebpHeader(wrapToMarkSupportedStream, options);
        if (!C13296c.f35194a || !C13296c.m38904b(webpHeader, 0, 20)) {
            bitmap = originalDecodeStream(wrapToMarkSupportedStream, rect, options);
            if (bitmap == null) {
                sendWebpErrorLog("webp_direct_decode_stream_failed_on_no_webp");
            }
        } else {
            bitmap = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmap == null) {
                sendWebpErrorLog("webp_direct_decode_stream");
            }
            setWebpBitmapOptions(bitmap, options);
            setPaddingDefaultValues(rect);
        }
        return bitmap;
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options) {
        Bitmap bitmap;
        C13838d.m40862a();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(new FileInputStream(fileDescriptor));
            try {
                byte[] webpHeader = getWebpHeader(wrapToMarkSupportedStream, options);
                if (!C13296c.f35194a || !C13296c.m38904b(webpHeader, 0, 20)) {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    bitmap = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                    if (bitmap == null) {
                        sendWebpErrorLog("webp_direct_decode_fd_failed_on_no_webp");
                    }
                } else {
                    bitmap = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    if (bitmap == null) {
                        sendWebpErrorLog("webp_direct_decode_fd");
                    }
                    setPaddingDefaultValues(rect);
                    setWebpBitmapOptions(bitmap, options);
                }
                try {
                    wrapToMarkSupportedStream.close();
                    return bitmap;
                } catch (Throwable unused) {
                    return bitmap;
                }
            } catch (Throwable unused2) {
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        throw th;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i, Options options) {
        Bitmap bitmap;
        Throwable th;
        Throwable th2;
        TypedValue typedValue = new TypedValue();
        try {
            InputStream openRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (Exception unused) {
                    }
                }
                if (!IN_BITMAP_SUPPORTED || bitmap != null || options == null || options.inBitmap == null) {
                    return bitmap;
                }
                throw new IllegalArgumentException("Problem decoding into existing bitmap");
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th2 = r3;
                th = th4;
            }
            if (openRawResource != null) {
                if (th2 != null) {
                    try {
                        openRawResource.close();
                    } catch (Throwable th5) {
                        C6497a.m20181a(th2, th5);
                    }
                } else {
                    openRawResource.close();
                }
            }
            throw th;
            throw th;
        } catch (Exception unused2) {
            bitmap = null;
        }
    }

    public static Bitmap originalDecodeByteArray$___twin___(byte[] bArr, int i, int i2, Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2, Options options) {
        return hookDecodeByteArray(bArr, i, i2, options);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, Options options) {
        Bitmap bitmap;
        C13838d.m40862a();
        if (!C13296c.f35194a || !C13296c.m38904b(bArr, i, i2)) {
            bitmap = originalDecodeByteArray(bArr, i, i2, options);
            if (bitmap == null) {
                sendWebpErrorLog("webp_direct_decode_array_failed_on_no_webp");
            }
        } else {
            bitmap = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmap == null) {
                sendWebpErrorLog("webp_direct_decode_array");
            }
            setWebpBitmapOptions(bitmap, options);
        }
        return bitmap;
    }

    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, Options options) {
        if (options == null) {
            options = new Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }
}
