package android.support.p022v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: android.support.v4.app.ab */
final class C0587ab implements OnAttachStateChangeListener, OnPreDrawListener {

    /* renamed from: a */
    private final View f2334a;

    /* renamed from: b */
    private ViewTreeObserver f2335b;

    /* renamed from: c */
    private final Runnable f2336c;

    public final boolean onPreDraw() {
        m2462a();
        this.f2336c.run();
        return true;
    }

    /* renamed from: a */
    private void m2462a() {
        if (this.f2335b.isAlive()) {
            this.f2335b.removeOnPreDrawListener(this);
        } else {
            this.f2334a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2334a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        m2462a();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f2335b = view.getViewTreeObserver();
    }

    private C0587ab(View view, Runnable runnable) {
        this.f2334a = view;
        this.f2335b = view.getViewTreeObserver();
        this.f2336c = runnable;
    }

    /* renamed from: a */
    public static C0587ab m2461a(View view, Runnable runnable) {
        C0587ab abVar = new C0587ab(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(abVar);
        view.addOnAttachStateChangeListener(abVar);
        return abVar;
    }
}
