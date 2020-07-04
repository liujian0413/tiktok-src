package com.p280ss.android.ugc.aweme.p931a;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21090d;

/* renamed from: com.ss.android.ugc.aweme.a.e */
final /* synthetic */ class C21094e implements Runnable {

    /* renamed from: a */
    private final Activity f56654a;

    /* renamed from: b */
    private final ViewGroup f56655b;

    /* renamed from: c */
    private final View f56656c;

    /* renamed from: d */
    private final View f56657d;

    /* renamed from: e */
    private final DisplayMetrics f56658e;

    /* renamed from: f */
    private final boolean f56659f;

    /* renamed from: g */
    private final int f56660g;

    /* renamed from: h */
    private final int f56661h;

    /* renamed from: i */
    private final int f56662i;

    /* renamed from: j */
    private final int f56663j;

    /* renamed from: k */
    private final C21090d f56664k;

    C21094e(Activity activity, ViewGroup viewGroup, View view, View view2, DisplayMetrics displayMetrics, boolean z, int i, int i2, int i3, int i4, C21090d dVar) {
        this.f56654a = activity;
        this.f56655b = viewGroup;
        this.f56656c = view;
        this.f56657d = view2;
        this.f56658e = displayMetrics;
        this.f56659f = z;
        this.f56660g = i;
        this.f56661h = i2;
        this.f56662i = i3;
        this.f56663j = i4;
        this.f56664k = dVar;
    }

    public final void run() {
        C21085a.m71120a(this.f56654a, this.f56655b, this.f56656c, this.f56657d, this.f56658e, this.f56659f, this.f56660g, this.f56661h, this.f56662i, this.f56663j, this.f56664k);
    }
}
