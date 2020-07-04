package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.bytedance.android.live.p169ui.R$styleable;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveRoundImageView */
public class LiveRoundImageView extends AppCompatImageView {

    /* renamed from: a */
    private int f15052a;

    /* renamed from: b */
    private int f15053b;

    /* renamed from: c */
    private int f15054c;

    /* renamed from: d */
    private int f15055d;

    public LiveRoundImageView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(this.f15052a, this.f15053b) + Math.max(this.f15054c, this.f15055d);
        if (width >= Math.max(this.f15052a, this.f15054c) + Math.max(this.f15053b, this.f15055d) && height > max) {
            Path path = new Path();
            path.moveTo((float) this.f15052a, 0.0f);
            path.lineTo((float) (width - this.f15053b), 0.0f);
            float f = (float) width;
            path.quadTo(f, 0.0f, f, (float) this.f15053b);
            path.lineTo(f, (float) (height - this.f15055d));
            float f2 = (float) height;
            path.quadTo(f, f2, (float) (width - this.f15055d), f2);
            path.lineTo((float) this.f15054c, f2);
            path.quadTo(0.0f, f2, 0.0f, (float) (height - this.f15054c));
            path.lineTo(0.0f, (float) this.f15052a);
            path.quadTo(0.0f, 0.0f, (float) this.f15052a, 0.0f);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public LiveRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_LiveRoundImageView);
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            this.f15052a = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f15053b = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            this.f15054c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.f15055d = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            if (this.f15052a == 0) {
                this.f15052a = dimensionPixelOffset;
            }
            if (this.f15053b == 0) {
                this.f15053b = dimensionPixelOffset;
            }
            if (this.f15054c == 0) {
                this.f15054c = dimensionPixelOffset;
            }
            if (this.f15055d == 0) {
                this.f15055d = dimensionPixelOffset;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
