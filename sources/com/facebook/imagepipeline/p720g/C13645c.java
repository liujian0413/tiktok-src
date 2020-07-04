package com.facebook.imagepipeline.p720g;

import com.facebook.common.p686c.C13286a;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.g.c */
public abstract class C13645c implements C13648f, Closeable {
    /* renamed from: a */
    public abstract boolean mo33258a();

    /* renamed from: b */
    public abstract int mo33259b();

    /* renamed from: c */
    public boolean mo33260c() {
        return false;
    }

    public abstract void close();

    /* renamed from: e */
    public C13650h mo33266e() {
        return C13649g.f36269a;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!mo33258a()) {
            C13286a.m38855b("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
