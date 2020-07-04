package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorCircleView */
public class ColorCircleView extends View {

    /* renamed from: a */
    public boolean f109283a;

    /* renamed from: b */
    private Paint f109284b;

    /* renamed from: c */
    private Paint f109285c;

    /* renamed from: d */
    private int f109286d;

    /* renamed from: e */
    private int f109287e;

    /* renamed from: a */
    public final void mo103307a() {
        invalidate();
    }

    public int getColor() {
        return this.f109287e;
    }

    /* renamed from: b */
    private void m133777b() {
        this.f109285c = new Paint();
        this.f109285c.setColor(-1);
        this.f109285c.setAntiAlias(true);
        this.f109285c.setStyle(Style.STROKE);
        this.f109285c.setStrokeWidth((float) this.f109286d);
        this.f109284b = new Paint();
        this.f109284b.setColor(this.f109287e);
        this.f109284b.setAntiAlias(true);
        this.f109284b.setStyle(Style.FILL);
        this.f109284b.setStrokeWidth((float) this.f109286d);
    }

    public ColorCircleView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final ColorCircleView mo103306a(int i) {
        this.f109287e = i;
        this.f109284b.setColor(this.f109287e);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        float f = (float) width;
        canvas.drawCircle(f, f, (float) ((width - this.f109286d) - 4), this.f109285c);
        canvas.drawCircle(f, f, (float) (width - (this.f109286d * 2)), this.f109284b);
    }

    public ColorCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109286d = 6;
        this.f109287e = -1;
        m133777b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }
}
