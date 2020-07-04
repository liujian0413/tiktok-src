package com.p280ss.android.ugc.aweme.base.p1061e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.base.e.a */
public class C23329a extends Drawable {

    /* renamed from: c */
    private static final String f61393c = "a";

    /* renamed from: i */
    private static boolean f61394i;

    /* renamed from: a */
    public float[] f61395a = new float[60];

    /* renamed from: b */
    public int[] f61396b = {-65536, -16711936, -16776961, -16777216, -65536};

    /* renamed from: d */
    private Paint f61397d;

    /* renamed from: e */
    private int f61398e = m76544e(1.5d);

    /* renamed from: f */
    private float f61399f;

    /* renamed from: g */
    private float f61400g;

    /* renamed from: h */
    private Float f61401h;

    /* renamed from: j */
    private boolean f61402j;

    /* renamed from: k */
    private boolean f61403k;

    /* renamed from: l */
    private boolean f61404l;

    /* renamed from: d */
    private static double m76541d(double d) {
        return d * d * d * d * d * d;
    }

    /* renamed from: h */
    private void m76547h() {
        this.f61403k = false;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: g */
    private void m76546g() {
        this.f61402j = false;
        this.f61401h = null;
        this.f61400g = 0.0f;
        this.f61404l = false;
    }

    /* renamed from: b */
    private void m76538b() {
        this.f61397d = new Paint(1);
        this.f61397d.setStyle(Style.STROKE);
        this.f61397d.setStrokeWidth((float) this.f61398e);
        this.f61397d.setStrokeCap(Cap.ROUND);
    }

    /* renamed from: e */
    private float m76543e() {
        double d = (double) this.f61400g;
        Double.isNaN(d);
        return (float) (d * 0.5d * 360.0d);
    }

    public C23329a() {
        m76538b();
    }

    /* renamed from: c */
    private void m76540c() {
        Rect bounds = getBounds();
        if (bounds.width() > 0) {
            this.f61397d.setShader(new SweepGradient((float) bounds.centerX(), (float) bounds.centerY(), this.f61396b, null));
        }
    }

    /* renamed from: d */
    private void m76542d() {
        float f = this.f61400g;
        this.f61400g += 0.008f;
        if (this.f61401h != null && f <= this.f61401h.floatValue() && this.f61400g >= this.f61401h.floatValue()) {
            m76546g();
        }
        invalidateSelf();
    }

    /* renamed from: f */
    private PathEffect m76545f() {
        boolean z;
        for (int i = 0; i < 30; i++) {
            if (i == 29) {
                z = true;
            } else {
                z = false;
            }
            f61394i = z;
            float[] fArr = this.f61395a;
            int i2 = i * 2;
            double d = (double) this.f61399f;
            double d2 = (double) this.f61400g;
            double d3 = (double) i;
            Double.isNaN(d3);
            fArr[i2] = (float) m76534a(0.0d, d, d2, (d3 * 1.0d) / 29.0d);
            new StringBuilder("lengthValue = ").append(this.f61395a[i2]);
            this.f61395a[i2 + 1] = this.f61399f - this.f61395a[i2];
        }
        return new DashPathEffect(this.f61395a, 0.0f);
    }

    /* renamed from: a */
    public final void mo60611a() {
        m76547h();
        this.f61402j = true;
        this.f61404l = false;
        invalidateSelf();
    }

    /* renamed from: c */
    private static double m76539c(double d) {
        return (double) ((float) m76541d(d));
    }

    /* renamed from: e */
    private static int m76544e(double d) {
        return C23486n.m77122a(1.5d);
    }

    public void setAlpha(int i) {
        this.f61397d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f61397d.setColorFilter(colorFilter);
    }

    /* renamed from: b */
    private static double m76537b(double d) {
        return (double) ((float) m76541d(1.0d - d));
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m76540c();
        double width = (double) getBounds().width();
        Double.isNaN(width);
        this.f61399f = (float) ((width * 3.141592653589793d) / 30.0d);
    }

    /* renamed from: a */
    public static void m76535a(View view) {
        view.setLayerType(1, null);
        view.setDrawingCacheEnabled(false);
    }

    /* renamed from: b */
    public final void mo60613b(int i) {
        this.f61398e = i;
        this.f61397d.setStrokeWidth((float) this.f61398e);
    }

    /* renamed from: a */
    private static double m76532a(double d) {
        StringBuilder sb = new StringBuilder("getAdjustedDegreeFactor() called, with progress = [");
        sb.append(d);
        sb.append("]");
        double floor = Math.floor(d);
        double d2 = d - floor;
        StringBuilder sb2 = new StringBuilder("getAdjustedDegreeFactor() called, with base = [");
        sb2.append(floor);
        sb2.append("]");
        StringBuilder sb3 = new StringBuilder("getAdjustedDegreeFactor() called, with periodicValue = [");
        sb3.append(d2);
        sb3.append("]");
        if (d2 < 0.125d) {
            return m76537b(d2 / 0.125d);
        }
        if (d2 < 0.375d) {
            return 0.0d;
        }
        if (d2 < 0.5d) {
            return m76539c(((d2 - 0.125d) - 0.25d) / 0.125d);
        }
        return 1.0d;
    }

    public void draw(Canvas canvas) {
        PathEffect pathEffect;
        float f;
        if (!this.f61403k) {
            canvas.save();
            Paint paint = this.f61397d;
            if (this.f61402j) {
                pathEffect = m76545f();
            } else {
                pathEffect = null;
            }
            paint.setPathEffect(pathEffect);
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            if (this.f61402j) {
                f = m76543e();
            } else {
                f = 0.0f;
            }
            float f2 = (float) centerX;
            float f3 = (float) centerY;
            canvas.rotate(f, f2, f3);
            canvas.drawCircle(f2, f3, (float) ((getBounds().width() / 2) - this.f61398e), this.f61397d);
            if (this.f61402j && !this.f61404l) {
                m76542d();
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    private void m76536a(int[] iArr) {
        if (!Arrays.equals(iArr, this.f61396b)) {
            this.f61396b = iArr;
            m76540c();
        }
    }

    /* renamed from: a */
    public final void mo60612a(int i) {
        m76536a(new int[]{i, i});
    }

    /* renamed from: a */
    private static double m76533a(double d, double d2, double d3) {
        new StringBuilder("getAdjustedDegreeFactor(degree) = ").append(m76532a(d3));
        return d + ((d2 - d) * m76532a(d3));
    }

    /* renamed from: a */
    private static double m76534a(double d, double d2, double d3, double d4) {
        return m76533a(0.0d, d2, d3 - (d4 * 0.5d));
    }
}
