package com.p280ss.android.ugc.aweme.shortvideo.p1571f;

import android.graphics.Bitmap;
import com.facebook.common.references.C13326a;
import com.facebook.common.references.C13329c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.p715b.C13553g;
import com.facebook.imagepipeline.p716c.C13577j;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13649g;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f.i */
public final class C39850i {
    /* renamed from: a */
    public static C13326a<C13645c> m127559a(Bitmap bitmap) {
        return C13326a.m38995a(new C13646d(bitmap, (C13329c<Bitmap>) C13553g.m39883a(), C13649g.f36269a, 0));
    }

    /* renamed from: a */
    public static void m127560a(C13326a<C13645c> aVar, String str) {
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        C13380c.m39171b().mo33205b().mo33129a(C13577j.m39966a().mo33114a(ImageRequest.fromUri(sb.toString()), null), aVar);
    }
}
