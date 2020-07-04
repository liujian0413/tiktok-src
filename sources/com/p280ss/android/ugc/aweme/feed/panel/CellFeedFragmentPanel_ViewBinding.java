package com.p280ss.android.ugc.aweme.feed.panel;

import android.view.View;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel_ViewBinding */
public class CellFeedFragmentPanel_ViewBinding extends AbsCellFeedFragmentPanel_ViewBinding {

    /* renamed from: a */
    private CellFeedFragmentPanel f75275a;

    public void unbind() {
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f75275a;
        if (cellFeedFragmentPanel != null) {
            this.f75275a = null;
            cellFeedFragmentPanel.mRefreshLayout = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CellFeedFragmentPanel_ViewBinding(CellFeedFragmentPanel cellFeedFragmentPanel, View view) {
        super(cellFeedFragmentPanel, view);
        this.f75275a = cellFeedFragmentPanel;
        cellFeedFragmentPanel.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.cr7, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    }
}
