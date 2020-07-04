package com.bytedance.ies.dmt.p262ui.widget.util;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.FontSpan */
public class FontSpan extends TypefaceSpan {

    /* renamed from: a */
    private final Typeface f29314a;

    public void updateDrawState(TextPaint textPaint) {
        m31776a(textPaint, this.f29314a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m31776a(textPaint, this.f29314a);
    }

    /* renamed from: a */
    private void m31775a(Paint paint) {
        int i;
        String family = getFamily();
        Typeface typeface = paint.getTypeface();
        if (typeface == null) {
            i = 0;
        } else {
            i = typeface.getStyle();
        }
        Typeface create = Typeface.create(family, i);
        int style = i & (create.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(create);
    }

    /* renamed from: a */
    private void m31776a(Paint paint, Typeface typeface) {
        int i;
        if (typeface == null) {
            m31775a(paint);
            return;
        }
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            i = 0;
        } else {
            i = typeface2.getStyle();
        }
        int style = i & (typeface.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if (C10834d.f29332b.equals(getFamily())) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
