package com.facebook.imagepipeline.p722i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.support.p022v4.util.Pools.SynchronizedPool;
import com.facebook.common.internal.C13307g;
import com.facebook.common.p688e.C13291a;
import com.facebook.common.p688e.C13292b;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.memory.C13806c;
import com.facebook.imagepipeline.p720g.C13647e;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.i.b */
public abstract class C13655b implements C13659f {

    /* renamed from: b */
    private static final Class<?> f36274b = C13655b.class;

    /* renamed from: d */
    private static final byte[] f36275d = {-1, -39};

    /* renamed from: a */
    final SynchronizedPool<ByteBuffer> f36276a;

    /* renamed from: c */
    private final C13806c f36277c;

    /* renamed from: a */
    public abstract int mo33289a(int i, int i2, Options options);

    /* renamed from: a */
    private static Options m40268a(C13647e eVar, Config config) {
        Options options = new Options();
        options.inSampleSize = eVar.f36263f;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.mo33274c(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    public C13655b(C13806c cVar, int i, SynchronizedPool synchronizedPool) {
        this.f36277c = cVar;
        this.f36276a = synchronizedPool;
        for (int i2 = 0; i2 < i; i2++) {
            this.f36276a.release(ByteBuffer.allocate(16384));
        }
    }

    public C13326a<Bitmap> decodeJPEGFromEncodedImage(C13647e eVar, Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i, false);
    }

    public C13326a<Bitmap> decodeFromEncodedImageWithColorSpace(C13647e eVar, Config config, Rect rect, boolean z) {
        boolean z2;
        Options a = m40268a(eVar, config);
        if (a.inPreferredConfig != Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return m40269a(eVar.mo33274c(), a, rect, z);
        } catch (RuntimeException e) {
            if (z2) {
                return decodeFromEncodedImageWithColorSpace(eVar, Config.ARGB_8888, rect, z);
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        com.facebook.common.p686c.C13286a.m38859c(f36274b, "Could not decode region %s, decoding full bitmap instead.", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r0 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d A[Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6, all -> 0x00a4, IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084 A[Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6, all -> 0x00a4, IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.references.C13326a<android.graphics.Bitmap> m40269a(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, android.graphics.Rect r11, boolean r12) {
        /*
            r8 = this;
            com.facebook.common.internal.C13307g.m38940a(r9)
            int r0 = r10.outWidth
            int r1 = r10.outHeight
            if (r11 == 0) goto L_0x0017
            int r0 = r11.width()
            int r1 = r10.inSampleSize
            int r0 = r0 / r1
            int r1 = r11.height()
            int r2 = r10.inSampleSize
            int r1 = r1 / r2
        L_0x0017:
            int r2 = r8.mo33289a(r0, r1, r10)
            com.facebook.imagepipeline.memory.c r3 = r8.f36277c
            java.lang.Object r2 = r3.mo32581a(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x00dd
            r10.inBitmap = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x0037
            if (r12 == 0) goto L_0x0037
            android.graphics.ColorSpace$Named r12 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r12 = android.graphics.ColorSpace.get(r12)
            r10.inPreferredColorSpace = r12
        L_0x0037:
            android.support.v4.util.Pools$SynchronizedPool<java.nio.ByteBuffer> r12 = r8.f36276a
            java.lang.Object r12 = r12.acquire()
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12
            if (r12 != 0) goto L_0x0047
            r12 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)
        L_0x0047:
            r3 = 1
            r4 = 0
            byte[] r5 = r12.array()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            r10.inTempStorage = r5     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            if (r11 == 0) goto L_0x0081
            android.graphics.Bitmap$Config r5 = r10.inPreferredConfig     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r2.reconfigure(r0, r1, r5)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r9, r3)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            android.graphics.Bitmap r1 = r0.decodeRegion(r11, r10)     // Catch:{ IOException -> 0x0068 }
            if (r0 == 0) goto L_0x0082
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            goto L_0x0082
        L_0x0064:
            r11 = move-exception
            r0 = r4
            goto L_0x007b
        L_0x0067:
            r0 = r4
        L_0x0068:
            java.lang.Class<?> r1 = f36274b     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            r7 = 0
            r6[r7] = r11     // Catch:{ all -> 0x007a }
            com.facebook.common.p686c.C13286a.m38859c(r1, r5, r6)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0081
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            goto L_0x0081
        L_0x007a:
            r11 = move-exception
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0080:
            throw r11     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0081:
            r1 = r4
        L_0x0082:
            if (r1 != 0) goto L_0x0088
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r9, r4, r10)     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0088:
            android.support.v4.util.Pools$SynchronizedPool<java.nio.ByteBuffer> r9 = r8.f36276a
            r9.release(r12)
            if (r2 != r1) goto L_0x0096
            com.facebook.imagepipeline.memory.c r9 = r8.f36277c
            com.facebook.common.references.a r9 = com.facebook.common.references.C13326a.m38996a(r1, r9)
            return r9
        L_0x0096:
            com.facebook.imagepipeline.memory.c r9 = r8.f36277c
            r9.mo32582a(r2)
            r1.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x00a4:
            r9 = move-exception
            goto L_0x00d7
        L_0x00a6:
            r9 = move-exception
            com.facebook.imagepipeline.memory.c r10 = r8.f36277c     // Catch:{ all -> 0x00a4 }
            r10.mo32582a(r2)     // Catch:{ all -> 0x00a4 }
            throw r9     // Catch:{ all -> 0x00a4 }
        L_0x00ad:
            r11 = move-exception
            com.facebook.imagepipeline.memory.c r0 = r8.f36277c     // Catch:{ all -> 0x00a4 }
            r0.mo32582a(r2)     // Catch:{ all -> 0x00a4 }
            r9.reset()     // Catch:{ IOException -> 0x00d6 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00d6 }
            r0.<init>()     // Catch:{ IOException -> 0x00d6 }
            r0.inMutable = r3     // Catch:{ IOException -> 0x00d6 }
            int r10 = r10.inSampleSize     // Catch:{ IOException -> 0x00d6 }
            r0.inSampleSize = r10     // Catch:{ IOException -> 0x00d6 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9, r4, r0)     // Catch:{ IOException -> 0x00d6 }
            if (r9 == 0) goto L_0x00d5
            com.facebook.imagepipeline.b.g r10 = com.facebook.imagepipeline.p715b.C13553g.m39883a()     // Catch:{ IOException -> 0x00d6 }
            com.facebook.common.references.a r9 = com.facebook.common.references.C13326a.m38996a(r9, r10)     // Catch:{ IOException -> 0x00d6 }
            android.support.v4.util.Pools$SynchronizedPool<java.nio.ByteBuffer> r10 = r8.f36276a
            r10.release(r12)
            return r9
        L_0x00d5:
            throw r11     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            throw r11     // Catch:{ all -> 0x00a4 }
        L_0x00d7:
            android.support.v4.util.Pools$SynchronizedPool<java.nio.ByteBuffer> r10 = r8.f36276a
            r10.release(r12)
            throw r9
        L_0x00dd:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "BitmapPool.get returned null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p722i.C13655b.m40269a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, boolean):com.facebook.common.references.a");
    }

    public C13326a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C13647e eVar, Config config, Rect rect, int i, boolean z) {
        InputStream inputStream;
        boolean z2;
        boolean a = eVar.mo33270a(i);
        Options a2 = m40268a(eVar, config);
        InputStream c = eVar.mo33274c();
        C13307g.m38940a(c);
        if (eVar.mo33281i() > i) {
            c = new C13291a(c, i);
        }
        if (!a) {
            inputStream = new C13292b(c, f36275d);
        } else {
            inputStream = c;
        }
        if (a2.inPreferredConfig != Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return m40269a(inputStream, a2, rect, z);
        } catch (RuntimeException e) {
            if (z2) {
                return decodeJPEGFromEncodedImageWithColorSpace(eVar, Config.ARGB_8888, rect, i, z);
            }
            throw e;
        }
    }
}
