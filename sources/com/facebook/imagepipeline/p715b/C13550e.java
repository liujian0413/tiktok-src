package com.facebook.imagepipeline.p715b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.imageformat.C13508b;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p722i.C13659f;

/* renamed from: com.facebook.imagepipeline.b.e */
public class C13550e extends C13551f {

    /* renamed from: a */
    private static final String f35925a = "e";

    /* renamed from: b */
    private final C13547b f35926b;

    /* renamed from: c */
    private final C13659f f35927c;

    /* renamed from: d */
    private boolean f35928d;

    public C13550e(C13547b bVar, C13659f fVar) {
        this.f35926b = bVar;
        this.f35927c = fVar;
    }

    /* renamed from: c */
    private static C13326a<Bitmap> m39865c(int i, int i2, Config config) {
        return C13326a.m38996a(Bitmap.createBitmap(i, i2, config), C13553g.m39883a());
    }

    /* renamed from: a */
    public final C13326a<Bitmap> mo33093a(int i, int i2, Config config) {
        C13647e eVar;
        if (this.f35928d) {
            return m39865c(i, i2, config);
        }
        C13326a a = this.f35926b.mo33094a((short) i, (short) i2);
        try {
            eVar = new C13647e(a);
            eVar.f36258a = C13508b.f35825a;
            C13326a<Bitmap> decodeJPEGFromEncodedImage = this.f35927c.decodeJPEGFromEncodedImage(eVar, config, null, ((PooledByteBuffer) a.mo32609a()).mo32575a());
            if (!((Bitmap) decodeJPEGFromEncodedImage.mo32609a()).isMutable()) {
                C13326a.m39001c(decodeJPEGFromEncodedImage);
                this.f35928d = true;
                C13286a.m38866e(f35925a, "Immutable bitmap returned by decoder");
                C13326a<Bitmap> c = m39865c(i, i2, config);
                C13647e.m40237d(eVar);
                a.close();
                return c;
            }
            ((Bitmap) decodeJPEGFromEncodedImage.mo32609a()).setHasAlpha(true);
            ((Bitmap) decodeJPEGFromEncodedImage.mo32609a()).eraseColor(0);
            C13647e.m40237d(eVar);
            a.close();
            return decodeJPEGFromEncodedImage;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
