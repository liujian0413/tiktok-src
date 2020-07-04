package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.views.C43371g;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.WrapStaggeredGridLayoutManager */
public class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager implements C43371g {
    public WrapStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: c */
    public void mo5385c(C1284o oVar, C1290s sVar) {
        try {
            super.mo5385c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: b */
    public final int mo5381b(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5381b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public WrapStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
