package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendPointView */
public class RecommendPointView extends View {

    /* renamed from: a */
    public boolean f95226a;

    /* renamed from: b */
    public final void mo92332b() {
        setVisibility(0);
    }

    /* renamed from: a */
    public final void mo92331a() {
        setVisibility(8);
        this.f95226a = false;
    }

    public RecommendPointView(Context context) {
        super(context);
    }

    public void setShouldHide(boolean z) {
        this.f95226a = z;
    }

    public RecommendPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecommendPointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
