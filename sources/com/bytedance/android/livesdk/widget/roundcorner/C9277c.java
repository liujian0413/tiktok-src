package com.bytedance.android.livesdk.widget.roundcorner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.live.p169ui.R$styleable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.widget.roundcorner.c */
public final class C9277c {

    /* renamed from: a */
    private int f25452a;

    /* renamed from: b */
    private int f25453b;

    /* renamed from: c */
    private int f25454c;

    /* renamed from: d */
    private int f25455d;

    /* renamed from: e */
    private final RectF f25456e = new RectF();

    /* renamed from: f */
    private final float[] f25457f = new float[8];

    /* renamed from: g */
    private final Path f25458g = new Path();

    /* renamed from: h */
    private final Paint f25459h = new Paint(1);

    /* renamed from: i */
    private final PorterDuffXfermode f25460i = new PorterDuffXfermode(Mode.SRC_IN);

    /* renamed from: j */
    private final C9275a f25461j;

    public C9277c(C9275a aVar) {
        C7573i.m23587b(aVar, "view");
        this.f25461j = aVar;
    }

    /* renamed from: a */
    public final void mo22763a(Canvas canvas) {
        if (canvas != null) {
            if (this.f25452a == 0 && this.f25454c == 0 && this.f25453b == 0 && this.f25455d == 0) {
                this.f25461j.mo22755a(canvas);
                return;
            }
            int a = m27610a(canvas, this.f25456e, this.f25459h);
            this.f25458g.reset();
            this.f25458g.addRoundRect(this.f25456e, this.f25457f, Direction.CW);
            canvas.drawPath(this.f25458g, this.f25459h);
            this.f25459h.setXfermode(this.f25460i);
            m27610a(canvas, this.f25456e, this.f25459h);
            this.f25461j.mo22755a(canvas);
            this.f25459h.setXfermode(null);
            this.f25459h.setColorFilter(null);
            canvas.restoreToCount(a);
        }
    }

    /* renamed from: a */
    public final void mo22761a(int i, int i2) {
        if ((this.f25452a != 0 || this.f25454c != 0 || this.f25455d != 0 || this.f25453b != 0) && i != 0 && i2 != 0) {
            this.f25456e.set(0.0f, 0.0f, (float) i, (float) i2);
        }
    }

    /* renamed from: a */
    private static int m27610a(Canvas canvas, RectF rectF, Paint paint) {
        if (VERSION.SDK_INT >= 21) {
            return canvas.saveLayer(rectF, paint);
        }
        return canvas.saveLayer(rectF, paint, 31);
    }

    /* renamed from: a */
    public final void mo22762a(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_RoundCornerView, i, 0);
        if (obtainStyledAttributes != null) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f25452a = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
            this.f25453b = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
            this.f25454c = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
            this.f25455d = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
            this.f25457f[0] = (float) this.f25452a;
            this.f25457f[1] = this.f25457f[0];
            this.f25457f[2] = (float) this.f25454c;
            this.f25457f[3] = this.f25457f[2];
            this.f25457f[4] = (float) this.f25455d;
            this.f25457f[5] = this.f25457f[4];
            this.f25457f[6] = (float) this.f25453b;
            this.f25457f[7] = this.f25457f[6];
            obtainStyledAttributes.recycle();
        }
        if (this.f25453b > 0 || this.f25452a > 0 || this.f25454c > 0 || this.f25455d > 0) {
            C9275a aVar = this.f25461j;
            if (!(aVar instanceof ViewGroup)) {
                aVar = null;
            }
            ViewGroup viewGroup = (ViewGroup) aVar;
            if (viewGroup != null) {
                viewGroup.setWillNotDraw(false);
            }
        }
    }
}
