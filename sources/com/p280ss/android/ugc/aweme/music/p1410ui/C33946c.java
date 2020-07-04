package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.common.utility.C9738o;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.c */
public final class C33946c extends ImageSpan {

    /* renamed from: a */
    private final Context f88575a;

    /* renamed from: b */
    private final Drawable f88576b;

    /* renamed from: c */
    private final int f88577c = 2;

    public C33946c(Context context, Drawable drawable, int i) {
        C7573i.m23587b(context, "mContext");
        C7573i.m23587b(drawable, "mDrawable");
        super(drawable);
        this.f88575a = context;
        this.f88576b = drawable;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C7573i.m23587b(paint, "paint");
        C7573i.m23587b(charSequence, "text");
        Drawable drawable = getDrawable();
        if (drawable == null) {
            drawable = this.f88576b;
        }
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
        return bounds.right + ((int) C9738o.m28708b(this.f88575a, (float) this.f88577c));
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(charSequence, "text");
        C7573i.m23587b(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        int i6 = i5 - i3;
        C7573i.m23582a((Object) drawable, "drawable");
        canvas.translate(f, (float) (((i6 - drawable.getBounds().bottom) / 2) + i3));
        drawable.draw(canvas);
        canvas.restore();
    }
}
