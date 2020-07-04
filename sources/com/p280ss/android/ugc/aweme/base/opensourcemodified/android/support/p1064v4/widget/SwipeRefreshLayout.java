package com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0979k;
import android.support.p022v4.view.C0980l;
import android.support.p022v4.view.C0981m;
import android.support.p022v4.view.C0982n;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout */
public class SwipeRefreshLayout extends ViewGroup implements C0979k, C0981m, C23389b {

    /* renamed from: G */
    private static final int[] f61485G = {16842766};

    /* renamed from: n */
    private static final String f61486n = "SwipeRefreshLayout";

    /* renamed from: o */
    private static final String f61487o = "SwipeRefreshLayout";

    /* renamed from: A */
    private float f61488A;

    /* renamed from: B */
    private float f61489B;

    /* renamed from: C */
    private boolean f61490C;

    /* renamed from: D */
    private int f61491D;

    /* renamed from: E */
    private boolean f61492E;

    /* renamed from: F */
    private final DecelerateInterpolator f61493F;

    /* renamed from: H */
    private int f61494H;

    /* renamed from: I */
    private Animation f61495I;

    /* renamed from: J */
    private Animation f61496J;

    /* renamed from: K */
    private Animation f61497K;

    /* renamed from: L */
    private Animation f61498L;

    /* renamed from: M */
    private Animation f61499M;

    /* renamed from: N */
    private int f61500N;

    /* renamed from: O */
    private C23385a f61501O;

    /* renamed from: P */
    private AnimationListener f61502P;

    /* renamed from: Q */
    private final Animation f61503Q;

    /* renamed from: R */
    private final Animation f61504R;

    /* renamed from: a */
    C23386b f61505a;

    /* renamed from: b */
    public boolean f61506b;

    /* renamed from: c */
    int f61507c;

    /* renamed from: d */
    boolean f61508d;

    /* renamed from: e */
    C23387a f61509e;

    /* renamed from: f */
    protected int f61510f;

    /* renamed from: g */
    float f61511g;

    /* renamed from: h */
    protected int f61512h;

    /* renamed from: i */
    int f61513i;

    /* renamed from: j */
    C23390c f61514j;

    /* renamed from: k */
    boolean f61515k;

    /* renamed from: l */
    boolean f61516l;

    /* renamed from: m */
    C23395d f61517m;

    /* renamed from: p */
    private View f61518p;

    /* renamed from: q */
    private int f61519q;

    /* renamed from: r */
    private float f61520r;

    /* renamed from: s */
    private boolean f61521s;

    /* renamed from: t */
    private float f61522t;

    /* renamed from: u */
    private final C0982n f61523u;

    /* renamed from: v */
    private final C0980l f61524v;

    /* renamed from: w */
    private final int[] f61525w;

    /* renamed from: x */
    private final int[] f61526x;

    /* renamed from: y */
    private boolean f61527y;

    /* renamed from: z */
    private int f61528z;

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout$a */
    public interface C23385a {
        /* renamed from: a */
        boolean mo60743a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout$b */
    public interface C23386b {
        /* renamed from: a */
        void mo60744a();
    }

    public int getProgressCircleDiameter() {
        return this.f61500N;
    }

    public int getProgressViewEndOffset() {
        return this.f61513i;
    }

    public int getProgressViewStartOffset() {
        return this.f61512h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60698a(AnimationListener animationListener) {
        this.f61496J = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f61496J.setDuration(150);
        this.f61509e.mo60745a(animationListener);
        this.f61509e.clearAnimation();
        this.f61509e.startAnimation(this.f61496J);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60697a(int i, boolean z) {
        this.f61509e.bringToFront();
        C0991u.m4222h((View) this.f61509e, i);
        this.f61507c = this.f61509e.getTop();
        if (z && VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    public int getNestedScrollAxes() {
        return this.f61523u.f3402a;
    }

    public boolean hasNestedScrollingParent() {
        return this.f61524v.mo3761a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f61524v.f3397a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo60695a();
    }

    public void stopNestedScroll() {
        this.f61524v.mo3770b();
    }

    /* renamed from: c */
    private static boolean m76676c() {
        if (VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m76677d() {
        this.f61497K = m76665a(this.f61514j.getAlpha(), 76);
    }

    /* renamed from: e */
    private void m76679e() {
        this.f61498L = m76665a(this.f61514j.getAlpha(), (int) NormalGiftView.ALPHA_255);
    }

    /* renamed from: f */
    private void m76680f() {
        if (this.f61518p == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f61509e)) {
                    this.f61518p = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m76670b() {
        this.f61509e = new C23387a(getContext(), -328966);
        this.f61514j = new C23390c(getContext(), this);
        this.f61514j.mo60761b(-328966);
        this.f61509e.setImageDrawable(this.f61514j);
        this.f61509e.setVisibility(8);
        addView(this.f61509e);
    }

    /* renamed from: g */
    private boolean m76681g() {
        if (this.f61501O != null) {
            return this.f61501O.mo60743a(this, this.f61518p);
        }
        if (VERSION.SDK_INT >= 14) {
            return C0991u.m4195a(this.f61518p, -1);
        }
        if (this.f61518p instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f61518p;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (C0991u.m4195a(this.f61518p, -1) || this.f61518p.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60695a() {
        this.f61517m.mo60798a();
        this.f61509e.clearAnimation();
        this.f61514j.stop();
        this.f61509e.setVisibility(8);
        setColorViewAlpha(NormalGiftView.ALPHA_255);
        if (this.f61508d) {
            setAnimationProgress(0.0f);
        } else {
            mo60697a(this.f61512h - this.f61507c, true);
        }
        this.f61507c = this.f61509e.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f61520r = (float) i;
    }

    public void setDoNotCatchException(boolean z) {
        this.f61521s = z;
    }

    public void setOnChildScrollUpCallback(C23385a aVar) {
        this.f61501O = aVar;
    }

    public void setOnRefreshListener(C23386b bVar) {
        this.f61505a = bVar;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f61524v.mo3760a(z);
    }

    public boolean startNestedScroll(int i) {
        return this.f61524v.mo3771b(i);
    }

    private void setColorViewAlpha(int i) {
        this.f61509e.getBackground().setAlpha(i);
        this.f61514j.setAlpha(i);
    }

    public void setColorSchemeColors(int... iArr) {
        m76680f();
        this.f61514j.mo60758a(iArr);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo60695a();
        }
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f61509e.setBackgroundColor(i);
        this.f61514j.mo60761b(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0683b.m2912c(getContext(), i));
    }

    /* renamed from: a */
    private void m76667a(MotionEvent motionEvent) {
        int i;
        int b = C0978j.m4131b(motionEvent);
        if (motionEvent.getPointerId(b) == this.f61491D) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f61491D = motionEvent.getPointerId(i);
        }
    }

    public void onStopNestedScroll(View view) {
        this.f61523u.mo3774a(view);
        this.f61527y = false;
        if (this.f61522t > 0.0f) {
            m76674c(this.f61522t);
            this.f61522t = 0.0f;
        }
        stopNestedScroll();
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        if (m76676c()) {
            setColorViewAlpha((int) (f * 255.0f));
            return;
        }
        C0991u.m4218g((View) this.f61509e, f);
        C0991u.m4221h((View) this.f61509e, f);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0683b.m2912c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    /* renamed from: c */
    private void m76674c(float f) {
        if (f > this.f61520r) {
            m76668a(true, true);
            return;
        }
        this.f61506b = false;
        this.f61514j.mo60754a(0.0f, 0.0f);
        C233805 r0 = null;
        if (!this.f61508d) {
            r0 = new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.f61508d) {
                        SwipeRefreshLayout.this.mo60698a((AnimationListener) null);
                    }
                }
            };
        }
        m76672b(this.f61507c, this.f61517m.mo60797a((AnimationListener) r0));
        this.f61514j.mo60757a(false);
    }

    /* renamed from: d */
    private void m76678d(float f) {
        if (f - this.f61489B > ((float) this.f61519q) && !this.f61490C) {
            this.f61488A = this.f61489B + ((float) this.f61519q);
            this.f61490C = true;
            this.f61514j.setAlpha(76);
        }
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f61506b == z) {
            m76668a(z, false);
            return;
        }
        this.f61506b = z;
        if (!this.f61516l) {
            i = this.f61513i + this.f61512h;
        } else {
            i = this.f61513i;
        }
        mo60697a(i - this.f61507c, true);
        this.f61515k = false;
        m76673b(this.f61502P);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f61500N = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f61500N = (int) (displayMetrics.density * 40.0f);
            }
            this.f61509e.setImageDrawable(null);
            this.f61514j.mo60756a(i);
            this.f61509e.setImageDrawable(this.f61514j);
        }
    }

    /* renamed from: b */
    private void m76671b(float f) {
        int i;
        this.f61514j.mo60757a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f61520r));
        double d = (double) min;
        Double.isNaN(d);
        float max = (Math.max((float) (d - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f61520r;
        if (this.f61516l) {
            i = this.f61513i - this.f61512h;
        } else {
            i = this.f61513i;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f61512h + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f61509e.getVisibility() != 0) {
            this.f61509e.setVisibility(0);
        }
        if (!this.f61508d) {
            C0991u.m4218g((View) this.f61509e, 1.0f);
            C0991u.m4221h((View) this.f61509e, 1.0f);
        }
        if (this.f61508d) {
            setAnimationProgress(Math.min(1.0f, f / this.f61520r));
        }
        if (f < this.f61520r) {
            if (this.f61514j.getAlpha() > 76 && !m76669a(this.f61497K)) {
                m76677d();
            }
        } else if (this.f61514j.getAlpha() < 255 && !m76669a(this.f61498L)) {
            m76679e();
        }
        this.f61514j.mo60754a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f61514j.mo60753a(Math.min(1.0f, max));
        this.f61514j.mo60759b((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        mo60697a(i2 - this.f61507c, true);
        this.f61517m.mo60799a(min);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m76680f();
        int a = C0978j.m4129a(motionEvent);
        if (this.f61492E && a == 0) {
            this.f61492E = false;
        }
        if (!isEnabled() || this.f61492E || m76681g() || this.f61506b || this.f61527y) {
            return false;
        }
        if (a != 6) {
            switch (a) {
                case 0:
                    mo60697a(this.f61512h - this.f61509e.getTop(), true);
                    this.f61491D = motionEvent.getPointerId(0);
                    this.f61490C = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.f61491D);
                    if (findPointerIndex >= 0) {
                        this.f61489B = motionEvent.getY(findPointerIndex);
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f61490C = false;
                    this.f61491D = -1;
                    break;
                case 2:
                    if (this.f61491D != -1) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f61491D);
                        if (findPointerIndex2 >= 0) {
                            m76678d(motionEvent.getY(findPointerIndex2));
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
            }
        } else {
            m76667a(motionEvent);
        }
        return this.f61490C;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C0978j.m4129a(motionEvent);
        if (this.f61492E && a == 0) {
            this.f61492E = false;
        }
        if (!isEnabled() || this.f61492E || m76681g() || this.f61506b || this.f61527y) {
            return false;
        }
        switch (a) {
            case 0:
                this.f61491D = motionEvent.getPointerId(0);
                this.f61490C = false;
                break;
            case 1:
            case 3:
                int findPointerIndex = motionEvent.findPointerIndex(this.f61491D);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.f61490C) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f61488A) * 0.5f;
                    this.f61490C = false;
                    m76674c(y);
                }
                this.f61491D = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f61491D);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m76678d(y2);
                if (this.f61490C) {
                    float f = (y2 - this.f61488A) * 0.5f;
                    if (f > 0.0f) {
                        m76671b(f);
                        break;
                    } else {
                        m76671b(0.0f);
                        return false;
                    }
                }
                break;
            case 5:
                int b = C0978j.m4131b(motionEvent);
                if (b >= 0) {
                    this.f61491D = motionEvent.getPointerId(b);
                    break;
                } else {
                    return false;
                }
            case 6:
                m76667a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m76669a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m76673b(AnimationListener animationListener) {
        this.f61509e.setVisibility(0);
        if (VERSION.SDK_INT >= 11) {
            this.f61514j.setAlpha(NormalGiftView.ALPHA_255);
        }
        this.f61495I = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f61495I.setDuration((long) this.f61528z);
        if (animationListener != null) {
            this.f61509e.mo60745a(animationListener);
        }
        this.f61509e.clearAnimation();
        this.f61509e.startAnimation(this.f61495I);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60696a(float f) {
        mo60697a((this.f61510f + ((int) (((float) (this.f61512h - this.f61510f)) * f))) - this.f61509e.getTop(), false);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f61524v.mo3762a(f, f2);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f61494H < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f61494H;
        }
        if (i2 >= this.f61494H) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: a */
    private Animation m76665a(final int i, final int i2) {
        if (this.f61508d && m76676c()) {
            return null;
        }
        C233794 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.f61514j.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.f61509e.mo60745a(null);
        this.f61509e.clearAnimation();
        this.f61509e.startAnimation(r0);
        return r0;
    }

    /* renamed from: a */
    private void m76666a(int i, AnimationListener animationListener) {
        this.f61517m.mo60800a(i, animationListener);
        this.f61510f = i;
        this.f61503Q.reset();
        this.f61503Q.setDuration(200);
        this.f61503Q.setInterpolator(this.f61493F);
        if (animationListener != null) {
            this.f61509e.mo60745a(animationListener);
        }
        this.f61509e.clearAnimation();
        this.f61509e.startAnimation(this.f61503Q);
    }

    /* renamed from: b */
    private void m76672b(int i, AnimationListener animationListener) {
        this.f61517m.mo60803b(i, animationListener);
        if (this.f61508d) {
            m76675c(i, animationListener);
            return;
        }
        this.f61510f = i;
        this.f61504R.reset();
        this.f61504R.setDuration(200);
        this.f61504R.setInterpolator(this.f61493F);
        if (animationListener != null) {
            this.f61509e.mo60745a(animationListener);
        }
        this.f61509e.clearAnimation();
        this.f61509e.startAnimation(this.f61504R);
    }

    /* renamed from: c */
    private void m76675c(int i, AnimationListener animationListener) {
        this.f61510f = i;
        if (m76676c()) {
            this.f61511g = (float) this.f61514j.getAlpha();
        } else {
            this.f61511g = C0991u.m4239r(this.f61509e);
        }
        this.f61499M = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.f61511g + ((-SwipeRefreshLayout.this.f61511g) * f));
                SwipeRefreshLayout.this.mo60696a(f);
            }
        };
        this.f61499M.setDuration(150);
        if (animationListener != null) {
            this.f61509e.mo60745a(animationListener);
        }
        this.f61509e.clearAnimation();
        this.f61509e.startAnimation(this.f61499M);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f61518p == null) {
            m76680f();
        }
        if (this.f61518p != null) {
            try {
                this.f61518p.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            } catch (IllegalStateException e) {
                C6921a.m21554a((Exception) e);
                C2077a.m9161a((Throwable) e, f61486n);
                if (this.f61521s) {
                    throw e;
                }
            }
            this.f61509e.measure(MeasureSpec.makeMeasureSpec(this.f61500N, 1073741824), MeasureSpec.makeMeasureSpec(this.f61500N, 1073741824));
            this.f61494H = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f61509e) {
                    this.f61494H = i3;
                    return;
                }
            }
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61520r = -1.0f;
        this.f61525w = new int[2];
        this.f61526x = new int[2];
        this.f61491D = -1;
        this.f61494H = -1;
        this.f61502P = new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.f61506b) {
                    SwipeRefreshLayout.this.f61517m.mo60802b();
                    SwipeRefreshLayout.this.f61514j.setAlpha(NormalGiftView.ALPHA_255);
                    SwipeRefreshLayout.this.f61514j.start();
                    if (SwipeRefreshLayout.this.f61515k && SwipeRefreshLayout.this.f61505a != null) {
                        SwipeRefreshLayout.this.f61505a.mo60744a();
                    }
                    SwipeRefreshLayout.this.f61507c = SwipeRefreshLayout.this.f61509e.getTop();
                    return;
                }
                SwipeRefreshLayout.this.mo60695a();
            }
        };
        this.f61503Q = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!SwipeRefreshLayout.this.f61516l) {
                    i = SwipeRefreshLayout.this.f61513i - Math.abs(SwipeRefreshLayout.this.f61512h);
                } else {
                    i = SwipeRefreshLayout.this.f61513i;
                }
                SwipeRefreshLayout.this.mo60697a((SwipeRefreshLayout.this.f61510f + ((int) (((float) (i - SwipeRefreshLayout.this.f61510f)) * f))) - SwipeRefreshLayout.this.f61509e.getTop(), false);
                SwipeRefreshLayout.this.f61514j.mo60753a(1.0f - f);
            }
        };
        this.f61504R = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.mo60696a(f);
            }
        };
        this.f61517m = new C23395d() {
        };
        this.f61519q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f61528z = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f61493F = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f61500N = (int) (displayMetrics.density * 40.0f);
        m76670b();
        C0991u.m4194a((ViewGroup) this, true);
        this.f61513i = (int) (displayMetrics.density * 64.0f);
        this.f61520r = (float) this.f61513i;
        this.f61523u = new C0982n(this);
        this.f61524v = new C0980l(this);
        setNestedScrollingEnabled(true);
        int i = -this.f61500N;
        this.f61507c = i;
        this.f61512h = i;
        mo60696a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f61485G);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m76668a(boolean z, boolean z2) {
        if (this.f61506b != z) {
            this.f61515k = z2;
            m76680f();
            this.f61506b = z;
            if (this.f61506b) {
                m76666a(this.f61507c, this.f61502P);
                return;
            }
            mo60698a(this.f61502P);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f61524v.mo3763a(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    /* renamed from: a */
    public final void mo60699a(boolean z, int i, int i2) {
        this.f61508d = z;
        this.f61512h = i;
        this.f61513i = i2;
        this.f61516l = true;
        mo60695a();
        this.f61506b = false;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f61523u.mo3776a(view, view2, i);
        startNestedScroll(i & 2);
        this.f61522t = 0.0f;
        this.f61527y = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isEnabled() || this.f61492E || this.f61506b || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f61524v.mo3768a(i, i2, iArr, iArr2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f61522t > 0.0f) {
            float f = (float) i2;
            if (f > this.f61522t) {
                iArr[1] = i2 - ((int) this.f61522t);
                this.f61522t = 0.0f;
            } else {
                this.f61522t -= f;
                iArr[1] = i2;
            }
            m76671b(this.f61522t);
        }
        if (this.f61516l && i2 > 0 && this.f61522t == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f61509e.setVisibility(8);
        }
        int[] iArr2 = this.f61525w;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f61524v.mo3766a(i, i2, i3, i4, iArr);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f61526x);
        int i5 = i4 + this.f61526x[1];
        if (i5 < 0 && !m76681g()) {
            this.f61522t += (float) Math.abs(i5);
            m76671b(this.f61522t);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f61518p == null) {
                m76680f();
            }
            if (this.f61518p != null) {
                View view = this.f61518p;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                try {
                    view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                } catch (Exception e) {
                    C6921a.m21554a(e);
                    C2077a.m9161a((Throwable) e, f61486n);
                    if (this.f61521s) {
                        throw e;
                    }
                }
                int measuredWidth2 = this.f61509e.getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                this.f61509e.layout(i5 - i6, this.f61507c, i5 + i6, this.f61507c + this.f61509e.getMeasuredHeight());
            }
        }
    }
}
