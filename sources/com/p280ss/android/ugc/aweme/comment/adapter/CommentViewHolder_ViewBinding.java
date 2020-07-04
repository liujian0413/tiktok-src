package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarImageView;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentTranslationStatusView;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder_ViewBinding */
public class CommentViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentViewHolder f63665a;

    public void unbind() {
        CommentViewHolder commentViewHolder = this.f63665a;
        if (commentViewHolder != null) {
            this.f63665a = null;
            commentViewHolder.mRootView = null;
            commentViewHolder.mAvatarView = null;
            commentViewHolder.mTitleView = null;
            commentViewHolder.mContentView = null;
            commentViewHolder.mReplyContainer = null;
            commentViewHolder.mReplyTitleView = null;
            commentViewHolder.mReplyContentView = null;
            commentViewHolder.mMenuItem = null;
            commentViewHolder.mReplyDivider = null;
            commentViewHolder.mTranslationView = null;
            commentViewHolder.mBgView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentViewHolder_ViewBinding(CommentViewHolder commentViewHolder, View view) {
        this.f63665a = commentViewHolder;
        commentViewHolder.mRootView = Utils.findRequiredView(view, R.id.bjh, "field 'mRootView'");
        commentViewHolder.mAvatarView = (SmartAvatarImageView) Utils.findRequiredViewAsType(view, R.id.ic, "field 'mAvatarView'", SmartAvatarImageView.class);
        commentViewHolder.mTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", DmtTextView.class);
        commentViewHolder.mContentView = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.a1q, "field 'mContentView'", MentionTextView.class);
        commentViewHolder.mReplyContainer = Utils.findRequiredView(view, R.id.crv, "field 'mReplyContainer'");
        commentViewHolder.mReplyTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cry, "field 'mReplyTitleView'", DmtTextView.class);
        commentViewHolder.mReplyContentView = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.crw, "field 'mReplyContentView'", MentionTextView.class);
        commentViewHolder.mMenuItem = (ImageView) Utils.findOptionalViewAsType(view, R.id.ahb, "field 'mMenuItem'", ImageView.class);
        commentViewHolder.mReplyDivider = Utils.findRequiredView(view, R.id.crx, "field 'mReplyDivider'");
        commentViewHolder.mTranslationView = (CommentTranslationStatusView) Utils.findOptionalViewAsType(view, R.id.dnl, "field 'mTranslationView'", CommentTranslationStatusView.class);
        commentViewHolder.mBgView = view.findViewById(R.id.a1c);
        commentViewHolder.size = view.getContext().getResources().getDimensionPixelSize(R.dimen.dn);
    }
}
