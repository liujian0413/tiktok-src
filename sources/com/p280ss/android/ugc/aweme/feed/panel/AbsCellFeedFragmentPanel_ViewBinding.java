package com.p280ss.android.ugc.aweme.feed.panel;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.AbsCellFeedFragmentPanel_ViewBinding */
public class AbsCellFeedFragmentPanel_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsCellFeedFragmentPanel f75267a;

    public void unbind() {
        AbsCellFeedFragmentPanel absCellFeedFragmentPanel = this.f75267a;
        if (absCellFeedFragmentPanel != null) {
            this.f75267a = null;
            absCellFeedFragmentPanel.mStatusView = null;
            absCellFeedFragmentPanel.mListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsCellFeedFragmentPanel_ViewBinding(AbsCellFeedFragmentPanel absCellFeedFragmentPanel, View view) {
        this.f75267a = absCellFeedFragmentPanel;
        absCellFeedFragmentPanel.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        absCellFeedFragmentPanel.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mListView'", RecyclerView.class);
    }
}
