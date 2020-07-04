package com.p280ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.k */
public final class C26663k extends C26649a {

    /* renamed from: d */
    private View f70300d;

    /* renamed from: e */
    private int f70301e = C23486n.m77122a(-5.0d);

    /* renamed from: d */
    private void m87608d() {
        this.f70273b = 160;
        this.f70301e = C23486n.m77122a(0.0d);
    }

    /* renamed from: c */
    public final C26663k mo68369c() {
        this.f70273b = 0;
        this.f70301e = C23486n.m77122a(0.0d);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo68353d(Animator animator) {
        m87608d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68346a(Animator animator) {
        this.f70300d.setTranslationY(0.0f);
        this.f70300d.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo68350b(Animator animator) {
        this.f70300d.setVisibility(8);
        m87608d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68347a(ValueAnimator valueAnimator) {
        this.f70300d.setTranslationY(((float) this.f70301e) * valueAnimator.getAnimatedFraction());
        this.f70300d.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo68351b(ValueAnimator valueAnimator) {
        this.f70300d.setTranslationY(((float) this.f70301e) * (1.0f - valueAnimator.getAnimatedFraction()));
        this.f70300d.setAlpha(valueAnimator.getAnimatedFraction());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo68352c(Animator animator) {
        this.f70300d.setVisibility(0);
        this.f70300d.setTranslationY((float) this.f70301e);
        this.f70300d.setAlpha(0.0f);
    }

    public C26663k(Context context, View view) {
        super(context);
        this.f70300d = view;
        m87608d();
        this.f70274c = 1;
    }
}
