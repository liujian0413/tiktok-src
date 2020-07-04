package com.p280ss.android.ugc.aweme.commercialize.p1115ad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.a */
public final class C24509a extends ImageSpan {
    public C24509a(Context context, int i) {
        C7573i.m23587b(context, "context");
        super(context, i);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C7573i.m23587b(paint, "paint");
        C7573i.m23587b(charSequence, "text");
        Drawable drawable = getDrawable();
        C7573i.m23582a((Object) drawable, "d");
        Rect bounds = drawable.getBounds();
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
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(charSequence, "text");
        C7573i.m23587b(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.descent + fontMetricsInt.ascent;
        C7573i.m23582a((Object) drawable, "b");
        canvas.translate(f, (float) (i4 + ((i6 - drawable.getBounds().bottom) / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
