package com.p280ss.android.ugc.aweme.discover.widget;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.DiscoverItemDecoration */
public final class DiscoverItemDecoration extends C1272h {

    /* renamed from: a */
    private int f71791a = C23486n.m77122a(7.0d);

    /* renamed from: b */
    private int f71792b = C23486n.m77122a(6.0d);

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        rect.set(this.f71792b, this.f71791a, this.f71792b, this.f71791a);
    }
}
