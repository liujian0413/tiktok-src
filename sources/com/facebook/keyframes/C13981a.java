package com.facebook.keyframes;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: com.facebook.keyframes.a */
public final class C13981a {

    /* renamed from: a */
    public final Path f36969a;

    /* renamed from: b */
    public final float[] f36970b;

    /* renamed from: b */
    public final boolean mo33645b() {
        return this.f36969a.isEmpty();
    }

    /* renamed from: a */
    public final void mo33637a() {
        this.f36969a.reset();
        m41293e(0.0f, 0.0f);
    }

    public C13981a() {
        this(new Path(), new float[]{0.0f, 0.0f});
    }

    /* renamed from: a */
    public final void mo33641a(Matrix matrix) {
        this.f36969a.transform(matrix);
        matrix.mapPoints(this.f36970b);
    }

    private C13981a(Path path, float[] fArr) {
        this.f36969a = path;
        this.f36970b = fArr;
    }

    /* renamed from: e */
    private void m41293e(float f, float f2) {
        this.f36970b[0] = f;
        this.f36970b[1] = f2;
    }

    /* renamed from: b */
    public final void mo33642b(float f, float f2) {
        this.f36969a.rMoveTo(f, f2);
        m41294f(f, f2);
    }

    /* renamed from: c */
    public final void mo33646c(float f, float f2) {
        this.f36969a.lineTo(f, f2);
        m41293e(f, f2);
    }

    /* renamed from: d */
    public final void mo33647d(float f, float f2) {
        this.f36969a.rLineTo(f, f2);
        m41294f(f, f2);
    }

    /* renamed from: f */
    private void m41294f(float f, float f2) {
        float[] fArr = this.f36970b;
        fArr[0] = fArr[0] + f;
        float[] fArr2 = this.f36970b;
        fArr2[1] = fArr2[1] + f2;
    }

    /* renamed from: a */
    public final void mo33638a(float f, float f2) {
        this.f36969a.moveTo(f, f2);
        m41293e(f, f2);
    }

    /* renamed from: b */
    public final void mo33643b(float f, float f2, float f3, float f4) {
        this.f36969a.rQuadTo(f, f2, f3, f4);
        m41294f(f3, f4);
    }

    /* renamed from: a */
    public final void mo33639a(float f, float f2, float f3, float f4) {
        this.f36969a.quadTo(f, f2, f3, f4);
        m41293e(f3, f4);
    }

    /* renamed from: b */
    public final void mo33644b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f36969a.rCubicTo(f, f2, f3, f4, f5, f6);
        m41294f(f5, f6);
    }

    /* renamed from: a */
    public final void mo33640a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f36969a.cubicTo(f, f2, f3, f4, f5, f6);
        m41293e(f5, f6);
    }
}
