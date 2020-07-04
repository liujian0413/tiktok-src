package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1703p;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1755c;

/* renamed from: com.airbnb.lottie.model.layer.c */
public final class C1826c extends C1821a {

    /* renamed from: g */
    private final Paint f6611g = new Paint(3);

    /* renamed from: h */
    private final Rect f6612h = new Rect();

    /* renamed from: i */
    private final Rect f6613i = new Rect();

    /* renamed from: j */
    private C1687a<ColorFilter, ColorFilter> f6614j;

    /* renamed from: c */
    private Bitmap m8569c() {
        return this.f6581b.mo7219a(this.f6582c.f6565g);
    }

    C1826c(C1767h hVar, Layer layer) {
        super(hVar, layer);
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        super.mo7135a(t, cVar);
        if (t == C1782k.f6423x) {
            if (cVar == null) {
                this.f6614j = null;
                return;
            }
            this.f6614j = new C1703p(cVar);
        }
    }

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        super.mo7133a(rectF, matrix);
        Bitmap c = m8569c();
        if (c != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) c.getWidth()), Math.min(rectF.bottom, (float) c.getHeight()));
            this.f6580a.mapRect(rectF);
        }
    }

    /* renamed from: b */
    public final void mo7328b(Canvas canvas, Matrix matrix, int i) {
        Bitmap c = m8569c();
        if (c != null && !c.isRecycled()) {
            float a = C1751f.m8367a();
            this.f6611g.setAlpha(i);
            if (this.f6614j != null) {
                this.f6611g.setColorFilter((ColorFilter) this.f6614j.mo7151e());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f6612h.set(0, 0, c.getWidth(), c.getHeight());
            this.f6613i.set(0, 0, (int) (((float) c.getWidth()) * a), (int) (((float) c.getHeight()) * a));
            canvas.drawBitmap(c, this.f6612h, this.f6613i, this.f6611g);
            canvas.restore();
        }
    }
}
