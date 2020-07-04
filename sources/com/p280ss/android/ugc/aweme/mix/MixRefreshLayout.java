package com.p280ss.android.ugc.aweme.mix;

import android.content.Context;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixRefreshLayout */
public final class MixRefreshLayout extends FeedSwipeRefreshLayout {
    public MixRefreshLayout(Context context) {
        this(context, null, 2, null);
    }

    public final void setRefreshHeader(C33569v vVar) {
        C7573i.m23587b(vVar, "head");
    }

    public MixRefreshLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    public /* synthetic */ MixRefreshLayout(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
