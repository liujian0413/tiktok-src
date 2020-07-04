package com.facebook.imagepipeline.p722i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.MemoryFile;
import com.facebook.common.internal.C13299a;
import com.facebook.common.internal.C13300b;
import com.facebook.common.internal.C13315l;
import com.facebook.common.memory.C13323h;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p688e.C13291a;
import com.facebook.common.p689f.C13294b;
import com.facebook.common.p689f.C13296c;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

/* renamed from: com.facebook.imagepipeline.i.c */
public final class C13656c extends DalvikPurgeableDecoder {

    /* renamed from: a */
    private static Method f36278a;

    /* renamed from: b */
    private final C13294b f36279b = C13296c.m38897a();

    /* renamed from: a */
    private synchronized Method m40274a() {
        if (f36278a == null) {
            try {
                f36278a = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                throw C13315l.m38962b(e);
            }
        }
        return f36278a;
    }

    /* renamed from: a */
    private FileDescriptor m40273a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) m40274a().invoke(memoryFile, new Object[0]);
        } catch (Exception e) {
            throw C13315l.m38962b(e);
        }
    }

    public final Bitmap decodeByteArrayAsPurgeable(C13326a<PooledByteBuffer> aVar, Options options) {
        return m40271a(aVar, ((PooledByteBuffer) aVar.mo32609a()).mo32575a(), null, options);
    }

    public final Bitmap decodeJPEGByteArrayAsPurgeable(C13326a<PooledByteBuffer> aVar, int i, Options options) {
        byte[] bArr;
        if (endsWithEOI(aVar, i)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        return m40271a(aVar, i, bArr, options);
    }

    /* renamed from: a */
    private static MemoryFile m40272a(C13326a<PooledByteBuffer> aVar, int i, byte[] bArr) throws IOException {
        int i2;
        OutputStream outputStream;
        InputStream inputStream;
        C13291a aVar2;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        InputStream inputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, i2 + i);
        memoryFile.allowPurging(false);
        try {
            inputStream = new C13323h((PooledByteBuffer) aVar.mo32609a());
            try {
                aVar2 = new C13291a(inputStream, i);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                C13326a.m39001c(aVar);
                C13300b.m38927a(inputStream);
                C13300b.m38927a(inputStream2);
                C13300b.m38926a(outputStream, true);
                throw th;
            }
            try {
                outputStream = memoryFile.getOutputStream();
                try {
                    C13299a.m38925a(aVar2, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    C13326a.m39001c(aVar);
                    C13300b.m38927a(inputStream);
                    C13300b.m38927a(aVar2);
                    C13300b.m38926a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = aVar2;
                    C13326a.m39001c(aVar);
                    C13300b.m38927a(inputStream);
                    C13300b.m38927a(inputStream2);
                    C13300b.m38926a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                inputStream2 = aVar2;
                C13326a.m39001c(aVar);
                C13300b.m38927a(inputStream);
                C13300b.m38927a(inputStream2);
                C13300b.m38926a(outputStream, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            outputStream = null;
            C13326a.m39001c(aVar);
            C13300b.m38927a(inputStream);
            C13300b.m38927a(inputStream2);
            C13300b.m38926a(outputStream, true);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m40271a(com.facebook.common.references.C13326a<com.facebook.common.memory.PooledByteBuffer> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = m40272a(r2, r3, r4)     // Catch:{ IOException -> 0x002f }
            java.io.FileDescriptor r3 = r1.m40273a(r2)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            com.facebook.common.f.b r4 = r1.f36279b     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            com.facebook.common.f.b r4 = r1.f36279b     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            android.graphics.Bitmap r3 = r4.decodeFileDescriptor(r3, r0, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            java.lang.String r4 = "BitmapFactory returned null"
            java.lang.Object r3 = com.facebook.common.internal.C13307g.m38941a(r3, r4)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            r2.close()
            return r3
        L_0x001f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            throw r3     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
        L_0x0027:
            r3 = move-exception
            goto L_0x0035
        L_0x0029:
            r3 = move-exception
            r0 = r2
            goto L_0x0030
        L_0x002c:
            r3 = move-exception
            r2 = r0
            goto L_0x0035
        L_0x002f:
            r3 = move-exception
        L_0x0030:
            java.lang.RuntimeException r2 = com.facebook.common.internal.C13315l.m38962b(r3)     // Catch:{ all -> 0x002c }
            throw r2     // Catch:{ all -> 0x002c }
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p722i.C13656c.m40271a(com.facebook.common.references.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
