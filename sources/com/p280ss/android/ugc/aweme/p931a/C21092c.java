package com.p280ss.android.ugc.aweme.p931a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21090d;

/* renamed from: com.ss.android.ugc.aweme.a.c */
final /* synthetic */ class C21092c implements Runnable {

    /* renamed from: a */
    private final Activity f56643a;

    /* renamed from: b */
    private final int f56644b;

    /* renamed from: c */
    private final ViewGroup f56645c;

    /* renamed from: d */
    private final View f56646d;

    /* renamed from: e */
    private final View f56647e;

    /* renamed from: f */
    private final C21090d f56648f;

    C21092c(Activity activity, int i, ViewGroup viewGroup, View view, View view2, C21090d dVar) {
        this.f56643a = activity;
        this.f56644b = i;
        this.f56645c = viewGroup;
        this.f56646d = view;
        this.f56647e = view2;
        this.f56648f = dVar;
    }

    public final void run() {
        C21085a.m71118a(this.f56643a, this.f56644b, this.f56645c, this.f56646d, this.f56647e, this.f56648f);
    }
}
