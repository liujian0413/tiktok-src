package com.p280ss.android.ugc.aweme.poi.p335ui.detail;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.poi.p335ui.AbsSlidablePoiAwemeFeedFragment_ViewBinding;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.AppBarLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment_ViewBinding */
public class PoiDetailWithoutMapFragment_ViewBinding extends AbsSlidablePoiAwemeFeedFragment_ViewBinding {

    /* renamed from: a */
    private PoiDetailWithoutMapFragment f92585a;

    public void unbind() {
        PoiDetailWithoutMapFragment poiDetailWithoutMapFragment = this.f92585a;
        if (poiDetailWithoutMapFragment != null) {
            this.f92585a = null;
            poiDetailWithoutMapFragment.mAppBarLayout = null;
            poiDetailWithoutMapFragment.mRecyclerView = null;
            poiDetailWithoutMapFragment.mRootLayout = null;
            poiDetailWithoutMapFragment.mTopbarDivider = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDetailWithoutMapFragment_ViewBinding(PoiDetailWithoutMapFragment poiDetailWithoutMapFragment, View view) {
        super(poiDetailWithoutMapFragment, view);
        this.f92585a = poiDetailWithoutMapFragment;
        poiDetailWithoutMapFragment.mAppBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, R.id.gl, "field 'mAppBarLayout'", AppBarLayout.class);
        poiDetailWithoutMapFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mRecyclerView'", RecyclerView.class);
        poiDetailWithoutMapFragment.mRootLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.bjh, "field 'mRootLayout'", RelativeLayout.class);
        poiDetailWithoutMapFragment.mTopbarDivider = Utils.findRequiredView(view, R.id.dkb, "field 'mTopbarDivider'");
    }
}
