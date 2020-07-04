package com.p280ss.android.ugc.aweme.profile.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.ss.android.ugc.aweme.profile.util.am */
public final class C36728am extends ImageSpan {

    /* renamed from: a */
    public int f96392a;

    public C36728am(Context context, int i, int i2) {
        super(context, i, 1);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f + ((float) this.f96392a), (float) ((i5 - drawable.getBounds().bottom) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }
}
