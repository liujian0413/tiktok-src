package com.p280ss.android.ugc.aweme.commercialize.loft.half;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0981m;
import android.support.p022v4.view.C0982n;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftMaskViewParent */
public final class LoftMaskViewParent extends ViewGroup implements C0981m {

    /* renamed from: a */
    public RecyclerView f65553a;

    /* renamed from: b */
    public boolean f65554b;

    /* renamed from: c */
    public View f65555c;

    /* renamed from: d */
    public boolean f65556d;

    /* renamed from: e */
    public boolean f65557e;

    /* renamed from: f */
    private final C0982n f65558f;

    /* renamed from: g */
    private int f65559g;

    /* renamed from: h */
    private boolean f65560h;

    /* renamed from: i */
    private int f65561i;

    /* renamed from: j */
    private int f65562j;

    /* renamed from: k */
    private ValueAnimator f65563k;

    /* renamed from: l */
    private boolean f65564l;

    /* renamed from: m */
    private C0052o<Float> f65565m;

    /* renamed from: n */
    private C7561a<C7581n> f65566n;

    /* renamed from: o */
    private boolean f65567o;

    /* renamed from: p */
    private boolean f65568p;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftMaskViewParent$a */
    static final class C24864a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f65569a;

        /* renamed from: b */
        final /* synthetic */ LoftMaskViewParent f65570b;

        C24864a(ValueAnimator valueAnimator, LoftMaskViewParent loftMaskViewParent) {
            this.f65569a = valueAnimator;
            this.f65570b = loftMaskViewParent;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftMaskViewParent loftMaskViewParent = this.f65570b;
            Object animatedValue = this.f65569a.getAnimatedValue();
            if (animatedValue != null) {
                loftMaskViewParent.mo64999a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftMaskViewParent$b */
    public static final class C24865b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftMaskViewParent f65571a;

        C24865b(LoftMaskViewParent loftMaskViewParent) {
            this.f65571a = loftMaskViewParent;
        }

        public final void onAnimationStart(Animator animator) {
            this.f65571a.f65556d = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f65571a.f65556d = false;
            this.f65571a.f65554b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftMaskViewParent$c */
    static final class C24866c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f65572a;

        /* renamed from: b */
        final /* synthetic */ LoftMaskViewParent f65573b;

        C24866c(ValueAnimator valueAnimator, LoftMaskViewParent loftMaskViewParent) {
            this.f65572a = valueAnimator;
            this.f65573b = loftMaskViewParent;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftMaskViewParent loftMaskViewParent = this.f65573b;
            Object animatedValue = this.f65572a.getAnimatedValue();
            if (animatedValue != null) {
                loftMaskViewParent.mo64999a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftMaskViewParent$d */
    public static final class C24867d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftMaskViewParent f65574a;

        C24867d(LoftMaskViewParent loftMaskViewParent) {
            this.f65574a = loftMaskViewParent;
        }

        public final void onAnimationStart(Animator animator) {
            this.f65574a.f65557e = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f65574a.f65557e = false;
            RecyclerView recyclerView = this.f65574a.f65553a;
            if (recyclerView != null) {
                C1273i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.mo5437e(0);
                }
            }
            ViewParent parent = this.f65574a.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ViewParent parent2 = this.f65574a.getParent();
                if (parent2 != null) {
                    viewGroup.setTranslationY((float) ((ViewGroup) parent2).getMeasuredHeight());
                    C7561a dismissListener = this.f65574a.getDismissListener();
                    if (dismissListener != null) {
                        dismissListener.invoke();
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftMaskViewParent$e */
    static final class C24868e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f65575a;

        /* renamed from: b */
        final /* synthetic */ LoftMaskViewParent f65576b;

        C24868e(ValueAnimator valueAnimator, LoftMaskViewParent loftMaskViewParent) {
            this.f65575a = valueAnimator;
            this.f65576b = loftMaskViewParent;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftMaskViewParent loftMaskViewParent = this.f65576b;
            Object animatedValue = this.f65575a.getAnimatedValue();
            if (animatedValue != null) {
                loftMaskViewParent.mo64999a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftMaskViewParent$f */
    public static final class C24869f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftMaskViewParent f65577a;

        C24869f(LoftMaskViewParent loftMaskViewParent) {
            this.f65577a = loftMaskViewParent;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f65577a.f65556d = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f65577a.f65556d = true;
        }
    }

    public LoftMaskViewParent(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoftMaskViewParent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C7561a<C7581n> getDismissListener() {
        return this.f65566n;
    }

    public final boolean getExpand() {
        return this.f65567o;
    }

    public final C0052o<Float> getTotalMoveRate() {
        return this.f65565m;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C7573i.m23587b(view, "target");
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        C7573i.m23587b(view, "target");
        return true;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        C7573i.m23587b(view, "child");
        C7573i.m23587b(view2, "target");
        return (i & 2) != 0;
    }

    public final View getBottomMask() {
        View view = this.f65555c;
        if (view == null) {
            C7573i.m23583a("bottomMask");
        }
        return view;
    }

    public final int getNestedScrollAxes() {
        if (VERSION.SDK_INT >= 21) {
            return super.getNestedScrollAxes();
        }
        return this.f65558f.f3402a;
    }

    public final void setDismissListener(C7561a<C7581n> aVar) {
        this.f65566n = aVar;
    }

    public final void setBottomMask(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f65555c = view;
    }

    public final void setTotalMoveRate(C0052o<Float> oVar) {
        C7573i.m23587b(oVar, "<set-?>");
        this.f65565m = oVar;
    }

    /* renamed from: b */
    private final boolean m81608b(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() != 1 || !(this.f65553a instanceof RecyclerView)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo65001a(boolean z) {
        this.f65554b = false;
        setTranslationY(0.0f);
        View view = this.f65555c;
        if (view == null) {
            C7573i.m23583a("bottomMask");
        }
        view.setTranslationY(0.0f);
        this.f65564l = z;
        if (z) {
            setExpand(true);
        } else {
            setExpandHalf(true);
        }
    }

    /* renamed from: a */
    private static RecyclerView m81607a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount >= 0) {
            int i = 0;
            while (!(viewGroup.getChildAt(i) instanceof RecyclerView)) {
                if (i != childCount) {
                    i++;
                }
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return (RecyclerView) childAt;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
        }
        return null;
    }

    private final void setExpandHalf(boolean z) {
        float f;
        this.f65568p = z;
        ValueAnimator valueAnimator = this.f65563k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            ViewParent parent = getParent();
            if (parent != null) {
                if (((ViewGroup) parent).getMeasuredHeight() - this.f65561i > getMeasuredHeight()) {
                    f = (float) getMeasuredHeight();
                } else {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        f = (float) (((ViewGroup) parent2).getMeasuredHeight() - this.f65561i);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{getTranslationY(), -f});
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new C24868e(ofFloat, this));
                ofFloat.addListener(new C24869f(this));
                ofFloat.start();
                this.f65563k = ofFloat;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        setExpand(false);
    }

    /* renamed from: a */
    public final void mo64999a(float f) {
        setTranslationY(f);
        float abs = Math.abs(f);
        View view = this.f65555c;
        if (view == null) {
            C7573i.m23583a("bottomMask");
        }
        if (abs < ((float) view.getMeasuredHeight())) {
            View view2 = this.f65555c;
            if (view2 == null) {
                C7573i.m23583a("bottomMask");
            }
            view2.setTranslationY(f);
        }
        C0052o<Float> oVar = this.f65565m;
        float abs2 = Math.abs(getTranslationY());
        View view3 = this.f65555c;
        if (view3 == null) {
            C7573i.m23583a("bottomMask");
        }
        float abs3 = abs2 - Math.abs(view3.getTranslationY());
        ViewParent parent = getParent();
        if (parent != null) {
            int measuredHeight = ((ViewGroup) parent).getMeasuredHeight();
            View view4 = this.f65555c;
            if (view4 == null) {
                C7573i.m23583a("bottomMask");
            }
            oVar.setValue(Float.valueOf(abs3 / ((float) ((measuredHeight - (view4.getMeasuredHeight() - this.f65559g)) - this.f65562j))));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onStopNestedScroll(View view) {
        int i;
        C7573i.m23587b(view, "child");
        this.f65558f.mo3774a(view);
        if (this.f65560h) {
            this.f65560h = false;
            if (this.f65554b) {
                i = this.f65561i - this.f65559g;
            } else {
                i = this.f65561i;
            }
            if (getY() < ((float) i)) {
                setExpand(true);
                return;
            }
            ViewParent parent = getParent();
            if (parent == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            } else if (((ViewGroup) parent).getMeasuredHeight() - getMeasuredHeight() < this.f65561i) {
                setExpand(false);
            } else if (((float) getMeasuredHeight()) - Math.abs(getTranslationY()) > ((float) (this.f65561i - this.f65559g))) {
                setExpand(false);
            } else {
                setExpandHalf(true);
            }
        }
    }

    public final void setExpand(boolean z) {
        this.f65567o = z;
        ValueAnimator valueAnimator = this.f65563k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{getTranslationY(), -((float) getMeasuredHeight())});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new C24864a(ofFloat, this));
            ofFloat.addListener(new C24865b(this));
            ofFloat.start();
            this.f65563k = ofFloat;
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{getTranslationY(), 0.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new C24866c(ofFloat2, this));
        ofFloat2.addListener(new C24867d(this));
        ofFloat2.start();
        this.f65563k = ofFloat2;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f65553a == null) {
            this.f65553a = m81607a((ViewGroup) this);
        }
        if (!m81608b(this)) {
            measureChildren(i, i2);
            return;
        }
        throw new RuntimeException("Can not have more than one view.");
    }

    /* renamed from: a */
    public final void mo65000a(View view, int i) {
        C7573i.m23587b(view, "topView");
        ViewParent parent = getParent();
        if (parent != null) {
            if (i > ((ViewGroup) parent).getMeasuredHeight() - this.f65561i) {
                LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    C7573i.m23580a();
                }
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    layoutParams.height = (((ViewGroup) parent2).getMeasuredHeight() - view.getMeasuredHeight()) + this.f65559g;
                    setLayoutParams(layoutParams);
                    View view2 = this.f65555c;
                    if (view2 == null) {
                        C7573i.m23583a("bottomMask");
                    }
                    View view3 = this.f65555c;
                    if (view3 == null) {
                        C7573i.m23583a("bottomMask");
                    }
                    LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 == null) {
                        C7573i.m23580a();
                    }
                    ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        layoutParams2.height = (((ViewGroup) parent3).getMeasuredHeight() - this.f65561i) + this.f65559g;
                        view2.setLayoutParams(layoutParams2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            } else {
                LayoutParams layoutParams3 = getLayoutParams();
                if (layoutParams3 == null) {
                    C7573i.m23580a();
                }
                layoutParams3.height = this.f65559g + i;
                setLayoutParams(layoutParams3);
                View view4 = this.f65555c;
                if (view4 == null) {
                    C7573i.m23583a("bottomMask");
                }
                View view5 = this.f65555c;
                if (view5 == null) {
                    C7573i.m23583a("bottomMask");
                }
                LayoutParams layoutParams4 = view5.getLayoutParams();
                if (layoutParams4 == null) {
                    C7573i.m23580a();
                }
                layoutParams4.height = i + this.f65559g;
                view4.setLayoutParams(layoutParams4);
            }
            this.f65562j = view.getMeasuredHeight();
            if (getVisibility() == 0) {
                if (this.f65564l) {
                    setExpand(true);
                    return;
                }
                setExpandHalf(true);
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C7573i.m23587b(view, "child");
        C7573i.m23587b(view2, "target");
        if (VERSION.SDK_INT >= 21) {
            super.onNestedScrollAccepted(view, view2, i);
        } else {
            this.f65558f.mo3776a(view, view2, i);
        }
    }

    public LoftMaskViewParent(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f65558f = new C0982n(this);
        this.f65559g = C23486n.m77122a(114.0d);
        this.f65561i = C23486n.m77122a(103.0d) + this.f65559g;
        C0052o<Float> oVar = new C0052o<>();
        oVar.setValue(Float.valueOf(0.0f));
        this.f65565m = oVar;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C7573i.m23587b(view, "target");
        C7573i.m23587b(iArr, "consumed");
        this.f65560h = true;
        if (i2 > 0 && !this.f65556d && !this.f65557e) {
            float f = (float) i2;
            if (getTranslationY() - f > ((float) (-getMeasuredHeight()))) {
                mo64999a(getTranslationY() - f);
                iArr[1] = i2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RecyclerView recyclerView = this.f65553a;
        if (recyclerView != null) {
            int measuredWidth = getMeasuredWidth();
            RecyclerView recyclerView2 = this.f65553a;
            if (recyclerView2 == null) {
                C7573i.m23580a();
            }
            recyclerView.layout(0, 0, measuredWidth, recyclerView2.getMeasuredHeight());
        }
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C7573i.m23587b(view, "target");
        this.f65560h = true;
        if (i4 < 0 && !this.f65556d && !this.f65557e) {
            mo64999a(getTranslationY() - ((float) i4));
        }
    }

    public /* synthetic */ LoftMaskViewParent(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
