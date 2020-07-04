package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductViewHolder_ViewBinding */
public class PoiDcdProductViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiDcdProductViewHolder f91512a;

    public void unbind() {
        PoiDcdProductViewHolder poiDcdProductViewHolder = this.f91512a;
        if (poiDcdProductViewHolder != null) {
            this.f91512a = null;
            poiDcdProductViewHolder.mImage = null;
            poiDcdProductViewHolder.mName = null;
            poiDcdProductViewHolder.mPrice = null;
            poiDcdProductViewHolder.mSalesPromotion = null;
            poiDcdProductViewHolder.mSubmitButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDcdProductViewHolder_ViewBinding(PoiDcdProductViewHolder poiDcdProductViewHolder, View view) {
        this.f91512a = poiDcdProductViewHolder;
        poiDcdProductViewHolder.mImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b4e, "field 'mImage'", RemoteImageView.class);
        poiDcdProductViewHolder.mName = (TextView) Utils.findRequiredViewAsType(view, R.id.b4f, "field 'mName'", TextView.class);
        poiDcdProductViewHolder.mPrice = (TextView) Utils.findRequiredViewAsType(view, R.id.b4g, "field 'mPrice'", TextView.class);
        poiDcdProductViewHolder.mSalesPromotion = (TextView) Utils.findRequiredViewAsType(view, R.id.b4h, "field 'mSalesPromotion'", TextView.class);
        poiDcdProductViewHolder.mSubmitButton = (TextView) Utils.findRequiredViewAsType(view, R.id.b4i, "field 'mSubmitButton'", TextView.class);
    }
}
