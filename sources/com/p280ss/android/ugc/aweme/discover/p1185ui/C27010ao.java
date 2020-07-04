package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ao */
public final class C27010ao extends ReplacementSpan {

    /* renamed from: a */
    public int f71299a;

    /* renamed from: b */
    private int f71300b = 17;

    /* renamed from: c */
    private View f71301c;

    /* renamed from: d */
    private TextView f71302d;

    /* renamed from: e */
    private boolean f71303e = true;

    /* renamed from: f */
    private boolean f71304f = true;

    /* renamed from: a */
    public final int mo69792a() {
        if (this.f71303e && this.f71301c != null) {
            return this.f71301c.getMeasuredWidth() + this.f71299a;
        }
        return 0;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return mo69792a();
    }

    public C27010ao(TextView textView, View view, int i, boolean z, boolean z2) {
        this.f71302d = textView;
        this.f71301c = view;
    }

    /* renamed from: a */
    private void m88763a(CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        if (this.f71301c != null) {
            int measuredHeight = this.f71301c.getMeasuredHeight();
            int i6 = 0;
            if (measuredHeight < i4) {
                int i7 = this.f71300b;
                if (i7 != 48) {
                    if (i7 != 80) {
                        i3 += (i4 - measuredHeight) / 2;
                    } else {
                        i3 = (i3 + i4) - measuredHeight;
                    }
                }
            } else {
                i3 = 0;
            }
            boolean a = C30357c.m99191a(charSequence.toString(), this.f71302d);
            int[] iArr = new int[2];
            this.f71302d.getLocationInWindow(iArr);
            if (iArr[0] >= 0 && iArr[0] <= C9738o.m28691a(this.f71301c.getContext())) {
                View view = this.f71301c;
                int i8 = iArr[0] + i2;
                if (a) {
                    i6 = this.f71299a;
                }
                view.setX((float) (i8 + i6));
                this.f71301c.setY((float) (iArr[1] + i3));
            }
        }
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f71304f) {
            int lineHeight = this.f71302d.getLineHeight();
            CharSequence charSequence2 = charSequence;
            int i6 = i;
            m88763a(charSequence2, i6, (int) f, lineHeight * ((int) (((((float) i3) * 1.0f) / ((float) lineHeight)) + 0.5f)), lineHeight, canvas.getWidth());
        }
    }
}
