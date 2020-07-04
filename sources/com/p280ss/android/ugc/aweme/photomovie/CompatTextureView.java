package com.p280ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.CompatTextureView */
public class CompatTextureView extends TextureView {
    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    public CompatTextureView(Context context) {
        super(context);
    }

    public CompatTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompatTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
