package com.p280ss.android.ugc.aweme.common.p1142c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.common.c.c */
public abstract class C25660c implements OnTouchListener {
    /* renamed from: a */
    public abstract void mo63222a(View view, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Animator mo63223b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Animator mo63224c(View view);

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Animator b = mo63223b(view);
            b.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            b.start();
            return true;
        } else if (motionEvent.getAction() == 1) {
            Animator c = mo63224c(view);
            c.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C25660c.this.mo63222a(view, motionEvent);
                }
            });
            c.start();
            return true;
        } else if (motionEvent.getAction() != 3) {
            return false;
        } else {
            mo63224c(view).start();
            return false;
        }
    }
}
