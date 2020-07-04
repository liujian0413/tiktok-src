package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.i */
final /* synthetic */ class C5810i implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LayoutParams f17143a;

    /* renamed from: b */
    private final ViewGroup f17144b;

    C5810i(LayoutParams layoutParams, ViewGroup viewGroup) {
        this.f17143a = layoutParams;
        this.f17144b = viewGroup;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LiveRoomTopBelowWidget.m18148a(this.f17143a, this.f17144b, valueAnimator);
    }
}
