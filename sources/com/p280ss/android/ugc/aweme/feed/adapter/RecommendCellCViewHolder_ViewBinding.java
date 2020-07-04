package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.BorderLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.RecommendCellCViewHolder_ViewBinding */
public class RecommendCellCViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecommendCellCViewHolder f74032a;

    public void unbind() {
        RecommendCellCViewHolder recommendCellCViewHolder = this.f74032a;
        if (recommendCellCViewHolder != null) {
            this.f74032a = null;
            recommendCellCViewHolder.txtDesc = null;
            recommendCellCViewHolder.txtLikeCount = null;
            recommendCellCViewHolder.txtCommentCount = null;
            recommendCellCViewHolder.tagLayout = null;
            recommendCellCViewHolder.borderLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecommendCellCViewHolder_ViewBinding(RecommendCellCViewHolder recommendCellCViewHolder, View view) {
        this.f74032a = recommendCellCViewHolder;
        recommendCellCViewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.a7e, "field 'txtDesc'", TextView.class);
        recommendCellCViewHolder.txtLikeCount = (TextView) Utils.findRequiredViewAsType(view, R.id.blt, "field 'txtLikeCount'", TextView.class);
        recommendCellCViewHolder.txtCommentCount = (TextView) Utils.findRequiredViewAsType(view, R.id.z7, "field 'txtCommentCount'", TextView.class);
        recommendCellCViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.dg3, "field 'tagLayout'", TagLayout.class);
        recommendCellCViewHolder.borderLayout = (BorderLayout) Utils.findRequiredViewAsType(view, R.id.ni, "field 'borderLayout'", BorderLayout.class);
    }
}
