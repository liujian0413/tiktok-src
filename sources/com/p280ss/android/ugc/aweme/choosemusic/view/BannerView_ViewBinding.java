package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.support.p022v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.BannerView_ViewBinding */
public class BannerView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BannerView f63257a;

    public void unbind() {
        BannerView bannerView = this.f63257a;
        if (bannerView != null) {
            this.f63257a = null;
            bannerView.mViewPager = null;
            bannerView.mIndicator = null;
            bannerView.mStatusBar = null;
            bannerView.mBannerLayout = null;
            bannerView.mLlBannerContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BannerView_ViewBinding(BannerView bannerView, View view) {
        this.f63257a = bannerView;
        bannerView.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.edp, "field 'mViewPager'", ViewPager.class);
        bannerView.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, R.id.a_k, "field 'mIndicator'", IndicatorView.class);
        bannerView.mStatusBar = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBar'");
        bannerView.mBannerLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.kd, "field 'mBannerLayout'", RelativeLayout.class);
        bannerView.mLlBannerContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.br6, "field 'mLlBannerContainer'", ViewGroup.class);
    }
}
