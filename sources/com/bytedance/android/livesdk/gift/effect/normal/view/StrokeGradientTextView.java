package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class StrokeGradientTextView extends TextView {

    /* renamed from: a */
    private TextView f21963a;

    /* renamed from: a */
    private void m24715a() {
        TextPaint paint = this.f21963a.getPaint();
        paint.setStrokeWidth(getResources().getDimension(R.dimen.ph));
        paint.setStyle(Style.STROKE);
        this.f21963a.setTextColor(getResources().getColor(R.color.aj4));
        this.f21963a.setGravity(getGravity());
    }

    public StrokeGradientTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f21963a.draw(canvas);
        super.onDraw(canvas);
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f21963a.setLayoutParams(layoutParams);
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        this.f21963a.setTextSize(f);
    }

    public StrokeGradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.f21963a.setTextSize(i, f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        CharSequence text = this.f21963a.getText();
        if (text == null || !text.equals(getText())) {
            this.f21963a.setText(getText());
            postInvalidate();
        }
        this.f21963a.measure(i, i2);
    }

    public StrokeGradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21963a = new TextView(context, attributeSet, i);
        m24715a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f21963a.layout(i, i2, i3, i4);
        TextPaint paint = getPaint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), getResources().getColor(R.color.aj7), getResources().getColor(R.color.aj6), TileMode.CLAMP);
        paint.setShader(linearGradient);
    }
}
