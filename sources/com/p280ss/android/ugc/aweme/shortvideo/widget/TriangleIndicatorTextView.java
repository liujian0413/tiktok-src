package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TriangleIndicatorTextView */
public class TriangleIndicatorTextView extends DmtTextView {

    /* renamed from: b */
    final RectF f108414b;

    /* renamed from: c */
    final Paint f108415c;

    /* renamed from: d */
    float f108416d;

    /* renamed from: e */
    float f108417e;

    /* renamed from: f */
    float f108418f;

    /* renamed from: g */
    public boolean f108419g;

    public void dismiss() {
        animate().alpha(0.0f).setDuration(300).start();
        this.f108419g = false;
    }

    public void setIndicatorOffset(float f) {
        this.f108416d = f - (this.f108417e / 1.41421f);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        canvas.save();
        canvas.clipRect(0, measuredHeight, measuredWidth, measuredHeight * 2);
        canvas.translate(this.f108416d, ((float) measuredHeight) - this.f108418f);
        canvas.rotate(-45.0f);
        this.f108414b.right = this.f108417e;
        this.f108414b.bottom = this.f108417e;
        canvas.drawRoundRect(this.f108414b, this.f108418f, this.f108418f, this.f108415c);
        canvas.restore();
    }
}
