package com.p280ss.video.rtc.engine.p1833ui;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.ss.video.rtc.engine.ui.SurfaceViewRenderer */
public class SurfaceViewRenderer extends ByteSurfaceView {
    public void release() {
        super.onDispose();
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
