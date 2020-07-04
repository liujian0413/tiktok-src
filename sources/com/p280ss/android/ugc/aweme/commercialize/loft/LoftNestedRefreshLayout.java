package com.p280ss.android.ugc.aweme.commercialize.loft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0981m;
import android.support.p022v4.view.C0982n;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b.C24878a;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24857a;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24858b;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24860d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout */
public final class LoftNestedRefreshLayout extends ViewGroup implements C0981m {

    /* renamed from: a */
    public ViewGroup f65399a;

    /* renamed from: b */
    public boolean f65400b;

    /* renamed from: c */
    public boolean f65401c;

    /* renamed from: d */
    public boolean f65402d;

    /* renamed from: e */
    public ArrayList<C24858b> f65403e;

    /* renamed from: f */
    private final C0982n f65404f;

    /* renamed from: g */
    private View f65405g;

    /* renamed from: h */
    private View f65406h;

    /* renamed from: i */
    private boolean f65407i;

    /* renamed from: j */
    private C0052o<Float> f65408j;

    /* renamed from: k */
    private boolean f65409k;

    /* renamed from: l */
    private ValueAnimator f65410l;

    /* renamed from: m */
    private boolean f65411m;

    /* renamed from: n */
    private float f65412n;

    /* renamed from: o */
    private float f65413o;

    /* renamed from: p */
    private boolean f65414p;

    /* renamed from: q */
    private C24857a f65415q;

    /* renamed from: r */
    private C24860d f65416r;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$a */
    static final class C24825a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f65417a;

        C24825a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f65417a = loftNestedRefreshLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f65417a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.mo64893a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$b */
    public static final class C24826b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f65418a;

        C24826b(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f65418a = loftNestedRefreshLayout;
        }

        public final void onAnimationStart(Animator animator) {
            this.f65418a.setReturningToStart(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f65418a.setReturningToStart(false);
            if (this.f65418a.f65401c) {
                this.f65418a.f65401c = false;
                if (this.f65418a.getIRefresh() == null) {
                }
            } else {
                for (C24858b d : this.f65418a.f65403e) {
                    d.mo64994d();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$c */
    static final class C24827c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f65419a;

        C24827c(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f65419a = loftNestedRefreshLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f65419a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.mo64893a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$d */
    public static final class C24828d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f65420a;

        C24828d(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f65420a = loftNestedRefreshLayout;
        }

        public final void onAnimationStart(Animator animator) {
            this.f65420a.f65400b = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f65420a.f65400b = false;
            for (C24858b b : this.f65420a.f65403e) {
                b.mo64992b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$e */
    public static final class C24829e implements C24857a {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f65421a;

        C24829e(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f65421a = loftNestedRefreshLayout;
        }

        /* renamed from: a */
        public final float mo64920a(float f) {
            Object value = this.f65421a.getTotalConsume().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            return ((float) Math.pow(0.9950248756218907d, (double) ((Number) value).floatValue())) * f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$f */
    static final class C24830f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f65422a;

        /* renamed from: b */
        final /* synthetic */ boolean f65423b;

        C24830f(LoftNestedRefreshLayout loftNestedRefreshLayout, boolean z) {
            this.f65422a = loftNestedRefreshLayout;
            this.f65423b = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f65422a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.mo64893a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$g */
    public static final class C24831g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f65424a;

        /* renamed from: b */
        final /* synthetic */ boolean f65425b;

        public final void onAnimationStart(Animator animator) {
            C24860d iRefresh = this.f65424a.getIRefresh();
            if (iRefresh != null) {
                iRefresh.mo64996e();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f65424a.f65402d) {
                this.f65424a.f65402d = this.f65425b;
                C24860d iRefresh = this.f65424a.getIRefresh();
                if (iRefresh != null) {
                    iRefresh.mo64997f();
                }
            }
        }

        C24831g(LoftNestedRefreshLayout loftNestedRefreshLayout, boolean z) {
            this.f65424a = loftNestedRefreshLayout;
            this.f65425b = z;
        }
    }

    public LoftNestedRefreshLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoftNestedRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getEnableExpand() {
        return this.f65411m;
    }

    public final boolean getExpand() {
        return this.f65414p;
    }

    public final C24857a getIDamping() {
        return this.f65415q;
    }

    public final C24860d getIRefresh() {
        return this.f65416r;
    }

    public final boolean getReturningToStart() {
        return this.f65407i;
    }

    public final C0052o<Float> getTotalConsume() {
        return this.f65408j;
    }

    public final ViewGroup getHeaderView() {
        ViewGroup viewGroup = this.f65399a;
        if (viewGroup == null) {
            C7573i.m23583a("headerView");
        }
        return viewGroup;
    }

    public final int getNestedScrollAxes() {
        if (VERSION.SDK_INT >= 21) {
            return super.getNestedScrollAxes();
        }
        return this.f65404f.f3402a;
    }

    /* renamed from: a */
    private final void m81473a() {
        if (this.f65406h == null) {
            int i = 0;
            int childCount = getChildCount();
            while (i < childCount) {
                View childAt = getChildAt(i);
                ViewGroup viewGroup = this.f65399a;
                if (viewGroup == null) {
                    C7573i.m23583a("headerView");
                }
                if (!(!C7573i.m23585a((Object) childAt, (Object) viewGroup)) || !(!C7573i.m23585a((Object) childAt, (Object) this.f65405g))) {
                    i++;
                } else {
                    this.f65406h = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m81475b() {
        if (this.f65405g == null) {
            int i = 0;
            int childCount = getChildCount();
            while (i < childCount) {
                View childAt = getChildAt(i);
                ViewGroup viewGroup = this.f65399a;
                if (viewGroup == null) {
                    C7573i.m23583a("headerView");
                }
                if (!(!C7573i.m23585a((Object) childAt, (Object) viewGroup)) || !(!C7573i.m23585a((Object) childAt, (Object) this.f65406h))) {
                    i++;
                } else {
                    this.f65405g = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private final void m81476c() {
        this.f65399a = new LinearLayout(getContext());
        ViewGroup viewGroup = this.f65399a;
        if (viewGroup == null) {
            C7573i.m23583a("headerView");
        }
        viewGroup.setBackgroundResource(R.color.a3z);
        ViewGroup viewGroup2 = this.f65399a;
        if (viewGroup2 == null) {
            C7573i.m23583a("headerView");
        }
        viewGroup2.setLayoutParams(new LayoutParams(-1, -1));
        ViewGroup viewGroup3 = this.f65399a;
        if (viewGroup3 == null) {
            C7573i.m23583a("headerView");
        }
        addView(viewGroup3, 0);
    }

    /* renamed from: d */
    private final boolean m81477d() {
        if (getChildCount() > 3 || getChildCount() != 3) {
            return false;
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ViewGroup viewGroup = this.f65399a;
            if (viewGroup == null) {
                C7573i.m23583a("headerView");
            }
            if (C7573i.m23585a((Object) childAt, (Object) viewGroup) || C7573i.m23585a((Object) getChildAt(i2), (Object) this.f65406h) || C7573i.m23585a((Object) getChildAt(i2), (Object) this.f65405g)) {
                i++;
            }
        }
        if (i == 3) {
            return true;
        }
        return false;
    }

    public final void setEnableExpand(boolean z) {
        this.f65411m = z;
    }

    public final void setIRefresh(C24860d dVar) {
        this.f65416r = dVar;
    }

    public final void setReturningToStart(boolean z) {
        this.f65407i = z;
    }

    public final void setHeaderView(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "<set-?>");
        this.f65399a = viewGroup;
    }

    public final void setIDamping(C24857a aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f65415q = aVar;
    }

    public final void setTotalConsume(C0052o<Float> oVar) {
        C7573i.m23587b(oVar, "<set-?>");
        this.f65408j = oVar;
    }

    /* renamed from: a */
    public final void mo64894a(C24858b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f65403e.add(bVar);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        C24878a aVar = C24877b.f65602l;
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        ((C24877b) aVar.mo65136a(context)).f65606d = z;
    }

    public final void setHeader(View view) {
        C7573i.m23587b(view, "view");
        ViewGroup viewGroup = this.f65399a;
        if (viewGroup == null) {
            C7573i.m23583a("headerView");
        }
        viewGroup.removeAllViews();
        ViewGroup viewGroup2 = this.f65399a;
        if (viewGroup2 == null) {
            C7573i.m23583a("headerView");
        }
        viewGroup2.addView(view);
    }

    public final void onStopNestedScroll(View view) {
        C7573i.m23587b(view, "child");
        this.f65404f.mo3774a(view);
        if (this.f65409k) {
            this.f65409k = false;
            if (!C7573i.m23584a((Float) this.f65408j.getValue(), 0.0f)) {
                m81474a(this.f65411m);
            }
        }
    }

    /* renamed from: a */
    private final void m81474a(boolean z) {
        if (!this.f65402d) {
            Object value = this.f65408j.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (((Number) value).floatValue() < this.f65412n) {
                Object value2 = this.f65408j.getValue();
                if (value2 == null) {
                    C7573i.m23580a();
                }
                if (((Number) value2).floatValue() >= this.f65413o) {
                    Object value3 = this.f65408j.getValue();
                    if (value3 == null) {
                        C7573i.m23580a();
                    }
                    if (((Number) value3).floatValue() < this.f65412n) {
                        setRefreshing(true);
                        return;
                    }
                }
                setExpand(false);
            } else if (z) {
                setExpand(true);
            } else {
                setRefreshing(true);
            }
        }
    }

    public final void setRefreshing(boolean z) {
        if (z) {
            ValueAnimator valueAnimator = this.f65410l;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f65410l;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            }
            float[] fArr = new float[2];
            Object value = this.f65408j.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a(value, "totalConsume.value!!");
            fArr[0] = ((Number) value).floatValue();
            fArr[1] = this.f65413o;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration(50);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new C24830f(this, z));
            ofFloat.addListener(new C24831g(this, z));
            ofFloat.start();
            this.f65410l = ofFloat;
            return;
        }
        if (this.f65402d) {
            this.f65402d = z;
            this.f65401c = true;
            setExpand(false);
        }
    }

    /* renamed from: a */
    public final void mo64893a(float f) {
        if (f >= 0.0f) {
            ViewGroup viewGroup = this.f65399a;
            if (viewGroup == null) {
                C7573i.m23583a("headerView");
            }
            viewGroup.setTranslationY(f);
            View view = this.f65406h;
            if (view != null) {
                view.setTranslationY(f);
            }
            this.f65408j.setValue(Float.valueOf(f));
        }
    }

    public final void setExpand(boolean z) {
        this.f65414p = z;
        ValueAnimator valueAnimator = this.f65410l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f65410l;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        if (!z) {
            for (C24858b c : this.f65403e) {
                c.mo64993c();
            }
            float[] fArr = new float[2];
            Object value = this.f65408j.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a(value, "totalConsume.value!!");
            fArr[0] = ((Number) value).floatValue();
            fArr[1] = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new C24825a(this));
            ofFloat.addListener(new C24826b(this));
            ofFloat.start();
            this.f65410l = ofFloat;
            return;
        }
        if (z) {
            for (C24858b a : this.f65403e) {
                a.mo64991a();
            }
            float[] fArr2 = new float[2];
            Object value2 = this.f65408j.getValue();
            if (value2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a(value2, "totalConsume.value!!");
            fArr2[0] = ((Number) value2).floatValue();
            int measuredHeight = getMeasuredHeight();
            View view = this.f65405g;
            if (view == null) {
                C7573i.m23580a();
            }
            fArr2[1] = (float) (measuredHeight - view.getMeasuredHeight());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.addUpdateListener(new C24827c(this));
            ofFloat2.addListener(new C24828d(this));
            ofFloat2.start();
            this.f65410l = ofFloat2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f65405g == null) {
            m81475b();
        }
        if (this.f65406h == null) {
            m81473a();
        }
        if (m81477d()) {
            ViewGroup viewGroup = this.f65399a;
            if (viewGroup == null) {
                C7573i.m23583a("headerView");
            }
            measureChild(viewGroup, i, i2);
            measureChild(this.f65405g, i, i2);
            int size = MeasureSpec.getSize(i2);
            View view = this.f65405g;
            if (view == null) {
                C7573i.m23580a();
            }
            measureChild(this.f65406h, i, MeasureSpec.makeMeasureSpec(size - view.getMeasuredHeight(), MeasureSpec.getMode(i2)));
            return;
        }
        throw new AndroidRuntimeException("Only can have one child view");
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        C7573i.m23587b(view, "target");
        Float f3 = (Float) this.f65408j.getValue();
        if (f3 == null) {
            f3 = Float.valueOf(0.0f);
        }
        if (f3.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C7573i.m23587b(view, "child");
        C7573i.m23587b(view2, "target");
        if (VERSION.SDK_INT >= 21) {
            super.onNestedScrollAccepted(view, view2, i);
        } else {
            this.f65404f.mo3776a(view, view2, i);
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        C7573i.m23587b(view, "child");
        C7573i.m23587b(view2, "target");
        if (!isEnabled() || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public LoftNestedRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f65404f = new C0982n(this);
        m81476c();
        setEnabled(false);
        this.f65403e = new ArrayList<>();
        C0052o<Float> oVar = new C0052o<>();
        oVar.setValue(Float.valueOf(0.0f));
        this.f65408j = oVar;
        this.f65412n = (float) C23486n.m77122a(120.0d);
        this.f65413o = (float) C23486n.m77122a(60.0d);
        this.f65415q = new C24829e(this);
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C7573i.m23587b(view, "target");
        Float f3 = (Float) this.f65408j.getValue();
        if (f3 == null) {
            f3 = Float.valueOf(0.0f);
        }
        if (f3.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C7573i.m23587b(view, "target");
        C7573i.m23587b(iArr, "consumed");
        this.f65409k = true;
        if (i2 > 0) {
            Object value = this.f65408j.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (Float.compare(((Number) value).floatValue(), 0.0f) > 0) {
                Object value2 = this.f65408j.getValue();
                if (value2 == null) {
                    C7573i.m23580a();
                }
                float floatValue = ((Number) value2).floatValue() - this.f65415q.mo64920a((float) Math.abs(i2));
                iArr[1] = i2;
                mo64893a(floatValue);
            }
        }
    }

    public /* synthetic */ LoftNestedRefreshLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C7573i.m23587b(view, "target");
        this.f65409k = true;
        if (i4 < 0) {
            Object value = this.f65408j.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            float floatValue = ((Number) value).floatValue() + this.f65415q.mo64920a((float) Math.abs(i4));
            if ((this.f65402d && floatValue <= this.f65413o) || !this.f65402d) {
                mo64893a(floatValue);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = this.f65399a;
        if (viewGroup == null) {
            C7573i.m23583a("headerView");
        }
        int paddingLeft = getPaddingLeft();
        View view = this.f65405g;
        if (view == null) {
            C7573i.m23580a();
        }
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup viewGroup2 = this.f65399a;
        if (viewGroup2 == null) {
            C7573i.m23583a("headerView");
        }
        int measuredHeight2 = measuredHeight - viewGroup2.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft();
        ViewGroup viewGroup3 = this.f65399a;
        if (viewGroup3 == null) {
            C7573i.m23583a("headerView");
        }
        int measuredWidth = paddingLeft2 + viewGroup3.getMeasuredWidth();
        View view2 = this.f65405g;
        if (view2 == null) {
            C7573i.m23580a();
        }
        viewGroup.layout(paddingLeft, measuredHeight2, measuredWidth, view2.getMeasuredHeight());
        View view3 = this.f65405g;
        if (view3 == null) {
            C7573i.m23580a();
        }
        int paddingLeft3 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft4 = getPaddingLeft();
        View view4 = this.f65405g;
        if (view4 == null) {
            C7573i.m23580a();
        }
        int measuredWidth2 = paddingLeft4 + view4.getMeasuredWidth();
        int paddingTop2 = getPaddingTop();
        View view5 = this.f65405g;
        if (view5 == null) {
            C7573i.m23580a();
        }
        view3.layout(paddingLeft3, paddingTop, measuredWidth2, paddingTop2 + view5.getMeasuredHeight());
        View view6 = this.f65406h;
        if (view6 == null) {
            C7573i.m23580a();
        }
        int paddingLeft5 = getPaddingLeft();
        int paddingTop3 = getPaddingTop();
        View view7 = this.f65405g;
        if (view7 == null) {
            C7573i.m23580a();
        }
        int measuredHeight3 = paddingTop3 + view7.getMeasuredHeight();
        int paddingLeft6 = getPaddingLeft();
        View view8 = this.f65406h;
        if (view8 == null) {
            C7573i.m23580a();
        }
        int measuredWidth3 = paddingLeft6 + view8.getMeasuredWidth();
        int paddingTop4 = getPaddingTop();
        View view9 = this.f65405g;
        if (view9 == null) {
            C7573i.m23580a();
        }
        int measuredHeight4 = paddingTop4 + view9.getMeasuredHeight();
        View view10 = this.f65406h;
        if (view10 == null) {
            C7573i.m23580a();
        }
        view6.layout(paddingLeft5, measuredHeight3, measuredWidth3, measuredHeight4 + view10.getMeasuredHeight());
    }
}
