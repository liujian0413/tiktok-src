package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder_ViewBinding */
public class PoiBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiBannerViewHolder f91485a;

    public void unbind() {
        PoiBannerViewHolder poiBannerViewHolder = this.f91485a;
        if (poiBannerViewHolder != null) {
            this.f91485a = null;
            poiBannerViewHolder.mSdCover = null;
            poiBannerViewHolder.mWaterMark = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiBannerViewHolder_ViewBinding(PoiBannerViewHolder poiBannerViewHolder, View view) {
        this.f91485a = poiBannerViewHolder;
        poiBannerViewHolder.mSdCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.czm, "field 'mSdCover'", RemoteImageView.class);
        poiBannerViewHolder.mWaterMark = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.efy, "field 'mWaterMark'", DmtTextView.class);
    }
}
