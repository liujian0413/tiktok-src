package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import com.C1642a;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13315l;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imagepipeline.memory.C13796a;
import com.facebook.imagepipeline.memory.C13805b;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p722i.C13659f;
import com.facebook.imageutils.C13844a;
import java.util.Locale;

public abstract class DalvikPurgeableDecoder implements C13659f {
    protected static final byte[] EOI = {-1, -39};
    private final C13796a mUnpooledBitmapsCounter = C13805b.m40745a();

    private static native void nativePinBitmap(Bitmap bitmap);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeByteArrayAsPurgeable(C13326a<PooledByteBuffer> aVar, Options options);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(C13326a<PooledByteBuffer> aVar, int i, Options options);

    protected DalvikPurgeableDecoder() {
    }

    static {
        C13835a.m40859a();
    }

    public C13326a<Bitmap> pinBitmap(Bitmap bitmap) {
        C13307g.m38940a(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.mo33416a(bitmap)) {
                return C13326a.m38996a(bitmap, this.mUnpooledBitmapsCounter.f36603a);
            }
            int a = C13844a.m40886a(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(C1642a.m8035a(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(a), Integer.valueOf(this.mUnpooledBitmapsCounter.mo33415a()), Long.valueOf(this.mUnpooledBitmapsCounter.mo33417b()), Integer.valueOf(this.mUnpooledBitmapsCounter.mo33419c()), Integer.valueOf(this.mUnpooledBitmapsCounter.mo33420d())}));
        } catch (Exception e) {
            bitmap.recycle();
            throw C13315l.m38962b(e);
        }
    }

    public static boolean endsWithEOI(C13326a<PooledByteBuffer> aVar, int i) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) aVar.mo32609a();
        if (i >= 2 && pooledByteBuffer.mo32574a(i - 2) == -1 && pooledByteBuffer.mo32574a(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public static Options getBitmapFactoryOptions(int i, Config config) {
        Options options = new Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    public C13326a<Bitmap> decodeFromEncodedImage(C13647e eVar, Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(eVar, config, rect, false);
    }

    public C13326a<Bitmap> decodeJPEGFromEncodedImage(C13647e eVar, Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i, false);
    }

    public C13326a<Bitmap> decodeFromEncodedImageWithColorSpace(C13647e eVar, Config config, Rect rect, boolean z) {
        Options bitmapFactoryOptions = getBitmapFactoryOptions(eVar.f36263f, config);
        C13326a b = eVar.mo33271b();
        C13307g.m38940a(b);
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(b, bitmapFactoryOptions));
        } finally {
            C13326a.m39001c(b);
        }
    }

    public C13326a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C13647e eVar, Config config, Rect rect, int i, boolean z) {
        Options bitmapFactoryOptions = getBitmapFactoryOptions(eVar.f36263f, config);
        C13326a b = eVar.mo33271b();
        C13307g.m38940a(b);
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(b, i, bitmapFactoryOptions));
        } finally {
            C13326a.m39001c(b);
        }
    }
}
