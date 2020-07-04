package dmt.p1861av.video;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: dmt.av.video.ab */
final /* synthetic */ class C47416ab implements AnimatorUpdateListener {

    /* renamed from: a */
    private final VEVideoPublishEditFragment f121731a;

    /* renamed from: b */
    private final boolean f121732b;

    /* renamed from: c */
    private final float f121733c;

    /* renamed from: d */
    private final int f121734d;

    /* renamed from: e */
    private final int f121735e;

    /* renamed from: f */
    private final int f121736f;

    /* renamed from: g */
    private final int f121737g;

    /* renamed from: h */
    private final int f121738h;

    /* renamed from: i */
    private final int f121739i;

    C47416ab(VEVideoPublishEditFragment vEVideoPublishEditFragment, boolean z, float f, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f121731a = vEVideoPublishEditFragment;
        this.f121732b = z;
        this.f121733c = f;
        this.f121734d = i;
        this.f121735e = i2;
        this.f121736f = i3;
        this.f121737g = i4;
        this.f121738h = i5;
        this.f121739i = i6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f121731a.mo119493a(this.f121732b, this.f121733c, this.f121734d, this.f121735e, this.f121736f, this.f121737g, this.f121738h, this.f121739i, valueAnimator);
    }
}
