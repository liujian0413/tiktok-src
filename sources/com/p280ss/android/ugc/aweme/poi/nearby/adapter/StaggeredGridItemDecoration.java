package com.p280ss.android.ugc.aweme.poi.nearby.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.StaggeredGridLayoutManager.LayoutParams;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.adapter.StaggeredGridItemDecoration */
public class StaggeredGridItemDecoration extends C1272h {

    /* renamed from: a */
    private int f91897a;

    /* renamed from: b */
    private int f91898b;

    public StaggeredGridItemDecoration(int i) {
        this.f91897a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (!(view instanceof C35130a)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.mo6015e() % 2 == 0) {
                rect.left = C23486n.m77122a((double) this.f91897a);
                rect.right = C23486n.m77122a(2.0d);
            } else {
                rect.left = C23486n.m77122a(2.0d);
                rect.right = C23486n.m77122a((double) this.f91897a);
            }
            if (layoutParams.mo6015e() == 0 || layoutParams.mo6015e() == 1) {
                rect.top = this.f91898b;
            } else {
                rect.top = 0;
            }
        }
    }
}
