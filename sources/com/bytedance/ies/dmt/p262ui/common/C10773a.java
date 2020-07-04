package com.bytedance.ies.dmt.p262ui.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.bytedance.ies.dmt.ui.common.a */
public final class C10773a extends ImageSpan {

    /* renamed from: a */
    public int f28888a;

    /* renamed from: b */
    private Integer f28889b;

    /* renamed from: c */
    private boolean f28890c;

    public C10773a(Drawable drawable) {
        this(drawable, (Integer) null);
    }

    public C10773a(Context context, int i) {
        super(context, i);
    }

    private C10773a(Drawable drawable, Integer num) {
        super(drawable);
        this.f28889b = null;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (this.f28889b != null && this.f28889b.intValue() != i2 - i && this.f28890c) {
            return 0;
        }
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f28889b == null || this.f28889b.intValue() == i2 - i || !this.f28890c) {
            Drawable drawable = getDrawable();
            FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f + ((float) this.f28888a), (float) i6);
            drawable.draw(canvas);
            canvas.restore();
            if (!(this.f28889b == null || this.f28889b.intValue() == i2 - i)) {
                this.f28890c = true;
            }
            return;
        }
        this.f28890c = false;
    }
}
