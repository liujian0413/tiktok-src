package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.FixedSizeLinearLayoutManager */
public final class FixedSizeLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public int f82722a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f82723b = Integer.MAX_VALUE;

    /* renamed from: d */
    public final void mo5784d(int i, int i2) {
        if (i > this.f82722a && i2 > this.f82723b) {
            super.mo5784d(this.f82722a, this.f82723b);
        } else if (i > this.f82722a && i2 <= this.f82723b) {
            super.mo5784d(this.f82722a, i2);
        } else if (i > this.f82722a || i2 <= this.f82723b) {
            super.mo5784d(i, i2);
        } else {
            super.mo5784d(i, this.f82723b);
        }
    }

    public FixedSizeLinearLayoutManager(Context context, int i, boolean z) {
        C7573i.m23587b(context, "context");
        super(context, 0, true);
    }
}
