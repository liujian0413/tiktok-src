package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.audio.C23095b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23279c.C23280a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25292bt;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.widget.BaseCustomViewPager;
import com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p280ss.android.ugc.aweme.detail.experiment.DetailEnterAnimationTimeExperiment;
import com.p280ss.android.ugc.aweme.detail.operators.C26117a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26135a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.detail.operators.C26138ao;
import com.p280ss.android.ugc.aweme.detail.operators.C26168s;
import com.p280ss.android.ugc.aweme.detail.p1165i.C26071a;
import com.p280ss.android.ugc.aweme.detail.p1165i.C26071a.C26088a;
import com.p280ss.android.ugc.aweme.discover.helper.C26655c;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.adapter.C28132ae;
import com.p280ss.android.ugc.aweme.feed.adapter.C28133af;
import com.p280ss.android.ugc.aweme.feed.event.C28311ag;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.event.C28326i;
import com.p280ss.android.ugc.aweme.feed.event.C28328k;
import com.p280ss.android.ugc.aweme.feed.event.C28333p;
import com.p280ss.android.ugc.aweme.feed.event.C28338u;
import com.p280ss.android.ugc.aweme.feed.event.C28339v;
import com.p280ss.android.ugc.aweme.feed.event.C28340w;
import com.p280ss.android.ugc.aweme.feed.event.C28341x;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.listener.C28516a;
import com.p280ss.android.ugc.aweme.feed.listener.C28517b;
import com.p280ss.android.ugc.aweme.feed.listener.C28518c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.p1235k.C28513a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DisLikeAwemeLayout;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.C28932e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28963b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.C32960dc;
import com.p280ss.android.ugc.aweme.main.C32990dl;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.C33064q;
import com.p280ss.android.ugc.aweme.main.C33065r;
import com.p280ss.android.ugc.aweme.main.base.C32895a;
import com.p280ss.android.ugc.aweme.main.p1386h.C33050a;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.p1042as.C23089a.C23090a;
import com.p280ss.android.ugc.aweme.p1052b.C23147b;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35663a;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35664b;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35665c;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.C37388a;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.share.model.C38244a;
import com.p280ss.android.ugc.aweme.share.model.C38245b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42980bm;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43238k;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.common.component.fragment.C43676b;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailPageFragment */
public class DetailPageFragment extends CommonPageFragment implements C0053p<C23083a>, C26088a, C26215z, C28132ae, C28133af, C28516a, C28517b, C28518c, C33064q {

    /* renamed from: e */
    protected DmtStatusView f69054e;

    /* renamed from: f */
    C28513a f69055f;

    /* renamed from: g */
    protected View f69056g;

    /* renamed from: h */
    protected FeedSwipeRefreshLayout f69057h;

    /* renamed from: i */
    protected FeedParam f69058i = new FeedParam();

    /* renamed from: j */
    public C26071a f69059j = mo67743d();

    /* renamed from: k */
    protected boolean f69060k = false;

    /* renamed from: l */
    protected C26134am f69061l = null;

    /* renamed from: m */
    private DisLikeAwemeLayout f69062m;

    /* renamed from: n */
    private View f69063n;

    /* renamed from: o */
    private ViewStub f69064o;

    /* renamed from: p */
    private LoadMoreFrameLayout f69065p;

    /* renamed from: q */
    private ViewStub f69066q;

    /* renamed from: r */
    private ImageView f69067r;

    /* renamed from: s */
    private ImageView f69068s;

    /* renamed from: t */
    private boolean f69069t = false;

    /* renamed from: u */
    private boolean f69070u = true;

    /* renamed from: v */
    private C33061p f69071v;

    /* renamed from: w */
    private C23095b f69072w;

    /* renamed from: x */
    private boolean f69073x;

    /* renamed from: y */
    private int f69074y = 0;

    /* renamed from: z */
    private DataCenter f69075z;

    /* renamed from: L */
    private String m86122L() {
        return C33065r.m106769a(this);
    }

    /* renamed from: M */
    private String m86123M() {
        return C33065r.m106770b(this);
    }

    /* renamed from: N */
    private String m86124N() {
        return C33065r.m106771c(this);
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: l */
    public final DmtStatusView mo67750l() {
        return this.f69054e;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67735a(ScrollSwitchStateManager scrollSwitchStateManager, C32990dl dlVar, HomePageDataViewModel homePageDataViewModel, Integer num) {
        String str;
        String str2;
        this.f69059j.mo67616b(num.intValue());
        String a = scrollSwitchStateManager.mo79700a(num.intValue());
        C36102u.f94392a.preloadProfile(getActivity(), a);
        C42961az.m136380a(new C38245b(scrollSwitchStateManager.mo79723b("page_feed")));
        if (num.intValue() == 1) {
            C42961az.m136380a(new C38244a());
        }
        int i = this.f69074y;
        this.f69074y = num.intValue();
        if (TextUtils.isEmpty(C23090a.f60963e)) {
            C23090a.f60960b = a;
        }
        if (!TextUtils.equals(a, "page_feed")) {
            C6857a.m21312e().mo16818a();
            C6857a.m21312e().mo16824b();
        }
        if (!TextUtils.equals(a, "page_feed")) {
            if (!C43316v.m137250H()) {
                C43316v.m137450K().mo104948x();
            } else {
                C44933a.m141791a().mo71672ad();
            }
            C43238k.m137170a().mo104982d();
        }
        String a2 = scrollSwitchStateManager.mo79700a(i);
        char c = 65535;
        int hashCode = a.hashCode();
        if (hashCode != 185242617) {
            if (hashCode == 883457358 && a.equals("page_feed")) {
                c = 0;
            }
        } else if (a.equals("page_profile")) {
            c = 1;
        }
        switch (c) {
            case 0:
                if (!C6399b.m19944t() && TextUtils.equals("page_profile", a2) && TextUtils.equals("homepage_hot", homePageDataViewModel.mo79692a())) {
                    C33050a.m106732a(homePageDataViewModel.mo79692a(), C33230ac.m107238m(homePageDataViewModel.f79567f), C33230ac.m107205a(homePageDataViewModel.f79567f));
                    return;
                }
            case 1:
                C42961az.m136380a(new C28326i());
                if (dlVar != null) {
                    dlVar.mo67668a();
                }
                if (m86120J() != null) {
                    C6909j jVar = new C6909j();
                    jVar.mo16966a("enter_from", homePageDataViewModel.mo79692a());
                    if (!homePageDataViewModel.f79571j) {
                        C6907h.m21521a(getContext(), "slide_left", "left", m86121K(), m86120J() == null ? "" : m86120J().getAid(), jVar.mo16967a());
                        ((C33276r) ((C33276r) new C33276r().mo85310b(homePageDataViewModel.mo79692a()).mo85048a("slide_left")).mo85315e(m86123M()).mo85317f(m86124N()).mo85314d(m86122L()).mo85312c(m86120J(), 0).mo85322o(m86121K()).mo85323p(homePageDataViewModel.f79569h).mo85047a(getContext())).mo85252e();
                    }
                    jVar.mo16966a("group_id", m86120J() == null ? "" : m86120J().getAid());
                    jVar.mo16966a("enter_method", "slide_left");
                    jVar.mo16966a("request_id", homePageDataViewModel.f79569h);
                    jVar.mo16966a("enter_type", "normal_way");
                    if (!TextUtils.isEmpty(C33230ac.m107223e(m86120J()))) {
                        jVar.mo16966a("poi_id", C33230ac.m107223e(m86120J()));
                    }
                    if (C33230ac.m107220c(homePageDataViewModel.mo79692a())) {
                        jVar.mo16966a("city_info", C33230ac.m107204a());
                        jVar.mo16966a("distance_info", C33230ac.m107231i(m86120J()));
                        jVar.mo16966a("poi_type", C33230ac.m107229h(m86120J()));
                        jVar.mo16966a("poi_channel", C33230ac.m107214b());
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(m86120J() == null ? "" : m86120J().getAuthor().getUid()).setJsonObject(jVar.mo16967a()));
                    if (!C6399b.m19944t()) {
                        String str3 = "enter_personal_detail_backup";
                        C22984d a3 = C22984d.m75611a().mo59973a("enter_from", "personal_homepage");
                        String str4 = "to_user_id";
                        if (m86120J() == null) {
                            str = "";
                        } else {
                            str = m86120J().getAuthor().getUid();
                        }
                        C22984d a4 = a3.mo59973a(str4, str).mo59973a("enter_method", "slide_left");
                        String str5 = "group_id";
                        if (m86120J() == null) {
                            str2 = "";
                        } else {
                            str2 = m86120J().getAid();
                        }
                        C6907h.m21524a(str3, (Map) a4.mo59973a(str5, str2).f60753a);
                    }
                }
                C28580o.m93830a(PAGE.PROFILE);
                homePageDataViewModel.f79571j = false;
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67737a(Integer num) {
        if (num.intValue() == 0) {
            this.f69073x = false;
        }
    }

    /* renamed from: a */
    public final void mo67738a(boolean z) {
        this.f69070u = false;
        VerticalViewPager at = this.f69059j.mo73370at();
        if (at != null) {
            at.setDisableScroll(true);
        }
    }

    /* renamed from: a */
    public final boolean mo67740a(String str) {
        String str2;
        boolean z = this.f69061l != null && this.f69061l.mo67687a(str);
        String str3 = "DeleteAweme";
        StringBuilder sb = new StringBuilder("delete aweme: ");
        sb.append(str);
        sb.append(z ? " success" : " failed");
        if (this.f69061l == null) {
            str2 = " null";
        } else {
            str2 = this.f69061l.getClass().getName();
        }
        sb.append(str2);
        C6921a.m21552a(6, str3, sb.toString());
        return z;
    }

    /* renamed from: a */
    public final boolean mo67739a(Aweme aweme) {
        StringBuilder sb = new StringBuilder("should not call this in DetailPageFragment, aid is ");
        sb.append(aweme.getAid());
        C6921a.m21552a(6, "DetailPageFragment", sb.toString());
        return false;
    }

    /* renamed from: F */
    private int m86116F() {
        return this.f69058i.getVideoType();
    }

    /* renamed from: G */
    private Aweme m86117G() {
        return this.f69059j.mo67648r();
    }

    /* renamed from: H */
    private String m86118H() {
        return this.f69058i.getQueryAwemeMode();
    }

    /* renamed from: I */
    private String m86119I() {
        return this.f69058i.getAid();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void mo67753o() {
        m86131b(false);
    }

    /* renamed from: s */
    private void m86137s() {
        m86131b(true);
    }

    /* renamed from: t */
    private static JediViewModel m86138t() {
        JediViewModel b = C28503s.m93681b();
        C28503s.m93682b(b);
        return b;
    }

    /* renamed from: w */
    private String m86141w() {
        return this.f69058i.getFrom();
    }

    /* renamed from: a */
    public final void mo67659a() {
        m86128a(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C26071a mo67743d() {
        return new C26071a();
    }

    /* renamed from: j */
    public final Aweme mo67748j() {
        return this.f69059j.mo67647q();
    }

    /* renamed from: m */
    public final long mo67751m() {
        return this.f69059j.mo67655y();
    }

    /* renamed from: B */
    private void m86113B() {
        m86114D();
        m86132c("mode_change");
    }

    /* renamed from: J */
    private Aweme m86120J() {
        return AwemeChangeCallBack.m106763a(getActivity());
    }

    /* renamed from: K */
    private String m86121K() {
        return C33230ac.m107243r(AwemeChangeCallBack.m106763a(getActivity()));
    }

    /* renamed from: r */
    private void m86136r() {
        this.f69062m.setListener(new C28932e() {
            /* renamed from: a */
            public final void mo67761a(boolean z) {
                DetailPageFragment.this.mo67745f();
            }
        });
    }

    /* renamed from: x */
    private void m86142x() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: C */
    public final SparseArray<C43676b> mo16932C() {
        SparseArray<C43676b> C = super.mo16932C();
        C.append(C23280a.f61314c, this.f69059j);
        return C;
    }

    /* renamed from: k */
    public final boolean mo67749k() {
        if (this.f69059j == null || !this.f69059j.mo73355aQ()) {
            return false;
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.f69072w != null) {
            this.f69072w.mo60171a();
        }
    }

    /* renamed from: u */
    private void m86139u() {
        this.f69072w = new C23095b(getActivity(), this.f69064o);
        this.f69072w.mo60172a(2, m86141w());
    }

    /* renamed from: v */
    private void m86140v() {
        this.f69075z = DataCenter.m75849a(C0069x.m159a(getActivity()), (C0043i) this).mo60132a("action_remove_recommend_user_card", (C0053p<C23083a>) this).mo60132a("onBack", (C0053p<C23083a>) this);
    }

    /* renamed from: y */
    private void m86143y() {
        if (BusinessComponentServiceUtils.getMediumWebViewRefHolder().mo71317a()) {
            BusinessComponentServiceUtils.getMediumWebViewRefHolder().mo71316a(m86117G(), "exit", m86141w());
        }
    }

    /* renamed from: z */
    private void m86144z() {
        if (BusinessComponentServiceUtils.getMixSearchRNWebViewRefHolder().mo68292a()) {
            BusinessComponentServiceUtils.getMixSearchRNWebViewRefHolder().mo68291a(m86117G(), "exit", m86141w());
        }
    }

    /* renamed from: b */
    public final void mo67669b() {
        BusinessComponentServiceUtils.getBusinessBridgeService();
        this.f69066q.setLayoutResource(R.layout.ac4);
        this.f69066q.inflate();
        ScrollSwitchStateManager.m98918a(getActivity()).mo79716a(false);
    }

    /* renamed from: f */
    public final void mo67745f() {
        if (this.f69062m != null) {
            this.f69062m.mo73788b(false);
            this.f69062m.setInDislikeMode(false);
            m86137s();
            this.f69067r.setVisibility(0);
        }
    }

    /* renamed from: A */
    private void m86112A() {
        this.f69059j.mo67653w();
        m86115E();
        if (this.f69058i.isShowVideoRank()) {
            C6907h.m21524a("back", (Map) C22984d.m75611a().mo59973a("enter_from", "poi_video_leaderboard").mo59973a("previous_page", this.f69058i.getEventType()).f60753a);
        }
    }

    /* renamed from: g */
    public final boolean mo67746g() {
        if (this.f69061l == null || this.f69061l.mo67689c() || this.f69061l.mo67692f()) {
            return false;
        }
        if (this.f69061l instanceof C26136b) {
            ((C26136b) this.f69061l).mo67695a(true);
        } else {
            this.f69059j.mo67623d(true);
        }
        return m86128a(4);
    }

    /* renamed from: i */
    public final boolean mo67747i() {
        if (this.f69061l == null || this.f69061l.mo67689c() || this.f69061l.mo67693g() || !(this.f69061l instanceof C26135a)) {
            return false;
        }
        if (this.f69061l instanceof C26136b) {
            ((C26136b) this.f69061l).mo67695a(true);
        } else {
            this.f69059j.mo67623d(true);
        }
        return m86128a(2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo67752n() {
        if (!C26213x.m86186a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            this.f69057h.setRefreshing(false);
            return;
        }
        this.f69061l.mo67684a(2, this.f69058i, m86116F(), this.f69069t);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f69059j.mo67634n();
        if (this.f69061l != null) {
            this.f69061l.mo67691e();
        }
        if (this.f69072w != null) {
            this.f69072w.mo60176b();
        }
        m86144z();
        m86143y();
    }

    /* renamed from: D */
    private void m86114D() {
        int poiClassCode = this.f69058i.getPoiClassCode();
        String cityCode = this.f69058i.getCityCode();
        String districtCode = this.f69058i.getDistrictCode();
        String backendType = this.f69058i.getBackendType();
        IPoiService iPoiService = (IPoiService) ServiceManager.get().getService(IPoiService.class);
        if (iPoiService != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("poi_class_code", Integer.valueOf(poiClassCode));
            bundle.putString("backend_type_code", backendType);
            bundle.putString("sub_class", this.f69058i.getSubClass());
            bundle.putString("city_code", cityCode);
            bundle.putString("district_code", districtCode);
            bundle.putString("enter_from", "poi_video_leaderboard");
            bundle.putString("enter_method", "click_leaderboard_bar");
            iPoiService.openPoiRankActivity(getContext(), bundle);
            getActivity().overridePendingTransition(R.anim.cj, 0);
        }
    }

    /* renamed from: E */
    private void m86115E() {
        if (!this.f69060k) {
            if (this.f69062m.f75632m) {
                mo67745f();
            } else if (this.f69055f == null || !this.f69055f.mo72225a(new C26204o(this))) {
                m86142x();
                if (this.f69058i != null && this.f69058i.isFromAdsActivity()) {
                    int a = C6384b.m19835a().mo15287a(DetailEnterAnimationTimeExperiment.class, true, "detail_animation_time", C6384b.m19835a().mo15295d().detail_animation_time, 0);
                    if (a == 1) {
                        getActivity().overridePendingTransition(R.anim.c8, R.anim.c8);
                    } else if (a == 2) {
                        getActivity().overridePendingTransition(R.anim.c8, R.anim.c8);
                    } else {
                        getActivity().overridePendingTransition(R.anim.c9, R.anim.c9);
                    }
                }
            }
        }
    }

    /* renamed from: p */
    private void m86134p() {
        this.f69054e = new DmtStatusView(getContext());
        this.f69065p.addView(this.f69054e, new LayoutParams(-1, -1));
        this.f69054e.setVisibility(8);
        if (this.f69058i.isShowVideoRank()) {
            this.f69068s.setVisibility(0);
            C26202m mVar = new C26202m(this);
            C10805b bVar = new C10806a(getActivity()).mo25985a((int) R.drawable.b7_).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, mVar).f29135a;
            this.f69054e.setBuilder(C10803a.m31631a(getContext()).mo25964b(bVar).mo25961a(new C10806a(getActivity()).mo25990b((int) R.string.bzv).mo25993c(R.string.c47).mo25986a(ButtonStyle.BORDER, R.string.fia, mVar).f29135a));
            this.f69054e.setBackgroundColor(getContext().getResources().getColor(R.color.lw));
        } else {
            this.f69054e.setBuilder(C10803a.m31631a((Context) getActivity()));
            this.f69054e.setBackgroundColor(0);
        }
        ((MarginLayoutParams) this.f69063n.getLayoutParams()).topMargin = C26190ab.m86177a();
        if (this.f69059j != null) {
            int b = (int) C9738o.m28708b(getContext(), 15.0f);
            C32990dl dlVar = this.f69059j.f68902n;
            ScrollSwitchStateManager a = ScrollSwitchStateManager.m98918a(getActivity());
            HomePageDataViewModel a2 = HomePageDataViewModel.m98904a(getActivity());
            a.mo79735f(getActivity(), new C26203n(this, a, b));
            a.mo79731d(getActivity(), new C26205p(this, a, dlVar, a2));
            a.mo79733e(getActivity(), new C26206q(this));
            if (!C26213x.m86186a(getContext())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                return;
            }
        }
        m86136r();
        m86139u();
        if (!C26655c.m87586a() || this.f69058i.isHotSpot() || this.f69058i.isShowVideoRank()) {
            this.f69067r.setVisibility(8);
        } else {
            this.f69067r.setVisibility(0);
            if (C6399b.m19945u()) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f69067r.getLayoutParams();
                BusinessComponentServiceUtils.getBusinessBridgeService().mo61470b();
                this.f69067r.setBackground(null);
                ImageView imageView = this.f69067r;
                Context context = getContext();
                BusinessComponentServiceUtils.getBusinessBridgeService().mo61470b();
                imageView.setImageDrawable(C0683b.m2903a(context, 0));
                layoutParams.rightMargin = (int) C9738o.m28708b(getContext(), 6.5f);
                layoutParams.width = (int) C9738o.m28708b(getContext(), 44.0f);
                layoutParams.height = (int) C9738o.m28708b(getContext(), 44.0f);
                this.f69067r.setLayoutParams(layoutParams);
            }
        }
        this.f69067r.setOnClickListener(new C26207r(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67733a(View view) {
        m86113B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo67741b(View view) {
        m86112A();
    }

    @C7709l
    public void onBlockUserEvent(C35663a aVar) {
        m86128a(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67736a(Boolean bool) {
        this.f69057h.setEnabled(bool.booleanValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo67744d(View view) {
        m86128a(1);
    }

    @C7709l
    public void onFeedFetchEvent(C28333p pVar) {
        if (TextUtils.equals(pVar.f74661a, "from_cell_recommend")) {
            m86128a(4);
        }
    }

    /* renamed from: a */
    private void m86126a(Bundle bundle) {
        this.f69058i = (FeedParam) bundle.getSerializable("feed_param");
        this.f69069t = bundle.getBoolean("extra_challenge_is_hashtag", false);
    }

    @C7709l
    public void onJump2RankList(C28338u uVar) {
        if (this.f69059j != null && !this.f69059j.f75359am) {
            m86114D();
            m86132c("click_leaderboard_label");
        }
    }

    @C7709l
    public void onMobEnterFromEvent(C28340w wVar) {
        if (wVar != null && this.f69071v != null && getActivity() != null) {
            HomePageDataViewModel.m98904a(getActivity()).mo79695a(wVar.f74667a);
        }
    }

    @C7709l
    public void onMobRequestIdEvent(C28341x xVar) {
        if (xVar != null && this.f69071v != null && getActivity() != null) {
            HomePageDataViewModel.m98904a(getActivity()).f79569h = xVar.f74668a;
        }
    }

    @C7709l
    public void onScrollToDetailEvent(C28311ag agVar) {
        if (agVar != null && this.f69071v != null && getActivity() != null) {
            HomePageDataViewModel.m98904a(getActivity()).mo79695a(agVar.f74623a);
        }
    }

    /* renamed from: a */
    private static boolean m86129a(C26134am amVar) {
        if (amVar == null) {
            return true;
        }
        if (amVar instanceof C26117a) {
            return ((C26117a) amVar).mo67690d();
        }
        return false;
    }

    /* renamed from: b */
    private int m86130b(String str) {
        List b = this.f69059j.mo71886W().mo71593b();
        if (b != null && b.size() > 0) {
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) != null && TextUtils.equals(((Aweme) b.get(i)).getAid(), str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f69059j.mo67627f(z);
        if (z) {
            this.f69059j.mo67621c(true);
            this.f69059j.f68898j = true;
            this.f69059j.mo67651u();
        } else {
            this.f69059j.mo67621c(false);
            this.f69059j.f68898j = false;
        }
        if (this.f69072w != null) {
            this.f69072w.mo60171a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1013481626) {
                if (hashCode == 22405807 && str.equals("action_remove_recommend_user_card")) {
                    c = 1;
                }
            } else if (str.equals("onBack")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    m86115E();
                    return;
                case 1:
                    if (aVar.mo60161a() != null) {
                        this.f69059j.mo61747c_(m86130b((String) aVar.mo60161a()));
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: b */
    private void m86131b(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C41540at.m132301a(this.f69056g, this.f69056g.getAlpha(), 1.0f);
            C42961az.m136380a(new C28324g(false, 2, z, activity.hashCode()));
        }
    }

    /* renamed from: c */
    private void m86132c(String str) {
        C6907h.m21524a("enter_poi_leaderboard", (Map) C22984d.m75611a().mo59973a("city_info", this.f69058i.getCityCode()).mo59973a("enter_method", str).mo59973a("poi_channel", this.f69058i.getBackendType()).mo59973a("enter_from", "poi_video_leaderboard").mo59973a("previous_page", this.f69058i.getPreviousPage()).mo59973a("sub_class", this.f69058i.getSubClass()).mo59973a("district_code", this.f69058i.getDistrictCode()).f60753a);
    }

    /* renamed from: e */
    private void m86133e(View view) {
        this.f69062m = (DisLikeAwemeLayout) view.findViewById(R.id.a9j);
        this.f69063n = view.findViewById(R.id.ap1);
        this.f69064o = (ViewStub) view.findViewById(R.id.ap2);
        this.f69056g = view.findViewById(R.id.jo);
        this.f69056g.setOnClickListener(new C26208s(this));
        this.f69065p = (LoadMoreFrameLayout) view.findViewById(R.id.bua);
        this.f69057h = (FeedSwipeRefreshLayout) view.findViewById(R.id.cr7);
        this.f69066q = (ViewStub) view.findViewById(R.id.dcn);
        this.f69067r = (ImageView) view.findViewById(R.id.bbw);
        this.f69068s = (ImageView) view.findViewById(R.id.bb8);
        this.f69068s.setOnClickListener(new C26209t(this));
    }

    @C7709l
    public void onDislikeAwemeEvent(C28324g gVar) {
        if (getActivity() != null && gVar.f74654e == getActivity().hashCode() && !C32698a.m105818a(m86120J()) && gVar.f74651b == 2) {
            boolean z = gVar.f74650a;
            ScrollSwitchStateManager.m98918a(getActivity()).mo79716a(!z);
            if (z) {
                C41540at.m132301a(this.f69056g, this.f69056g.getAlpha(), 0.0f);
                this.f69067r.setVisibility(8);
                if (gVar.f74655f) {
                    m86125a(gVar.f74652c, gVar.f74653d);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo67742c(View view) {
        String str;
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setSearchFrom(18);
        Aweme a = AwemeChangeCallBack.m106763a(getActivity());
        if (a != null) {
            str = a.getAid();
        } else {
            str = "";
        }
        C37385g gVar = C37385g.f97617a;
        C37388a aVar = new C37388a(getActivity(), searchResultParam, SearchEnterParam.newBuilder().mo94094a("video_detail").mo94093a(2).mo94097c(str).mo94096b(this.f69058i.getEventType()).mo94095a(), "video_detail", this.f69058i.getEventType(), null);
        gVar.launchSearchPage(aVar);
    }

    /* renamed from: a */
    private boolean m86128a(int i) {
        if (this.f69061l == null || this.f69061l.mo67689c()) {
            return false;
        }
        if (TextUtils.equals("from_local", m86118H())) {
            Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(m86119I());
            if (!(awemeById == null || this.f69059j == null)) {
                this.f69059j.mo67610a(awemeById);
                return true;
            }
        }
        this.f69061l.mo67684a(i, this.f69058i, m86116F(), this.f69069t);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67732a(float f) {
        int i;
        if (this.f69063n != null) {
            this.f69063n.setAlpha(f);
            View view = this.f69063n;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m86125a(float f, float f2) {
        String str;
        if (this.f69062m != null && m86120J() != null) {
            C32960dc.m106545m(false);
            String str2 = "click_trans_layer";
            C22984d a = new C22984d().mo59973a("group_id", m86120J().getAid());
            String str3 = "author_id";
            if (m86120J().getAuthor() != null) {
                str = m86120J().getAuthor().getUid();
            } else {
                str = "";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(m86120J()))).mo59973a("enter_from", this.f69059j.aw_()).f60753a);
            if (C28963b.m95198a()) {
                Dialog newOptionsDialog = BusinessComponentServiceUtils.newOptionsDialog(getContext(), m86120J(), this.f69059j.aw_());
                newOptionsDialog.setOnDismissListener(new OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        DetailPageFragment.this.mo67745f();
                    }
                });
                newOptionsDialog.show();
                return;
            }
            this.f69062m.mo73786a(f, f2, this.f69059j.aw_(), m86120J());
            this.f69062m.setInDislikeMode(true);
            if (this.f69062m.getAdapter() != null) {
                this.f69062m.getAdapter().notifyDataSetChanged();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        m86133e(view);
        this.f69071v = C32895a.m106470a(getActivity());
        m86126a(getArguments());
        m86134p();
        m86140v();
        if (getContext() != null) {
            BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
            getContext();
            this.f69055f = null;
        } else {
            C6921a.m21552a(6, "vs", "DetailFragment get Activity is null!!!");
        }
        this.f69057h.setEnabled(false);
        C25673a a = C28503s.m93677a();
        this.f69061l = C26168s.m86028a(this.f69058i, a, m86138t());
        int a2 = this.f69061l.mo67682a(m86116F());
        if (!this.f69061l.mo67686a((Fragment) this)) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        if (this.f69061l instanceof C26136b) {
            ((C26136b) this.f69061l).mo67694a((C28467s) this.f69059j);
        }
        if ((this.f69061l instanceof C26135a) && ((C26135a) this.f69061l).mo67699d()) {
            this.f69057h.setEnabled(true);
            DetailLoadStateManager.m86109a(getActivity()).f69053a.observe(this, new C26210u(this));
            this.f69057h.setOnRefreshListener(new C26211v(this));
        }
        this.f69058i.setPageType(a2);
        C43222g gVar = C28418f.m93413a().f74931a;
        C28418f.m93413a().f74931a = null;
        if (!(gVar == null || getActivity() == null)) {
            C28418f.m93413a().f74932b = this.f69058i.getAid();
            StringBuilder sb = new StringBuilder("use share player manager, from ");
            sb.append(this.f69058i.getFrom());
            C6921a.m21562b("DetailPageFragment", sb.toString());
            FeedSharePlayerViewModel.getViewModel(getActivity()).player = gVar;
            this.f69059j.mo73334a(gVar);
            this.f69059j.mo67603a(C28418f.m93413a().f74933c);
            C28418f.m93413a().f74933c = -1;
        }
        this.f69059j.f68899k = new C26212w(this);
        this.f69059j.mo73322a(this.f69058i);
        this.f69061l.mo67683a();
        this.f69059j.f75360an = this.f69061l.mo67683a();
        this.f69059j.mo67619b(C25292bt.m83100a(this));
        this.f69059j.mo67605a(view, bundle);
        this.f69059j.mo67625e("from_profile_self".equals(m86141w()));
        this.f69059j.f68903o = this;
        this.f69059j.f68897i = this;
        this.f69059j.mo67609a((C28517b) this);
        this.f69059j.f68896h = this;
        this.f69059j.f75315J = this;
        if (TextUtils.equals(m86141w(), "from_follow_page")) {
            this.f69059j.f75357ak = C22704b.f60414c;
        }
        if (!m86129a(this.f69061l)) {
            this.f69061l.mo67685a((C26138ao) this.f69059j);
            if (this.f69061l.mo67688b()) {
                m86128a(1);
            }
            this.f69059j.mo67631k();
            VerticalViewPager at = this.f69059j.mo73370at();
            if (at != null) {
                at.setDisableScroll(!this.f69070u);
                C42980bm.m136450a("detail_page").mo104687a((BaseCustomViewPager) at);
            }
            C28503s.m93683b(a);
        } else if (!C7163a.m22363a()) {
            try {
                str = this.f69058i.toString();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder("innerError");
                sb2.append(th.toString());
                str = sb2.toString();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_stack", str);
                jSONObject.put("errorType", "detail_page_npe");
                C6893q.m21447a("aweme_error_find_bug", jSONObject);
            } catch (Throwable th2) {
                C6921a.m21559a(th2);
            }
            if (getActivity() != null) {
                getActivity().finish();
            }
        } else {
            throw new IllegalStateException("operator 没有考虑到空进程的情况，");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C23147b.f61094a.mo60289a((Activity) getActivity(), (int) R.layout.fragment_detail_page, layoutInflater, viewGroup);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67734a(ScrollSwitchStateManager scrollSwitchStateManager, int i, Triple triple) {
        int intValue = ((Integer) triple.getFirst()).intValue();
        float floatValue = ((Float) triple.getSecond()).floatValue();
        int intValue2 = ((Integer) triple.getThird()).intValue();
        this.f69059j.mo67602a(intValue, floatValue, intValue2);
        if (intValue == scrollSwitchStateManager.mo79724c("page_feed")) {
            if (!this.f69073x) {
                this.f69073x = true;
                C42961az.m136380a(new C28326i());
                C42961az.m136380a(new C28328k());
                C42961az.m136380a(new C35665c());
                C42961az.m136380a(new C35664b());
            }
            if (intValue2 > i) {
                this.f69059j.mo67621c(false);
            } else {
                this.f69059j.mo67621c(true);
            }
            C42961az.m136380a(new C28339v(false));
        }
    }
}
