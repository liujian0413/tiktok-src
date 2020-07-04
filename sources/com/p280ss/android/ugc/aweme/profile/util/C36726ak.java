package com.p280ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ak */
final /* synthetic */ class C36726ak implements Runnable {

    /* renamed from: a */
    private final int f96387a;

    /* renamed from: b */
    private final Activity f96388b;

    /* renamed from: c */
    private final C35999a f96389c;

    /* renamed from: d */
    private final Fragment f96390d;

    /* renamed from: e */
    private final boolean f96391e;

    C36726ak(int i, Activity activity, C35999a aVar, Fragment fragment, boolean z) {
        this.f96387a = i;
        this.f96388b = activity;
        this.f96389c = aVar;
        this.f96390d = fragment;
        this.f96391e = z;
    }

    public final void run() {
        C36725aj.m118395a(this.f96387a, this.f96388b, this.f96389c, this.f96390d, this.f96391e);
    }
}
