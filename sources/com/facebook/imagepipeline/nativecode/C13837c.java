package com.facebook.imagepipeline.nativecode;

import com.facebook.imageformat.C13508b;
import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.p726m.C13789b;
import com.facebook.imagepipeline.p726m.C13790c;

/* renamed from: com.facebook.imagepipeline.nativecode.c */
public final class C13837c implements C13790c {

    /* renamed from: a */
    private final int f36686a;

    /* renamed from: b */
    private final boolean f36687b;

    public C13837c(int i, boolean z) {
        this.f36686a = i;
        this.f36687b = z;
    }

    /* renamed from: a */
    public final C13789b mo33388a(C13509c cVar, boolean z) {
        if (cVar != C13508b.f35825a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f36686a, this.f36687b);
    }
}
