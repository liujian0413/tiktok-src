package com.soundcloud.android.crop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.soundcloud.android.crop.b */
final class C18738b {

    /* renamed from: a */
    RectF f50614a;

    /* renamed from: b */
    Rect f50615b;

    /* renamed from: c */
    Matrix f50616c;

    /* renamed from: d */
    public boolean f50617d;

    /* renamed from: e */
    private RectF f50618e;

    /* renamed from: f */
    private final Paint f50619f = new Paint();

    /* renamed from: g */
    private final Paint f50620g = new Paint();

    /* renamed from: h */
    private final Paint f50621h = new Paint();

    /* renamed from: i */
    private View f50622i;

    /* renamed from: j */
    private boolean f50623j;

    /* renamed from: k */
    private boolean f50624k;

    /* renamed from: l */
    private int f50625l;

    /* renamed from: m */
    private C18740b f50626m = C18740b.None;

    /* renamed from: n */
    private C18739a f50627n = C18739a.Changing;

    /* renamed from: o */
    private boolean f50628o;

    /* renamed from: p */
    private float f50629p;

    /* renamed from: q */
    private float f50630q;

    /* renamed from: r */
    private float f50631r;

    /* renamed from: com.soundcloud.android.crop.b$a */
    enum C18739a {
        Changing,
        Always,
        Never
    }

    /* renamed from: com.soundcloud.android.crop.b$b */
    enum C18740b {
        None,
        Move,
        Grow
    }

    /* renamed from: a */
    public final void mo49272a() {
        this.f50615b = m61361b();
    }

    /* renamed from: b */
    private Rect m61361b() {
        RectF rectF = new RectF(this.f50614a.left, this.f50614a.top, this.f50614a.right, this.f50614a.bottom);
        this.f50616c.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: b */
    private float m61360b(float f) {
        return f * this.f50622i.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final void mo49276a(C18740b bVar) {
        if (bVar != this.f50626m) {
            this.f50626m = bVar;
            this.f50622i.invalidate();
        }
    }

    /* renamed from: c */
    private static boolean m61365c(Canvas canvas) {
        if (VERSION.SDK_INT == 17) {
            return false;
        }
        if (VERSION.SDK_INT < 14 || VERSION.SDK_INT > 15 || !canvas.isHardwareAccelerated()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m61368f(Canvas canvas) {
        this.f50620g.setStrokeWidth(1.0f);
        canvas.drawOval(new RectF(this.f50615b), this.f50620g);
    }

    public C18738b(View view) {
        this.f50622i = view;
        m61359a(view.getContext());
    }

    /* renamed from: a */
    public final Rect mo49271a(float f) {
        return new Rect((int) (this.f50614a.left * f), (int) (this.f50614a.top * f), (int) (this.f50614a.right * f), (int) (this.f50614a.bottom * f));
    }

    /* renamed from: a */
    private void m61359a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.i6, typedValue, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, R$styleable.CropImageView);
        try {
            this.f50623j = obtainStyledAttributes.getBoolean(3, false);
            this.f50624k = obtainStyledAttributes.getBoolean(1, false);
            this.f50625l = obtainStyledAttributes.getColor(0, -13388315);
            this.f50627n = C18739a.values()[obtainStyledAttributes.getInt(2, 0)];
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    private void m61366d(Canvas canvas) {
        int i = this.f50615b.left + ((this.f50615b.right - this.f50615b.left) / 2);
        float f = (float) (this.f50615b.top + ((this.f50615b.bottom - this.f50615b.top) / 2));
        canvas.drawCircle((float) this.f50615b.left, f, this.f50630q, this.f50621h);
        float f2 = (float) i;
        canvas.drawCircle(f2, (float) this.f50615b.top, this.f50630q, this.f50621h);
        canvas.drawCircle((float) this.f50615b.right, f, this.f50630q, this.f50621h);
        canvas.drawCircle(f2, (float) this.f50615b.bottom, this.f50630q, this.f50621h);
    }

    /* renamed from: b */
    private void m61363b(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) this.f50615b.top, this.f50619f);
        canvas2.drawRect(0.0f, (float) this.f50615b.bottom, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f50619f);
        canvas2.drawRect(0.0f, (float) this.f50615b.top, (float) this.f50615b.left, (float) this.f50615b.bottom, this.f50619f);
        canvas2.drawRect((float) this.f50615b.right, (float) this.f50615b.top, (float) canvas.getWidth(), (float) this.f50615b.bottom, this.f50619f);
    }

    /* renamed from: e */
    private void m61367e(Canvas canvas) {
        this.f50620g.setStrokeWidth(1.0f);
        float f = (float) ((this.f50615b.right - this.f50615b.left) / 3);
        float f2 = (float) ((this.f50615b.bottom - this.f50615b.top) / 3);
        canvas.drawLine(((float) this.f50615b.left) + f, (float) this.f50615b.top, ((float) this.f50615b.left) + f, (float) this.f50615b.bottom, this.f50620g);
        float f3 = f * 2.0f;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) this.f50615b.left) + f3, (float) this.f50615b.top, ((float) this.f50615b.left) + f3, (float) this.f50615b.bottom, this.f50620g);
        canvas2.drawLine((float) this.f50615b.left, ((float) this.f50615b.top) + f2, (float) this.f50615b.right, ((float) this.f50615b.top) + f2, this.f50620g);
        float f4 = f2 * 2.0f;
        canvas2.drawLine((float) this.f50615b.left, ((float) this.f50615b.top) + f4, (float) this.f50615b.right, ((float) this.f50615b.top) + f4, this.f50620g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49274a(Canvas canvas) {
        canvas.save();
        Path path = new Path();
        this.f50620g.setStrokeWidth(this.f50631r);
        if (!this.f50617d) {
            this.f50620g.setColor(-16777216);
            canvas.drawRect(this.f50615b, this.f50620g);
            return;
        }
        Rect rect = new Rect();
        this.f50622i.getDrawingRect(rect);
        path.addRect(new RectF(this.f50615b), Direction.CW);
        this.f50620g.setColor(this.f50625l);
        if (m61365c(canvas)) {
            canvas.clipPath(path, Op.DIFFERENCE);
            canvas.drawRect(rect, this.f50619f);
        } else {
            m61363b(canvas);
        }
        canvas.restore();
        canvas.drawPath(path, this.f50620g);
        if (this.f50623j) {
            m61367e(canvas);
        }
        if (this.f50624k) {
            m61368f(canvas);
        }
        if (this.f50627n == C18739a.Always || (this.f50627n == C18739a.Changing && this.f50626m == C18740b.Grow)) {
            m61366d(canvas);
        }
    }

    /* renamed from: b */
    private void m61362b(float f, float f2) {
        Rect rect = new Rect(this.f50615b);
        this.f50614a.offset(f, f2);
        this.f50614a.offset(Math.max(0.0f, this.f50618e.left - this.f50614a.left), Math.max(0.0f, this.f50618e.top - this.f50614a.top));
        this.f50614a.offset(Math.min(0.0f, this.f50618e.right - this.f50614a.right), Math.min(0.0f, this.f50618e.bottom - this.f50614a.bottom));
        this.f50615b = m61361b();
        rect.union(this.f50615b);
        rect.inset(-((int) this.f50630q), -((int) this.f50630q));
        this.f50622i.invalidate(rect);
    }

    /* renamed from: a */
    public final int mo49270a(float f, float f2) {
        boolean z;
        int i;
        Rect b = m61361b();
        boolean z2 = false;
        if (f2 < ((float) b.top) - 20.0f || f2 >= ((float) b.bottom) + 20.0f) {
            z = false;
        } else {
            z = true;
        }
        if (f >= ((float) b.left) - 20.0f && f < ((float) b.right) + 20.0f) {
            z2 = true;
        }
        if (Math.abs(((float) b.left) - f) >= 20.0f || !z) {
            i = 1;
        } else {
            i = 3;
        }
        if (Math.abs(((float) b.right) - f) < 20.0f && z) {
            i |= 4;
        }
        if (Math.abs(((float) b.top) - f2) < 20.0f && z2) {
            i |= 8;
        }
        if (Math.abs(((float) b.bottom) - f2) < 20.0f && z2) {
            i |= 16;
        }
        if (i != 1 || !b.contains((int) f, (int) f2)) {
            return i;
        }
        return 32;
    }

    /* renamed from: c */
    private void m61364c(float f, float f2) {
        if (this.f50628o) {
            if (f != 0.0f) {
                f2 = f / this.f50629p;
            } else if (f2 != 0.0f) {
                f = this.f50629p * f2;
            }
        }
        RectF rectF = new RectF(this.f50614a);
        if (f > 0.0f && rectF.width() + (f * 2.0f) > this.f50618e.width()) {
            f = (this.f50618e.width() - rectF.width()) / 2.0f;
            if (this.f50628o) {
                f2 = f / this.f50629p;
            }
        }
        if (f2 > 0.0f && rectF.height() + (f2 * 2.0f) > this.f50618e.height()) {
            f2 = (this.f50618e.height() - rectF.height()) / 2.0f;
            if (this.f50628o) {
                f = this.f50629p * f2;
            }
        }
        rectF.inset(-f, -f2);
        float f3 = 25.0f;
        if (rectF.width() < 25.0f) {
            rectF.inset((-(25.0f - rectF.width())) / 2.0f, 0.0f);
        }
        if (this.f50628o) {
            f3 = 25.0f / this.f50629p;
        }
        if (rectF.height() < f3) {
            rectF.inset(0.0f, (-(f3 - rectF.height())) / 2.0f);
        }
        if (rectF.left < this.f50618e.left) {
            rectF.offset(this.f50618e.left - rectF.left, 0.0f);
        } else if (rectF.right > this.f50618e.right) {
            rectF.offset(-(rectF.right - this.f50618e.right), 0.0f);
        }
        if (rectF.top < this.f50618e.top) {
            rectF.offset(0.0f, this.f50618e.top - rectF.top);
        } else if (rectF.bottom > this.f50618e.bottom) {
            rectF.offset(0.0f, -(rectF.bottom - this.f50618e.bottom));
        }
        this.f50614a.set(rectF);
        this.f50615b = m61361b();
        this.f50622i.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49273a(int i, float f, float f2) {
        int i2;
        Rect b = m61361b();
        if (i == 32) {
            m61362b(f * (this.f50614a.width() / ((float) b.width())), f2 * (this.f50614a.height() / ((float) b.height())));
            return;
        }
        if ((i & 6) == 0) {
            f = 0.0f;
        }
        if ((i & 24) == 0) {
            f2 = 0.0f;
        }
        float width = f * (this.f50614a.width() / ((float) b.width()));
        float height = f2 * (this.f50614a.height() / ((float) b.height()));
        int i3 = 1;
        if ((i & 2) != 0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        float f3 = ((float) i2) * width;
        if ((i & 8) != 0) {
            i3 = -1;
        }
        m61364c(f3, ((float) i3) * height);
    }

    /* renamed from: a */
    public final void mo49275a(Matrix matrix, Rect rect, RectF rectF, boolean z) {
        this.f50616c = new Matrix(matrix);
        this.f50614a = rectF;
        this.f50618e = new RectF(rect);
        this.f50628o = z;
        this.f50629p = this.f50614a.width() / this.f50614a.height();
        this.f50615b = m61361b();
        this.f50619f.setARGB(125, 50, 50, 50);
        this.f50620g.setStyle(Style.STROKE);
        this.f50620g.setAntiAlias(true);
        this.f50631r = m61360b(2.0f);
        this.f50621h.setColor(this.f50625l);
        this.f50621h.setStyle(Style.FILL);
        this.f50621h.setAntiAlias(true);
        this.f50630q = m61360b(12.0f);
        this.f50626m = C18740b.None;
    }
}
