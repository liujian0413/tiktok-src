package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.ss.android.ugc.aweme.views.HotSearchClipLinearLayout */
public class HotSearchClipLinearLayout extends LinearLayout {

    /* renamed from: a */
    Path f112263a = new Path();

    /* renamed from: b */
    private int f112264b;

    /* renamed from: a */
    private void m137589a() {
        this.f112264b = (int) C9738o.m28708b(getContext(), 12.0f);
    }

    public HotSearchClipLinearLayout(Context context) {
        super(context);
        m137589a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f112263a.reset();
        this.f112263a.addRoundRect(new RectF(0.0f, (float) ((getMeasuredHeight() / 2) - this.f112264b), (float) getMeasuredWidth(), (float) ((getMeasuredHeight() / 2) + this.f112264b)), (float) this.f112264b, (float) this.f112264b, Direction.CW);
        canvas.clipPath(this.f112263a);
    }

    public HotSearchClipLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m137589a();
    }

    public HotSearchClipLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m137589a();
    }
}
