package com.facebook.imagepipeline.p715b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.C13307g;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.memory.C13806c;
import com.facebook.imageutils.C13844a;

/* renamed from: com.facebook.imagepipeline.b.a */
public final class C13546a extends C13551f {

    /* renamed from: a */
    private final C13806c f35919a;

    public C13546a(C13806c cVar) {
        this.f35919a = cVar;
    }

    /* renamed from: a */
    public final C13326a<Bitmap> mo33093a(int i, int i2, Config config) {
        boolean z;
        Bitmap bitmap = (Bitmap) this.f35919a.mo32581a(C13844a.m40884a(i, i2, config));
        if (bitmap.getAllocationByteCount() >= i * i2 * C13844a.m40885a(config)) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        bitmap.reconfigure(i, i2, config);
        return C13326a.m38996a(bitmap, this.f35919a);
    }
}
