package com.p280ss.android.ugc.aweme.poi.nearby.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.adapter.CardStaggeredGridItemDecoration */
public final class CardStaggeredGridItemDecoration extends StaggeredGridItemDecoration {

    /* renamed from: a */
    public int f91896a = 8;

    public CardStaggeredGridItemDecoration(int i, int i2) {
        super(8);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (!(view instanceof C35130a)) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo6015e() % 2 == 0) {
                    rect.left = C23486n.m77122a((double) this.f91896a);
                    double d = (double) this.f91896a;
                    Double.isNaN(d);
                    rect.right = C23486n.m77122a(d / 2.0d);
                } else {
                    double d2 = (double) this.f91896a;
                    Double.isNaN(d2);
                    rect.left = C23486n.m77122a(d2 / 2.0d);
                    rect.right = C23486n.m77122a((double) this.f91896a);
                }
                rect.top = C23486n.m77122a((double) this.f91896a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
        }
    }
}
