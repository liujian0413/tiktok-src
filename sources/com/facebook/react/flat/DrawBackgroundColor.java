package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Paint;

final class DrawBackgroundColor extends AbstractDrawCommand {
    private static final Paint PAINT = new Paint();
    private final int mBackgroundColor;

    DrawBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public final void onDraw(Canvas canvas) {
        PAINT.setColor(this.mBackgroundColor);
        canvas.drawRect(getLeft(), getTop(), getRight(), getBottom(), PAINT);
    }
}
