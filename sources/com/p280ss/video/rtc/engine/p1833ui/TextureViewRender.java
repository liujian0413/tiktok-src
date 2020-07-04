package com.p280ss.video.rtc.engine.p1833ui;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.ss.video.rtc.engine.ui.TextureViewRender */
public class TextureViewRender extends ByteSurfaceView {
    public void release() {
        super.onDispose();
    }

    public TextureViewRender(Context context) {
        super(context);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
