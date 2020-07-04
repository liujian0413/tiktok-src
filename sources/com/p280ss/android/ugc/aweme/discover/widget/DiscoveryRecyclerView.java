package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView */
public class DiscoveryRecyclerView extends FpsRecyclerView {

    /* renamed from: M */
    double f71793M;

    /* renamed from: N */
    double f71794N;

    public DiscoveryRecyclerView(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f71793M = (double) motionEvent.getX();
            this.f71794N = (double) motionEvent.getY();
        } else if (action == 2) {
            double x = (double) motionEvent.getX();
            double d = this.f71793M;
            Double.isNaN(x);
            double abs = Math.abs(x - d);
            double y = (double) motionEvent.getY();
            double d2 = this.f71794N;
            Double.isNaN(y);
            double abs2 = Math.abs(y - d2);
            if (abs > ((double) ViewConfiguration.get(getContext()).getScaledTouchSlop()) && abs > abs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
