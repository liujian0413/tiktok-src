package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.views.WorkaroundRemoteImageView */
public final class WorkaroundRemoteImageView extends RemoteImageView {
    public WorkaroundRemoteImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public WorkaroundRemoteImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void onAttachedToWindow() {
        m137622b();
        super.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        m137622b();
        super.onDetachedFromWindow();
    }

    public final void onFinishTemporaryDetach() {
        m137622b();
        super.onFinishTemporaryDetach();
    }

    public final void onStartTemporaryDetach() {
        m137622b();
        super.onStartTemporaryDetach();
    }

    /* renamed from: b */
    private final void m137622b() {
        boolean z;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        m137622b();
    }

    public final void setVisibility(int i) {
        m137622b();
        super.setVisibility(i);
    }

    public WorkaroundRemoteImageView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ WorkaroundRemoteImageView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
