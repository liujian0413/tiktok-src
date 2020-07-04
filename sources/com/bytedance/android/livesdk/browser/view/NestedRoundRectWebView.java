package com.bytedance.android.livesdk.browser.view;

import android.support.p022v4.view.C0980l;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.NestedScrollingChild2;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.OverScroller;

public class NestedRoundRectWebView extends RoundRectWebView implements NestedScrollingChild2 {

    /* renamed from: a */
    private final int[] f12326a;

    /* renamed from: b */
    private final int[] f12327b;

    /* renamed from: c */
    private float f12328c;

    /* renamed from: d */
    private int f12329d;

    /* renamed from: e */
    private VelocityTracker f12330e;

    /* renamed from: f */
    private int f12331f;

    /* renamed from: g */
    private int f12332g;

    /* renamed from: h */
    private OverScroller f12333h;

    /* renamed from: i */
    private int f12334i;

    /* renamed from: j */
    private C0980l f12335j;

    public boolean hasNestedScrollingParent() {
        return this.f12335j.mo3761a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f12335j.f3397a;
    }

    public void stopNestedScroll() {
        this.f12335j.mo3770b();
    }

    /* renamed from: a */
    private void m14346a() {
        if (this.f12330e == null) {
            this.f12330e = VelocityTracker.obtain();
        }
    }

    /* renamed from: b */
    private void m14350b() {
        if (this.f12330e != null) {
            this.f12330e.recycle();
            this.f12330e = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12335j.mo3772c();
    }

    public void computeScroll() {
        int i;
        if (this.f12333h.computeScrollOffset()) {
            int currY = this.f12333h.getCurrY();
            int i2 = currY - this.f12334i;
            if (m14349a(0, i2, this.f12326a, null, 1)) {
                i2 -= this.f12326a[1];
            }
            if (i2 != 0) {
                int scrollY = getScrollY();
                if (scrollY == 0) {
                    i = i2;
                } else {
                    int i3 = scrollY + i2;
                    if (i3 <= 0) {
                        i = i3;
                    } else {
                        i = 0;
                    }
                }
                int i4 = i2 - i;
                scrollBy(0, i4);
                m14348a(0, i4, 0, i, null, 1);
            }
            this.f12334i = currY;
            C0991u.m4212e(this);
            return;
        }
        if (m14352c(1)) {
            mo3524a(1);
        }
        this.f12334i = 0;
    }

    /* renamed from: c */
    private boolean m14352c(int i) {
        return this.f12335j.mo3764a(1);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f12335j.mo3760a(z);
    }

    public boolean startNestedScroll(int i) {
        return this.f12335j.mo3771b(i);
    }

    /* renamed from: b */
    private void m14351b(int i) {
        m14347a(2, 1);
        this.f12333h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        this.f12334i = getScrollY();
        C0991u.m4212e(this);
    }

    /* renamed from: a */
    public final void mo3524a(int i) {
        this.f12335j.mo3773c(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        m14346a();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                this.f12328c = motionEvent.getRawY();
                this.f12329d = motionEvent.getPointerId(0);
                m14347a(2, 0);
                this.f12333h.computeScrollOffset();
                if (!this.f12333h.isFinished()) {
                    this.f12333h.abortAnimation();
                    break;
                }
                break;
            case 1:
                VelocityTracker velocityTracker = this.f12330e;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f12332g);
                int yVelocity = (int) velocityTracker.getYVelocity();
                this.f12329d = -1;
                mo3524a(0);
                m14350b();
                if (Math.abs(yVelocity) > this.f12331f) {
                    m14351b(-yVelocity);
                    break;
                }
                break;
            case 2:
                int i2 = this.f12329d;
                if (!(i2 == -1 || motionEvent.findPointerIndex(i2) == -1)) {
                    float rawY = motionEvent.getRawY();
                    int round = Math.round(this.f12328c - rawY);
                    this.f12328c = rawY;
                    if (m14349a(0, round, this.f12326a, this.f12327b, 0)) {
                        obtain.offsetLocation(0.0f, (float) this.f12326a[1]);
                        round -= this.f12326a[1];
                    }
                    int scrollY = getScrollY();
                    if (scrollY == 0) {
                        i = round;
                    } else {
                        i = scrollY + round;
                        if (i > 0) {
                            i = 0;
                        }
                    }
                    if (m14348a(0, round - i, 0, i, this.f12327b, 0)) {
                        obtain.offsetLocation(0.0f, (float) i);
                        break;
                    }
                }
                break;
            case 3:
                this.f12329d = -1;
                mo3524a(0);
                m14350b();
                break;
        }
        if (this.f12330e != null) {
            this.f12330e.addMovement(obtain);
        }
        boolean onTouchEvent = super.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }

    /* renamed from: a */
    private boolean m14347a(int i, int i2) {
        return this.f12335j.mo3765a(2, i2);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f12335j.mo3762a(f, f2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f12335j.mo3763a(f, f2, z);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f12335j.mo3768a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f12335j.mo3766a(i, i2, i3, i4, iArr);
    }

    /* renamed from: a */
    private boolean m14349a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f12335j.mo3769a(0, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    private boolean m14348a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f12335j.mo3767a(0, i2, 0, i4, iArr, i5);
    }
}
