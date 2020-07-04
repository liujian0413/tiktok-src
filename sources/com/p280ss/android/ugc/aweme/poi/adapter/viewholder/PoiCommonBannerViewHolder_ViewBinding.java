package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p280ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder_ViewBinding */
public class PoiCommonBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiCommonBannerViewHolder f91504a;

    public void unbind() {
        PoiCommonBannerViewHolder poiCommonBannerViewHolder = this.f91504a;
        if (poiCommonBannerViewHolder != null) {
            this.f91504a = null;
            poiCommonBannerViewHolder.mViewPager = null;
            poiCommonBannerViewHolder.mIndicator = null;
            poiCommonBannerViewHolder.mDividerBottom = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiCommonBannerViewHolder_ViewBinding(PoiCommonBannerViewHolder poiCommonBannerViewHolder, View view) {
        this.f91504a = poiCommonBannerViewHolder;
        poiCommonBannerViewHolder.mViewPager = (BannerViewPager) Utils.findRequiredViewAsType(view, R.id.cd6, "field 'mViewPager'", BannerViewPager.class);
        poiCommonBannerViewHolder.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, R.id.cd4, "field 'mIndicator'", IndicatorView.class);
        poiCommonBannerViewHolder.mDividerBottom = Utils.findRequiredView(view, R.id.cd3, "field 'mDividerBottom'");
    }
}
