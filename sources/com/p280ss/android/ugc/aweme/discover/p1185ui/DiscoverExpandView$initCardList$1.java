package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.discover.adapter.DiscoverExpandAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverExpandView$initCardList$1 */
public final class DiscoverExpandView$initCardList$1 extends C1272h {

    /* renamed from: a */
    final /* synthetic */ C27040f f70914a;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        int f = RecyclerView.m5892f(view);
        DiscoverExpandAdapter discoverExpandAdapter = this.f70914a.f71348e;
        if (discoverExpandAdapter != null) {
            i = discoverExpandAdapter.getItemCount();
        } else {
            i = 0;
        }
        if (f == i - 1) {
            rect.bottom = (int) C9738o.m28708b(this.f70914a.getContext(), 14.0f);
        } else {
            rect.bottom = (int) C9738o.m28708b(this.f70914a.getContext(), C27049g.m88808b());
        }
    }
}
