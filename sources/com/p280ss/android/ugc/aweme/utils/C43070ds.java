package com.p280ss.android.ugc.aweme.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.utils.ds */
public final class C43070ds extends ViewOutlineProvider {

    /* renamed from: a */
    private int f111673a;

    public C43070ds(int i) {
        this.f111673a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f111673a);
    }
}
