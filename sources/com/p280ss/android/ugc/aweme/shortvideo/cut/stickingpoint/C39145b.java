package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b */
public final class C39145b {

    /* renamed from: a */
    public static final C39145b f101498a = new C39145b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b$a */
    public static final class C39146a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f101499a;

        /* renamed from: b */
        final /* synthetic */ boolean f101500b;

        public final void onAnimationEnd(Animator animator) {
            int i;
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            View view = this.f101499a;
            if (this.f101500b) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }

        C39146a(View view, boolean z) {
            this.f101499a = view;
            this.f101500b = z;
        }
    }

    private C39145b() {
    }

    /* renamed from: a */
    public static void m124991a(View view) {
        if (view != null) {
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m124992a(View view, boolean z) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addListener(new C39146a(view, z));
            ofFloat.start();
        }
    }
}
