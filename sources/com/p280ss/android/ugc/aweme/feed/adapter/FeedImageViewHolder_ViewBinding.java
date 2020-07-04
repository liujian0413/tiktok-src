package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p280ss.android.ugc.aweme.poi.widget.RatingBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder_ViewBinding */
public class FeedImageViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedImageViewHolder f73962a;

    /* renamed from: b */
    private View f73963b;

    /* renamed from: c */
    private View f73964c;

    /* renamed from: d */
    private View f73965d;

    public void unbind() {
        FeedImageViewHolder feedImageViewHolder = this.f73962a;
        if (feedImageViewHolder != null) {
            this.f73962a = null;
            feedImageViewHolder.mWidgetContainer = null;
            feedImageViewHolder.mPoiRatingContainer = null;
            feedImageViewHolder.mRatingBar = null;
            feedImageViewHolder.mRateText = null;
            feedImageViewHolder.mRootView = null;
            feedImageViewHolder.mCoverView = null;
            feedImageViewHolder.mTitleView = null;
            feedImageViewHolder.mBottomView = null;
            feedImageViewHolder.mGradualBottomView = null;
            feedImageViewHolder.mTxtExtra = null;
            feedImageViewHolder.commerceTagFrameLayout = null;
            feedImageViewHolder.tagLayout = null;
            feedImageViewHolder.llRightMenu = null;
            feedImageViewHolder.llAwemeIntro = null;
            feedImageViewHolder.mLongPressLayout = null;
            feedImageViewHolder.mLineProgressBar = null;
            feedImageViewHolder.mAwemeInCheckLayout = null;
            this.f73963b.setOnClickListener(null);
            this.f73963b = null;
            this.f73964c.setOnClickListener(null);
            this.f73964c = null;
            this.f73965d.setOnClickListener(null);
            this.f73965d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedImageViewHolder_ViewBinding(final FeedImageViewHolder feedImageViewHolder, View view) {
        this.f73962a = feedImageViewHolder;
        feedImageViewHolder.mWidgetContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.eh4, "field 'mWidgetContainer'", RelativeLayout.class);
        feedImageViewHolder.mPoiRatingContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cg8, "field 'mPoiRatingContainer'", ViewGroup.class);
        feedImageViewHolder.mRatingBar = (RatingBar) Utils.findRequiredViewAsType(view, R.id.d_b, "field 'mRatingBar'", RatingBar.class);
        feedImageViewHolder.mRateText = (TextView) Utils.findRequiredViewAsType(view, R.id.cni, "field 'mRateText'", TextView.class);
        feedImageViewHolder.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.edc, "field 'mRootView'", FrameLayout.class);
        feedImageViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.a4g, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.title, "field 'mTitleView' and method 'onClick'");
        feedImageViewHolder.mTitleView = (TextView) Utils.castView(findRequiredView, R.id.title, "field 'mTitleView'", TextView.class);
        this.f73963b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedImageViewHolder.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.nk, "field 'mBottomView' and method 'onClick'");
        feedImageViewHolder.mBottomView = findRequiredView2;
        this.f73964c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedImageViewHolder.onClick(view);
            }
        });
        feedImageViewHolder.mGradualBottomView = Utils.findRequiredView(view, R.id.aso, "field 'mGradualBottomView'");
        feedImageViewHolder.mTxtExtra = (TextView) Utils.findRequiredViewAsType(view, R.id.dua, "field 'mTxtExtra'", TextView.class);
        feedImageViewHolder.commerceTagFrameLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.a0m, "field 'commerceTagFrameLayout'", FrameLayout.class);
        feedImageViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.ebo, "field 'tagLayout'", TagLayout.class);
        feedImageViewHolder.llRightMenu = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cte, "field 'llRightMenu'", LinearLayout.class);
        feedImageViewHolder.llAwemeIntro = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.jh, "field 'llAwemeIntro'", LinearLayout.class);
        feedImageViewHolder.mLongPressLayout = (LongPressLayout) Utils.findRequiredViewAsType(view, R.id.bvy, "field 'mLongPressLayout'", LongPressLayout.class);
        feedImageViewHolder.mLineProgressBar = (LineProgressBar) Utils.findRequiredViewAsType(view, R.id.cce, "field 'mLineProgressBar'", LineProgressBar.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.jg, "field 'mAwemeInCheckLayout' and method 'onClick'");
        feedImageViewHolder.mAwemeInCheckLayout = (ViewGroup) Utils.castView(findRequiredView3, R.id.jg, "field 'mAwemeInCheckLayout'", ViewGroup.class);
        this.f73965d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedImageViewHolder.onClick(view);
            }
        });
    }
}
