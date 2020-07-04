package com.p280ss.android.ugc.trill.language;

import android.graphics.Rect;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.poi.nearby.adapter.C35130a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.trill.language.ItemDecoration */
public final class ItemDecoration extends C1272h {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        if (!(view instanceof C35130a)) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (((GridLayoutManager.LayoutParams) layoutParams).f4723a % 2 != 0) {
                    rect.left = C23486n.m77122a(4.0d);
                } else {
                    rect.right = C23486n.m77122a(4.0d);
                }
                rect.bottom = C23486n.m77122a(8.0d);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager.LayoutParams");
        }
    }
}
