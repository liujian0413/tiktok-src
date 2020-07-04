package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.views.RoundedRelativeLayout */
public class RoundedRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private Path f112288a;

    /* renamed from: b */
    private int f112289b;

    public RoundedRelativeLayout(Context context) {
        this(context, null);
    }

    public void setBorderRadius(int i) {
        this.f112289b = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f112289b == 0 || VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f112288a == null && this.f112289b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                this.f112288a = new Path();
                this.f112288a.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), new float[]{(float) this.f112289b, (float) this.f112289b, (float) this.f112289b, (float) this.f112289b, (float) this.f112289b, (float) this.f112289b, (float) this.f112289b, (float) this.f112289b}, Direction.CW);
            }
        }
        if (this.f112288a != null) {
            canvas.clipPath(this.f112288a);
        }
        super.dispatchDraw(canvas);
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m137600a(int i, int i2) {
        if (this.f112289b > 0 && VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new C43375k((float) this.f112289b, i, i2));
        }
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RoundedView, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f112289b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f112289b == 0 || VERSION.SDK_INT >= 21) {
            m137600a(i, i2);
        }
    }
}
