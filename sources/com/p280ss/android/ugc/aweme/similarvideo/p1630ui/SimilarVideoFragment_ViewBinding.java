package com.p280ss.android.ugc.aweme.similarvideo.p1630ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.common.widget.ZeusFrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment_ViewBinding */
public class SimilarVideoFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SimilarVideoFragment f108611a;

    public void unbind() {
        SimilarVideoFragment similarVideoFragment = this.f108611a;
        if (similarVideoFragment != null) {
            this.f108611a = null;
            similarVideoFragment.mRecyclerView = null;
            similarVideoFragment.mLayout = null;
            similarVideoFragment.mStatusView = null;
            similarVideoFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SimilarVideoFragment_ViewBinding(SimilarVideoFragment similarVideoFragment, View view) {
        this.f108611a = similarVideoFragment;
        similarVideoFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mRecyclerView'", RecyclerView.class);
        similarVideoFragment.mLayout = (ZeusFrameLayout) Utils.findRequiredViewAsType(view, R.id.bnb, "field 'mLayout'", ZeusFrameLayout.class);
        similarVideoFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dag, "field 'mStatusView'", DmtStatusView.class);
        similarVideoFragment.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.cr7, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    }
}
