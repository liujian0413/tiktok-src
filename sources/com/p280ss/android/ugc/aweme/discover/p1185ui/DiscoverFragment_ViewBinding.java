package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverFragment_ViewBinding */
public class DiscoverFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DiscoverFragment f70942a;

    /* renamed from: b */
    private View f70943b;

    /* renamed from: c */
    private View f70944c;

    public void unbind() {
        DiscoverFragment discoverFragment = this.f70942a;
        if (discoverFragment != null) {
            this.f70942a = null;
            discoverFragment.mFlRootContainer = null;
            discoverFragment.mListView = null;
            discoverFragment.mRefreshLayout = null;
            discoverFragment.mStatusBar = null;
            discoverFragment.mStatusView = null;
            this.f70943b.setOnClickListener(null);
            this.f70943b = null;
            this.f70944c.setOnClickListener(null);
            this.f70944c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DiscoverFragment_ViewBinding(final DiscoverFragment discoverFragment, View view) {
        this.f70942a = discoverFragment;
        discoverFragment.mFlRootContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.amt, "field 'mFlRootContainer'", RelativeLayout.class);
        discoverFragment.mListView = (DiscoveryRecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mListView'", DiscoveryRecyclerView.class);
        discoverFragment.mRefreshLayout = (BannerSwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.p6, "field 'mRefreshLayout'", BannerSwipeRefreshLayout.class);
        discoverFragment.mStatusBar = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBar'");
        discoverFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.amy, "method 'onClick'");
        this.f70943b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                discoverFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e19, "method 'onClick'");
        this.f70944c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                discoverFragment.onClick(view);
            }
        });
    }
}
