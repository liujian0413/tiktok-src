package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.common.widget.BaseCustomViewPager;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout */
public class FeedSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: n */
    private BaseCustomViewPager f76477n;

    /* renamed from: o */
    private boolean f76478o;

    /* renamed from: p */
    private RecyclerView f76479p;

    public void setCanTouch(boolean z) {
        this.f76478o = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f76479p = recyclerView;
    }

    public void setViewPager(BaseCustomViewPager baseCustomViewPager) {
        this.f76477n = baseCustomViewPager;
    }

    public FeedSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f76478o || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f76478o || ((this.f76477n != null && this.f76477n.getAdapter() != null && this.f76477n.getAdapter().getCount() != 0 && this.f76477n.getCurrentItem() != 0) || ((this.f76479p != null && ((GridLayoutManager) this.f76479p.getLayoutManager()).mo5446k() != 0) || !super.onInterceptTouchEvent(motionEvent)))) {
            return false;
        }
        return true;
    }

    public FeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f76478o = true;
    }
}
