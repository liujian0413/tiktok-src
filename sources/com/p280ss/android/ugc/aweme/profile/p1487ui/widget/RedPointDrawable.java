package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RedPointDrawable */
public final class RedPointDrawable extends Drawable {

    /* renamed from: a */
    public int f96225a;

    /* renamed from: b */
    public Position f96226b;

    /* renamed from: c */
    private Drawable f96227c;

    /* renamed from: d */
    private boolean f96228d;

    /* renamed from: e */
    private Paint f96229e;

    /* renamed from: f */
    private int f96230f;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RedPointDrawable$Position */
    public enum Position {
        LeftTop,
        LeftBottom,
        RightTop,
        RightBottom
    }

    public final int getIntrinsicHeight() {
        return this.f96227c.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f96227c.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.f96227c.getOpacity();
    }

    public final void setAlpha(int i) {
        this.f96227c.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f96227c.setColorFilter(colorFilter);
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f96227c.setBounds(rect);
    }

    public final void draw(Canvas canvas) {
        int i;
        this.f96227c.draw(canvas);
        if (this.f96228d) {
            int i2 = -1;
            if (this.f96226b == Position.RightTop) {
                i2 = getBounds().right;
                i = getBounds().top;
            } else if (this.f96226b == Position.LeftTop) {
                i2 = getBounds().left;
                i = getBounds().top;
            } else if (this.f96226b == Position.RightBottom) {
                i2 = getBounds().right;
                i = getBounds().bottom;
            } else if (this.f96226b == Position.LeftBottom) {
                i2 = getBounds().left;
                i = getBounds().bottom;
            } else {
                i = -1;
            }
            if ((this.f96230f & 3) == 3) {
                i2 -= this.f96225a;
            } else if ((this.f96230f & 5) == 5) {
                i2 += this.f96225a;
            }
            if ((this.f96230f & 48) == 48) {
                i -= this.f96225a;
            } else if ((this.f96230f & 80) == 80) {
                i += this.f96225a;
            }
            canvas.drawCircle((float) i2, (float) i, (float) this.f96225a, this.f96229e);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f96227c.setBounds(i, i2, i3, i4);
    }
}
