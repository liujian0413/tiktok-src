package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder_ViewBinding */
public class HotSearchImageViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotSearchImageViewHolder f69514a;

    public void unbind() {
        HotSearchImageViewHolder hotSearchImageViewHolder = this.f69514a;
        if (hotSearchImageViewHolder != null) {
            this.f69514a = null;
            hotSearchImageViewHolder.mHotSearchBoardView = null;
            hotSearchImageViewHolder.mHotSearchCardView = null;
            hotSearchImageViewHolder.mTitle = null;
            hotSearchImageViewHolder.mViewMoreTextView = null;
            hotSearchImageViewHolder.ivMore = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotSearchImageViewHolder_ViewBinding(HotSearchImageViewHolder hotSearchImageViewHolder, View view) {
        this.f69514a = hotSearchImageViewHolder;
        hotSearchImageViewHolder.mHotSearchBoardView = Utils.findRequiredView(view, R.id.bsx, "field 'mHotSearchBoardView'");
        hotSearchImageViewHolder.mHotSearchCardView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cxd, "field 'mHotSearchCardView'", RecyclerView.class);
        hotSearchImageViewHolder.mTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e3f, "field 'mTitle'", DmtTextView.class);
        hotSearchImageViewHolder.mViewMoreTextView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dvu, "field 'mViewMoreTextView'", DmtTextView.class);
        hotSearchImageViewHolder.ivMore = (ImageView) Utils.findRequiredViewAsType(view, R.id.baa, "field 'ivMore'", ImageView.class);
    }
}
