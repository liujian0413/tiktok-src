package com.p280ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileTabView */
public abstract class MusProfileTabView extends RelativeLayout {
    public abstract void setAnimationEnabled(boolean z);

    public MusProfileTabView(Context context) {
        super(context);
    }

    public MusProfileTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusProfileTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
