package com.facebook.react.flat;

import android.graphics.Canvas;
import android.text.Layout;
import com.facebook.fbui.textlayoutbuilder.p701c.C13459a;

final class DrawTextLayout extends AbstractDrawCommand {
    private Layout mLayout;
    private float mLayoutHeight;
    private float mLayoutWidth;

    public final Layout getLayout() {
        return this.mLayout;
    }

    public final float getLayoutHeight() {
        return this.mLayoutHeight;
    }

    public final float getLayoutWidth() {
        return this.mLayoutWidth;
    }

    DrawTextLayout(Layout layout) {
        setLayout(layout);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float left = getLeft();
        float top = getTop();
        canvas.translate(left, top);
        this.mLayout.draw(canvas);
        canvas.translate(-left, -top);
    }

    public final void setLayout(Layout layout) {
        this.mLayout = layout;
        this.mLayoutWidth = (float) layout.getWidth();
        this.mLayoutHeight = (float) C13459a.m39555b(layout);
    }
}
