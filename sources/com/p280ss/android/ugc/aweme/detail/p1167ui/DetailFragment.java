package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0611k;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.C23465e;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager.C23434a;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter.C23435a;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter.C23437b;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.C26057e;
import com.p280ss.android.ugc.aweme.detail.p1161e.C26058a;
import com.p280ss.android.ugc.aweme.detail.p1161e.C26059b;
import com.p280ss.android.ugc.aweme.detail.p1162f.C26061a;
import com.p280ss.android.ugc.aweme.detail.p1165i.C26071a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.event.C28312ah;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.C30251c;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.C32950d;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.C33064q;
import com.p280ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C33063a;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.music.p1408b.C33771f;
import com.p280ss.android.ugc.aweme.newfollow.util.C34195b;
import com.p280ss.android.ugc.aweme.p1042as.C23089a.C23090a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C28012q;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment.C36120b;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40959f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40961h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailFragment */
public class DetailFragment extends AmeBaseFragment implements C33064q {

    /* renamed from: e */
    protected ScrollableViewPager f69025e;

    /* renamed from: f */
    public C33061p f69026f;

    /* renamed from: g */
    protected ScrollSwitchStateManager f69027g;

    /* renamed from: h */
    protected HomePageDataViewModel f69028h;

    /* renamed from: i */
    protected SwitchFragmentPagerAdapter f69029i;

    /* renamed from: j */
    protected FeedParam f69030j = new FeedParam();

    /* renamed from: k */
    protected boolean f69031k = false;

    /* renamed from: l */
    protected boolean f69032l;

    /* renamed from: m */
    protected DataCenter f69033m;

    /* renamed from: n */
    protected C24723e f69034n = new C24723e();

    /* renamed from: o */
    protected String f69035o;

    /* renamed from: p */
    protected Aweme f69036p;

    /* renamed from: q */
    protected Aweme f69037q;

    /* renamed from: r */
    String f69038r = "";

    /* renamed from: s */
    boolean f69039s = false;

    /* renamed from: t */
    String f69040t = "";

    /* renamed from: u */
    String f69041u = "";

    /* renamed from: v */
    public boolean f69042v = true;

    /* renamed from: w */
    private boolean f69043w = false;

    /* renamed from: x */
    private AnalysisStayTimeFragmentComponent f69044x;

    /* renamed from: y */
    private C26058a f69045y;

    /* renamed from: z */
    private C26059b f69046z;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: g */
    public final Aweme mo67722g() {
        return this.f69036p;
    }

    /* renamed from: a */
    public void mo67715a(boolean z, int i) {
        C26061a.f68871a.mo67589a(m86080v(), m86079u(), this.f69030j.getVideoType(), this.f69030j.getEventType(), m86082x(), z, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67714a(String str) {
        if ("on_ear_phone_unplug".equals(str)) {
            if (!C43316v.m137250H()) {
                if (C43316v.m137450K().mo104916o()) {
                    C43316v.m137450K().mo104948x();
                    C32950d.m106524a("play", m86079u(), this.f69036p);
                    return;
                }
                C32950d.m106524a("pause", m86079u(), this.f69036p);
            } else if (C44933a.m141791a().mo107442b()) {
                C44933a.m141791a().mo71672ad();
                C32950d.m106524a("play", m86079u(), this.f69036p);
            } else {
                C32950d.m106524a("pause", m86079u(), this.f69036p);
            }
        }
    }

    /* renamed from: A */
    private int m86062A() {
        return this.f69030j.getVideoType();
    }

    /* renamed from: r */
    private String m86076r() {
        return this.f69030j.getUid();
    }

    /* renamed from: u */
    private String m86079u() {
        return this.f69030j.getFrom();
    }

    /* renamed from: t */
    private boolean m86078t() {
        return TextUtils.equals("from_user_state_tab", m86079u());
    }

    /* renamed from: v */
    private Aweme m86080v() {
        DetailPageFragment w = m86081w();
        if (w != null) {
            return w.mo67748j();
        }
        return null;
    }

    /* renamed from: x */
    private long m86082x() {
        DetailPageFragment w = m86081w();
        if (w != null) {
            return w.mo67751m();
        }
        return -1;
    }

    /* renamed from: i */
    public final void mo67723i() {
        this.f69033m.mo60134a("onBack", (Object) null);
    }

    /* renamed from: B */
    private void m86063B() {
        if (m86064D()) {
            this.f69044x = new AnalysisStayTimeFragmentComponent(this, true);
            this.f69044x.f61328b = new C26199j(this);
        }
    }

    /* renamed from: E */
    private void m86065E() {
        this.f69028h.f79568g.observe(getActivity(), new C26200k(this));
    }

    /* renamed from: n */
    private void m86072n() {
        C23435a a = mo67708a();
        a.f61832b = new C23437b() {
            /* renamed from: a */
            public final void mo61044a(HashMap<Integer, CommonPageFragment> hashMap) {
                DetailFragment.this.f69027g.mo79714a(hashMap);
            }

            /* renamed from: a */
            public final void mo61045a(List<C23465e> list) {
                DetailFragment.this.f69027g.mo79715a(list);
            }
        };
        this.f69029i = a.mo61042a((C0608j) this.mFragmentManager);
        this.f69025e.setAdapter(this.f69029i);
    }

    /* renamed from: s */
    private boolean m86077s() {
        if ("from_profile_self".equals(m86079u()) || "from_profile_other".equals(m86079u())) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private DetailPageFragment m86081w() {
        if (this.f69029i == null) {
            return null;
        }
        CommonPageFragment d = this.f69027g.mo79729d("page_feed");
        if (d instanceof DetailPageFragment) {
            return (DetailPageFragment) d;
        }
        return null;
    }

    /* renamed from: y */
    private boolean m86083y() {
        if (!C25329c.m83208J(this.f69036p) || !C24671f.m80853c().mo64690b(getContext(), this.f69036p)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo67720e() {
        if (this.f69026f == null || !this.f69027g.mo79723b("page_profile")) {
            return false;
        }
        this.f69026f.mo84697a((Boolean) null);
        return true;
    }

    /* renamed from: f */
    public final void mo67721f() {
        if (C26057e.m85589a(m86079u()) && getActivity() != null) {
            C28418f.m93413a().f74931a = FeedSharePlayerViewModel.getPlayerManager(getActivity());
        }
    }

    public Analysis getAnalysis() {
        if (m86064D()) {
            return new Analysis().setLabelName("others_homepage");
        }
        return super.getAnalysis();
    }

    public void onPause() {
        super.onPause();
        if ("from_poi_detail".equalsIgnoreCase(m86079u())) {
            ((IPoiService) ServiceManager.get().getService(IPoiService.class)).pausePoiDetailListening();
        }
    }

    /* renamed from: m */
    private boolean m86071m() {
        if (TextUtils.equals(this.f69030j.getEventType(), "poi_page") || TextUtils.equals(this.f69030j.getEventType(), "poi_map")) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m86073o() {
        if (C43122ff.m136767b() || (("from_profile_self".equals(m86079u()) && m86062A() == 0) || this.f69030j.isShowVideoRank())) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m86074p() {
        if ("from_nearby".equals(m86079u()) && this.f69036p.isLive()) {
            return true;
        }
        if ((this.f69036p == null || !this.f69036p.isAwemeFromXiGua()) && !"from_mix_detail".equals(m86079u())) {
            return m86075q();
        }
        return true;
    }

    /* renamed from: q */
    private boolean m86075q() {
        if (m86062A() == 14 || ((!m86077s() && !m86078t()) || this.f69036p == null || this.f69036p.getAuthor() == null || !TextUtils.equals(this.f69036p.getAuthor().getUid(), m86076r()))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo67724j() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (C32698a.m105818a(this.f69036p)) {
                C10761a.m31410e(getContext(), C32698a.m105817a(this.f69036p, R.string.fp_)).mo25750a();
            } else if (this.f69036p.isImage()) {
                C10761a.m31399c((Context) activity, (int) R.string.bsx).mo25750a();
            } else {
                C10761a.m31399c((Context) activity, (int) R.string.fp_).mo25750a();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.f69030j.getReactSessionId()) && mo67722g() != null) {
            C28012q qVar = new C28012q(this.f69030j.getReactSessionId(), 2, C43316v.m137450K().mo104915n(), mo67722g().getAid());
            C42961az.m136380a(qVar);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f69043w) {
            m86069k();
            this.f69043w = false;
        }
        if ("from_poi_detail".equalsIgnoreCase(m86079u())) {
            ((IPoiService) ServiceManager.get().getService(IPoiService.class)).resumePoiDetailListening();
        }
    }

    /* renamed from: D */
    private boolean m86064D() {
        if (this.f69030j == null || ((TextUtils.isEmpty(this.f69030j.getFeedsAwemeId()) || (!TextUtils.equals(this.f69030j.getPreviousPage(), "homepage_follow") && !TextUtils.equals(this.f69030j.getPreviousPage(), "homepage_hot"))) && !TextUtils.equals(this.f69030j.getEventType(), "poi_page") && !TextUtils.equals(this.f69030j.getEventType(), "poi_map"))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m86069k() {
        String[] split;
        C40961h.m130828a("prop_reuse");
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        for (String str : this.f69036p.getStickerIDs().split(",")) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        intent.putStringArrayListExtra("reuse_sticker_ids", arrayList);
        intent.putExtra("first_face_sticker", (String) arrayList.get(0));
        intent.putExtra("sticker_music", this.f69036p.getMusic());
        intent.putExtra("translation_type", 3);
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) getActivity(), intent);
    }

    /* renamed from: z */
    private boolean m86084z() {
        if (this.f69036p == null || !this.f69036p.isAd()) {
            return false;
        }
        IMiniAppService a = C7167b.m22380b().mo18647a();
        String microAppUrl = this.f69036p.getAwemeRawAd().getMicroAppUrl();
        C33471b a2 = new C33472a().mo85794e("mp_url").mo85790a();
        if (!C33447f.m108191d(microAppUrl) || !a.openMiniApp(getContext(), microAppUrl, a2)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m86070l() {
        this.f69027g = ScrollSwitchStateManager.m98918a(getActivity());
        this.f69028h = HomePageDataViewModel.m98904a(getActivity());
        m86072n();
        this.f69025e.mo3451a((C0935e) new C0935e() {
            public final void onPageScrollStateChanged(int i) {
                DetailFragment.this.f69027g.mo79726c(i);
            }

            public final void onPageSelected(int i) {
                DetailFragment.this.f69027g.mo79718b(i);
            }

            public final void onPageScrolled(int i, float f, int i2) {
                DetailFragment.this.f69027g.mo79701a(i, f, i2);
            }
        });
        this.f69027g.mo79709a((C30251c) new C30251c() {
            /* renamed from: a */
            public final int mo67727a() {
                return DetailFragment.this.f69025e.getCurrentItem();
            }

            /* renamed from: a */
            public final void mo67728a(int i) {
                DetailFragment.this.f69025e.setCurrentItem(i);
            }

            /* renamed from: a */
            public final void mo67729a(int i, boolean z) {
                DetailFragment.this.f69025e.mo3450a(i, z);
            }
        });
        this.f69027g.mo79720b((C0043i) getActivity(), (C0053p<Boolean>) new C26193d<Boolean>(this));
        this.f69027g.mo79731d(this, new C26194e(this));
        this.f69027g.mo79727c(getActivity(), new C26195f(this));
        this.f69027g.mo79743j(getActivity(), new C26196g(this));
        this.f69026f = BusinessComponentServiceUtils.newScrollSwitchHelper(getActivity(), this.f69025e, this.f69029i);
        this.f69045y = new C26058a(getActivity());
        this.f69046z = new C26059b(getActivity(), this.f69045y);
        this.f69029i.notifyDataSetChanged();
        HomePageDataViewModel.m98904a(getActivity()).mo79695a(this.f69030j.getEventType());
        this.f69027g.mo79713a("page_feed", false);
        if (this.f69030j.isChain()) {
            this.f69029i.f61828f = C26197h.f69088a;
        }
        AwemeChangeCallBack.m106764a(getActivity(), this, new C33063a() {
            /* renamed from: a */
            public final void mo67730a(Aweme aweme) {
                if ((DetailFragment.this.getActivity() instanceof AmeActivity) && !DetailFragment.this.f69042v) {
                    ((AmeActivity) DetailFragment.this.getActivity()).tryRemoveDeeplinkBackView();
                }
                DetailFragment.this.f69042v = false;
                DetailFragment.this.f69034n.mo64700a(DetailFragment.this.getContext(), aweme, DetailFragment.this.f69030j.getEventType());
                if (C25329c.m83217a(DetailFragment.this.f69030j.getEventType())) {
                    if (!(aweme == null || DetailFragment.this.f69037q == null || DetailFragment.this.f69037q == aweme)) {
                        DetailFragment.this.f69034n.mo64716k();
                        if (aweme.isAd()) {
                            C34195b.m110394a(aweme.getAid());
                        }
                    }
                } else if (DetailFragment.this.f69037q != aweme) {
                    DetailFragment.this.f69034n.mo64716k();
                }
                DetailFragment.this.f69037q = aweme;
                if (!(aweme == null || aweme.getAuthor() == null)) {
                    DetailFragment.this.f69036p = aweme;
                    DetailFragment.this.mo67711a(aweme);
                    DetailFragment.this.mo67719d();
                    String authorUid = aweme.getAuthorUid();
                    if (!TextUtils.equals(DetailFragment.this.f69035o, authorUid)) {
                        DetailFragment.this.f69035o = authorUid;
                        if (DetailFragment.this.f69036p.isAd() && DetailFragment.this.f69036p.getAuthor() != null) {
                            DetailFragment.this.f69036p.getAuthor().getNickname();
                        }
                        C6726a.m20843a(new Runnable() {
                            public final void run() {
                                if (DetailFragment.this.isAdded() && !DetailFragment.this.getActivity().isFinishing() && DetailFragment.this.f69036p != null) {
                                    DetailFragment.this.mo67716b(DetailFragment.this.f69036p);
                                }
                            }
                        }, C34943c.f91128x);
                    }
                }
            }
        });
        this.f69027g.mo79706a((C23434a) this.f69045y);
        if (EarPhoneUnplugExperiment.shouldPausePlayVideo()) {
            m86065E();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C23435a mo67708a() {
        C23435a aVar = new C23435a();
        Bundle bundle = new Bundle();
        bundle.putString("related_gid", this.f69030j.getRelatedId());
        if (this.f69030j.isShowVideoRank()) {
            aVar.mo61040a(PoiRankDetailPageFragment.class, "page_feed", 0, 1.0f, getArguments());
        } else {
            aVar.mo61040a(DetailPageFragment.class, "page_feed", 0, 1.0f, getArguments());
        }
        if (!m86073o()) {
            aVar.mo61041a(BusinessComponentServiceUtils.getProfilePageClass(), "page_profile", bundle);
        }
        return aVar;
    }

    /* renamed from: d */
    public final void mo67719d() {
        boolean z;
        if (this.f69036p != null) {
            if (!this.f69036p.isCanPlay() || this.f69036p.isDelete()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f69027g.mo79706a((C23434a) this.f69046z);
                if (!this.f69036p.isCanPlay()) {
                    this.f69025e.post(new C26198i(this));
                }
                return;
            }
            if (!this.f69034n.mo64705a() || this.f69034n.mo64710e()) {
                if (this.f69034n.mo64710e()) {
                    this.f69027g.mo79706a((C23434a) this.f69045y);
                } else {
                    this.f69027g.mo79706a((C23434a) this.f69046z);
                }
            } else if (C25329c.m83207I(this.f69036p).booleanValue()) {
                this.f69027g.mo79706a((C23434a) this.f69046z);
                return;
            } else if (this.f69034n.mo64707b()) {
                this.f69027g.mo79706a((C23434a) this.f69045y);
            } else {
                this.f69027g.mo79706a((C23434a) this.f69046z);
            }
            if (C43122ff.m136767b() || m86074p()) {
                this.f69027g.mo79706a((C23434a) this.f69046z);
            }
        }
    }

    @C7709l
    public void receiveJumpToRecord(C40959f fVar) {
        this.f69043w = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67710a(C23434a aVar) {
        this.f69025e.mo61025a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo67718c(String str) throws Exception {
        this.f69029i.mo61037a(str);
        return null;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f69044x != null) {
            this.f69044x.mo60574b(z);
        }
    }

    /* renamed from: a */
    public static DetailFragment m86066a(FeedParam feedParam) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("feed_param", feedParam);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo67717b(String str) {
        if (!C0611k.m2585a(this.f69029i.f61826d)) {
            this.f69029i.mo61037a(str);
        } else {
            C1592h.m7855a((Callable<TResult>) new C26201l<TResult>(this, str), C1592h.f5958b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67712a(Boolean bool) {
        this.f69025e.f61815g = bool.booleanValue();
    }

    /* renamed from: b */
    public void mo67716b(Aweme aweme) {
        String authorUid = aweme.getAuthorUid();
        if (!aweme.isAd() || this.f69034n.mo64710e()) {
            if (!TextUtils.equals(this.f69038r, authorUid)) {
                this.f69034n.mo64700a(getContext(), aweme, this.f69030j.getEventType());
            } else {
                return;
            }
        }
        this.f69038r = authorUid;
    }

    /* renamed from: a */
    private void m86067a(Bundle bundle) {
        this.f69030j = (FeedParam) bundle.getSerializable("feed_param");
        this.f69031k = bundle.getBoolean("extra_challenge_is_hashtag", false);
        if (TextUtils.equals("", this.f69040t) && this.f69030j.getAid() != null) {
            this.f69040t = this.f69030j.getAid();
        }
        if (!C6399b.m19944t()) {
            return;
        }
        if ("from_profile_self".equals(m86079u()) || "from_profile_other".equals(m86079u()) || "from_roaming".equals(m86079u())) {
            this.f69032l = true;
        }
    }

    @C7709l
    public void onScrollToProfileEvent(C28312ah ahVar) {
        if (ahVar != null && this.f69026f != null && getActivity() != null && ahVar.f74625a == getActivity().hashCode() && this.f69026f != null) {
            if (this.f69034n.mo64705a() && !this.f69034n.mo64707b() && !this.f69034n.mo64710e()) {
                C10761a.m31409e(getContext(), (int) R.string.e2).mo25750a();
            } else if (m86075q()) {
                mo67723i();
            } else {
                if (!m86083y() && !m86074p() && !m86084z()) {
                    this.f69026f.mo84696a(this.f69036p, ahVar.f74627c);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C33248at mo67709a(C33248at atVar) {
        atVar.mo85140c(this.f69030j.getPreviousPage()).mo85147j(this.f69030j.getUid()).mo85146i(this.f69030j.getFeedsAwemeId());
        if ("poi_page".equalsIgnoreCase(this.f69030j.getEventType()) || "poi_map".equalsIgnoreCase(this.f69030j.getEventType())) {
            if (mo67722g() != null) {
                atVar.mo85071g(mo67722g());
                atVar.mo85137a(mo67722g().getPoiStruct());
            }
            atVar.mo85139b("poi_page");
            atVar.mo85145g(this.f69030j.getRelatedId());
        }
        return atVar;
    }

    /* renamed from: a */
    public final void mo67711a(Aweme aweme) {
        if (!this.f69039s) {
            if (TextUtils.equals(this.f69040t, aweme.getAid())) {
                this.f69039s = true;
            } else {
                return;
            }
        }
        if (!TextUtils.equals(this.f69041u, aweme.getAid())) {
            this.f69041u = aweme.getAid();
            if (TextUtils.equals(m86079u(), "from_challenge") && TextUtils.equals(this.f69030j.getEventType(), "challenge") && TextUtils.equals(this.f69030j.getPreviousPage(), "discovery")) {
                C6907h.m21524a("discovery_video_play", (Map) new C22984d().mo59973a("enter_from", "challenge").mo59973a("tag_id", this.f69030j.getAid()).mo59973a("group_id", aweme.getAid()).mo59973a("process_id", this.f69030j.getProcessId()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(aweme, this.f69030j.getVideoType() + 3000))).f60753a);
            } else if (TextUtils.equals(m86079u(), "from_music") && TextUtils.equals(this.f69030j.getEventType(), "single_song") && TextUtils.equals(this.f69030j.getPreviousPage(), "discovery")) {
                C6907h.m21524a("discovery_video_play", (Map) new C22984d().mo59973a("enter_from", "single_song").mo59973a("music_id", this.f69030j.getAid()).mo59973a("group_id", aweme.getAid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(aweme, this.f69030j.getVideoType() + 4000))).f60753a);
            }
            if (!TextUtils.equals(m86079u(), "from_discovery_challenge") || !TextUtils.equals(this.f69030j.getEventType(), "discovery")) {
                if (TextUtils.equals(m86079u(), "from_music") && TextUtils.equals(this.f69030j.getEventType(), "discovery")) {
                    C6907h.m21524a("discovery_video_play", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("music_id", this.f69030j.getAid()).mo59973a("group_id", aweme.getAid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(aweme, this.f69030j.getVideoType() + 4000))).f60753a);
                }
                return;
            }
            C6907h.m21524a("discovery_video_play", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("tag_id", this.f69030j.getAid()).mo59973a("group_id", aweme.getAid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(aweme, this.f69030j.getVideoType() + 3000))).f60753a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67713a(Integer num) {
        String str;
        String a = this.f69027g.mo79700a(num.intValue());
        if ("page_profile".equals(a)) {
            String str2 = this.f69028h.f79566e;
            if (this.f69028h.f79567f == null) {
                str = "";
            } else {
                str = this.f69028h.f79567f.getAid();
            }
            C36120b.m116332a(str2, str);
        }
        String a2 = this.f69027g.mo79700a(num.intValue());
        if ("page_feed".equals(a2) || "page_profile".equals(a2)) {
            if (num.intValue() == 0) {
                C42961az.m136380a(new C33771f());
                if (!(this.f69044x == null || this.f69030j == null || !m86071m())) {
                    this.f69044x.onResume();
                }
            } else if (num.intValue() == 1) {
                if (!(this.f69044x == null || this.f69030j == null || !m86071m())) {
                    this.f69044x.onPause();
                }
                C23090a.f60963e = String.valueOf(num);
                DetailPageFragment w = m86081w();
                if (w != null) {
                    C26071a aVar = w.f69059j;
                    if (aVar != null) {
                        C28130ac ai = aVar.mo71903ai();
                        if (ai != null) {
                            ai.mo71528b(6);
                        }
                    }
                }
            }
        }
        if (!this.f69028h.f79571j && this.f69025e != null && TextUtils.equals(a, "page_profile") && this.f69036p != null) {
            this.f69034n.mo64718m();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m86068a(CommonPageFragment commonPageFragment, int i) {
        if (commonPageFragment instanceof DetailPageFragment) {
            ((DetailPageFragment) commonPageFragment).mo67738a(false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f69033m = DataCenter.m75849a(C0069x.m159a(getActivity()), (C0043i) this);
        this.f69025e = (ScrollableViewPager) view.findViewById(R.id.edp);
        m86067a(getArguments());
        m86070l();
        m86063B();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ns, viewGroup, false);
    }
}
