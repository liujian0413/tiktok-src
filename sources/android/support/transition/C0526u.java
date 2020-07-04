package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.transition.u */
final class C0526u {

    /* renamed from: android.support.transition.u$a */
    static class C0527a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f2079a;

        /* renamed from: b */
        private final View f2080b;

        /* renamed from: c */
        private final int f2081c;

        /* renamed from: d */
        private final int f2082d;

        /* renamed from: e */
        private int[] f2083e = ((int[]) this.f2079a.getTag(R.id.dni));

        /* renamed from: f */
        private float f2084f;

        /* renamed from: g */
        private float f2085g;

        /* renamed from: h */
        private final float f2086h;

        /* renamed from: i */
        private final float f2087i;

        public final void onAnimationEnd(Animator animator) {
            this.f2080b.setTranslationX(this.f2086h);
            this.f2080b.setTranslationY(this.f2087i);
        }

        public final void onAnimationResume(Animator animator) {
            this.f2080b.setTranslationX(this.f2084f);
            this.f2080b.setTranslationY(this.f2085g);
        }

        public final void onAnimationPause(Animator animator) {
            this.f2084f = this.f2080b.getTranslationX();
            this.f2085g = this.f2080b.getTranslationY();
            this.f2080b.setTranslationX(this.f2086h);
            this.f2080b.setTranslationY(this.f2087i);
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f2083e == null) {
                this.f2083e = new int[2];
            }
            this.f2083e[0] = Math.round(((float) this.f2081c) + this.f2080b.getTranslationX());
            this.f2083e[1] = Math.round(((float) this.f2082d) + this.f2080b.getTranslationY());
            this.f2079a.setTag(R.id.dni, this.f2083e);
        }

        C0527a(View view, View view2, int i, int i2, float f, float f2) {
            this.f2080b = view;
            this.f2079a = view2;
            this.f2081c = i - Math.round(this.f2080b.getTranslationX());
            this.f2082d = i2 - Math.round(this.f2080b.getTranslationY());
            this.f2086h = f;
            this.f2087i = f2;
            if (this.f2083e != null) {
                this.f2079a.setTag(R.id.dni, null);
            }
        }
    }

    /* renamed from: a */
    static Animator m2218a(View view, C0524s sVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        View view2 = view;
        C0524s sVar2 = sVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) sVar2.f2073b.getTag(R.id.dni);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view2.setTranslationX(f5);
        view2.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C0527a aVar = new C0527a(view, sVar2.f2073b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(aVar);
        C0453a.m1986a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
