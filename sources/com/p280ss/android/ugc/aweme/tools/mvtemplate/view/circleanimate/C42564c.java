package com.p280ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.graphics.drawable.GradientDrawable;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.c */
public final class C42564c {

    /* renamed from: a */
    public int f110675a;

    /* renamed from: b */
    public int f110676b;

    /* renamed from: c */
    public GradientDrawable f110677c;

    public C42564c(GradientDrawable gradientDrawable) {
        this.f110677c = gradientDrawable;
    }

    /* renamed from: a */
    public final void mo104155a(int i) {
        this.f110675a = 0;
        this.f110677c.setStroke(0, this.f110676b);
    }

    /* renamed from: b */
    public final void mo104156b(int i) {
        this.f110676b = i;
        this.f110677c.setStroke(this.f110675a, i);
    }
}
