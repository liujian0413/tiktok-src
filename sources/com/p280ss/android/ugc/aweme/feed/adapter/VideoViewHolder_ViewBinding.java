package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.PoiCardWebPageContainer;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DebugInfoView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout;
import com.p280ss.android.ugc.aweme.poi.widget.PoiRankVideoWidget;
import com.p280ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p280ss.android.ugc.aweme.setting.p337ui.RestrictTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder_ViewBinding */
public class VideoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VideoViewHolder f74172a;

    /* renamed from: b */
    private View f74173b;

    /* renamed from: c */
    private View f74174c;

    /* renamed from: d */
    private View f74175d;

    /* renamed from: e */
    private View f74176e;

    /* renamed from: f */
    private View f74177f;

    /* renamed from: g */
    private View f74178g;

    public void unbind() {
        VideoViewHolder videoViewHolder = this.f74172a;
        if (videoViewHolder != null) {
            this.f74172a = null;
            videoViewHolder.poiCardWebPageContainer = null;
            videoViewHolder.mWidgetContainer = null;
            videoViewHolder.mCoverView = null;
            videoViewHolder.mHudView = null;
            videoViewHolder.mVideoTagContainer = null;
            videoViewHolder.mBottomView = null;
            videoViewHolder.mTitleView = null;
            videoViewHolder.mDislikeSomeoneTv = null;
            videoViewHolder.mPoiRatingContainer = null;
            videoViewHolder.mRatingBar = null;
            videoViewHolder.mRateText = null;
            videoViewHolder.mGradualBottomView = null;
            videoViewHolder.mRestrictTextView = null;
            videoViewHolder.tagLayout = null;
            videoViewHolder.mIvRelieveTag = null;
            videoViewHolder.feedReportVotell = null;
            videoViewHolder.feedReportWarnll = null;
            videoViewHolder.adFeeDeductionLayout = null;
            videoViewHolder.mAwemeInCheckLayout = null;
            videoViewHolder.mAwemeInCheckIsPreviewLayout = null;
            videoViewHolder.llRightMenu = null;
            videoViewHolder.llAwemeIntro = null;
            videoViewHolder.mLongPressLayout = null;
            videoViewHolder.mRootView = null;
            videoViewHolder.mFullFeedStub = null;
            videoViewHolder.mTxtProhibited = null;
            videoViewHolder.mVoteStatusTextView = null;
            videoViewHolder.mAllowDisplayBtn = null;
            videoViewHolder.mDisallowDisplayBtn = null;
            videoViewHolder.mAvatarLayout = null;
            videoViewHolder.mShareTipImageView = null;
            videoViewHolder.shareTipsRl = null;
            videoViewHolder.shareTipsTv = null;
            videoViewHolder.mXiguaTaskEveningIv = null;
            videoViewHolder.txtTTFeedback = null;
            videoViewHolder.flInteractLayout = null;
            videoViewHolder.mCornerTL = null;
            videoViewHolder.mCornerTR = null;
            videoViewHolder.mCornerBL = null;
            videoViewHolder.mCornerBR = null;
            videoViewHolder.mDebugInfoView = null;
            videoViewHolder.mPoiDistance = null;
            videoViewHolder.mPoiDistanceLayout = null;
            videoViewHolder.mlandscapeTipTv = null;
            videoViewHolder.mPoiRankWidget = null;
            videoViewHolder.commerceTagFrameLayout = null;
            videoViewHolder.commerceGoodHalfCardContainer = null;
            this.f74173b.setOnClickListener(null);
            this.f74173b = null;
            this.f74174c.setOnClickListener(null);
            this.f74174c = null;
            this.f74175d.setOnClickListener(null);
            this.f74175d = null;
            this.f74176e.setOnClickListener(null);
            this.f74176e = null;
            this.f74177f.setOnClickListener(null);
            this.f74177f = null;
            this.f74178g.setOnClickListener(null);
            this.f74178g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoViewHolder_ViewBinding(final VideoViewHolder videoViewHolder, View view) {
        this.f74172a = videoViewHolder;
        videoViewHolder.poiCardWebPageContainer = (PoiCardWebPageContainer) Utils.findRequiredViewAsType(view, R.id.cd_, "field 'poiCardWebPageContainer'", PoiCardWebPageContainer.class);
        videoViewHolder.mWidgetContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.eh4, "field 'mWidgetContainer'", RelativeLayout.class);
        videoViewHolder.mCoverView = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.a4g, "field 'mCoverView'", SmartImageView.class);
        videoViewHolder.mHudView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.aws, "field 'mHudView'", FrameLayout.class);
        videoViewHolder.mVideoTagContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ebn, "field 'mVideoTagContainer'", ViewGroup.class);
        videoViewHolder.mBottomView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.nk, "field 'mBottomView'", FrameLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.title, "field 'mTitleView' and method 'onClick'");
        videoViewHolder.mTitleView = (TextView) Utils.castView(findRequiredView, R.id.title, "field 'mTitleView'", TextView.class);
        this.f74173b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
        videoViewHolder.mDislikeSomeoneTv = (TextView) Utils.findRequiredViewAsType(view, R.id.dth, "field 'mDislikeSomeoneTv'", TextView.class);
        videoViewHolder.mPoiRatingContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cg8, "field 'mPoiRatingContainer'", ViewGroup.class);
        videoViewHolder.mRatingBar = (RatingBar) Utils.findRequiredViewAsType(view, R.id.d_b, "field 'mRatingBar'", RatingBar.class);
        videoViewHolder.mRateText = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cni, "field 'mRateText'", DmtTextView.class);
        videoViewHolder.mGradualBottomView = Utils.findRequiredView(view, R.id.aso, "field 'mGradualBottomView'");
        videoViewHolder.mRestrictTextView = (RestrictTextView) Utils.findRequiredViewAsType(view, R.id.e0p, "field 'mRestrictTextView'", RestrictTextView.class);
        videoViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.ebo, "field 'tagLayout'", TagLayout.class);
        videoViewHolder.mIvRelieveTag = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.ebg, "field 'mIvRelieveTag'", AnimationImageView.class);
        videoViewHolder.feedReportVotell = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ajh, "field 'feedReportVotell'", LinearLayout.class);
        videoViewHolder.feedReportWarnll = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.aji, "field 'feedReportWarnll'", LinearLayout.class);
        videoViewHolder.adFeeDeductionLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bt, "field 'adFeeDeductionLayout'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.jg, "field 'mAwemeInCheckLayout' and method 'onClick'");
        videoViewHolder.mAwemeInCheckLayout = (ViewGroup) Utils.castView(findRequiredView2, R.id.jg, "field 'mAwemeInCheckLayout'", ViewGroup.class);
        this.f74174c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.jf, "field 'mAwemeInCheckIsPreviewLayout' and method 'onClick'");
        videoViewHolder.mAwemeInCheckIsPreviewLayout = (ViewGroup) Utils.castView(findRequiredView3, R.id.jf, "field 'mAwemeInCheckIsPreviewLayout'", ViewGroup.class);
        this.f74175d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
        videoViewHolder.llRightMenu = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cte, "field 'llRightMenu'", LinearLayout.class);
        videoViewHolder.llAwemeIntro = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.jh, "field 'llAwemeIntro'", ViewGroup.class);
        videoViewHolder.mLongPressLayout = (LongPressLayout) Utils.findRequiredViewAsType(view, R.id.bvy, "field 'mLongPressLayout'", LongPressLayout.class);
        videoViewHolder.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.edc, "field 'mRootView'", FrameLayout.class);
        videoViewHolder.mFullFeedStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.apm, "field 'mFullFeedStub'", ViewStub.class);
        videoViewHolder.mTxtProhibited = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e74, "field 'mTxtProhibited'", DmtTextView.class);
        videoViewHolder.mVoteStatusTextView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e4p, "field 'mVoteStatusTextView'", DmtTextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.fh, "field 'mAllowDisplayBtn' and method 'onClick'");
        videoViewHolder.mAllowDisplayBtn = (DmtTextView) Utils.castView(findRequiredView4, R.id.fh, "field 'mAllowDisplayBtn'", DmtTextView.class);
        this.f74176e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.a9_, "field 'mDisallowDisplayBtn' and method 'onClick'");
        videoViewHolder.mDisallowDisplayBtn = (DmtTextView) Utils.castView(findRequiredView5, R.id.a9_, "field 'mDisallowDisplayBtn'", DmtTextView.class);
        this.f74177f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
        videoViewHolder.mAvatarLayout = Utils.findRequiredView(view, R.id.j3, "field 'mAvatarLayout'");
        videoViewHolder.mShareTipImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b98, "field 'mShareTipImageView'", ImageView.class);
        videoViewHolder.shareTipsRl = Utils.findRequiredView(view, R.id.d4y, "field 'shareTipsRl'");
        videoViewHolder.shareTipsTv = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d4z, "field 'shareTipsTv'", DmtTextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.eht, "field 'mXiguaTaskEveningIv' and method 'onClick'");
        videoViewHolder.mXiguaTaskEveningIv = (RemoteImageView) Utils.castView(findRequiredView6, R.id.eht, "field 'mXiguaTaskEveningIv'", RemoteImageView.class);
        this.f74178g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
        videoViewHolder.txtTTFeedback = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e7e, "field 'txtTTFeedback'", DmtTextView.class);
        videoViewHolder.flInteractLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.b2b, "field 'flInteractLayout'", FrameLayout.class);
        videoViewHolder.mCornerTL = (ImageView) Utils.findRequiredViewAsType(view, R.id.a39, "field 'mCornerTL'", ImageView.class);
        videoViewHolder.mCornerTR = (ImageView) Utils.findRequiredViewAsType(view, R.id.a3_, "field 'mCornerTR'", ImageView.class);
        videoViewHolder.mCornerBL = (ImageView) Utils.findRequiredViewAsType(view, R.id.a35, "field 'mCornerBL'", ImageView.class);
        videoViewHolder.mCornerBR = (ImageView) Utils.findRequiredViewAsType(view, R.id.a36, "field 'mCornerBR'", ImageView.class);
        videoViewHolder.mDebugInfoView = (DebugInfoView) Utils.findRequiredViewAsType(view, R.id.a6d, "field 'mDebugInfoView'", DebugInfoView.class);
        videoViewHolder.mPoiDistance = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.cew, "field 'mPoiDistance'", DmtTextView.class);
        videoViewHolder.mPoiDistanceLayout = view.findViewById(R.id.cex);
        videoViewHolder.mlandscapeTipTv = (TextView) Utils.findRequiredViewAsType(view, R.id.bfy, "field 'mlandscapeTipTv'", TextView.class);
        videoViewHolder.mPoiRankWidget = (PoiRankVideoWidget) Utils.findOptionalViewAsType(view, R.id.cg7, "field 'mPoiRankWidget'", PoiRankVideoWidget.class);
        videoViewHolder.commerceTagFrameLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.a0m, "field 'commerceTagFrameLayout'", FrameLayout.class);
        videoViewHolder.commerceGoodHalfCardContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.a09, "field 'commerceGoodHalfCardContainer'", FrameLayout.class);
    }
}
