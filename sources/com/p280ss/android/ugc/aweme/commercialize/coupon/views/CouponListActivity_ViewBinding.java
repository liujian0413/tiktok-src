package com.p280ss.android.ugc.aweme.commercialize.coupon.views;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity_ViewBinding */
public class CouponListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CouponListActivity f64908a;

    /* renamed from: b */
    private View f64909b;

    /* renamed from: c */
    private View f64910c;

    public void unbind() {
        CouponListActivity couponListActivity = this.f64908a;
        if (couponListActivity != null) {
            this.f64908a = null;
            couponListActivity.title = null;
            couponListActivity.mStatusView = null;
            couponListActivity.mListView = null;
            couponListActivity.merchantTv = null;
            this.f64909b.setOnClickListener(null);
            this.f64909b = null;
            this.f64910c.setOnClickListener(null);
            this.f64910c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CouponListActivity_ViewBinding(final CouponListActivity couponListActivity, View view) {
        this.f64908a = couponListActivity;
        couponListActivity.title = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'title'", DmtTextView.class);
        couponListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        couponListActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mListView'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.by5, "field 'merchantTv' and method 'onClick'");
        couponListActivity.merchantTv = (TextView) Utils.castView(findRequiredView, R.id.by5, "field 'merchantTv'", TextView.class);
        this.f64909b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponListActivity.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.jq, "method 'onClick'");
        this.f64910c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponListActivity.onClick(view);
            }
        });
    }
}
