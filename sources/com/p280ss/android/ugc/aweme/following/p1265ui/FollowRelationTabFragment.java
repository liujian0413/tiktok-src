package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.arch.lifecycle.C0053p;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10819b;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11673w;
import com.bytedance.jedi.arch.internal.C11640h;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C25763a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.FollowRelationPagerAdapter;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationState;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationTabViewModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.expriment.RecUserExpansionAB;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment */
public final class FollowRelationTabFragment extends JediBaseFragment implements C0935e, OnClickListener, C25763a {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f78019f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowRelationTabFragment.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};

    /* renamed from: n */
    public static final C29627a f78020n = new C29627a(null);

    /* renamed from: g */
    public boolean f78021g;

    /* renamed from: h */
    public String f78022h;

    /* renamed from: i */
    public User f78023i;

    /* renamed from: j */
    public int f78024j;

    /* renamed from: k */
    public int f78025k;

    /* renamed from: l */
    public int f78026l;

    /* renamed from: m */
    public final List<String> f78027m = new ArrayList();

    /* renamed from: o */
    private FollowRelationPagerAdapter f78028o;

    /* renamed from: p */
    private String f78029p;

    /* renamed from: q */
    private boolean f78030q = true;

    /* renamed from: r */
    private final List<Fragment> f78031r = new ArrayList();

    /* renamed from: s */
    private List<String> f78032s = new ArrayList();

    /* renamed from: t */
    private final C7541d f78033t;

    /* renamed from: u */
    private HashMap f78034u;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$a */
    public static final class C29627a {
        private C29627a() {
        }

        public /* synthetic */ C29627a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$b */
    static final class C29628b implements C10819b {

        /* renamed from: a */
        public static final C29628b f78035a = new C29628b();

        C29628b() {
        }

        /* renamed from: a */
        public final void mo26115a(C10825f fVar) {
            if (fVar != null) {
                fVar.mo26136a((Object) "from_click");
            }
            fVar.mo26137a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$c */
    static final class C29629c extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowRelationTabFragment f78036a;

        C29629c(FollowRelationTabFragment followRelationTabFragment) {
            this.f78036a = followRelationTabFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97217a((C11585f) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97217a(C11585f fVar, int i) {
            View view;
            C7573i.m23587b(fVar, "$receiver");
            if (i > 0 && !this.f78036a.f78021g && C43122ff.m136795z(this.f78036a.f78023i)) {
                this.f78036a.f78024j = i;
                List<String> list = this.f78036a.f78027m;
                StringBuilder sb = new StringBuilder();
                sb.append(C6399b.m19921a().getString(R.string.ag7));
                sb.append(" ");
                sb.append(C30537o.m99738a((long) i));
                list.set(0, sb.toString());
                C10825f b = ((DmtTabLayout) this.f78036a.mo60553a((int) R.id.dfo)).mo26066b(0);
                if (b != null) {
                    view = b.f29292f;
                } else {
                    view = null;
                }
                if (view instanceof TextView) {
                    ((TextView) view).setText((CharSequence) this.f78036a.f78027m.get(0));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$d */
    static final class C29630d extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowRelationTabFragment f78037a;

        C29630d(FollowRelationTabFragment followRelationTabFragment) {
            this.f78037a = followRelationTabFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97218a((C11585f) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97218a(C11585f fVar, int i) {
            C7573i.m23587b(fVar, "$receiver");
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            String str = this.f78037a.f78022h;
            C7573i.m23582a((Object) curUser, "user");
            if (C7573i.m23585a((Object) str, (Object) curUser.getUid())) {
                FollowRelationTabFragment followRelationTabFragment = this.f78037a;
                IAccountUserService a2 = C21115b.m71197a();
                C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                User curUser2 = a2.getCurUser();
                C7573i.m23582a((Object) curUser2, "AccountUserProxyService.get().curUser");
                followRelationTabFragment.f78026l = FollowRelationTabFragment.m97197a(curUser2);
                C6921a.m21552a(4, "FollowRelationTabFragment", C43122ff.m136754B(curUser));
                this.f78037a.mo75639j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$e */
    static final class C29631e<T> implements C0053p<FollowStatus> {

        /* renamed from: a */
        final /* synthetic */ FollowRelationTabFragment f78038a;

        C29631e(FollowRelationTabFragment followRelationTabFragment) {
            this.f78038a = followRelationTabFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(FollowStatus followStatus) {
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            String str = this.f78038a.f78022h;
            C7573i.m23582a((Object) curUser, "user");
            if (C7573i.m23585a((Object) str, (Object) curUser.getUid())) {
                this.f78038a.f78025k = curUser.getFollowingCount();
                C6921a.m21552a(4, "FollowRelationTabFragment", C43122ff.m136754B(curUser));
                this.f78038a.mo75639j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$f */
    static final class C29632f extends Lambda implements C7562b<FollowRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowRelationTabFragment f78039a;

        /* renamed from: b */
        final /* synthetic */ View f78040b;

        C29632f(FollowRelationTabFragment followRelationTabFragment, View view) {
            this.f78039a = followRelationTabFragment;
            this.f78040b = view;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97220a((FollowRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97220a(FollowRelationState followRelationState) {
            C7573i.m23587b(followRelationState, "it");
            if (followRelationState.isSearching()) {
                this.f78039a.mo69896i().mo75796a(false);
            } else if (this.f78039a.getActivity() instanceof FollowRelationTabActivity) {
                FragmentActivity activity = this.f78039a.getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                activity.finish();
            } else {
                this.f78039a.onDestroy();
            }
        }
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f78034u == null) {
            this.f78034u = new HashMap();
        }
        View view = (View) this.f78034u.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f78034u.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo61694a(float f, float f2) {
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f78034u != null) {
            this.f78034u.clear();
        }
    }

    /* renamed from: i */
    public final FollowRelationTabViewModel mo69896i() {
        return (FollowRelationTabViewModel) this.f78033t.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    /* renamed from: r */
    public final boolean mo62081r() {
        return false;
    }

    public final void onResume() {
        super.onResume();
        User user = this.f78023i;
        if (user != null) {
            this.f78025k = user.getFollowingCount();
            this.f78026l = m97197a(user);
        }
        mo75639j();
    }

    public FollowRelationTabFragment() {
        C7584c a = C7575l.m23595a(FollowRelationTabViewModel.class);
        this.f78033t = C7546e.m23569a(new FollowRelationTabFragment$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* renamed from: m */
    private final void m97203m() {
        this.f78031r.clear();
        User user = this.f78023i;
        if (user != null && !this.f78021g && C43122ff.m136795z(user)) {
            m97205o();
        }
        m97206p();
        m97207q();
        if (!this.f78021g && RecUserExpansionAB.INSTANCE.enableRecUserMove()) {
            m97208s();
        }
    }

    /* renamed from: k */
    private final void m97201k() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f78022h = arguments.getString("uid");
            this.f78029p = arguments.getString("follow_relation_type");
        }
        CharSequence charSequence = this.f78022h;
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        this.f78021g = TextUtils.equals(charSequence, a.getCurUserId());
        this.f78023i = C28479b.m93599c();
        User user = this.f78023i;
        if (user != null) {
            this.f78025k = user.getFollowingCount();
            this.f78026l = m97197a(user);
        }
    }

    /* renamed from: n */
    private final void m97204n() {
        mo29062a(mo69896i(), C29715a.f78194a, C11640h.m34110a(), new C29629c(this));
        mo29062a(mo69896i(), C29757b.f78293a, C11673w.m34159a(false), new C29630d(this));
        ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().observe(this, new C29631e(this));
    }

    /* renamed from: o */
    private final void m97205o() {
        Fragment a = getChildFragmentManager().mo2644a(m97198a((int) R.id.edp, this.f78031r.size()));
        if (a == null) {
            a = new ConnectedRelationFragment();
        }
        a.setArguments(getArguments());
        this.f78031r.add(a);
        List<String> list = this.f78027m;
        String string = C6399b.m19921a().getString(R.string.ag7);
        C7573i.m23582a((Object) string, "AppContextManager.getApp….string.connect_relation)");
        list.add(string);
        this.f78032s.add("common_relation");
    }

    /* renamed from: p */
    private final void m97206p() {
        Fragment a = getChildFragmentManager().mo2644a(m97198a((int) R.id.edp, this.f78031r.size()));
        if (a == null) {
            a = new FollowingRelationFragment();
        }
        a.setArguments(getArguments());
        this.f78031r.add(a);
        List<String> list = this.f78027m;
        StringBuilder sb = new StringBuilder();
        sb.append(C6399b.m19921a().getString(R.string.b9_));
        sb.append(" ");
        sb.append(C30537o.m99738a((long) this.f78025k));
        list.add(sb.toString());
        this.f78032s.add("following_relation");
    }

    /* renamed from: q */
    private final void m97207q() {
        Fragment a = getChildFragmentManager().mo2644a(m97198a((int) R.id.edp, this.f78031r.size()));
        if (a == null) {
            a = new FollowerRelationFragment();
        }
        a.setArguments(getArguments());
        this.f78031r.add(a);
        List<String> list = this.f78027m;
        StringBuilder sb = new StringBuilder();
        sb.append(C6399b.m19921a().getString(R.string.b94));
        sb.append(" ");
        sb.append(C30537o.m99738a((long) this.f78026l));
        list.add(sb.toString());
        this.f78032s.add("follower_relation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m97208s() {
        /*
            r3 = this;
            android.support.v4.app.j r0 = r3.getChildFragmentManager()
            java.util.List<android.support.v4.app.Fragment> r1 = r3.f78031r
            int r1 = r1.size()
            r2 = 2131303265(0x7f091b61, float:1.822464E38)
            java.lang.String r1 = m97198a(r2, r1)
            android.support.v4.app.Fragment r0 = r0.mo2644a(r1)
            if (r0 != 0) goto L_0x001e
            com.ss.android.ugc.aweme.profile.ui.RecommendUserFragment r0 = new com.ss.android.ugc.aweme.profile.ui.RecommendUserFragment
            r0.<init>()
            android.support.v4.app.Fragment r0 = (android.support.p022v4.app.Fragment) r0
        L_0x001e:
            android.os.Bundle r1 = r3.getArguments()
            r0.setArguments(r1)
            java.util.List<android.support.v4.app.Fragment> r1 = r3.f78031r
            r1.add(r0)
            java.util.List<java.lang.String> r0 = r3.f78027m
            android.support.v4.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x0041
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0041
            r2 = 2131826124(0x7f1115cc, float:1.9285124E38)
            java.lang.String r1 = r1.getString(r2)
            if (r1 != 0) goto L_0x0043
        L_0x0041:
            java.lang.String r1 = ""
        L_0x0043:
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r3.f78032s
            java.lang.String r1 = "recommend_user"
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.FollowRelationTabFragment.m97208s():void");
    }

    /* renamed from: j */
    public final void mo75639j() {
        View view;
        View view2;
        DmtTabLayout dmtTabLayout = (DmtTabLayout) mo60553a((int) R.id.dfo);
        FollowRelationPagerAdapter followRelationPagerAdapter = this.f78028o;
        if (followRelationPagerAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        Iterator it = followRelationPagerAdapter.f78245b.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((Fragment) it.next()) instanceof FollowingRelationFragment) {
                break;
            } else {
                i2++;
            }
        }
        C10825f b = dmtTabLayout.mo26066b(i2);
        if (b != null) {
            view = b.f29292f;
        } else {
            view = null;
        }
        if (!(view instanceof DmtTextView)) {
            view = null;
        }
        DmtTextView dmtTextView = (DmtTextView) view;
        if (dmtTextView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C6399b.m19921a().getString(R.string.b9_));
            sb.append(" ");
            sb.append(C30537o.m99738a((long) this.f78025k));
            dmtTextView.setText(sb.toString());
        }
        DmtTabLayout dmtTabLayout2 = (DmtTabLayout) mo60553a((int) R.id.dfo);
        FollowRelationPagerAdapter followRelationPagerAdapter2 = this.f78028o;
        if (followRelationPagerAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        Iterator it2 = followRelationPagerAdapter2.f78245b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (((Fragment) it2.next()) instanceof FollowerRelationFragment) {
                break;
            } else {
                i++;
            }
        }
        C10825f b2 = dmtTabLayout2.mo26066b(i);
        if (b2 != null) {
            view2 = b2.f29292f;
        } else {
            view2 = null;
        }
        if (!(view2 instanceof DmtTextView)) {
            view2 = null;
        }
        DmtTextView dmtTextView2 = (DmtTextView) view2;
        if (dmtTextView2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C6399b.m19921a().getString(R.string.b94));
            sb2.append(" ");
            sb2.append(C30537o.m99738a((long) this.f78026l));
            dmtTextView2.setText(sb2.toString());
        }
    }

    /* renamed from: l */
    private final void m97202l() {
        int i;
        boolean z;
        ((ScrollableLayout) mo60553a((int) R.id.czg)).setOnScrollListener(this);
        User user = this.f78023i;
        if (user != null) {
            if (C6399b.m19945u()) {
                if (!TextUtils.isEmpty(user.getRemarkName())) {
                    DmtTextView dmtTextView = (DmtTextView) mo60553a((int) R.id.dkn);
                    C7573i.m23582a((Object) dmtTextView, "title_tv");
                    dmtTextView.setText(user.getRemarkName());
                } else {
                    DmtTextView dmtTextView2 = (DmtTextView) mo60553a((int) R.id.dkn);
                    C7573i.m23582a((Object) dmtTextView2, "title_tv");
                    dmtTextView2.setText(user.getNickname());
                }
            } else if (!TextUtils.isEmpty(C43122ff.m136777h(user))) {
                DmtTextView dmtTextView3 = (DmtTextView) mo60553a((int) R.id.dkn);
                C7573i.m23582a((Object) dmtTextView3, "title_tv");
                dmtTextView3.setText(C43122ff.m136777h(user));
            } else {
                DmtTextView dmtTextView4 = (DmtTextView) mo60553a((int) R.id.dkn);
                C7573i.m23582a((Object) dmtTextView4, "title_tv");
                dmtTextView4.setText(user.getNickname());
            }
        }
        m97203m();
        C0608j childFragmentManager = getChildFragmentManager();
        C7573i.m23582a((Object) childFragmentManager, "childFragmentManager");
        this.f78028o = new FollowRelationPagerAdapter(childFragmentManager, this.f78031r, this.f78027m);
        RtlViewPager rtlViewPager = (RtlViewPager) mo60553a((int) R.id.edp);
        C7573i.m23582a((Object) rtlViewPager, "viewpager");
        FollowRelationPagerAdapter followRelationPagerAdapter = this.f78028o;
        if (followRelationPagerAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        rtlViewPager.setAdapter(followRelationPagerAdapter);
        ((RtlViewPager) mo60553a((int) R.id.edp)).addOnPageChangeListener(this);
        RtlViewPager rtlViewPager2 = (RtlViewPager) mo60553a((int) R.id.edp);
        C7573i.m23582a((Object) rtlViewPager2, "viewpager");
        rtlViewPager2.setOffscreenPageLimit(3);
        if (C7525m.m23496a((Iterable<? extends T>) this.f78032s, this.f78029p)) {
            i = C7525m.m23487a(this.f78032s, this.f78029p);
        } else {
            i = 0;
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f78030q = z;
        RtlViewPager rtlViewPager3 = (RtlViewPager) mo60553a((int) R.id.edp);
        C7573i.m23582a((Object) rtlViewPager3, "viewpager");
        rtlViewPager3.setCurrentItem(i);
        FollowRelationPagerAdapter followRelationPagerAdapter2 = this.f78028o;
        if (followRelationPagerAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        followRelationPagerAdapter2.mo75715c(i);
        m97199b(i);
        mo69896i().mo75798b(TextUtils.equals((CharSequence) this.f78032s.get(i), "following_relation"));
        ((DmtTabLayout) mo60553a((int) R.id.dfo)).setBackgroundColor(getResources().getColor(R.color.a3z));
        if (C6399b.m19945u()) {
            ((DmtTabLayout) mo60553a((int) R.id.dfo)).setCustomTabViewResId(R.layout.a23);
        } else {
            ((DmtTabLayout) mo60553a((int) R.id.dfo)).setCustomTabViewResId(R.layout.w3);
        }
        ((DmtTabLayout) mo60553a((int) R.id.dfo)).setAutoFillWhenScrollable(true);
        ((DmtTabLayout) mo60553a((int) R.id.dfo)).mo26056a(C23486n.m77122a(16.0d), 0, C23486n.m77122a(16.0d), 0);
        ((DmtTabLayout) mo60553a((int) R.id.dfo)).setupWithViewPager((RtlViewPager) mo60553a((int) R.id.edp));
        ((DmtTabLayout) mo60553a((int) R.id.dfo)).setOnTabClickListener(C29628b.f78035a);
        OnClickListener onClickListener = this;
        ((AutoRTLImageView) mo60553a((int) R.id.jo)).setOnClickListener(onClickListener);
        ((DmtTextView) mo60553a((int) R.id.cto)).setOnClickListener(onClickListener);
        ((ImageView) mo60553a((int) R.id.e7)).setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public static int m97197a(User user) {
        if (C36337ai.m117567a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: b */
    private final void m97199b(int i) {
        if (this.f78021g) {
            ImageView imageView = (ImageView) mo60553a((int) R.id.e7);
            C7573i.m23582a((Object) imageView, "add_friends");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = (ImageView) mo60553a((int) R.id.e7);
            C7573i.m23582a((Object) imageView2, "add_friends");
            imageView2.setVisibility(8);
            if (C6399b.m19945u()) {
                if (TextUtils.equals((CharSequence) this.f78032s.get(i), "follower_relation") && C36337ai.m117567a(this.f78023i)) {
                    DmtTextView dmtTextView = (DmtTextView) mo60553a((int) R.id.cto);
                    C7573i.m23582a((Object) dmtTextView, "right_tv");
                    dmtTextView.setVisibility(0);
                    return;
                }
            }
        }
        DmtTextView dmtTextView2 = (DmtTextView) mo60553a((int) R.id.cto);
        C7573i.m23582a((Object) dmtTextView2, "right_tv");
        dmtTextView2.setVisibility(8);
    }

    /* renamed from: c */
    private final String m97200c(int i) {
        String str = (String) this.f78032s.get(i);
        int hashCode = str.hashCode();
        if (hashCode != -1917104899) {
            if (hashCode != -1030444690) {
                if (hashCode != -293406256) {
                    if (hashCode == 2080082922 && str.equals("following_relation")) {
                        return "following";
                    }
                } else if (str.equals("common_relation")) {
                    return "common_relation";
                }
            } else if (str.equals("recommend_user")) {
                return "recommendation";
            }
        } else if (str.equals("follower_relation")) {
            return "fans";
        }
        return "";
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.cto) {
                SharePrefCache inst = SharePrefCache.inst();
                C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                C22903bl syncToTTUrl = inst.getSyncToTTUrl();
                C7573i.m23582a((Object) syncToTTUrl, "SharePrefCache.inst().syncToTTUrl");
                String str2 = (String) syncToTTUrl.mo59877d();
                Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", true);
                intent.putExtra("hide_status_bar", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str2));
                startActivity(intent);
            } else if (id == R.id.jo) {
                mo29066a(mo69896i(), new C29632f(this, view));
            } else if (id == R.id.e7) {
                RtlViewPager rtlViewPager = (RtlViewPager) mo60553a((int) R.id.edp);
                C7573i.m23582a((Object) rtlViewPager, "viewpager");
                if (rtlViewPager.getCurrentItem() == 0) {
                    str = "following";
                } else {
                    str = "fans";
                }
                Intent addFriendsActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), 0, 5, "", str);
                if (addFriendsActivityIntent != null) {
                    startActivity(addFriendsActivityIntent);
                    if (getActivity() instanceof FollowingFollowerActivity) {
                        FollowingFollowerActivity followingFollowerActivity = (FollowingFollowerActivity) getActivity();
                        if (followingFollowerActivity == null) {
                            C7573i.m23580a();
                        }
                        followingFollowerActivity.mo75662a();
                    }
                }
                C6907h.m21524a("click_add_friends", (Map) C22984d.m75611a().mo59973a("enter_from", str).f60753a);
            }
        }
    }

    public final void onPageSelected(int i) {
        boolean z;
        String str;
        String str2;
        C10825f b = ((DmtTabLayout) mo60553a((int) R.id.dfo)).mo26066b(i);
        if (b != null) {
            if (b.f29287a instanceof String) {
                Object obj = b.f29287a;
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                } else if (TextUtils.equals((String) obj, "from_click")) {
                    z = true;
                    b.mo26136a((Object) null);
                }
            }
            z = false;
            b.mo26136a((Object) null);
        } else {
            z = false;
        }
        if (!this.f78030q) {
            String str3 = "change_relation_tab";
            C22984d a = C22984d.m75611a().mo59973a("tab_name", m97200c(i));
            String str4 = "enter_method";
            if (z) {
                str = "click";
            } else {
                str = "slide";
            }
            C22984d a2 = a.mo59973a(str4, str);
            String str5 = "previous_page";
            if (this.f78021g) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            C6907h.m21524a(str3, (Map) a2.mo59973a(str5, str2).f60753a);
        } else {
            this.f78030q = false;
        }
        m97199b(i);
        mo69896i().mo75798b(TextUtils.equals((CharSequence) this.f78032s.get(i), "following_relation"));
        FollowRelationPagerAdapter followRelationPagerAdapter = this.f78028o;
        if (followRelationPagerAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        followRelationPagerAdapter.mo75716d(i);
    }

    /* renamed from: a */
    private static String m97198a(int i, int i2) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.edp);
        sb.append(':');
        sb.append(i2);
        return sb.toString();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m97201k();
        m97202l();
        m97204n();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.o7, viewGroup, false);
    }
}
