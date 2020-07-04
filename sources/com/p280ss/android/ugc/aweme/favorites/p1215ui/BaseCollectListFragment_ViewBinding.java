package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.BaseCollectListFragment_ViewBinding */
public class BaseCollectListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseCollectListFragment f73223a;

    public void unbind() {
        BaseCollectListFragment baseCollectListFragment = this.f73223a;
        if (baseCollectListFragment != null) {
            this.f73223a = null;
            baseCollectListFragment.mListView = null;
            baseCollectListFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseCollectListFragment_ViewBinding(BaseCollectListFragment baseCollectListFragment, View view) {
        this.f73223a = baseCollectListFragment;
        baseCollectListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.y4, "field 'mListView'", RecyclerView.class);
        baseCollectListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
    }
}
