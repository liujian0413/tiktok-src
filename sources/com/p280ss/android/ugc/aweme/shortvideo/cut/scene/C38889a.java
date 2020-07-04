package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.C9738o;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.a */
public final class C38889a {

    /* renamed from: a */
    public static final C38889a f100993a = new C38889a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.a$a */
    public static final class C38890a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f100994a;

        /* renamed from: b */
        final /* synthetic */ C7562b f100995b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f100994a.setVisibility(8);
            this.f100995b.invoke(Boolean.valueOf(false));
        }

        C38890a(View view, C7562b bVar) {
            this.f100994a = view;
            this.f100995b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.a$b */
    public static final class C38891b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C7562b f100996a;

        C38891b(C7562b bVar) {
            this.f100996a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f100996a.invoke(Boolean.valueOf(true));
        }
    }

    private C38889a() {
    }

    /* renamed from: a */
    public static void m124163a(View view, boolean z, C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "animationFinish");
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
                animatorSet.addListener(new C38891b(bVar));
                animatorSet.start();
            }
        }
    }

    /* renamed from: b */
    public static void m124164b(View view, boolean z, C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "animationFinish");
        if (view != null) {
            float b = C9738o.m28708b(view.getContext(), 16.0f);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, b});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200);
                animatorSet.addListener(new C38890a(view, bVar));
                animatorSet.start();
                return;
            }
            view.setVisibility(8);
        }
    }
}
