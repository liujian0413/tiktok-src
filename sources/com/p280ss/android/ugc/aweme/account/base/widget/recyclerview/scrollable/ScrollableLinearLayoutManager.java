package com.p280ss.android.ugc.aweme.account.base.widget.recyclerview.scrollable;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.scrollable.ScrollableLinearLayoutManager */
public class ScrollableLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f56807a;

    /* renamed from: e */
    public final boolean mo5438e() {
        if (!this.f56807a || !super.mo5438e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo5441f() {
        if (!this.f56807a || !super.mo5441f()) {
            return false;
        }
        return true;
    }

    public ScrollableLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public ScrollableLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
