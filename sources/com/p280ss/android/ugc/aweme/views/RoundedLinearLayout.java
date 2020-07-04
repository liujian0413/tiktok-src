package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.views.RoundedLinearLayout */
public class RoundedLinearLayout extends LinearLayout {

    /* renamed from: a */
    private Path f112286a;

    /* renamed from: b */
    private int f112287b;

    public RoundedLinearLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f112287b == 0 || VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f112286a == null && this.f112287b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                this.f112286a = new Path();
                this.f112286a.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), new float[]{(float) this.f112287b, (float) this.f112287b, (float) this.f112287b, (float) this.f112287b, (float) this.f112287b, (float) this.f112287b, (float) this.f112287b, (float) this.f112287b}, Direction.CW);
            }
        }
        if (this.f112286a != null) {
            canvas.clipPath(this.f112286a);
        }
        super.dispatchDraw(canvas);
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m137599a(int i, int i2) {
        if (this.f112287b > 0 && VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new C43375k((float) this.f112287b, i, i2));
        }
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RoundedView, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f112287b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f112287b == 0 || VERSION.SDK_INT >= 21) {
            m137599a(i, i2);
        }
    }
}
