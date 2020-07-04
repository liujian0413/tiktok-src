package com.p280ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p022v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.R$styleable;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25263bb;
import com.p280ss.android.ugc.aweme.common.p1147h.C25687a;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C25763a;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout */
public class DampScrollableLayout extends LinearLayout {

    /* renamed from: a */
    public static final String f67991a = "DampScrollableLayout";

    /* renamed from: A */
    protected int f67992A;

    /* renamed from: B */
    protected boolean f67993B;

    /* renamed from: C */
    protected int f67994C;

    /* renamed from: D */
    protected int f67995D;

    /* renamed from: E */
    protected int f67996E;

    /* renamed from: F */
    protected int f67997F;

    /* renamed from: G */
    protected int f67998G;

    /* renamed from: H */
    protected boolean f67999H;

    /* renamed from: I */
    protected int f68000I;

    /* renamed from: J */
    public boolean f68001J;

    /* renamed from: K */
    public C25263bb f68002K;

    /* renamed from: L */
    protected boolean f68003L;

    /* renamed from: M */
    protected C25763a f68004M;

    /* renamed from: N */
    protected C25765b f68005N;

    /* renamed from: O */
    protected boolean f68006O;

    /* renamed from: P */
    private boolean f68007P;

    /* renamed from: Q */
    private List<C25763a> f68008Q;

    /* renamed from: b */
    protected Context f68009b;

    /* renamed from: c */
    protected Scroller f68010c;

    /* renamed from: d */
    protected float f68011d;

    /* renamed from: e */
    protected float f68012e;

    /* renamed from: f */
    protected float f68013f;

    /* renamed from: g */
    protected float f68014g;

    /* renamed from: h */
    protected VelocityTracker f68015h;

    /* renamed from: i */
    protected int f68016i;

    /* renamed from: j */
    protected int f68017j;

    /* renamed from: k */
    protected int f68018k;

    /* renamed from: l */
    protected boolean f68019l;

    /* renamed from: m */
    protected float f68020m;

    /* renamed from: n */
    protected float f68021n;

    /* renamed from: o */
    protected float f68022o;

    /* renamed from: p */
    protected float f68023p;

    /* renamed from: q */
    protected float f68024q;

    /* renamed from: r */
    protected float f68025r;

    /* renamed from: s */
    protected View f68026s;

    /* renamed from: t */
    protected ViewPager f68027t;

    /* renamed from: u */
    protected DIRECTION f68028u;

    /* renamed from: v */
    protected int f68029v;

    /* renamed from: w */
    protected int f68030w;

    /* renamed from: x */
    protected int f68031x;

    /* renamed from: y */
    protected boolean f68032y;

    /* renamed from: z */
    protected boolean f68033z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout$DIRECTION */
    public enum DIRECTION {
        UP,
        DOWN
    }

    /* renamed from: b */
    private static int m84643b(int i, int i2) {
        return i - i2;
    }

    public int getCurScrollY() {
        return this.f67998G;
    }

    public C25765b getHelper() {
        return this.f68005N;
    }

    public int getMaxY() {
        return this.f67995D;
    }

    public int getMinY() {
        return this.f67994C;
    }

    public int getTabsMarginTop() {
        return this.f67997F;
    }

    /* renamed from: b */
    public final void mo66845b() {
        this.f68010c.forceFinished(true);
    }

    /* renamed from: f */
    private void m84645f() {
        if (this.f68015h == null) {
            this.f68015h = VelocityTracker.obtain();
        }
    }

    /* renamed from: g */
    private boolean m84646g() {
        if (this.f67998G >= this.f67995D) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m84644e() {
        if (this.f68015h == null) {
            this.f68015h = VelocityTracker.obtain();
        } else {
            this.f68015h.clear();
        }
    }

    /* renamed from: a */
    public final void mo66843a() {
        if ((!this.f68001J || !C27754b.m90998a(getContext())) && this.f67998G != 0) {
            scrollTo(0, 0);
        }
    }

    /* renamed from: c */
    public final void mo66847c() {
        this.f68028u = DIRECTION.UP;
        this.f68010c.startScroll(0, getScrollY(), 0, -getScrollY(), -getScrollY());
        this.f68010c.computeScrollOffset();
        this.f67992A = getScrollY();
        invalidate();
    }

    /* renamed from: d */
    public final void mo66849d() {
        C25687a.m84433a(this, new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f)), new Pair(Float.valueOf(1.0f), Float.valueOf(-3000.0f)), 0);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        if (this.f68026s != null && !this.f68026s.isClickable()) {
            this.f68026s.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.f68027t = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (this.f68010c.computeScrollOffset()) {
            int currY = this.f68010c.getCurrY();
            if (this.f68028u == DIRECTION.UP) {
                if (m84646g()) {
                    int finalY = this.f68010c.getFinalY() - currY;
                    int b = m84643b(this.f68010c.getDuration(), this.f68010c.timePassed());
                    this.f68005N.mo66885a(m84641a(finalY, b), finalY, b);
                    mo66845b();
                    return;
                }
                scrollTo(0, currY);
            } else if (this.f68005N.mo66886a()) {
                scrollTo(0, getScrollY() + (currY - this.f67992A));
                if ((Math.abs(m84641a(this.f68010c.getFinalY() - currY, m84643b(this.f68010c.getDuration(), this.f68010c.timePassed()))) <= 0 || Math.abs(Math.max(this.f68010c.getFinalY(), this.f67994C) - this.f67998G) < 5) && this.f67998G < this.f67996E) {
                    this.f68010c.abortAnimation();
                    this.f68010c.startScroll(0, this.f67998G, 0, -this.f67998G, Math.abs(this.f67998G) * 2);
                    this.f68028u = DIRECTION.UP;
                    return;
                } else if (this.f67998G <= this.f67994C) {
                    mo66845b();
                    return;
                }
            }
            invalidate();
            this.f67992A = currY;
        }
    }

    public void setMinY(int i) {
        this.f67994C = i;
    }

    public void setOnScrollListener(C25763a aVar) {
        this.f68004M = aVar;
    }

    public void setScrollMinY(int i) {
        this.f68000I = i;
    }

    public DampScrollableLayout(Context context) {
        this(context, null);
    }

    public void setTabsMarginTop(int i) {
        this.f67997F = i;
        this.f68007P = true;
    }

    /* renamed from: b */
    public final void mo66846b(C25763a aVar) {
        if (this.f68008Q.contains(aVar)) {
            this.f68008Q.remove(aVar);
        }
    }

    public void setMaxScrollHeight(int i) {
        this.f67995D = Math.min(i, this.f68029v - this.f67997F);
        this.f67995D = Math.max(this.f67995D, 0);
    }

    public void setCanScrollUp(boolean z) {
        if (z) {
            this.f67995D = this.f68029v - this.f67997F;
        }
        if (this.f68007P || (this.f68003L != z && (!this.f68001J || !C27754b.m90998a(getContext())))) {
            this.f68003L = z;
            if (!this.f68003L) {
                if (this.f67998G != 0) {
                    scrollTo(0, 0);
                }
                this.f67995D = 0;
            }
            this.f68007P = false;
        }
    }

    /* renamed from: a */
    public final void mo66844a(C25763a aVar) {
        if (!this.f68008Q.contains(aVar)) {
            this.f68008Q.add(aVar);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DIRECTION direction;
        boolean z;
        if (this.f68002K != null && this.f68002K.mo65726a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        try {
            if (motionEvent.getActionIndex() != 0) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int abs = (int) Math.abs(x - this.f68011d);
            int abs2 = (int) Math.abs(y - this.f68012e);
            boolean z2 = false;
            switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
                case 0:
                case 5:
                    this.f67993B = false;
                    this.f68019l = false;
                    this.f68020m = motionEvent.getRawX();
                    this.f68021n = motionEvent.getRawY();
                    this.f68032y = true;
                    this.f68033z = true;
                    this.f68011d = x;
                    this.f68012e = y;
                    this.f68013f = x;
                    this.f68014g = y;
                    this.f68030w = getScrollY();
                    m84642a((int) y, this.f68029v, getScrollY());
                    m84644e();
                    this.f68015h.addMovement(motionEvent);
                    mo66845b();
                    break;
                case 1:
                case 3:
                case 6:
                    if (this.f68004M != null) {
                        z2 = this.f68004M.mo62081r();
                    }
                    if (!z2) {
                        for (C25763a r : this.f68008Q) {
                            z2 = r.mo62081r();
                            if (!z2) {
                            }
                        }
                    }
                    if (!z2 && this.f68033z && ((abs2 > abs || this.f67998G < 0) && abs2 > this.f68016i)) {
                        if (getScrollY() < 0) {
                            mo66847c();
                        } else {
                            this.f68015h.computeCurrentVelocity(1000, (float) this.f68018k);
                            float f = -this.f68015h.getYVelocity();
                            if (Math.abs(f) > ((float) this.f68017j)) {
                                if (f > 0.0f) {
                                    direction = DIRECTION.UP;
                                } else {
                                    direction = DIRECTION.DOWN;
                                }
                                this.f68028u = direction;
                                if (this.f68028u != DIRECTION.UP || !m84646g()) {
                                    this.f68010c.fling(0, getScrollY(), 0, (int) f, 0, 0, -2147483647, Integer.MAX_VALUE);
                                    this.f67992A = getScrollY();
                                    invalidate();
                                }
                            }
                        }
                        if (this.f67999H || !m84646g()) {
                            int action = motionEvent.getAction();
                            motionEvent.setAction(3);
                            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            motionEvent.setAction(action);
                            return dispatchTouchEvent;
                        }
                    }
                case 2:
                    if (!this.f67993B) {
                        m84645f();
                        this.f68015h.addMovement(motionEvent);
                        float f2 = this.f68014g - y;
                        if (this.f68004M != null) {
                            this.f68004M.mo61694a(this.f68013f - x, f2);
                        }
                        for (C25763a a : this.f68008Q) {
                            a.mo61694a(this.f68013f - x, f2);
                        }
                        if (this.f68032y) {
                            if (abs > this.f68016i && abs > abs2) {
                                this.f68032y = false;
                                this.f68033z = false;
                            } else if (abs2 > this.f68016i && abs2 > abs) {
                                this.f68032y = false;
                                this.f68033z = true;
                            }
                        }
                        StringBuilder sb = new StringBuilder("shift: ");
                        if (abs2 > this.f68016i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb.append(z);
                        new StringBuilder("stick: ").append(!m84646g());
                        if (this.f68033z && abs2 > this.f68016i && abs2 > abs && (!m84646g() || this.f68005N.mo66886a())) {
                            if (this.f68027t != null) {
                                this.f68027t.requestDisallowInterceptTouchEvent(true);
                            }
                            double d = (double) f2;
                            Double.isNaN(d);
                            scrollBy(0, (int) (d + 0.5d));
                        }
                        this.f68013f = x;
                        this.f68014g = y;
                        this.f68022o = motionEvent.getRawX();
                        this.f68023p = motionEvent.getRawY();
                        this.f68024q = (float) ((int) (this.f68022o - this.f68020m));
                        this.f68025r = (float) ((int) (this.f68023p - this.f68021n));
                        if (Math.abs(this.f68025r) > ((float) this.f68000I)) {
                            double abs3 = (double) Math.abs(this.f68025r);
                            Double.isNaN(abs3);
                            if (abs3 * 0.1d > ((double) Math.abs(this.f68024q))) {
                                this.f68019l = false;
                                break;
                            }
                        }
                        this.f68019l = true;
                        break;
                    }
                    break;
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (IllegalArgumentException unused) {
        }
    }

    public DampScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private int m84641a(int i, int i2) {
        if (this.f68010c == null || i2 == 0) {
            return 0;
        }
        return i / i2;
    }

    public void scrollBy(int i, int i2) {
        int scrollY = getScrollY();
        if (i2 < 0) {
            int i3 = scrollY + i2;
            if (i3 < this.f67996E) {
                i2 = (int) (((float) i2) * 1.2f * (1.0f - ((1.0f / ((float) this.f67994C)) * ((float) i3))));
            }
        }
        int i4 = i2 + scrollY;
        if (i4 >= this.f67995D) {
            i4 = this.f67995D;
        } else if (i4 <= this.f67994C) {
            i4 = this.f67994C;
        }
        super.scrollBy(i, i4 - scrollY);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f68026s = getChildAt(0);
        if (this.f68026s != null) {
            measureChildWithMargins(this.f68026s, i, 0, 0, 0);
            this.f68029v = this.f68026s.getMeasuredHeight();
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2) + (this.f68029v - this.f67997F), 1073741824));
        if (!this.f68006O) {
            this.f67995D = this.f68029v - this.f67997F;
            this.f68006O = true;
        }
        if (!this.f68003L) {
            this.f67995D = 0;
        }
    }

    public void scrollTo(int i, int i2) {
        if (i2 >= this.f67995D) {
            i2 = this.f67995D;
        } else if (i2 <= this.f67994C) {
            i2 = this.f67994C;
        }
        this.f67998G = i2;
        if (this.f68004M != null && (!(this.f68004M instanceof AbsFragment) || ((AbsFragment) this.f68004M).isViewValid())) {
            this.f68004M.mo61702b(i2, this.f67995D);
        }
        for (C25763a b : this.f68008Q) {
            b.mo61702b(i2, this.f67995D);
        }
        super.scrollTo(i, i2);
    }

    /* renamed from: a */
    private void m84642a(int i, int i2, int i3) {
        boolean z;
        if (i + i3 <= i2) {
            z = true;
        } else {
            z = false;
        }
        this.f67999H = z;
    }

    public DampScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68000I = 10;
        this.f68003L = true;
        this.f68008Q = new ArrayList();
        this.f68006O = false;
        this.f68009b = context;
        this.f68005N = new C25765b();
        this.f68010c = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f68016i = viewConfiguration.getScaledTouchSlop();
        this.f68017j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f68018k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f68031x = VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollableLayout);
        this.f67997F = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
