package android.support.design.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.p015a.C0235b;
import android.support.design.p015a.C0242i;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C0242i f1258c = new C0242i(75, 150);

    /* renamed from: d */
    private final C0242i f1259d = new C0242i(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final boolean mo1205a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* renamed from: a */
    public final boolean mo1219a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo1219a(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AnimatorSet mo1209b(View view, final View view2, final boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m1233a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C0235b.m832a(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
            }

            public final void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    /* renamed from: a */
    private void m1233a(View view, boolean z, boolean z2, List<Animator> list, List<AnimatorListener> list2) {
        C0242i iVar;
        ObjectAnimator objectAnimator;
        if (z) {
            iVar = this.f1258c;
        } else {
            iVar = this.f1259d;
        }
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo678a((Animator) objectAnimator);
        list.add(objectAnimator);
    }
}
