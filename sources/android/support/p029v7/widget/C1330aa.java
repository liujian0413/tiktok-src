package android.support.p029v7.widget;

import android.os.SystemClock;
import android.support.p029v7.view.menu.C1194m;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.aa */
public abstract class C1330aa implements OnAttachStateChangeListener, OnTouchListener {

    /* renamed from: a */
    private final float f5212a;

    /* renamed from: b */
    private final int f5213b;

    /* renamed from: c */
    final View f5214c;

    /* renamed from: d */
    private final int f5215d;

    /* renamed from: e */
    private Runnable f5216e;

    /* renamed from: f */
    private Runnable f5217f;

    /* renamed from: g */
    private boolean f5218g;

    /* renamed from: h */
    private int f5219h;

    /* renamed from: i */
    private final int[] f5220i = new int[2];

    /* renamed from: android.support.v7.widget.aa$a */
    class C1331a implements Runnable {
        public final void run() {
            ViewParent parent = C1330aa.this.f5214c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        C1331a() {
        }
    }

    /* renamed from: android.support.v7.widget.aa$b */
    class C1332b implements Runnable {
        public final void run() {
            C1330aa.this.mo6241d();
        }

        C1332b() {
        }
    }

    /* renamed from: a */
    public abstract C1194m mo4666a();

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: e */
    private void m6587e() {
        if (this.f5217f != null) {
            this.f5214c.removeCallbacks(this.f5217f);
        }
        if (this.f5216e != null) {
            this.f5214c.removeCallbacks(this.f5216e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo5071c() {
        C1194m a = mo4666a();
        if (a != null && a.mo4894e()) {
            a.dismiss();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4667b() {
        C1194m a = mo4666a();
        if (a != null && !a.mo4894e()) {
            a.mo4892d();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo6241d() {
        m6587e();
        View view = this.f5214c;
        if (view.isEnabled() && !view.isLongClickable() && mo4667b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f5218g = true;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f5218g = false;
        this.f5219h = -1;
        if (this.f5216e != null) {
            this.f5214c.removeCallbacks(this.f5216e);
        }
    }

    public C1330aa(View view) {
        this.f5214c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f5212a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f5213b = ViewConfiguration.getTapTimeout();
        this.f5215d = (this.f5213b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m6582a(MotionEvent motionEvent) {
        View view = this.f5214c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f5219h = motionEvent.getPointerId(0);
                if (this.f5216e == null) {
                    this.f5216e = new C1331a();
                }
                view.postDelayed(this.f5216e, (long) this.f5213b);
                if (this.f5217f == null) {
                    this.f5217f = new C1332b();
                }
                view.postDelayed(this.f5217f, (long) this.f5215d);
                break;
            case 1:
            case 3:
                m6587e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f5219h);
                if (findPointerIndex >= 0 && !m6583a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f5212a)) {
                    m6587e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m6585b(MotionEvent motionEvent) {
        boolean z;
        View view = this.f5214c;
        C1194m a = mo4666a();
        if (a == null || !a.mo4894e()) {
            return false;
        }
        C1434x xVar = (C1434x) a.mo4895f();
        if (xVar == null || !xVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m6586b(view, obtainNoHistory);
        m6584a(xVar, obtainNoHistory);
        boolean a2 = xVar.mo5507a(obtainNoHistory, this.f5219h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z = false;
        } else {
            z = true;
        }
        if (!a2 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m6584a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f5220i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m6586b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f5220i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f5218g;
        if (!z2) {
            if (!m6582a(motionEvent) || !mo4667b()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f5214c.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else if (m6585b(motionEvent) || !mo5071c()) {
            z = true;
        } else {
            z = false;
        }
        this.f5218g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m6583a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= ((float) (view.getRight() - view.getLeft())) + f3 || f2 >= ((float) (view.getBottom() - view.getTop())) + f3) {
            return false;
        }
        return true;
    }
}
