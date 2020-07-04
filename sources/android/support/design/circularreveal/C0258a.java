package android.support.design.circularreveal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.support.design.circularreveal.C0263d.C0265a;
import android.support.design.circularreveal.C0263d.C0266b;
import android.support.design.circularreveal.C0263d.C0268d;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: android.support.design.circularreveal.a */
public final class C0258a {
    /* renamed from: a */
    public static AnimatorListener m1029a(final C0263d dVar) {
        return new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                dVar.mo1013b();
            }

            public final void onAnimationStart(Animator animator) {
                dVar.mo1011a();
            }
        };
    }

    /* renamed from: a */
    public static Animator m1030a(C0263d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C0266b.f1051a, C0265a.f1049a, new C0268d[]{new C0268d(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C0268d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f1055c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
