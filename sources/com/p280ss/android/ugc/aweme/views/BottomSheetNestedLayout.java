package com.p280ss.android.ugc.aweme.views;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.util.Pools.SynchronizedPool;
import android.support.p022v4.view.C0979k;
import android.support.p022v4.view.C0981m;
import android.support.p022v4.view.C0988r;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.utils.C43134fm;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1879c.C47894a;
import kotlin.p1879c.C47895b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout */
public final class BottomSheetNestedLayout extends LinearLayout implements C0981m {

    /* renamed from: C */
    private static final SynchronizedPool<Rect> f112173C = new SynchronizedPool<>(12);

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f112174a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BottomSheetNestedLayout.class), "mViewConfiguration", "getMViewConfiguration()Landroid/view/ViewConfiguration;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BottomSheetNestedLayout.class), "mTouchSlop", "getMTouchSlop()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BottomSheetNestedLayout.class), "mMinimumVelocity", "getMMinimumVelocity()F")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BottomSheetNestedLayout.class), "mMaximumVelocity", "getMMaximumVelocity()F")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BottomSheetNestedLayout.class), "mVelocityTracker", "getMVelocityTracker()Landroid/view/VelocityTracker;")), C7575l.m23599a((MutablePropertyReference1) new MutablePropertyReference1Impl(C7575l.m23595a(BottomSheetNestedLayout.class), "mTouchScrollingChild", "getMTouchScrollingChild()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BottomSheetNestedLayout.class), "mPlaceholder", "getMPlaceholder()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BottomSheetNestedLayout.class), "mScrollingChild", "getMScrollingChild()Landroid/support/v7/widget/RecyclerView;"))};

    /* renamed from: i */
    public static final C43327b f112175i = new C43327b(null);

    /* renamed from: A */
    private final C43334h f112176A;

    /* renamed from: B */
    private final C43328c f112177B;

    /* renamed from: b */
    public float f112178b;

    /* renamed from: c */
    public boolean f112179c;

    /* renamed from: d */
    public boolean f112180d;

    /* renamed from: e */
    public boolean f112181e;

    /* renamed from: f */
    public boolean f112182f;

    /* renamed from: g */
    public C7562b<? super Boolean, C7581n> f112183g;

    /* renamed from: h */
    public C7562b<? super Boolean, C7581n> f112184h;

    /* renamed from: j */
    private final C7541d f112185j;

    /* renamed from: k */
    private final C7541d f112186k;

    /* renamed from: l */
    private final C7541d f112187l;

    /* renamed from: m */
    private final C7541d f112188m;

    /* renamed from: n */
    private final C7541d f112189n;

    /* renamed from: o */
    private boolean f112190o;

    /* renamed from: p */
    private float f112191p;

    /* renamed from: q */
    private float f112192q;

    /* renamed from: r */
    private float f112193r;

    /* renamed from: s */
    private float f112194s;

    /* renamed from: t */
    private float f112195t;

    /* renamed from: u */
    private float f112196u;

    /* renamed from: v */
    private boolean f112197v;

    /* renamed from: w */
    private final C47895b f112198w;

    /* renamed from: x */
    private final C7541d f112199x;

    /* renamed from: y */
    private boolean f112200y;

    /* renamed from: z */
    private final C7541d f112201z;

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$a */
    public static final class C43326a extends C47894a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f112203a;

        /* renamed from: b */
        final /* synthetic */ BottomSheetNestedLayout f112204b;

        public C43326a(Object obj, Object obj2, BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f112203a = obj;
            this.f112204b = bottomSheetNestedLayout;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo63286a(C7595j<?> jVar, Boolean bool, Boolean bool2) {
            boolean z;
            C7573i.m23587b(jVar, "property");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                BottomSheetNestedLayout bottomSheetNestedLayout = this.f112204b;
                if (this.f112204b.getMScrollingChild().computeVerticalScrollExtent() >= this.f112204b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                bottomSheetNestedLayout.f112179c = z;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$b */
    public static final class C43327b {
        private C43327b() {
        }

        public /* synthetic */ C43327b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$c */
    public static final class C43328c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f112205a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C43328c(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f112205a = bottomSheetNestedLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            C7562b<? super Boolean, C7581n> bVar = this.f112205a.f112184h;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(false));
            }
            this.f112205a.f112180d = false;
            this.f112205a.setVisibility(8);
            this.f112205a.setMIsFocus(false);
            this.f112205a.mo105140b();
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f112205a.f112181e || (!this.f112205a.f112180d && this.f112205a.getTranslationY() <= this.f112205a.f112178b)) {
                C7562b<? super Boolean, C7581n> bVar = this.f112205a.f112183g;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(false));
                }
            }
            this.f112205a.f112180d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$d */
    static final class C43329d extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f112206a;

        C43329d(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f112206a = bottomSheetNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m137554a());
        }

        /* renamed from: a */
        private float m137554a() {
            ViewConfiguration mViewConfiguration = this.f112206a.getMViewConfiguration();
            C7573i.m23582a((Object) mViewConfiguration, "mViewConfiguration");
            return (float) mViewConfiguration.getScaledMaximumFlingVelocity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$e */
    static final class C43330e extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f112207a;

        C43330e(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f112207a = bottomSheetNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m137555a());
        }

        /* renamed from: a */
        private float m137555a() {
            ViewConfiguration mViewConfiguration = this.f112207a.getMViewConfiguration();
            C7573i.m23582a((Object) mViewConfiguration, "mViewConfiguration");
            return (float) mViewConfiguration.getScaledMinimumFlingVelocity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$f */
    static final class C43331f extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f112208a;

        /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$f$a */
        static final class C43332a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C43331f f112209a;

            C43332a(C43331f fVar) {
                this.f112209a = fVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f112209a.f112208a.dismiss();
            }
        }

        C43331f(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f112208a = bottomSheetNestedLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            View findViewById = this.f112208a.findViewById(R.id.ed3);
            findViewById.setOnClickListener(new C43332a(this));
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$g */
    static final class C43333g extends Lambda implements C7561a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f112210a;

        C43333g(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f112210a = bottomSheetNestedLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecyclerView invoke() {
            return (RecyclerView) this.f112210a.findViewById(R.id.cqd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$h */
    public static final class C43334h implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f112211a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C43334h(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f112211a = bottomSheetNestedLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            C7562b<? super Boolean, C7581n> bVar = this.f112211a.f112184h;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(true));
            }
            this.f112211a.f112181e = false;
            this.f112211a.setMIsFocus(true);
            this.f112211a.mo105140b();
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f112211a.mo105139a()) {
                C7562b<? super Boolean, C7581n> bVar = this.f112211a.f112183g;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(true));
                }
            }
            this.f112211a.setVisibility(0);
            this.f112211a.f112181e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$i */
    static final class C43335i extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f112212a;

        C43335i(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f112212a = bottomSheetNestedLayout;
            super(0);
        }

        /* renamed from: a */
        private int m137558a() {
            ViewConfiguration mViewConfiguration = this.f112212a.getMViewConfiguration();
            C7573i.m23582a((Object) mViewConfiguration, "mViewConfiguration");
            return mViewConfiguration.getScaledTouchSlop();
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m137558a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$j */
    static final class C43336j extends Lambda implements C7561a<VelocityTracker> {

        /* renamed from: a */
        public static final C43336j f112213a = new C43336j();

        C43336j() {
            super(0);
        }

        /* renamed from: a */
        private static VelocityTracker m137559a() {
            return VelocityTracker.obtain();
        }

        public final /* synthetic */ Object invoke() {
            return m137559a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$k */
    static final class C43337k extends Lambda implements C7561a<ViewConfiguration> {

        /* renamed from: a */
        final /* synthetic */ Context f112214a;

        C43337k(Context context) {
            this.f112214a = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewConfiguration invoke() {
            return ViewConfiguration.get(this.f112214a);
        }
    }

    public BottomSheetNestedLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public BottomSheetNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f112188m.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f112187l.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.f112199x.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.f112198w.mo120018a(this, f112174a[5])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f112186k.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f112189n.getValue();
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.f112198w.mo120019a(this, f112174a[5], Boolean.valueOf(z));
    }

    public final RecyclerView getMScrollingChild() {
        return (RecyclerView) this.f112201z.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f112185j.getValue();
    }

    public final int getNestedScrollAxes() {
        return 0;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C7573i.m23587b(view, "target");
        return false;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C7573i.m23587b(view, "target");
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C7573i.m23587b(view, "child");
        C7573i.m23587b(view2, "target");
    }

    public final void dismiss() {
        m137547a(false, true);
    }

    private final boolean getMAnimating() {
        if (this.f112180d || this.f112181e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo105139a() {
        if (this.f112181e || (!this.f112180d && getTranslationY() < this.f112178b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo105140b() {
        this.f112197v = false;
        setMTouchScrollingChild(false);
        this.f112200y = false;
        this.f112196u = 0.0f;
    }

    public final void setShowStateChangedListener(C7562b<? super Boolean, C7581n> bVar) {
        this.f112184h = bVar;
    }

    public final void setVisibleChangedListener(C7562b<? super Boolean, C7581n> bVar) {
        this.f112183g = bVar;
    }

    /* renamed from: a */
    private final boolean m137548a(MotionEvent motionEvent) {
        View mPlaceholder = getMPlaceholder();
        C7573i.m23582a((Object) mPlaceholder, "mPlaceholder");
        return m137549a(mPlaceholder, motionEvent);
    }

    /* renamed from: b */
    private final boolean m137550b(MotionEvent motionEvent) {
        RecyclerView mScrollingChild = getMScrollingChild();
        C7573i.m23582a((Object) mScrollingChild, "mScrollingChild");
        return m137549a((View) mScrollingChild, motionEvent);
    }

    public final void onStopNestedScroll(View view) {
        boolean z;
        C7573i.m23587b(view, "child");
        if (getTranslationY() * 2.0f < this.f112178b) {
            z = true;
        } else {
            z = false;
        }
        m137547a(z, false);
    }

    public final void setMIsFocus(boolean z) {
        if (this.f112182f ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f112182f = z;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 0) {
            this.f112190o = getMAnimating();
        }
        if (this.f112190o && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.f112190o = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            mo105140b();
            this.f112191p = motionEvent.getX();
            this.f112193r = this.f112191p;
            this.f112192q = motionEvent.getY();
            this.f112194s = this.f112192q;
            this.f112195t = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            this.f112200y = m137548a(motionEvent);
            setMTouchScrollingChild(m137550b(motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            mo105140b();
        }
        if (motionEvent.getActionMasked() == 1) {
            mo105140b();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.f112200y) {
                    return false;
                }
                float y = this.f112194s - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.f112197v || Math.abs(y) > ((float) getMTouchSlop()))) {
                    this.f112197v = true;
                    return true;
                }
            }
        } else if (this.f112200y) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C7573i.m23587b(motionEvent, "event");
        switch (motionEvent.getActionMasked()) {
            case 1:
                VelocityTracker mVelocityTracker = getMVelocityTracker();
                mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
                boolean z2 = false;
                if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
                    if (this.f112196u < 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m137547a(z, false);
                    z2 = true;
                }
                if (!z2) {
                    onStopNestedScroll(this);
                }
                mo105140b();
                break;
            case 2:
                if (!getMTouchScrollingChild()) {
                    getMVelocityTracker().addMovement(motionEvent);
                    float x = this.f112191p - motionEvent.getX();
                    float y = this.f112192q - motionEvent.getY();
                    if (this.f112197v || Math.abs(y) > ((float) getMTouchSlop())) {
                        this.f112197v = true;
                        RecyclerView mScrollingChild = getMScrollingChild();
                        C7573i.m23582a((Object) mScrollingChild, "mScrollingChild");
                        onNestedPreScroll(mScrollingChild, (int) x, (int) y, new int[]{0, 0});
                    }
                    this.f112196u = motionEvent.getRawY() - this.f112195t;
                    this.f112195t = motionEvent.getRawY();
                    break;
                }
                break;
            case 3:
                onStopNestedScroll(this);
                mo105140b();
                break;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredHeight = (float) getMeasuredHeight();
        View mPlaceholder = getMPlaceholder();
        C7573i.m23582a((Object) mPlaceholder, "mPlaceholder");
        this.f112178b = measuredHeight - ((float) mPlaceholder.getMeasuredHeight());
    }

    /* renamed from: a */
    private final boolean m137549a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        Rect rect = (Rect) f112173C.acquire();
        if (rect == null) {
            rect = new Rect();
        }
        C43134fm.m136821a((ViewGroup) this, view, rect);
        try {
            boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            return contains;
        } finally {
            rect.setEmpty();
            f112173C.release(rect);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m137547a(boolean z, boolean z2) {
        float f;
        AnimatorListener animatorListener;
        if (!getMAnimating()) {
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = this.f112178b;
            }
            if (getTranslationY() == f) {
                if (!z || getVisibility() != 0) {
                    int i = 8;
                    if (z || getVisibility() != 8) {
                        if (z) {
                            i = 0;
                        }
                        setVisibility(i);
                        mo105140b();
                        if (z2) {
                            if (z) {
                                if (this.f112178b <= 0.0f) {
                                    f2 = C9738o.m28708b(C6399b.m19921a(), 500.0f);
                                } else {
                                    f2 = this.f112178b;
                                }
                            }
                            setTranslationY(f2);
                        }
                    }
                }
                return;
            }
            ViewPropertyAnimator interpolator = animate().translationY(f).setDuration(150).setInterpolator(new AccelerateDecelerateInterpolator());
            if (z) {
                animatorListener = this.f112176A;
            } else {
                animatorListener = this.f112177B;
            }
            interpolator.setListener(animatorListener).start();
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        C7573i.m23587b(view, "child");
        C7573i.m23587b(view2, "target");
        if (!(view2 instanceof C0979k) || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        int i;
        boolean z;
        C7573i.m23587b(view, "target");
        if (view instanceof C0988r) {
            i = ((C0988r) view).computeVerticalScrollOffset();
        } else {
            i = 0;
        }
        if (i != 0) {
            return false;
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        m137547a(z, false);
        return true;
    }

    public BottomSheetNestedLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f112185j = C7546e.m23569a(new C43337k(context));
        this.f112186k = C7546e.m23569a(new C43335i(this));
        this.f112187l = C7546e.m23569a(new C43330e(this));
        this.f112188m = C7546e.m23569a(new C43329d(this));
        this.f112189n = C7546e.m23569a(C43336j.f112213a);
        Boolean valueOf = Boolean.valueOf(false);
        this.f112198w = new C43326a(valueOf, valueOf, this);
        this.f112199x = C7546e.m23569a(new C43331f(this));
        this.f112201z = C7546e.m23569a(new C43333g(this));
        this.f112176A = new C43334h(this);
        this.f112177B = new C43328c(this);
        setMIsFocus(true);
        setOnKeyListener(new OnKeyListener(this) {

            /* renamed from: a */
            final /* synthetic */ BottomSheetNestedLayout f112202a;

            {
                this.f112202a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!this.f112202a.mo105139a() || i != 4) {
                    return false;
                }
                C7573i.m23582a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 1) {
                    this.f112202a.dismiss();
                }
                return true;
            }
        });
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        C7573i.m23587b(view, "target");
        C7573i.m23587b(iArr, "consumed");
        float translationY = getTranslationY();
        if (translationY > 0.0f) {
            float f = translationY - ((float) i2);
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > this.f112178b) {
                f = this.f112178b;
            }
            setTranslationY(f);
            if (getMTouchScrollingChild() && !this.f112179c) {
                iArr[1] = iArr[1] + i2;
            }
        } else if (translationY == 0.0f) {
            if (view instanceof C0988r) {
                i3 = ((C0988r) view).computeVerticalScrollOffset();
            } else {
                i3 = 0;
            }
            if (i2 < 0 && (i3 == 0 || !getMTouchScrollingChild())) {
                float f2 = translationY - ((float) i2);
                if (f2 > this.f112178b) {
                    f2 = this.f112178b;
                }
                setTranslationY(f2);
            }
        }
    }

    public /* synthetic */ BottomSheetNestedLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
