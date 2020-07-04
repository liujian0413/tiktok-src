package com.p280ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.b */
public final class C24071b {
    /* renamed from: a */
    public static boolean m79000a() {
        return C24220a.m79551a().isNewCommentBackground();
    }

    /* renamed from: a */
    public static void m78999a(Context context, CommentViewHolderNewStyle commentViewHolderNewStyle, Comment comment) {
        if (commentViewHolderNewStyle.mo62380l() && context != null && comment != null) {
            commentViewHolderNewStyle.mTitleView.setTextColor(context.getResources().getColor(R.color.a5h));
            commentViewHolderNewStyle.mCommentSplitView.setTextColor(context.getResources().getColor(R.color.a5h));
            commentViewHolderNewStyle.mReplyTitleView.setTextColor(context.getResources().getColor(R.color.a5h));
            commentViewHolderNewStyle.mReplyCommentSplitView.setTextColor(context.getResources().getColor(R.color.a5h));
            commentViewHolderNewStyle.mCommentTimeView.setTextColor(context.getResources().getColor(R.color.a5k));
            commentViewHolderNewStyle.mContentView.setTextColor(context.getResources().getColor(R.color.a5e));
            commentViewHolderNewStyle.mReplyContentView.setTextColor(context.getResources().getColor(R.color.a5h));
            commentViewHolderNewStyle.mReplyDivider.setBackground(context.getResources().getDrawable(R.drawable.jg));
            if (comment.getLabelType() != 1) {
                commentViewHolderNewStyle.mCommentStyleView.setTextColor(context.getResources().getColor(R.color.a5h));
                if (!C6399b.m19944t()) {
                    commentViewHolderNewStyle.mCommentStyleView.setBackground(context.getResources().getDrawable(R.drawable.xn));
                }
            }
            if (!(comment.getReplyComments() == null || comment.getReplyComments().isEmpty() || ((Comment) comment.getReplyComments().get(0)).getLabelType() == 1)) {
                commentViewHolderNewStyle.mReplyCommentStyleView.setTextColor(context.getResources().getColor(R.color.a5h));
                if (!C6399b.m19944t()) {
                    commentViewHolderNewStyle.mReplyCommentStyleView.setBackground(context.getResources().getDrawable(R.drawable.xn));
                }
            }
            commentViewHolderNewStyle.mTvRelationLabel.setBackground(context.getResources().getDrawable(R.drawable.xn));
            commentViewHolderNewStyle.mTvReplyCommentRelationLabel.setBackground(context.getResources().getDrawable(R.drawable.xn));
            commentViewHolderNewStyle.mTvRelationLabel.setTextColor(context.getResources().getColor(R.color.a5h));
            commentViewHolderNewStyle.mTvReplyCommentRelationLabel.setTextColor(context.getResources().getColor(R.color.a5h));
        }
    }
}
