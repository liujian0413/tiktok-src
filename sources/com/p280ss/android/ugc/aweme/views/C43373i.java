package com.p280ss.android.ugc.aweme.views;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.views.i */
public final class C43373i extends ViewOutlineProvider {

    /* renamed from: a */
    private int f112342a;

    public C43373i(int i) {
        this.f112342a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f112342a);
    }
}
