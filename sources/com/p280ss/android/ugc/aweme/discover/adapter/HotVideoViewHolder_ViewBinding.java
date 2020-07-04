package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder_ViewBinding */
public class HotVideoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotVideoViewHolder f69537a;

    public void unbind() {
        HotVideoViewHolder hotVideoViewHolder = this.f69537a;
        if (hotVideoViewHolder != null) {
            this.f69537a = null;
            hotVideoViewHolder.mLeftTitleView = null;
            hotVideoViewHolder.mRightTitleView = null;
            hotVideoViewHolder.mYellowDotView = null;
            hotVideoViewHolder.mRightArrowView = null;
            hotVideoViewHolder.mRecyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotVideoViewHolder_ViewBinding(HotVideoViewHolder hotVideoViewHolder, View view) {
        this.f69537a = hotVideoViewHolder;
        hotVideoViewHolder.mLeftTitleView = Utils.findRequiredView(view, R.id.e3f, "field 'mLeftTitleView'");
        hotVideoViewHolder.mRightTitleView = Utils.findRequiredView(view, R.id.dvx, "field 'mRightTitleView'");
        hotVideoViewHolder.mYellowDotView = Utils.findRequiredView(view, R.id.ect, "field 'mYellowDotView'");
        hotVideoViewHolder.mRightArrowView = Utils.findRequiredView(view, R.id.b_9, "field 'mRightArrowView'");
        hotVideoViewHolder.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cxe, "field 'mRecyclerView'", RecyclerView.class);
    }
}
