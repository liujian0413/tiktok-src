package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.coupon.C24575a;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponCodeStatus;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35005a.C35006a;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35007b;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.PoiCouponLayout */
public class PoiCouponLayout extends RelativeLayout implements C23305g {

    /* renamed from: a */
    private RelativeLayout f92532a;

    /* renamed from: b */
    private RemoteImageView f92533b;

    /* renamed from: c */
    private TextView f92534c;

    /* renamed from: d */
    private TextView f92535d;

    /* renamed from: e */
    private TextView f92536e;

    /* renamed from: f */
    private ImageView f92537f;

    /* renamed from: g */
    private ImageView f92538g;

    /* renamed from: h */
    private CouponInfo f92539h;

    /* renamed from: i */
    private PoiSimpleBundle f92540i;

    /* renamed from: j */
    private C35308e f92541j;

    /* renamed from: a */
    public final void mo58663a() {
        m113948b();
    }

    /* renamed from: a */
    public final void mo58664a(Bundle bundle) {
    }

    /* renamed from: b */
    private void m113948b() {
        if (this.f92541j != null) {
            this.f92541j.mo89725a(this.f92540i.getPoiId(), this.f92539h.getActivityId());
        }
        m113949b(this.f92539h);
    }

    public PoiCouponLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo89842a(CouponInfo couponInfo) {
        if (couponInfo != null && this.f92536e != null) {
            if (couponInfo.getStatus() == CouponCodeStatus.StatusRedeemed.value) {
                this.f92536e.setText(getContext().getString(R.string.ahv));
            } else {
                this.f92536e.setText(getContext().getString(R.string.ai8));
            }
            setOnClickListener(new C35310g(this, couponInfo));
        }
    }

    /* renamed from: b */
    private void m113949b(CouponInfo couponInfo) {
        C35444d.m114486a(getContext(), ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(this.f92540i.getAwemeId()), this.f92540i.getPoiId());
        C35007b.m113007e(new C35006a().mo88754b(this.f92540i.getPoiId()).mo88752a("poi_page").mo88757e(this.f92540i.getPreviousPage()).mo88759g(String.valueOf(couponInfo.getCouponId())).mo88758f("click_button").mo88760h(C24575a.m80615a(getContext(), couponInfo.getStatus(), true)).mo88762j(C24575a.m80616a(couponInfo)).mo88750a(this.f92540i).mo88753a());
    }

    public PoiCouponLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89843a(CouponInfo couponInfo, View view) {
        SmartRouter.buildRoute(getContext(), "//coupon/detail").withParam("coupon_id", String.valueOf(couponInfo.getCouponId())).withParam("code_id", couponInfo.getCodeId()).withParam("previous_page", "poi_page").open();
        m113949b(couponInfo);
    }

    public PoiCouponLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a9u, this);
        this.f92532a = (RelativeLayout) findViewById(R.id.cdh);
        this.f92533b = (RemoteImageView) findViewById(R.id.cdi);
        this.f92534c = (TextView) findViewById(R.id.a46);
        this.f92535d = (TextView) findViewById(R.id.cdl);
        this.f92536e = (TextView) findViewById(R.id.cdk);
        this.f92537f = (ImageView) findViewById(R.id.aza);
        this.f92538g = (ImageView) findViewById(R.id.azb);
    }

    /* renamed from: a */
    public final void mo89844a(CouponInfo couponInfo, C35308e eVar, List<String> list, PoiSimpleBundle poiSimpleBundle) {
        if (couponInfo != null) {
            C28290d.m93043d();
        }
    }
}
