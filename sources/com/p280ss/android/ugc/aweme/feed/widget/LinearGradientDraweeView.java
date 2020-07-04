package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import com.bytedance.ies.ugc.aweme.common.p575ui.R$styleable;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView */
public class LinearGradientDraweeView extends SmartImageView {

    /* renamed from: a */
    private int f76496a;

    /* renamed from: b */
    private int f76497b;

    /* renamed from: c */
    private int f76498c;

    /* renamed from: d */
    private Paint f76499d;

    /* renamed from: e */
    private LinearGradient f76500e;

    public LinearGradientDraweeView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f76496a > 0) {
            int height = getHeight() - this.f76496a;
            if (this.f76500e == null) {
                LinearGradient linearGradient = new LinearGradient(0.0f, (float) height, 0.0f, (float) getHeight(), new int[]{this.f76497b, this.f76498c}, null, TileMode.CLAMP);
                this.f76500e = linearGradient;
                this.f76499d.setShader(this.f76500e);
            }
            canvas.drawRect(0.0f, (float) height, (float) getWidth(), (float) getHeight(), this.f76499d);
        }
    }

    public LinearGradientDraweeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearGradientDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76499d = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinearGradientDraweeView);
        this.f76497b = obtainStyledAttributes.getColor(2, 0);
        this.f76498c = obtainStyledAttributes.getColor(0, 0);
        this.f76496a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
