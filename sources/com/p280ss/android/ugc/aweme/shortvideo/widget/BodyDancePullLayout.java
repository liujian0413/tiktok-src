package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.common.widget.PullUpLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.BodyDancePullLayout */
public class BodyDancePullLayout extends PullUpLayout {

    /* renamed from: c */
    private float f108259c;

    public BodyDancePullLayout(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f108259c = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && Math.abs(this.f108259c - motionEvent.getY()) > ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop())) {
            return true;
        }
        return false;
    }

    public BodyDancePullLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BodyDancePullLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
