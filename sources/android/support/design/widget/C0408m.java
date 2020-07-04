package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.m */
public final class C0408m {

    /* renamed from: a */
    ValueAnimator f1759a = null;

    /* renamed from: b */
    private final ArrayList<C0410a> f1760b = new ArrayList<>();

    /* renamed from: c */
    private C0410a f1761c = null;

    /* renamed from: d */
    private final AnimatorListener f1762d = new AnimatorListenerAdapter() {
        public final void onAnimationEnd(Animator animator) {
            if (C0408m.this.f1759a == animator) {
                C0408m.this.f1759a = null;
            }
        }
    };

    /* renamed from: android.support.design.widget.m$a */
    static class C0410a {

        /* renamed from: a */
        final int[] f1764a;

        /* renamed from: b */
        final ValueAnimator f1765b;

        C0410a(int[] iArr, ValueAnimator valueAnimator) {
            this.f1764a = iArr;
            this.f1765b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m1834b() {
        if (this.f1759a != null) {
            this.f1759a.cancel();
            this.f1759a = null;
        }
    }

    /* renamed from: a */
    public final void mo1870a() {
        if (this.f1759a != null) {
            this.f1759a.end();
            this.f1759a = null;
        }
    }

    /* renamed from: a */
    private void m1833a(C0410a aVar) {
        this.f1759a = aVar.f1765b;
        this.f1759a.start();
    }

    /* renamed from: a */
    public final void mo1871a(int[] iArr) {
        C0410a aVar;
        int size = this.f1760b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C0410a) this.f1760b.get(i);
            if (StateSet.stateSetMatches(aVar.f1764a, iArr)) {
                break;
            }
            i++;
        }
        if (aVar != this.f1761c) {
            if (this.f1761c != null) {
                m1834b();
            }
            this.f1761c = aVar;
            if (aVar != null) {
                m1833a(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo1872a(int[] iArr, ValueAnimator valueAnimator) {
        C0410a aVar = new C0410a(iArr, valueAnimator);
        valueAnimator.addListener(this.f1762d);
        this.f1760b.add(aVar);
    }
}
