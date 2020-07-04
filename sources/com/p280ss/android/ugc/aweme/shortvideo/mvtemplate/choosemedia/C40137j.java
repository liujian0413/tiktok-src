package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.j */
final /* synthetic */ class C40137j implements AnimatorUpdateListener {

    /* renamed from: a */
    private final MvChooseAlbumFragment f104336a;

    /* renamed from: b */
    private final int f104337b;

    C40137j(MvChooseAlbumFragment mvChooseAlbumFragment, int i) {
        this.f104336a = mvChooseAlbumFragment;
        this.f104337b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f104336a.mo99812a(this.f104337b, valueAnimator);
    }
}
