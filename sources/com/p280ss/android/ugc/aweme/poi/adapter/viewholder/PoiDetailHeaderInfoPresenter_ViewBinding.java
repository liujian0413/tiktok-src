package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.poi.widget.PoiLabelsLayout;
import com.p280ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p280ss.android.ugc.aweme.poi.widget.TextAppendViewLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter_ViewBinding */
public class PoiDetailHeaderInfoPresenter_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiDetailHeaderInfoPresenter f91520a;

    public void unbind() {
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = this.f91520a;
        if (poiDetailHeaderInfoPresenter != null) {
            this.f91520a = null;
            poiDetailHeaderInfoPresenter.mPoiName = null;
            poiDetailHeaderInfoPresenter.mPoiPrice = null;
            poiDetailHeaderInfoPresenter.mPoiVisitor = null;
            poiDetailHeaderInfoPresenter.mPoiRating = null;
            poiDetailHeaderInfoPresenter.mPoiRatingBar = null;
            poiDetailHeaderInfoPresenter.mPoiRatingTxt = null;
            poiDetailHeaderInfoPresenter.mPoiCollectImg = null;
            poiDetailHeaderInfoPresenter.mPoiCollectLayout = null;
            poiDetailHeaderInfoPresenter.mPoiSubType = null;
            poiDetailHeaderInfoPresenter.mPoiDetails = null;
            poiDetailHeaderInfoPresenter.mPoiRatingLayout = null;
            poiDetailHeaderInfoPresenter.mLocalLayout = null;
            poiDetailHeaderInfoPresenter.mPoiNameLayout = null;
            poiDetailHeaderInfoPresenter.mPoiCollectContent = null;
            poiDetailHeaderInfoPresenter.mPoiOpenTimeTxt = null;
            poiDetailHeaderInfoPresenter.mNewLineLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDetailHeaderInfoPresenter_ViewBinding(PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter, View view) {
        this.f91520a = poiDetailHeaderInfoPresenter;
        poiDetailHeaderInfoPresenter.mPoiName = (TextView) Utils.findRequiredViewAsType(view, R.id.ce5, "field 'mPoiName'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiPrice = (TextView) Utils.findRequiredViewAsType(view, R.id.cea, "field 'mPoiPrice'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiVisitor = (TextView) Utils.findRequiredViewAsType(view, R.id.ceg, "field 'mPoiVisitor'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiRating = Utils.findRequiredView(view, R.id.ceb, "field 'mPoiRating'");
        poiDetailHeaderInfoPresenter.mPoiRatingBar = (RatingBar) Utils.findRequiredViewAsType(view, R.id.cec, "field 'mPoiRatingBar'", RatingBar.class);
        poiDetailHeaderInfoPresenter.mPoiRatingTxt = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cee, "field 'mPoiRatingTxt'", DmtTextView.class);
        poiDetailHeaderInfoPresenter.mPoiCollectImg = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.cdz, "field 'mPoiCollectImg'", CheckableImageView.class);
        poiDetailHeaderInfoPresenter.mPoiCollectLayout = Utils.findRequiredView(view, R.id.ce0, "field 'mPoiCollectLayout'");
        poiDetailHeaderInfoPresenter.mPoiSubType = (TextView) Utils.findRequiredViewAsType(view, R.id.cef, "field 'mPoiSubType'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiDetails = (PoiLabelsLayout) Utils.findRequiredViewAsType(view, R.id.ce2, "field 'mPoiDetails'", PoiLabelsLayout.class);
        poiDetailHeaderInfoPresenter.mPoiRatingLayout = Utils.findRequiredView(view, R.id.ced, "field 'mPoiRatingLayout'");
        poiDetailHeaderInfoPresenter.mLocalLayout = Utils.findRequiredView(view, R.id.ce4, "field 'mLocalLayout'");
        poiDetailHeaderInfoPresenter.mPoiNameLayout = Utils.findRequiredView(view, R.id.cei, "field 'mPoiNameLayout'");
        poiDetailHeaderInfoPresenter.mPoiCollectContent = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.ce1, "field 'mPoiCollectContent'", DmtTextView.class);
        poiDetailHeaderInfoPresenter.mPoiOpenTimeTxt = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cej, "field 'mPoiOpenTimeTxt'", DmtTextView.class);
        poiDetailHeaderInfoPresenter.mNewLineLayout = (TextAppendViewLayout) Utils.findRequiredViewAsType(view, R.id.c3z, "field 'mNewLineLayout'", TextAppendViewLayout.class);
    }
}
