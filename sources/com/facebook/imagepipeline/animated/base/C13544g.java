package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.common.references.C13326a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.animated.base.g */
public final class C13544g {

    /* renamed from: a */
    public final C13541d f35915a;

    /* renamed from: b */
    public int f35916b;

    /* renamed from: c */
    private C13326a<Bitmap> f35917c;

    /* renamed from: d */
    private List<C13326a<Bitmap>> f35918d;

    /* renamed from: a */
    public final C13326a<Bitmap> mo33087a() {
        return C13326a.m39000b(this.f35917c);
    }

    /* renamed from: b */
    public final List<C13326a<Bitmap>> mo33091b() {
        return C13326a.m38997a((Collection<C13326a<T>>) this.f35918d);
    }

    /* renamed from: c */
    public final C13543f mo33092c() {
        try {
            return new C13543f(this);
        } finally {
            C13326a.m39001c(this.f35917c);
            this.f35917c = null;
            C13326a.m38998a((Iterable<? extends C13326a<?>>) this.f35918d);
            this.f35918d = null;
        }
    }

    /* renamed from: a */
    public final C13544g mo33088a(int i) {
        this.f35916b = i;
        return this;
    }

    C13544g(C13541d dVar) {
        this.f35915a = dVar;
    }

    /* renamed from: a */
    public final C13544g mo33089a(C13326a<Bitmap> aVar) {
        this.f35917c = C13326a.m39000b(aVar);
        return this;
    }

    /* renamed from: a */
    public final C13544g mo33090a(List<C13326a<Bitmap>> list) {
        this.f35918d = C13326a.m38997a((Collection<C13326a<T>>) list);
        return this;
    }
}
