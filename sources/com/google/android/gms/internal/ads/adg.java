package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final /* synthetic */ class adg implements OnApplyWindowInsetsListener {

    /* renamed from: a */
    private final adf f40025a;

    /* renamed from: b */
    private final Activity f40026b;

    adg(adf adf, Activity activity) {
        this.f40025a = adf;
        this.f40026b = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return adf.m45627a(this.f40026b, view, windowInsets);
    }
}
