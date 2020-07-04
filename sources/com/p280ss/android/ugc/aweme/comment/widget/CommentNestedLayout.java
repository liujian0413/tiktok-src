package com.p280ss.android.ugc.aweme.comment.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.util.Pools.SynchronizedPool;
import android.support.p022v4.view.C0979k;
import android.support.p022v4.view.C0981m;
import android.support.p022v4.view.C0988r;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.experiment.ShrinkVideoWhenCommentShowExperiment;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.utils.C43134fm;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
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

/* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout */
public final class CommentNestedLayout extends LinearLayout implements C0981m {

    /* renamed from: K */
    private static final SynchronizedPool<Rect> f64281K = new SynchronizedPool<>(12);

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f64282a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mViewConfiguration", "getMViewConfiguration()Landroid/view/ViewConfiguration;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mTouchSlop", "getMTouchSlop()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mMinimumVelocity", "getMMinimumVelocity()F")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mMaximumVelocity", "getMMaximumVelocity()F")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mVelocityTracker", "getMVelocityTracker()Landroid/view/VelocityTracker;")), C7575l.m23599a((MutablePropertyReference1) new MutablePropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mTouchScrollingChild", "getMTouchScrollingChild()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mPlaceholder", "getMPlaceholder()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mCommentBgContainer", "getMCommentBgContainer()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mCommentContainer", "getMCommentContainer()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mCommentListContainer", "getMCommentListContainer()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentNestedLayout.class), "mScrollingChild", "getMScrollingChild()Lcom/ss/android/ugc/aweme/views/FpsRecyclerView;"))};

    /* renamed from: h */
    public static final C24359b f64283h = new C24359b(null);

    /* renamed from: A */
    private final C7541d f64284A;

    /* renamed from: B */
    private final C7541d f64285B;

    /* renamed from: C */
    private boolean f64286C;

    /* renamed from: D */
    private final C7541d f64287D;

    /* renamed from: E */
    private C7562b<? super Boolean, C7581n> f64288E;

    /* renamed from: F */
    private final C24369k f64289F;

    /* renamed from: G */
    private final C24363f f64290G;

    /* renamed from: H */
    private final boolean f64291H;

    /* renamed from: I */
    private int f64292I;

    /* renamed from: J */
    private int f64293J;

    /* renamed from: b */
    public float f64294b;

    /* renamed from: c */
    public boolean f64295c;

    /* renamed from: d */
    public boolean f64296d;

    /* renamed from: e */
    public boolean f64297e;

    /* renamed from: f */
    public boolean f64298f;

    /* renamed from: g */
    public C7562b<? super Boolean, C7581n> f64299g;

    /* renamed from: i */
    private final C7541d f64300i;

    /* renamed from: j */
    private final C7541d f64301j;

    /* renamed from: k */
    private final C7541d f64302k;

    /* renamed from: l */
    private final C7541d f64303l;

    /* renamed from: m */
    private final C7541d f64304m;

    /* renamed from: n */
    private boolean f64305n;

    /* renamed from: o */
    private float f64306o;

    /* renamed from: p */
    private float f64307p;

    /* renamed from: q */
    private float f64308q;

    /* renamed from: r */
    private float f64309r;

    /* renamed from: s */
    private float f64310s;

    /* renamed from: t */
    private float f64311t;

    /* renamed from: u */
    private boolean f64312u;

    /* renamed from: v */
    private ObjectAnimator f64313v;

    /* renamed from: w */
    private C28201af f64314w;

    /* renamed from: x */
    private final C47895b f64315x;

    /* renamed from: y */
    private final C7541d f64316y;

    /* renamed from: z */
    private final C7541d f64317z;

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$a */
    public static final class C24358a extends C47894a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f64319a;

        /* renamed from: b */
        final /* synthetic */ CommentNestedLayout f64320b;

        public C24358a(Object obj, Object obj2, CommentNestedLayout commentNestedLayout) {
            this.f64319a = obj;
            this.f64320b = commentNestedLayout;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo63286a(C7595j<?> jVar, Boolean bool, Boolean bool2) {
            boolean z;
            C7573i.m23587b(jVar, "property");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                CommentNestedLayout commentNestedLayout = this.f64320b;
                if (this.f64320b.getMScrollingChild().computeVerticalScrollExtent() >= this.f64320b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                commentNestedLayout.f64295c = z;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$b */
    public static final class C24359b {
        private C24359b() {
        }

        public /* synthetic */ C24359b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$c */
    static final class C24360c extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64321a;

        C24360c(CommentNestedLayout commentNestedLayout) {
            this.f64321a = commentNestedLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f64321a.findViewById(R.id.am1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$d */
    static final class C24361d extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64322a;

        C24361d(CommentNestedLayout commentNestedLayout) {
            this.f64322a = commentNestedLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f64322a.findViewById(R.id.am2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$e */
    static final class C24362e extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64323a;

        C24362e(CommentNestedLayout commentNestedLayout) {
            this.f64323a = commentNestedLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f64323a.findViewById(R.id.bt0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$f */
    public static final class C24363f implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64324a;

        public final void onAnimationRepeat(Animator animator) {
        }

        C24363f(CommentNestedLayout commentNestedLayout) {
            this.f64324a = commentNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f64324a.f64296d = false;
            this.f64324a.mo63267e();
            this.f64324a.setMIsFocus(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f64324a.f64296d = false;
            this.f64324a.setVisibility(8);
            this.f64324a.mo63267e();
            this.f64324a.setMIsFocus(false);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f64324a.f64297e || (!this.f64324a.f64296d && this.f64324a.getTranslationY() <= this.f64324a.f64294b)) {
                C7562b<? super Boolean, C7581n> bVar = this.f64324a.f64299g;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(false));
                }
            }
            this.f64324a.f64296d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$g */
    static final class C24364g extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64325a;

        C24364g(CommentNestedLayout commentNestedLayout) {
            this.f64325a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m80085a());
        }

        /* renamed from: a */
        private float m80085a() {
            ViewConfiguration mViewConfiguration = this.f64325a.getMViewConfiguration();
            C7573i.m23582a((Object) mViewConfiguration, "mViewConfiguration");
            return (float) mViewConfiguration.getScaledMaximumFlingVelocity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$h */
    static final class C24365h extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64326a;

        C24365h(CommentNestedLayout commentNestedLayout) {
            this.f64326a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m80086a());
        }

        /* renamed from: a */
        private float m80086a() {
            ViewConfiguration mViewConfiguration = this.f64326a.getMViewConfiguration();
            C7573i.m23582a((Object) mViewConfiguration, "mViewConfiguration");
            return (float) mViewConfiguration.getScaledMinimumFlingVelocity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$i */
    static final class C24366i extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64327a;

        /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$i$a */
        static final class C24367a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C24366i f64328a;

            C24367a(C24366i iVar) {
                this.f64328a = iVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f64328a.f64327a.mo63265d();
            }
        }

        C24366i(CommentNestedLayout commentNestedLayout) {
            this.f64327a = commentNestedLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            View findViewById = this.f64327a.findViewById(R.id.zj);
            findViewById.setOnClickListener(new C24367a(this));
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$j */
    static final class C24368j extends Lambda implements C7561a<FpsRecyclerView> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64329a;

        C24368j(CommentNestedLayout commentNestedLayout) {
            this.f64329a = commentNestedLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FpsRecyclerView invoke() {
            return (FpsRecyclerView) this.f64329a.findViewById(R.id.cqd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$k */
    public static final class C24369k implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64330a;

        public final void onAnimationRepeat(Animator animator) {
        }

        C24369k(CommentNestedLayout commentNestedLayout) {
            this.f64330a = commentNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f64330a.f64297e = false;
            this.f64330a.mo63267e();
            this.f64330a.setMIsFocus(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f64330a.f64297e = false;
            this.f64330a.mo63267e();
            this.f64330a.setMIsFocus(true);
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f64330a.mo63262a()) {
                C7562b<? super Boolean, C7581n> bVar = this.f64330a.f64299g;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(true));
                }
            }
            this.f64330a.setVisibility(0);
            this.f64330a.f64297e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$l */
    static final class C24370l extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f64331a;

        C24370l(CommentNestedLayout commentNestedLayout) {
            this.f64331a = commentNestedLayout;
            super(0);
        }

        /* renamed from: a */
        private int m80089a() {
            ViewConfiguration mViewConfiguration = this.f64331a.getMViewConfiguration();
            C7573i.m23582a((Object) mViewConfiguration, "mViewConfiguration");
            return mViewConfiguration.getScaledTouchSlop();
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m80089a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$m */
    static final class C24371m extends Lambda implements C7561a<VelocityTracker> {

        /* renamed from: a */
        public static final C24371m f64332a = new C24371m();

        C24371m() {
            super(0);
        }

        /* renamed from: a */
        private static VelocityTracker m80090a() {
            return VelocityTracker.obtain();
        }

        public final /* synthetic */ Object invoke() {
            return m80090a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$n */
    static final class C24372n extends Lambda implements C7561a<ViewConfiguration> {

        /* renamed from: a */
        final /* synthetic */ Context f64333a;

        C24372n(Context context) {
            this.f64333a = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewConfiguration invoke() {
            return ViewConfiguration.get(this.f64333a);
        }
    }

    public CommentNestedLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final View getMCommentBgContainer() {
        return (View) this.f64317z.getValue();
    }

    private final View getMCommentContainer() {
        return (View) this.f64284A.getValue();
    }

    private final View getMCommentListContainer() {
        return (View) this.f64285B.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f64303l.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f64302k.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.f64316y.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.f64315x.mo120018a(this, f64282a[5])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f64301j.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f64304m.getValue();
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.f64315x.mo120019a(this, f64282a[5], Boolean.valueOf(z));
    }

    public final boolean getHaveBangs() {
        return this.f64291H;
    }

    public final int getHeightOffset() {
        return this.f64293J;
    }

    public final C28201af getMOnShowHeightChangeListener() {
        return this.f64314w;
    }

    public final FpsRecyclerView getMScrollingChild() {
        return (FpsRecyclerView) this.f64287D.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f64300i.getValue();
    }

    public final int getNestedScrollAxes() {
        return 0;
    }

    public final int getNotchHeight() {
        return this.f64292I;
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

    /* renamed from: c */
    public final void mo63264c() {
        m80071a(true, true);
    }

    /* renamed from: d */
    public final void mo63265d() {
        m80071a(false, true);
    }

    private final boolean getMAnimating() {
        if (this.f64296d || this.f64297e) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo63267e() {
        this.f64312u = false;
        setMTouchScrollingChild(false);
        this.f64286C = false;
        this.f64311t = 0.0f;
    }

    /* renamed from: a */
    public final boolean mo63262a() {
        if (this.f64297e || (!this.f64296d && getTranslationY() < this.f64294b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo63263b() {
        if (this.f64314w == null || !this.f64297e) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C6384b.m19835a().mo15292a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", C6384b.m19835a().mo15295d().enable_comment_video_shrink, false)) {
            View mCommentBgContainer = getMCommentBgContainer();
            C7573i.m23582a((Object) mCommentBgContainer, "mCommentBgContainer");
            LayoutParams layoutParams = mCommentBgContainer.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                View mCommentListContainer = getMCommentListContainer();
                C7573i.m23582a((Object) mCommentListContainer, "mCommentListContainer");
                LayoutParams layoutParams2 = mCommentListContainer.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -1;
                    View mPlaceholder = getMPlaceholder();
                    C7573i.m23582a((Object) mPlaceholder, "mPlaceholder");
                    LayoutParams layoutParams3 = mPlaceholder.getLayoutParams();
                    if (layoutParams3 != null) {
                        ((LinearLayout.LayoutParams) layoutParams3).weight = 0.0f;
                        View mCommentContainer = getMCommentContainer();
                        C7573i.m23582a((Object) mCommentContainer, "mCommentContainer");
                        LayoutParams layoutParams4 = mCommentContainer.getLayoutParams();
                        if (layoutParams4 != null) {
                            ((LinearLayout.LayoutParams) layoutParams4).height = 0;
                            View mCommentContainer2 = getMCommentContainer();
                            C7573i.m23582a((Object) mCommentContainer2, "mCommentContainer");
                            LayoutParams layoutParams5 = mCommentContainer2.getLayoutParams();
                            if (layoutParams5 != null) {
                                ((LinearLayout.LayoutParams) layoutParams5).weight = 1.0f;
                                if (this.f64291H) {
                                    View mPlaceholder2 = getMPlaceholder();
                                    C7573i.m23582a((Object) mPlaceholder2, "mPlaceholder");
                                    mPlaceholder2.getLayoutParams().height = (int) (((float) this.f64292I) + (((float) C9738o.m28691a(C6399b.m19921a())) / 1.7777778f));
                                } else {
                                    float b = ((float) C9738o.m28709b(C6399b.m19921a())) - C9738o.m28708b(C6399b.m19921a(), 52.0f);
                                    View mPlaceholder3 = getMPlaceholder();
                                    C7573i.m23582a((Object) mPlaceholder3, "mPlaceholder");
                                    mPlaceholder3.getLayoutParams().height = ((int) (b / 4.0f)) + C21085a.m71131d();
                                }
                                View mPlaceholder4 = getMPlaceholder();
                                C7573i.m23582a((Object) mPlaceholder4, "mPlaceholder");
                                LayoutParams layoutParams6 = mPlaceholder4.getLayoutParams();
                                layoutParams6.height -= this.f64293J;
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void setHeightOffset(int i) {
        this.f64293J = i;
    }

    public final void setMOnShowHeightChangeListener(C28201af afVar) {
        this.f64314w = afVar;
    }

    public final void setNotchHeight(int i) {
        this.f64292I = i;
    }

    public final void setPreScrollChangeListener(C7562b<? super Boolean, C7581n> bVar) {
        this.f64288E = bVar;
    }

    public final void setVisibleChangedListener(C7562b<? super Boolean, C7581n> bVar) {
        this.f64299g = bVar;
    }

    /* renamed from: a */
    private final boolean m80072a(MotionEvent motionEvent) {
        View mPlaceholder = getMPlaceholder();
        C7573i.m23582a((Object) mPlaceholder, "mPlaceholder");
        return m80073a(mPlaceholder, motionEvent);
    }

    /* renamed from: b */
    private final boolean m80074b(MotionEvent motionEvent) {
        FpsRecyclerView mScrollingChild = getMScrollingChild();
        C7573i.m23582a((Object) mScrollingChild, "mScrollingChild");
        return m80073a((View) mScrollingChild, motionEvent);
    }

    public final void onStopNestedScroll(View view) {
        boolean z;
        C7573i.m23587b(view, "child");
        if (getTranslationY() * 2.0f < this.f64294b) {
            z = true;
        } else {
            z = false;
        }
        m80071a(z, false);
    }

    public final void setMIsFocus(boolean z) {
        if (this.f64298f ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f64298f = z;
        }
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        C28201af afVar = this.f64314w;
        if (afVar != null) {
            afVar.mo71764a(this.f64294b - f, this.f64294b);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 0) {
            this.f64305n = getMAnimating();
        }
        if (this.f64305n && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.f64305n = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo63261a(boolean z) {
        if (z && mo63262a()) {
            C7562b<? super Boolean, C7581n> bVar = this.f64299g;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(false));
            }
        }
        ObjectAnimator objectAnimator = this.f64313v;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f64313v;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        setVisibility(8);
        if (this.f64294b > 0.0f) {
            setTranslationY(this.f64294b);
        }
        mo63267e();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            mo63267e();
            this.f64306o = motionEvent.getX();
            this.f64308q = this.f64306o;
            this.f64307p = motionEvent.getY();
            this.f64309r = this.f64307p;
            this.f64310s = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            this.f64286C = m80072a(motionEvent);
            setMTouchScrollingChild(m80074b(motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            mo63267e();
        }
        if (motionEvent.getActionMasked() == 1) {
            mo63267e();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.f64286C) {
                    return false;
                }
                float y = this.f64309r - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.f64312u || Math.abs(y) > ((float) getMTouchSlop()))) {
                    this.f64312u = true;
                    return true;
                }
            }
        } else if (this.f64286C) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C7573i.m23587b(motionEvent, "event");
        if (getMAnimating()) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 1:
                VelocityTracker mVelocityTracker = getMVelocityTracker();
                mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
                boolean z2 = false;
                if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
                    if (this.f64311t < 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m80071a(z, false);
                    z2 = true;
                }
                if (!z2) {
                    onStopNestedScroll(this);
                }
                mo63267e();
                break;
            case 2:
                if (!getMTouchScrollingChild()) {
                    getMVelocityTracker().addMovement(motionEvent);
                    float x = this.f64306o - motionEvent.getX();
                    float y = this.f64307p - motionEvent.getY();
                    if (this.f64312u || Math.abs(y) > ((float) getMTouchSlop())) {
                        this.f64312u = true;
                        FpsRecyclerView mScrollingChild = getMScrollingChild();
                        C7573i.m23582a((Object) mScrollingChild, "mScrollingChild");
                        onNestedPreScroll(mScrollingChild, (int) x, (int) y, new int[]{0, 0});
                        C7562b<? super Boolean, C7581n> bVar = this.f64288E;
                        if (bVar != null) {
                            bVar.invoke(Boolean.valueOf(true));
                        }
                    }
                    this.f64311t = motionEvent.getRawY() - this.f64310s;
                    this.f64310s = motionEvent.getRawY();
                    break;
                }
                break;
            case 3:
                onStopNestedScroll(this);
                mo63267e();
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
        this.f64294b = measuredHeight - ((float) mPlaceholder.getMeasuredHeight());
    }

    /* renamed from: a */
    private final boolean m80073a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        Rect rect = (Rect) f64281K.acquire();
        if (rect == null) {
            rect = new Rect();
        }
        C43134fm.m136821a((ViewGroup) this, view, rect);
        try {
            boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            return contains;
        } finally {
            rect.setEmpty();
            f64281K.release(rect);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m80071a(boolean z, boolean z2) {
        float f;
        long j;
        AnimatorListener animatorListener;
        if (!getMAnimating()) {
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = this.f64294b;
            }
            if (getTranslationY() == f) {
                if (!z || getVisibility() != 0) {
                    int i = 8;
                    if (z || getVisibility() != 8) {
                        if (z) {
                            i = 0;
                        }
                        setVisibility(i);
                        mo63267e();
                        if (z2) {
                            if (z) {
                                if (this.f64294b <= 0.0f) {
                                    f2 = (float) C23486n.m77122a(500.0d);
                                } else {
                                    f2 = this.f64294b;
                                }
                            }
                            setTranslationY(f2);
                        }
                    }
                }
                return;
            }
            if (C6384b.m19835a().mo15292a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", C6384b.m19835a().mo15295d().enable_comment_video_shrink, false)) {
                j = 300;
            } else {
                j = 150;
            }
            ObjectAnimator objectAnimator = this.f64313v;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.f64313v;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
            }
            this.f64313v = ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{getTranslationY(), f});
            ObjectAnimator objectAnimator3 = this.f64313v;
            if (objectAnimator3 == null) {
                C7573i.m23580a();
            }
            objectAnimator3.setDuration(j);
            ObjectAnimator objectAnimator4 = this.f64313v;
            if (objectAnimator4 == null) {
                C7573i.m23580a();
            }
            objectAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator objectAnimator5 = this.f64313v;
            if (objectAnimator5 == null) {
                C7573i.m23580a();
            }
            if (z) {
                animatorListener = this.f64289F;
            } else {
                animatorListener = this.f64290G;
            }
            objectAnimator5.addListener(animatorListener);
            ObjectAnimator objectAnimator6 = this.f64313v;
            if (objectAnimator6 == null) {
                C7573i.m23580a();
            }
            objectAnimator6.start();
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
        m80071a(z, false);
        return true;
    }

    public CommentNestedLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f64300i = C7546e.m23569a(new C24372n(context));
        this.f64301j = C7546e.m23569a(new C24370l(this));
        this.f64302k = C7546e.m23569a(new C24365h(this));
        this.f64303l = C7546e.m23569a(new C24364g(this));
        this.f64304m = C7546e.m23569a(C24371m.f64332a);
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(false);
        this.f64315x = new C24358a(valueOf, valueOf, this);
        this.f64316y = C7546e.m23569a(new C24366i(this));
        this.f64317z = C7546e.m23569a(new C24360c(this));
        this.f64284A = C7546e.m23569a(new C24361d(this));
        this.f64285B = C7546e.m23569a(new C24362e(this));
        this.f64287D = C7546e.m23569a(new C24368j(this));
        this.f64289F = new C24369k(this);
        this.f64290G = new C24363f(this);
        setMIsFocus(true);
        setOnKeyListener(new OnKeyListener(this) {

            /* renamed from: a */
            final /* synthetic */ CommentNestedLayout f64318a;

            {
                this.f64318a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!this.f64318a.mo63262a() || i != 4) {
                    return false;
                }
                C7573i.m23582a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 1) {
                    this.f64318a.mo63265d();
                }
                return true;
            }
        });
        if (C22911a.m75401a(getContext()) && C21085a.m71131d() == 0) {
            z = true;
        }
        this.f64291H = z;
        this.f64292I = C21085a.m71116a(context);
        this.f64293J = C23486n.m77122a(8.0d);
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
            if (f > this.f64294b) {
                f = this.f64294b;
            }
            setTranslationY(f);
            if (getMTouchScrollingChild() && !this.f64295c) {
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
                if (f2 > this.f64294b) {
                    f2 = this.f64294b;
                }
                setTranslationY(f2);
            }
        }
    }

    public /* synthetic */ CommentNestedLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
