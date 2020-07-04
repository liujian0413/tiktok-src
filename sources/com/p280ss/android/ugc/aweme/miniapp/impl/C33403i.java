package com.p280ss.android.ugc.aweme.miniapp.impl;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.i */
final /* synthetic */ class C33403i implements Callable {

    /* renamed from: a */
    private final Activity f87245a;

    /* renamed from: b */
    private final List f87246b;

    /* renamed from: c */
    private final int f87247c;

    C33403i(Activity activity, List list, int i) {
        this.f87245a = activity;
        this.f87246b = list;
        this.f87247c = i;
    }

    public final Object call() {
        return C33400h.m108019a(this.f87245a, this.f87246b, this.f87247c);
    }
}
