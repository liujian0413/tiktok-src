package com.facebook.fresco.animation.p703b.p706c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.fresco.animation.p703b.C13470b;
import com.facebook.fresco.animation.p703b.C13476c;
import com.facebook.imagepipeline.animated.base.C13538a;
import com.facebook.imagepipeline.animated.p713b.C13534d;
import com.facebook.imagepipeline.animated.p713b.C13534d.C13536a;

/* renamed from: com.facebook.fresco.animation.b.c.b */
public class C13478b implements C13476c {

    /* renamed from: b */
    private static final Class<?> f35740b = C13478b.class;

    /* renamed from: a */
    public final C13470b f35741a;

    /* renamed from: c */
    private C13538a f35742c;

    /* renamed from: d */
    private C13534d f35743d;

    /* renamed from: e */
    private final C13536a f35744e = new C13536a() {
        /* renamed from: a */
        public final C13326a<Bitmap> mo33014a(int i) {
            return C13478b.this.f35741a.mo33001a(i);
        }
    };

    /* renamed from: a */
    public final int mo33010a() {
        return this.f35742c.mo33066c();
    }

    /* renamed from: b */
    public final int mo33013b() {
        return this.f35742c.mo33067d();
    }

    /* renamed from: a */
    public final void mo33011a(Rect rect) {
        C13538a a = this.f35742c.mo33062a(rect);
        if (a != this.f35742c) {
            this.f35742c = a;
            this.f35743d = new C13534d(this.f35742c, this.f35744e);
        }
    }

    public C13478b(C13470b bVar, C13538a aVar) {
        this.f35741a = bVar;
        this.f35742c = aVar;
        this.f35743d = new C13534d(this.f35742c, this.f35744e);
    }

    /* renamed from: a */
    public final boolean mo33012a(int i, Bitmap bitmap) {
        try {
            this.f35743d.mo33077a(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            C13286a.m38852b(f35740b, (Throwable) e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }
}
