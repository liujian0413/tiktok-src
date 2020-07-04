package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserRecyclerView */
public final class MediaBrowserRecyclerView extends RecyclerView {

    /* renamed from: M */
    private int f82570M;

    /* renamed from: N */
    private int f82571N;

    /* renamed from: O */
    private int f82572O;

    /* renamed from: P */
    private int f82573P;

    public MediaBrowserRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MediaBrowserRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setScrollingTouchSlop(int i) {
        int i2;
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                C7573i.m23582a((Object) viewConfiguration, "configuration");
                i2 = viewConfiguration.getScaledTouchSlop();
                break;
            case 1:
                C7573i.m23582a((Object) viewConfiguration, "configuration");
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                break;
            default:
                C7573i.m23582a((Object) viewConfiguration, "configuration");
                i2 = viewConfiguration.getScaledTouchSlop();
                break;
        }
        this.f82570M = i2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f82571N = motionEvent.getPointerId(0);
            this.f82572O = (int) (motionEvent.getX() + 0.5f);
            this.f82573P = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f82571N);
            if (findPointerIndex < 0) {
                return false;
            }
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int i = x - this.f82572O;
            int y = ((int) (motionEvent.getY(findPointerIndex) + 0.5f)) - this.f82573P;
            C1273i layoutManager = getLayoutManager();
            if (layoutManager == null) {
                C7573i.m23580a();
            }
            boolean e = layoutManager.mo5438e();
            C1273i layoutManager2 = getLayoutManager();
            if (layoutManager2 == null) {
                C7573i.m23580a();
            }
            boolean f = layoutManager2.mo5441f();
            if (!e || Math.abs(i) <= this.f82570M || (Math.abs(i) < Math.abs(y) && !f)) {
                z = false;
            } else {
                z = true;
            }
            if (f && Math.abs(y) > this.f82570M && (Math.abs(y) >= Math.abs(i) || e)) {
                z = true;
            }
            if (!z || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else if (actionMasked != 5) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f82571N = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f82572O = (int) (motionEvent.getX(motionEvent.getActionIndex()) + 0.5f);
            this.f82573P = (int) (motionEvent.getY(motionEvent.getActionIndex()) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public MediaBrowserRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f82571N = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C7573i.m23582a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f82570M = viewConfiguration.getScaledTouchSlop();
    }

    public /* synthetic */ MediaBrowserRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
