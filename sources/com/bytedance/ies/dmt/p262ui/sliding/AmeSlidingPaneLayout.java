package com.bytedance.ies.dmt.p262ui.sliding;

import android.content.Context;
import android.support.p022v4.view.C0978j;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.bytedance.ies.dmt.ui.sliding.AmeSlidingPaneLayout */
public class AmeSlidingPaneLayout extends DmtSlidingPaneLayout {

    /* renamed from: j */
    private float f28938j;

    /* renamed from: k */
    private boolean f28939k;

    /* renamed from: a */
    public final void mo25807a() {
        this.f28939k = true;
    }

    /* renamed from: b */
    public final void mo25808b() {
        this.f28939k = false;
    }

    public AmeSlidingPaneLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (C0978j.m4129a(motionEvent) == 2 && !this.f28939k) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int a = C0978j.m4129a(motionEvent);
        if (a == 0) {
            this.f28938j = motionEvent.getX();
        } else if (a == 2) {
            if (!this.f28939k) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (!mo25820d()) {
                if (mo25813a(this, false, Math.round(x - this.f28938j), Math.round(x), Math.round(y))) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    return super.onInterceptTouchEvent(obtain);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public AmeSlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AmeSlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28939k = true;
        ViewConfiguration.get(context);
    }
}
