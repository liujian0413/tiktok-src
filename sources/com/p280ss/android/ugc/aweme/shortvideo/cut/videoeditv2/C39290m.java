package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.m */
final /* synthetic */ class C39290m implements AnimatorUpdateListener {

    /* renamed from: a */
    private final VideoEditViewV2 f102012a;

    /* renamed from: b */
    private final boolean f102013b;

    C39290m(VideoEditViewV2 videoEditViewV2, boolean z) {
        this.f102012a = videoEditViewV2;
        this.f102013b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f102012a.mo97781a(this.f102013b, valueAnimator);
    }
}
