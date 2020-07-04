package com.p280ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.CouponDetail;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.CouponDetailApiResponse;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.CouponRedeemApiResponse;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity */
public class PoiCouponRedeemActivity extends AmeActivity {

    /* renamed from: a */
    private String f64673a;

    /* renamed from: b */
    private String f64674b;

    /* renamed from: c */
    private boolean f64675c;

    /* renamed from: d */
    private CouponDetailApiResponse f64676d;

    /* renamed from: e */
    private CouponDetail f64677e;

    /* renamed from: c */
    private void m80497c() {
        if (!isFinishing()) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f64675c) {
            m80497c();
        }
    }

    /* renamed from: b */
    private void m80496b() {
        setContentView((int) R.layout.dy);
        m80493a((int) R.id.au8, this.f64677e.headImage);
        m80493a((int) R.id.ic, this.f64677e.avatar);
        m80494a((int) R.id.title, this.f64677e.title);
        m80494a((int) R.id.by3, this.f64677e.merchantName);
        m80494a((int) R.id.e__, this.f64677e.username);
        m80492a((int) R.id.sp, (OnClickListener) new C24762j(this));
        m80492a((int) R.id.a10, (OnClickListener) new C24763k(this));
        C43081e.m136670a(findViewById(R.id.a10));
        C43081e.m136670a(findViewById(R.id.sp));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64272a() {
        startActivity(new Intent(this, QRCodePermissionActivity.class));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64273a(View view) {
        m80497c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo64275b(View view) {
        C6907h.m21524a("verify_coupon", (Map) C22984d.m75611a().mo59973a("coupon_id", this.f64673a).mo59973a("action_type", this.f64674b).f60753a);
        view.setEnabled(false);
        C18253l a = CouponRedeemApi.m80559a(this.f64673a);
        a.mo6818a(new C24764l(this, view, a), C23364n.f61448a);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        this.f64676d = (CouponDetailApiResponse) getIntent().getSerializableExtra("coupon");
        this.f64673a = getIntent().getStringExtra("code");
        this.f64674b = getIntent().getStringExtra("action_type");
        this.f64675c = TextUtils.equals(this.f64674b, "scan");
        if (this.f64676d == null || this.f64676d.statusCode != 0 || this.f64676d.coupon == null) {
            View view = new View(this);
            view.setLayoutParams(new LayoutParams(-1, -1));
            view.setBackgroundColor(0);
            setContentView(view);
            if (this.f64676d != null && !TextUtils.isEmpty(this.f64676d.statusMsg)) {
                C10761a.m31403c(getApplicationContext(), this.f64676d.statusMsg).mo25750a();
            }
            if (this.f64675c) {
                new Handler().postDelayed(new C24754i(this), 700);
            } else {
                m80497c();
            }
        } else {
            this.f64677e = this.f64676d.coupon;
            m80496b();
        }
    }

    /* renamed from: a */
    private void m80492a(int i, OnClickListener onClickListener) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    private void m80493a(int i, UrlModel urlModel) {
        if (urlModel != null) {
            RemoteImageView remoteImageView = (RemoteImageView) findViewById(i);
            if (remoteImageView != null) {
                C23323e.m76524b(remoteImageView, urlModel);
            }
        }
    }

    /* renamed from: a */
    private void m80494a(int i, String str) {
        if (str != null) {
            TextView textView = (TextView) findViewById(i);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64274a(View view, C18253l lVar) {
        view.setEnabled(true);
        try {
            CouponRedeemApiResponse couponRedeemApiResponse = (CouponRedeemApiResponse) lVar.get();
            if (couponRedeemApiResponse != null && !TextUtils.isEmpty(couponRedeemApiResponse.statusMsg)) {
                if (couponRedeemApiResponse.statusCode == 0) {
                    C10761a.m31387a(getApplicationContext(), couponRedeemApiResponse.statusMsg).mo25750a();
                } else {
                    C10761a.m31403c(getApplicationContext(), couponRedeemApiResponse.statusMsg).mo25750a();
                }
            }
        } catch (InterruptedException unused) {
        } catch (ExecutionException unused2) {
            C10761a.m31399c(getApplicationContext(), (int) R.string.cjm).mo25750a();
        }
        m80497c();
    }

    /* renamed from: a */
    public static void m80495a(Context context, String str, CouponDetailApiResponse couponDetailApiResponse, String str2) {
        if (context != null && couponDetailApiResponse != null) {
            Intent intent = new Intent(context, PoiCouponRedeemActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("code", str);
            intent.putExtra("coupon", couponDetailApiResponse);
            intent.putExtra("action_type", str2);
            context.startActivity(intent);
        }
    }
}
