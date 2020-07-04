package com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.TabLayoutOnPageChangeListenerIndependent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.c */
final /* synthetic */ class C41016c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final TabLayoutOnPageChangeListenerIndependent f106723a;

    /* renamed from: b */
    private final int f106724b;

    /* renamed from: c */
    private final int f106725c;

    /* renamed from: d */
    private final TabLayout f106726d;

    /* renamed from: e */
    private final boolean f106727e;

    /* renamed from: f */
    private final boolean f106728f;

    C41016c(TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent, int i, int i2, TabLayout tabLayout, boolean z, boolean z2) {
        this.f106723a = tabLayoutOnPageChangeListenerIndependent;
        this.f106724b = i;
        this.f106725c = i2;
        this.f106726d = tabLayout;
        this.f106727e = z;
        this.f106728f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f106723a.mo101379a(this.f106724b, this.f106725c, this.f106726d, this.f106727e, this.f106728f, valueAnimator);
    }
}
