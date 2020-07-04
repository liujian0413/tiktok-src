package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommentFollowFeedMomentViewHolder_ViewBinding */
public class CommentFollowFeedMomentViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentFollowFeedMomentViewHolder f89200a;

    public void unbind() {
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f89200a;
        if (commentFollowFeedMomentViewHolder != null) {
            this.f89200a = null;
            commentFollowFeedMomentViewHolder.mTvComment = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentFollowFeedMomentViewHolder_ViewBinding(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder, View view) {
        this.f89200a = commentFollowFeedMomentViewHolder;
        commentFollowFeedMomentViewHolder.mTvComment = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.ds5, "field 'mTvComment'", MentionTextView.class);
    }
}
