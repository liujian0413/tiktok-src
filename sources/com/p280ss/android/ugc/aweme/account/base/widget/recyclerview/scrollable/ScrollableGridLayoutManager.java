package com.p280ss.android.ugc.aweme.account.base.widget.recyclerview.scrollable;

import android.content.Context;
import android.support.p029v7.widget.GridLayoutManager;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.scrollable.ScrollableGridLayoutManager */
public class ScrollableGridLayoutManager extends GridLayoutManager {

    /* renamed from: K */
    public boolean f56806K;

    /* renamed from: e */
    public final boolean mo5438e() {
        if (!this.f56806K || !super.mo5438e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo5441f() {
        if (!this.f56806K || !super.mo5441f()) {
            return false;
        }
        return true;
    }

    public ScrollableGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
