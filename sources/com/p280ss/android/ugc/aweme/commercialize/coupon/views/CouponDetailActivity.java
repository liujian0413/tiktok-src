package com.p280ss.android.ugc.aweme.commercialize.coupon.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.coupon.C24575a;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.C24593a;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponCodeStatus;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponMessage;
import com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a.C24577a;
import com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a.C24579b;
import com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a.C24583e;
import com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a.C24584f;
import com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a.C24585g;
import com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a.C24587h;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.websocket.p344ws.output.C45457c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity */
public class CouponDetailActivity extends AmeSSActivity implements C24583e, C24584f {

    /* renamed from: a */
    private C24579b f64867a;
    AvatarImageView avatarImageView;

    /* renamed from: b */
    private C24587h f64868b;

    /* renamed from: c */
    private CouponInfo f64869c;
    View couponDivideView;
    LinearLayout couponListBt;
    View couponNumberFL;
    TextView couponNumberTitleTv;
    TextView couponNumberTv;
    DmtTextView couponRate;
    TextView couponStatusTv;
    DmtTextView couponUseBt;

    /* renamed from: d */
    private int f64870d;

    /* renamed from: e */
    private String f64871e = "";

    /* renamed from: f */
    private String f64872f = "";

    /* renamed from: g */
    private String f64873g = "";

    /* renamed from: h */
    private boolean f64874h;
    RemoteImageView headImageIv;
    ImageView headImageIvBg;

    /* renamed from: i */
    private int f64875i;

    /* renamed from: j */
    private boolean f64876j;

    /* renamed from: k */
    private String f64877k = "";
    RemoteImageView mBRCodeIV;
    DmtTextView mMerchantDetail;
    RemoteImageView mQRCodeIV;
    DmtStatusView mStatusView;
    View merchantContact;
    View merchantDetail;
    View merchantMoreBtn;
    TextView merchantNameTv;
    View merchantPoiList;
    View merchantPosition;
    TextView titleView;
    TextView validEndTimeTv;

    public void onDestroy() {
        C42961az.m136383d(this);
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
    }

    /* renamed from: d */
    private void m80655d() {
        if (this.f64870d == 0 || TextUtils.isEmpty(this.f64871e)) {
            if (isViewValid()) {
                this.mStatusView.mo25944h();
            }
            return;
        }
        this.f64867a.mo64373a(this.f64870d, this.f64871e);
    }

    public void finish() {
        if (this.f64876j && this.f64875i != -1) {
            Intent intent = new Intent();
            intent.putExtra("coupon_list_position", this.f64875i);
            intent.putExtra("coupon_info", this.f64869c);
            setResult(-1, intent);
        }
        super.finish();
    }

    /* renamed from: a */
    private void m80645a() {
        C10805b a = C43361b.m137644a(this, new C24607b(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        this.mStatusView.setBuilder(C10803a.m31631a((Context) this).mo25954a((int) R.string.bzv).mo25966c((View) dmtDefaultView));
        this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.ml));
        ((C13438a) this.headImageIv.getHierarchy()).mo32897a(RoundingParams.m39400b((float) C23486n.m77122a(8.0d), (float) C23486n.m77122a(8.0d), 0.0f, 0.0f));
        C43081e.m136670a(this.merchantPoiList);
        C43081e.m136670a(this.merchantContact);
        C43081e.m136670a(this.merchantDetail);
        C43081e.m136670a(this.merchantMoreBtn);
    }

    /* renamed from: b */
    private void m80649b() {
        this.f64867a = new C24579b(new C24577a(), this);
        this.f64868b = new C24587h(new C24585g(), this);
        try {
            this.f64870d = Integer.parseInt(getIntent().getStringExtra("coupon_id"));
        } catch (Exception unused) {
        }
        this.f64871e = getIntent().getStringExtra("code_id");
        if (!this.mStatusView.f29075b) {
            this.mStatusView.mo25942f();
        }
        this.f64872f = getIntent().getStringExtra("enter_from");
        this.f64873g = getIntent().getStringExtra("previous_page");
        this.f64875i = getIntent().getIntExtra("coupon_list_position", -1);
        this.f64877k = getIntent().getStringExtra("auto_rate");
        m80655d();
    }

    /* renamed from: c */
    private void m80653c() {
        if (!this.f64874h && !TextUtils.isEmpty(this.f64872f) && this.f64869c != null) {
            C6907h.m21524a("click_coupon", (Map) C22984d.m75611a().mo59973a("enter_from", this.f64872f).mo59973a("previous_page", this.f64872f).mo59970a("coupon_id", this.f64869c.getCouponId()).mo59973a("enter_method", "click_message").mo59973a("coupon_type", C24575a.m80615a(this, this.f64869c.getStatus(), true)).mo59973a("source_type", C24575a.m80616a(this.f64869c)).f60753a);
        }
    }

    /* renamed from: f */
    private void m80658f() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "coupon_detail");
        hashMap.put("previous_page", this.f64873g);
        hashMap.put("coupon_code", this.f64869c.getCodeId());
        hashMap.put("poi_id", this.f64869c.validPoiId);
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showPoiRateDialog(this, this.f64869c.validPoiId, this.f64869c.validPoiName, this.f64869c.getCodeId(), this.f64869c.objectType, "", String.valueOf(this.f64869c.getCouponId()), hashMap);
    }

    /* renamed from: e */
    private void m80657e() {
        if (this.f64869c.getStatus() == CouponCodeStatus.StatusValid.value) {
            this.couponStatusTv.setVisibility(8);
            if (this.mQRCodeIV.getVisibility() == 0) {
                this.mQRCodeIV.setImageAlpha(NormalGiftView.ALPHA_255);
            }
            if (this.mBRCodeIV.getVisibility() == 0) {
                this.mBRCodeIV.setImageAlpha(NormalGiftView.ALPHA_255);
            }
        } else {
            this.couponStatusTv.setText(C24575a.m80615a(this, this.f64869c.getStatus(), false));
            this.couponStatusTv.setVisibility(0);
            this.couponNumberTv.setTextColor(getResources().getColor(R.color.mj));
            if (this.mBRCodeIV.getVisibility() == 0) {
                this.mBRCodeIV.setImageAlpha(87);
                LayoutParams layoutParams = (LayoutParams) this.mBRCodeIV.getLayoutParams();
                layoutParams.topMargin = C23486n.m77122a(12.0d);
                this.mBRCodeIV.setLayoutParams(layoutParams);
            }
            if (this.mQRCodeIV.getVisibility() == 0) {
                this.mQRCodeIV.setImageAlpha(87);
                if (this.mBRCodeIV.getVisibility() == 8) {
                    LayoutParams layoutParams2 = (LayoutParams) this.mQRCodeIV.getLayoutParams();
                    layoutParams2.topMargin = C23486n.m77122a(8.0d);
                    this.mQRCodeIV.setLayoutParams(layoutParams2);
                }
            }
            if (m80656d(this.f64869c)) {
                this.couponUseBt.setClickable(false);
                this.couponUseBt.setBackgroundResource(R.drawable.yi);
                LayoutParams layoutParams3 = (LayoutParams) this.couponNumberFL.getLayoutParams();
                layoutParams3.topMargin = C23486n.m77122a(4.0d);
                this.couponNumberFL.setLayoutParams(layoutParams3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64452a(View view) {
        m80655d();
    }

    /* renamed from: a */
    private static boolean m80648a(CouponInfo couponInfo) {
        if (couponInfo.getCouponSource() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m80652b(CouponInfo couponInfo) {
        if (couponInfo.getCouponSource() == 1 && couponInfo.getCouponType() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m80654c(CouponInfo couponInfo) {
        if (couponInfo.getCouponSource() == 1 && couponInfo.getCouponType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m80656d(CouponInfo couponInfo) {
        if (couponInfo.getCouponType() == 1) {
            return true;
        }
        return false;
    }

    @C7709l
    public void onEvent(C45457c cVar) {
        Object obj = cVar.f117066c;
        if (obj != null && (obj instanceof CouponMessage)) {
            m80647a((CouponMessage) obj);
        }
    }

    /* renamed from: a */
    public final void mo64376a(C24593a aVar) {
        if (isViewValid()) {
            this.mStatusView.mo25938c(true);
            m80650b(aVar);
            m80653c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bb);
        ButterKnife.bind((Activity) this);
        m80645a();
        m80649b();
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    private static String m80644a(String str) {
        char[] charArray;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : str.toCharArray()) {
            if (i % 4 == 0) {
                sb.append(" ");
            }
            sb.append(c);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: b */
    private void m80651b(String str) {
        C6907h.m21524a("click_coupon_link", (Map) C22984d.m75611a().mo59973a("enter_from", "coupon_detail").mo59973a("previous_page", "coupon_detail").mo59973a("destination", str).mo59973a("source_type", C24575a.m80616a(this.f64869c)).f60753a);
    }

    /* renamed from: a */
    private void m80647a(CouponMessage couponMessage) {
        if (couponMessage != null && couponMessage.msgType == 1 && TextUtils.equals(this.f64869c.getCodeId(), couponMessage.codeId)) {
            this.f64876j = true;
            this.f64869c.setStatus(CouponCodeStatus.StatusRedeemed.value);
            m80657e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m80650b(com.p280ss.android.ugc.aweme.commercialize.coupon.model.C24593a r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x000b
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r9 = r8.mStatusView
            r9.mo25944h()
            r9 = 0
            r8.f64869c = r9
            return
        L_0x000b:
            com.ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo r9 = r9.f64861a
            r8.f64869c = r9
            if (r9 != 0) goto L_0x0017
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r9 = r8.mStatusView
            r9.mo25944h()
            return
        L_0x0017:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.headImageIv
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r9.getHeadImageUrl()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r8.avatarImageView
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r9.getLogoImageUrl()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r1)
            boolean r0 = r9.isDefaultHeadImage()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x0038
            android.widget.ImageView r0 = r8.headImageIvBg
            r0.setVisibility(r2)
            goto L_0x003d
        L_0x0038:
            android.widget.ImageView r0 = r8.headImageIvBg
            r0.setVisibility(r1)
        L_0x003d:
            android.widget.TextView r0 = r8.titleView
            java.lang.String r3 = r9.getTitle()
            r0.setText(r3)
            android.widget.TextView r0 = r8.merchantNameTv
            java.lang.String r3 = r9.getMerchantName()
            r0.setText(r3)
            android.widget.TextView r0 = r8.validEndTimeTv
            android.content.res.Resources r3 = r8.getResources()
            r4 = 2131822252(0x7f1106ac, float:1.927727E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r9.getValidEnd()
            r5[r1] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            r0.setText(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.mMerchantDetail
            int r3 = r9.getPayType()
            java.lang.String r3 = com.p280ss.android.ugc.aweme.commercialize.coupon.C24575a.m80614a(r8, r3)
            r0.setText(r3)
            android.view.View r0 = r8.merchantPosition
            java.lang.String r3 = r9.getStorePageLink()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0084
            r3 = 8
            goto L_0x0085
        L_0x0084:
            r3 = 0
        L_0x0085:
            r0.setVisibility(r3)
            boolean r0 = r9.canCouponRate()
            if (r0 == 0) goto L_0x0094
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.couponRate
            r0.setVisibility(r1)
            goto L_0x0099
        L_0x0094:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.couponRate
            r0.setVisibility(r2)
        L_0x0099:
            boolean r0 = m80656d(r9)
            r3 = 4625196817309499392(0x4030000000000000, double:16.0)
            if (r0 == 0) goto L_0x00ef
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.mBRCodeIV
            r0.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.mQRCodeIV
            r0.setVisibility(r2)
            int r0 = r9.getStatus()
            com.ss.android.ugc.aweme.commercialize.coupon.model.CouponCodeStatus r5 = com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponCodeStatus.StatusRedeemed
            int r5 = r5.value
            if (r0 != r5) goto L_0x00bb
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.couponUseBt
            r0.setVisibility(r2)
            goto L_0x00c0
        L_0x00bb:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.couponUseBt
            r0.setVisibility(r1)
        L_0x00c0:
            android.view.View r0 = r8.couponDivideView
            r0.setVisibility(r2)
            android.view.View r0 = r8.couponNumberFL
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r5 = 2131165367(0x7f0700b7, float:1.794495E38)
            int r5 = com.p280ss.android.ugc.aweme.base.utils.C23487o.m77129a(r8, r5)
            r0.topMargin = r5
            android.view.View r5 = r8.couponNumberFL
            r5.setLayoutParams(r0)
            android.widget.LinearLayout r0 = r8.couponListBt
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r3 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r3)
            r0.topMargin = r3
            android.widget.LinearLayout r3 = r8.couponListBt
            r3.setLayoutParams(r0)
            goto L_0x0143
        L_0x00ef:
            java.lang.String r0 = r9.getCodabarImageUrl()
            if (r0 == 0) goto L_0x0103
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.mBRCodeIV
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.mBRCodeIV
            java.lang.String r5 = r9.getCodabarImageUrl()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r0, r5)
        L_0x0103:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r9.getQrCodeUrl()
            if (r0 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.mQRCodeIV
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.mBRCodeIV
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L_0x013a
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.mQRCodeIV
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r5 = 4641944578423783424(0x406b800000000000, double:220.0)
            int r7 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r5)
            r0.width = r7
            int r5 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r5)
            r0.height = r5
            int r3 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r3)
            r0.topMargin = r3
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r8.mQRCodeIV
            r3.setLayoutParams(r0)
        L_0x013a:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.mQRCodeIV
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r9.getQrCodeUrl()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r3)
        L_0x0143:
            boolean r0 = m80648a(r9)
            if (r0 == 0) goto L_0x0167
            android.view.View r0 = r8.merchantMoreBtn
            r0.setVisibility(r1)
            android.view.View r0 = r8.merchantPoiList
            java.util.List r3 = r9.getPoiList()
            boolean r3 = com.bytedance.common.utility.collection.C6307b.m19566a(r3)
            if (r3 == 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r2 = 0
        L_0x015c:
            r0.setVisibility(r2)
            android.view.View r0 = r8.merchantContact
            r0.setVisibility(r1)
            android.view.View r0 = r8.merchantDetail
            goto L_0x01ba
        L_0x0167:
            boolean r0 = m80652b(r9)
            if (r0 == 0) goto L_0x0197
            android.view.View r0 = r8.merchantMoreBtn
            r0.setVisibility(r2)
            android.view.View r0 = r8.merchantPoiList
            r0.setVisibility(r2)
            android.view.View r0 = r8.merchantContact
            r0.setVisibility(r2)
            android.view.View r0 = r8.merchantDetail
            java.lang.String r3 = r9.getDetailUrl()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x018a
            r1 = 8
        L_0x018a:
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.couponNumberTv
            java.lang.String r9 = r9.getCode()
            r0.setText(r9)
            goto L_0x01ca
        L_0x0197:
            boolean r0 = m80654c(r9)
            if (r0 == 0) goto L_0x01ca
            android.view.View r0 = r8.merchantMoreBtn
            r0.setVisibility(r2)
            android.view.View r0 = r8.merchantPoiList
            r0.setVisibility(r2)
            android.view.View r0 = r8.merchantContact
            r0.setVisibility(r2)
            android.view.View r0 = r8.merchantDetail
            java.lang.String r3 = r9.getDetailUrl()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x01ba
            r1 = 8
        L_0x01ba:
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.couponNumberTv
            java.lang.String r9 = r9.getCode()
            java.lang.String r9 = m80644a(r9)
            r0.setText(r9)
        L_0x01ca:
            r8.m80657e()
            java.lang.String r9 = r8.f64877k
            java.lang.String r0 = "1"
            boolean r9 = android.text.TextUtils.equals(r9, r0)
            if (r9 == 0) goto L_0x01da
            r8.m80658f()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity.m80650b(com.ss.android.ugc.aweme.commercialize.coupon.model.a):void");
    }

    public void onClick(View view) {
        if (this.f64869c != null) {
            String valueOf = String.valueOf(this.f64869c.getUserId());
            int id = view.getId();
            if (id == R.id.jq) {
                finish();
            } else if (id == R.id.b42) {
                UserProfileActivity.m117394a((Context) this, valueOf, this.f64869c.getSecUid(), "coupon");
                m80651b("others_homepage");
            } else if (id == R.id.b40) {
                this.f64868b.mo64381a(valueOf);
                m80651b("message");
            } else if (id == R.id.b41) {
                m80651b("coupon_desc");
                C25371n.m83460a((Context) this, this.f64869c.getDetailUrl(), "", true, null);
            } else if (id == R.id.b43) {
                if (!C6307b.m19566a((Collection<T>) this.f64869c.getPoiList())) {
                    m80651b("coupon_restaurant");
                    if (this.f64869c.getPoiList().size() == 1) {
                        SmartRouter.buildRoute((Context) this, "//poi/detail").withParam("poi_bundle", (Serializable) new C35109e().mo89342c((String) this.f64869c.getPoiList().get(0)).mo89356q("click_coupon_restaurant").mo89352m("coupon_detail").mo89331a()).open();
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("poi_coupon_id", this.f64870d);
                    bundle.putString("poi_coupon_code_id", this.f64871e);
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openPoiCouponScopeActivity(this, bundle);
                }
            } else if (id == R.id.a4e) {
                m80651b("use_now_h5");
                C25371n.m83460a((Context) this, this.f64869c.getUsePageLink(), getString(R.string.aif), true, null);
            } else if (id == R.id.b44) {
                m80651b("store_h5");
                C25371n.m83460a((Context) this, this.f64869c.getStorePageLink(), "", true, null);
            } else if (id == R.id.a4a && this.f64869c != null) {
                m80658f();
            }
        }
    }

    /* renamed from: a */
    public final void mo64378a(User user) {
        IIMService a = C30553b.m99808a(false);
        if (C30553b.m99785a() && a != null) {
            a.startChat((Context) this, C30553b.m99780a(user));
        }
    }

    /* renamed from: a */
    public final void mo64377a(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.mo25944h();
        }
    }

    /* renamed from: a */
    public static void m80646a(Activity activity, int i, String str, int i2, int i3, String str2) {
        Intent intent = new Intent(activity, CouponDetailActivity.class);
        intent.putExtra("coupon_id", String.valueOf(i));
        intent.putExtra("code_id", str);
        intent.putExtra("coupon_list_position", i2);
        intent.putExtra("previous_page", str2);
        activity.startActivityForResult(intent, i3);
    }
}
