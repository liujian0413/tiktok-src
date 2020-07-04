package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.p280ss.android.ugc.aweme.common.p1142c.C25660c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.r */
public abstract class C24335r extends C25660c {
    /* renamed from: a */
    public abstract void mo62335a(View view);

    /* renamed from: b */
    public final Animator mo63223b(View view) {
        C7573i.m23587b(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.75f});
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: c */
    public final Animator mo63224c(View view) {
        C7573i.m23587b(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.75f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: a */
    public final void mo63222a(View view, MotionEvent motionEvent) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(motionEvent, "event");
        mo62335a(view);
    }
}
