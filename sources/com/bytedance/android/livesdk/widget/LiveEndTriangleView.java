package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class LiveEndTriangleView extends View {

    /* renamed from: a */
    private Paint f25018a;

    /* renamed from: b */
    private Path f25019b;

    /* renamed from: a */
    private void m27358a() {
        this.f25018a = new Paint();
        this.f25018a.setAntiAlias(true);
        this.f25018a.setStyle(Style.FILL);
        this.f25018a.setColor(Color.parseColor("#14ffffff"));
        this.f25019b = new Path();
    }

    public LiveEndTriangleView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f25019b.moveTo(0.0f, (float) getMeasuredHeight());
        this.f25019b.lineTo((float) getMeasuredWidth(), (float) getMeasuredHeight());
        this.f25019b.lineTo((float) (getMeasuredWidth() / 2), 0.0f);
        this.f25019b.close();
        canvas.drawPath(this.f25019b, this.f25018a);
    }

    public LiveEndTriangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveEndTriangleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m27358a();
    }
}
