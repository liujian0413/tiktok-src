package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p029v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.MaskBlurLightTextView */
public class MaskBlurLightTextView extends AppCompatTextView {
    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public MaskBlurLightTextView(Context context) {
        this(context, null);
    }

    public void setMaskBlurColor(int i) {
        setShadowLayer(10.0f, 0.0f, 0.0f, i);
    }

    public MaskBlurLightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
