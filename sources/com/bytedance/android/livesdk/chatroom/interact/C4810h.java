package com.bytedance.android.livesdk.chatroom.interact;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h */
final /* synthetic */ class C4810h implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LinkDialog f13709a;

    /* renamed from: b */
    private final LayoutParams f13710b;

    C4810h(LinkDialog linkDialog, LayoutParams layoutParams) {
        this.f13709a = linkDialog;
        this.f13710b = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13709a.mo12146a(this.f13710b, valueAnimator);
    }
}
