package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.support.p029v7.widget.AppCompatCheckBox;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.detail.p1167ui.FadeImageView;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentInputFragment_ViewBinding */
public class CommentInputFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentInputFragment f64022a;

    public void unbind() {
        CommentInputFragment commentInputFragment = this.f64022a;
        if (commentInputFragment != null) {
            this.f64022a = null;
            commentInputFragment.mEditCommentView = null;
            commentInputFragment.mSendCommentView = null;
            commentInputFragment.mLayout = null;
            commentInputFragment.mEditContainerView = null;
            commentInputFragment.ivAt = null;
            commentInputFragment.ivEmoji = null;
            commentInputFragment.tabDivider = null;
            commentInputFragment.mCbForward = null;
            commentInputFragment.report = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentInputFragment_ViewBinding(CommentInputFragment commentInputFragment, View view) {
        this.f64022a = commentInputFragment;
        commentInputFragment.mEditCommentView = (MentionEditText) Utils.findRequiredViewAsType(view, R.id.z8, "field 'mEditCommentView'", MentionEditText.class);
        commentInputFragment.mSendCommentView = (ImageView) Utils.findRequiredViewAsType(view, R.id.zo, "field 'mSendCommentView'", ImageView.class);
        commentInputFragment.mLayout = Utils.findRequiredView(view, R.id.a19, "field 'mLayout'");
        commentInputFragment.mEditContainerView = Utils.findRequiredView(view, R.id.ac5, "field 'mEditContainerView'");
        commentInputFragment.ivAt = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.ha, "field 'ivAt'", FadeImageView.class);
        commentInputFragment.ivEmoji = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.b8w, "field 'ivEmoji'", FadeImageView.class);
        commentInputFragment.tabDivider = Utils.findRequiredView(view, R.id.dfd, "field 'tabDivider'");
        commentInputFragment.mCbForward = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.tm, "field 'mCbForward'", AppCompatCheckBox.class);
        commentInputFragment.report = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.cs1, "field 'report'", FadeImageView.class);
    }
}
