package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerCardViewHolder_ViewBinding */
public class FollowerCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowerCardViewHolder f78049a;

    public void unbind() {
        FollowerCardViewHolder followerCardViewHolder = this.f78049a;
        if (followerCardViewHolder != null) {
            this.f78049a = null;
            followerCardViewHolder.fansRecyclerView = null;
            followerCardViewHolder.tvFansSum = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowerCardViewHolder_ViewBinding(FollowerCardViewHolder followerCardViewHolder, View view) {
        this.f78049a = followerCardViewHolder;
        followerCardViewHolder.fansRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.aip, "field 'fansRecyclerView'", RecyclerView.class);
        followerCardViewHolder.tvFansSum = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dud, "field 'tvFansSum'", DmtTextView.class);
    }
}
