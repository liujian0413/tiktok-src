package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder_ViewBinding */
public class RankingListCoverViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RankingListCoverViewHolder f69597a;

    public void unbind() {
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f69597a;
        if (rankingListCoverViewHolder != null) {
            this.f69597a = null;
            rankingListCoverViewHolder.mStarContainer = null;
            rankingListCoverViewHolder.mMusicContainer = null;
            rankingListCoverViewHolder.mStarHeaderView = null;
            rankingListCoverViewHolder.mMusicHeaderView = null;
            rankingListCoverViewHolder.mStarName = null;
            rankingListCoverViewHolder.mMusicName = null;
            rankingListCoverViewHolder.mStarBackground = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RankingListCoverViewHolder_ViewBinding(RankingListCoverViewHolder rankingListCoverViewHolder, View view) {
        this.f69597a = rankingListCoverViewHolder;
        rankingListCoverViewHolder.mStarContainer = Utils.findRequiredView(view, R.id.cud, "field 'mStarContainer'");
        rankingListCoverViewHolder.mMusicContainer = Utils.findRequiredView(view, R.id.cuc, "field 'mMusicContainer'");
        rankingListCoverViewHolder.mStarHeaderView = (CircleImageView) Utils.findRequiredViewAsType(view, R.id.b9y, "field 'mStarHeaderView'", CircleImageView.class);
        rankingListCoverViewHolder.mMusicHeaderView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b9x, "field 'mMusicHeaderView'", RemoteImageView.class);
        rankingListCoverViewHolder.mStarName = (TextView) Utils.findRequiredViewAsType(view, R.id.e27, "field 'mStarName'", TextView.class);
        rankingListCoverViewHolder.mMusicName = (TextView) Utils.findRequiredViewAsType(view, R.id.dya, "field 'mMusicName'", TextView.class);
        rankingListCoverViewHolder.mStarBackground = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.m6, "field 'mStarBackground'", RemoteImageView.class);
    }
}
