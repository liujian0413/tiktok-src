package android.support.p029v7.graphics.drawable;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.graphics.drawable.c */
public final class C1132c extends Drawable {

    /* renamed from: i */
    private static final float f4069i = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    public final Paint f4070a;

    /* renamed from: b */
    public float f4071b;

    /* renamed from: c */
    public float f4072c;

    /* renamed from: d */
    public float f4073d;

    /* renamed from: e */
    public float f4074e;

    /* renamed from: f */
    public boolean f4075f;

    /* renamed from: g */
    public float f4076g;

    /* renamed from: h */
    public int f4077h;

    /* renamed from: j */
    private final Path f4078j;

    /* renamed from: k */
    private final int f4079k;

    /* renamed from: l */
    private boolean f4080l;

    /* renamed from: m */
    private float f4081m;

    /* renamed from: a */
    private static float m5025a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public final int getIntrinsicHeight() {
        return this.f4079k;
    }

    public final int getIntrinsicWidth() {
        return this.f4079k;
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    public final void mo4525a(float f) {
        if (this.f4076g != f) {
            this.f4076g = f;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4070a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo4526a(boolean z) {
        if (this.f4080l != z) {
            this.f4080l = z;
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (i != this.f4070a.getAlpha()) {
            this.f4070a.setAlpha(i);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (android.support.p022v4.graphics.drawable.C0727a.m3118i(r19) == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (android.support.p022v4.graphics.drawable.C0727a.m3118i(r19) == 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.graphics.Rect r2 = r19.getBounds()
            int r3 = r0.f4077h
            r4 = 3
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x001a
            switch(r3) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            int r3 = android.support.p022v4.graphics.drawable.C0727a.m3118i(r19)
            if (r3 != r6) goto L_0x0021
        L_0x0018:
            r5 = 1
            goto L_0x0021
        L_0x001a:
            int r3 = android.support.p022v4.graphics.drawable.C0727a.m3118i(r19)
            if (r3 != 0) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            float r3 = r0.f4071b
            float r4 = r0.f4071b
            float r3 = r3 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.f4072c
            float r8 = r0.f4076g
            float r3 = m5025a(r7, r3, r8)
            float r7 = r0.f4072c
            float r8 = r0.f4073d
            float r9 = r0.f4076g
            float r7 = m5025a(r7, r8, r9)
            float r8 = r0.f4081m
            float r9 = r0.f4076g
            r10 = 0
            float r8 = m5025a(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = f4069i
            float r11 = r0.f4076g
            float r9 = m5025a(r10, r9, r11)
            if (r5 == 0) goto L_0x005d
            r11 = 0
            goto L_0x005f
        L_0x005d:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L_0x005f:
            r12 = 1127481344(0x43340000, float:180.0)
            if (r5 == 0) goto L_0x0066
            r13 = 1127481344(0x43340000, float:180.0)
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            float r14 = r0.f4076g
            float r11 = m5025a(r11, r13, r14)
            double r13 = (double) r3
            r15 = r11
            double r10 = (double) r9
            double r16 = java.lang.Math.cos(r10)
            java.lang.Double.isNaN(r13)
            double r16 = r16 * r13
            r18 = r5
            long r4 = java.lang.Math.round(r16)
            float r3 = (float) r4
            double r4 = java.lang.Math.sin(r10)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r4
            long r4 = java.lang.Math.round(r13)
            float r4 = (float) r4
            android.graphics.Path r5 = r0.f4078j
            r5.rewind()
            float r5 = r0.f4074e
            android.graphics.Paint r9 = r0.f4070a
            float r9 = r9.getStrokeWidth()
            float r5 = r5 + r9
            float r9 = r0.f4081m
            float r9 = -r9
            float r10 = r0.f4076g
            float r5 = m5025a(r5, r9, r10)
            float r9 = -r7
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            android.graphics.Path r11 = r0.f4078j
            float r13 = r9 + r8
            r14 = 0
            r11.moveTo(r13, r14)
            android.graphics.Path r11 = r0.f4078j
            float r8 = r8 * r10
            float r7 = r7 - r8
            r11.rLineTo(r7, r14)
            android.graphics.Path r7 = r0.f4078j
            r7.moveTo(r9, r5)
            android.graphics.Path r7 = r0.f4078j
            r7.rLineTo(r3, r4)
            android.graphics.Path r7 = r0.f4078j
            float r5 = -r5
            r7.moveTo(r9, r5)
            android.graphics.Path r5 = r0.f4078j
            float r4 = -r4
            r5.rLineTo(r3, r4)
            android.graphics.Path r3 = r0.f4078j
            r3.close()
            r20.save()
            android.graphics.Paint r3 = r0.f4070a
            float r3 = r3.getStrokeWidth()
            int r4 = r2.height()
            float r4 = (float) r4
            r5 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 * r3
            float r4 = r4 - r5
            float r5 = r0.f4074e
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r7
            float r4 = r4 - r5
            int r4 = (int) r4
            int r4 = r4 / 4
            int r4 = r4 * 2
            float r4 = (float) r4
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r5
            float r5 = r0.f4074e
            float r3 = r3 + r5
            float r4 = r4 + r3
            int r2 = r2.centerX()
            float r2 = (float) r2
            r1.translate(r2, r4)
            boolean r2 = r0.f4075f
            if (r2 == 0) goto L_0x0116
            boolean r2 = r0.f4080l
            r2 = r2 ^ r18
            if (r2 == 0) goto L_0x010f
            r6 = -1
        L_0x010f:
            float r2 = (float) r6
            float r11 = r15 * r2
            r1.rotate(r11)
            goto L_0x011b
        L_0x0116:
            if (r18 == 0) goto L_0x011b
            r1.rotate(r12)
        L_0x011b:
            android.graphics.Path r2 = r0.f4078j
            android.graphics.Paint r3 = r0.f4070a
            r1.drawPath(r2, r3)
            r20.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.graphics.drawable.C1132c.draw(android.graphics.Canvas):void");
    }
}
