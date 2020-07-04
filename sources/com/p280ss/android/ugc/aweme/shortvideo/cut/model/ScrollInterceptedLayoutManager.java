package com.p280ss.android.ugc.aweme.shortvideo.cut.model;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager */
public final class ScrollInterceptedLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f100758a = true;

    /* renamed from: e */
    public final boolean mo5438e() {
        if (!super.mo5438e() || !this.f100758a) {
            return false;
        }
        return true;
    }

    public ScrollInterceptedLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    public ScrollInterceptedLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
