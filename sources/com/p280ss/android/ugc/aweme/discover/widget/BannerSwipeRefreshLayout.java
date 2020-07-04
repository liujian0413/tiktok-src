package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout */
public class BannerSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: n */
    private View f71771n;

    /* renamed from: o */
    private int f71772o;

    /* renamed from: p */
    private boolean f71773p;

    /* renamed from: q */
    private float f71774q;

    /* renamed from: r */
    private float f71775r;

    /* renamed from: s */
    private float f71776s;

    /* renamed from: t */
    private int f71777t;

    public void setHeader(View view) {
        this.f71771n = view;
    }

    public BannerSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m89272a(Context context) {
        this.f71772o = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.f71773p = false;
        setDoNotCatchException(true);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        try {
            if (this.f71771n != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f71774q = motionEvent.getX();
                    this.f71775r = this.f71774q;
                    this.f71776s = motionEvent.getY();
                    this.f71773p = false;
                    this.f71777t = motionEvent.getPointerId(0);
                } else if (action == 2) {
                    if (this.f71773p) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f71777t);
                    float x = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x - this.f71775r);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.f71776s);
                    if (abs <= ((float) this.f71772o) || abs * 0.5f <= abs2 || ((float) this.f71771n.getBottom()) <= y) {
                        if (x - this.f71775r > 0.0f) {
                            f = this.f71774q + ((float) this.f71772o);
                        } else {
                            f = this.f71774q - ((float) this.f71772o);
                        }
                        this.f71775r = f;
                        this.f71776s = y;
                    } else {
                        this.f71773p = true;
                        return false;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public BannerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89272a(context);
    }
}
