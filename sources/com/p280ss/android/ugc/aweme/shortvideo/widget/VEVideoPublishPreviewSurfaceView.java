package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.VEVideoPublishPreviewSurfaceView */
public final class VEVideoPublishPreviewSurfaceView extends SurfaceView {
    public VEVideoPublishPreviewSurfaceView(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        setWillNotDraw(false);
    }

    public VEVideoPublishPreviewSurfaceView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attr");
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public VEVideoPublishPreviewSurfaceView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attr");
        super(context, attributeSet, i);
        setWillNotDraw(false);
    }
}
