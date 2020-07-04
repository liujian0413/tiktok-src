package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1703p;
import com.airbnb.lottie.p057e.C1755c;

/* renamed from: com.airbnb.lottie.model.layer.f */
public final class C1829f extends C1821a {

    /* renamed from: g */
    private final RectF f6616g = new RectF();

    /* renamed from: h */
    private final Paint f6617h = new Paint();

    /* renamed from: i */
    private final float[] f6618i = new float[8];

    /* renamed from: j */
    private final Path f6619j = new Path();

    /* renamed from: k */
    private final Layer f6620k;

    /* renamed from: l */
    private C1687a<ColorFilter, ColorFilter> f6621l;

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        super.mo7133a(rectF, matrix);
        this.f6616g.set(0.0f, 0.0f, (float) this.f6620k.f6568j, (float) this.f6620k.f6569k);
        this.f6580a.mapRect(this.f6616g);
        rectF.set(this.f6616g);
    }

    C1829f(C1767h hVar, Layer layer) {
        super(hVar, layer);
        this.f6620k = layer;
        this.f6617h.setAlpha(0);
        this.f6617h.setStyle(Style.FILL);
        this.f6617h.setColor(layer.f6570l);
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        super.mo7135a(t, cVar);
        if (t == C1782k.f6423x) {
            if (cVar == null) {
                this.f6621l = null;
                return;
            }
            this.f6621l = new C1703p(cVar);
        }
    }

    /* renamed from: b */
    public final void mo7328b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f6620k.f6570l);
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) ((Integer) this.f6585f.f6253a.mo7151e()).intValue())) / 100.0f) * 255.0f);
            this.f6617h.setAlpha(intValue);
            if (this.f6621l != null) {
                this.f6617h.setColorFilter((ColorFilter) this.f6621l.mo7151e());
            }
            if (intValue > 0) {
                this.f6618i[0] = 0.0f;
                this.f6618i[1] = 0.0f;
                this.f6618i[2] = (float) this.f6620k.f6568j;
                this.f6618i[3] = 0.0f;
                this.f6618i[4] = (float) this.f6620k.f6568j;
                this.f6618i[5] = (float) this.f6620k.f6569k;
                this.f6618i[6] = 0.0f;
                this.f6618i[7] = (float) this.f6620k.f6569k;
                matrix.mapPoints(this.f6618i);
                this.f6619j.reset();
                this.f6619j.moveTo(this.f6618i[0], this.f6618i[1]);
                this.f6619j.lineTo(this.f6618i[2], this.f6618i[3]);
                this.f6619j.lineTo(this.f6618i[4], this.f6618i[5]);
                this.f6619j.lineTo(this.f6618i[6], this.f6618i[7]);
                this.f6619j.lineTo(this.f6618i[0], this.f6618i[1]);
                this.f6619j.close();
                canvas.drawPath(this.f6619j, this.f6617h);
            }
        }
    }
}
