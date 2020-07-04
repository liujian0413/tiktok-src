package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder_ViewBinding */
public class PoiDcdProductInfoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiDcdProductInfoViewHolder f91511a;

    public void unbind() {
        PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder = this.f91511a;
        if (poiDcdProductInfoViewHolder != null) {
            this.f91511a = null;
            poiDcdProductInfoViewHolder.mTitle = null;
            poiDcdProductInfoViewHolder.mAllProduct = null;
            poiDcdProductInfoViewHolder.mAllProductContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDcdProductInfoViewHolder_ViewBinding(PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder, View view) {
        this.f91511a = poiDcdProductInfoViewHolder;
        poiDcdProductInfoViewHolder.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.b4j, "field 'mTitle'", TextView.class);
        poiDcdProductInfoViewHolder.mAllProduct = (TextView) Utils.findRequiredViewAsType(view, R.id.b4c, "field 'mAllProduct'", TextView.class);
        poiDcdProductInfoViewHolder.mAllProductContainer = Utils.findRequiredView(view, R.id.b4b, "field 'mAllProductContainer'");
    }
}
