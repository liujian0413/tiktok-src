package com.p280ss.android.ugc.aweme.commercialize.symphony;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.feed.adapter.C28173d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.b */
public final class C25150b implements OnTouchListener {

    /* renamed from: a */
    private final float f66351a = 0.92f;

    /* renamed from: b */
    private final float f66352b = 1.0f;

    /* renamed from: a */
    private final void m82735a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f66351a});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f66351a});
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet duration = animatorSet.setDuration(100);
        C7573i.m23582a((Object) duration, "set.setDuration(100)");
        duration.setInterpolator(new C28173d());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    /* renamed from: b */
    private final void m82736b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f66352b});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f66352b});
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet duration = animatorSet.setDuration(60);
        C7573i.m23582a((Object) duration, "set.setDuration(60)");
        duration.setInterpolator(new C28173d());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7573i.m23587b(view, "v");
        C7573i.m23587b(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    m82735a(view);
                    break;
                case 1:
                    m82736b(view);
                    view.performClick();
                    return true;
            }
            return true;
        }
        m82736b(view);
        return false;
    }
}
