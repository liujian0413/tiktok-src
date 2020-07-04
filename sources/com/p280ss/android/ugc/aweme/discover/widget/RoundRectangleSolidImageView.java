package com.p280ss.android.ugc.aweme.discover.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.support.p029v7.widget.AppCompatImageView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.RoundRectangleSolidImageView */
public final class RoundRectangleSolidImageView extends AppCompatImageView {

    /* renamed from: a */
    private float f71851a;

    /* renamed from: b */
    private int f71852b;

    /* renamed from: c */
    private Path f71853c;

    /* renamed from: d */
    private RectF f71854d;

    public final int getColor$main_musicallyI18nRelease() {
        return this.f71852b;
    }

    public final float getRadius$main_musicallyI18nRelease() {
        return this.f71851a;
    }

    public final void setColor$main_musicallyI18nRelease(int i) {
        this.f71852b = i;
        invalidate();
    }

    public final void setRadius$main_musicallyI18nRelease(float f) {
        this.f71851a = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        canvas.clipPath(this.f71853c);
        canvas.drawColor(this.f71852b);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f71854d.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        this.f71853c.addRoundRect(this.f71854d, this.f71851a, this.f71851a, Direction.CW);
    }
}
