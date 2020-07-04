package com.p280ss.android.ugc.aweme.flowfeed.p1256ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedCommentLayout_ViewBinding */
public class FollowFeedCommentLayout_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowFeedCommentLayout f77465a;

    public void unbind() {
        FollowFeedCommentLayout followFeedCommentLayout = this.f77465a;
        if (followFeedCommentLayout != null) {
            this.f77465a = null;
            followFeedCommentLayout.mRecComments = null;
            followFeedCommentLayout.mLayoutAddComment = null;
            followFeedCommentLayout.mImgAvatar = null;
            followFeedCommentLayout.mShowAllComments = null;
            followFeedCommentLayout.mSpace = null;
            followFeedCommentLayout.mLayoutLikes = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowFeedCommentLayout_ViewBinding(FollowFeedCommentLayout followFeedCommentLayout, View view) {
        this.f77465a = followFeedCommentLayout;
        followFeedCommentLayout.mRecComments = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cqg, "field 'mRecComments'", RecyclerView.class);
        followFeedCommentLayout.mLayoutAddComment = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bgk, "field 'mLayoutAddComment'", LinearLayout.class);
        followFeedCommentLayout.mImgAvatar = (CircleImageView) Utils.findRequiredViewAsType(view, R.id.ayt, "field 'mImgAvatar'", CircleImageView.class);
        followFeedCommentLayout.mShowAllComments = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e1x, "field 'mShowAllComments'", DmtTextView.class);
        followFeedCommentLayout.mSpace = view.findViewById(R.id.d8v);
        followFeedCommentLayout.mLayoutLikes = (CommentLikeListView) Utils.findRequiredViewAsType(view, R.id.bi8, "field 'mLayoutLikes'", CommentLikeListView.class);
        followFeedCommentLayout.mAvatarSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.hc);
    }
}
