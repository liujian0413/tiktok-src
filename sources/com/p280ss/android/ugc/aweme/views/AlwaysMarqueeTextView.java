package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.views.AlwaysMarqueeTextView */
public final class AlwaysMarqueeTextView extends DmtTextView {
    public final boolean isFocused() {
        return true;
    }

    public AlwaysMarqueeTextView(Context context) {
        super(context);
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
