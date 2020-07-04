package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;

public class FitTextView extends LiveTextView {

    /* renamed from: d */
    private Paint f10230d;

    /* renamed from: e */
    private float f10231e;

    /* renamed from: f */
    private float f10232f;

    /* renamed from: a */
    private void m12694a() {
        this.f10230d = new TextPaint();
        this.f10230d.set(getPaint());
        this.f10231e = getTextSize();
    }

    public FitTextView(Context context) {
        this(context, null);
    }

    public FitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10232f = 6.0f;
        m12694a();
    }

    /* renamed from: a */
    private static float m12693a(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m12695a(charSequence.toString(), getWidth());
    }

    /* renamed from: a */
    private void m12695a(String str, int i) {
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f = this.f10231e;
            this.f10230d.setTextSize(f);
            while (true) {
                if (this.f10230d.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f -= 1.0f;
                if (f <= this.f10232f) {
                    f = this.f10232f;
                    break;
                }
                this.f10230d.setTextSize(f);
            }
            setTextSize(m12693a(getContext(), f));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            m12695a(getText().toString(), i);
        }
    }
}
