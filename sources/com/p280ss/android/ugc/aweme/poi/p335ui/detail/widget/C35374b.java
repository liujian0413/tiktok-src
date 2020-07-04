package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.C0991u;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.b */
abstract class C35374b<V extends View> extends C35378e<V> {

    /* renamed from: a */
    private Runnable f92803a;

    /* renamed from: b */
    private boolean f92804b;

    /* renamed from: c */
    OverScroller f92805c;

    /* renamed from: d */
    private int f92806d = -1;

    /* renamed from: e */
    private int f92807e;

    /* renamed from: f */
    private int f92808f = -1;

    /* renamed from: g */
    private VelocityTracker f92809g;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.b$a */
    class C35375a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f92811b;

        /* renamed from: c */
        private final V f92812c;

        public final void run() {
            if (!(this.f92812c == null || C35374b.this.f92805c == null)) {
                if (C35374b.this.f92805c.computeScrollOffset()) {
                    C35374b.this.mo90091a(this.f92811b, this.f92812c, C35374b.this.f92805c.getCurrY(), 1, true);
                    C0991u.m4190a((View) this.f92812c, (Runnable) this);
                    return;
                }
                C35374b.this.mo89962a(this.f92811b, this.f92812c);
            }
        }

        C35375a(CoordinatorLayout coordinatorLayout, V v) {
            this.f92811b = coordinatorLayout;
            this.f92812c = v;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo89962a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo89963a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo89964a(V v, float f) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo89966b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo89968c(V v) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo89967c() {
        return getTopAndBottomOffset();
    }

    C35374b() {
    }

    /* renamed from: d */
    private void m114250d() {
        if (this.f92809g == null) {
            this.f92809g = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo89960a(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo89965b(V v) {
        return -v.getHeight();
    }

    /* renamed from: a */
    private boolean m114248a(CoordinatorLayout coordinatorLayout) {
        boolean a = mo89963a();
        if (a) {
            mo89966b();
            coordinatorLayout.mo90011a();
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo90093d(V v) {
        if (this.f92803a != null) {
            v.removeCallbacks(this.f92803a);
            this.f92803a = null;
        }
        if (this.f92805c != null) {
            this.f92805c.forceFinished(true);
        }
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f92808f < 0) {
            this.f92808f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f92804b) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f92804b = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo89968c(v) && coordinatorLayout.mo90016a((View) v, x, y)) {
                    this.f92807e = y;
                    this.f92806d = motionEvent.getPointerId(0);
                    m114250d();
                    break;
                }
            case 1:
            case 3:
                this.f92804b = false;
                this.f92806d = -1;
                if (this.f92809g != null) {
                    this.f92809g.recycle();
                    this.f92809g = null;
                    break;
                }
                break;
            case 2:
                int i = this.f92806d;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f92807e) > this.f92808f && !m114248a(coordinatorLayout)) {
                            this.f92804b = true;
                            this.f92807e = y2;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f92809g != null) {
            this.f92809g.addMovement(motionEvent);
        }
        return this.f92804b;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f92808f < 0) {
            this.f92808f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.mo90016a((View) v, (int) motionEvent.getX(), y) && mo89968c(v)) {
                    this.f92807e = y;
                    this.f92806d = motionEvent.getPointerId(0);
                    m114250d();
                    break;
                } else {
                    return false;
                }
            case 1:
                if (this.f92809g != null && !mo89963a()) {
                    this.f92809g.addMovement(motionEvent);
                    this.f92809g.computeCurrentVelocity(1000);
                    m114249a(coordinatorLayout, v, -mo89960a(v), 0, this.f92809g.getYVelocity(this.f92806d));
                    break;
                }
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f92806d);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i = this.f92807e - y2;
                    if (!this.f92804b && Math.abs(i) > this.f92808f) {
                        if (!m114248a(coordinatorLayout)) {
                            this.f92804b = true;
                        }
                        i = i > 0 ? i - this.f92808f : i + this.f92808f;
                    }
                    int i2 = i;
                    if (this.f92804b) {
                        this.f92807e = y2;
                        mo90092b(coordinatorLayout, v, i2, mo89965b(v), 0, 0, true);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.f92804b = false;
        this.f92806d = -1;
        if (this.f92809g != null) {
            this.f92809g.recycle();
            this.f92809g = null;
        }
        if (this.f92809g != null) {
            this.f92809g.addMovement(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo90091a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, boolean z) {
        return mo89961a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE, i2, z);
    }

    /* renamed from: a */
    private boolean m114249a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        if (this.f92803a != null) {
            v2.removeCallbacks(this.f92803a);
            this.f92803a = null;
        }
        if (mo89964a(v2, f)) {
            return true;
        }
        if (this.f92805c == null) {
            this.f92805c = new OverScroller(v.getContext());
        }
        this.f92805c.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, 0);
        if (this.f92805c.computeScrollOffset()) {
            this.f92803a = new C35375a(coordinatorLayout, v2);
            C0991u.m4190a((View) v2, this.f92803a);
            return true;
        }
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        mo89962a(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo89961a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4, boolean z) {
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 != 0 && topAndBottomOffset >= i2 && topAndBottomOffset <= i3) {
            int a = C0534a.m2233a(i, i2, i3);
            if (topAndBottomOffset != a) {
                setTopAndBottomOffset(a);
                return topAndBottomOffset - a;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo90092b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4, boolean z) {
        return mo89961a(coordinatorLayout, v, mo89967c() - i, i2, i3, i4, z);
    }
}
