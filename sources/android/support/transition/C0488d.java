package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.p022v4.view.C0991u;
import android.support.transition.C0508m.C0514c;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.d */
public final class C0488d extends C0467aj {

    /* renamed from: android.support.transition.d$a */
    static class C0490a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f1987a;

        /* renamed from: b */
        private boolean f1988b;

        C0490a(View view) {
            this.f1987a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C0460ae.m2006a(this.f1987a, 1.0f);
            if (this.f1988b) {
                this.f1987a.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (C0991u.m4245x(this.f1987a) && this.f1987a.getLayerType() == 0) {
                this.f1988b = true;
                this.f1987a.setLayerType(2, null);
            }
        }
    }

    public C0488d() {
    }

    public C0488d(int i) {
        mo2075c(i);
    }

    /* renamed from: a */
    public final void mo1185a(C0524s sVar) {
        super.mo1185a(sVar);
        sVar.f2072a.put("android:fade:transitionAlpha", Float.valueOf(C0460ae.m2012c(sVar.f2073b)));
    }

    /* renamed from: a */
    private static float m2082a(C0524s sVar, float f) {
        if (sVar == null) {
            return f;
        }
        Float f2 = (Float) sVar.f2072a.get("android:fade:transitionAlpha");
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* renamed from: a */
    private Animator m2083a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0460ae.m2006a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0460ae.f1913a, new float[]{f2});
        ofFloat.addListener(new C0490a(view));
        mo2117a((C0514c) new C0515n() {
            /* renamed from: a */
            public final void mo2042a(C0508m mVar) {
                C0460ae.m2006a(view, 1.0f);
                C0460ae.m2014e(view);
                mVar.mo2130b((C0514c) this);
            }
        });
        return ofFloat;
    }

    /* renamed from: b */
    public final Animator mo2074b(ViewGroup viewGroup, View view, C0524s sVar, C0524s sVar2) {
        C0460ae.m2013d(view);
        return m2083a(view, m2082a(sVar, 1.0f), 0.0f);
    }

    /* renamed from: a */
    public final Animator mo2071a(ViewGroup viewGroup, View view, C0524s sVar, C0524s sVar2) {
        float f = 0.0f;
        float a = m2082a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m2083a(view, f, 1.0f);
    }
}
