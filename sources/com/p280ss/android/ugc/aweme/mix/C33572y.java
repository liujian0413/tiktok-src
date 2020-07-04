package com.p280ss.android.ugc.aweme.mix;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* renamed from: com.ss.android.ugc.aweme.mix.y */
public final class C33572y extends ReplacementSpan {

    /* renamed from: a */
    private float f87671a;

    /* renamed from: b */
    private Integer f87672b;

    /* renamed from: c */
    private int f87673c;

    /* renamed from: a */
    private TextPaint m108448a(Paint paint) {
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(this.f87671a);
        if (this.f87672b != null) {
            textPaint.setColor(this.f87672b.intValue());
        }
        return textPaint;
    }

    public C33572y(float f, int i) {
        this.f87671a = f;
        this.f87672b = Integer.valueOf(i);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) m108448a(paint).measureText(charSequence.subSequence(i, i2).toString());
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        TextPaint a = m108448a(paint);
        FontMetricsInt fontMetricsInt = a.getFontMetricsInt();
        FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        canvas.drawText(subSequence.toString(), f, (((float) i4) - ((((float) (((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent)) / 2.0f) - (((float) (((fontMetricsInt2.top + i4) + i4) + fontMetricsInt2.bottom)) / 2.0f))) - ((float) this.f87673c), a);
    }
}
