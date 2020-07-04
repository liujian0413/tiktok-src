package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;

public class RoundRectWebView extends SSWebView {
    private boolean needCleanRadius;
    private Paint paint;
    private Path path;
    private float radius;
    private float radiusBottomLeft;
    private float radiusBottomRight;
    private float radiusTopLeft;
    private float radiusTopRight;
    private RectF rect;

    private void init() {
        this.path = new Path();
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.paint.setStyle(Style.FILL);
        this.paint.setColor(0);
        this.paint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
    }

    public RoundRectWebView(Context context) {
        super(context);
        init();
    }

    public void setRadius(float f) {
        this.radius = f;
        this.needCleanRadius = true;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.radius != 0.0f) {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(FillType.INVERSE_WINDING);
            this.path.addRoundRect(this.rect, this.radius, this.radius, Direction.CW);
            canvas.drawPath(this.path, this.paint);
        } else if (this.radiusTopLeft == 0.0f && this.radiusTopRight == 0.0f && this.radiusBottomRight == 0.0f && this.radiusBottomLeft == 0.0f) {
            if (this.needCleanRadius) {
                this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
                this.path.reset();
                this.path.setFillType(FillType.INVERSE_WINDING);
                this.path.addRoundRect(this.rect, 0.0f, 0.0f, Direction.CW);
                canvas.drawPath(this.path, this.paint);
            }
        } else {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(FillType.INVERSE_WINDING);
            this.path.addRoundRect(this.rect, new float[]{this.radiusTopLeft, this.radiusTopLeft, this.radiusTopRight, this.radiusTopRight, this.radiusBottomRight, this.radiusBottomRight, this.radiusBottomLeft, this.radiusBottomLeft}, Direction.CW);
            canvas.drawPath(this.path, this.paint);
        }
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.radius = 0.0f;
        this.radiusTopLeft = f;
        this.radiusTopRight = f2;
        this.radiusBottomRight = f3;
        this.radiusBottomLeft = f4;
        this.needCleanRadius = true;
        invalidate();
    }
}
