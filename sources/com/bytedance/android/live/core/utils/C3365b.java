package com.bytedance.android.live.core.utils;

import android.view.View;

/* renamed from: com.bytedance.android.live.core.utils.b */
final /* synthetic */ class C3365b implements Runnable {

    /* renamed from: a */
    private final View f10175a;

    private C3365b(View view) {
        this.f10175a = view;
    }

    /* renamed from: a */
    static Runnable m12550a(View view) {
        return new C3365b(view);
    }

    public final void run() {
        this.f10175a.requestLayout();
    }
}
