package com.facebook.fresco.animation.p703b.p704a;

import android.graphics.Bitmap;
import com.facebook.common.references.C13326a;
import com.facebook.fresco.animation.p703b.C13470b;

/* renamed from: com.facebook.fresco.animation.b.a.b */
public final class C13468b implements C13470b {

    /* renamed from: a */
    private int f35724a = -1;

    /* renamed from: b */
    private C13326a<Bitmap> f35725b;

    /* renamed from: b */
    public final void mo33006b(int i, C13326a<Bitmap> aVar, int i2) {
    }

    /* renamed from: a */
    public final synchronized void mo33003a() {
        m39610b();
    }

    /* renamed from: b */
    private synchronized void m39610b() {
        C13326a.m39001c(this.f35725b);
        this.f35725b = null;
        this.f35724a = -1;
    }

    /* renamed from: b */
    public final synchronized C13326a<Bitmap> mo33005b(int i) {
        return C13326a.m39000b(this.f35725b);
    }

    /* renamed from: a */
    public final synchronized C13326a<Bitmap> mo33001a(int i) {
        if (this.f35724a != i) {
            return null;
        }
        return C13326a.m39000b(this.f35725b);
    }

    /* renamed from: c */
    public final synchronized boolean mo33007c(int i) {
        boolean z;
        if (i != this.f35724a || !C13326a.m38999a(this.f35725b)) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized C13326a<Bitmap> mo33002a(int i, int i2, int i3) {
        C13326a<Bitmap> b;
        try {
            b = C13326a.m39000b(this.f35725b);
            m39610b();
        } catch (Throwable th) {
            m39610b();
            throw th;
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized void mo33004a(int i, C13326a<Bitmap> aVar, int i2) {
        if (aVar != null) {
            if (this.f35725b != null && ((Bitmap) aVar.mo32609a()).equals(this.f35725b.mo32609a())) {
                return;
            }
        }
        C13326a.m39001c(this.f35725b);
        this.f35725b = C13326a.m39000b(aVar);
        this.f35724a = i;
    }
}
