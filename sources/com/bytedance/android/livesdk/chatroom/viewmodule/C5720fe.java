package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.bytedance.android.live.core.widget.HSImageView;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.fe */
final /* synthetic */ class C5720fe implements AnimatorUpdateListener {

    /* renamed from: a */
    private final VoteWidget f16818a;

    /* renamed from: b */
    private final HSImageView f16819b;

    C5720fe(VoteWidget voteWidget, HSImageView hSImageView) {
        this.f16818a = voteWidget;
        this.f16819b = hSImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16818a.mo14049a(this.f16819b, valueAnimator);
    }
}
