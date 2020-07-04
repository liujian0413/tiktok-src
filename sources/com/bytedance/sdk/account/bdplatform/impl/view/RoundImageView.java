package com.bytedance.sdk.account.bdplatform.impl.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.sdk.account.bdplatform.R$styleable;

public class RoundImageView extends ImageView {

    /* renamed from: a */
    private float f33821a;

    /* renamed from: b */
    private float f33822b;

    /* renamed from: c */
    private float f33823c;

    /* renamed from: d */
    private float f33824d;

    /* renamed from: e */
    private Paint f33825e;

    public RoundImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m37114a(Canvas canvas) {
        if (this.f33821a > 0.0f) {
            Path path = new Path();
            path.moveTo(0.0f, this.f33821a);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.f33821a, 0.0f);
            path.arcTo(new RectF(0.0f, 0.0f, this.f33821a * 2.0f, this.f33821a * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.f33825e);
        }
    }

    /* renamed from: b */
    private void m37115b(Canvas canvas) {
        if (this.f33822b > 0.0f) {
            int width = getWidth();
            Path path = new Path();
            float f = (float) width;
            path.moveTo(f - this.f33822b, 0.0f);
            path.lineTo(f, 0.0f);
            path.lineTo(f, this.f33822b);
            path.arcTo(new RectF(f - (this.f33822b * 2.0f), 0.0f, f, this.f33822b * 2.0f), 0.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.f33825e);
        }
    }

    /* renamed from: c */
    private void m37116c(Canvas canvas) {
        if (this.f33823c > 0.0f) {
            int height = getHeight();
            Path path = new Path();
            float f = (float) height;
            path.moveTo(0.0f, f - this.f33823c);
            path.lineTo(0.0f, f);
            path.lineTo(this.f33823c, f);
            path.arcTo(new RectF(0.0f, f - (this.f33823c * 2.0f), this.f33823c * 2.0f, f), 90.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.f33825e);
        }
    }

    public void draw(Canvas canvas) {
        try {
            canvas.saveLayer(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), null, 31);
            super.draw(canvas);
            m37114a(canvas);
            m37115b(canvas);
            m37116c(canvas);
            m37117d(canvas);
            canvas.restore();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private void m37117d(Canvas canvas) {
        if (this.f33824d > 0.0f) {
            int height = getHeight();
            int width = getWidth();
            Path path = new Path();
            float f = (float) width;
            float f2 = (float) height;
            path.moveTo(f - this.f33824d, f2);
            path.lineTo(f, f2);
            path.lineTo(f, f2 - this.f33824d);
            path.arcTo(new RectF(f - (this.f33824d * 2.0f), f2 - (this.f33824d * 2.0f), f, f2), 0.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.f33825e);
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundImageView);
            float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f33821a = dimension;
            this.f33822b = dimension;
            this.f33823c = dimension;
            this.f33824d = dimension;
            obtainStyledAttributes.recycle();
        }
        this.f33825e = new Paint(5);
        this.f33825e.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }
}
