package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder_ViewBinding */
public class PoiCateTitleViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiCateTitleViewHolder f91496a;

    public void unbind() {
        PoiCateTitleViewHolder poiCateTitleViewHolder = this.f91496a;
        if (poiCateTitleViewHolder != null) {
            this.f91496a = null;
            poiCateTitleViewHolder.mTxtTitle = null;
            poiCateTitleViewHolder.mMoreTxt = null;
            poiCateTitleViewHolder.mMoreArrow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiCateTitleViewHolder_ViewBinding(PoiCateTitleViewHolder poiCateTitleViewHolder, View view) {
        this.f91496a = poiCateTitleViewHolder;
        poiCateTitleViewHolder.mTxtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.cde, "field 'mTxtTitle'", TextView.class);
        poiCateTitleViewHolder.mMoreTxt = Utils.findRequiredView(view, R.id.cdc, "field 'mMoreTxt'");
        poiCateTitleViewHolder.mMoreArrow = Utils.findRequiredView(view, R.id.cdd, "field 'mMoreArrow'");
    }
}
