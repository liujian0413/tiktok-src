package android.support.design.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.internal.C0296b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.design.widget.p */
final class C0413p {

    /* renamed from: a */
    private static final int[] f1774a = {16843848};

    /* renamed from: a */
    static void m1844a(View view, AttributeSet attributeSet, int i, int i2) {
        C0414q.m1846a(view, attributeSet, 0, R.style.q9);
    }

    /* renamed from: a */
    static void m1842a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    static void m1843a(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.a36, -2130969682}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: b */
    public static void m1845b(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray a = C0296b.m1168a(context, attributeSet, f1774a, i, i2, new int[0]);
        try {
            if (a.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, a.getResourceId(0, 0)));
            }
        } finally {
            a.recycle();
        }
    }
}
