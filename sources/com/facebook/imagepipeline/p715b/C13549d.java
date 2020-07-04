package com.facebook.imagepipeline.p715b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p689f.C13293a;
import com.facebook.common.references.C13326a;
import com.facebook.imageformat.C13508b;
import com.facebook.imagepipeline.memory.C13802ac;
import com.facebook.imagepipeline.memory.C13820o;
import com.facebook.imagepipeline.p720g.C13647e;

/* renamed from: com.facebook.imagepipeline.b.d */
public final class C13549d implements C13293a {

    /* renamed from: a */
    private final C13547b f35923a;

    /* renamed from: b */
    private final C13820o f35924b;

    public C13549d(C13802ac acVar) {
        this.f35924b = acVar.mo33429b();
        this.f35923a = new C13547b(acVar.mo33431d());
    }

    /* renamed from: a */
    private static Options m39864a(int i, Config config) {
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

    public final Bitmap createNakedBitmap(int i, int i2, Config config) {
        C13647e eVar;
        Options a;
        int a2;
        PooledByteBuffer pooledByteBuffer;
        C13326a a3;
        C13326a a4 = this.f35923a.mo33094a((short) i, (short) i2);
        C13326a aVar = null;
        try {
            eVar = new C13647e(a4);
            try {
                eVar.f36258a = C13508b.f35825a;
                a = m39864a(eVar.f36263f, config);
                a2 = ((PooledByteBuffer) a4.mo32609a()).mo32575a();
                pooledByteBuffer = (PooledByteBuffer) a4.mo32609a();
                a3 = this.f35924b.mo33447a(a2 + 2);
            } catch (Throwable th) {
                th = th;
                C13326a.m39001c(aVar);
                C13647e.m40237d(eVar);
                C13326a.m39001c(a4);
                throw th;
            }
            try {
                byte[] bArr = (byte[]) a3.mo32609a();
                pooledByteBuffer.mo32576a(0, bArr, 0, a2);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, a2, a);
                decodeByteArray.setHasAlpha(true);
                decodeByteArray.eraseColor(0);
                C13326a.m39001c(a3);
                C13647e.m40237d(eVar);
                C13326a.m39001c(a4);
                return decodeByteArray;
            } catch (Throwable th2) {
                th = th2;
                aVar = a3;
                C13326a.m39001c(aVar);
                C13647e.m40237d(eVar);
                C13326a.m39001c(a4);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            eVar = null;
            C13326a.m39001c(aVar);
            C13647e.m40237d(eVar);
            C13326a.m39001c(a4);
            throw th;
        }
    }
}
