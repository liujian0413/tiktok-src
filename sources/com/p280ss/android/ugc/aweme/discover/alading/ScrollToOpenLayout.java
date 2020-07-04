package com.p280ss.android.ugc.aweme.discover.alading;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.support.p022v4.view.C0982n;
import android.support.p022v4.view.NestedScrollingChild2;
import android.support.p022v4.view.NestedScrollingParent2;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout */
public final class ScrollToOpenLayout extends LinearLayout implements NestedScrollingParent2 {

    /* renamed from: a */
    public static final C26541a f70017a = new C26541a(null);

    /* renamed from: b */
    private boolean f70018b;

    /* renamed from: c */
    private final C0982n f70019c;

    /* renamed from: d */
    private int f70020d;

    /* renamed from: e */
    private int f70021e;

    /* renamed from: f */
    private int f70022f;

    /* renamed from: g */
    private C26542b f70023g;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$a */
    public static final class C26541a {
        private C26541a() {
        }

        public /* synthetic */ C26541a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$b */
    public interface C26542b {
        /* renamed from: a */
        void mo68171a();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$c */
    static final class C26543c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScrollToOpenLayout f70024a;

        C26543c(ScrollToOpenLayout scrollToOpenLayout) {
            this.f70024a = scrollToOpenLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f70024a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$d */
    static final class C26544d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScrollToOpenLayout f70025a;

        /* renamed from: b */
        final /* synthetic */ float f70026b;

        C26544d(ScrollToOpenLayout scrollToOpenLayout, float f) {
            this.f70025a = scrollToOpenLayout;
            this.f70026b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f70025a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    public final boolean mo1399a(View view, View view2, int i, int i2) {
        C7573i.m23587b(view, "child");
        C7573i.m23587b(view2, "target");
        return i == 1;
    }

    public final boolean getEnable() {
        return this.f70018b;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C7573i.m23587b(view, "target");
        return false;
    }

    /* renamed from: a */
    private final void m87251a() {
        setOrientation(0);
    }

    public final int getNestedScrollAxes() {
        return this.f70019c.f3402a;
    }

    /* renamed from: b */
    private final void m87253b() {
        C26542b bVar = this.f70023g;
        if (bVar != null) {
            bVar.mo68171a();
        }
    }

    /* renamed from: c */
    private final double m87254c() {
        double scrollX = (double) getScrollX();
        double d = (double) this.f70020d;
        Double.isNaN(scrollX);
        Double.isNaN(d);
        return Math.max(0.05d, 1.0d - Math.pow(scrollX / d, 0.9d));
    }

    /* access modifiers changed from: protected */
    public final int computeHorizontalScrollRange() {
        if (!this.f70018b) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int i = 0;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                C7573i.m23582a((Object) childAt, "getChildAt(i)");
                i += childAt.getWidth();
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 2) {
            throw new IllegalArgumentException("ScrollToOpenLayout must have two child");
        } else if (getChildAt(0) instanceof NestedScrollingChild2) {
            View childAt = getChildAt(0);
            C7573i.m23582a((Object) childAt, "child");
            LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = -1;
            childAt.setLayoutParams(layoutParams);
        } else {
            throw new IllegalArgumentException("first child must be an instance of NestedScrollingChild2");
        }
    }

    /* renamed from: d */
    private final void m87255d() {
        if (getScrollX() > 0) {
            double scrollX = (double) getScrollX();
            double d = (double) this.f70020d;
            Double.isNaN(d);
            if (scrollX > d * 0.88d) {
                m87253b();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getScrollX(), 0});
            double scrollX2 = (double) getScrollX();
            double d2 = (double) this.f70020d;
            Double.isNaN(scrollX2);
            Double.isNaN(d2);
            ofInt.setDuration((long) ((scrollX2 / d2) * 200.0d));
            ofInt.addUpdateListener(new C26543c(this));
            ofInt.start();
        }
    }

    public final void setEnable(boolean z) {
        this.f70018b = z;
    }

    public final void setOnScrollToEndListener(C26542b bVar) {
        this.f70023g = bVar;
    }

    public ScrollToOpenLayout(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    /* renamed from: a */
    private final void m87252a(float f) {
        double d = (double) this.f70020d;
        Double.isNaN(d);
        double d2 = d * 0.66d;
        double d3 = (double) f;
        Double.isNaN(d3);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) (d2 * d3), 0});
        ofInt.setDuration((long) (600.0f * f));
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new C26544d(this, f));
        ofInt.start();
    }

    public ScrollToOpenLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo1401b(View view, int i) {
        C7573i.m23587b(view, "target");
        this.f70019c.mo3775a(view, i);
        if (i == 0) {
            m87255d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View childAt = getChildAt(1);
        C7573i.m23582a((Object) childAt, "secondChild");
        this.f70020d = childAt.getMeasuredWidth();
    }

    public ScrollToOpenLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f70018b = true;
        this.f70019c = new C0982n(this);
        m87251a();
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        C7573i.m23587b(view, "target");
        if (!this.f70018b) {
            return false;
        }
        OverScroller overScroller = new OverScroller(view.getContext());
        overScroller.fling(0, 0, (int) f, (int) f2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.f70021e = overScroller.getFinalX();
        this.f70022f = 0;
        return false;
    }

    /* renamed from: b */
    public final void mo1402b(View view, View view2, int i, int i2) {
        C7573i.m23587b(view, "child");
        C7573i.m23587b(view2, "target");
        this.f70019c.mo3777a(view, view2, i, i2);
    }

    /* renamed from: a */
    public final void mo1397a(View view, int i, int i2, int[] iArr, int i3) {
        C7573i.m23587b(view, "target");
        C7573i.m23587b(iArr, "consumed");
        if (this.f70018b && i3 == 0 && i < 0 && getScrollX() > 0) {
            double c = m87254c();
            double d = (double) i;
            Double.isNaN(d);
            scrollBy(Math.max((int) (d * c), -getScrollX()), 0);
            iArr[0] = i;
        }
    }

    /* renamed from: a */
    public final void mo1396a(View view, int i, int i2, int i3, int i4, int i5) {
        C7573i.m23587b(view, "target");
        if (this.f70018b) {
            if (i5 == 0) {
                if (i3 > 0) {
                    requestDisallowInterceptTouchEvent(true);
                    double c = m87254c();
                    double d = (double) i3;
                    Double.isNaN(d);
                    scrollBy(Math.min((int) (d * c), this.f70020d - getScrollX()), 0);
                }
            } else if (i > 0) {
                this.f70022f += i;
                if (i3 > 0) {
                    int i6 = this.f70021e - this.f70022f;
                    Context context = getContext();
                    C7573i.m23582a((Object) context, "context");
                    Resources resources = context.getResources();
                    C7573i.m23582a((Object) resources, "context.resources");
                    float applyDimension = TypedValue.applyDimension(1, 800.0f, resources.getDisplayMetrics());
                    m87252a(Math.min((float) i6, applyDimension) / applyDimension);
                }
            }
        }
    }
}
