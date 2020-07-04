package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.common.utility.C9738o;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.a */
public final class C27273a extends ImageSpan {

    /* renamed from: a */
    private float f71870a;

    /* renamed from: b */
    private float f71871b;

    /* renamed from: c */
    private final Context f71872c;

    /* renamed from: d */
    private final Drawable f71873d;

    /* renamed from: e */
    private final int f71874e = 4;

    /* renamed from: f */
    private final int f71875f = 0;

    public C27273a(Context context, Drawable drawable, int i, int i2) {
        C7573i.m23587b(context, "mContext");
        C7573i.m23587b(drawable, "mDrawable");
        super(drawable);
        this.f71872c = context;
        this.f71873d = drawable;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C7573i.m23587b(paint, "paint");
        C7573i.m23587b(charSequence, "text");
        Drawable drawable = getDrawable();
        if (drawable == null) {
            drawable = this.f71873d;
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
        this.f71870a = C9738o.m28708b(this.f71872c, (float) this.f71874e);
        this.f71871b = C9738o.m28708b(this.f71872c, (float) this.f71875f);
        return bounds.right + ((int) this.f71870a) + ((int) this.f71871b);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(charSequence, "text");
        C7573i.m23587b(paint, "paint");
        Drawable drawable = getDrawable();
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = (((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2;
        C7573i.m23582a((Object) drawable, "b");
        int i7 = i6 - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f + this.f71870a, (float) i7);
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
