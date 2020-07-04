package com.p280ss.android.ugc.aweme.p1685ug.guide;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import com.p280ss.android.ugc.aweme.common.widget.BaseVerticalViewPager;
import com.p280ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.b */
public final class C42691b {

    /* renamed from: d */
    public static boolean f110963d = true;

    /* renamed from: e */
    public static final C42692a f110964e = new C42692a(null);

    /* renamed from: a */
    public float f110965a;

    /* renamed from: b */
    public int f110966b;

    /* renamed from: c */
    public final BaseVerticalViewPager f110967c;

    /* renamed from: f */
    private ValueAnimator f110968f;

    /* renamed from: g */
    private final LoadMoreFrameLayout f110969g;

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$a */
    public static final class C42692a {
        private C42692a() {
        }

        public /* synthetic */ C42692a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$b */
    static final class C42693b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C42691b f110970a;

        C42693b(C42691b bVar) {
            this.f110970a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f110970a.f110967c.mo66757b()) {
                BaseVerticalViewPager baseVerticalViewPager = this.f110970a.f110967c;
                C7573i.m23582a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    baseVerticalViewPager.mo66752a(((float) (((Integer) animatedValue).intValue() - this.f110970a.f110966b)) * this.f110970a.f110965a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            }
            C42691b bVar = this.f110970a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            if (animatedValue2 != null) {
                bVar.f110966b = ((Integer) animatedValue2).intValue();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$c */
    public static final class C42694c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C42691b f110971a;

        public final void onAnimationRepeat(Animator animator) {
        }

        C42694c(C42691b bVar) {
            this.f110971a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f110971a.f110967c.mo66758c();
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f110971a.f110967c.mo66757b()) {
                this.f110971a.f110967c.mo66762d();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f110971a.f110967c.mo66757b()) {
                this.f110971a.f110967c.mo66762d();
            }
            this.f110971a.f110966b = 0;
        }
    }

    /* renamed from: a */
    public final void mo104298a() {
        f110963d = false;
        PagerAdapter adapter = this.f110967c.getAdapter();
        C7573i.m23582a((Object) adapter, "viewPager.adapter");
        if (adapter.getCount() - 1 == this.f110967c.getCurrentItem()) {
            this.f110969g.mo74382g();
            return;
        }
        ValueAnimator valueAnimator = this.f110968f;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            View childAt = this.f110967c.getChildAt(0);
            C7573i.m23582a((Object) childAt, "item");
            this.f110965a = (((float) childAt.getHeight()) * -1.0f) / 100.0f;
            this.f110968f = ValueAnimator.ofInt(new int[]{0, 100});
            ValueAnimator valueAnimator2 = this.f110968f;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new C42693b(this));
            }
            ValueAnimator valueAnimator3 = this.f110968f;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new C42694c(this));
            }
            ValueAnimator valueAnimator4 = this.f110968f;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    public C42691b(BaseVerticalViewPager baseVerticalViewPager, LoadMoreFrameLayout loadMoreFrameLayout) {
        C7573i.m23587b(baseVerticalViewPager, "viewPager");
        C7573i.m23587b(loadMoreFrameLayout, "loadMoreFrameLayout");
        this.f110967c = baseVerticalViewPager;
        this.f110969g = loadMoreFrameLayout;
    }
}
