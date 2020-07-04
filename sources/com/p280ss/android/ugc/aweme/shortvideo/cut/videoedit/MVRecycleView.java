package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView */
public class MVRecycleView extends RecyclerView {

    /* renamed from: M */
    private double f101753M;

    public MVRecycleView(Context context) {
        super(context);
    }

    public void setflingScale(double d) {
        this.f101753M = d;
    }

    public MVRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final boolean mo5548b(int i, int i2) {
        double d = (double) i;
        double d2 = this.f101753M;
        Double.isNaN(d);
        return super.mo5548b((int) (d * d2), i2);
    }

    public MVRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
