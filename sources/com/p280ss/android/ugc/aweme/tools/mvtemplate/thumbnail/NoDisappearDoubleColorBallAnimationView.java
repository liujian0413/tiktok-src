package com.p280ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DoubleColorBallAnimationView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.NoDisappearDoubleColorBallAnimationView */
public final class NoDisappearDoubleColorBallAnimationView extends DoubleColorBallAnimationView {
    public NoDisappearDoubleColorBallAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            mo25976a();
        }
    }

    public NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
