package com.bytedance.scene.p639a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.scene.a.e */
public final class C12580e {
    /* renamed from: a */
    private static Animator m36489a(List<Animator> list) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        return animatorSet;
    }

    /* renamed from: a */
    public static Animator m36490a(Animator... animatorArr) {
        return m36489a(Arrays.asList(animatorArr));
    }
}
