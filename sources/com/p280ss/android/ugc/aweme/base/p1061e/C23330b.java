package com.p280ss.android.ugc.aweme.base.p1061e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.ss.android.ugc.aweme.base.e.b */
public final class C23330b extends ImageSpan {

    /* renamed from: a */
    public int f61405a;

    public C23330b(Context context, int i, int i2) {
        super(context, i, 1);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        int i6 = i5 - drawable.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i6 -= paint.getFontMetricsInt().descent;
        }
        canvas.translate(f + ((float) this.f61405a), (float) i6);
        drawable.draw(canvas);
        canvas.restore();
    }
}
