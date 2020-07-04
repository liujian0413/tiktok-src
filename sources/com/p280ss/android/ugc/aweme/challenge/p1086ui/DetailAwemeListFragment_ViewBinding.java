package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment_ViewBinding */
public class DetailAwemeListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DetailAwemeListFragment f62618a;

    public void unbind() {
        DetailAwemeListFragment detailAwemeListFragment = this.f62618a;
        if (detailAwemeListFragment != null) {
            this.f62618a = null;
            detailAwemeListFragment.mListView = null;
            detailAwemeListFragment.mStatusView = null;
            detailAwemeListFragment.mStatusViewContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DetailAwemeListFragment_ViewBinding(DetailAwemeListFragment detailAwemeListFragment, View view) {
        this.f62618a = detailAwemeListFragment;
        detailAwemeListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.ajd, "field 'mListView'", RecyclerView.class);
        detailAwemeListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        detailAwemeListFragment.mStatusViewContainer = (FrameLayout) Utils.findOptionalViewAsType(view, R.id.daw, "field 'mStatusViewContainer'", FrameLayout.class);
    }
}
