package android.support.design.transformation;

import android.content.Context;
import android.support.design.p018d.C0270b;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.List;

public abstract class ExpandableBehavior extends Behavior<View> {

    /* renamed from: a */
    public int f1234a;

    public ExpandableBehavior() {
    }

    /* renamed from: a */
    public abstract boolean mo1205a(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo1206a(View view, View view2, boolean z, boolean z2);

    /* renamed from: a */
    private boolean m1204a(boolean z) {
        if (z) {
            if (this.f1234a == 0 || this.f1234a == 2) {
                return true;
            }
            return false;
        } else if (this.f1234a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private C0270b m1203a(CoordinatorLayout coordinatorLayout, View view) {
        List b = coordinatorLayout.mo1400b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) b.get(i);
            if (mo1205a(coordinatorLayout, view, view2)) {
                return (C0270b) view2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo1207b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        C0270b bVar = (C0270b) view2;
        if (!m1204a(bVar.mo1046a())) {
            return false;
        }
        if (bVar.mo1046a()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f1234a = i;
        return mo1206a((View) bVar, view, bVar.mo1046a(), true);
    }

    /* renamed from: a */
    public final boolean mo684a(CoordinatorLayout coordinatorLayout, final View view, int i) {
        int i2;
        if (!C0991u.m4167D(view)) {
            final C0270b a = m1203a(coordinatorLayout, view);
            if (a != null && m1204a(a.mo1046a())) {
                if (a.mo1046a()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                this.f1234a = i2;
                final int i3 = this.f1234a;
                view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.f1234a == i3) {
                            ExpandableBehavior.this.mo1206a((View) a, view, a.mo1046a(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }
}
