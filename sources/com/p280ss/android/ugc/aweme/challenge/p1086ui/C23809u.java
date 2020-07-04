package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.u */
public final class C23809u extends ImageSpan {

    /* renamed from: b */
    private static int f62848b;

    /* renamed from: a */
    private Context f62849a;

    /* renamed from: c */
    private WeakReference<Drawable> f62850c;

    /* renamed from: a */
    private Drawable m78020a() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f62850c;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f62850c = new WeakReference<>(drawable2);
        return drawable2;
    }

    public C23809u(Context context, int i) {
        super(context, R.drawable.a9h);
        this.f62849a = context;
        f62848b = (int) C9738o.m28708b(this.f62849a, 2.0f);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = m78020a().getBounds();
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt();
            fontMetricsInt.ascent = (-bounds.bottom) - ((paint.getFontMetricsInt().ascent - paint.getFontMetricsInt().top) + f62848b);
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable a = m78020a();
        canvas.save();
        canvas.translate(f, (float) (((i3 + paint.getFontMetricsInt().ascent) - paint.getFontMetricsInt().top) + f62848b));
        a.draw(canvas);
        canvas.restore();
    }
}
