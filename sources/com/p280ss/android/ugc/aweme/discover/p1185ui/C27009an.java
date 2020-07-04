package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.p280ss.android.ugc.aweme.common.p1142c.C25660c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.an */
public abstract class C27009an extends C25660c {
    /* renamed from: b */
    public abstract void mo67959b(View view, MotionEvent motionEvent);

    /* renamed from: b */
    public final Animator mo63223b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: c */
    public final Animator mo63224c(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f});
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: a */
    public final void mo63222a(View view, MotionEvent motionEvent) {
        mo67959b(view, motionEvent);
    }
}
