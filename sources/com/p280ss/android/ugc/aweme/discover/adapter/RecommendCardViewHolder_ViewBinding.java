package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendCardViewHolder_ViewBinding */
public class RecommendCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecommendCardViewHolder f69606a;

    /* renamed from: b */
    private View f69607b;

    /* renamed from: c */
    private View f69608c;

    public void unbind() {
        RecommendCardViewHolder recommendCardViewHolder = this.f69606a;
        if (recommendCardViewHolder != null) {
            this.f69606a = null;
            recommendCardViewHolder.closeIv = null;
            recommendCardViewHolder.avatar = null;
            recommendCardViewHolder.txtNickName = null;
            recommendCardViewHolder.closeContainer = null;
            recommendCardViewHolder.txtDescription = null;
            recommendCardViewHolder.ivFollow = null;
            recommendCardViewHolder.nickNameBg = null;
            recommendCardViewHolder.descriptionBg = null;
            recommendCardViewHolder.rootLayout = null;
            this.f69607b.setOnClickListener(null);
            this.f69607b = null;
            this.f69608c.setOnClickListener(null);
            this.f69608c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecommendCardViewHolder_ViewBinding(final RecommendCardViewHolder recommendCardViewHolder, View view) {
        this.f69606a = recommendCardViewHolder;
        recommendCardViewHolder.closeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.xl, "field 'closeIv'", ImageView.class);
        recommendCardViewHolder.avatar = (CircleImageView) Utils.findRequiredViewAsType(view, R.id.ic, "field 'avatar'", CircleImageView.class);
        recommendCardViewHolder.txtNickName = (TextView) Utils.findRequiredViewAsType(view, R.id.c4d, "field 'txtNickName'", TextView.class);
        recommendCardViewHolder.closeContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.xi, "field 'closeContainer'", FrameLayout.class);
        recommendCardViewHolder.txtDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.a7p, "field 'txtDescription'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b9g, "field 'ivFollow' and method 'onClick'");
        recommendCardViewHolder.ivFollow = (AnimationImageView) Utils.castView(findRequiredView, R.id.b9g, "field 'ivFollow'", AnimationImageView.class);
        this.f69607b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendCardViewHolder.onClick(view);
            }
        });
        recommendCardViewHolder.nickNameBg = Utils.findRequiredView(view, R.id.c4e, "field 'nickNameBg'");
        recommendCardViewHolder.descriptionBg = Utils.findRequiredView(view, R.id.a7q, "field 'descriptionBg'");
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cwn, "field 'rootLayout' and method 'onClick'");
        recommendCardViewHolder.rootLayout = (LinearLayout) Utils.castView(findRequiredView2, R.id.cwn, "field 'rootLayout'", LinearLayout.class);
        this.f69608c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendCardViewHolder.onClick(view);
            }
        });
    }
}
