package com.p280ss.android.ugc.aweme.p931a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21090d;

/* renamed from: com.ss.android.ugc.aweme.a.b */
final /* synthetic */ class C21091b implements Runnable {

    /* renamed from: a */
    private final Activity f56638a;

    /* renamed from: b */
    private final ViewGroup f56639b;

    /* renamed from: c */
    private final View f56640c;

    /* renamed from: d */
    private final int f56641d;

    /* renamed from: e */
    private final C21090d f56642e;

    C21091b(Activity activity, ViewGroup viewGroup, View view, int i, C21090d dVar) {
        this.f56638a = activity;
        this.f56639b = viewGroup;
        this.f56640c = view;
        this.f56641d = i;
        this.f56642e = dVar;
    }

    public final void run() {
        C21085a.m71119a(this.f56638a, this.f56639b, this.f56640c, this.f56641d, this.f56642e);
    }
}
