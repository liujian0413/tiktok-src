package com.p280ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.base.widget.BaseRecyclerView;

/* renamed from: com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView */
public class NestedScrollingRecyclerView extends BaseRecyclerView {

    /* renamed from: M */
    private int f67775M;

    /* renamed from: N */
    private int f67776N;

    /* renamed from: O */
    private int f67777O;

    /* renamed from: P */
    private int f67778P;

    public NestedScrollingRecyclerView(Context context) {
        this(context, null);
    }

    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                this.f67778P = viewConfiguration.getScaledTouchSlop();
                return;
            case 1:
                this.f67778P = viewConfiguration.getScaledPagingTouchSlop();
                break;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f67775M = motionEvent.getPointerId(0);
            this.f67776N = (int) (motionEvent.getX() + 0.5f);
            this.f67777O = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f67775M);
            if (findPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int i = x - this.f67776N;
            int i2 = y - this.f67777O;
            boolean e = getLayoutManager().mo5438e();
            boolean f = getLayoutManager().mo5441f();
            if (!e || Math.abs(i) <= this.f67778P || (Math.abs(i) < Math.abs(i2) && !f)) {
                z = false;
            } else {
                z = true;
            }
            if (f && Math.abs(i2) > this.f67778P && (Math.abs(i2) >= Math.abs(i) || e)) {
                z = true;
            }
            if (!z || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else if (actionMasked != 5) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f67775M = motionEvent.getPointerId(actionIndex);
            this.f67776N = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f67777O = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public NestedScrollingRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollingRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67775M = -1;
        this.f67778P = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
