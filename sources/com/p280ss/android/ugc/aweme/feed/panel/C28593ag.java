package com.p280ss.android.ugc.aweme.feed.panel;

import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.poi.nearby.adapter.CardStaggeredGridItemDecoration;
import com.p280ss.android.ugc.aweme.poi.nearby.adapter.StaggeredGridItemDecoration;
import com.p280ss.android.ugc.aweme.profile.p1487ui.WrapStaggeredGridLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.ag */
public final class C28593ag extends CellFeedFragmentPanel {
    /* renamed from: i */
    public final boolean mo73301i() {
        return true;
    }

    /* renamed from: e */
    public final C1273i mo73297e() {
        WrapStaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(2, 1);
        wrapStaggeredGridLayoutManager.mo5427b(0);
        return wrapStaggeredGridLayoutManager;
    }

    /* renamed from: f */
    public final C1272h mo73298f() {
        if (this.f75273l == 15 && C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) == 3) {
            return new CardStaggeredGridItemDecoration(8, 8);
        }
        return new StaggeredGridItemDecoration(8);
    }

    public C28593ag(String str, C23685d dVar, C28532n nVar, int i) {
        super(str, dVar, nVar, i);
    }
}
