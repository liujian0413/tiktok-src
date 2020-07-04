package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.PoiAdLayout;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.PoiCouponLayout;
import com.p280ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout;
import com.p280ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout;
import com.p280ss.android.ugc.aweme.poi.widget.PoiActsFlipperView;
import com.p280ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder_ViewBinding */
public class PoiOptimizedDetailViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiOptimizedDetailViewHolder f91550a;

    /* renamed from: b */
    private View f91551b;

    /* renamed from: c */
    private View f91552c;

    /* renamed from: d */
    private View f91553d;

    /* renamed from: e */
    private View f91554e;

    /* renamed from: f */
    private View f91555f;

    /* renamed from: g */
    private View f91556g;

    /* renamed from: h */
    private View f91557h;

    /* renamed from: i */
    private View f91558i;

    public void unbind() {
        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.f91550a;
        if (poiOptimizedDetailViewHolder != null) {
            this.f91550a = null;
            poiOptimizedDetailViewHolder.mPoiAddrDivider = null;
            poiOptimizedDetailViewHolder.mPoiAddrLayout = null;
            poiOptimizedDetailViewHolder.mPoiDistance = null;
            poiOptimizedDetailViewHolder.mPhoneDivider = null;
            poiOptimizedDetailViewHolder.mPhone = null;
            poiOptimizedDetailViewHolder.mPhoneLayout = null;
            poiOptimizedDetailViewHolder.mDetailDescLayout = null;
            poiOptimizedDetailViewHolder.mDetailDesc = null;
            poiOptimizedDetailViewHolder.mPoiAddr = null;
            poiOptimizedDetailViewHolder.mPoiRank = null;
            poiOptimizedDetailViewHolder.mPoiRankLayout = null;
            poiOptimizedDetailViewHolder.mPoiContentLayout = null;
            poiOptimizedDetailViewHolder.mPoiCouponLayout = null;
            poiOptimizedDetailViewHolder.mPoiAdLayout = null;
            poiOptimizedDetailViewHolder.mPoiReserveAndQueueLayout = null;
            poiOptimizedDetailViewHolder.mPoiReserve = null;
            poiOptimizedDetailViewHolder.mPoiQueue = null;
            poiOptimizedDetailViewHolder.mPoiQueueDivider = null;
            poiOptimizedDetailViewHolder.mPoiReserveAndQueueDivider = null;
            poiOptimizedDetailViewHolder.mPoiCollectLayout = null;
            poiOptimizedDetailViewHolder.mBusinessComponent = null;
            poiOptimizedDetailViewHolder.mActsView = null;
            poiOptimizedDetailViewHolder.mActsLayout = null;
            poiOptimizedDetailViewHolder.mMerchantActsView = null;
            poiOptimizedDetailViewHolder.mMerchantActsLayout = null;
            poiOptimizedDetailViewHolder.mPoiHeaderLayout = null;
            poiOptimizedDetailViewHolder.mPoiNavi = null;
            poiOptimizedDetailViewHolder.mPoiNaviDivider = null;
            poiOptimizedDetailViewHolder.mRankMore = null;
            poiOptimizedDetailViewHolder.mActMore = null;
            poiOptimizedDetailViewHolder.mMerchantMore = null;
            this.f91551b.setOnClickListener(null);
            this.f91551b = null;
            this.f91552c.setOnClickListener(null);
            this.f91552c = null;
            this.f91553d.setOnClickListener(null);
            this.f91553d = null;
            this.f91554e.setOnClickListener(null);
            this.f91554e = null;
            this.f91555f.setOnClickListener(null);
            this.f91555f = null;
            this.f91556g.setOnClickListener(null);
            this.f91556g = null;
            this.f91557h.setOnClickListener(null);
            this.f91557h = null;
            this.f91558i.setOnClickListener(null);
            this.f91558i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiOptimizedDetailViewHolder_ViewBinding(final PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder, View view) {
        this.f91550a = poiOptimizedDetailViewHolder;
        poiOptimizedDetailViewHolder.mPoiAddrDivider = Utils.findRequiredView(view, R.id.cdx, "field 'mPoiAddrDivider'");
        View findRequiredView = Utils.findRequiredView(view, R.id.cdy, "field 'mPoiAddrLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiAddrLayout = findRequiredView;
        this.f91551b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPoiDistance = (TextView) Utils.findRequiredViewAsType(view, R.id.ce3, "field 'mPoiDistance'", TextView.class);
        poiOptimizedDetailViewHolder.mPhoneDivider = Utils.findRequiredView(view, R.id.ce9, "field 'mPhoneDivider'");
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ce8, "field 'mPhone' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPhone = findRequiredView2;
        this.f91552c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPhoneLayout = Utils.findRequiredView(view, R.id.ce_, "field 'mPhoneLayout'");
        View findRequiredView3 = Utils.findRequiredView(view, R.id.cds, "field 'mDetailDescLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mDetailDescLayout = findRequiredView3;
        this.f91553d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mDetailDesc = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.cdr, "field 'mDetailDesc'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiAddr = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.cdv, "field 'mPoiAddr'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiRank = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.ceq, "field 'mPoiRank'", CompoundDrawableAndTextLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.cer, "field 'mPoiRankLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiRankLayout = findRequiredView4;
        this.f91554e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPoiContentLayout = Utils.findRequiredView(view, R.id.cdq, "field 'mPoiContentLayout'");
        poiOptimizedDetailViewHolder.mPoiCouponLayout = (PoiCouponLayout) Utils.findRequiredViewAsType(view, R.id.cdj, "field 'mPoiCouponLayout'", PoiCouponLayout.class);
        poiOptimizedDetailViewHolder.mPoiAdLayout = (PoiAdLayout) Utils.findRequiredViewAsType(view, R.id.cct, "field 'mPoiAdLayout'", PoiAdLayout.class);
        poiOptimizedDetailViewHolder.mPoiReserveAndQueueLayout = Utils.findRequiredView(view, R.id.ceu, "field 'mPoiReserveAndQueueLayout'");
        poiOptimizedDetailViewHolder.mPoiReserve = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.cet, "field 'mPoiReserve'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiQueue = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.ceo, "field 'mPoiQueue'", CompoundDrawableAndTextLayout.class);
        poiOptimizedDetailViewHolder.mPoiQueueDivider = Utils.findRequiredView(view, R.id.cep, "field 'mPoiQueueDivider'");
        poiOptimizedDetailViewHolder.mPoiReserveAndQueueDivider = Utils.findRequiredView(view, R.id.cev, "field 'mPoiReserveAndQueueDivider'");
        View findRequiredView5 = Utils.findRequiredView(view, R.id.ce0, "field 'mPoiCollectLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiCollectLayout = findRequiredView5;
        this.f91555f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mBusinessComponent = (HorizontalBusinessComponentLayout) Utils.findRequiredViewAsType(view, R.id.cdp, "field 'mBusinessComponent'", HorizontalBusinessComponentLayout.class);
        poiOptimizedDetailViewHolder.mActsView = (PoiActsFlipperView) Utils.findRequiredViewAsType(view, R.id.cdm, "field 'mActsView'", PoiActsFlipperView.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.cdn, "field 'mActsLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mActsLayout = findRequiredView6;
        this.f91556g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mMerchantActsView = (CompoundDrawableAndTextLayout) Utils.findRequiredViewAsType(view, R.id.cfh, "field 'mMerchantActsView'", CompoundDrawableAndTextLayout.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.cfi, "field 'mMerchantActsLayout' and method 'onClick'");
        poiOptimizedDetailViewHolder.mMerchantActsLayout = findRequiredView7;
        this.f91557h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPoiHeaderLayout = (PoiHeaderLayout) Utils.findRequiredViewAsType(view, R.id.cf6, "field 'mPoiHeaderLayout'", PoiHeaderLayout.class);
        View findRequiredView8 = Utils.findRequiredView(view, R.id.ce6, "field 'mPoiNavi' and method 'onClick'");
        poiOptimizedDetailViewHolder.mPoiNavi = findRequiredView8;
        this.f91558i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedDetailViewHolder.onClick(view);
            }
        });
        poiOptimizedDetailViewHolder.mPoiNaviDivider = Utils.findRequiredView(view, R.id.ce7, "field 'mPoiNaviDivider'");
        poiOptimizedDetailViewHolder.mRankMore = Utils.findRequiredView(view, R.id.ces, "field 'mRankMore'");
        poiOptimizedDetailViewHolder.mActMore = Utils.findRequiredView(view, R.id.cdo, "field 'mActMore'");
        poiOptimizedDetailViewHolder.mMerchantMore = Utils.findRequiredView(view, R.id.cfj, "field 'mMerchantMore'");
    }
}
