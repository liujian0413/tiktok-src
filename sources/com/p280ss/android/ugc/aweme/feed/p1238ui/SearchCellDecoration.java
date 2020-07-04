package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.graphics.Rect;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p280ss.android.ugc.aweme.poi.nearby.adapter.C35130a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.SearchCellDecoration */
public final class SearchCellDecoration extends GridSpacingItemDecoration {

    /* renamed from: a */
    public int f75795a;

    public SearchCellDecoration(int i) {
        super(2, i, false);
        this.f75795a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        int f = RecyclerView.m5892f(view);
        C1262a adapter = recyclerView.getAdapter();
        if (!(view instanceof C35130a)) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (((GridLayoutManager.LayoutParams) layoutParams).f4723a % 2 == 0) {
                    rect.left = C23486n.m77122a((double) this.f75795a);
                    double d = (double) this.f75795a;
                    Double.isNaN(d);
                    rect.right = C23486n.m77122a(d / 2.0d);
                } else {
                    double d2 = (double) this.f75795a;
                    Double.isNaN(d2);
                    rect.left = C23486n.m77122a(d2 / 2.0d);
                    rect.right = C23486n.m77122a((double) this.f75795a);
                }
                if (C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) == 5) {
                    double d3 = (double) this.f75795a;
                    Double.isNaN(d3);
                    rect.bottom = C23486n.m77122a(d3 - 3.0d);
                    if ((adapter == null || adapter.getItemViewType(0) != 0) && f == 1) {
                        rect.top = C23486n.m77122a(3.0d);
                        return;
                    }
                } else {
                    rect.bottom = C23486n.m77122a((double) this.f75795a);
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager.LayoutParams");
        }
    }
}
