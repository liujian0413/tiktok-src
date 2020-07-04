package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.views.RoundedFrameLayout */
public class RoundedFrameLayout extends FrameLayout {

    /* renamed from: a */
    private Path f112284a;

    /* renamed from: b */
    private int f112285b;

    public RoundedFrameLayout(Context context) {
        this(context, null);
    }

    public void setRadius(int i) {
        this.f112285b = i;
        m137598a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f112285b == 0 || VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f112284a == null && this.f112285b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                this.f112284a = new Path();
                this.f112284a.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), new float[]{(float) this.f112285b, (float) this.f112285b, (float) this.f112285b, (float) this.f112285b, (float) this.f112285b, (float) this.f112285b, (float) this.f112285b, (float) this.f112285b}, Direction.CW);
            }
        }
        if (this.f112284a != null) {
            canvas.clipPath(this.f112284a);
        }
        super.dispatchDraw(canvas);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m137598a(int i, int i2) {
        if (this.f112285b > 0 && VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new C43375k((float) this.f112285b, i, i2));
        }
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RoundedView, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f112285b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f112285b == 0 || VERSION.SDK_INT >= 21) {
            m137598a(i, i2);
        }
    }
}
