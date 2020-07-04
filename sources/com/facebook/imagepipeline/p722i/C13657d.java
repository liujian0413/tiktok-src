package com.facebook.imagepipeline.p722i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.memory.C13820o;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

/* renamed from: com.facebook.imagepipeline.i.d */
public final class C13657d extends DalvikPurgeableDecoder {

    /* renamed from: a */
    private final C13820o f36280a;

    public C13657d(C13820o oVar) {
        this.f36280a = oVar;
    }

    /* renamed from: a */
    private static void m40275a(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    public final Bitmap decodeByteArrayAsPurgeable(C13326a<PooledByteBuffer> aVar, Options options) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) aVar.mo32609a();
        int a = pooledByteBuffer.mo32575a();
        C13326a a2 = this.f36280a.mo33447a(a);
        try {
            byte[] bArr = (byte[]) a2.mo32609a();
            pooledByteBuffer.mo32576a(0, bArr, 0, a);
            return (Bitmap) C13307g.m38941a(BitmapFactory.decodeByteArray(bArr, 0, a, options), (Object) "BitmapFactory returned null");
        } finally {
            C13326a.m39001c(a2);
        }
    }

    public final Bitmap decodeJPEGByteArrayAsPurgeable(C13326a<PooledByteBuffer> aVar, int i, Options options) {
        byte[] bArr;
        boolean z;
        if (endsWithEOI(aVar, i)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) aVar.mo32609a();
        if (i <= pooledByteBuffer.mo32575a()) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        int i2 = i + 2;
        C13326a a = this.f36280a.mo33447a(i2);
        try {
            byte[] bArr2 = (byte[]) a.mo32609a();
            pooledByteBuffer.mo32576a(0, bArr2, 0, i);
            if (bArr != null) {
                m40275a(bArr2, i);
                i = i2;
            }
            return (Bitmap) C13307g.m38941a(BitmapFactory.decodeByteArray(bArr2, 0, i, options), (Object) "BitmapFactory returned null");
        } finally {
            C13326a.m39001c(a);
        }
    }
}
