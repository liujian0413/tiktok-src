package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.AbsCommonHeaderView$updateHorizontalSlide$1 */
public final class AbsCommonHeaderView$updateHorizontalSlide$1 extends C1272h {
    AbsCommonHeaderView$updateHorizontalSlide$1() {
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        int f = RecyclerView.m5892f(view);
        if (f == 0) {
            rect.left = C23486n.m77122a(16.0d);
        }
        C1262a adapter = recyclerView.getAdapter();
        if (adapter == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) adapter, "parent.adapter!!");
        if (f == adapter.getItemCount() - 1) {
            rect.right = C23486n.m77122a(16.0d);
        } else {
            rect.right = C23486n.m77122a(4.0d);
        }
    }
}
