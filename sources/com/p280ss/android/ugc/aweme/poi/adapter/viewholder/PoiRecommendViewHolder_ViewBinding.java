package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder_ViewBinding */
public class PoiRecommendViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiRecommendViewHolder f91621a;

    public void unbind() {
        PoiRecommendViewHolder poiRecommendViewHolder = this.f91621a;
        if (poiRecommendViewHolder != null) {
            this.f91621a = null;
            poiRecommendViewHolder.mRecommendLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiRecommendViewHolder_ViewBinding(PoiRecommendViewHolder poiRecommendViewHolder, View view) {
        this.f91621a = poiRecommendViewHolder;
        poiRecommendViewHolder.mRecommendLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cdu, "field 'mRecommendLayout'", LinearLayout.class);
    }
}
