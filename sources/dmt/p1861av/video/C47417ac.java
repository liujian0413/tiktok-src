package dmt.p1861av.video;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: dmt.av.video.ac */
final /* synthetic */ class C47417ac implements AnimatorUpdateListener {

    /* renamed from: a */
    private final VEVideoPublishEditFragment f121740a;

    /* renamed from: b */
    private final boolean f121741b;

    /* renamed from: c */
    private final int f121742c;

    /* renamed from: d */
    private final int f121743d;

    /* renamed from: e */
    private final float f121744e;

    /* renamed from: f */
    private final int f121745f;

    /* renamed from: g */
    private final int f121746g;

    /* renamed from: h */
    private final int f121747h;

    /* renamed from: i */
    private final int f121748i;

    /* renamed from: j */
    private final int f121749j;

    C47417ac(VEVideoPublishEditFragment vEVideoPublishEditFragment, boolean z, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7) {
        this.f121740a = vEVideoPublishEditFragment;
        this.f121741b = z;
        this.f121742c = i;
        this.f121743d = i2;
        this.f121744e = f;
        this.f121745f = i3;
        this.f121746g = i4;
        this.f121747h = i5;
        this.f121748i = i6;
        this.f121749j = i7;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f121740a.mo119494a(this.f121741b, this.f121742c, this.f121743d, this.f121744e, this.f121745f, this.f121746g, this.f121747h, this.f121748i, this.f121749j, valueAnimator);
    }
}
