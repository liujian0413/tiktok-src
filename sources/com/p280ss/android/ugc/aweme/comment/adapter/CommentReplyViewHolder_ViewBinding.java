package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentTranslationStatusView;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.RelationLabelTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentReplyViewHolder_ViewBinding */
public class CommentReplyViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentReplyViewHolder f63605a;

    /* renamed from: b */
    private View f63606b;

    /* renamed from: c */
    private View f63607c;

    public void unbind() {
        CommentReplyViewHolder commentReplyViewHolder = this.f63605a;
        if (commentReplyViewHolder != null) {
            this.f63605a = null;
            commentReplyViewHolder.mBgView = null;
            commentReplyViewHolder.mRootView = null;
            commentReplyViewHolder.mAvatarView = null;
            commentReplyViewHolder.mDiggLayout = null;
            commentReplyViewHolder.mDiggView = null;
            commentReplyViewHolder.mDiggCountView = null;
            commentReplyViewHolder.mTitleView = null;
            commentReplyViewHolder.mCommentSplitView = null;
            commentReplyViewHolder.mContentView = null;
            commentReplyViewHolder.mCommentStyleView = null;
            commentReplyViewHolder.mTvRelationLabel = null;
            commentReplyViewHolder.mTranslationView = null;
            commentReplyViewHolder.mPostStatus = null;
            commentReplyViewHolder.mTvLikedByCreator = null;
            commentReplyViewHolder.mGifEmojiView = null;
            commentReplyViewHolder.mCommentTimeView = null;
            this.f63606b.setOnClickListener(null);
            this.f63606b = null;
            this.f63607c.setOnClickListener(null);
            this.f63607c.setOnLongClickListener(null);
            this.f63607c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentReplyViewHolder_ViewBinding(final CommentReplyViewHolder commentReplyViewHolder, View view) {
        this.f63605a = commentReplyViewHolder;
        commentReplyViewHolder.mBgView = view.findViewById(R.id.a1c);
        commentReplyViewHolder.mRootView = Utils.findRequiredView(view, R.id.bjh, "field 'mRootView'");
        commentReplyViewHolder.mAvatarView = (SmartCircleImageView) Utils.findRequiredViewAsType(view, R.id.ic, "field 'mAvatarView'", SmartCircleImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bh7, "field 'mDiggLayout' and method 'onClick'");
        commentReplyViewHolder.mDiggLayout = findRequiredView;
        this.f63606b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commentReplyViewHolder.onClick(view);
            }
        });
        commentReplyViewHolder.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b8j, "field 'mDiggView'", ImageView.class);
        commentReplyViewHolder.mDiggCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.dtf, "field 'mDiggCountView'", TextView.class);
        commentReplyViewHolder.mTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", DmtTextView.class);
        commentReplyViewHolder.mCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.zs, "field 'mCommentSplitView'", DmtTextView.class);
        commentReplyViewHolder.mContentView = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.a1q, "field 'mContentView'", MentionTextView.class);
        commentReplyViewHolder.mCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, R.id.zt, "field 'mCommentStyleView'", TextView.class);
        commentReplyViewHolder.mTvRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, R.id.e0i, "field 'mTvRelationLabel'", RelationLabelTextView.class);
        commentReplyViewHolder.mTranslationView = (CommentTranslationStatusView) Utils.findOptionalViewAsType(view, R.id.dnl, "field 'mTranslationView'", CommentTranslationStatusView.class);
        commentReplyViewHolder.mPostStatus = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.cio, "field 'mPostStatus'", DmtTextView.class);
        commentReplyViewHolder.mTvLikedByCreator = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.blz, "field 'mTvLikedByCreator'", DmtTextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.aqf, "method 'onClick' and method 'onLongClick'");
        commentReplyViewHolder.mGifEmojiView = (RemoteImageView) Utils.castView(findRequiredView2, R.id.aqf, "field 'mGifEmojiView'", RemoteImageView.class);
        this.f63607c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commentReplyViewHolder.onClick(view);
            }
        });
        findRequiredView2.setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                return commentReplyViewHolder.onLongClick(view);
            }
        });
        commentReplyViewHolder.mCommentTimeView = (TextView) Utils.findOptionalViewAsType(view, R.id.zu, "field 'mCommentTimeView'", TextView.class);
    }
}
