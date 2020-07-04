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
import com.bytedance.ies.ugc.aweme.common.p575ui.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout */
public class ScrollableLayout extends LinearLayout {

    /* renamed from: A */
    protected boolean f68035A;

    /* renamed from: B */
    protected int f68036B;

    /* renamed from: C */
    protected int f68037C;

    /* renamed from: D */
    protected int f68038D;

    /* renamed from: E */
    protected int f68039E;

    /* renamed from: F */
    protected boolean f68040F;

    /* renamed from: G */
    protected int f68041G;

    /* renamed from: H */
    protected boolean f68042H;

    /* renamed from: I */
    protected C25763a f68043I;

    /* renamed from: J */
    protected C25765b f68044J;

    /* renamed from: K */
    protected boolean f68045K;

    /* renamed from: L */
    int f68046L;

    /* renamed from: a */
    protected Context f68047a;

    /* renamed from: b */
    protected Scroller f68048b;

    /* renamed from: c */
    protected float f68049c;

    /* renamed from: d */
    protected float f68050d;

    /* renamed from: e */
    protected float f68051e;

    /* renamed from: f */
    protected float f68052f;

    /* renamed from: g */
    protected VelocityTracker f68053g;

    /* renamed from: h */
    protected int f68054h;

    /* renamed from: i */
    protected int f68055i;

    /* renamed from: j */
    protected int f68056j;

    /* renamed from: k */
    protected boolean f68057k;

    /* renamed from: l */
    protected float f68058l;

    /* renamed from: m */
    protected float f68059m;

    /* renamed from: n */
    protected float f68060n;

    /* renamed from: o */
    protected float f68061o;

    /* renamed from: p */
    protected float f68062p;

    /* renamed from: q */
    protected float f68063q;

    /* renamed from: r */
    protected View f68064r;

    /* renamed from: s */
    protected ViewPager f68065s;

    /* renamed from: t */
    protected DIRECTION f68066t;

    /* renamed from: u */
    protected int f68067u;

    /* renamed from: v */
    protected int f68068v;

    /* renamed from: w */
    protected int f68069w;

    /* renamed from: x */
    protected boolean f68070x;

    /* renamed from: y */
    protected boolean f68071y;

    /* renamed from: z */
    protected int f68072z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout$DIRECTION */
    public enum DIRECTION {
        UP,
        DOWN
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout$a */
    public interface C25763a {
        /* renamed from: a */
        void mo61694a(float f, float f2);

        /* renamed from: b */
        void mo61702b(int i, int i2);

        /* renamed from: r */
        boolean mo62081r();
    }

    /* renamed from: b */
    private static int m84655b(int i, int i2) {
        return i - i2;
    }

    public int getCurScrollY() {
        return this.f68039E;
    }

    public C25765b getHelper() {
        return this.f68044J;
    }

    public int getMaxY() {
        return this.f68037C;
    }

    public int getMinY() {
        return this.f68036B;
    }

    public int getTabsMarginTop() {
        return this.f68038D;
    }

    /* renamed from: c */
    private void m84657c() {
        if (this.f68053g == null) {
            this.f68053g = VelocityTracker.obtain();
        }
    }

    /* renamed from: d */
    private boolean m84658d() {
        if (this.f68039E >= this.f68037C) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m84656b() {
        if (this.f68053g == null) {
            this.f68053g = VelocityTracker.obtain();
        } else {
            this.f68053g.clear();
        }
    }

    /* renamed from: a */
    public final void mo66866a() {
        if (this.f68039E != 0) {
            scrollTo(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        if (this.f68064r != null && !this.f68064r.isClickable()) {
            this.f68064r.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.f68065s = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (this.f68048b.computeScrollOffset()) {
            int currY = this.f68048b.getCurrY();
            if (this.f68066t != DIRECTION.UP) {
                if (this.f68044J.mo66886a()) {
                    scrollTo(0, getScrollY() + (currY - this.f68072z));
                    if (this.f68039E <= this.f68036B) {
                        this.f68048b.forceFinished(true);
                        return;
                    }
                }
                invalidate();
            } else if (m84658d()) {
                int finalY = this.f68048b.getFinalY() - currY;
                int b = m84655b(this.f68048b.getDuration(), this.f68048b.timePassed());
                this.f68044J.mo66885a(m84653a(finalY, b), finalY, b);
                this.f68048b.forceFinished(true);
                return;
            } else {
                scrollTo(0, currY);
            }
            this.f68072z = currY;
        }
    }

    public void setMinY(int i) {
        this.f68036B = i;
    }

    public void setOnScrollListener(C25763a aVar) {
        this.f68043I = aVar;
    }

    public void setScrollMinY(int i) {
        this.f68041G = i;
    }

    public void setTabsMarginTop(int i) {
        this.f68038D = i;
    }

    public ScrollableLayout(Context context) {
        this(context, null);
    }

    public void setCanScrollUp(boolean z) {
        if (this.f68042H != z) {
            this.f68042H = z;
            if (this.f68042H) {
                this.f68037C = this.f68067u - this.f68038D;
                return;
            }
            if (this.f68039E != 0) {
                scrollTo(0, 0);
            }
            this.f68037C = 0;
        }
    }

    public void setMaxScrollHeight(int i) {
        this.f68037C = Math.min(i, this.f68067u - this.f68038D);
        this.f68037C = Math.max(this.f68037C, 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DIRECTION direction;
        MotionEvent motionEvent2 = motionEvent;
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int abs = (int) Math.abs(x - this.f68049c);
            int abs2 = (int) Math.abs(y - this.f68050d);
            switch (motionEvent.getAction()) {
                case 0:
                    this.f68035A = false;
                    this.f68057k = false;
                    this.f68058l = motionEvent.getRawX();
                    this.f68059m = motionEvent.getRawY();
                    this.f68070x = true;
                    this.f68071y = true;
                    this.f68049c = x;
                    this.f68050d = y;
                    this.f68051e = x;
                    this.f68052f = y;
                    this.f68068v = getScrollY();
                    m84654a((int) y, this.f68067u, getScrollY());
                    m84656b();
                    this.f68053g.addMovement(motionEvent2);
                    this.f68048b.forceFinished(true);
                    break;
                case 1:
                    if (this.f68043I != null) {
                        this.f68043I.mo62081r();
                    }
                    if (this.f68071y && abs2 > abs && abs2 > this.f68054h) {
                        this.f68053g.computeCurrentVelocity(1000, (float) this.f68056j);
                        float f = -this.f68053g.getYVelocity();
                        if (Math.abs(f) > ((float) this.f68055i)) {
                            if (f > 0.0f) {
                                direction = DIRECTION.UP;
                            } else {
                                direction = DIRECTION.DOWN;
                            }
                            this.f68066t = direction;
                            if (this.f68066t != DIRECTION.UP || !m84658d()) {
                                this.f68048b.fling(0, getScrollY(), 0, (int) f, 0, 0, -2147483647, Integer.MAX_VALUE);
                                this.f68048b.computeScrollOffset();
                                this.f68072z = getScrollY();
                                invalidate();
                            }
                        }
                        if (this.f68040F || !m84658d()) {
                            int action = motionEvent.getAction();
                            motionEvent2.setAction(3);
                            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            motionEvent2.setAction(action);
                            return dispatchTouchEvent;
                        }
                    }
                case 2:
                    if (!this.f68035A) {
                        m84657c();
                        this.f68053g.addMovement(motionEvent2);
                        float f2 = this.f68052f - y;
                        if (this.f68043I != null) {
                            this.f68043I.mo61694a(this.f68051e - x, f2);
                        }
                        if (this.f68070x) {
                            if (abs > this.f68054h && abs > abs2) {
                                this.f68070x = false;
                                this.f68071y = false;
                            } else if (abs2 > this.f68054h && abs2 > abs) {
                                this.f68070x = false;
                                this.f68071y = true;
                            }
                        }
                        if (this.f68071y && abs2 > this.f68054h && abs2 > abs && (!m84658d() || this.f68044J.mo66886a())) {
                            if (this.f68065s != null) {
                                this.f68065s.requestDisallowInterceptTouchEvent(true);
                            }
                            scrollBy(0, (int) (f2 + 0.5f));
                        }
                        this.f68051e = x;
                        this.f68052f = y;
                        this.f68060n = motionEvent.getRawX();
                        this.f68061o = motionEvent.getRawY();
                        this.f68062p = (float) ((int) (this.f68060n - this.f68058l));
                        this.f68063q = (float) ((int) (this.f68061o - this.f68059m));
                        if (Math.abs(this.f68063q) > ((float) this.f68041G) && Math.abs(this.f68063q) * 0.1f > Math.abs(this.f68062p)) {
                            this.f68057k = false;
                            break;
                        } else {
                            this.f68057k = true;
                            break;
                        }
                    }
                    break;
                case 3:
                    if (this.f68043I != null) {
                        this.f68043I.mo62081r();
                    }
                    if (this.f68071y && this.f68040F && (abs > this.f68054h || abs2 > this.f68054h)) {
                        int action2 = motionEvent.getAction();
                        motionEvent2.setAction(3);
                        boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                        motionEvent2.setAction(action2);
                        return dispatchTouchEvent2;
                    }
            }
            super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private int m84653a(int i, int i2) {
        if (this.f68048b == null) {
            return 0;
        }
        if (this.f68069w >= 14) {
            return (int) this.f68048b.getCurrVelocity();
        }
        return i / i2;
    }

    public void scrollBy(int i, int i2) {
        int scrollY = getScrollY();
        if (scrollY + i2 < this.f68046L) {
            i2 /= 3;
        }
        int i3 = i2 + scrollY;
        if (i3 >= this.f68037C) {
            i3 = this.f68037C;
        } else if (i3 <= this.f68036B) {
            i3 = this.f68036B;
        }
        super.scrollBy(i, i3 - scrollY);
    }

    public void scrollTo(int i, int i2) {
        if (i2 >= this.f68037C) {
            i2 = this.f68037C;
        } else if (i2 <= this.f68036B) {
            i2 = this.f68036B;
        }
        this.f68039E = i2;
        if (this.f68043I != null) {
            this.f68043I.mo61702b(i2, this.f68037C);
        }
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f68064r = getChildAt(0);
        if (this.f68064r != null) {
            measureChildWithMargins(this.f68064r, i, 0, 0, 0);
            this.f68067u = this.f68064r.getMeasuredHeight();
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2) + (this.f68067u - this.f68038D), 1073741824));
        if (!this.f68045K) {
            this.f68037C = this.f68067u - this.f68038D;
            this.f68045K = true;
        }
        if (!this.f68042H) {
            this.f68037C = 0;
        }
    }

    /* renamed from: a */
    private void m84654a(int i, int i2, int i3) {
        boolean z;
        if (i + i3 <= i2) {
            z = true;
        } else {
            z = false;
        }
        this.f68040F = z;
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68041G = 10;
        this.f68042H = true;
        this.f68047a = context;
        this.f68044J = new C25765b();
        this.f68048b = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f68054h = viewConfiguration.getScaledTouchSlop();
        this.f68055i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f68056j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f68069w = VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollableLayout);
        this.f68038D = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
