package android.support.design.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.p015a.C0234a;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class HideBottomViewOnScrollBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public ViewPropertyAnimator f894a;

    /* renamed from: b */
    private int f895b;

    /* renamed from: c */
    private int f896c = 2;

    /* renamed from: a */
    public final boolean mo685a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo686b(V v) {
        if (this.f894a != null) {
            this.f894a.cancel();
            v.clearAnimation();
        }
        this.f896c = 1;
        m854a(v, this.f895b, 175, C0234a.f874c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo683a(V v) {
        if (this.f894a != null) {
            this.f894a.cancel();
            v.clearAnimation();
        }
        this.f896c = 2;
        m854a(v, 0, 225, C0234a.f875d);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo684a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f895b = v.getMeasuredHeight();
        return super.mo684a(coordinatorLayout, v, i);
    }

    /* renamed from: a */
    private void m854a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f894a = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f894a = null;
            }
        });
    }

    /* renamed from: a */
    public final void mo682a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f896c == 1 || i2 <= 0) {
            if (this.f896c != 2 && i2 < 0) {
                mo683a(v);
            }
            return;
        }
        mo686b(v);
    }
}
