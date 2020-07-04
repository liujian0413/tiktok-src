package com.p280ss.android.ugc.aweme.profile;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.benchmark.p062bl.C1983a;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p306k.C23000a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24567h;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25252aw;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25367k;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25384x;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.C25627b.C25628a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25821f;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.p280ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28786aj;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29004c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C33063a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1052b.C23148c;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.p1052b.C23150e;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MyProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1488a.C36327a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1488a.C36328b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.MyProfileV2Fragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.UserProfileV2Fragment;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ProfilePageFragment */
public class ProfilePageFragment extends CommonPageFragment implements C33063a {

    /* renamed from: e */
    static final String f93370e = "ProfilePageFragment";

    /* renamed from: f */
    public CrossPlatformFragment f93371f;

    /* renamed from: g */
    private C36328b f93372g;

    /* renamed from: h */
    private C36327a f93373h;

    /* renamed from: i */
    private String f93374i = "";

    /* renamed from: j */
    private Aweme f93375j;

    /* renamed from: k */
    private Aweme f93376k;

    /* renamed from: l */
    private String f93377l;

    /* renamed from: m */
    private String f93378m = "other_places";

    /* renamed from: n */
    private boolean f93379n = true;

    /* renamed from: o */
    private boolean f93380o = true;

    /* renamed from: p */
    private boolean f93381p = C7188c.m22428a();

    /* renamed from: q */
    private String f93382q = null;

    /* renamed from: r */
    private C0053p<Integer> f93383r;

    /* renamed from: s */
    private List<Pair<Aweme, Integer>> f93384s = new ArrayList(2);

    /* renamed from: t */
    private boolean f93385t = false;

    /* renamed from: d */
    public static Class<? extends CommonPageFragment> m115142d() {
        return ProfilePageFragment.class;
    }

    public void onDestroyView() {
        C42961az.m136383d(this);
        super.onDestroyView();
    }

    /* renamed from: m */
    private void m115154m() {
        if (this.f93371f != null) {
            this.f93371f.f68252e.mo67110n();
        }
    }

    /* renamed from: n */
    private boolean m115157n() {
        if (!this.f93379n || !(getContext() instanceof MainActivity)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private static boolean m115164r() {
        try {
            return C30199h.m98861a().getProfilePageSkipRemove().booleanValue();
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo90470f() {
        this.f93384s = m115135a(this.f93384s, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo90471g() {
        this.f93384s = m115135a(this.f93384s, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo90472i() {
        this.f93384s = m115135a(this.f93384s, 0);
    }

    /* renamed from: q */
    private static Bundle m115162q() {
        Bundle bundle = new Bundle();
        bundle.putString("profile_from", "feed_detail");
        bundle.putString("previous_page", "homepage_hot");
        return bundle;
    }

    /* renamed from: a */
    public final void mo90473j() {
        ScrollSwitchStateManager.m98918a(getActivity()).mo79713a("page_feed", true);
    }

    /* renamed from: k */
    private void m115150k() {
        if (isViewValid()) {
            C1983a.m9029b().mo7629a(2);
            m115139b(true);
            if (this.f93384s.size() > 0) {
                Pair pair = (Pair) this.f93384s.get(this.f93384s.size() - 1);
                this.f93384s.set(this.f93384s.size() - 1, Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 16)));
                if (this.f93381p && (this.f93376k == null || !TextUtils.equals(this.f93376k.getAid(), ((Aweme) pair.first).getAid()))) {
                    this.f93384s = m115135a(this.f93384s, 0);
                    this.f93376k = null;
                }
            }
            this.f93384s = m115135a(this.f93384s, 1);
        }
    }

    /* renamed from: l */
    private void m115152l() {
        if (this.f93371f != null) {
            if (!(this.f93371f.f68252e == null || this.f93375j.getAwemeRawAd() == null)) {
                this.f93371f.f68252e.mo67110n();
            }
            C25252aw.m83005a(null);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ScrollSwitchStateManager a = ScrollSwitchStateManager.m98918a(activity);
                if (!a.mo79722b()) {
                    a.mo79716a(true);
                }
            }
            if (C6399b.m19945u()) {
                int i = 0;
                C24567h hVar = new C24567h(false);
                if (getActivity() != null) {
                    i = getActivity().hashCode();
                }
                hVar.f64808b = i;
                C42961az.m136380a(hVar);
            }
            C25367k.m83410a(getContext());
        }
    }

    /* renamed from: o */
    private C36327a m115158o() {
        C36327a aVar = (C36327a) getChildFragmentManager().mo2644a("tag_fragment_page_my");
        if (C6399b.m19944t()) {
            aVar = (C36327a) ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createMyProfileFragment();
        }
        if (aVar == null) {
            if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
                aVar = new MyProfileV2Fragment();
            } else {
                aVar = new MyProfileFragment();
            }
        }
        aVar.mo92086a((C28786aj) new C28786aj() {
            /* renamed from: a */
            public final void mo74012a() {
                ProfilePageFragment.this.mo90473j();
            }
        });
        return aVar;
    }

    /* renamed from: p */
    private C36328b m115161p() {
        AmeBaseFragment ameBaseFragment;
        AmeBaseFragment ameBaseFragment2 = (AmeBaseFragment) getChildFragmentManager().mo2644a("tag_fragment_page_user");
        if (C6399b.m19944t()) {
            ameBaseFragment2 = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createUserProfileFragment();
            if (ameBaseFragment2 != null) {
                ameBaseFragment2.setArguments(m115162q());
            }
        }
        if (ameBaseFragment == null) {
            if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
                ameBaseFragment = new UserProfileV2Fragment();
            } else {
                ameBaseFragment = new UserProfileFragment();
            }
            ameBaseFragment.setArguments(m115162q());
        }
        C36328b bVar = (C36328b) ameBaseFragment;
        bVar.mo92108a((C28786aj) new C36055r(this));
        bVar.mo92120g(this.f93377l);
        bVar.mo92122h(this.f93377l);
        bVar.mo92124i("other_places");
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo90469b(String str) {
        this.f93377l = str;
    }

    /* renamed from: c */
    private boolean m115141c(String str) {
        return TextUtils.equals(this.f93374i, str);
    }

    /* renamed from: a */
    public final ProfilePageFragment mo90463a(boolean z) {
        if (z) {
            this.f93378m = "main_head";
        }
        return this;
    }

    /* renamed from: a */
    private void m115136a(Fragment fragment) {
        C0633q a = getChildFragmentManager().mo2645a();
        a.mo2587a(fragment);
        a.mo2606d();
    }

    /* renamed from: b */
    private void m115139b(boolean z) {
        if (this.f93372g != null) {
            this.f93372g.mo92121g(z);
        }
    }

    /* renamed from: p */
    private CrossPlatformFragment m115160p(Aweme aweme) {
        CrossPlatformFragment q = m115163q(aweme);
        q.mo67107a((C25821f) new C36056s(this));
        return q;
    }

    /* renamed from: e */
    private void m115144e(Aweme aweme) {
        if (this.f93373h instanceof MyProfileFragment) {
            ((MyProfileFragment) this.f93373h).mo92157a(true);
        }
        if (this.f93373h != null) {
            this.f93373h.mo92085a(this.f93375j);
        }
        C25252aw.m83005a(null);
    }

    /* renamed from: f */
    private static boolean m115145f(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getPreloadWeb() != 7) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m115146g(Aweme aweme) {
        if (this.f93371f != null) {
            C24976t.m82265p(getContext(), aweme);
            MixActivityContainer mixActivityContainer = this.f93371f.f68252e;
            if (mixActivityContainer != null) {
                mixActivityContainer.mo67109m();
            }
        }
    }

    /* renamed from: j */
    private boolean m115149j(Aweme aweme) {
        if (!m115157n()) {
            return false;
        }
        if (C25352e.m83231n(aweme) || C25072c.m82575a(aweme)) {
            return C7213d.m22500a().mo18760aX();
        }
        return false;
    }

    /* renamed from: m */
    private void m115155m(Aweme aweme) {
        if (this.f93373h != null) {
            this.f93373h.mo92085a(this.f93375j);
        }
    }

    /* renamed from: n */
    private String m115156n(Aweme aweme) {
        if (C25384x.m83533b(aweme)) {
            return "page_ad";
        }
        if (m115159o(aweme)) {
            return "page_my";
        }
        return "page_user";
    }

    /* renamed from: o */
    private static boolean m115159o(Aweme aweme) {
        if (aweme == null || !TextUtils.equals(C21115b.m71197a().getCurUserId(), aweme.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m115147h(final Aweme aweme) {
        if (this.f93371f != null) {
            MixActivityContainer mixActivityContainer = this.f93371f.f68252e;
            int i = 0;
            if (mixActivityContainer != null) {
                mo90465a(aweme, mixActivityContainer);
            } else {
                getChildFragmentManager().mo2649a((C0609a) new C0609a() {
                    public final void onFragmentViewCreated(C0608j jVar, Fragment fragment, View view, Bundle bundle) {
                        MixActivityContainer mixActivityContainer = ProfilePageFragment.this.f93371f.f68252e;
                        if (mixActivityContainer != null) {
                            ProfilePageFragment.this.mo90465a(aweme, mixActivityContainer);
                        } else {
                            C6921a.m21555a("MixActivityContainer is null when onFragmentViewCreated is called");
                        }
                        ProfilePageFragment.this.getChildFragmentManager().mo2648a((C0609a) this);
                    }
                }, false);
            }
            C25252aw.m83005a(aweme);
            if (C6399b.m19945u()) {
                C24567h hVar = new C24567h(true);
                if (getActivity() != null) {
                    i = getActivity().hashCode();
                }
                hVar.f64808b = i;
                C42961az.m136380a(hVar);
            }
        }
    }

    /* renamed from: l */
    private void m115153l(Aweme aweme) {
        if (!(aweme == null || aweme.getAuthor() == null || getActivity() == null || getActivity().isFinishing())) {
            this.f93372g.mo92060o();
            this.f93372g.mo92109a(aweme.getAuthorUid(), aweme.getAuthor().getSecUid());
            this.f93372g.mo92107a(aweme);
            this.f93372g.mo92127o(aweme.getAuthor());
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            m115150k();
            if (C6399b.m19944t()) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onFeedStop();
            }
        } else {
            this.f93384s = m115135a(this.f93384s, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m115138b(com.p280ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            r0 = 0
            r4.m115139b(r0)
            java.lang.String r1 = r4.m115156n(r5)
            int r2 = r1.hashCode()
            r3 = -803549229(0xffffffffd01acfd3, float:-1.03892449E10)
            if (r2 == r3) goto L_0x0030
            r3 = -803548836(0xffffffffd01ad15c, float:-1.03896474E10)
            if (r2 == r3) goto L_0x0026
            r3 = 883917691(0x34af837b, float:3.2691955E-7)
            if (r2 == r3) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r2 = "page_user"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003a
            r1 = 2
            goto L_0x003b
        L_0x0026:
            java.lang.String r2 = "page_my"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x0030:
            java.lang.String r2 = "page_ad"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003b
        L_0x003a:
            r1 = -1
        L_0x003b:
            switch(r1) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0049;
                case 2: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0065
        L_0x003f:
            com.ss.android.ugc.aweme.profile.ui.a.b r5 = r4.f93372g
            if (r5 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.profile.ui.a.b r5 = r4.f93372g
            r5.mo92111a(r0)
            goto L_0x0065
        L_0x0049:
            com.ss.android.ugc.aweme.profile.ui.a.a r5 = r4.f93373h
            boolean r5 = r5 instanceof com.p280ss.android.ugc.aweme.profile.p1487ui.MyProfileFragment
            if (r5 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.profile.ui.a.a r5 = r4.f93373h
            com.ss.android.ugc.aweme.profile.ui.MyProfileFragment r5 = (com.p280ss.android.ugc.aweme.profile.p1487ui.MyProfileFragment) r5
            r5.mo92157a(r0)
            return
        L_0x0057:
            boolean r5 = m115145f(r5)
            if (r5 == 0) goto L_0x0061
            r4.m115154m()
            return
        L_0x0061:
            r4.m115152l()
            return
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.ProfilePageFragment.m115138b(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m115140c(com.p280ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.m115156n(r5)
            int r1 = r0.hashCode()
            r2 = -803549229(0xffffffffd01acfd3, float:-1.03892449E10)
            r3 = 1
            if (r1 == r2) goto L_0x002d
            r2 = -803548836(0xffffffffd01ad15c, float:-1.03896474E10)
            if (r1 == r2) goto L_0x0023
            r2 = 883917691(0x34af837b, float:3.2691955E-7)
            if (r1 == r2) goto L_0x0019
            goto L_0x0037
        L_0x0019:
            java.lang.String r1 = "page_user"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 2
            goto L_0x0038
        L_0x0023:
            java.lang.String r1 = "page_my"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x002d:
            java.lang.String r1 = "page_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0038
        L_0x0037:
            r0 = -1
        L_0x0038:
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0049;
                case 2: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x005b
        L_0x003c:
            r4.m115143d(r5)
            com.ss.android.ugc.aweme.profile.ui.a.b r5 = r4.f93372g
            if (r5 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.profile.ui.a.b r5 = r4.f93372g
            r5.mo92111a(r3)
            goto L_0x005b
        L_0x0049:
            r4.m115144e(r5)
            return
        L_0x004d:
            boolean r0 = m115145f(r5)
            if (r0 == 0) goto L_0x0057
            r4.m115146g(r5)
            return
        L_0x0057:
            r4.m115147h(r5)
            return
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.ProfilePageFragment.m115140c(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    public final void mo67730a(Aweme aweme) {
        if (!this.f93379n) {
            C23000a.m75646a(getActivity());
        }
        if (aweme != null && !aweme.isAwemeFromXiGua()) {
            this.f93384s.add(Pair.create(aweme, Integer.valueOf(1)));
            int aY = C7213d.m22500a().mo18761aY();
            int i = C34943c.f91128x;
            if (aY == 1) {
                if ((!this.f93381p && this.f93383r == null) || aweme.isLive()) {
                    C6726a.m20843a(new C35997o(this), C34943c.f91128x);
                }
                m115148i(aweme);
            } else if (m115149j(aweme)) {
                this.f93384s = m115135a(this.f93384s, 0);
            } else {
                if (!this.f93381p || aweme.isLive()) {
                    C35998p pVar = new C35998p(this);
                    if (m115157n()) {
                        i = 3000;
                    }
                    C6726a.m20843a(pVar, i);
                }
                m115148i(aweme);
            }
            this.f93379n = false;
        }
    }

    /* renamed from: d */
    private void m115143d(Aweme aweme) {
        String str;
        if (this.f93372g == null) {
            this.f93372g = m115161p();
            if (aweme != null) {
                this.f93372g.mo92127o(aweme.getAuthor());
            }
        }
        this.f93372g.mo92117f(this.f93382q);
        this.f93372g.mo92107a(aweme);
        this.f93372g.mo92120g(this.f93377l);
        this.f93372g.mo92122h(this.f93377l);
        this.f93372g.mo92124i(this.f93378m);
        String r = C33230ac.m107243r(aweme);
        String s = C33230ac.m107244s(aweme);
        if (!TextUtils.isEmpty(r)) {
            this.f93372g.mo92109a(r, s);
        }
        C36328b bVar = this.f93372g;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = "";
        }
        bVar.mo92126j(str);
        this.f93372g.mo92079K();
        this.f93372g.mo91872a();
        this.f93378m = "other_places";
        if (((AmeBaseFragment) getChildFragmentManager().mo2644a("tag_fragment_page_user")) == null) {
            m115137a((Fragment) (AmeBaseFragment) this.f93372g, "tag_fragment_page_user");
        }
        C25252aw.m83005a(null);
    }

    /* renamed from: i */
    private void m115148i(Aweme aweme) {
        if (!this.f93385t) {
            this.f93385t = true;
            FragmentActivity activity = getActivity();
            if (activity instanceof C23149d) {
                C23148c inflater = ((C23149d) activity).getInflater();
                if (inflater instanceof C23150e) {
                    C23150e eVar = (C23150e) inflater;
                    if (!m115159o(aweme)) {
                        if (!m115141c("page_user") && this.f93372g == null) {
                            if (C6399b.m19946v()) {
                                eVar.mo60292a().mo60294a((int) R.layout.fragment_user_mus).mo60295a(R.layout.fragment_aweme_list_mus, 2).mo60295a(R.layout.a13, 6).mo60296a();
                                return;
                            }
                            eVar.mo60292a().mo60294a((int) R.layout.user_profile_head_view).mo60294a((int) R.layout.fragment_user).mo60295a(R.layout.fragment_aweme_list, 2).mo60295a(R.layout.a13, 6).mo60296a();
                        }
                    } else if (C6399b.m19946v()) {
                        eVar.mo60292a().mo60294a((int) R.layout.pc).mo60295a(R.layout.fragment_aweme_list_mus, 2).mo60295a(R.layout.a13, 6).mo60296a();
                    } else {
                        eVar.mo60292a().mo60294a((int) R.layout.profile_head_view).mo60294a((int) R.layout.pb).mo60295a(R.layout.fragment_aweme_list, 2).mo60295a(R.layout.a13, 6).mo60296a();
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m115151k(Aweme aweme) {
        if (isViewValid()) {
            boolean z = !TextUtils.equals(C33230ac.m107238m(this.f93375j), C33230ac.m107238m(aweme));
            this.f93375j = aweme;
            if (C25384x.m83533b(aweme)) {
                if (this.f93371f == null || z) {
                    if (m115164r()) {
                        this.f93371f = null;
                    } else if (this.f93371f != null) {
                        m115136a((Fragment) this.f93371f);
                        this.f93371f = null;
                    }
                    this.f93371f = m115160p(aweme);
                    m115137a((Fragment) this.f93371f, "tag_fragment_page_ad");
                }
                this.f93374i = "page_ad";
                if (m115145f(this.f93375j)) {
                    m115147h(this.f93375j);
                }
            } else {
                if (m115164r()) {
                    this.f93371f = null;
                } else if (this.f93371f != null && !m115141c("page_ad")) {
                    m115136a((Fragment) this.f93371f);
                    this.f93371f = null;
                }
                if (m115159o(aweme)) {
                    if (!m115141c("page_my")) {
                        if (this.f93373h == null) {
                            this.f93373h = m115158o();
                        }
                        m115137a((Fragment) (AmeBaseFragment) this.f93373h, "tag_fragment_page_my");
                        this.f93374i = "page_my";
                    }
                    if (z) {
                        m115155m(aweme);
                    }
                } else {
                    if (!m115141c("page_user")) {
                        if (this.f93372g == null) {
                            this.f93372g = m115161p();
                        }
                        m115137a((Fragment) (AmeBaseFragment) this.f93372g, "tag_fragment_page_user");
                        this.f93374i = "page_user";
                    }
                    if (z) {
                        m115153l(aweme);
                    }
                }
            }
        }
    }

    @C7709l
    public void onPlayerControllerRenderFirstFrameEvent(C29004c cVar) {
        Aweme aweme;
        int i;
        if (this.f93381p) {
            if (cVar.f76397a == null) {
                aweme = this.f93375j;
            } else {
                aweme = cVar.f76397a;
            }
            m115148i(aweme);
            if (cVar.f76397a != null) {
                Pair pair = null;
                Iterator it = this.f93384s.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair2 = (Pair) it.next();
                    if (TextUtils.equals(((Aweme) pair2.first).getAid(), cVar.f76397a.getAid())) {
                        pair = pair2;
                        break;
                    }
                }
                if (pair == null) {
                    C6921a.m21555a("onPlayerControllerRenderFirstFrameEvent, targetPair is null");
                } else {
                    boolean z = false;
                    if ((((Integer) pair.second).intValue() & 4096) != 4096) {
                        this.f93376k = (Aweme) pair.first;
                        C36054q qVar = new C36054q(this);
                        if (this.f93380o) {
                            i = 0;
                        } else {
                            i = C34943c.f91128x;
                        }
                        C6726a.m20843a(qVar, i);
                        this.f93380o = false;
                    } else {
                        StringBuilder sb = new StringBuilder("onPlayerControllerRenderFirstFrameEvent, S_CHANGE_DONE:");
                        if ((((Integer) pair.second).intValue() & 4096) == 4096) {
                            z = true;
                        }
                        sb.append(z);
                        C6921a.m21555a(sb.toString());
                    }
                }
            } else {
                C6921a.m21555a("PlayerControllerRenderFirstFrameEvent.getAweme() is null");
            }
        }
    }

    /* renamed from: q */
    private CrossPlatformFragment m115163q(Aweme aweme) {
        String str;
        String str2;
        CrossPlatformFragment crossPlatformFragment = new CrossPlatformFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
        boolean z = true;
        bundle.putBoolean("control_request_url", true);
        String str3 = "bundle_download_app_name";
        if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
            str = aweme.getAwemeRawAd().getSource();
        } else {
            str = aweme.getAwemeRawAd().getWebTitle();
        }
        bundle.putString(str3, str);
        bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
        if (C25352e.m83217a(this.f93377l)) {
            bundle.putInt("bundle_app_ad_from", 5);
        } else {
            bundle.putInt("bundle_app_ad_from", 1);
        }
        bundle.putString("ad_js_url", (String) SharePrefCache.inst().getJsActlogUrl().mo59877d());
        bundle.putBoolean("use_ordinary_web", aweme.getAwemeRawAd().isUseOrdinaryWeb());
        bundle.putBoolean("bundle_is_ad_fake", true);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
        bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
        bundle.putString("aweme_id", aweme.getAid());
        Long creativeId = aweme.getAwemeRawAd().getCreativeId();
        bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        if (!TextUtils.isEmpty(downloadUrl)) {
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("bundle_download_url", downloadUrl);
            bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
            bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
            }
            bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
            bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
            bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
            bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
            bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
        }
        String webTitle = aweme.getAwemeRawAd().getWebTitle();
        if (C6399b.m19944t() && TextUtils.isEmpty(webTitle)) {
            webTitle = " ";
        }
        bundle.putString("bundle_web_title", webTitle);
        String packageName = aweme.getAwemeRawAd().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            bundle.putString("aweme_package_name", packageName);
        }
        JSONObject s = C24976t.m82274s(getContext(), aweme, "");
        String str4 = "aweme_json_extra";
        if (s == null) {
            str2 = "";
        } else {
            str2 = s.toString();
        }
        bundle.putString(str4, str2);
        Long groupId = aweme.getAwemeRawAd().getGroupId();
        if (!(groupId == null || groupId.longValue() == 0)) {
            bundle.putString("aweme_group_id", String.valueOf(groupId));
        }
        if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
            bundle.putString("aweme_creative_id", String.valueOf(creativeId));
        }
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        PreloadData preloadData = aweme.getAwemeRawAd().getPreloadData();
        if (preloadData != null) {
            bundle.putString("preload_site_id", preloadData.getSiteId());
        }
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_is_web_url", 1);
        bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
        bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
        Context context = getContext();
        if (context == null || !aweme.getAwemeRawAd().isUseDefaultColor()) {
            bundle.putInt("bundle_webview_background", -1);
        } else {
            bundle.putInt("bundle_webview_background", context.getResources().getColor(R.color.a6c));
        }
        if (aweme.getAwemeRawAd().getWebviewProgressBar() != 1) {
            z = false;
        }
        bundle.putBoolean("webview_progress_bar", z);
        crossPlatformFragment.setArguments(bundle);
        return crossPlatformFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90467a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f93374i
            int r1 = r0.hashCode()
            r2 = -803549229(0xffffffffd01acfd3, float:-1.03892449E10)
            if (r1 == r2) goto L_0x002a
            r2 = -803548836(0xffffffffd01ad15c, float:-1.03896474E10)
            if (r1 == r2) goto L_0x0020
            r2 = 883917691(0x34af837b, float:3.2691955E-7)
            if (r1 == r2) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r1 = "page_user"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r1 = "page_my"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r1 = "page_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0043;
                case 2: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0045
        L_0x0039:
            com.ss.android.ugc.aweme.profile.ui.a.b r0 = r3.f93372g
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.profile.ui.a.b r0 = r3.f93372g
            r0.mo61681a(r4)
            goto L_0x0045
        L_0x0043:
            return
        L_0x0044:
            return
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.ProfilePageFragment.mo90467a(java.lang.String):void");
    }

    /* renamed from: a */
    private void m115137a(Fragment fragment, String str) {
        C0633q a = getChildFragmentManager().mo2645a();
        a.mo2600b(R.id.a19, fragment, str);
        a.mo2606d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo90468b(ScrollSwitchStateManager scrollSwitchStateManager, Integer num) {
        if (!(getActivity() == null || num == null || num.intValue() == 0)) {
            this.f93384s = m115135a(this.f93384s, 0);
        }
        scrollSwitchStateManager.mo79705a(this.f93383r);
        this.f93383r = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AwemeChangeCallBack.m106764a(getActivity(), this, this);
        HomePageDataViewModel.m98904a(getActivity()).mo79693a(this, new C35993l(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f93382q = arguments.getString("related_gid", "");
        }
        ScrollSwitchStateManager a = ScrollSwitchStateManager.m98918a(getActivity());
        if (getActivity() != null && C7213d.m22500a().mo18761aY() == 1) {
            this.f93383r = new C35994m(this, a);
            a.mo79733e(this, this.f93383r);
        }
        a.mo79733e(this, new C35996n(this, a));
    }

    /* renamed from: a */
    public final void mo90465a(Aweme aweme, MixActivityContainer mixActivityContainer) {
        if (aweme.getAwemeRawAd() != null) {
            this.f93371f.f68252e.mo65873b(aweme.getAwemeRawAd().getWebUrl());
            if (!m115145f(aweme)) {
                m115146g(aweme);
            }
            if (mixActivityContainer.getCrossPlatformParams().f68476d.f68527v) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    C30246a.m98970a(activity).mo79716a(false);
                }
            }
        }
    }

    /* renamed from: a */
    private List<Pair<Aweme, Integer>> m115135a(List<Pair<Aweme, Integer>> list, int i) {
        if (list.isEmpty()) {
            return list;
        }
        ListIterator listIterator = list.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            Pair pair = (Pair) listIterator.next();
            if (i == 0) {
                if (((Integer) pair.second).intValue() == 1) {
                    if (!listIterator.hasNext()) {
                        m115151k((Aweme) pair.first);
                        listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 4096)));
                        break;
                    }
                    listIterator.remove();
                } else if (((Integer) pair.second).intValue() == 4097) {
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                } else if (((Integer) pair.second).intValue() == 17) {
                    m115151k((Aweme) pair.first);
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 4096)));
                    break;
                } else if (((Integer) pair.second).intValue() == 273) {
                    if (getHost() == null) {
                        StringBuilder sb = new StringBuilder("getHost() is null, isAdded:");
                        sb.append(isAdded());
                        sb.append(" isRemoving:");
                        sb.append(this.mRemoving);
                        sb.append(" isResumed:");
                        sb.append(isResumed());
                        sb.append(" isDetached:");
                        sb.append(this.mDetached);
                        sb.append(" isVisible:");
                        sb.append(isVisible());
                        C6921a.m21555a(sb.toString());
                    } else {
                        m115151k((Aweme) pair.first);
                        m115140c((Aweme) pair.first);
                    }
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(69649)));
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                }
            } else if (i == 1) {
                if (((Integer) pair.second).intValue() == 4113) {
                    m115140c((Aweme) pair.first);
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 65536)));
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                } else if (((Integer) pair.second).intValue() == 17) {
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 256)));
                    break;
                }
            } else if (i != 2) {
                continue;
            } else if ((((Integer) pair.second).intValue() & 65536) == 65536) {
                m115138b((Aweme) pair.first);
                listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & -17 & -65537)));
                break;
            } else if ((((Integer) pair.second).intValue() & 256) == 256) {
                listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & -17 & -257)));
                break;
            } else if ((((Integer) pair.second).intValue() & 16) == 16) {
                listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & -17)));
                break;
            }
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90466a(ScrollSwitchStateManager scrollSwitchStateManager, Integer num) {
        Context context = getContext();
        if (num.intValue() == 0 && scrollSwitchStateManager.mo79723b("page_profile") && context != null && this.f93375j != null) {
            C25371n.m83472b(new C25628a().mo66449a(context).mo66450a(this.f93375j.getAwemeRawAd()).mo66448a(3).mo66452a());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C42961az.m136382c(this);
        return layoutInflater.inflate(R.layout.ps, viewGroup, false);
    }
}
