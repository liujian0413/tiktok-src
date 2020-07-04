package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f1239b;

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo1209b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1206a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        if (this.f1239b != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f1239b.cancel();
        }
        this.f1239b = mo1209b(view, view2, z, z3);
        this.f1239b.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.f1239b = null;
            }
        });
        this.f1239b.start();
        if (!z2) {
            this.f1239b.end();
        }
        return true;
    }
}
