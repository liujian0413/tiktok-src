package com.p280ss.android.ugc.aweme.commercialize.views;

import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.e */
final /* synthetic */ class C25574e implements Runnable {

    /* renamed from: a */
    private final BaseAdBottomLabelView f67353a;

    /* renamed from: b */
    private final View f67354b;

    /* renamed from: c */
    private final Runnable f67355c;

    C25574e(BaseAdBottomLabelView baseAdBottomLabelView, View view, Runnable runnable) {
        this.f67353a = baseAdBottomLabelView;
        this.f67354b = view;
        this.f67355c = runnable;
    }

    public final void run() {
        this.f67353a.mo66099b(this.f67354b, this.f67355c);
    }
}
