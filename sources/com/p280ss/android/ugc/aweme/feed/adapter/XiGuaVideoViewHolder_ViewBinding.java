package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.XiGuaVideoViewHolder_ViewBinding */
public final class XiGuaVideoViewHolder_ViewBinding extends VideoViewHolder_ViewBinding {

    /* renamed from: a */
    private XiGuaVideoViewHolder f74195a;

    public final void unbind() {
        XiGuaVideoViewHolder xiGuaVideoViewHolder = this.f74195a;
        if (xiGuaVideoViewHolder != null) {
            this.f74195a = null;
            xiGuaVideoViewHolder.mXiaGuaTag = null;
            xiGuaVideoViewHolder.mAvatarPlace = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public XiGuaVideoViewHolder_ViewBinding(XiGuaVideoViewHolder xiGuaVideoViewHolder, View view) {
        super(xiGuaVideoViewHolder, view);
        this.f74195a = xiGuaVideoViewHolder;
        xiGuaVideoViewHolder.mXiaGuaTag = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ajl, "field 'mXiaGuaTag'", FrameLayout.class);
        xiGuaVideoViewHolder.mAvatarPlace = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ec2, "field 'mAvatarPlace'", FrameLayout.class);
    }
}
