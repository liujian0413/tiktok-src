package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.poi.map.MapLayout;
import com.p280ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.AbsSlidablePoiAwemeFeedFragment_ViewBinding */
public class AbsSlidablePoiAwemeFeedFragment_ViewBinding extends AbsPoiAwemeFeedFragment_ViewBinding {

    /* renamed from: a */
    private AbsSlidablePoiAwemeFeedFragment f92371a;

    /* renamed from: b */
    private View f92372b;

    /* renamed from: c */
    private View f92373c;

    /* renamed from: d */
    private View f92374d;

    /* renamed from: e */
    private View f92375e;

    /* renamed from: f */
    private View f92376f;

    public void unbind() {
        AbsSlidablePoiAwemeFeedFragment absSlidablePoiAwemeFeedFragment = this.f92371a;
        if (absSlidablePoiAwemeFeedFragment != null) {
            this.f92371a = null;
            absSlidablePoiAwemeFeedFragment.mPoiMap = null;
            absSlidablePoiAwemeFeedFragment.mBannerVPer = null;
            absSlidablePoiAwemeFeedFragment.mStatusBar = null;
            absSlidablePoiAwemeFeedFragment.mIndicatorView = null;
            absSlidablePoiAwemeFeedFragment.mHeader = null;
            absSlidablePoiAwemeFeedFragment.mUploadImage = null;
            absSlidablePoiAwemeFeedFragment.mTopbar = null;
            absSlidablePoiAwemeFeedFragment.mTopbarStatus = null;
            absSlidablePoiAwemeFeedFragment.mTopbarBg = null;
            absSlidablePoiAwemeFeedFragment.mRouteStatus = null;
            absSlidablePoiAwemeFeedFragment.mTopCollectImg = null;
            absSlidablePoiAwemeFeedFragment.mCollectContainer = null;
            absSlidablePoiAwemeFeedFragment.mPoiMore = null;
            absSlidablePoiAwemeFeedFragment.mPoiHeaderLayout = null;
            absSlidablePoiAwemeFeedFragment.mTitleBarBg = null;
            absSlidablePoiAwemeFeedFragment.mBackBtn = null;
            absSlidablePoiAwemeFeedFragment.mShareBtn = null;
            absSlidablePoiAwemeFeedFragment.mMoreActionBtn = null;
            absSlidablePoiAwemeFeedFragment.mTitleBarTools = null;
            this.f92372b.setOnClickListener(null);
            this.f92372b = null;
            this.f92373c.setOnClickListener(null);
            this.f92373c = null;
            this.f92374d.setOnClickListener(null);
            this.f92374d = null;
            this.f92375e.setOnClickListener(null);
            this.f92375e = null;
            this.f92376f.setOnClickListener(null);
            this.f92376f = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsSlidablePoiAwemeFeedFragment_ViewBinding(final AbsSlidablePoiAwemeFeedFragment absSlidablePoiAwemeFeedFragment, View view) {
        super(absSlidablePoiAwemeFeedFragment, view);
        this.f92371a = absSlidablePoiAwemeFeedFragment;
        absSlidablePoiAwemeFeedFragment.mPoiMap = (MapLayout) Utils.findRequiredViewAsType(view, R.id.cgl, "field 'mPoiMap'", MapLayout.class);
        absSlidablePoiAwemeFeedFragment.mBannerVPer = (BannerViewPager) Utils.findRequiredViewAsType(view, R.id.edp, "field 'mBannerVPer'", BannerViewPager.class);
        absSlidablePoiAwemeFeedFragment.mStatusBar = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBar'");
        absSlidablePoiAwemeFeedFragment.mIndicatorView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e6w, "field 'mIndicatorView'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.cdt, "field 'mHeader' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mHeader = findRequiredView;
        this.f92372b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.chm, "field 'mUploadImage' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mUploadImage = (ImageView) Utils.castView(findRequiredView2, R.id.chm, "field 'mUploadImage'", ImageView.class);
        this.f92373c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        absSlidablePoiAwemeFeedFragment.mTopbar = Utils.findRequiredView(view, R.id.dke, "field 'mTopbar'");
        absSlidablePoiAwemeFeedFragment.mTopbarStatus = Utils.findRequiredView(view, R.id.cgr, "field 'mTopbarStatus'");
        absSlidablePoiAwemeFeedFragment.mTopbarBg = Utils.findRequiredView(view, R.id.cgp, "field 'mTopbarBg'");
        absSlidablePoiAwemeFeedFragment.mRouteStatus = Utils.findRequiredView(view, R.id.cgn, "field 'mRouteStatus'");
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b7l, "field 'mTopCollectImg' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mTopCollectImg = (CheckableImageView) Utils.castView(findRequiredView3, R.id.b7l, "field 'mTopCollectImg'", CheckableImageView.class);
        this.f92374d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        absSlidablePoiAwemeFeedFragment.mCollectContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.y1, "field 'mCollectContainer'", ViewGroup.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.ceh, "field 'mPoiMore' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mPoiMore = findRequiredView4;
        this.f92375e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        absSlidablePoiAwemeFeedFragment.mPoiHeaderLayout = (PoiHeaderLayout) Utils.findOptionalViewAsType(view, R.id.cf6, "field 'mPoiHeaderLayout'", PoiHeaderLayout.class);
        absSlidablePoiAwemeFeedFragment.mTitleBarBg = Utils.findRequiredView(view, R.id.ch7, "field 'mTitleBarBg'");
        absSlidablePoiAwemeFeedFragment.mBackBtn = (AutoRTLImageView) Utils.findRequiredViewAsType(view, R.id.jo, "field 'mBackBtn'", AutoRTLImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.d4t, "field 'mShareBtn' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mShareBtn = (ImageView) Utils.castView(findRequiredView5, R.id.d4t, "field 'mShareBtn'", ImageView.class);
        this.f92376f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        absSlidablePoiAwemeFeedFragment.mMoreActionBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.bzv, "field 'mMoreActionBtn'", ImageView.class);
        absSlidablePoiAwemeFeedFragment.mTitleBarTools = Utils.findRequiredView(view, R.id.cgs, "field 'mTitleBarTools'");
    }
}
