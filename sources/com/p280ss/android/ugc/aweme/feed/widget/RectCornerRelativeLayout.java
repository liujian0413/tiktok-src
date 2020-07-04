package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.RectCornerRelativeLayout */
public final class RectCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C29055h f76573a;

    public final C29055h getMRectCornerHelper() {
        return this.f76573a;
    }

    public final float getBottomLeftRadius() {
        return this.f76573a.f76632a[4];
    }

    public final float getBottomRightRadius() {
        return this.f76573a.f76632a[6];
    }

    public final int getStrokeColor() {
        return this.f76573a.f76637f;
    }

    public final int getStrokeWidth() {
        return this.f76573a.f76639h;
    }

    public final float getTopLeftRadius() {
        return this.f76573a.f76632a[0];
    }

    public final float getTopRightRadius() {
        return this.f76573a.f76632a[2];
    }

    public final void invalidate() {
        if (this.f76573a != null) {
            this.f76573a.mo74471a((View) this);
        }
        super.invalidate();
    }

    public final void setClipBackground(boolean z) {
        this.f76573a.f76640i = z;
        invalidate();
    }

    public final void setMRectCornerHelper(C29055h hVar) {
        C7573i.m23587b(hVar, "<set-?>");
        this.f76573a = hVar;
    }

    public final void setRoundAsCircle(boolean z) {
        this.f76573a.f76635d = z;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.f76573a.f76637f = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.f76573a.f76639h = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        canvas.saveLayer(this.f76573a.mo74474c(), null, 31);
        super.dispatchDraw(canvas);
        this.f76573a.mo74470a(canvas);
        canvas.restore();
    }

    public final void setBottomLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f76573a.f76632a[6] = f;
        this.f76573a.f76632a[7] = f;
        invalidate();
    }

    public final void setBottomRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f76573a.f76632a[4] = f;
        this.f76573a.f76632a[5] = f;
        invalidate();
    }

    public final void setRadius(int i) {
        int length = this.f76573a.f76632a.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f76573a.f76632a[i2] = ((float) i) * 1.0f;
        }
        invalidate();
    }

    public final void setTopLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f76573a.f76632a[0] = f;
        this.f76573a.f76632a[1] = f;
        invalidate();
    }

    public final void setTopRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f76573a.f76632a[2] = f;
        this.f76573a.f76632a[3] = f;
        invalidate();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0 && !this.f76573a.mo74473b().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (action == 0 || action == 1) {
            refreshDrawableState();
        } else if (action == 3) {
            setPressed(false);
            refreshDrawableState();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        if (this.f76573a.f76640i) {
            canvas.save();
            canvas.clipPath(this.f76573a.mo74468a());
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public RectCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        this(context, attributeSet, 0);
    }

    public RectCornerRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
        this.f76573a = new C29055h();
        this.f76573a = new C29055h();
        this.f76573a.mo74469a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f76573a.mo74472a(this, i, i2);
    }
}
