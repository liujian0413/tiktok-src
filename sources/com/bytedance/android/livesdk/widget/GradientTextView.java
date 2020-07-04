package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;
import android.support.p029v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.util.AttributeSet;

public class GradientTextView extends AppCompatTextView {

    /* renamed from: b */
    private int[] f25015b;

    /* renamed from: c */
    private boolean f25016c;

    /* renamed from: d */
    private boolean f25017d;

    public void setColorList(int[] iArr) {
        this.f25015b = iArr;
    }

    public void setGradient(boolean z) {
        this.f25016c = z;
    }

    public GradientTextView(Context context) {
        this(context, null);
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25016c = true;
        this.f25015b = new int[]{-39936, -26573};
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            if (this.f25016c) {
                TextPaint paint = getPaint();
                if (this.f25017d) {
                    f = (float) getWidth();
                } else {
                    f = 0.0f;
                }
                if (this.f25017d) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) getHeight();
                }
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, f2, this.f25015b[0], this.f25015b[1], TileMode.CLAMP);
                paint.setShader(linearGradient);
                return;
            }
            getPaint().setShader(null);
        }
    }
}
