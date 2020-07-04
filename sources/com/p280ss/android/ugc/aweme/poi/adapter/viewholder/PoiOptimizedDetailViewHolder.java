package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.C35014c;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.model.PoiActivityInfo;
import com.p280ss.android.ugc.aweme.poi.model.PoiClassRankStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35007b;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35392m;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35409r;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35411t;
import com.p280ss.android.ugc.aweme.poi.p335ui.PoiNoticeActivity;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35308e;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.PoiAdLayout;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.PoiCouponLayout;
import com.p280ss.android.ugc.aweme.poi.utils.C35440a;
import com.p280ss.android.ugc.aweme.poi.utils.C35441aa;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import com.p280ss.android.ugc.aweme.poi.widget.C35488e;
import com.p280ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout;
import com.p280ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout;
import com.p280ss.android.ugc.aweme.poi.widget.PoiActsFlipperView;
import com.p280ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder */
public class PoiOptimizedDetailViewHolder extends C1293v {

    /* renamed from: a */
    public Context f91537a;

    /* renamed from: b */
    private PoiDetail f91538b;

    /* renamed from: c */
    private PoiStruct f91539c;

    /* renamed from: d */
    private double f91540d;

    /* renamed from: e */
    private double f91541e;

    /* renamed from: f */
    private LocationResult f91542f;

    /* renamed from: g */
    private double f91543g;

    /* renamed from: h */
    private double f91544h;

    /* renamed from: i */
    private AbsFragment f91545i;

    /* renamed from: j */
    private C35392m f91546j = new C35392m();

    /* renamed from: k */
    private C35025a f91547k;

    /* renamed from: l */
    private C35014c f91548l;

    /* renamed from: m */
    private PoiSimpleBundle f91549m;
    protected View mActMore;
    protected View mActsLayout;
    protected PoiActsFlipperView mActsView;
    protected HorizontalBusinessComponentLayout mBusinessComponent;
    protected CompoundDrawableAndTextLayout mDetailDesc;
    protected View mDetailDescLayout;
    protected View mMerchantActsLayout;
    protected CompoundDrawableAndTextLayout mMerchantActsView;
    protected View mMerchantMore;
    protected View mPhone;
    protected View mPhoneDivider;
    protected View mPhoneLayout;
    protected PoiAdLayout mPoiAdLayout;
    protected CompoundDrawableAndTextLayout mPoiAddr;
    protected View mPoiAddrDivider;
    protected View mPoiAddrLayout;
    protected View mPoiCollectLayout;
    protected View mPoiContentLayout;
    protected PoiCouponLayout mPoiCouponLayout;
    protected TextView mPoiDistance;
    protected PoiHeaderLayout mPoiHeaderLayout;
    protected View mPoiNavi;
    protected View mPoiNaviDivider;
    protected CompoundDrawableAndTextLayout mPoiQueue;
    protected View mPoiQueueDivider;
    protected CompoundDrawableAndTextLayout mPoiRank;
    protected View mPoiRankLayout;
    protected CompoundDrawableAndTextLayout mPoiReserve;
    protected View mPoiReserveAndQueueDivider;
    protected View mPoiReserveAndQueueLayout;
    protected View mRankMore;

    /* renamed from: f */
    private String m113088f() {
        if (this.f91539c != null) {
            return this.f91539c.poiName;
        }
        return "";
    }

    /* renamed from: a */
    public final void mo88810a() {
        if (this.f91546j != null) {
            this.f91546j.mo90123b();
        }
    }

    /* renamed from: b */
    public final void mo88815b() {
        if (this.mActsView != null) {
            this.mActsView.mo90208b();
        }
    }

    /* renamed from: c */
    public final void mo88817c() {
        if (this.mActsView != null) {
            this.mActsView.mo90206a();
        }
    }

    /* renamed from: g */
    private void m113089g() {
        if (this.f91538b != null && !C6319n.m19593a(this.f91538b.getEnterpriseId())) {
            C35462r.m114555a(this.f91537a, this.f91538b, this.f91549m.getAwemeId());
        }
    }

    /* renamed from: p */
    private void m113098p() {
        String poiRank = this.f91538b.getPoiRank();
        if (!C6319n.m19593a(poiRank)) {
            m113099q();
            this.mPoiRankLayout.setVisibility(0);
            this.mPoiRank.setText(poiRank);
        }
    }

    /* renamed from: u */
    private void m113103u() {
        String desc = this.f91538b.getDesc();
        if (!C6319n.m19593a(desc)) {
            this.mDetailDescLayout.setVisibility(0);
            this.mDetailDesc.setText(desc);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo88821e() {
        C35045e.m113153a(this.f91537a, this.f91538b.getBookUrl(), this.f91537a.getResources().getString(R.string.d0d));
    }

    /* renamed from: i */
    private void m113091i() {
        C35409r.f92878a = "poi_page";
        C35007b.m113003a("click", "queue", "poi_page", "poi_page", this.f91549m);
        C35045e.m113152a(this.f91537a, this.f91538b.poiCommodity, "poi_page", this.f91538b.getLat(), this.f91538b.getLng(), this.f91538b.getQueueUrl());
    }

    /* renamed from: k */
    private boolean m113093k() {
        if (!C35462r.m114566a(this.f91540d, this.f91541e) || !C35462r.m114566a(this.f91543g, this.f91544h) || !C35441aa.m114462a(this.f91539c, this.f91542f)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m113094l() {
        mo88819d();
        this.mPoiAddr.mo90198a(this.f91539c, R.drawable.axt);
        C35462r.m114563a(this.mPoiAddrLayout, this.mPoiAddr.getTextView().getText(), this.f91537a, (int) R.string.cy3, "poi_address", this.f91538b, this.f91549m.getPreviousPage());
    }

    /* renamed from: n */
    private boolean m113096n() {
        if (C6319n.m19593a(this.f91538b.getPhone())) {
            return false;
        }
        this.mPhone.setVisibility(0);
        this.mPhoneDivider.setVisibility(0);
        if (this.mPoiNavi.getVisibility() == 8) {
            ((LayoutParams) this.mPhoneDivider.getLayoutParams()).leftMargin = 0;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo88819d() {
        if (!m113093k()) {
            this.mPoiDistance.setVisibility(8);
        } else if (!C6399b.m19944t()) {
            this.mPoiDistance.setVisibility(0);
            this.mPoiDistance.setText(C35442b.m114472b(this.f91537a, this.f91540d, this.f91541e, this.f91543g, this.f91544h));
        } else {
            this.mPoiDistance.setVisibility(8);
        }
    }

    /* renamed from: h */
    private void m113090h() {
        C35444d.m114487a(this.f91537a, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(this.f91549m.getAwemeId()), "reserve", this.f91549m.getPoiId());
        C35409r.f92878a = "poi_page";
        C35007b.m113003a("click", "reserve", "poi_page", "poi_page", this.f91549m);
        if (!C6861a.m21337f().isLogin()) {
            C32656f.m105745a((Activity) this.f91537a, "poi_page", "click_poi_puscene_reserve", (C23305g) new C35047f(this));
        } else {
            C35045e.m113153a(this.f91537a, this.f91538b.getBookUrl(), this.f91537a.getResources().getString(R.string.d0d));
        }
    }

    /* renamed from: j */
    private void m113092j() {
        this.f91542f = C32640a.m105721a().mo84026b(null);
        if (this.f91542f != null) {
            C32640a.m105721a().mo84027b();
            try {
                this.f91543g = this.f91542f.getLatitude();
                this.f91544h = this.f91542f.getLongitude();
                if (!this.f91542f.isGaode()) {
                    double[] b = C35440a.m114454b(this.f91544h, this.f91543g);
                    this.f91544h = b[0];
                    this.f91543g = b[1];
                }
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
    }

    /* renamed from: o */
    private boolean m113097o() {
        String merchantActTitle = this.f91538b.getMerchantActTitle();
        if (TextUtils.isEmpty(merchantActTitle)) {
            return false;
        }
        this.mMerchantActsLayout.setVisibility(0);
        this.mMerchantActsView.setText(merchantActTitle);
        C35454m.m114523a(this.f91549m, "merchant_event_show", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("previous_page", this.f91549m.getPreviousPage()).mo59973a("poi_id", this.f91549m.getPoiId()).mo59973a("merchant_event_id", this.f91538b.getMerchantActId()));
        return true;
    }

    /* renamed from: q */
    private void m113099q() {
        String str;
        PoiClassRankStruct poiRankBundle = this.f91538b.getPoiRankBundle();
        if (poiRankBundle != null) {
            if (poiRankBundle.classOption != null) {
                str = poiRankBundle.classOption.getName();
            } else {
                str = "";
            }
            C35454m.m114523a(this.f91549m, "leaderboard_bar_show", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("previous_page", this.f91549m.getPreviousPage()).mo59973a("rank_index", String.valueOf(poiRankBundle.rankValue)).mo59973a("poi_channel", this.f91538b.getBackendType()).mo59973a("sub_class", str).mo59973a("city_info", C33230ac.m107204a()).mo59973a("district_code", poiRankBundle.districtCode).mo59973a("poi_id", this.f91538b.poiStruct.poiId));
        }
    }

    /* renamed from: m */
    private void m113095m() {
        boolean z;
        this.mPoiHeaderLayout.mo90215a(this.f91538b);
        this.mPoiNavi.setVisibility(8);
        this.mPoiNaviDivider.setVisibility(8);
        if (this.mPoiAddrLayout.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        m113094l();
        m113098p();
        m113103u();
        m113100r();
        m113101s();
        boolean n = m113096n();
        m113102t();
        List acts = this.f91538b.getActs();
        if (!C6307b.m19566a((Collection<T>) acts)) {
            this.mActsLayout.setVisibility(0);
            this.mActsView.mo90207a(acts, this.f91549m);
            if (z) {
                this.mActsLayout.setPadding(0, (int) C9738o.m28708b(this.f91537a, 7.0f), 0, 0);
            }
            z = false;
        }
        boolean o = m113097o();
        if (z) {
            z = !o;
        }
        if (z) {
            this.mPoiAddrDivider.setVisibility(8);
        }
        if (n) {
            this.mPhoneLayout.setVisibility(0);
        }
        this.mRankMore.setVisibility(0);
        this.mActMore.setVisibility(0);
        this.mMerchantMore.setVisibility(0);
    }

    /* renamed from: r */
    private void m113100r() {
        boolean z;
        if (!this.f91538b.isEnterprise()) {
            String bookUrl = this.f91538b.getBookUrl();
            String queueUrl = this.f91538b.getQueueUrl();
            boolean z2 = true;
            if (!TextUtils.isEmpty(bookUrl)) {
                this.mPoiReserve.setVisibility(0);
                this.mPoiReserve.setTextRes(R.string.d0d);
                this.mPoiReserve.setOnClickListener(new C35048g(this));
                C35007b.m113003a("show", "reserve", "poi_page", "poi_page", this.f91549m);
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(queueUrl)) {
                this.mPoiQueue.setVisibility(0);
                this.mPoiQueue.setTextRes(R.string.czo);
                this.mPoiQueue.setOnClickListener(new C35049h(this));
                if (z) {
                    this.mPoiQueueDivider.setVisibility(0);
                }
                C35007b.m113003a("show", "queue", "poi_page", "poi_page", this.f91549m);
            } else {
                z2 = false;
            }
            if (z || z2) {
                this.mPoiReserveAndQueueLayout.setVisibility(0);
                this.mPoiReserveAndQueueDivider.setVisibility(0);
            }
        }
    }

    /* renamed from: t */
    private void m113102t() {
        String str;
        PoiActivityInfo poiActivityInfo = this.f91538b.getPoiActivityInfo();
        if (poiActivityInfo == null) {
            if (!TextUtils.isEmpty(this.f91549m.getActivityId())) {
                C10761a.m31399c(this.f91537a, (int) R.string.ai3).mo25750a();
            }
            return;
        }
        if (this.f91538b.poiExtension != null) {
            str = String.valueOf(this.f91538b.poiExtension.source);
        } else {
            str = "";
        }
        this.mPoiAdLayout.mo89841a(poiActivityInfo.getAdCard(), str, this.f91549m);
        if (poiActivityInfo.getCouponInfo() != null && !TextUtils.isEmpty(this.f91549m.getActivityId()) && !TextUtils.equals(String.valueOf(poiActivityInfo.getCouponInfo().getActivityId()), this.f91549m.getActivityId())) {
            C10761a.m31399c(this.f91537a, (int) R.string.ai3).mo25750a();
        }
        if (this.f91545i instanceof C35308e) {
            this.mPoiCouponLayout.mo89844a(poiActivityInfo.getCouponInfo(), (C35308e) this.f91545i, this.f91539c.getVoucherReleaseAreas(), this.f91549m);
        }
    }

    /* renamed from: s */
    private void m113101s() {
        if (this.f91538b.isEnterprise()) {
            ArrayList<C35488e> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(this.f91538b.getBookUrl())) {
                C35007b.m113003a("show", "reserve", "poi_page", "poi_page", this.f91549m);
                arrayList.add(new C35488e(this.f91537a.getResources().getString(R.string.d0d), R.drawable.ay6, true, new C35050i(this)));
            }
            if (!TextUtils.isEmpty(this.f91538b.getQueueUrl())) {
                C35007b.m113003a("show", "queue", "poi_page", "poi_page", this.f91549m);
                arrayList.add(new C35488e(this.f91537a.getResources().getString(R.string.czo), R.drawable.ay4, true, new C35051j(this)));
            }
            if (this.f91538b.isEnterprise() || !C6319n.m19593a(this.f91538b.getPhone())) {
                arrayList.add(new C35488e(this.f91537a.getResources().getString(R.string.cxw), R.drawable.axs, false, new C35052k(this)));
                C35007b.m113003a("show", "contacts", "poi_page", "poi_page", this.f91549m);
            }
            if (this.f91538b.isEnterprise()) {
                arrayList.add(new C35488e(this.f91537a.getResources().getString(R.string.cz8), R.drawable.axx, true, new C35053l(this)));
                C35007b.m113003a("show", "merchants", "poi_page", "poi_page", this.f91549m);
            }
            if (arrayList.size() > 2) {
                this.mBusinessComponent.mo90204a(arrayList);
                this.mPoiReserveAndQueueDivider.setVisibility(0);
                return;
            }
            int i = 0;
            for (C35488e eVar : arrayList) {
                if (i == 0) {
                    this.mPoiReserve.setVisibility(0);
                    this.mPoiReserve.setText(eVar.f93124a);
                    this.mPoiReserve.setImageResource(eVar.f93125b);
                    this.mPoiReserve.setOnClickListener(eVar.f93127d);
                } else {
                    this.mPoiQueue.setVisibility(0);
                    this.mPoiQueue.setText(eVar.f93124a);
                    this.mPoiQueue.setImageResource(eVar.f93125b);
                    this.mPoiQueue.setOnClickListener(eVar.f93127d);
                    this.mPoiQueueDivider.setVisibility(0);
                }
                i++;
            }
            if (i != 1 || ((C35488e) arrayList.get(0)).f93126c) {
                if (i > 0) {
                    this.mPoiReserveAndQueueLayout.setVisibility(0);
                    this.mPoiReserveAndQueueDivider.setVisibility(0);
                }
                if (arrayList.size() == 1) {
                    this.mPoiAddrDivider.setVisibility(8);
                    ((LayoutParams) this.mPoiReserveAndQueueLayout.getLayoutParams()).topMargin = (int) C9738o.m28708b(this.f91537a, 15.0f);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo88820d(View view) {
        m113091i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo88822e(View view) {
        m113090h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo88823f(View view) {
        m113091i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo88824g(View view) {
        m113090h();
    }

    /* renamed from: a */
    public final void mo88813a(CouponInfo couponInfo) {
        this.mPoiCouponLayout.mo89842a(couponInfo);
    }

    /* renamed from: a */
    public final void mo88811a(int i) {
        if (this.f91546j != null) {
            this.f91546j.mo90118a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88816b(View view) {
        m113089g();
        C35007b.m113003a("click", "merchants", "poi_page", "poi_page", this.f91549m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo88818c(View view) {
        C35462r.m114556a(this.f91537a, this.f91538b, "poi_page", this.f91549m, true, "click_button");
        C35007b.m113003a("click", "contacts", "poi_page", "poi_page", this.f91549m);
    }

    /* renamed from: a */
    public final void mo88812a(View view) {
        if (this.f91546j != null) {
            this.f91546j.mo90121a(view, true);
        }
    }

    /* renamed from: a */
    private void m113087a(PoiDetail poiDetail) {
        String str;
        String str2;
        if (poiDetail != null && this.f91538b == null) {
            this.f91538b = poiDetail;
            this.f91539c = poiDetail.getPoiStruct();
            if (this.f91539c != null) {
                this.f91549m.setPoiId(this.f91539c.poiId);
                this.f91549m.setPoiType(this.f91539c.getTypeCode());
                this.f91549m.setBackendType(this.f91539c.getBackendTypeCode());
                this.f91549m.setPoiCity(this.f91539c.getCityCode());
                if (TextUtils.isEmpty(poiDetail.getAddress())) {
                    this.mPoiAddrLayout.setVisibility(8);
                } else {
                    this.mPoiAddr.setVisibility(0);
                    if (!C6319n.m19593a(this.f91539c.getPoiLatitude()) && !C6319n.m19593a(this.f91539c.getPoiLongitude())) {
                        try {
                            m113092j();
                            this.f91540d = Double.parseDouble(this.f91539c.getPoiLatitude());
                            this.f91541e = Double.parseDouble(this.f91539c.getPoiLongitude());
                            double[] a = C35442b.m114469a(this.f91540d, this.f91541e);
                            this.f91540d = a[0];
                            this.f91541e = a[1];
                        } catch (Exception e) {
                            C6921a.m21554a(e);
                        }
                    }
                    if (C6399b.m19944t()) {
                        this.mPoiDistance.setVisibility(8);
                        String address = poiDetail.getAddress();
                        String str3 = "";
                        if (m113093k()) {
                            StringBuilder sb = new StringBuilder(" | ");
                            sb.append(C35442b.m114473c(this.f91537a, this.f91540d, this.f91541e, this.f91543g, this.f91544h));
                            str3 = sb.toString();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(address);
                        sb2.append(str3);
                        String sb3 = sb2.toString();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb3);
                        if (C6399b.m19946v() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
                            str = "#161823";
                        } else {
                            str = "#ffffff";
                        }
                        if (C6399b.m19946v() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
                            str2 = "#80161823";
                        } else {
                            str2 = "#80FFFFFF";
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str)), 0, address.length(), 33);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str2)), address.length(), sb3.length(), 33);
                        this.mPoiAddr.getTextView().setText(spannableStringBuilder);
                    } else {
                        this.mPoiDistance.setVisibility(0);
                        this.mPoiAddr.setText(poiDetail.getAddress());
                    }
                }
            } else {
                this.mPoiAddrLayout.setVisibility(8);
            }
            m113095m();
        }
    }

    public void onClick(View view) {
        String str;
        int id = view.getId();
        Aweme rawAdAwemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(this.f91549m.getAwemeId());
        if (id == R.id.ce8) {
            C35444d.m114495d(this.f91537a, rawAdAwemeById, this.f91549m.getPoiId());
            C35462r.m114558a(this.f91537a, this.f91538b.getPhone(), "poi_page", "click_button", this.f91549m);
        } else if (id == R.id.cdy) {
            C35454m.m114529a("click_address", "click", this.f91549m);
            if (this.f91547k != null) {
                this.f91547k.mo88804a(true);
            }
            C35444d.m114487a(this.f91537a, rawAdAwemeById, "address", this.f91549m.getPoiId());
        } else if (id == R.id.ce6) {
            C35454m.m114529a("click_button", "click", this.f91549m);
            if (this.f91547k != null) {
                this.f91547k.mo88804a(true);
            }
            C35444d.m114487a(this.f91537a, rawAdAwemeById, "address", this.f91549m.getPoiId());
        } else if (id != R.id.ce0) {
            if (id == R.id.cds) {
                if (this.f91538b != null) {
                    C35454m.m114523a(this.f91549m, "click_poi_introduction", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("previous_page", this.f91549m.getPreviousPage()).mo59973a("poi_id", this.f91538b.getPoiId()));
                    StringBuilder sb = new StringBuilder("https://aweme.snssdk.com/falcon/douyin_falcon/poi/detail/?poi_id=");
                    sb.append(this.f91538b.getPoiId());
                    String sb2 = sb.toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("title", this.f91538b.getDesc());
                    bundle.putBoolean("hide_nav_bar", false);
                    bundle.putBoolean("hide_status_bar", false);
                    bundle.putBoolean("show_closeall", false);
                    C35460p.m114545a(this.f91537a, sb2, bundle);
                }
            } else if (id == R.id.cer) {
                long poiRankClassCode = this.f91538b.getPoiRankClassCode();
                PoiClassRankStruct poiRankBundle = this.f91538b.getPoiRankBundle();
                if (!(poiRankClassCode == -1 || poiRankBundle == null)) {
                    if (poiRankBundle.classOption != null) {
                        str = poiRankBundle.classOption.getName();
                    } else {
                        str = "";
                    }
                    C35454m.m114523a(this.f91549m, "enter_poi_leaderboard", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("city_info", C33230ac.m107204a()).mo59973a("enter_method", "click_leaderboard_bar").mo59973a("poi_channel", this.f91538b.getBackendType()).mo59973a("sub_class", str).mo59973a("district_code", poiRankBundle.districtCode).mo59973a("poi_id", this.f91549m.getPoiId()));
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("poi_rank", poiRankBundle);
                    bundle2.putString("enter_from", "poi_page");
                    bundle2.putString("enter_method", "click_leaderboard_bar");
                    bundle2.putString("district_code", poiRankBundle.districtCode);
                    C35411t.m114384a(this.f91537a, bundle2);
                }
            } else if (id == R.id.cdn) {
                if (this.f91548l == null) {
                    this.f91548l = new C35014c(this.f91549m, "poi_page", 0, this.f91538b.getBackendType());
                }
                this.mActsView.mo90208b();
                this.f91548l.mo88781a(this.f91537a, this.mActsView.getCurrentItem(), this.mActsView.getCurrentPosition());
            } else if (id == R.id.cfi) {
                PoiNoticeActivity.m113796a(this.f91537a, m113088f(), this.f91538b.getMerchantAct());
                C35454m.m114523a(this.f91549m, "merchant_event_click", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("previous_page", this.f91549m.getPreviousPage()).mo59973a("poi_id", this.f91549m.getPoiId()).mo59973a("merchant_event_id", this.f91538b.getMerchantActId()));
            }
        } else if (!C27326a.m89578a(this.mPoiCollectLayout)) {
            this.f91546j.mo90121a(view, false);
        }
    }

    /* renamed from: a */
    public final void mo88814a(C34145b bVar, PoiSimpleBundle poiSimpleBundle) {
        this.f91549m = poiSimpleBundle;
        m113087a((PoiDetail) bVar);
    }

    public PoiOptimizedDetailViewHolder(AbsFragment absFragment, C35025a aVar, View view) {
        super(view);
        this.f91545i = absFragment;
        this.f91537a = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f91547k = aVar;
        this.mPoiHeaderLayout.mo90214a(absFragment, aVar, this.f91546j, null);
    }
}
