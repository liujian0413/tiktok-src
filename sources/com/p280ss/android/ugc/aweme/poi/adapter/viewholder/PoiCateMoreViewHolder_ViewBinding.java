package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder_ViewBinding */
public class PoiCateMoreViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiCateMoreViewHolder f91491a;

    public void unbind() {
        PoiCateMoreViewHolder poiCateMoreViewHolder = this.f91491a;
        if (poiCateMoreViewHolder != null) {
            this.f91491a = null;
            poiCateMoreViewHolder.mTxtMore = null;
            poiCateMoreViewHolder.mDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiCateMoreViewHolder_ViewBinding(PoiCateMoreViewHolder poiCateMoreViewHolder, View view) {
        this.f91491a = poiCateMoreViewHolder;
        poiCateMoreViewHolder.mTxtMore = (TextView) Utils.findRequiredViewAsType(view, R.id.cdc, "field 'mTxtMore'", TextView.class);
        poiCateMoreViewHolder.mDivider = Utils.findRequiredView(view, R.id.cdb, "field 'mDivider'");
    }
}
