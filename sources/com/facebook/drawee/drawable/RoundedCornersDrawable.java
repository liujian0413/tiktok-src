package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.C13307g;
import java.util.Arrays;

public final class RoundedCornersDrawable extends C13412g implements C13415j {

    /* renamed from: a */
    Type f35486a = Type.OVERLAY_COLOR;

    /* renamed from: b */
    final float[] f35487b = new float[8];

    /* renamed from: c */
    final Paint f35488c = new Paint(1);

    /* renamed from: d */
    public int f35489d = 0;

    /* renamed from: e */
    private final RectF f35490e = new RectF();

    /* renamed from: f */
    private RectF f35491f;

    /* renamed from: g */
    private Matrix f35492g;

    /* renamed from: h */
    private final float[] f35493h = new float[8];

    /* renamed from: i */
    private boolean f35494i = false;

    /* renamed from: j */
    private float f35495j = 0.0f;

    /* renamed from: k */
    private int f35496k = 0;

    /* renamed from: l */
    private float f35497l = 0.0f;

    /* renamed from: m */
    private boolean f35498m = false;

    /* renamed from: n */
    private final Path f35499n = new Path();

    /* renamed from: o */
    private final Path f35500o = new Path();

    /* renamed from: p */
    private final RectF f35501p = new RectF();

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* renamed from: a */
    private void m39314a() {
        this.f35499n.reset();
        this.f35500o.reset();
        this.f35501p.set(getBounds());
        this.f35501p.inset(this.f35497l, this.f35497l);
        this.f35499n.addRect(this.f35501p, Direction.CW);
        if (this.f35494i) {
            this.f35499n.addCircle(this.f35501p.centerX(), this.f35501p.centerY(), Math.min(this.f35501p.width(), this.f35501p.height()) / 2.0f, Direction.CW);
        } else {
            this.f35499n.addRoundRect(this.f35501p, this.f35493h, Direction.CW);
        }
        this.f35501p.inset(-this.f35497l, -this.f35497l);
        this.f35501p.inset(this.f35495j / 2.0f, this.f35495j / 2.0f);
        if (this.f35494i) {
            this.f35500o.addCircle(this.f35501p.centerX(), this.f35501p.centerY(), Math.min(this.f35501p.width(), this.f35501p.height()) / 2.0f, Direction.CW);
        } else {
            for (int i = 0; i < this.f35487b.length; i++) {
                this.f35487b[i] = (this.f35493h[i] + this.f35497l) - (this.f35495j / 2.0f);
            }
            this.f35500o.addRoundRect(this.f35501p, this.f35487b, Direction.CW);
        }
        this.f35501p.inset((-this.f35495j) / 2.0f, (-this.f35495j) / 2.0f);
    }

    /* renamed from: a */
    public final void mo32769a(int i) {
        this.f35489d = i;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m39314a();
    }

    /* renamed from: a */
    public final void mo32768a(float f) {
        Arrays.fill(this.f35493h, 0.0f);
        m39314a();
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo32773b(float f) {
        this.f35497l = f;
        m39314a();
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo32774b(boolean z) {
        this.f35498m = z;
        m39314a();
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo32771a(boolean z) {
        this.f35494i = z;
        m39314a();
        invalidateSelf();
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) C13307g.m38940a(drawable));
    }

    /* renamed from: a */
    public final void mo32772a(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f35493h, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13307g.m38944a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f35493h, 0, 8);
        }
        m39314a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f35490e.set(getBounds());
        switch (this.f35486a) {
            case CLIPPING:
                int save = canvas.save();
                this.f35499n.setFillType(FillType.EVEN_ODD);
                canvas.clipPath(this.f35499n);
                super.draw(canvas);
                canvas.restoreToCount(save);
                break;
            case OVERLAY_COLOR:
                if (this.f35498m) {
                    if (this.f35491f == null) {
                        this.f35491f = new RectF(this.f35490e);
                        this.f35492g = new Matrix();
                    } else {
                        this.f35491f.set(this.f35490e);
                    }
                    this.f35491f.inset(this.f35495j, this.f35495j);
                    this.f35492g.setRectToRect(this.f35490e, this.f35491f, ScaleToFit.FILL);
                    int save2 = canvas.save();
                    canvas.clipRect(this.f35490e);
                    canvas.concat(this.f35492g);
                    super.draw(canvas);
                    canvas.restoreToCount(save2);
                } else {
                    super.draw(canvas);
                }
                this.f35488c.setStyle(Style.FILL);
                this.f35488c.setColor(this.f35489d);
                this.f35488c.setStrokeWidth(0.0f);
                this.f35499n.setFillType(FillType.EVEN_ODD);
                canvas.drawPath(this.f35499n, this.f35488c);
                if (this.f35494i) {
                    float width = ((this.f35490e.width() - this.f35490e.height()) + this.f35495j) / 2.0f;
                    float height = ((this.f35490e.height() - this.f35490e.width()) + this.f35495j) / 2.0f;
                    if (width > 0.0f) {
                        Canvas canvas2 = canvas;
                        canvas2.drawRect(this.f35490e.left, this.f35490e.top, this.f35490e.left + width, this.f35490e.bottom, this.f35488c);
                        canvas2.drawRect(this.f35490e.right - width, this.f35490e.top, this.f35490e.right, this.f35490e.bottom, this.f35488c);
                    }
                    if (height > 0.0f) {
                        Canvas canvas3 = canvas;
                        canvas3.drawRect(this.f35490e.left, this.f35490e.top, this.f35490e.right, this.f35490e.top + height, this.f35488c);
                        canvas3.drawRect(this.f35490e.left, this.f35490e.bottom - height, this.f35490e.right, this.f35490e.bottom, this.f35488c);
                        break;
                    }
                }
                break;
        }
        if (this.f35496k != 0) {
            this.f35488c.setStyle(Style.STROKE);
            this.f35488c.setColor(this.f35496k);
            this.f35488c.setStrokeWidth(this.f35495j);
            this.f35499n.setFillType(FillType.EVEN_ODD);
            canvas.drawPath(this.f35500o, this.f35488c);
        }
    }

    /* renamed from: a */
    public final void mo32770a(int i, float f) {
        this.f35496k = i;
        this.f35495j = f;
        m39314a();
        invalidateSelf();
    }
}
