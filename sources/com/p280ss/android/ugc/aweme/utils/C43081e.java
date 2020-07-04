package com.p280ss.android.ugc.aweme.utils;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.p022v4.graphics.drawable.C0727a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: com.ss.android.ugc.aweme.utils.e */
public final class C43081e {
    /* renamed from: a */
    public static void m136670a(View view) {
        m136671a(view, 0.75f);
    }

    /* renamed from: a */
    public static Drawable m136669a(Drawable drawable, int i) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
        C0727a.m3103a(drawable, i);
        return drawable;
    }

    /* renamed from: a */
    public static void m136671a(View view, float f) {
        if (view != null) {
            view.setOnTouchListener(new C43116f(view, 0.75f));
        }
    }

    /* renamed from: a */
    public static ValueAnimator m136668a(final View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.setDuration((long) i3);
        ofInt.setTarget(view);
        return ofInt;
    }

    /* renamed from: a */
    public static void m136672a(final View view, int i, int i2, long j) {
        if (i != i2) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            ofObject.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (view != null) {
                        view.setBackgroundColor(intValue);
                    }
                }
            });
            ofObject.setDuration(j);
            ofObject.start();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m136674a(View view, float f, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().alpha(f).setDuration(150).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().alpha(f).setDuration(150).start();
        return false;
    }

    /* renamed from: a */
    public static void m136673a(final View view, Drawable drawable, int i, int i2, long j) {
        if (i != i2) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            final Drawable mutate = C0727a.m3116g(drawable).mutate();
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setColor(i2);
            }
            ofObject.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (view != null) {
                        view.setBackground(C43081e.m136669a(mutate, intValue));
                    }
                }
            });
            ofObject.setDuration(j);
            ofObject.start();
        }
    }
}
