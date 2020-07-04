package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.C13307g;
import com.facebook.imagepipeline.p725l.C13783b;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.drawable.m */
public abstract class C13418m extends Drawable implements C13415j, C13434q {

    /* renamed from: A */
    private boolean f35558A = true;

    /* renamed from: B */
    private C13435r f35559B;

    /* renamed from: a */
    private final float[] f35560a = new float[8];

    /* renamed from: b */
    protected final Drawable f35561b;

    /* renamed from: c */
    protected boolean f35562c;

    /* renamed from: d */
    protected boolean f35563d;

    /* renamed from: e */
    protected float f35564e;

    /* renamed from: f */
    protected final Path f35565f = new Path();

    /* renamed from: g */
    protected boolean f35566g = true;

    /* renamed from: h */
    protected int f35567h = 0;

    /* renamed from: i */
    protected final Path f35568i = new Path();

    /* renamed from: j */
    final float[] f35569j = new float[8];

    /* renamed from: k */
    float[] f35570k;

    /* renamed from: l */
    final RectF f35571l = new RectF();

    /* renamed from: m */
    final RectF f35572m = new RectF();

    /* renamed from: n */
    final RectF f35573n = new RectF();

    /* renamed from: o */
    final RectF f35574o = new RectF();

    /* renamed from: p */
    RectF f35575p;

    /* renamed from: q */
    final Matrix f35576q = new Matrix();

    /* renamed from: r */
    final Matrix f35577r = new Matrix();

    /* renamed from: s */
    final Matrix f35578s = new Matrix();

    /* renamed from: t */
    final Matrix f35579t = new Matrix();

    /* renamed from: u */
    final Matrix f35580u = new Matrix();

    /* renamed from: v */
    Matrix f35581v;

    /* renamed from: w */
    Matrix f35582w;

    /* renamed from: x */
    final Matrix f35583x = new Matrix();

    /* renamed from: y */
    private float f35584y = 0.0f;

    /* renamed from: z */
    private boolean f35585z = false;

    public void clearColorFilter() {
        this.f35561b.clearColorFilter();
    }

    public int getAlpha() {
        return this.f35561b.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f35561b.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f35561b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f35561b.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f35561b.getOpacity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo32842a() {
        if (this.f35562c || this.f35563d || this.f35564e > 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo32853c() {
        float f;
        if (this.f35558A) {
            this.f35568i.reset();
            this.f35571l.inset(this.f35564e / 2.0f, this.f35564e / 2.0f);
            if (this.f35562c) {
                this.f35568i.addCircle(this.f35571l.centerX(), this.f35571l.centerY(), Math.min(this.f35571l.width(), this.f35571l.height()) / 2.0f, Direction.CW);
            } else {
                for (int i = 0; i < this.f35569j.length; i++) {
                    this.f35569j[i] = (this.f35560a[i] + this.f35584y) - (this.f35564e / 2.0f);
                }
                this.f35568i.addRoundRect(this.f35571l, this.f35569j, Direction.CW);
            }
            this.f35571l.inset((-this.f35564e) / 2.0f, (-this.f35564e) / 2.0f);
            this.f35565f.reset();
            float f2 = this.f35584y;
            if (this.f35585z) {
                f = this.f35564e;
            } else {
                f = 0.0f;
            }
            float f3 = f2 + f;
            this.f35571l.inset(f3, f3);
            if (this.f35562c) {
                this.f35565f.addCircle(this.f35571l.centerX(), this.f35571l.centerY(), Math.min(this.f35571l.width(), this.f35571l.height()) / 2.0f, Direction.CW);
            } else if (this.f35585z) {
                if (this.f35570k == null) {
                    this.f35570k = new float[8];
                }
                for (int i2 = 0; i2 < this.f35569j.length; i2++) {
                    this.f35570k[i2] = this.f35560a[i2] - this.f35564e;
                }
                this.f35565f.addRoundRect(this.f35571l, this.f35570k, Direction.CW);
            } else {
                this.f35565f.addRoundRect(this.f35571l, this.f35560a, Direction.CW);
            }
            float f4 = -f3;
            this.f35571l.inset(f4, f4);
            this.f35565f.setFillType(FillType.WINDING);
            this.f35558A = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo32852b() {
        if (this.f35559B != null) {
            this.f35559B.getTransform(this.f35578s);
            this.f35559B.getRootBounds(this.f35571l);
        } else {
            this.f35578s.reset();
            this.f35571l.set(getBounds());
        }
        this.f35573n.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.f35574o.set(this.f35561b.getBounds());
        this.f35576q.setRectToRect(this.f35573n, this.f35574o, ScaleToFit.FILL);
        if (this.f35585z) {
            if (this.f35575p == null) {
                this.f35575p = new RectF(this.f35571l);
            } else {
                this.f35575p.set(this.f35571l);
            }
            this.f35575p.inset(this.f35564e, this.f35564e);
            if (this.f35581v == null) {
                this.f35581v = new Matrix();
            }
            this.f35581v.setRectToRect(this.f35571l, this.f35575p, ScaleToFit.FILL);
        } else if (this.f35581v != null) {
            this.f35581v.reset();
        }
        if (!this.f35578s.equals(this.f35579t) || !this.f35576q.equals(this.f35577r) || (this.f35581v != null && !this.f35581v.equals(this.f35582w))) {
            this.f35566g = true;
            this.f35578s.invert(this.f35580u);
            this.f35583x.set(this.f35578s);
            if (this.f35585z) {
                this.f35583x.postConcat(this.f35581v);
            }
            this.f35583x.preConcat(this.f35576q);
            this.f35579t.set(this.f35578s);
            this.f35577r.set(this.f35576q);
            if (this.f35585z) {
                if (this.f35582w == null) {
                    this.f35582w = new Matrix(this.f35581v);
                } else {
                    this.f35582w.set(this.f35581v);
                }
            } else if (this.f35582w != null) {
                this.f35582w.reset();
            }
        }
        if (!this.f35571l.equals(this.f35572m)) {
            this.f35558A = true;
            this.f35572m.set(this.f35571l);
        }
    }

    public void setTransformCallback(C13435r rVar) {
        this.f35559B = rVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f35561b.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.f35561b.setAlpha(i);
    }

    /* renamed from: a */
    public final void mo32771a(boolean z) {
        this.f35562c = z;
        this.f35558A = true;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo32773b(float f) {
        if (this.f35584y != f) {
            this.f35584y = f;
            this.f35558A = true;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35561b.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public final void mo32768a(float f) {
        C13307g.m38947b(true);
        Arrays.fill(this.f35560a, 0.0f);
        this.f35563d = false;
        this.f35558A = true;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo32774b(boolean z) {
        if (this.f35585z != z) {
            this.f35585z = z;
            this.f35558A = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("RoundedDrawable#draw");
        }
        this.f35561b.draw(canvas);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    C13418m(Drawable drawable) {
        this.f35561b = drawable;
    }

    /* renamed from: a */
    public final void mo32772a(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.f35560a, 0.0f);
            this.f35563d = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13307g.m38944a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f35560a, 0, 8);
            this.f35563d = false;
            for (int i = 0; i < 8; i++) {
                boolean z3 = this.f35563d;
                if (fArr[i] > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f35563d = z3 | z2;
            }
        }
        this.f35558A = true;
        invalidateSelf();
    }

    public void setColorFilter(int i, Mode mode) {
        this.f35561b.setColorFilter(i, mode);
    }

    /* renamed from: a */
    public final void mo32770a(int i, float f) {
        if (this.f35567h != i || this.f35564e != f) {
            this.f35567h = i;
            this.f35564e = f;
            this.f35558A = true;
            invalidateSelf();
        }
    }
}
