package com.facebook.fresco.animation.p707c.p708a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.facebook.fresco.animation.p707c.C13480a;

/* renamed from: com.facebook.fresco.animation.c.a.a */
public final class C13483a {
    /* renamed from: b */
    private static AnimatorUpdateListener m39663b(final C13480a aVar) {
        return new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
    }

    /* renamed from: a */
    public static ValueAnimator m39662a(C13480a aVar) {
        int c = aVar.mo33019c();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, (int) aVar.mo33018b()});
        valueAnimator.setDuration(aVar.mo33018b());
        if (c == 0) {
            c = -1;
        }
        valueAnimator.setRepeatCount(c);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(null);
        valueAnimator.addUpdateListener(m39663b(aVar));
        return valueAnimator;
    }
}
