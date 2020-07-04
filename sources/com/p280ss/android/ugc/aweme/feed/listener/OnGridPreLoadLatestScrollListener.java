package com.p280ss.android.ugc.aweme.feed.listener;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;

/* renamed from: com.ss.android.ugc.aweme.feed.listener.OnGridPreLoadLatestScrollListener */
public class OnGridPreLoadLatestScrollListener extends C1281m {

    /* renamed from: a */
    private boolean f75139a;

    /* renamed from: b */
    private C28531m f75140b;

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        if (this.f75139a && this.f75140b != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            if (gridLayoutManager.mo5445j() == 2) {
                gridLayoutManager.mo5446k();
            }
        }
    }
}
