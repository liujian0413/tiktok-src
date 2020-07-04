package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import com.bytedance.lighten.core.C12117d;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.request.C13841a;

/* renamed from: com.bytedance.lighten.loader.d */
final class C12150d extends C13841a {

    /* renamed from: a */
    private C12117d f32376a;

    C12150d(C12117d dVar) {
        this.f32376a = dVar;
    }

    public final C13326a<Bitmap> process(Bitmap bitmap, C13551f fVar) {
        return C13326a.m39000b(fVar.mo33097a(bitmap, this.f32376a.f32197a, this.f32376a.f32198b, this.f32376a.f32199c, this.f32376a.f32200d));
    }
}
