package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2_ViewBinding */
public class HotSearchAndDiscoveryFragment2_ViewBinding extends BaseDiscoveryAndSearchFragment_ViewBinding {

    /* renamed from: a */
    private HotSearchAndDiscoveryFragment2 f71005a;

    public void unbind() {
        HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2 = this.f71005a;
        if (hotSearchAndDiscoveryFragment2 != null) {
            this.f71005a = null;
            hotSearchAndDiscoveryFragment2.loftNestedRefreshLayout = null;
            hotSearchAndDiscoveryFragment2.mTopStatus = null;
            hotSearchAndDiscoveryFragment2.mSearchContainer = null;
            hotSearchAndDiscoveryFragment2.mSearchScanView = null;
            hotSearchAndDiscoveryFragment2.mSearchScanViewRight = null;
            hotSearchAndDiscoveryFragment2.mRightBackBtn = null;
            hotSearchAndDiscoveryFragment2.mHotSearchFlipperView = null;
            hotSearchAndDiscoveryFragment2.mRightSearchView = null;
            hotSearchAndDiscoveryFragment2.mFragmentContainer = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotSearchAndDiscoveryFragment2_ViewBinding(HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2, View view) {
        super(hotSearchAndDiscoveryFragment2, view);
        this.f71005a = hotSearchAndDiscoveryFragment2;
        hotSearchAndDiscoveryFragment2.loftNestedRefreshLayout = (LoftNestedRefreshLayout) Utils.findRequiredViewAsType(view, R.id.bv9, "field 'loftNestedRefreshLayout'", LoftNestedRefreshLayout.class);
        hotSearchAndDiscoveryFragment2.mTopStatus = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.dms, "field 'mTopStatus'", ViewGroup.class);
        hotSearchAndDiscoveryFragment2.mSearchContainer = Utils.findRequiredView(view, R.id.cu7, "field 'mSearchContainer'");
        hotSearchAndDiscoveryFragment2.mSearchScanView = (SearchScanView) Utils.findRequiredViewAsType(view, R.id.d1g, "field 'mSearchScanView'", SearchScanView.class);
        hotSearchAndDiscoveryFragment2.mSearchScanViewRight = (SearchScanView) Utils.findRequiredViewAsType(view, R.id.d1h, "field 'mSearchScanViewRight'", SearchScanView.class);
        hotSearchAndDiscoveryFragment2.mRightBackBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.jt, "field 'mRightBackBtn'", ImageView.class);
        hotSearchAndDiscoveryFragment2.mHotSearchFlipperView = (HotSearchWordsFlipperView) Utils.findRequiredViewAsType(view, R.id.awp, "field 'mHotSearchFlipperView'", HotSearchWordsFlipperView.class);
        hotSearchAndDiscoveryFragment2.mRightSearchView = Utils.findRequiredView(view, R.id.ct8, "field 'mRightSearchView'");
        hotSearchAndDiscoveryFragment2.mFragmentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.aoy, "field 'mFragmentContainer'", ViewGroup.class);
    }
}
