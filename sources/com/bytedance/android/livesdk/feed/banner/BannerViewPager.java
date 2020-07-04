package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdkapi.view.C9520d;

public class BannerViewPager extends RtlViewPager {

    /* renamed from: a */
    private boolean f17653a;

    /* renamed from: b */
    private Boolean f17654b;

    /* renamed from: c */
    private MotionEvent f17655c;

    private C9520d getParentViewPager() {
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof C9520d)) {
            viewParent = viewParent.getParent();
        }
        return (C9520d) viewParent;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo14593c() {
        if (!this.f17653a) {
            this.f17653a = true;
            if (!(getParentViewPager() == null || this.f17654b == null)) {
                this.f17654b.booleanValue();
                this.f17654b = null;
            }
        }
    }

    /* renamed from: b */
    public final void mo14592b() {
        if (this.f17655c == null || this.f17655c.getAction() == 3 || this.f17655c.getAction() == 1) {
            post(new C5965i(this));
        }
    }

    /* renamed from: d */
    private void m18653d() {
        if (getChildCount() > 1 && this.f17653a) {
            this.f17653a = false;
            C9520d parentViewPager = getParentViewPager();
            if (parentViewPager != null && this.f17654b == null) {
                this.f17654b = Boolean.valueOf(parentViewPager.mo23569a());
            }
        }
    }

    public BannerViewPager(Context context) {
        super(context);
    }

    public void setOnPageChangeListener(C0935e eVar) {
        super.setOnPageChangeListener(eVar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            m18653d();
        } else if (motionEvent.getAction() != 2) {
            mo14593c();
        } else if (onInterceptTouchEvent) {
            m18653d();
        }
        this.f17655c = motionEvent;
        return onInterceptTouchEvent;
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
