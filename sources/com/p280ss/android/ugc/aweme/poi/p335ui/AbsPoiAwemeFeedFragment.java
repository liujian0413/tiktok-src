package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0688e;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AnimationUtils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p280ss.android.ugc.aweme.detail.p1157a.C26043a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29359f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29374h;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29400c;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32624f;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33243ao;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter.C35008a;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.model.C35117g;
import com.p280ss.android.ugc.aweme.poi.model.C35118h;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiJoinActivityResponse;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.nearby.p1463a.C35128a;
import com.p280ss.android.ugc.aweme.poi.nearby.p1463a.C35129b;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35386j.C35388a;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35299b;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35303c;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35303c.C35304a;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35308e;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.PoiContext;
import com.p280ss.android.ugc.aweme.poi.utils.C35440a;
import com.p280ss.android.ugc.aweme.poi.utils.C35446f;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.utils.C43076dy;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment */
public abstract class AbsPoiAwemeFeedFragment extends FeedFragment implements OnGlobalLayoutListener, C32624f, C35129b, C35304a, C35308e, C35388a {

    /* renamed from: A */
    private BroadcastReceiver f92324A;

    /* renamed from: B */
    private boolean f92325B;

    /* renamed from: C */
    private boolean f92326C = true;

    /* renamed from: D */
    private boolean f92327D;

    /* renamed from: E */
    private boolean f92328E = true;

    /* renamed from: e */
    protected C35390l f92329e;

    /* renamed from: f */
    public C35386j f92330f;

    /* renamed from: g */
    public boolean f92331g;

    /* renamed from: h */
    protected PoiBundle f92332h;

    /* renamed from: i */
    protected PoiSimpleBundle f92333i;

    /* renamed from: j */
    protected String f92334j;

    /* renamed from: k */
    protected String f92335k;

    /* renamed from: l */
    protected String f92336l;
    public NestedScrollingRecyclerView mRecyclerView;
    protected View mStartRecodeLayout;
    protected View mStartRecordOutRing;
    protected DmtStatusView mStatusView;

    /* renamed from: s */
    protected PoiDetail f92337s;

    /* renamed from: t */
    protected PoiStruct f92338t;

    /* renamed from: u */
    public boolean f92339u;

    /* renamed from: v */
    public C35481c f92340v;

    /* renamed from: w */
    public boolean f92341w;

    /* renamed from: x */
    private C35118h f92342x;

    /* renamed from: y */
    private C29359f f92343y;

    /* renamed from: z */
    private C35128a f92344z;

    /* renamed from: A */
    public C35025a mo89712A() {
        return null;
    }

    /* renamed from: D */
    public C35008a mo89714D() {
        return null;
    }

    /* renamed from: E */
    public C29374h mo89715E() {
        return null;
    }

    /* renamed from: b */
    public final PoiBundle mo89728b() {
        return this.f92332h;
    }

    /* renamed from: d_ */
    public final boolean mo73772d_(boolean z) {
        return false;
    }

    /* renamed from: g */
    public abstract int mo89734g();

    /* renamed from: i */
    public abstract int mo89735i();

    /* renamed from: j */
    public AbsFragment mo89718H() {
        return this;
    }

    /* renamed from: p */
    public final void mo73821p() {
    }

    /* renamed from: q */
    public final void mo89744q() {
        this.f92326C = false;
    }

    /* renamed from: w */
    public final int mo73844w() {
        return 10;
    }

    /* renamed from: a */
    public boolean mo89727a(PoiDetail poiDetail) {
        if (this.f92338t != null) {
            return true;
        }
        if (poiDetail != null) {
            this.f92337s = poiDetail;
            this.f92338t = poiDetail.poiStruct;
            this.f92335k = this.f92338t.poiName;
            this.f92336l = this.f92338t.getTypeCode();
        }
        return false;
    }

    /* renamed from: B */
    public final String mo89713B() {
        return mo89728b().awemeid;
    }

    /* renamed from: G */
    public final void mo89717G() {
        mo89731b((LocationResult) null);
        mo89724a((LocationResult) null);
    }

    /* renamed from: o */
    public final void mo89741o() {
        this.f92329e.mo90115m();
    }

    /* renamed from: x */
    public final String mo73845x() {
        return mo89728b().from;
    }

    /* renamed from: L */
    private void mo89754L() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: O */
    private void m113708O() {
        C32640a.m105722a(getActivity(), new C43154a() {
            /* renamed from: b */
            public final void mo71376b() {
                AbsPoiAwemeFeedFragment.this.mo89717G();
            }

            /* renamed from: a */
            public final void mo71375a() {
                AbsPoiAwemeFeedFragment.this.f92339u = true;
                LocationResult b = C32640a.m105721a().mo84026b(AbsPoiAwemeFeedFragment.this);
                if (b != null) {
                    C32640a.m105721a().mo84027b();
                    AbsPoiAwemeFeedFragment.this.mo89731b(b);
                }
                AbsPoiAwemeFeedFragment.this.mo89724a(b);
            }
        });
    }

    /* renamed from: e */
    public final boolean mo89732e() {
        if (this.f92332h != null) {
            return this.f92332h.hasActivity;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo89733f() {
        if (this.f92332h != null) {
            return this.f92332h.challengeId;
        }
        return "";
    }

    /* renamed from: k */
    public final void mo89737k() {
        if (this.mStartRecodeLayout != null) {
            this.mStartRecodeLayout.post(new C35381e(this));
        }
    }

    public void onGlobalLayout() {
        if (this.mRecyclerView != null) {
            this.mRecyclerView.setPadding(0, 0, 0, 0);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f92329e != null) {
            this.f92329e.mo75169g();
        }
        this.f92331g = false;
    }

    /* renamed from: s */
    public C35386j mo89746s() {
        if (this.f92330f == null) {
            this.f92330f = new C35386j(this);
        }
        return this.f92330f;
    }

    /* renamed from: t */
    public void mo73841t() {
        if (!C43076dy.m136656a()) {
            C6903bc.m21486e().mo75354a();
        }
    }

    /* renamed from: y */
    public C35390l mo89747y() {
        if (this.f92329e == null) {
            this.f92329e = new C35390l();
        }
        return this.f92329e;
    }

    /* renamed from: z */
    public C35118h mo89748z() {
        return new C35118h(mo89735i());
    }

    public final void bv_() {
        if (isViewValid()) {
            mo89731b(C32640a.m105721a().mo84021a());
        }
    }

    public void onPause() {
        super.onPause();
        this.f18760c_ = false;
        if (this.f92329e != null) {
            this.f92329e.mo75171h();
        }
        mo73842u();
        this.f92331g = false;
    }

    public void onResume() {
        super.onResume();
        if (this.mUserVisibleHint && !C43076dy.m136656a()) {
            if (this.f92329e != null) {
                this.f92329e.mo75168f();
            }
            mo73841t();
            this.f92331g = true;
        }
    }

    /* renamed from: u */
    public void mo73842u() {
        if (!C29371f.m96475a().mo75105b()) {
            C6903bc.m21486e().mo75369a("poi_page", "list");
        }
    }

    /* renamed from: J */
    private void mo89752J() {
        if (!C35383g.m114271a(getContext())) {
            if (!this.f92329e.f92836o) {
                this.mStatusView.mo25944h();
            }
            return;
        }
        LocationResult locationResult = null;
        if (this.f92339u) {
            locationResult = C32640a.m105721a().mo84026b(this);
            if (locationResult != null) {
                C32640a.m105721a().mo84027b();
                mo89731b(locationResult);
            }
        } else {
            mo89731b((LocationResult) null);
        }
        mo89724a(locationResult);
    }

    /* renamed from: M */
    private void mo89755M() {
        if (this.mStartRecodeLayout != null && this.f92327D && this.f92328E) {
            this.mStartRecordOutRing.clearAnimation();
            this.mStartRecodeLayout.startAnimation(C26043a.m85552b());
            this.mStartRecodeLayout.setVisibility(8);
            this.f92328E = false;
            if (this.f92340v != null) {
                this.f92340v.dismiss();
                this.f92340v = null;
            }
        }
    }

    /* renamed from: N */
    private void m113707N() {
        if (this.mStartRecodeLayout != null && this.f92327D && !this.f92328E) {
            this.mStartRecodeLayout.setVisibility(0);
            this.mStartRecodeLayout.startAnimation(C26043a.m85551a());
            this.f92328E = true;
            this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.cq));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public final /* synthetic */ void mo89719I() {
        if (isViewValid() && getActivity() != null) {
            this.f92340v = new C35481c(getActivity());
            this.f92340v.f93096d = C23486n.m77122a(-5.0d);
            this.f92340v.f93102j = 3000;
            this.f92340v.mo90267c((int) R.string.d0l);
            this.f92340v.mo90255a(this.mStartRecodeLayout, 48);
        }
    }

    /* renamed from: l */
    public final void mo89738l() {
        if (this.mStartRecodeLayout != null) {
            this.mStartRecordOutRing.clearAnimation();
            this.mStartRecordOutRing.setVisibility(4);
            this.mStartRecodeLayout.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.co));
        }
    }

    /* renamed from: m */
    public final void mo89739m() {
        if (this.mStartRecodeLayout != null) {
            this.mStartRecordOutRing.setVisibility(0);
            this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.cq));
            this.mStartRecodeLayout.clearAnimation();
        }
    }

    /* renamed from: F */
    public final void mo89716F() {
        C37984ap.m121301a().shareCoupon(getActivity(), this.f92337s.poiStruct, this.f92337s.getPoiActivityInfo().getCouponInfo(), this.f92334j, String.valueOf(this.f92337s.getPoiActivityInfo().getCouponInfo().getActivityId()), String.valueOf(this.f92337s.getPoiActivityInfo().getCouponInfo().getCouponId()), this.f92333i);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.mRecyclerView != null) {
            this.mRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        if (this.f92330f != null) {
            this.f92330f.mo59134U_();
            this.f92330f.mo66535W_();
            this.f92330f.mo75070g();
            this.f92330f.mo75069f();
        }
        if (this.f92343y != null) {
            this.f92343y.mo59134U_();
            this.f92343y.mo66535W_();
            this.f92343y.mo75087g();
        }
        if (this.f92344z != null) {
            this.f92344z.mo59134U_();
            this.f92344z.mo66535W_();
        }
        if (this.f92329e != null) {
            this.f92329e.mo75173j();
        }
        C0688e.m2941a(getContext()).mo2837a(this.f92324A);
        C29371f.m96475a().mo75101a("key_container_poi");
        if (this.f92340v != null) {
            this.f92340v.mo90269d();
        }
    }

    /* renamed from: K */
    private void mo89753K() {
        C6907h.onEvent(MobClick.obtain().setEventName("click_share_button").setLabelName("poi_page").setJsonObject(new C6869c().mo16887a("poi_id", this.f92334j).mo16888b()));
        C35454m.m114523a(this.f92333i, "click_share_poi_button", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("poi_id", this.f92334j).mo59973a("poi_type", this.f92336l).mo59973a("group_id", mo89713B()).mo59973a("previous_page", mo73845x()));
        if (this.f92338t != null) {
            C37984ap.m121301a().sharePoi(getActivity(), this.f92338t, this.f92337s.getEnterpriseClaimUrl(), this.f92332h, null);
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("share");
        }
    }

    /* renamed from: r */
    public final void mo89745r() {
        if (this.f92332h != null) {
            String str = this.f92332h.from;
            C22984d a = C22984d.m75611a();
            a.mo59973a("enter_from", str).mo59973a("group_id", this.f92332h.awemeid).mo59973a("poi_type", this.f92332h.poiType).mo59973a("poi_id", this.f92332h.poiId).mo59973a("to_user_id", this.f92332h.toUserId).mo59973a("poi_channel", C33230ac.m107214b()).mo59973a("enter_method", this.f92332h.clickMethod).mo59973a("author_id", this.f92332h.authorId).mo59973a("city_info", C33230ac.m107204a()).mo59973a("distance_info", this.f92332h.distanceInfo).mo59974a(this.f92332h.forwardTypeV3Params);
            if (C33230ac.m107222d(str)) {
                a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(this.f92332h.requestId));
                C35454m.m114532b(this.f92338t, "request_poi_detail", a);
                return;
            }
            C35454m.m114527a(this.f92338t, "request_poi_detail", a);
        }
    }

    /* renamed from: n */
    public final void mo89740n() {
        String str;
        if (this.f92338t != null) {
            String uuid = UUID.randomUUID().toString();
            C6907h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("poi_page").setJsonObject(new C6869c().mo16887a("poi_id", this.f92334j).mo16888b()));
            C33243ao e = new C33243ao().mo85115a("poi_page").mo85117b(this.f92334j).mo85120e(uuid);
            if (C33230ac.m107222d(this.f92332h.from)) {
                C33243ao a = e.mo85116a(true);
                C28199ae a2 = C28199ae.m92689a();
                if (this.f92332h != null) {
                    str = this.f92332h.requestId;
                } else {
                    str = null;
                }
                a.mo85121f(a2.mo71791a(str));
            }
            e.mo85252e();
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService == null || !iAVService.needLoginBeforeRecord()) {
                Intent intent = new Intent();
                intent.putExtra("shoot_way", "poi_page");
                intent.putExtra("creation_id", uuid);
                PoiContext poiContext = new PoiContext();
                poiContext.mShootPoiId = this.f92334j;
                poiContext.mShootPoiName = this.f92335k;
                poiContext.setLat(this.f92338t.getPoiLatitude());
                poiContext.setLng(this.f92338t.getPoiLongitude());
                if (this.f92332h.hasActivity) {
                    if (mo89746s().mo89805u()) {
                        poiContext.mPoiActivity = mo89746s().mo89806v();
                    } else {
                        poiContext.mSelectPoiId = this.f92334j;
                        poiContext.mSelectPoiName = this.f92335k;
                    }
                } else if (!TextUtils.isEmpty(this.f92332h.challengeId) || !TextUtils.isEmpty(this.f92332h.challengeId)) {
                    poiContext.mSelectPoiId = this.f92334j;
                    poiContext.mSelectPoiName = this.f92335k;
                }
                intent.putExtra("poi_struct_in_tools_line", PoiContext.serializeToStr(poiContext));
                intent.putExtra("first_face_sticker", this.f92332h.sticker);
                intent.putExtra("challenge_id", this.f92332h.challengeId);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) getActivity(), intent);
                return;
            }
            C32656f.m105746a((Fragment) this, "poi_page", "click_record");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89723a(View view) {
        mo89752J();
    }

    /* renamed from: b */
    private void m113709b(boolean z) {
        int i;
        this.f92327D = z;
        View view = this.mStartRecodeLayout;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C23487o.m77140a(view, i);
    }

    /* renamed from: a */
    public final void mo89722a(C1281m mVar) {
        this.f92329e.mo90109a(mVar);
        this.mRecyclerView.setOnTouchListener(new C35382f(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissionGranted", this.f92339u);
    }

    /* renamed from: a */
    public final void mo89720a(int i) {
        if (this.f92326C) {
            if (i > 30) {
                mo89755M();
                return;
            }
            if (i < -30) {
                m113707N();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo89730b(View view) {
        mo89752J();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.jo) {
            mo89754L();
            return;
        }
        if (id == R.id.d4t) {
            mo89753K();
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f92329e != null) {
            this.f92329e.mo75165c(z);
        }
        if (z) {
            mo73841t();
        } else {
            mo73842u();
        }
    }

    /* renamed from: a */
    public final void mo89421a(Exception exc) {
        if (isViewValid()) {
            if (exc instanceof ApiServerException) {
                C10761a.m31410e(getContext(), ((ApiServerException) exc).getErrorMsg()).mo25750a();
            } else {
                C10761a.m31410e(getContext(), getString(R.string.ahu)).mo25750a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo89731b(LocationResult locationResult) {
        if (!(!isViewValid() || locationResult == null || this.f92329e == null)) {
            this.f92329e.mo90116n();
        }
    }

    /* renamed from: a */
    public void mo73837a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        boolean z;
        super.mo73837a(bundle);
        if (bundle != null) {
            this.f92332h = (PoiBundle) bundle.getSerializable("poi_bundle");
            if (this.f92332h != null) {
                str = this.f92332h.poiId;
            } else {
                str = "";
            }
            this.f92334j = str;
            if (this.f92332h != null) {
                str2 = this.f92332h.poiName;
            } else {
                str2 = "";
            }
            this.f92335k = str2;
            if (this.f92332h != null) {
                str3 = this.f92332h.poiType;
            } else {
                str3 = "";
            }
            this.f92336l = str3;
            if (C6399b.m19944t() || this.f92332h == null || !this.f92332h.hasActivity()) {
                z = false;
            } else {
                z = true;
            }
            this.f92341w = z;
            if (this.f92341w) {
                this.f92325B = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo89724a(LocationResult locationResult) {
        boolean z;
        if (isViewValid()) {
            if (!C35383g.m114271a(getContext())) {
                if (!this.f92329e.f92836o && this.mStatusView != null) {
                    this.mStatusView.mo25944h();
                }
                return;
            }
            boolean z2 = false;
            if (locationResult == null) {
                C35390l lVar = this.f92329e;
                if (this.f92332h != null) {
                    z2 = this.f92332h.isPreviewMode;
                }
                lVar.mo89813a(z2, "", "", this.f92341w);
                return;
            }
            String[] a = C35440a.m114452a(locationResult);
            C35390l lVar2 = this.f92329e;
            if (this.f92332h != null) {
                z = this.f92332h.isPreviewMode;
            } else {
                z = false;
            }
            lVar2.mo89813a(z, a[0], a[1], this.f92341w);
        }
    }

    /* renamed from: a */
    public final void mo89420a(PoiJoinActivityResponse poiJoinActivityResponse) {
        boolean z;
        if (poiJoinActivityResponse != null && isViewValid() && getContext() != null) {
            C35390l y = mo89747y();
            if (y != null) {
                CouponInfo couponInfo = poiJoinActivityResponse.getCouponInfo();
                if (couponInfo != null) {
                    if (this.f92337s.couponShareSetting == null || this.f92337s.couponShareSetting.shareFlag != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z2 = !TextUtils.isEmpty(this.f92337s.getBookUrl());
                    boolean o = C28410h.m93375o();
                    if (z2) {
                        C35299b bVar = new C35299b(getContext(), couponInfo, true, this.f92337s.getBookUrl(), z, this.f92333i, this);
                        bVar.show();
                    } else if (!o) {
                        C35299b bVar2 = new C35299b(getContext(), couponInfo, false, this.f92337s.getBookUrl(), z, this.f92333i, this);
                        bVar2.show();
                    } else if (z) {
                        C35303c cVar = new C35303c(getContext(), this.f92337s.couponShareSetting.shareText, String.valueOf(couponInfo.getCouponId()), this.f92333i, this);
                        cVar.show();
                    } else {
                        C10761a.m31410e(getContext(), getString(R.string.aic)).mo25750a();
                    }
                    C28410h.m93374n();
                    y.mo90110a(couponInfo);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89721a(DialogInterface dialogInterface, int i) {
        mo89717G();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo89729b(DialogInterface dialogInterface, int i) {
        m113708O();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f92339u = bundle.getBoolean("permissionGranted");
        }
        C10805b bVar = new C10806a(getActivity()).mo25985a((int) R.drawable.b7_).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, new C35270a(this)).f29135a;
        this.mStatusView.setBuilder(C10803a.m31631a(getContext()).mo25964b(bVar).mo25961a(new C10806a(getActivity()).mo25990b((int) R.string.bzv).mo25993c(R.string.c47).mo25986a(ButtonStyle.BORDER, R.string.fia, new C35292b(this)).f29135a));
        this.f92329e = mo89747y();
        this.f92330f = mo89746s();
        this.f92330f.mo75055a((Fragment) this, mo73844w());
        this.f92343y = new C29359f(this.f75685n, mo73845x(), this.f75686o);
        this.f92343y.mo75086f();
        this.f92324A = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && AbsPoiAwemeFeedFragment.this.mUserVisibleHint && AbsPoiAwemeFeedFragment.this.f18760c_ && !AbsPoiAwemeFeedFragment.this.f92331g) {
                    if (AbsPoiAwemeFeedFragment.this.f92329e != null) {
                        AbsPoiAwemeFeedFragment.this.f92329e.mo75168f();
                    }
                    AbsPoiAwemeFeedFragment.this.mo73841t();
                    AbsPoiAwemeFeedFragment.this.f92331g = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0688e.m2941a(getContext()).mo2838a(this.f92324A, intentFilter);
        this.f92343y.mo66536a(new C28471v());
        this.f92343y.mo66537a((C29400c) this.f92329e);
        this.f92330f.mo66537a(this.f92329e);
        this.f92333i = this.f92329e.mo90108a(this.f92332h);
        this.f92329e.f92840s = mo89712A();
        this.f92329e.mo89812a((C35388a) this, view, this.f92330f, (C21743a) this.f92343y);
        this.f92342x = mo89748z();
        this.f92330f.mo66536a(this.f92342x);
        this.f92344z = new C35128a();
        this.f92344z.mo66536a(new C35117g());
        this.f92344z.mo66537a(this);
        if (!this.f92339u) {
            if (C32640a.m105723a(C6399b.m19921a())) {
                this.f92339u = true;
                LocationResult b = C32640a.m105721a().mo84026b(this);
                if (b != null) {
                    C32640a.m105721a().mo84027b();
                    mo89731b(b);
                }
                mo89724a(b);
            } else if (!C6399b.m19944t()) {
                this.mStatusView.mo25942f();
                m113708O();
            } else if (C35446f.m114500b()) {
                mo89717G();
            } else {
                C35446f.m114498a();
                this.mStatusView.mo25942f();
                C35446f.m114499a(getContext(), new C35293c(this), new C35311d(this));
            }
            if (this.mStartRecodeLayout != null) {
                m113709b(this.f92325B);
                if (this.f92325B) {
                    this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.cq));
                    this.mStartRecodeLayout.setOnTouchListener(new OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            switch (motionEvent.getAction()) {
                                case 0:
                                    AbsPoiAwemeFeedFragment.this.mo89738l();
                                    break;
                                case 1:
                                    AbsPoiAwemeFeedFragment.this.mo89739m();
                                    break;
                            }
                            return false;
                        }
                    });
                    this.mStartRecodeLayout.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            if (AbsPoiAwemeFeedFragment.this.f92340v != null) {
                                AbsPoiAwemeFeedFragment.this.f92340v.dismiss();
                                AbsPoiAwemeFeedFragment.this.f92340v = null;
                            }
                            User curUser = C6861a.m21337f().getCurUser();
                            if (curUser != null && curUser.isLive()) {
                                C10761a.m31409e(AbsPoiAwemeFeedFragment.this.getContext(), (int) R.string.bvo).mo25750a();
                            } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing()) {
                                C10761a.m31409e(AbsPoiAwemeFeedFragment.this.getContext(), (int) R.string.ig).mo25750a();
                            } else {
                                AbsPoiAwemeFeedFragment.this.mo89740n();
                            }
                        }
                    });
                }
                this.mRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo89725a(String str, int i) {
        if (this.f92344z != null) {
            this.f92344z.mo56976a(str, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo89726a(View view, MotionEvent motionEvent) {
        this.f92326C = true;
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo89734g(), viewGroup, false);
        C25713b.m84475a(inflate.findViewById(R.id.dal));
        if (!C35462r.m114565a()) {
            inflate.findViewById(R.id.d4t).setVisibility(8);
            inflate.findViewById(R.id.bzv).setVisibility(8);
        }
        return inflate;
    }
}
