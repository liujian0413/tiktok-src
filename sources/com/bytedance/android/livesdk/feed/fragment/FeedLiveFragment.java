package com.bytedance.android.livesdk.feed.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.live.base.model.feed.C2346b;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.network.NetworkStat.Status;
import com.bytedance.android.live.core.p145a.C3145b;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.core.utils.p158a.C3352h;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent.C5918a;
import com.bytedance.android.livesdk.feed.C5924a;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6019g;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.LiveFeedRoomPlayComponent;
import com.bytedance.android.livesdk.feed.adapter.BaseFeedAdapter;
import com.bytedance.android.livesdk.feed.adapter.FeedLiveAdapter;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.live.BaseLiveViewHolder;
import com.bytedance.android.livesdk.feed.live.LargeLiveViewHolder;
import com.bytedance.android.livesdk.feed.live.SmallLiveViewHolder;
import com.bytedance.android.livesdk.feed.p226a.C5925a;
import com.bytedance.android.livesdk.feed.p231f.C5981a;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdk.feed.p233h.C6024a;
import com.bytedance.android.livesdk.feed.services.C6121d;
import com.bytedance.android.livesdk.feed.tab.p364b.C7771n;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.LiveFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.widget.LiveFeedFloatTabView;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController;
import com.bytedance.android.livesdkapi.p452h.C9413b;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;

public class FeedLiveFragment extends BaseTabFeedFragment implements C5925a {

    /* renamed from: A */
    public static C5989f f17788A = null;

    /* renamed from: B */
    private static final String f17789B = FeedLiveFragment.class.getCanonicalName();

    /* renamed from: C */
    private String f17790C = "live_merge";

    /* renamed from: D */
    private final C1281m f17791D = new C1281m() {

        /* renamed from: b */
        private boolean f17813b;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (FeedLiveFragment.this.f17810y != null && i == 0) {
                if (FeedLiveFragment.this.f17809x.mo5445j() > FeedLiveFragment.this.f17810y.intValue() || !FeedLiveFragment.this.f17804s.f21124a) {
                    this.f17813b = true;
                } else {
                    FeedLiveFragment.this.f17804s.mo20512c();
                    this.f17813b = false;
                }
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (this.f17813b && FeedLiveFragment.this.f17810y != null) {
                if (i2 < 0 && FeedLiveFragment.this.f17810y.intValue() >= 0) {
                    int j = FeedLiveFragment.this.f17809x.mo5445j();
                    if (j > FeedLiveFragment.this.f17810y.intValue()) {
                        if (i2 < -5) {
                            FeedLiveFragment.this.f17804s.mo20510a();
                        }
                    } else if (j < FeedLiveFragment.this.f17810y.intValue()) {
                        FeedLiveFragment.this.f17804s.mo20512c();
                    }
                } else if (i2 > 5 && FeedLiveFragment.this.f17810y.intValue() >= 0) {
                    FeedLiveFragment.this.f17804s.mo20511b();
                }
            }
        }
    };

    /* renamed from: E */
    private final Map<Long, FeedDataKey> f17792E = new HashMap();

    /* renamed from: F */
    private LiveFeedViewModel f17793F;

    /* renamed from: G */
    private String f17794G = "";

    /* renamed from: H */
    private String f17795H = "";

    /* renamed from: I */
    private boolean f17796I;

    /* renamed from: J */
    private LiveFeedRoomPlayComponent f17797J;

    /* renamed from: K */
    private boolean f17798K = true;

    /* renamed from: L */
    private long f17799L;

    /* renamed from: M */
    private boolean f17800M;

    /* renamed from: N */
    private C1281m f17801N;

    /* renamed from: q */
    protected View f17802q;

    /* renamed from: r */
    protected TextureView f17803r;

    /* renamed from: s */
    LiveFeedFloatTabView f17804s;

    /* renamed from: t */
    FeedLiveAdapter f17805t;

    /* renamed from: u */
    C5980f f17806u = C6121d.m19067a();

    /* renamed from: v */
    C3145b<FeedDataKey, FeedItem> f17807v;

    /* renamed from: w */
    public C6037j f17808w = C7771n.m23888d();

    /* renamed from: x */
    public GridLayoutManager f17809x;

    /* renamed from: y */
    public Integer f17810y = null;

    /* renamed from: z */
    public boolean f17811z = true;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final BaseFeedAdapter mo14658f() {
        return this.f17805t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo14668j() {
        super.mo14668j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo14669k() {
        super.mo14669k();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: q */
    private void m18772q() {
        this.f17799L = System.currentTimeMillis();
    }

    /* renamed from: r */
    private long m18773r() {
        return System.currentTimeMillis() - this.f17799L;
    }

    /* renamed from: a */
    public final String mo14650a() {
        if (!C6319n.m19593a(this.f17794G)) {
            return this.f17794G;
        }
        return super.mo14650a();
    }

    /* renamed from: b */
    public final String mo14653b() {
        if (!C6319n.m19593a(this.f17795H)) {
            return this.f17795H;
        }
        return super.mo14653b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo14660h() {
        if (m18771o()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: m */
    public final long mo14670m() {
        if (f17788A != null) {
            return f17788A.f17751a;
        }
        return 1;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f17768c.mo5545b(this.f17791D);
    }

    /* renamed from: o */
    public static boolean m18771o() {
        if (f17788A == null || f17788A.mo14645a() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private void m18775t() {
        if (!this.f17796I) {
            this.f17796I = true;
            if (C9469i.m27992d() != null) {
                C9469i.m27989b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C1273i mo14659g() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.f4721g = new C1241a() {
            /* renamed from: a */
            public final int mo5386a(int i) {
                if (FeedLiveFragment.this.f17805t.getItemViewType(i) == R.layout.arv) {
                    return 1;
                }
                return 2;
            }
        };
        return gridLayoutManager;
    }

    /* renamed from: s */
    private void m18774s() {
        if (!this.f17800M) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("enter_from_merge", "live_live");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("duration", String.valueOf(m18773r()));
            C5982b.m18722a("livesdk_live_feed_first_refresh_duration", (Map<String, String>) hashMap);
            this.f17800M = true;
        }
    }

    /* renamed from: d */
    public final int mo14656d() {
        int i;
        C2346b bVar = (C2346b) CoreSettingKeys.LIVE_FEED_PRELOAD.mo10240a();
        if (bVar == null) {
            i = 0;
        } else if (m18771o()) {
            i = bVar.mo8250a();
        } else {
            i = bVar.f7706a;
        }
        if (i <= 1) {
            return super.mo14656d();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final FragmentFeedViewModel mo14657e() {
        this.f17772f = (TabFeedViewModel) C0069x.m158a((Fragment) this, (C0067b) this.f17767b.mo14622a(mo14670m()).mo14623a((C6019g) this)).mo147a(TabFeedViewModel.class);
        m18772q();
        this.f17772f.f9871c.observe(this, new C6013l(this));
        this.f17771e.setOnRefreshListener(new C6014m(this));
        return this.f17772f;
    }

    public void onDestroy() {
        super.onDestroy();
        for (FeedDataKey feedDataKey : this.f17792E.values()) {
            IFeedRepository iFeedRepository = (IFeedRepository) this.f17806u.mo14609a(feedDataKey);
            if (iFeedRepository != null) {
                this.f17806u.mo14617b(feedDataKey, iFeedRepository);
            }
            if (this.f17807v != null) {
                this.f17807v.mo9990b(feedDataKey);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo14681p() {
        this.f17772f.mo20484a("feed_refresh");
        if (!C6018q.m18809a(getContext())) {
            C3517a.m12960a(getContext(), (int) R.string.ekm);
        }
        if (C5924a.f17548a) {
            C3352h.m12498a().mo10279b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14678b(Integer num) {
        this.f17810y = num;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        SmallLiveViewHolder.f17933w = -1;
        LargeLiveViewHolder.f17928w = -1;
        this.f17805t.notifyDataSetChanged();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f17797J != null) {
            this.f17797J.mo14452a(z);
        }
    }

    /* renamed from: a */
    private void m18770a(String str) {
        if (this.mUserVisibleHint) {
            HashMap hashMap = new HashMap();
            hashMap.put("page_name", FeedLiveFragment.class.getName());
            C5981a.m18718b().mo10001b("ttlive_page", (Map<String, ?>) hashMap);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14677b(C5989f fVar) {
        if (this.f17810y != null) {
            this.f17772f.f9876h.mo10030a(this.f17810y.intValue());
            mo14675a(fVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo14680c(Integer num) {
        if (num != null) {
            C1293v f = this.f17768c.mo5575f(num.intValue());
            if (f instanceof BaseLiveViewHolder) {
                this.f17768c.postDelayed(new C6017p(this, f), 500);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14674a(C1293v vVar) {
        if (this.mUserVisibleHint && isResumed()) {
            ((BaseLiveViewHolder) vVar).mo14702e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14679b(Object obj) throws Exception {
        this.f17811z = true;
        this.f17804s.mo20512c();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C9469i.m27992d() != null) {
            this.f17797J = new LiveFeedRoomPlayComponent(new C5918a() {
                /* renamed from: a */
                public final RecyclerView mo14472a() {
                    return FeedLiveFragment.this.f17768c;
                }

                /* renamed from: b */
                public final BaseFeedAdapter mo14473b() {
                    return FeedLiveFragment.this.mo14658f();
                }

                /* renamed from: c */
                public final BannerSwipeRefreshLayout mo14474c() {
                    return FeedLiveFragment.this.f17771e;
                }

                /* renamed from: d */
                public final View mo14475d() {
                    return FeedLiveFragment.this.f17802q;
                }

                /* renamed from: e */
                public final TextureView mo14476e() {
                    return FeedLiveFragment.this.f17803r;
                }

                /* renamed from: g */
                public final Lifecycle mo14478g() {
                    return FeedLiveFragment.this.getLifecycle();
                }

                /* renamed from: h */
                public final Activity mo14479h() {
                    return FeedLiveFragment.this.getActivity();
                }

                /* renamed from: f */
                public final ILivePlayController mo14477f() {
                    return C9469i.m27992d().mo22019e();
                }

                /* renamed from: i */
                public final String mo14480i() {
                    if (FeedLiveFragment.f17788A != null) {
                        return FeedLiveFragment.f17788A.f17758h;
                    }
                    return "";
                }
            });
            this.f17797J.mo14510d(m18771o());
            this.f17797J.mo14452a(this.mUserVisibleHint);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14663a(View view) {
        super.mo14663a(view);
        this.f17802q = view.findViewById(R.id.ddq);
        if (VERSION.SDK_INT >= 21) {
            this.f17802q.setBackgroundResource(R.drawable.c1d);
        }
        this.f17803r = (TextureView) view.findViewById(R.id.ddo);
        this.f17804s = (LiveFeedFloatTabView) view.findViewById(R.id.and);
        if (this.f17768c != null && this.f17801N != null) {
            this.f17768c.mo5528a(this.f17801N);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14676b(NetworkStat networkStat) {
        boolean z;
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = this.f17771e;
        if (networkStat == null || !this.f17811z || !networkStat.mo10025a() || !this.f17798K) {
            z = false;
        } else {
            z = true;
        }
        bannerSwipeRefreshLayout.setRefreshing(z);
        this.f17798K = true;
        if (networkStat.f9754a.equals(Status.SUCCESS) && this.f17797J != null) {
            this.f17797J.mo14512g();
        }
        if (this.f17804s != null && this.f17804s.f21124a) {
            this.f17804s.mo20511b();
        }
        if (networkStat.f9754a != Status.RUNNING) {
            m18774s();
            if (((Boolean) LiveSettingKeys.LIVE_IS_LOAD_GIFT_AFTER_FEED_END.mo10240a()).booleanValue()) {
                m18775t();
            }
            if (getActivity() != null && (getActivity() instanceof C9413b)) {
                ((C9413b) getActivity()).mo23113c();
            }
        }
    }

    /* renamed from: a */
    public final void mo14675a(C5989f fVar) {
        f17788A = fVar;
        this.f17794G = fVar.f17754d;
        if (TextUtils.isEmpty(fVar.f17758h)) {
            fVar.f17758h = "live_merge_null";
        }
        this.f17795H = fVar.f17758h;
        TabFeedViewModel tabFeedViewModel = (TabFeedViewModel) this.f17769d.f17590b;
        if (!this.f17792E.containsKey(Long.valueOf(fVar.f17751a))) {
            if (this.f17792E.isEmpty()) {
                this.f17792E.put(Long.valueOf(mo14670m()), tabFeedViewModel.mo20493g());
            }
            this.f17792E.put(Long.valueOf(fVar.f17751a), FeedDataKey.m18724a(fVar.f17758h, fVar.f17754d, mo14670m()));
        }
        IFeedRepository iFeedRepository = (IFeedRepository) this.f17806u.mo14609a(tabFeedViewModel.mo20493g());
        tabFeedViewModel.f21087x = false;
        tabFeedViewModel.f21073v = (FeedDataKey) this.f17792E.get(Long.valueOf(fVar.f17751a));
        this.f17806u.mo14611a((FeedDataKey) this.f17792E.get(Long.valueOf(fVar.f17751a)), (ItemRepository) iFeedRepository);
        tabFeedViewModel.mo20482a(fVar.f17754d, fVar.f17758h);
        tabFeedViewModel.mo20506c(this.f17794G);
        tabFeedViewModel.mo20490d();
        tabFeedViewModel.mo10106a();
        ((C3245ad) ((IFeedRepository) this.f17806u.mo14609a(tabFeedViewModel.mo20493g())).mo14495a().mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10183a(new C6015n(this), C6016o.f17830a);
        if (this.f17797J != null) {
            this.f17797J.mo14510d(m18771o());
        }
        this.f17804s.mo20519a(fVar);
    }

    public void onCreate(Bundle bundle) {
        TimeCostUtil.m12208b(Tag.LiveFeedInit);
        C3222b.m12218a().mo10146b(Tag.LiveFeedInit.name(), (C0043i) this, getContext());
        C3222b.m12218a().mo10137a(Tag.LiveFeedInit.name(), (C0043i) this, getContext());
        super.onCreate(bundle);
        if (this.f17808w != null) {
            List c = this.f17808w.mo14693c();
            if (c != null && c.size() > 0) {
                f17788A = (C5989f) c.get(0);
                this.f17794G = f17788A.f17754d;
            }
            this.f17793F = (LiveFeedViewModel) C0069x.m158a((Fragment) this, (C0067b) this.f17767b.mo14622a(mo14670m())).mo147a(LiveFeedViewModel.class);
            this.f17793F.mo20504a();
            this.f17805t = new C6024a(this).mo14688a();
            HashMap hashMap = new HashMap();
            hashMap.put("event_type", "click");
            hashMap.put("event_belong", "tab_click");
            hashMap.put("enter_from_merge", this.f17790C);
            C5982b.m18722a("live_enter", (Map<String, String>) hashMap);
            m18770a("onCreate()");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17769d.f17590b.f21061j.observe(this, new C6010i(this));
        this.f17809x = (GridLayoutManager) this.f17768c.getLayoutManager();
        if (this.f17776j.mo20499a() != null && !C6311g.m19573a(this.f17776j.mo20499a())) {
            this.f17768c.mo5528a(this.f17791D);
            this.f17804s.setTabList(this.f17776j.mo20499a());
            this.f17804s.setOnTabClickListener(new C6011j(this));
        }
        if (this.f17793F != null) {
            this.f17793F.f21089a.observe(this, new C6012k(this));
        }
        String string = getString(R.string.ekf);
        if (getActivity() != null && (getActivity() instanceof C9413b)) {
            ((C9413b) getActivity()).mo23112a(string);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "tab_click");
        C5982b.m18722a("live_enter", (Map<String, String>) hashMap);
    }
}
