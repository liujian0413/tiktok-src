package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder_ViewBinding */
public class CommentReplyButtonViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentReplyButtonViewHolder f63588a;

    public void unbind() {
        CommentReplyButtonViewHolder commentReplyButtonViewHolder = this.f63588a;
        if (commentReplyButtonViewHolder != null) {
            this.f63588a = null;
            commentReplyButtonViewHolder.mExpandLayout = null;
            commentReplyButtonViewHolder.mLayoutButton = null;
            commentReplyButtonViewHolder.mLayoutLoading = null;
            commentReplyButtonViewHolder.mTvTitle = null;
            commentReplyButtonViewHolder.mCollapseLayout = null;
            commentReplyButtonViewHolder.mImgExpand = null;
            commentReplyButtonViewHolder.mDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentReplyButtonViewHolder_ViewBinding(CommentReplyButtonViewHolder commentReplyButtonViewHolder, View view) {
        this.f63588a = commentReplyButtonViewHolder;
        commentReplyButtonViewHolder.mExpandLayout = Utils.findRequiredView(view, R.id.ah9, "field 'mExpandLayout'");
        commentReplyButtonViewHolder.mLayoutButton = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bjb, "field 'mLayoutButton'", LinearLayout.class);
        commentReplyButtonViewHolder.mLayoutLoading = (DmtLoadingLayout) Utils.findRequiredViewAsType(view, R.id.bjc, "field 'mLayoutLoading'", DmtLoadingLayout.class);
        commentReplyButtonViewHolder.mTvTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e0m, "field 'mTvTitle'", DmtTextView.class);
        commentReplyButtonViewHolder.mCollapseLayout = Utils.findRequiredView(view, R.id.xx, "field 'mCollapseLayout'");
        commentReplyButtonViewHolder.mImgExpand = (ImageView) Utils.findRequiredViewAsType(view, R.id.azz, "field 'mImgExpand'", ImageView.class);
        commentReplyButtonViewHolder.mDivider = Utils.findRequiredView(view, R.id.a9q, "field 'mDivider'");
    }
}
