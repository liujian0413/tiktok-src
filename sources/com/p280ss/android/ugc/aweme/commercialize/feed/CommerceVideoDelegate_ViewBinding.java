package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdRatingView;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdTagGroup;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.DescTextView;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p280ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.p280ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.p280ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p280ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate_ViewBinding */
public class CommerceVideoDelegate_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommerceVideoDelegate f65099a;

    /* renamed from: b */
    private View f65100b;

    /* renamed from: c */
    private View f65101c;

    /* renamed from: d */
    private View f65102d;

    /* renamed from: e */
    private View f65103e;

    /* renamed from: f */
    private View f65104f;

    /* renamed from: g */
    private View f65105g;

    /* renamed from: h */
    private View f65106h;

    /* renamed from: i */
    private View f65107i;

    /* renamed from: j */
    private View f65108j;

    /* renamed from: k */
    private View f65109k;

    /* renamed from: l */
    private View f65110l;

    /* renamed from: m */
    private View f65111m;

    /* renamed from: n */
    private View f65112n;

    /* renamed from: o */
    private View f65113o;

    /* renamed from: p */
    private View f65114p;

    /* renamed from: q */
    private View f65115q;

    public void unbind() {
        CommerceVideoDelegate commerceVideoDelegate = this.f65099a;
        if (commerceVideoDelegate != null) {
            this.f65099a = null;
            commerceVideoDelegate.adCircleWaveLayout = null;
            commerceVideoDelegate.oldAdBottomLabelView = null;
            commerceVideoDelegate.newAdBottomLabelView = null;
            commerceVideoDelegate.mAdBackgroundLayout = null;
            commerceVideoDelegate.adHalfWebPageContainer = null;
            commerceVideoDelegate.blackMaskLayer = null;
            commerceVideoDelegate.diggLayout = null;
            commerceVideoDelegate.eggLayout = null;
            commerceVideoDelegate.adRedPacketIv = null;
            commerceVideoDelegate.flAdGuideRoot = null;
            commerceVideoDelegate.feedAdLayout = null;
            commerceVideoDelegate.feedAdDownloadBtn = null;
            commerceVideoDelegate.feedAdReplay = null;
            commerceVideoDelegate.introContainer = null;
            commerceVideoDelegate.mBottomView = null;
            commerceVideoDelegate.adGuideName = null;
            commerceVideoDelegate.adRatingView = null;
            commerceVideoDelegate.adLikeDivide = null;
            commerceVideoDelegate.adAppUseNumber = null;
            commerceVideoDelegate.adLikeLayout = null;
            commerceVideoDelegate.adTagGroup = null;
            commerceVideoDelegate.adGuideDesc = null;
            commerceVideoDelegate.adGuideIcon = null;
            commerceVideoDelegate.adGuideImage = null;
            commerceVideoDelegate.adGuideWebImage = null;
            commerceVideoDelegate.adGuideLabel = null;
            commerceVideoDelegate.adGuideTitle = null;
            commerceVideoDelegate.adPriceLayout = null;
            commerceVideoDelegate.adGuidePrice = null;
            commerceVideoDelegate.adGuideService = null;
            commerceVideoDelegate.mStarAtlasTagLayout = null;
            commerceVideoDelegate.mNationalTaskTagLayout = null;
            commerceVideoDelegate.mLinkTag = null;
            commerceVideoDelegate.mDouPlusLinkTag = null;
            commerceVideoDelegate.mIvRelieveTag = null;
            commerceVideoDelegate.mMicroTag = null;
            commerceVideoDelegate.vastAdTag = null;
            commerceVideoDelegate.vastAdTagAdChoice = null;
            commerceVideoDelegate.vastAdTagText = null;
            commerceVideoDelegate.feedStarAtlasCheckLL = null;
            commerceVideoDelegate.starAtlasCheckHintTv = null;
            commerceVideoDelegate.adFeeDeductionLayout = null;
            commerceVideoDelegate.feeDeductionHint = null;
            this.f65100b.setOnClickListener(null);
            this.f65100b = null;
            this.f65101c.setOnClickListener(null);
            this.f65101c = null;
            this.f65102d.setOnClickListener(null);
            this.f65102d = null;
            this.f65103e.setOnClickListener(null);
            this.f65103e = null;
            this.f65104f.setOnClickListener(null);
            this.f65104f = null;
            this.f65105g.setOnClickListener(null);
            this.f65105g = null;
            this.f65106h.setOnClickListener(null);
            this.f65106h = null;
            this.f65107i.setOnClickListener(null);
            this.f65107i = null;
            this.f65108j.setOnClickListener(null);
            this.f65108j = null;
            this.f65109k.setOnClickListener(null);
            this.f65109k = null;
            this.f65110l.setOnClickListener(null);
            this.f65110l = null;
            this.f65111m.setOnClickListener(null);
            this.f65111m = null;
            this.f65112n.setOnClickListener(null);
            this.f65112n = null;
            this.f65113o.setOnClickListener(null);
            this.f65113o = null;
            this.f65114p.setOnClickListener(null);
            this.f65114p = null;
            this.f65115q.setOnClickListener(null);
            this.f65115q = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommerceVideoDelegate_ViewBinding(final CommerceVideoDelegate commerceVideoDelegate, View view) {
        this.f65099a = commerceVideoDelegate;
        commerceVideoDelegate.adCircleWaveLayout = (CircleWaveLayout) Utils.findRequiredViewAsType(view, R.id.bi, "field 'adCircleWaveLayout'", CircleWaveLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.c8c, "field 'oldAdBottomLabelView' and method 'onClick'");
        commerceVideoDelegate.oldAdBottomLabelView = (StripAdBottomLabelView) Utils.castView(findRequiredView, R.id.c8c, "field 'oldAdBottomLabelView'", StripAdBottomLabelView.class);
        this.f65100b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.c3r, "field 'newAdBottomLabelView' and method 'onClick'");
        commerceVideoDelegate.newAdBottomLabelView = (ButtonAdBottomLabelView) Utils.castView(findRequiredView2, R.id.c3r, "field 'newAdBottomLabelView'", ButtonAdBottomLabelView.class);
        this.f65101c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.mAdBackgroundLayout = Utils.findRequiredView(view, R.id.nn, "field 'mAdBackgroundLayout'");
        commerceVideoDelegate.adHalfWebPageContainer = (AdHalfWebPageContainer) Utils.findRequiredViewAsType(view, R.id.by, "field 'adHalfWebPageContainer'", AdHalfWebPageContainer.class);
        commerceVideoDelegate.blackMaskLayer = (AdHalfWebPageMaskLayer) Utils.findRequiredViewAsType(view, R.id.mq, "field 'blackMaskLayer'", AdHalfWebPageMaskLayer.class);
        commerceVideoDelegate.diggLayout = (CommerceLikeLayout) Utils.findRequiredViewAsType(view, R.id.bp, "field 'diggLayout'", CommerceLikeLayout.class);
        commerceVideoDelegate.eggLayout = (CommerceEggLayout) Utils.findRequiredViewAsType(view, R.id.a0o, "field 'eggLayout'", CommerceEggLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.d6, "field 'adRedPacketIv' and method 'onClick'");
        commerceVideoDelegate.adRedPacketIv = (RemoteImageView) Utils.castView(findRequiredView3, R.id.d6, "field 'adRedPacketIv'", RemoteImageView.class);
        this.f65102d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.flAdGuideRoot = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.bx, "field 'flAdGuideRoot'", FrameLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.aj7, "field 'feedAdLayout' and method 'onClick'");
        commerceVideoDelegate.feedAdLayout = (LinearLayout) Utils.castView(findRequiredView4, R.id.aj7, "field 'feedAdLayout'", LinearLayout.class);
        this.f65103e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.aj4, "field 'feedAdDownloadBtn' and method 'onClick'");
        commerceVideoDelegate.feedAdDownloadBtn = (TextView) Utils.castView(findRequiredView5, R.id.aj4, "field 'feedAdDownloadBtn'", TextView.class);
        this.f65104f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.aj8, "field 'feedAdReplay' and method 'onClick'");
        commerceVideoDelegate.feedAdReplay = findRequiredView6;
        this.f65105g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.introContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.jh, "field 'introContainer'", LinearLayout.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.nk, "field 'mBottomView' and method 'onClick'");
        commerceVideoDelegate.mBottomView = (FrameLayout) Utils.castView(findRequiredView7, R.id.nk, "field 'mBottomView'", FrameLayout.class);
        this.f65106h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.cj, "field 'adGuideName' and method 'onClick'");
        commerceVideoDelegate.adGuideName = (DmtTextView) Utils.castView(findRequiredView8, R.id.cj, "field 'adGuideName'", DmtTextView.class);
        this.f65107i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.adRatingView = (AdRatingView) Utils.findRequiredViewAsType(view, R.id.d3, "field 'adRatingView'", AdRatingView.class);
        commerceVideoDelegate.adLikeDivide = Utils.findRequiredView(view, R.id.cc, "field 'adLikeDivide'");
        commerceVideoDelegate.adAppUseNumber = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.b8, "field 'adAppUseNumber'", DmtTextView.class);
        View findRequiredView9 = Utils.findRequiredView(view, R.id.cf, "field 'adLikeLayout' and method 'onClick'");
        commerceVideoDelegate.adLikeLayout = (LinearLayout) Utils.castView(findRequiredView9, R.id.cf, "field 'adLikeLayout'", LinearLayout.class);
        this.f65108j = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, R.id.dm, "field 'adTagGroup' and method 'onClick'");
        commerceVideoDelegate.adTagGroup = (AdTagGroup) Utils.castView(findRequiredView10, R.id.dm, "field 'adTagGroup'", AdTagGroup.class);
        this.f65109k = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, R.id.bm, "field 'adGuideDesc' and method 'onClick'");
        commerceVideoDelegate.adGuideDesc = (DescTextView) Utils.castView(findRequiredView11, R.id.bm, "field 'adGuideDesc'", DescTextView.class);
        this.f65110l = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, R.id.c3, "field 'adGuideIcon' and method 'onClick'");
        commerceVideoDelegate.adGuideIcon = (RemoteImageView) Utils.castView(findRequiredView12, R.id.c3, "field 'adGuideIcon'", RemoteImageView.class);
        this.f65111m = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, R.id.c7, "field 'adGuideImage' and method 'onClick'");
        commerceVideoDelegate.adGuideImage = (RemoteImageView) Utils.castView(findRequiredView13, R.id.c7, "field 'adGuideImage'", RemoteImageView.class);
        this.f65112n = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, R.id.du, "field 'adGuideWebImage' and method 'onClick'");
        commerceVideoDelegate.adGuideWebImage = (RemoteImageView) Utils.castView(findRequiredView14, R.id.du, "field 'adGuideWebImage'", RemoteImageView.class);
        this.f65113o = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.adGuideLabel = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c_, "field 'adGuideLabel'", DmtTextView.class);
        commerceVideoDelegate.adGuideTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dn, "field 'adGuideTitle'", DmtTextView.class);
        View findRequiredView15 = Utils.findRequiredView(view, R.id.d2, "field 'adPriceLayout' and method 'onClick'");
        commerceVideoDelegate.adPriceLayout = (LinearLayout) Utils.castView(findRequiredView15, R.id.d2, "field 'adPriceLayout'", LinearLayout.class);
        this.f65114p = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.adGuidePrice = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d1, "field 'adGuidePrice'", DmtTextView.class);
        commerceVideoDelegate.adGuideService = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d7, "field 'adGuideService'", DmtTextView.class);
        commerceVideoDelegate.mStarAtlasTagLayout = (StarAtlasTagLayout) Utils.findOptionalViewAsType(view, R.id.d_e, "field 'mStarAtlasTagLayout'", StarAtlasTagLayout.class);
        commerceVideoDelegate.mNationalTaskTagLayout = (NationalTaskTagLayout) Utils.findOptionalViewAsType(view, R.id.dgm, "field 'mNationalTaskTagLayout'", NationalTaskTagLayout.class);
        commerceVideoDelegate.mLinkTag = (CommerceTagLayout) Utils.findOptionalViewAsType(view, R.id.bmy, "field 'mLinkTag'", CommerceTagLayout.class);
        commerceVideoDelegate.mDouPlusLinkTag = (DouPlusTagLayout) Utils.findOptionalViewAsType(view, R.id.a_r, "field 'mDouPlusLinkTag'", DouPlusTagLayout.class);
        commerceVideoDelegate.mIvRelieveTag = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.ebg, "field 'mIvRelieveTag'", AnimationImageView.class);
        commerceVideoDelegate.mMicroTag = (CommerceMicroTagLayout) Utils.findOptionalViewAsType(view, R.id.byo, "field 'mMicroTag'", CommerceMicroTagLayout.class);
        commerceVideoDelegate.vastAdTag = (ViewGroup) Utils.findOptionalViewAsType(view, R.id.e_m, "field 'vastAdTag'", ViewGroup.class);
        commerceVideoDelegate.vastAdTagAdChoice = (RemoteImageView) Utils.findOptionalViewAsType(view, R.id.e_n, "field 'vastAdTagAdChoice'", RemoteImageView.class);
        commerceVideoDelegate.vastAdTagText = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.e_o, "field 'vastAdTagText'", DmtTextView.class);
        commerceVideoDelegate.feedStarAtlasCheckLL = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ajk, "field 'feedStarAtlasCheckLL'", LinearLayout.class);
        commerceVideoDelegate.starAtlasCheckHintTv = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d_c, "field 'starAtlasCheckHintTv'", DmtTextView.class);
        commerceVideoDelegate.adFeeDeductionLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bt, "field 'adFeeDeductionLayout'", LinearLayout.class);
        commerceVideoDelegate.feeDeductionHint = (TextView) Utils.findRequiredViewAsType(view, R.id.aj3, "field 'feeDeductionHint'", TextView.class);
        View findRequiredView16 = Utils.findRequiredView(view, R.id.f124296do, "method 'onClick'");
        this.f65115q = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
    }
}
