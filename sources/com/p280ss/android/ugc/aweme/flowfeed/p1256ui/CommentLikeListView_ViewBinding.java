package com.p280ss.android.ugc.aweme.flowfeed.p1256ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView_ViewBinding */
public class CommentLikeListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentLikeListView f77450a;

    public void unbind() {
        CommentLikeListView commentLikeListView = this.f77450a;
        if (commentLikeListView != null) {
            this.f77450a = null;
            commentLikeListView.mHeadViews = null;
            commentLikeListView.mTvContent = null;
            commentLikeListView.mLikeListLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentLikeListView_ViewBinding(CommentLikeListView commentLikeListView, View view) {
        this.f77450a = commentLikeListView;
        commentLikeListView.mHeadViews = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.blv, "field 'mHeadViews'", ViewGroup.class);
        commentLikeListView.mTvContent = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.blw, "field 'mTvContent'", DmtTextView.class);
        commentLikeListView.mLikeListLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ans, "field 'mLikeListLayout'", ViewGroup.class);
    }
}
