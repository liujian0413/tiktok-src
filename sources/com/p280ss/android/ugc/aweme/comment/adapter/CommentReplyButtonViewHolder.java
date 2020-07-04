package com.p280ss.android.ugc.aweme.comment.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.list.C24183i;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1103ui.C24335r;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder */
public class CommentReplyButtonViewHolder extends C1293v implements C24183i {

    /* renamed from: a */
    public CommentReplyButtonStruct f63583a;
    View mCollapseLayout;
    View mDivider;
    View mExpandLayout;
    ImageView mImgExpand;
    LinearLayout mLayoutButton;
    DmtLoadingLayout mLayoutLoading;
    DmtTextView mTvTitle;

    /* renamed from: a */
    public final int mo62332a() {
        return this.f63583a.getButtonStatus();
    }

    /* renamed from: f */
    private void m78912f() {
        this.mLayoutButton.setVisibility(8);
        this.mLayoutLoading.setVisibility(0);
    }

    /* renamed from: g */
    private static boolean m78913g() {
        return C24220a.m79551a().isBlackBackground();
    }

    /* renamed from: e */
    private void m78911e() {
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mExpandLayout.setVisibility(8);
        this.mCollapseLayout.setVisibility(0);
    }

    /* renamed from: d */
    private void m78910d() {
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mTvTitle.setText(R.string.a7m);
        this.mDivider.setVisibility(0);
        this.mExpandLayout.setVisibility(0);
        this.mCollapseLayout.setVisibility(0);
    }

    /* renamed from: b */
    private void m78908b() {
        if (this.f63583a.getReplyCommentTotal() > this.f63583a.getTopSize() || this.f63583a.getButtonStatus() == 4) {
            switch (this.f63583a.getButtonStatus()) {
                case 0:
                    m78909c();
                    return;
                case 1:
                    m78910d();
                    return;
                case 2:
                    if (this.f63583a != null) {
                        int expandSize = this.f63583a.getExpandSize();
                        this.f63583a.setReplyCommentTotal(expandSize);
                        if (expandSize <= this.f63583a.getTopSize()) {
                            mo62333a(4);
                            return;
                        }
                    }
                    m78911e();
                    return;
                case 3:
                    m78912f();
                    return;
                case 4:
                    this.itemView.getLayoutParams().height = 0;
                    break;
            }
            return;
        }
        mo62333a(4);
    }

    /* renamed from: c */
    private void m78909c() {
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mTvTitle.setText(C1642a.m8034a(this.mTvTitle.getResources().getString(R.string.a7n), new Object[]{C30537o.m99738a((long) (this.f63583a.getReplyCommentTotal() - this.f63583a.getExpandSize()))}));
        this.mDivider.setVisibility(8);
        this.mExpandLayout.setVisibility(0);
        this.mCollapseLayout.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo62333a(int i) {
        if (this.f63583a != null) {
            this.f63583a.setButtonStatus(i);
        }
        m78908b();
    }

    /* renamed from: a */
    public final void mo62334a(CommentReplyButtonStruct commentReplyButtonStruct) {
        if (commentReplyButtonStruct != null) {
            this.f63583a = commentReplyButtonStruct;
            m78908b();
        }
    }

    public CommentReplyButtonViewHolder(ViewGroup viewGroup, final C24090a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u2, viewGroup, false));
        ButterKnife.bind((Object) this, this.itemView);
        this.mExpandLayout.setOnTouchListener(new C24335r() {
            /* renamed from: a */
            public final void mo62335a(View view) {
                if (CommentReplyButtonViewHolder.this.f63583a != null && aVar != null && CommentReplyButtonViewHolder.this.f63583a.getButtonStatus() != 3) {
                    aVar.mo62446a(CommentReplyButtonViewHolder.this.f63583a, CommentReplyButtonViewHolder.this.getAdapterPosition());
                }
            }
        });
        this.mCollapseLayout.setOnTouchListener(new C24335r() {
            /* renamed from: a */
            public final void mo62335a(View view) {
                if (CommentReplyButtonViewHolder.this.f63583a != null && aVar != null && CommentReplyButtonViewHolder.this.f63583a.getButtonStatus() != 3) {
                    CommentReplyButtonViewHolder.this.f63583a.setButtonStatus(2);
                    aVar.mo62446a(CommentReplyButtonViewHolder.this.f63583a, CommentReplyButtonViewHolder.this.getAdapterPosition());
                }
            }
        });
        this.mLayoutLoading.setProgressBarInfo(C23486n.m77122a(28.0d));
        if (m78913g()) {
            this.mTvTitle.setTextColor(this.itemView.getResources().getColor(R.color.a53));
            this.mImgExpand.setImageResource(R.drawable.ags);
            this.mDivider.setBackgroundResource(R.drawable.je);
        }
    }
}
