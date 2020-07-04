package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.common.internal.C13307g;
import com.facebook.common.references.C13326a;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.animated.base.f */
public final class C13543f {

    /* renamed from: a */
    public final C13541d f35911a;

    /* renamed from: b */
    public final int f35912b;

    /* renamed from: c */
    private C13326a<Bitmap> f35913c;

    /* renamed from: d */
    private List<C13326a<Bitmap>> f35914d;

    /* renamed from: a */
    public final synchronized C13326a<Bitmap> mo33082a() {
        return C13326a.m39000b(this.f35913c);
    }

    /* renamed from: b */
    public final synchronized void mo33084b() {
        C13326a.m39001c(this.f35913c);
        this.f35913c = null;
        C13326a.m38998a((Iterable<? extends C13326a<?>>) this.f35914d);
        this.f35914d = null;
    }

    /* renamed from: c */
    public final synchronized int mo33086c() {
        if (this.f35914d == null) {
            return 0;
        }
        return this.f35914d.size();
    }

    /* renamed from: a */
    public static C13543f m39845a(C13541d dVar) {
        return new C13543f(dVar);
    }

    /* renamed from: b */
    public static C13544g m39846b(C13541d dVar) {
        return new C13544g(dVar);
    }

    private C13543f(C13541d dVar) {
        this.f35911a = (C13541d) C13307g.m38940a(dVar);
        this.f35912b = 0;
    }

    C13543f(C13544g gVar) {
        this.f35911a = (C13541d) C13307g.m38940a(gVar.f35915a);
        this.f35912b = gVar.f35916b;
        this.f35913c = gVar.mo33087a();
        this.f35914d = gVar.mo33091b();
    }

    /* renamed from: a */
    public final synchronized C13326a<Bitmap> mo33083a(int i) {
        if (this.f35914d == null) {
            return null;
        }
        return C13326a.m39000b((C13326a) this.f35914d.get(i));
    }

    /* renamed from: b */
    public final synchronized boolean mo33085b(int i) {
        boolean z;
        if (this.f35914d == null || this.f35914d.get(i) == null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }
}
