package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedTimeLineFragment_ViewBinding */
public class FeedTimeLineFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedTimeLineFragment f75705a;

    public void unbind() {
        FeedTimeLineFragment feedTimeLineFragment = this.f75705a;
        if (feedTimeLineFragment != null) {
            this.f75705a = null;
            feedTimeLineFragment.mFlRootContanier = null;
            feedTimeLineFragment.mStatusView = null;
            feedTimeLineFragment.mVTabBg = null;
            feedTimeLineFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedTimeLineFragment_ViewBinding(FeedTimeLineFragment feedTimeLineFragment, View view) {
        this.f75705a = feedTimeLineFragment;
        feedTimeLineFragment.mFlRootContanier = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.amu, "field 'mFlRootContanier'", ViewGroup.class);
        feedTimeLineFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        feedTimeLineFragment.mVTabBg = Utils.findRequiredView(view, R.id.e_i, "field 'mVTabBg'");
        feedTimeLineFragment.mRefreshLayout = (FeedSwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.cr7, "field 'mRefreshLayout'", FeedSwipeRefreshLayout.class);
    }
}
