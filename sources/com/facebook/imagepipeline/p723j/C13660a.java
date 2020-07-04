package com.facebook.imagepipeline.p723j;

import android.graphics.Bitmap;
import com.C1642a;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13270f;
import com.facebook.common.internal.C13307g;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.C13841a;

/* renamed from: com.facebook.imagepipeline.j.a */
public final class C13660a extends C13841a {

    /* renamed from: a */
    private final int f36281a;

    /* renamed from: b */
    private final int f36282b;

    /* renamed from: c */
    private C13265a f36283c;

    public final C13265a getPostprocessorCacheKey() {
        if (this.f36283c == null) {
            this.f36283c = new C13270f(C1642a.m8035a(null, "i%dr%d", new Object[]{Integer.valueOf(this.f36281a), Integer.valueOf(this.f36282b)}));
        }
        return this.f36283c;
    }

    public C13660a(int i) {
        this(3, i);
    }

    public final void process(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.f36281a, this.f36282b);
    }

    private C13660a(int i, int i2) {
        boolean z = true;
        C13307g.m38943a(true);
        if (i2 <= 0) {
            z = false;
        }
        C13307g.m38943a(z);
        this.f36281a = 3;
        this.f36282b = i2;
    }
}
