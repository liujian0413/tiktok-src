package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.HorizontalScrollView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p308ui.C23466f;
import com.p280ss.android.ugc.aweme.base.utils.C23478e;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.feed.listener.C28527i;
import com.p280ss.android.ugc.aweme.feed.listener.C28528j;
import com.p280ss.android.ugc.aweme.feed.listener.C28529k;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout */
public class SlideSwitchLayout extends HorizontalScrollView {

    /* renamed from: a */
    public static final int f75796a = C23482j.m77100c(AwemeApplication.m21341a());

    /* renamed from: c */
    public static final int f75797c = ((int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 8.0f));

    /* renamed from: q */
    private static final int f75798q = ViewConfiguration.getMaximumFlingVelocity();

    /* renamed from: x */
    private static final int f75799x = ((int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 500.0f));

    /* renamed from: A */
    private Runnable f75800A;

    /* renamed from: B */
    private C23466f f75801B;

    /* renamed from: C */
    private C28529k f75802C;

    /* renamed from: D */
    private C28528j f75803D;

    /* renamed from: b */
    public boolean f75804b;

    /* renamed from: d */
    public long f75805d;

    /* renamed from: e */
    public boolean f75806e;

    /* renamed from: f */
    public int f75807f;

    /* renamed from: g */
    public int f75808g;

    /* renamed from: h */
    boolean f75809h;

    /* renamed from: i */
    public C28527i f75810i;

    /* renamed from: j */
    private boolean f75811j;

    /* renamed from: k */
    private int f75812k;

    /* renamed from: l */
    private int f75813l;

    /* renamed from: m */
    private int f75814m;

    /* renamed from: n */
    private boolean f75815n;

    /* renamed from: o */
    private List<C28752a> f75816o;

    /* renamed from: p */
    private VelocityTracker f75817p;

    /* renamed from: r */
    private int f75818r;

    /* renamed from: s */
    private int f75819s;

    /* renamed from: t */
    private int f75820t;

    /* renamed from: u */
    private boolean f75821u;

    /* renamed from: v */
    private boolean f75822v;

    /* renamed from: w */
    private boolean f75823w;

    /* renamed from: y */
    private boolean f75824y;

    /* renamed from: z */
    private boolean f75825z;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a */
    public static class C28752a {

        /* renamed from: a */
        public int f75831a;

        /* renamed from: b */
        public String f75832b;

        /* renamed from: c */
        public boolean f75833c = true;

        public final int hashCode() {
            return this.f75832b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28752a)) {
                return false;
            }
            return this.f75832b.equals(((C28752a) obj).f75832b);
        }

        public C28752a(String str, int i) {
            this.f75832b = str;
            this.f75831a = i;
        }
    }

    public void fling(int i) {
    }

    public int getCurrentItem() {
        return this.f75808g;
    }

    /* renamed from: a */
    public final void mo73917a(String str, int i) {
        if (C43127fh.m136806a(getContext())) {
            this.f75816o.add(0, new C28752a(str, 0));
        } else {
            this.f75816o.add(new C28752a(str, 0));
        }
        this.f75813l = this.f75816o.size() - 1;
    }

    /* renamed from: a */
    public final void mo73918a(String str, boolean z) {
        m94657a(str, false, "FROM_SLIDE");
    }

    /* renamed from: c */
    private void m94664c() {
        m94665c(this.f75808g);
    }

    /* renamed from: b */
    private void m94659b() {
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                SlideSwitchLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                SlideSwitchLayout.this.mo73916a();
                return false;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f75817p = VelocityTracker.obtain();
    }

    /* renamed from: d */
    private void m94667d() {
        if (this.f75817p != null) {
            this.f75817p.clear();
            this.f75817p.recycle();
            this.f75817p = null;
        }
    }

    public String getCurrentItemName() {
        if (this.f75816o.isEmpty()) {
            return "";
        }
        return ((C28752a) this.f75816o.get(this.f75808g)).f75832b;
    }

    /* renamed from: a */
    public final void mo73916a() {
        if (!this.f75815n) {
            this.f75815n = true;
            m94664c();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    public void setCanScroll(boolean z) {
        this.f75804b = z;
    }

    public void setOnFeedScrollListener(C28528j jVar) {
        this.f75803D = jVar;
    }

    public void setOnFlingEndListener(C23466f fVar) {
        this.f75801B = fVar;
    }

    public void setOnFlingToIndexListener(C28529k kVar) {
        this.f75802C = kVar;
    }

    public void setOnPageChangeListener(C28527i iVar) {
        this.f75810i = iVar;
    }

    public void setOverScrollLeftAction(Runnable runnable) {
        this.f75800A = runnable;
    }

    public void setScrowToChildWhenRequestChildFocus(boolean z) {
        this.f75811j = z;
    }

    public SlideSwitchLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static int m94651a(int i) {
        return i * f75796a;
    }

    private void setCurrentItem(int i) {
        m94653a(i, "FROM_SLIDE");
    }

    public void setCanScrollToProfile(boolean z) {
        m94661b("page_profile", z);
    }

    /* renamed from: c */
    private void m94665c(int i) {
        setScrollX(m94651a(i));
    }

    /* renamed from: e */
    private void m94669e(MotionEvent motionEvent) {
        if (this.f75817p == null) {
            this.f75817p = VelocityTracker.obtain();
        }
        this.f75817p.addMovement(motionEvent);
    }

    /* access modifiers changed from: protected */
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.f75811j) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m94664c();
        }
    }

    public void setCurrentItem(String str) {
        m94656a(str, "FROM_SLIDE");
    }

    /* renamed from: a */
    private C28752a m94652a(String str) {
        for (int i = 0; i < this.f75816o.size(); i++) {
            C28752a aVar = (C28752a) this.f75816o.get(i);
            if (TextUtils.equals(aVar.f75832b, str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private boolean m94666c(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            return false;
        }
    }

    /* renamed from: b */
    private boolean m94662b(int i) {
        if (this.f75816o.isEmpty() || i >= this.f75816o.size()) {
            return false;
        }
        return ((C28752a) this.f75816o.get(i)).f75833c;
    }

    /* renamed from: d */
    private boolean m94668d(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        int findPointerIndex = motionEvent.findPointerIndex(this.f75818r);
        boolean z5 = false;
        if (findPointerIndex == -1) {
            return false;
        }
        int x = (int) motionEvent.getX(findPointerIndex);
        if (Math.abs(x - this.f75812k) <= f75796a) {
            z = true;
        } else {
            z = false;
        }
        if (x - this.f75812k > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            int i3 = this.f75814m - (x - this.f75812k);
            if (this.f75808g <= 0) {
                i = this.f75808g;
            } else {
                i = this.f75808g - 1;
            }
            if (this.f75808g >= this.f75813l) {
                i2 = this.f75813l;
            } else {
                i2 = this.f75808g + 1;
            }
            if (i3 < 0 || !m94662b(i)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i3 <= this.f75813l * f75796a && m94662b(i2)) {
                z5 = true;
            }
            if (z2) {
                z4 = z3;
            } else {
                z4 = z5;
            }
            if (!z3 && !this.f75825z && this.f75800A != null) {
                this.f75825z = true;
                this.f75800A.run();
            }
        }
        return z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f75804b) {
            return false;
        }
        int action = motionEvent.getAction();
        m94669e(motionEvent);
        switch (action) {
            case 0:
                return m94658a(motionEvent);
            case 1:
            case 3:
                int x = (int) motionEvent.getX();
                VelocityTracker velocityTracker = this.f75817p;
                if (x <= this.f75819s) {
                    z = true;
                } else {
                    z = false;
                }
                m94655a(velocityTracker, z);
                this.f75824y = false;
                boolean b = m94663b(motionEvent);
                this.f75825z = false;
                return b;
            case 2:
                if (this.f75803D != null) {
                    getScrollX();
                }
                return m94663b(motionEvent);
            default:
                return false;
        }
    }

    /* renamed from: b */
    private boolean m94663b(MotionEvent motionEvent) {
        if (!m94668d(motionEvent) || !m94666c(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f75804b) {
            return false;
        }
        if (this.f75806e) {
            return true;
        }
        if (this.f75805d != 0 && System.currentTimeMillis() - this.f75805d < 150) {
            return this.f75809h;
        }
        if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
            return false;
        }
        this.f75809h = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.f75819s = (int) motionEvent.getX();
                this.f75820t = (int) motionEvent.getY();
                m94658a(motionEvent);
                this.f75823w = true;
                break;
            case 1:
                this.f75809h = false;
                break;
            case 2:
                float abs = Math.abs(((float) this.f75819s) - motionEvent.getX());
                float abs2 = Math.abs(((float) this.f75820t) - motionEvent.getY());
                if ((abs > ((float) f75797c) || abs2 > ((float) f75797c)) && this.f75823w) {
                    if (abs - abs2 >= 0.0f) {
                        this.f75809h = true;
                    } else {
                        this.f75809h = false;
                    }
                    this.f75823w = false;
                    break;
                }
            default:
                this.f75809h = true;
                break;
        }
        return this.f75809h;
    }

    /* renamed from: a */
    private boolean m94658a(MotionEvent motionEvent) {
        this.f75818r = motionEvent.getPointerId(0);
        this.f75812k = (int) motionEvent.getX();
        this.f75814m = getScrollX();
        return super.onTouchEvent(motionEvent);
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public SlideSwitchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m94653a(int i, String str) {
        m94654a(i, true, str);
    }

    public void scrollBy(int i, int i2) {
        if ((-i) != f75796a) {
            super.scrollBy(i, i2);
        }
    }

    /* renamed from: b */
    private void m94660b(final int i, final String str) {
        post(new Runnable() {
            public final void run() {
                SlideSwitchLayout.this.smoothScrollTo(SlideSwitchLayout.m94651a(i), 0);
                SlideSwitchLayout.this.f75805d = System.currentTimeMillis();
                SlideSwitchLayout.this.f75807f = SlideSwitchLayout.this.f75808g;
                SlideSwitchLayout.this.f75808g = i;
            }
        });
        this.f75806e = true;
        postDelayed(new Runnable() {
            public final void run() {
                SlideSwitchLayout.this.f75806e = false;
            }
        }, 150);
    }

    /* renamed from: b */
    private void m94661b(String str, boolean z) {
        C28752a a = m94652a(str);
        if (a != null) {
            a.f75833c = z;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!(view2 == null || view2.getTag() == null)) {
            Object tag = view2.getTag();
            if ((tag instanceof String) && TextUtils.equals((String) tag, "relation_search_tag")) {
                super.requestChildFocus(view, view2);
                return;
            }
        }
        if (!TextUtils.equals(getCurrentItemName(), "page_feed")) {
            super.requestChildFocus(view, view2);
        }
    }

    /* renamed from: a */
    private void m94655a(VelocityTracker velocityTracker, boolean z) {
        int i;
        velocityTracker.computeCurrentVelocity(1000, (float) f75798q);
        float xVelocity = velocityTracker.getXVelocity(this.f75818r);
        int scrollX = getScrollX() % f75796a;
        if (scrollX == 0) {
            if (this.f75801B != null && z) {
                this.f75801B.mo61074a();
            }
            return;
        }
        int scrollX2 = getScrollX() / f75796a;
        int i2 = 1;
        if (Math.abs(xVelocity) < ((float) f75799x)) {
            if (scrollX <= f75796a / 2) {
                i2 = 0;
            }
            i = scrollX2 + i2;
        } else {
            if (xVelocity >= 0.0f) {
                i2 = 0;
            }
            i = scrollX2 + i2;
        }
        m94653a(C23478e.m77084a(i, 0, this.f75813l), "FROM_SLIDE");
        m94667d();
    }

    /* renamed from: a */
    private void m94656a(String str, String str2) {
        m94657a(str, true, str2);
    }

    public SlideSwitchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75811j = true;
        this.f75816o = new ArrayList(5);
        this.f75804b = false;
        this.f75821u = true;
        this.f75822v = true;
        this.f75823w = false;
        this.f75806e = false;
        this.f75807f = 0;
        this.f75808g = 0;
        this.f75824y = false;
        this.f75809h = false;
        m94659b();
    }

    /* renamed from: a */
    private void m94654a(int i, boolean z, String str) {
        if (z) {
            if (!(i == this.f75808g && getScrollX() == m94651a(i))) {
                m94660b(i, str);
            }
        } else if (i != this.f75808g) {
            this.f75807f = this.f75808g;
            this.f75808g = i;
            if (this.f75815n) {
                m94665c(this.f75808g);
            }
        }
    }

    /* renamed from: a */
    private void m94657a(String str, boolean z, String str2) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f75816o.size()) {
                break;
            } else if (TextUtils.equals(str, ((C28752a) this.f75816o.get(i2)).f75832b)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        m94654a(i, z, str2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (C33003b.m106651a() && i3 == 0 && i == f75796a) {
            setCurrentItem("page_feed");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }
}
