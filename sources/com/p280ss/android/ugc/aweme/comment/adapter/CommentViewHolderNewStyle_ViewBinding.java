package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.views.RelationLabelTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolderNewStyle_ViewBinding */
public class CommentViewHolderNewStyle_ViewBinding extends CommentViewHolder_ViewBinding {

    /* renamed from: a */
    private CommentViewHolderNewStyle f63656a;

    /* renamed from: b */
    private View f63657b;

    /* renamed from: c */
    private View f63658c;

    public void unbind() {
        CommentViewHolderNewStyle commentViewHolderNewStyle = this.f63656a;
        if (commentViewHolderNewStyle != null) {
            this.f63656a = null;
            commentViewHolderNewStyle.mGifEmojiView = null;
            commentViewHolderNewStyle.mCommentTimeView = null;
            commentViewHolderNewStyle.mDiggCountView = null;
            commentViewHolderNewStyle.mDiggView = null;
            commentViewHolderNewStyle.mCommentStyleView = null;
            commentViewHolderNewStyle.mDiggLayout = null;
            commentViewHolderNewStyle.mReplyCommentStyleView = null;
            commentViewHolderNewStyle.mTvRelationLabel = null;
            commentViewHolderNewStyle.mTvReplyCommentRelationLabel = null;
            commentViewHolderNewStyle.mCommentSplitView = null;
            commentViewHolderNewStyle.mReplyCommentSplitView = null;
            commentViewHolderNewStyle.mPostStatus = null;
            commentViewHolderNewStyle.mTvLikedByCreator = null;
            if (this.f63657b != null) {
                this.f63657b.setOnClickListener(null);
                this.f63657b.setOnLongClickListener(null);
                this.f63657b = null;
            }
            this.f63658c.setOnClickListener(null);
            this.f63658c = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentViewHolderNewStyle_ViewBinding(final CommentViewHolderNewStyle commentViewHolderNewStyle, View view) {
        super(commentViewHolderNewStyle, view);
        this.f63656a = commentViewHolderNewStyle;
        View findViewById = view.findViewById(R.id.aqf);
        commentViewHolderNewStyle.mGifEmojiView = (RemoteImageView) Utils.castView(findViewById, R.id.aqf, "field 'mGifEmojiView'", RemoteImageView.class);
        if (findViewById != null) {
            this.f63657b = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    commentViewHolderNewStyle.onClick(view);
                }
            });
            findViewById.setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    return commentViewHolderNewStyle.onLongClick(view);
                }
            });
        }
        commentViewHolderNewStyle.mCommentTimeView = (TextView) Utils.findOptionalViewAsType(view, R.id.zu, "field 'mCommentTimeView'", TextView.class);
        commentViewHolderNewStyle.mDiggCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.dtf, "field 'mDiggCountView'", TextView.class);
        commentViewHolderNewStyle.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b8j, "field 'mDiggView'", ImageView.class);
        commentViewHolderNewStyle.mCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, R.id.zt, "field 'mCommentStyleView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bh7, "field 'mDiggLayout'");
        commentViewHolderNewStyle.mDiggLayout = findRequiredView;
        this.f63658c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commentViewHolderNewStyle.onClick(view);
            }
        });
        commentViewHolderNewStyle.mReplyCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, R.id.cru, "field 'mReplyCommentStyleView'", TextView.class);
        commentViewHolderNewStyle.mTvRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, R.id.e0i, "field 'mTvRelationLabel'", RelationLabelTextView.class);
        commentViewHolderNewStyle.mTvReplyCommentRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, R.id.e0l, "field 'mTvReplyCommentRelationLabel'", RelationLabelTextView.class);
        commentViewHolderNewStyle.mCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.zs, "field 'mCommentSplitView'", DmtTextView.class);
        commentViewHolderNewStyle.mReplyCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.crt, "field 'mReplyCommentSplitView'", DmtTextView.class);
        commentViewHolderNewStyle.mPostStatus = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.cio, "field 'mPostStatus'", DmtTextView.class);
        commentViewHolderNewStyle.mTvLikedByCreator = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.blz, "field 'mTvLikedByCreator'", DmtTextView.class);
    }
}
