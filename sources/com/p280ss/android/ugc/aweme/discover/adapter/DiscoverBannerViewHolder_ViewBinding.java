package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p022v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder_ViewBinding */
public class DiscoverBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DiscoverBannerViewHolder f69470a;

    public void unbind() {
        DiscoverBannerViewHolder discoverBannerViewHolder = this.f69470a;
        if (discoverBannerViewHolder != null) {
            this.f69470a = null;
            discoverBannerViewHolder.mTitle = null;
            discoverBannerViewHolder.mViewPager = null;
            discoverBannerViewHolder.mIndicator = null;
            discoverBannerViewHolder.mStatusBar = null;
            discoverBannerViewHolder.mBannerLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DiscoverBannerViewHolder_ViewBinding(DiscoverBannerViewHolder discoverBannerViewHolder, View view) {
        this.f69470a = discoverBannerViewHolder;
        discoverBannerViewHolder.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.dtg, "field 'mTitle'", TextView.class);
        discoverBannerViewHolder.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.edp, "field 'mViewPager'", ViewPager.class);
        discoverBannerViewHolder.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, R.id.a_k, "field 'mIndicator'", IndicatorView.class);
        discoverBannerViewHolder.mStatusBar = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBar'");
        discoverBannerViewHolder.mBannerLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.kd, "field 'mBannerLayout'", RelativeLayout.class);
    }
}
