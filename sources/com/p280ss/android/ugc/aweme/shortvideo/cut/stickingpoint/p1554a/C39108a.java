package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1554a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.C9738o;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a */
public abstract class C39108a {

    /* renamed from: a */
    public static final C39109a f101423a = new C39109a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a$a */
    public static final class C39109a {
        private C39109a() {
        }

        public /* synthetic */ C39109a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a$b */
    public static final class C39110b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39108a f101424a;

        /* renamed from: b */
        final /* synthetic */ View f101425b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f101425b.setVisibility(8);
            this.f101424a.mo97372c(false);
        }

        C39110b(C39108a aVar, View view) {
            this.f101424a = aVar;
            this.f101425b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a$c */
    public static final class C39111c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39108a f101426a;

        C39111c(C39108a aVar) {
            this.f101426a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f101426a.mo97372c(true);
        }
    }

    /* renamed from: a */
    public abstract View mo97369a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo97372c(boolean z) {
    }

    /* renamed from: a */
    public void mo97370a(boolean z) {
        m124825a(mo97369a(), z);
    }

    /* renamed from: b */
    public void mo97371b(boolean z) {
        m124826b(mo97369a(), z);
    }

    /* renamed from: a */
    private final void m124825a(View view, boolean z) {
        if (view != null) {
            float b = C9738o.m28708b(view.getContext(), 16.0f);
            view.setVisibility(0);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{b, 0.0f});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200);
                animatorSet.addListener(new C39111c(this));
                animatorSet.start();
            }
        }
    }

    /* renamed from: b */
    private final void m124826b(View view, boolean z) {
        if (view != null) {
            float b = C9738o.m28708b(view.getContext(), 16.0f);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, b});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200);
                animatorSet.addListener(new C39110b(this, view));
                animatorSet.start();
                return;
            }
            view.setVisibility(8);
        }
    }
}
