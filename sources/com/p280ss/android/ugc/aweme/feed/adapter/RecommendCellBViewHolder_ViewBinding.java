package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.RecommendCellBViewHolder_ViewBinding */
public class RecommendCellBViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecommendCellBViewHolder f74017a;

    /* renamed from: b */
    private View f74018b;

    /* renamed from: c */
    private View f74019c;

    /* renamed from: d */
    private View f74020d;

    /* renamed from: e */
    private View f74021e;

    public void unbind() {
        RecommendCellBViewHolder recommendCellBViewHolder = this.f74017a;
        if (recommendCellBViewHolder != null) {
            this.f74017a = null;
            recommendCellBViewHolder.txtDesc = null;
            recommendCellBViewHolder.txtLikeCount = null;
            recommendCellBViewHolder.authorAvatar = null;
            recommendCellBViewHolder.txtAuthorName = null;
            recommendCellBViewHolder.tagLayout = null;
            recommendCellBViewHolder.mMixIcon = null;
            recommendCellBViewHolder.mBottomDesc = null;
            this.f74018b.setOnClickListener(null);
            this.f74018b = null;
            this.f74019c.setOnClickListener(null);
            this.f74019c = null;
            this.f74020d.setOnClickListener(null);
            this.f74020d = null;
            this.f74021e.setOnClickListener(null);
            this.f74021e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecommendCellBViewHolder_ViewBinding(final RecommendCellBViewHolder recommendCellBViewHolder, View view) {
        this.f74017a = recommendCellBViewHolder;
        View findRequiredView = Utils.findRequiredView(view, R.id.a7e, "field 'txtDesc' and method 'onClick'");
        recommendCellBViewHolder.txtDesc = (TextView) Utils.castView(findRequiredView, R.id.a7e, "field 'txtDesc'", TextView.class);
        this.f74018b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendCellBViewHolder.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.blt, "field 'txtLikeCount' and method 'onClick'");
        recommendCellBViewHolder.txtLikeCount = (TextView) Utils.castView(findRequiredView2, R.id.blt, "field 'txtLikeCount'", TextView.class);
        this.f74019c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendCellBViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.hv, "field 'authorAvatar' and method 'onClick'");
        recommendCellBViewHolder.authorAvatar = (SmartCircleImageView) Utils.castView(findRequiredView3, R.id.hv, "field 'authorAvatar'", SmartCircleImageView.class);
        this.f74020d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendCellBViewHolder.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.hx, "field 'txtAuthorName' and method 'onClick'");
        recommendCellBViewHolder.txtAuthorName = (TextView) Utils.castView(findRequiredView4, R.id.hx, "field 'txtAuthorName'", TextView.class);
        this.f74021e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendCellBViewHolder.onClick(view);
            }
        });
        recommendCellBViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.dg3, "field 'tagLayout'", TagLayout.class);
        recommendCellBViewHolder.mMixIcon = (ImageView) Utils.findOptionalViewAsType(view, R.id.bz_, "field 'mMixIcon'", ImageView.class);
        recommendCellBViewHolder.mBottomDesc = (LinearLayout) Utils.findOptionalViewAsType(view, R.id.bqf, "field 'mBottomDesc'", LinearLayout.class);
    }
}
