package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer;

import android.graphics.Rect;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerItemDecoration */
public final class MaskLayerItemDecoration extends C1272h {

    /* renamed from: a */
    private final int f76248a;

    /* renamed from: b */
    private final int f76249b;

    public MaskLayerItemDecoration(int i, int i2) {
        this.f76248a = i;
        this.f76249b = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            if (RecyclerView.m5892f(view) == linearLayoutManager.mo5744A() - 1) {
                i = 0;
            } else {
                i = C23486n.m77122a((double) this.f76249b);
            }
            switch (this.f76248a) {
                case 0:
                    rect.right = i;
                    break;
                case 1:
                    rect.bottom = i;
                    return;
            }
        }
    }
}
