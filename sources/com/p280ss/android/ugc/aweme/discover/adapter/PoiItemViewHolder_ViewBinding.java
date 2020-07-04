package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder_ViewBinding */
public class PoiItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiItemViewHolder f69558a;

    public void unbind() {
        PoiItemViewHolder poiItemViewHolder = this.f69558a;
        if (poiItemViewHolder != null) {
            this.f69558a = null;
            poiItemViewHolder.spaceView = null;
            poiItemViewHolder.mPoiImg = null;
            poiItemViewHolder.mPoiImgPlaceHolder = null;
            poiItemViewHolder.mPoiName = null;
            poiItemViewHolder.mPoiPerPrice = null;
            poiItemViewHolder.mPoiRankDesc = null;
            poiItemViewHolder.mPoiOption = null;
            poiItemViewHolder.mSecondCutLine = null;
            poiItemViewHolder.mPoiType = null;
            poiItemViewHolder.mPoiDistance = null;
            poiItemViewHolder.mPoiCouponContainer = null;
            poiItemViewHolder.mPoiCouponDesc = null;
            poiItemViewHolder.mPoiSpuOverDate = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiItemViewHolder_ViewBinding(PoiItemViewHolder poiItemViewHolder, View view) {
        this.f69558a = poiItemViewHolder;
        poiItemViewHolder.spaceView = Utils.findRequiredView(view, R.id.d8v, "field 'spaceView'");
        poiItemViewHolder.mPoiImg = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.cf9, "field 'mPoiImg'", SmartImageView.class);
        poiItemViewHolder.mPoiImgPlaceHolder = (ImageView) Utils.findRequiredViewAsType(view, R.id.cfa, "field 'mPoiImgPlaceHolder'", ImageView.class);
        poiItemViewHolder.mPoiName = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cfk, "field 'mPoiName'", DmtTextView.class);
        poiItemViewHolder.mPoiPerPrice = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cfn, "field 'mPoiPerPrice'", DmtTextView.class);
        poiItemViewHolder.mPoiRankDesc = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cft, "field 'mPoiRankDesc'", DmtTextView.class);
        poiItemViewHolder.mPoiOption = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cfl, "field 'mPoiOption'", DmtTextView.class);
        poiItemViewHolder.mSecondCutLine = Utils.findRequiredView(view, R.id.d1n, "field 'mSecondCutLine'");
        poiItemViewHolder.mPoiType = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.chl, "field 'mPoiType'", DmtTextView.class);
        poiItemViewHolder.mPoiDistance = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cew, "field 'mPoiDistance'", DmtTextView.class);
        poiItemViewHolder.mPoiCouponContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.a40, "field 'mPoiCouponContainer'", ViewGroup.class);
        poiItemViewHolder.mPoiCouponDesc = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.a41, "field 'mPoiCouponDesc'", DmtTextView.class);
        poiItemViewHolder.mPoiSpuOverDate = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.ch6, "field 'mPoiSpuOverDate'", DmtTextView.class);
    }
}
