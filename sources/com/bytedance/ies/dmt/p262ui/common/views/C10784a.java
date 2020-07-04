package com.bytedance.ies.dmt.p262ui.common.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.a */
public final class C10784a extends ReplacementSpan {

    /* renamed from: a */
    public C10785a f28931a;

    /* renamed from: com.bytedance.ies.dmt.ui.common.views.a$a */
    public interface C10785a {
        /* renamed from: a */
        void mo25799a(int i, int i2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return 0;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f28931a != null) {
            this.f28931a.mo25799a((int) f, i3);
        }
    }
}
