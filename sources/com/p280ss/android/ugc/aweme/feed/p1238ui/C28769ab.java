package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ab */
public final class C28769ab extends ImageSpan {
    public C28769ab(Context context, int i) {
        C7573i.m23587b(context, "context");
        super(context, R.drawable.a_k);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(charSequence, "text");
        C7573i.m23587b(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = (((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2;
        C7573i.m23582a((Object) drawable, "d");
        canvas.translate(f, (float) (i6 - (drawable.getBounds().bottom / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
