package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.widget.MerchantAvatarImageView;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.GotCouponDialog */
public class GotCouponDialog extends Dialog {

    /* renamed from: a */
    private C35298a f92519a;
    MerchantAvatarImageView avatarImageView;

    /* renamed from: b */
    private boolean f92520b;
    RemoteImageView headImageIv;
    ImageView headImageIvBg;
    DmtTextView merchantNameTv;
    TextView tvCongrats;
    TextView tvISee;
    DmtTextView tvTitle;
    View vMask;

    /* renamed from: a */
    private void m113940a() {
        this.f92520b = true;
        ButterKnife.bind((Dialog) this);
        m113941b();
        if (this.f92519a != null) {
            m113942b(this.f92519a);
        }
    }

    /* renamed from: b */
    private void m113941b() {
        float dimensionPixelOffset = (float) getContext().getResources().getDimensionPixelOffset(R.dimen.e8);
        ((C13438a) this.headImageIv.getHierarchy()).mo32897a(RoundingParams.m39400b(dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f));
        ((C13438a) this.headImageIv.getHierarchy()).mo32895a((Drawable) new ColorDrawable(C0683b.m2912c(getContext(), R.color.m9)), C13423b.f35599g);
        this.vMask.setBackground(C23487o.m77134a(Orientation.TOP_BOTTOM, 0, C0683b.m2912c(getContext(), R.color.fn)));
        this.tvTitle.setFontType("");
        this.merchantNameTv.setFontType(C10834d.f29332b);
        this.tvISee.setBackground(C23487o.m77131a(C0683b.m2912c(getContext(), R.color.a2w), (float) C23486n.m77122a(2.0d)));
        this.tvISee.setOnClickListener(new C35307d(this));
        C43081e.m136670a(this.tvISee);
    }

    public GotCouponDialog(Activity activity) {
        super(activity, R.style.uu);
    }

    /* renamed from: a */
    public final void mo89838a(C35298a aVar) {
        m113942b(aVar);
        show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ka);
        m113940a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89837a(View view) {
        dismiss();
        C35454m.m114527a(this.f92519a.f92544c, "click_coupon_toast", C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("enter_method", "click_publish").mo59970a("coupon_id", this.f92519a.f92543b.getCouponId()).mo59973a("poi_id", this.f92519a.f92542a));
    }

    /* renamed from: b */
    private void m113942b(C35298a aVar) {
        this.f92519a = aVar;
        if (this.f92520b) {
            CouponInfo couponInfo = aVar.f92543b;
            C23323e.m76524b(this.headImageIv, couponInfo.getHeadImageUrl());
            C23323e.m76524b(this.avatarImageView, couponInfo.getLogoImageUrl());
            if (couponInfo.isDefaultHeadImage()) {
                this.headImageIvBg.setVisibility(8);
            } else {
                this.headImageIvBg.setVisibility(0);
            }
            this.merchantNameTv.setText(couponInfo.getMerchantName());
            this.tvTitle.setText(couponInfo.getTitle());
        }
    }
}
