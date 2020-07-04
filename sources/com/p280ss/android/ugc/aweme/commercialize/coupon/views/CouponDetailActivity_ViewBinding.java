package com.p280ss.android.ugc.aweme.commercialize.coupon.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity_ViewBinding */
public class CouponDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CouponDetailActivity f64878a;

    /* renamed from: b */
    private View f64879b;

    /* renamed from: c */
    private View f64880c;

    /* renamed from: d */
    private View f64881d;

    /* renamed from: e */
    private View f64882e;

    /* renamed from: f */
    private View f64883f;

    /* renamed from: g */
    private View f64884g;

    /* renamed from: h */
    private View f64885h;

    /* renamed from: i */
    private View f64886i;

    public void unbind() {
        CouponDetailActivity couponDetailActivity = this.f64878a;
        if (couponDetailActivity != null) {
            this.f64878a = null;
            couponDetailActivity.mStatusView = null;
            couponDetailActivity.headImageIv = null;
            couponDetailActivity.headImageIvBg = null;
            couponDetailActivity.avatarImageView = null;
            couponDetailActivity.merchantNameTv = null;
            couponDetailActivity.titleView = null;
            couponDetailActivity.couponNumberTv = null;
            couponDetailActivity.couponNumberTitleTv = null;
            couponDetailActivity.couponStatusTv = null;
            couponDetailActivity.validEndTimeTv = null;
            couponDetailActivity.merchantMoreBtn = null;
            couponDetailActivity.merchantPoiList = null;
            couponDetailActivity.merchantPosition = null;
            couponDetailActivity.merchantContact = null;
            couponDetailActivity.merchantDetail = null;
            couponDetailActivity.mQRCodeIV = null;
            couponDetailActivity.mBRCodeIV = null;
            couponDetailActivity.couponRate = null;
            couponDetailActivity.couponUseBt = null;
            couponDetailActivity.couponDivideView = null;
            couponDetailActivity.couponNumberFL = null;
            couponDetailActivity.couponListBt = null;
            couponDetailActivity.mMerchantDetail = null;
            this.f64879b.setOnClickListener(null);
            this.f64879b = null;
            this.f64880c.setOnClickListener(null);
            this.f64880c = null;
            this.f64881d.setOnClickListener(null);
            this.f64881d = null;
            this.f64882e.setOnClickListener(null);
            this.f64882e = null;
            this.f64883f.setOnClickListener(null);
            this.f64883f = null;
            this.f64884g.setOnClickListener(null);
            this.f64884g = null;
            this.f64885h.setOnClickListener(null);
            this.f64885h = null;
            this.f64886i.setOnClickListener(null);
            this.f64886i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CouponDetailActivity_ViewBinding(final CouponDetailActivity couponDetailActivity, View view) {
        this.f64878a = couponDetailActivity;
        couponDetailActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        couponDetailActivity.headImageIv = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.aub, "field 'headImageIv'", RemoteImageView.class);
        couponDetailActivity.headImageIvBg = (ImageView) Utils.findRequiredViewAsType(view, R.id.auc, "field 'headImageIvBg'", ImageView.class);
        couponDetailActivity.avatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.j2, "field 'avatarImageView'", AvatarImageView.class);
        couponDetailActivity.merchantNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.by4, "field 'merchantNameTv'", TextView.class);
        couponDetailActivity.titleView = (TextView) Utils.findRequiredViewAsType(view, R.id.dkn, "field 'titleView'", TextView.class);
        couponDetailActivity.couponNumberTv = (TextView) Utils.findRequiredViewAsType(view, R.id.a4_, "field 'couponNumberTv'", TextView.class);
        couponDetailActivity.couponNumberTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.a49, "field 'couponNumberTitleTv'", TextView.class);
        couponDetailActivity.couponStatusTv = (TextView) Utils.findRequiredViewAsType(view, R.id.a4c, "field 'couponStatusTv'", TextView.class);
        couponDetailActivity.validEndTimeTv = (TextView) Utils.findRequiredViewAsType(view, R.id.e_k, "field 'validEndTimeTv'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b42, "field 'merchantMoreBtn' and method 'onClick'");
        couponDetailActivity.merchantMoreBtn = findRequiredView;
        this.f64879b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.b43, "field 'merchantPoiList' and method 'onClick'");
        couponDetailActivity.merchantPoiList = findRequiredView2;
        this.f64880c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b44, "field 'merchantPosition' and method 'onClick'");
        couponDetailActivity.merchantPosition = findRequiredView3;
        this.f64881d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.b40, "field 'merchantContact' and method 'onClick'");
        couponDetailActivity.merchantContact = findRequiredView4;
        this.f64882e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.b41, "field 'merchantDetail' and method 'onClick'");
        couponDetailActivity.merchantDetail = findRequiredView5;
        this.f64883f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        couponDetailActivity.mQRCodeIV = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.cmi, "field 'mQRCodeIV'", RemoteImageView.class);
        couponDetailActivity.mBRCodeIV = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.ou, "field 'mBRCodeIV'", RemoteImageView.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.a4a, "field 'couponRate' and method 'onClick'");
        couponDetailActivity.couponRate = (DmtTextView) Utils.castView(findRequiredView6, R.id.a4a, "field 'couponRate'", DmtTextView.class);
        this.f64884g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, R.id.a4e, "field 'couponUseBt' and method 'onClick'");
        couponDetailActivity.couponUseBt = (DmtTextView) Utils.castView(findRequiredView7, R.id.a4e, "field 'couponUseBt'", DmtTextView.class);
        this.f64885h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
        couponDetailActivity.couponDivideView = Utils.findRequiredView(view, R.id.a43, "field 'couponDivideView'");
        couponDetailActivity.couponNumberFL = Utils.findRequiredView(view, R.id.a48, "field 'couponNumberFL'");
        couponDetailActivity.couponListBt = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.a47, "field 'couponListBt'", LinearLayout.class);
        couponDetailActivity.mMerchantDetail = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dxr, "field 'mMerchantDetail'", DmtTextView.class);
        View findRequiredView8 = Utils.findRequiredView(view, R.id.jq, "method 'onClick'");
        this.f64886i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponDetailActivity.onClick(view);
            }
        });
    }
}
