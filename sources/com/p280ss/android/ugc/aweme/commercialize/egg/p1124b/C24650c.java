package com.p280ss.android.ugc.aweme.commercialize.egg.p1124b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.c */
public final class C24650c extends C24642a {

    /* renamed from: a */
    public static final C24651a f65002a = new C24651a(null);

    /* renamed from: b */
    private AnimationImageView f65003b;

    /* renamed from: c */
    private AnimationImageView f65004c;

    /* renamed from: j */
    private long f65005j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.c$a */
    public static final class C24651a {
        private C24651a() {
        }

        public /* synthetic */ C24651a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.c$b */
    public static final class C24652b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AnimationImageView f65006a;

        C24652b(AnimationImageView animationImageView) {
            this.f65006a = animationImageView;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f65006a.setLayerType(0, null);
            this.f65006a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f65006a.setLayerType(0, null);
            this.f65006a.setVisibility(8);
        }
    }

    /* renamed from: d */
    private final void m80809d() {
        AnimationImageView animationImageView = this.f65003b;
        if (animationImageView != null) {
            animationImageView.setVisibility(8);
        }
        AnimationImageView animationImageView2 = this.f65004c;
        if (animationImageView2 != null) {
            animationImageView2.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo64513b() {
        m80809d();
        AnimationImageView animationImageView = this.f65003b;
        if (animationImageView != null) {
            this.f64987i.removeView(animationImageView);
            animationImageView.mo7085f();
        }
        AnimationImageView animationImageView2 = this.f65004c;
        if (animationImageView2 != null) {
            this.f64987i.removeView(animationImageView2);
            animationImageView2.mo7085f();
        }
        this.f65003b = null;
        this.f65004c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64511a() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.commercialize.egg.b r0 = r8.f64983e
            r1 = 0
            if (r0 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.commercialize.egg.g r0 = r0.f64980f
            if (r0 == 0) goto L_0x000c
            com.airbnb.lottie.f r0 = r0.f65024a
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            r2 = 1
            if (r0 == 0) goto L_0x00a2
            android.content.Context r3 = r8.f64982d
            r8.m80807a(r3)
            long r3 = r8.f65005j
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002a
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r8.f65005j
            long r3 = r3 - r5
            r5 = 800(0x320, double:3.953E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ac
        L_0x002a:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = r8.f65003b
            r4 = 0
            if (r3 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = r8.f65004c
            if (r3 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x0038
            r1 = r8
        L_0x0038:
            com.ss.android.ugc.aweme.commercialize.egg.b.c r1 = (com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24650c) r1
            if (r1 == 0) goto L_0x00a1
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f65003b
            if (r1 != 0) goto L_0x0043
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0043:
            boolean r1 = r1.mo7084e()
            if (r1 != 0) goto L_0x006f
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f65003b
            if (r1 == 0) goto L_0x0050
            r1.setVisibility(r4)
        L_0x0050:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f65003b
            if (r1 == 0) goto L_0x0057
            r1.setComposition(r0)
        L_0x0057:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r8.f65003b
            if (r0 == 0) goto L_0x005e
            r0.mo7078b()
        L_0x005e:
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r8.f64984f
            if (r0 == 0) goto L_0x0065
            r0.mo64485a()
        L_0x0065:
            long r0 = java.lang.System.currentTimeMillis()
            r8.f65005j = r0
            r8.mo64514c()
            goto L_0x00ac
        L_0x006f:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f65004c
            if (r1 != 0) goto L_0x0076
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0076:
            boolean r1 = r1.mo7084e()
            if (r1 != 0) goto L_0x00a1
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f65004c
            if (r1 == 0) goto L_0x0083
            r1.setVisibility(r4)
        L_0x0083:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f65004c
            if (r1 == 0) goto L_0x008a
            r1.setComposition(r0)
        L_0x008a:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r8.f65004c
            if (r0 == 0) goto L_0x0091
            r0.mo7078b()
        L_0x0091:
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r8.f64984f
            if (r0 == 0) goto L_0x0098
            r0.mo64485a()
        L_0x0098:
            long r0 = java.lang.System.currentTimeMillis()
            r8.f65005j = r0
            r8.mo64514c()
        L_0x00a1:
            return
        L_0x00a2:
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r8.f64984f
            if (r0 == 0) goto L_0x00a9
            r0.mo64489b()
        L_0x00a9:
            r8.mo64512a(null)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24650c.mo64511a():void");
    }

    public C24650c(CommerceEggLayout commerceEggLayout) {
        C7573i.m23587b(commerceEggLayout, "eggLayout");
        super(commerceEggLayout);
    }

    /* renamed from: b */
    private static AnimationImageView m80808b(Context context) {
        AnimationImageView animationImageView = new AnimationImageView(context);
        animationImageView.setScaleType(ScaleType.CENTER_CROP);
        animationImageView.setLayoutParams(new LayoutParams(-1, -1));
        animationImageView.mo7076a((AnimatorListener) new C24652b(animationImageView));
        return animationImageView;
    }

    /* renamed from: a */
    private final void m80807a(Context context) {
        if (this.f65003b == null) {
            this.f65003b = m80808b(context);
            this.f64987i.addView(this.f65003b);
        }
        if (this.f65004c == null) {
            this.f65004c = m80808b(context);
            this.f64987i.addView(this.f65004c);
        }
    }
}
