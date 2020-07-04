package com.facebook.imagepipeline.p720g;

import com.facebook.imagepipeline.animated.base.C13543f;
import com.facebook.imagepipeline.common.C13594b;

/* renamed from: com.facebook.imagepipeline.g.a */
public final class C13643a extends C13645c {

    /* renamed from: a */
    public final C13594b f36251a;

    /* renamed from: b */
    private C13543f f36252b;

    /* renamed from: c */
    public final boolean mo33260c() {
        return true;
    }

    /* renamed from: d */
    public final synchronized C13543f mo33262d() {
        return this.f36252b;
    }

    /* renamed from: a */
    public final synchronized boolean mo33258a() {
        boolean z;
        if (this.f36252b == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized int mo33259b() {
        if (mo33258a()) {
            return 0;
        }
        return this.f36252b.f35911a.getSizeInBytes();
    }

    public final void close() {
        synchronized (this) {
            if (this.f36252b != null) {
                C13543f fVar = this.f36252b;
                this.f36252b = null;
                fVar.mo33084b();
            }
        }
    }

    public final synchronized int getHeight() {
        if (mo33258a()) {
            return 0;
        }
        return this.f36252b.f35911a.getHeight();
    }

    public final synchronized int getWidth() {
        if (mo33258a()) {
            return 0;
        }
        return this.f36252b.f35911a.getWidth();
    }

    public C13643a(C13543f fVar, C13594b bVar) {
        this.f36252b = fVar;
        this.f36251a = bVar;
    }
}
