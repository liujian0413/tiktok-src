package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.WrapGridLayoutManager */
public class WrapGridLayoutManager extends GridLayoutManager {
    public WrapGridLayoutManager(Context context, int i) {
        super(context, 4);
    }

    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        try {
            super.mo5385c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
