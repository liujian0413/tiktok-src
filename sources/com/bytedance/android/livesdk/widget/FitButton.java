package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Paint;
import android.support.p029v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;

public class FitButton extends AppCompatButton {

    /* renamed from: b */
    private Paint f25001b;

    /* renamed from: c */
    private float f25002c;

    /* renamed from: d */
    private float f25003d;

    /* renamed from: b */
    private void m27350b() {
        this.f25001b = new TextPaint();
        this.f25001b.set(getPaint());
        this.f25002c = getTextSize();
    }

    public FitButton(Context context) {
        this(context, null);
    }

    public FitButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25003d = 6.0f;
        m27350b();
    }

    /* renamed from: a */
    private static float m27348a(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m27349a(charSequence.toString(), getWidth());
    }

    /* renamed from: a */
    private void m27349a(String str, int i) {
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f = this.f25002c;
            this.f25001b.setTextSize(f);
            while (true) {
                if (this.f25001b.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f -= 1.0f;
                if (f <= this.f25003d) {
                    f = this.f25003d;
                    break;
                }
                this.f25001b.setTextSize(f);
            }
            setTextSize(m27348a(getContext(), f));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            m27349a(getText().toString(), i);
        }
    }
}
