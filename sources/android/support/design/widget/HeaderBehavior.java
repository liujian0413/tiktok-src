package android.support.design.widget;

import android.content.Context;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: a */
    private Runnable f1447a;

    /* renamed from: b */
    OverScroller f1448b;

    /* renamed from: c */
    private boolean f1449c;

    /* renamed from: d */
    private int f1450d = -1;

    /* renamed from: e */
    private int f1451e;

    /* renamed from: f */
    private int f1452f = -1;

    /* renamed from: g */
    private VelocityTracker f1453g;

    /* renamed from: android.support.design.widget.HeaderBehavior$a */
    class C0361a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f1455b;

        /* renamed from: c */
        private final V f1456c;

        public final void run() {
            if (!(this.f1456c == null || HeaderBehavior.this.f1448b == null)) {
                if (HeaderBehavior.this.f1448b.computeScrollOffset()) {
                    HeaderBehavior.this.mo1531a_(this.f1455b, this.f1456c, HeaderBehavior.this.f1448b.getCurrY());
                    C0991u.m4190a((View) this.f1456c, (Runnable) this);
                    return;
                }
                HeaderBehavior.this.mo1255a(this.f1455b, this.f1456c);
            }
        }

        C0361a(CoordinatorLayout coordinatorLayout, V v) {
            this.f1455b = coordinatorLayout;
            this.f1456c = v;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1255a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo1266c(V v) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1247a() {
        return mo1273b();
    }

    public HeaderBehavior() {
    }

    /* renamed from: c */
    private void m1540c() {
        if (this.f1453g == null) {
            this.f1453g = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1264b(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1249a(V v) {
        return v.getHeight();
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a_ */
    public final int mo1531a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo1248a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public final boolean mo1219a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f1452f < 0) {
            this.f1452f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.mo1398a((View) v, (int) motionEvent.getX(), y) && mo1266c(v)) {
                    this.f1451e = y;
                    this.f1450d = motionEvent.getPointerId(0);
                    m1540c();
                    break;
                } else {
                    return false;
                }
            case 1:
                if (this.f1453g != null) {
                    this.f1453g.addMovement(motionEvent);
                    this.f1453g.computeCurrentVelocity(1000);
                    m1539a(coordinatorLayout, v, -mo1249a(v), 0, this.f1453g.getYVelocity(this.f1450d));
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1450d);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i = this.f1451e - y2;
                    if (!this.f1449c && Math.abs(i) > this.f1452f) {
                        this.f1449c = true;
                        i = i > 0 ? i - this.f1452f : i + this.f1452f;
                    }
                    int i2 = i;
                    if (this.f1449c) {
                        this.f1451e = y2;
                        mo1532b(coordinatorLayout, v, i2, mo1264b(v), 0);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.f1449c = false;
        this.f1450d = -1;
        if (this.f1453g != null) {
            this.f1453g.recycle();
            this.f1453g = null;
        }
        if (this.f1453g != null) {
            this.f1453g.addMovement(motionEvent);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f1452f < 0) {
            this.f1452f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f1449c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1449c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo1266c(v) && coordinatorLayout.mo1398a((View) v, x, y)) {
                    this.f1451e = y;
                    this.f1450d = motionEvent.getPointerId(0);
                    m1540c();
                    break;
                }
            case 1:
            case 3:
                this.f1449c = false;
                this.f1450d = -1;
                if (this.f1453g != null) {
                    this.f1453g.recycle();
                    this.f1453g = null;
                    break;
                }
                break;
            case 2:
                int i = this.f1450d;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f1451e) > this.f1452f) {
                            this.f1449c = true;
                            this.f1451e = y2;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f1453g != null) {
            this.f1453g.addMovement(motionEvent);
        }
        return this.f1449c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo1532b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo1248a(coordinatorLayout, v, mo1247a() - i, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1248a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b = mo1273b();
        if (i2 != 0 && b >= i2 && b <= i3) {
            int a = C0534a.m2233a(i, i2, i3);
            if (b != a) {
                mo1272a(a);
                return b - a;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private boolean m1539a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        if (this.f1447a != null) {
            v.removeCallbacks(this.f1447a);
            this.f1447a = null;
        }
        if (this.f1448b == null) {
            this.f1448b = new OverScroller(v.getContext());
        }
        this.f1448b.fling(0, mo1273b(), 0, Math.round(f), 0, 0, i, 0);
        if (this.f1448b.computeScrollOffset()) {
            this.f1447a = new C0361a(coordinatorLayout, v);
            C0991u.m4190a((View) v, this.f1447a);
            return true;
        }
        mo1255a(coordinatorLayout, v);
        return false;
    }
}
