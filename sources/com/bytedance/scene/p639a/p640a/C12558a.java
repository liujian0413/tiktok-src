package com.bytedance.scene.p639a.p640a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p022v4.view.animation.LinearOutSlowInInterpolator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.scene.p639a.C12557a;
import com.bytedance.scene.p639a.C12575d;
import com.bytedance.scene.p639a.C12580e;

/* renamed from: com.bytedance.scene.a.a.a */
public final class C12558a extends C12575d {

    /* renamed from: b */
    private C12559b f33334b = new C12559b();

    /* renamed from: a */
    public final boolean mo30836a() {
        return true;
    }

    /* renamed from: a */
    public final Animator mo30835a(C12557a aVar, C12557a aVar2) {
        if (aVar2.f33333d) {
            return this.f33334b.mo30835a(aVar, aVar2);
        }
        View view = aVar.f33331b;
        View view2 = aVar2.f33331b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 1.0f});
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(120);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat2.setDuration(120);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{((float) view2.getHeight()) * 0.08f, 0.0f});
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.5f));
        ofFloat3.setDuration(200);
        return C12580e.m36490a(ofFloat, ofFloat2, ofFloat3);
    }

    /* renamed from: b */
    public final Animator mo30837b(C12557a aVar, C12557a aVar2) {
        if (aVar.f33333d) {
            return this.f33334b.mo30837b(aVar, aVar2);
        }
        View view = aVar2.f33331b;
        View view2 = aVar.f33331b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150);
        ofFloat.setStartDelay(50);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f, ((float) view.getHeight()) * 0.08f});
        ofFloat2.setInterpolator(new AccelerateInterpolator(2.0f));
        ofFloat2.setDuration(200);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.7f, 1.0f});
        ofFloat3.setInterpolator(new LinearOutSlowInInterpolator());
        ofFloat3.setDuration(200);
        return C12580e.m36490a(ofFloat, ofFloat2, ofFloat3);
    }
}
