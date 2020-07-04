package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.support.p029v7.widget.AppCompatImageView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.StickerCollectViewHolder_ViewBinding */
public class StickerCollectViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerCollectViewHolder f73391a;

    public void unbind() {
        StickerCollectViewHolder stickerCollectViewHolder = this.f73391a;
        if (stickerCollectViewHolder != null) {
            this.f73391a = null;
            stickerCollectViewHolder.ivCover = null;
            stickerCollectViewHolder.tvStickerName = null;
            stickerCollectViewHolder.tvDesigner = null;
            stickerCollectViewHolder.tvUserCount = null;
            stickerCollectViewHolder.ivRecord = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerCollectViewHolder_ViewBinding(StickerCollectViewHolder stickerCollectViewHolder, View view) {
        this.f73391a = stickerCollectViewHolder;
        stickerCollectViewHolder.ivCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.czm, "field 'ivCover'", RemoteImageView.class);
        stickerCollectViewHolder.tvStickerName = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e2o, "field 'tvStickerName'", DmtTextView.class);
        stickerCollectViewHolder.tvDesigner = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dt9, "field 'tvDesigner'", DmtTextView.class);
        stickerCollectViewHolder.tvUserCount = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e4f, "field 'tvUserCount'", DmtTextView.class);
        stickerCollectViewHolder.ivRecord = (AppCompatImageView) Utils.findRequiredViewAsType(view, R.id.bbf, "field 'ivRecord'", AppCompatImageView.class);
    }
}
