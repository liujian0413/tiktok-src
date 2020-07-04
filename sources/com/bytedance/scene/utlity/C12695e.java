package com.bytedance.scene.utlity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.bytedance.scene.utlity.e */
public final class C12695e extends AnimatorListenerAdapter {

    /* renamed from: a */
    private View f33693a;

    /* renamed from: b */
    private int f33694b = this.f33693a.getLayerType();

    public C12695e(View view) {
        this.f33693a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f33693a.setLayerType(this.f33694b, null);
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f33693a.setLayerType(2, null);
    }
}
