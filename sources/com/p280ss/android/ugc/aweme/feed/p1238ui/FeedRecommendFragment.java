package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C23279c.C23280a;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.C28582p;
import com.p280ss.android.ugc.aweme.feed.C28695t;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.C28132ae;
import com.p280ss.android.ugc.aweme.feed.adapter.C28133af;
import com.p280ss.android.ugc.aweme.feed.event.C28309ae;
import com.p280ss.android.ugc.aweme.feed.event.C28333p;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.listener.C28517b;
import com.p280ss.android.ugc.aweme.feed.listener.C28520e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28545a;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28548b;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.C28571f;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C28576a;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28447b;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28454h;
import com.p280ss.android.ugc.aweme.feed.panel.C28633q;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.homepage.api.data.C30245a;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.interest.C32196i;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CFragmentFeed;
import com.p280ss.android.ugc.aweme.main.C33013g;
import com.p280ss.android.ugc.aweme.main.C33054j;
import com.p280ss.android.ugc.aweme.main.C33055k;
import com.p280ss.android.ugc.aweme.metrics.C33274p;
import com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42695c;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42970bd;
import com.p280ss.android.ugc.aweme.utils.C43051dc;
import com.p280ss.android.ugc.common.component.fragment.C43676b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment */
public class FeedRecommendFragment extends BaseFeedListFragment<C28454h> implements C28132ae, C28133af, C28520e, C33013g {

    /* renamed from: k */
    public C28633q f75690k = new C28633q("homepage_hot", 0);

    /* renamed from: l */
    public C28695t f75691l;

    /* renamed from: s */
    C29027y f75692s = null;

    /* renamed from: t */
    C28576a f75693t = null;

    /* renamed from: u */
    C7562b<UgAwemeActivitySetting, C7581n> f75694u = new C7562b<UgAwemeActivitySetting, C7581n>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7581n invoke(UgAwemeActivitySetting ugAwemeActivitySetting) {
            if (ugAwemeActivitySetting != null) {
                FeedRecommendFragment.this.f75692s = C28677a.m94349c().mo73482a(FeedRecommendFragment.this.f75583f, (C28648x) FeedRecommendFragment.this.f75690k, ugAwemeActivitySetting);
                FeedRecommendFragment.this.f75692s.mo74350b(FeedRecommendFragment.this.getActivity());
                C33634a.m108554b().f87779b.remove(this);
            }
            return null;
        }
    };

    /* renamed from: D */
    private static void m94581D() {
        C42970bd.m136411a();
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: r */
    public final String mo73823r() {
        return "FeedRecommendFragment";
    }

    /* renamed from: s */
    public final String mo73825s() {
        return "homepage_hot";
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public C28454h mo73773i() {
        return new C28454h(this);
    }

    /* renamed from: g */
    public final boolean mo67746g() {
        mo73849f();
        return super.mo67746g();
    }

    /* renamed from: k */
    public final boolean mo67749k() {
        return this.f75690k.mo73355aQ();
    }

    /* renamed from: m */
    public final void mo73776m() {
        this.f75690k.mo73392bm();
    }

    /* renamed from: o */
    public final C28130ac mo73816o() {
        return this.f75690k.mo71903ai();
    }

    /* renamed from: C */
    public final SparseArray<C43676b> mo16932C() {
        SparseArray<C43676b> C = super.mo16932C();
        C.append(C23280a.f61314c, this.f75690k);
        return C;
    }

    /* renamed from: e */
    public final void mo73848e() {
        if (this.f75690k != null) {
            this.f75690k.mo73375az();
        }
    }

    public void onStop() {
        super.onStop();
        C6903bc.m21505x().mo57944d();
    }

    /* renamed from: p */
    public final void mo73821p() {
        this.f75584g.setRefreshing(true);
        mo73772d_(false);
    }

    /* renamed from: q */
    public final int mo73852q() {
        if (this.f75690k != null) {
            return this.f75690k.mo73384be();
        }
        return 0;
    }

    /* renamed from: y */
    public final void mo73853y() {
        if (mo67749k()) {
            this.f75690k.mo73356aR();
        }
    }

    /* renamed from: f */
    public final void mo73849f() {
        if (C6399b.m19946v() && this.f75586i != null) {
            ((C28454h) this.f75586i).f75040e = mo73852q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo73775l() {
        if (!super.mo73775l() || !((C28454h) this.f75586i).mo72191e()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private void m94580B() {
        String str;
        Lock lock;
        String str2;
        String str3 = null;
        if (getActivity() instanceof C33054j) {
            HomePageDataViewModel a = HomePageDataViewModel.m98904a(getActivity());
            C30245a aVar = a.f79563b;
            String a2 = aVar.mo79697a();
            str = aVar.mo79698b();
            String c = aVar.mo79699c();
            String str4 = a2;
            lock = a.f79564c;
            str2 = c;
            str3 = str4;
        } else {
            str2 = null;
            lock = null;
            str = null;
        }
        mo73849f();
        m94585a(str3, str, str2, lock);
    }

    /* renamed from: F */
    private void m94583F() {
        if (getActivity() != null) {
            DataCenter a = DataCenter.m75849a(C0069x.m159a(getActivity()), (C0043i) this);
            a.mo60134a("tryShowGuideView", (Object) null);
            if (!((Boolean) a.mo60136b("lastTryShowGuideViewResult", Boolean.valueOf(false))).booleanValue()) {
                this.f75690k.mo67651u();
            }
        }
    }

    /* renamed from: z */
    private void m94586z() {
        if (C33634a.m108553a()) {
            UgAwemeActivitySetting ugAwemeActivitySetting = C33634a.m108554b().f87778a;
            if (ugAwemeActivitySetting != null) {
                this.f75692s = C28677a.m94349c().mo73482a(this.f75583f, (C28648x) this.f75690k, ugAwemeActivitySetting);
                this.f75692s.mo74350b(getActivity());
            }
            return;
        }
        C33634a.m108554b().f87779b.add(this.f75694u);
    }

    /* renamed from: d */
    public final boolean mo72130d() {
        if (((C28454h) this.f75586i).mo66539h() == null || ((C28447b) ((C28454h) this.f75586i).mo66539h()).getData() == null || !((FeedItemList) ((C28447b) ((C28454h) this.f75586i).mo66539h()).getData()).isRefreshClear()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo73774j() {
        ((C28454h) this.f75586i).f75039d = true;
        return ((C28454h) this.f75586i).mo56976a(Integer.valueOf(4), Integer.valueOf(this.f75686o), Integer.valueOf(2));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f75690k.mo67634n();
        if (this.f75586i != null) {
            ((C28454h) this.f75586i).mo59134U_();
        }
        C33634a.m108554b().f87779b.remove(this.f75694u);
        if (this.f75693t != null) {
            this.f75693t.mo73288a();
        }
        C28582p.m93844b();
    }

    public void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity instanceof C33054j) {
            Fragment curFragment = ((C33054j) activity).getCurFragment();
            if ((curFragment instanceof C33055k) && (((C33055k) curFragment).mo84447b() instanceof FeedRecommendFragment)) {
                C6903bc.m21505x().mo57942c(getActivity());
            }
        }
    }

    /* renamed from: A */
    private void m94579A() {
        this.f75690k.mo73491a((C28132ae) this);
        this.f75690k.mo67609a((C28517b) this);
        this.f75690k.f75315J = this;
        this.f75690k.f75316K = this;
        this.f75584g.setOnRefreshListener(new C23386b() {
            /* renamed from: a */
            public final void mo60744a() {
                if (!C28993r.m95218a(FeedRecommendFragment.this.getActivity())) {
                    C10761a.m31399c((Context) FeedRecommendFragment.this.getActivity(), (int) R.string.cjs).mo25750a();
                    FeedRecommendFragment.this.f75587j.setRefreshing(false);
                    return;
                }
                FeedRecommendFragment.this.mo73849f();
                if (FeedRecommendFragment.this.mo72130d()) {
                    FeedRecommendFragment.this.mo73847b("slide_down");
                    ((C28454h) FeedRecommendFragment.this.f75586i).mo56976a(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Boolean.valueOf(FeedRecommendFragment.this.f75691l.mo73758a()));
                } else {
                    ((C28454h) FeedRecommendFragment.this.f75586i).mo56976a(Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(3));
                }
                if (C28548b.m93760b()) {
                    C28545a.m93751b();
                }
                C42961az.m136380a(new C42695c(0));
            }
        });
        this.f75690k.mo73326a((C0935e) new C0935e() {

            /* renamed from: a */
            int f75697a = -1;

            /* renamed from: b */
            int f75698b;

            public final void onPageScrollStateChanged(int i) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
                if (r5 == (r4.f75699c.f75690k.mo71886W().getCount() - 1)) goto L_0x0045;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r5) {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment.this
                    com.ss.android.ugc.aweme.feed.ui.y r0 = r0.f75692s
                    if (r0 == 0) goto L_0x000f
                    com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment.this
                    com.ss.android.ugc.aweme.feed.ui.y r0 = r0.f75692s
                    int r1 = r4.f75698b
                    r0.mo74347a(r1, r5)
                L_0x000f:
                    r4.f75698b = r5
                    r4.f75697a = r5
                    r0 = 0
                    r1 = 1
                    if (r5 != r1) goto L_0x002c
                    com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment.this
                    android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                    if (r2 == 0) goto L_0x002c
                    com.ss.android.ugc.aweme.ba r2 = com.p280ss.android.ugc.aweme.C6903bc.m21505x()
                    com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment.this
                    android.support.v4.app.FragmentActivity r3 = r3.getActivity()
                    r2.mo57933a(r3, r0)
                L_0x002c:
                    boolean r2 = com.p280ss.android.ugc.aweme.feed.netdetector.C28548b.m93760b()
                    if (r2 == 0) goto L_0x004e
                    if (r5 == 0) goto L_0x0045
                    if (r5 <= 0) goto L_0x0046
                    com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment.this     // Catch:{ Exception -> 0x004e }
                    com.ss.android.ugc.aweme.feed.panel.q r2 = r2.f75690k     // Catch:{ Exception -> 0x004e }
                    com.ss.android.ugc.aweme.feed.adapter.z r2 = r2.mo71886W()     // Catch:{ Exception -> 0x004e }
                    int r2 = r2.getCount()     // Catch:{ Exception -> 0x004e }
                    int r2 = r2 - r1
                    if (r5 != r2) goto L_0x0046
                L_0x0045:
                    r0 = 1
                L_0x0046:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x004e }
                    com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.C28571f.m93811b(r5)     // Catch:{ Exception -> 0x004e }
                    return
                L_0x004e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment.C287263.onPageSelected(int):void");
            }

            public final void onPageScrolled(int i, float f, int i2) {
                if (i == this.f75697a && f < 1.0E-10f) {
                    this.f75697a = -1;
                }
                if (FeedRecommendFragment.this.f75691l != null && f > 0.0f) {
                    FeedRecommendFragment.this.f75691l.mo73757a(i);
                }
            }
        });
        ((C28454h) this.f75586i).mo66537a(this.f75690k);
        ((C28454h) this.f75586i).f75038a = this.f75690k;
        ((C28454h) this.f75586i).mo66536a(new C28447b(6, 0));
        ((C28454h) this.f75586i).mo66568a((C25676d) this.f75690k);
        this.f75691l = new C28695t(this.f75586i);
    }

    /* renamed from: a */
    public final void mo67659a() {
        C6921a.m21552a(4, "FeedFetchModel", "feedRecommendFragment called onLoadMore()");
        mo73849f();
        ((C28454h) this.f75586i).mo56976a(Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(2));
        if (C28548b.m93760b()) {
            C28545a.m93751b();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.mUserVisibleHint && isResumed() && this.f75687p != null && !this.f75687p.mHidden && C43051dc.m136580a()) {
            new C33274p().mo85304a("homepage_hot").mo85252e();
            C28580o.m93830a(PAGE.FEED);
        }
        C6903bc.m21505x().mo57935a((Context) getActivity(), this.f75690k.mo71904aj());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73846a(View view) {
        mo73772d_(false);
    }

    @C7709l
    public void onFeedFetchEvent(C28333p pVar) {
        if (TextUtils.equals(pVar.f74661a, "from_full_recommend")) {
            mo73774j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DmtStatusView mo73769a(Context context) {
        return ((DmtStatusViewInflate) C7121a.m22249b(DmtStatusViewInflate.class)).getDmtStatusView(context, new C28992q(this));
    }

    /* renamed from: d */
    public final void mo73815d(boolean z) {
        super.mo73815d(z);
        this.f75690k.mo73418m(z);
        C6903bc.m21505x().mo57946e();
        C28571f.m93814d(Boolean.valueOf(false));
    }

    /* renamed from: b */
    public final void mo73847b(String str) {
        if (C28344a.m93114e()) {
            C6907h.m21524a("homepage_hot_click", (Map) C22984d.m75611a().mo59973a("click_method", "refresh").mo59973a("refresh_mode", str).mo59970a("last_play_cnt", this.f75691l.f75575a).f60753a);
        }
    }

    /* renamed from: c */
    public final void mo73814c(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity instanceof C33054j) {
            Fragment curFragment = ((C33054j) activity).getCurFragment();
            if ((curFragment instanceof C33055k) && (((C33055k) curFragment).mo84447b() instanceof FeedRecommendFragment)) {
                C6903bc.m21505x().mo57942c(getActivity());
                C6903bc.m21505x().mo57935a((Context) getActivity(), this.f75690k.mo71904aj());
            }
        }
        C28571f.m93814d(Boolean.valueOf(true));
        if (this.mUserVisibleHint && isViewValid()) {
            super.mo73814c(z);
            if (z) {
                m94583F();
            } else {
                this.f75690k.mo73362aX();
            }
            mo73840e(false);
            C28130ac o = mo73816o();
            if (o != null) {
                C24716aj o2 = o.mo71564o();
                if (o2 != null) {
                    o2.mo64568a(false);
                }
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C32196i iVar) {
        mo73849f();
        if (iVar.f84064a) {
            ((C28454h) this.f75586i).f75039d = true;
            ((C28454h) this.f75586i).mo56976a(Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(2));
            return;
        }
        ((C28454h) this.f75586i).mo56976a(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Boolean.valueOf(false));
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f75690k.mo67627f(z);
        if (this.mUserVisibleHint && isResumed() && this.f75687p != null && !this.f75687p.mHidden) {
            new C33274p().mo85304a("homepage_hot").mo85252e();
            C28580o.m93830a(PAGE.FEED);
        }
        if (!z && isResumed()) {
            C6857a.m21312e().mo16818a();
            C6857a.m21312e().mo16824b();
        }
    }

    /* renamed from: d_ */
    public final boolean mo73772d_(boolean z) {
        if (!isViewValid() || this.f75586i == null) {
            return false;
        }
        boolean z2 = ((C28454h) this.f75586i).f75039d;
        if (!super.mo73772d_(z) && !z2) {
            return false;
        }
        ((C28454h) this.f75586i).mo72189a(z);
        if (z2) {
            this.f75587j.setRefreshing(false);
            C42961az.m136380a(new C28309ae());
            return true;
        }
        mo73849f();
        if (mo72130d()) {
            if (z) {
                mo73847b("click");
            } else if (!TextUtils.isEmpty(this.f75689r)) {
                mo73847b(this.f75689r);
                if ("press_back".equals(this.f75689r)) {
                    return ((C28454h) this.f75586i).mo72190a(5, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Boolean.valueOf(this.f75691l.mo73758a()));
                }
            }
            return ((C28454h) this.f75586i).mo56976a(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Boolean.valueOf(this.f75691l.mo73758a()));
        }
        return ((C28454h) this.f75586i).mo56976a(Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(3));
    }

    /* renamed from: a */
    private void m94584a(View view, Bundle bundle) {
        this.f75690k.mo67605a(view, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m94584a(view, bundle);
        m94579A();
        mo73849f();
        m94580B();
        mo73840e(false);
        m94581D();
        if (getActivity() instanceof C33054j) {
            ((C33054j) getActivity()).onFeedRecommendFragmentReady();
        }
        m94586z();
        if (this.f75693t == null && C28548b.m93760b()) {
            this.f75693t = C28677a.m94349c().mo73480a((Activity) getActivity(), this.f75583f, (C28648x) this.f75690k);
        }
        C28571f.m93814d(Boolean.valueOf(true));
        C28582p.m93842a();
    }

    /* renamed from: a */
    public final boolean mo72227a(Aweme aweme, int i) {
        return ((C28454h) this.f75586i).mo66570a((Object) aweme, i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((X2CFragmentFeed) C7121a.m22249b(X2CFragmentFeed.class)).getView(getContext(), R.layout.fragment_feed);
    }

    /* renamed from: a */
    private void m94585a(String str, String str2, String str3, Lock lock) {
        ((C28454h) this.f75586i).mo56976a(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), str, str2, str3, lock);
    }
}
