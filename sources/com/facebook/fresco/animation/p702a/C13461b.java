package com.facebook.fresco.animation.p702a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.p702a.C13460a;

/* renamed from: com.facebook.fresco.animation.a.b */
public class C13461b<T extends C13460a> implements C13460a {

    /* renamed from: a */
    public T f35693a;

    /* renamed from: b */
    private int f35694b = -1;

    /* renamed from: c */
    private ColorFilter f35695c;

    /* renamed from: d */
    private Rect f35696d;

    /* renamed from: a */
    public final int mo32986a() {
        if (this.f35693a == null) {
            return -1;
        }
        return this.f35693a.mo32986a();
    }

    /* renamed from: b */
    public final int mo32991b() {
        if (this.f35693a == null) {
            return -1;
        }
        return this.f35693a.mo32991b();
    }

    /* renamed from: d */
    public final int mo32995d() {
        if (this.f35693a == null) {
            return 0;
        }
        return this.f35693a.mo32995d();
    }

    /* renamed from: e */
    public int mo32996e() {
        if (this.f35693a == null) {
            return 0;
        }
        return this.f35693a.mo32996e();
    }

    /* renamed from: c */
    public final void mo32993c() {
        if (this.f35693a != null) {
            this.f35693a.mo32993c();
        }
    }

    public C13461b(T t) {
        this.f35693a = t;
    }

    /* renamed from: c */
    public final int mo32994c(int i) {
        if (this.f35693a == null) {
            return 0;
        }
        return this.f35693a.mo32994c(i);
    }

    /* renamed from: a */
    public final void mo32987a(int i) {
        if (this.f35693a != null) {
            this.f35693a.mo32987a(i);
        }
        this.f35694b = i;
    }

    /* renamed from: b */
    public final boolean mo32992b(int i) {
        if (this.f35693a != null) {
            return this.f35693a.mo32992b(i);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo32988a(ColorFilter colorFilter) {
        if (this.f35693a != null) {
            this.f35693a.mo32988a(colorFilter);
        }
        this.f35695c = colorFilter;
    }

    /* renamed from: a */
    public final void mo32989a(Rect rect) {
        if (this.f35693a != null) {
            this.f35693a.mo32989a(rect);
        }
        this.f35696d = rect;
    }

    /* renamed from: a */
    public boolean mo32990a(Drawable drawable, Canvas canvas, int i) {
        if (this.f35693a == null || !this.f35693a.mo32990a(drawable, canvas, i)) {
            return false;
        }
        return true;
    }
}
