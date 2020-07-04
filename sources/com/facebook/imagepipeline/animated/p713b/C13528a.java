package com.facebook.imagepipeline.animated.p713b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.C13538a;
import com.facebook.imagepipeline.animated.base.C13541d;
import com.facebook.imagepipeline.animated.base.C13542e;
import com.facebook.imagepipeline.animated.base.C13543f;
import com.facebook.imagepipeline.animated.p714c.C13545a;

/* renamed from: com.facebook.imagepipeline.animated.b.a */
public final class C13528a implements C13538a {

    /* renamed from: a */
    public int f35864a = 2;

    /* renamed from: b */
    private final C13545a f35865b;

    /* renamed from: c */
    private final C13543f f35866c;

    /* renamed from: d */
    private final C13541d f35867d;

    /* renamed from: e */
    private final Rect f35868e;

    /* renamed from: f */
    private final int[] f35869f;

    /* renamed from: g */
    private final int[] f35870g;

    /* renamed from: h */
    private final int f35871h;

    /* renamed from: i */
    private final AnimatedDrawableFrameInfo[] f35872i;

    /* renamed from: j */
    private final Rect f35873j = new Rect();

    /* renamed from: k */
    private final Rect f35874k = new Rect();

    /* renamed from: l */
    private Bitmap f35875l;

    /* renamed from: m */
    private boolean f35876m;

    /* renamed from: a */
    public final int mo33060a() {
        return this.f35867d.getFrameCount();
    }

    /* renamed from: b */
    public final int mo33064b() {
        return this.f35867d.getLoopCount();
    }

    /* renamed from: c */
    public final int mo33066c() {
        return this.f35867d.getWidth();
    }

    /* renamed from: d */
    public final int mo33067d() {
        return this.f35867d.getHeight();
    }

    /* renamed from: e */
    public final int mo33068e() {
        return this.f35868e.width();
    }

    /* renamed from: f */
    public final int mo33069f() {
        return this.f35868e.height();
    }

    /* renamed from: g */
    private synchronized void m39791g() {
        if (this.f35875l != null) {
            if (!this.f35876m) {
                this.f35875l.recycle();
            }
            this.f35875l = null;
        }
    }

    /* renamed from: a */
    public final AnimatedDrawableFrameInfo mo33061a(int i) {
        return this.f35872i[i];
    }

    /* renamed from: b */
    public final int mo33065b(int i) {
        return this.f35869f[i];
    }

    /* renamed from: a */
    public final C13538a mo33062a(Rect rect) {
        if (m39786a(this.f35867d, rect).equals(this.f35868e)) {
            return this;
        }
        return new C13528a(this.f35865b, this.f35866c, rect);
    }

    /* renamed from: a */
    private static Rect m39786a(C13541d dVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, dVar.getWidth(), dVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), dVar.getWidth()), Math.min(rect.height(), dVar.getHeight()));
    }

    /* renamed from: b */
    private void m39790b(Canvas canvas, C13542e eVar) {
        int b = eVar.mo32253b();
        int c = eVar.mo32254c();
        int d = eVar.mo32255d();
        int e = eVar.mo32256e();
        synchronized (this) {
            m39788a(b, c);
            synchronized (this.f35875l) {
                this.f35875l.eraseColor(0);
                try {
                    eVar.mo32252a(b, c, this.f35875l);
                    this.f35873j.set(0, 0, b, c);
                    this.f35874k.set(0, 0, b, c);
                    canvas.save();
                    canvas.translate((float) d, (float) e);
                    canvas.drawBitmap(this.f35875l, this.f35873j, this.f35874k, null);
                    canvas.restore();
                } catch (IllegalStateException e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e2.getMessage());
                    sb.append(m39787a(this.f35875l, b, c, null, this.f35864a));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m39788a(int r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.graphics.Bitmap r0 = r3.f35875l     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0018
            android.graphics.Bitmap r0 = r3.f35875l     // Catch:{ all -> 0x0041 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x0041 }
            if (r0 < r4) goto L_0x0015
            android.graphics.Bitmap r0 = r3.f35875l     // Catch:{ all -> 0x0041 }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x0041 }
            if (r0 >= r5) goto L_0x0018
        L_0x0015:
            r3.m39791g()     // Catch:{ all -> 0x0041 }
        L_0x0018:
            android.graphics.Bitmap r0 = r3.f35875l     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003f
            com.facebook.imagepipeline.animated.a.f r0 = com.facebook.imagepipeline.animated.p712a.C13520b.m39769a()     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 == 0) goto L_0x002b
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0041 }
            int r2 = r3.f35864a     // Catch:{ all -> 0x0041 }
            android.graphics.Bitmap r1 = r0.mo33059a(r4, r5, r1, r2)     // Catch:{ all -> 0x0041 }
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            r3.f35875l = r1     // Catch:{ all -> 0x0041 }
            r4 = 1
            r3.f35876m = r4     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return
        L_0x0034:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0041 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r0)     // Catch:{ all -> 0x0041 }
            r3.f35875l = r4     // Catch:{ all -> 0x0041 }
            r4 = 0
            r3.f35876m = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.animated.p713b.C13528a.m39788a(int, int):void");
    }

    /* renamed from: a */
    private void m39789a(Canvas canvas, C13542e eVar) {
        double width = (double) this.f35868e.width();
        double width2 = (double) this.f35867d.getWidth();
        Double.isNaN(width);
        Double.isNaN(width2);
        double d = width / width2;
        double height = (double) this.f35868e.height();
        double height2 = (double) this.f35867d.getHeight();
        Double.isNaN(height);
        Double.isNaN(height2);
        double d2 = height / height2;
        double b = (double) eVar.mo32253b();
        Double.isNaN(b);
        int round = (int) Math.round(b * d);
        double c = (double) eVar.mo32254c();
        Double.isNaN(c);
        int round2 = (int) Math.round(c * d2);
        double d3 = (double) eVar.mo32255d();
        Double.isNaN(d3);
        int i = (int) (d3 * d);
        double e = (double) eVar.mo32256e();
        Double.isNaN(e);
        int i2 = (int) (e * d2);
        synchronized (this) {
            int width3 = this.f35868e.width();
            int height3 = this.f35868e.height();
            m39788a(width3, height3);
            synchronized (this.f35875l) {
                this.f35875l.eraseColor(0);
                try {
                    eVar.mo32252a(round, round2, this.f35875l);
                    this.f35873j.set(0, 0, width3, height3);
                    this.f35874k.set(i, i2, width3 + i, height3 + i2);
                    canvas.drawBitmap(this.f35875l, this.f35873j, this.f35874k, null);
                } catch (IllegalStateException e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e2.getMessage());
                    sb.append(m39787a(this.f35875l, round, round2, this.f35868e, this.f35864a));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo33063a(int i, Canvas canvas) {
        C13542e frame = this.f35867d.getFrame(i);
        try {
            if (this.f35867d.doesRenderSupportScaling()) {
                m39789a(canvas, frame);
            } else {
                m39790b(canvas, frame);
            }
        } finally {
            frame.mo32251a();
        }
    }

    public C13528a(C13545a aVar, C13543f fVar, Rect rect) {
        this.f35865b = aVar;
        this.f35866c = fVar;
        this.f35867d = fVar.f35911a;
        this.f35869f = this.f35867d.getFrameDurations();
        C13545a.m39858a(this.f35869f);
        this.f35871h = C13545a.m39859b(this.f35869f);
        this.f35870g = C13545a.m39860c(this.f35869f);
        this.f35868e = m39786a(this.f35867d, rect);
        this.f35872i = new AnimatedDrawableFrameInfo[this.f35867d.getFrameCount()];
        for (int i = 0; i < this.f35867d.getFrameCount(); i++) {
            this.f35872i[i] = this.f35867d.getFrameInfo(i);
        }
    }

    /* renamed from: a */
    private static String m39787a(Bitmap bitmap, int i, int i2, Rect rect, int i3) {
        StringBuilder sb = new StringBuilder(", mTempBitmap:");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append(", frame:");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        if (rect != null) {
            sb.append(", renderedBounds:");
            sb.append(rect.width());
            sb.append("x");
            sb.append(rect.height());
        }
        sb.append(", decodeType:");
        sb.append(i3);
        return sb.toString();
    }
}
