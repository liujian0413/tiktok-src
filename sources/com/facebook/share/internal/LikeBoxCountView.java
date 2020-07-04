package com.facebook.share.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class LikeBoxCountView extends FrameLayout {

    /* renamed from: a */
    private TextView f37445a;

    /* renamed from: b */
    private LikeBoxCountViewCaretPosition f37446b;

    /* renamed from: c */
    private float f37447c;

    /* renamed from: d */
    private float f37448d;

    /* renamed from: e */
    private float f37449e;

    /* renamed from: f */
    private Paint f37450f;

    /* renamed from: g */
    private int f37451g;

    /* renamed from: h */
    private int f37452h;

    public enum LikeBoxCountViewCaretPosition {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    public final void setText(String str) {
        this.f37445a.setText(str);
    }

    public final void setCaretPosition(LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition) {
        this.f37446b = likeBoxCountViewCaretPosition;
        switch (likeBoxCountViewCaretPosition) {
            case LEFT:
                m41820a(this.f37452h, 0, 0, 0);
                return;
            case TOP:
                m41820a(0, this.f37452h, 0, 0);
                return;
            case RIGHT:
                m41820a(0, 0, this.f37452h, 0);
                return;
            case BOTTOM:
                m41820a(0, 0, 0, this.f37452h);
                break;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        switch (this.f37446b) {
            case LEFT:
                paddingLeft = (int) (((float) paddingLeft) + this.f37447c);
                break;
            case TOP:
                paddingTop = (int) (((float) paddingTop) + this.f37447c);
                break;
            case RIGHT:
                width = (int) (((float) width) - this.f37447c);
                break;
            case BOTTOM:
                height = (int) (((float) height) - this.f37447c);
                break;
        }
        m41821a(canvas, (float) paddingLeft, (float) paddingTop, (float) width, (float) height);
    }

    /* renamed from: a */
    private void m41820a(int i, int i2, int i3, int i4) {
        this.f37445a.setPadding(this.f37451g + i, this.f37451g + i2, this.f37451g + i3, this.f37451g + i4);
    }

    /* renamed from: a */
    private void m41821a(Canvas canvas, float f, float f2, float f3, float f4) {
        Path path = new Path();
        float f5 = this.f37449e * 2.0f;
        float f6 = f + f5;
        float f7 = f2 + f5;
        path.addArc(new RectF(f, f2, f6, f7), -180.0f, 90.0f);
        if (this.f37446b == LikeBoxCountViewCaretPosition.TOP) {
            float f8 = f3 - f;
            path.lineTo(((f8 - this.f37448d) / 2.0f) + f, f2);
            path.lineTo((f8 / 2.0f) + f, f2 - this.f37447c);
            path.lineTo(((f8 + this.f37448d) / 2.0f) + f, f2);
        }
        path.lineTo(f3 - this.f37449e, f2);
        float f9 = f3 - f5;
        path.addArc(new RectF(f9, f2, f3, f7), -90.0f, 90.0f);
        if (this.f37446b == LikeBoxCountViewCaretPosition.RIGHT) {
            float f10 = f4 - f2;
            path.lineTo(f3, ((f10 - this.f37448d) / 2.0f) + f2);
            path.lineTo(this.f37447c + f3, (f10 / 2.0f) + f2);
            path.lineTo(f3, ((f10 + this.f37448d) / 2.0f) + f2);
        }
        path.lineTo(f3, f4 - this.f37449e);
        float f11 = f4 - f5;
        path.addArc(new RectF(f9, f11, f3, f4), 0.0f, 90.0f);
        if (this.f37446b == LikeBoxCountViewCaretPosition.BOTTOM) {
            float f12 = f3 - f;
            path.lineTo(((this.f37448d + f12) / 2.0f) + f, f4);
            path.lineTo((f12 / 2.0f) + f, this.f37447c + f4);
            path.lineTo(((f12 - this.f37448d) / 2.0f) + f, f4);
        }
        path.lineTo(this.f37449e + f, f4);
        path.addArc(new RectF(f, f11, f6, f4), 90.0f, 90.0f);
        if (this.f37446b == LikeBoxCountViewCaretPosition.LEFT) {
            float f13 = f4 - f2;
            path.lineTo(f, ((this.f37448d + f13) / 2.0f) + f2);
            path.lineTo(f - this.f37447c, (f13 / 2.0f) + f2);
            path.lineTo(f, ((f13 - this.f37448d) / 2.0f) + f2);
        }
        path.lineTo(f, f2 + this.f37449e);
        canvas.drawPath(path, this.f37450f);
    }
}
