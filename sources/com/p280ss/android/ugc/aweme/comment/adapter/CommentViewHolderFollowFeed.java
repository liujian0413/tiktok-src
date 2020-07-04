package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.list.C24189o;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolderFollowFeed */
public class CommentViewHolderFollowFeed extends CommentViewHolderNewStyle implements C24189o {
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo62375j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo62380l() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo62369c() {
        return C24220a.m79551a().isBlackBackground();
    }

    /* renamed from: a */
    public final void mo62362a(Comment comment) {
        super.mo62362a(comment);
        if (this.mCommentTimeView != null) {
            this.mCommentTimeView.setVisibility(8);
        }
        this.mContentView.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a4z));
        this.mReplyContentView.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a4z));
        this.mReplyDivider.setBackgroundResource(R.drawable.m0);
        this.mTvRelationLabel.setBackgroundResource(R.drawable.r7);
        this.mTvReplyCommentRelationLabel.setBackgroundResource(R.drawable.r7);
        if (this.f63632f == 9 && C24220a.m79551a().isSearchMixViewHolder()) {
            this.mContentView.setTextSize(14.0f);
            this.mContentView.setLineSpacing(C9738o.m28708b(this.itemView.getContext(), 1.2f), 1.0f);
        }
    }

    public CommentViewHolderFollowFeed(ViewGroup viewGroup, C24090a aVar, String str) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w5, viewGroup, false), aVar, str);
        this.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (CommentViewHolderFollowFeed.this.f63635i != null) {
                    CommentViewHolderFollowFeed.this.f63635i.mo62443a((C24187m) CommentViewHolderFollowFeed.this.f63633g, CommentViewHolderFollowFeed.this.f63627a);
                }
            }
        });
        this.itemView.setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                if (CommentViewHolderFollowFeed.this.f63635i != null) {
                    CommentViewHolderFollowFeed.this.f63635i.mo62449b((C24187m) CommentViewHolderFollowFeed.this.f63633g, CommentViewHolderFollowFeed.this.f63627a);
                }
                return true;
            }
        });
    }
}
