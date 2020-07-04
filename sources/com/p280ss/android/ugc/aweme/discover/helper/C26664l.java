package com.p280ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.l */
public final class C26664l extends Visibility {
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        C7573i.m23587b(viewGroup, "sceneRoot");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(transitionValues, "startValues");
        C7573i.m23587b(transitionValues2, "endValues");
        return null;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        C7573i.m23587b(viewGroup, "sceneRoot");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(transitionValues, "startValues");
        C7573i.m23587b(transitionValues2, "endValues");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) C23486n.m77122a(20.0d), 0.0f});
        C7573i.m23582a((Object) ofFloat, "translationY");
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }
}
