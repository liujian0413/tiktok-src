package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.PoiDetailViewHolder_ViewBinding */
public class PoiDetailViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiDetailViewHolder f74008a;

    public void unbind() {
        PoiDetailViewHolder poiDetailViewHolder = this.f74008a;
        if (poiDetailViewHolder != null) {
            this.f74008a = null;
            poiDetailViewHolder.txtDesc = null;
            poiDetailViewHolder.txtLikeCount = null;
            poiDetailViewHolder.authorAvatar = null;
            poiDetailViewHolder.txtAuthorName = null;
            poiDetailViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDetailViewHolder_ViewBinding(PoiDetailViewHolder poiDetailViewHolder, View view) {
        this.f74008a = poiDetailViewHolder;
        poiDetailViewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.a7e, "field 'txtDesc'", TextView.class);
        poiDetailViewHolder.txtLikeCount = (TextView) Utils.findRequiredViewAsType(view, R.id.blt, "field 'txtLikeCount'", TextView.class);
        poiDetailViewHolder.authorAvatar = (SmartCircleImageView) Utils.findRequiredViewAsType(view, R.id.hv, "field 'authorAvatar'", SmartCircleImageView.class);
        poiDetailViewHolder.txtAuthorName = (TextView) Utils.findRequiredViewAsType(view, R.id.hx, "field 'txtAuthorName'", TextView.class);
        poiDetailViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.dg3, "field 'tagLayout'", TagLayout.class);
    }
}
