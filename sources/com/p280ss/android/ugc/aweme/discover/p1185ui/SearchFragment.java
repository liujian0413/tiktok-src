package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.design.widget.AppBarLayout;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.commercialize.EasterEggPageParams;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdInfo;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.base.C26604h;
import com.p280ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.p280ss.android.ugc.aweme.discover.filter.SearchFilterViewHolder;
import com.p280ss.android.ugc.aweme.discover.filter.SearchFilterViewHolder.C26637a;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext.CurrentItemMethod;
import com.p280ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p280ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p280ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26578e;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchBaseFragment.C26932a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.status.C27090a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.status.C27090a.C27091a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.status.C27092b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.status.C27092b.C27093a;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C27244a;
import com.p280ss.android.ugc.aweme.discover.widget.C27276d;
import com.p280ss.android.ugc.aweme.discover.widget.C27277e;
import com.p280ss.android.ugc.aweme.discover.widget.FeedbackGuideView;
import com.p280ss.android.ugc.aweme.discover.widget.FeedbackGuideView.C27257a;
import com.p280ss.android.ugc.aweme.discover.widget.GuideSearchHeadView;
import com.p280ss.android.ugc.aweme.discover.widget.SearchCorrectHeadView;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParamProvider.C37387a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42979bl;
import com.p280ss.android.ugc.aweme.utils.C42980bm.C42981a;
import com.p280ss.android.ugc.aweme.utils.C43064dn;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment */
public abstract class SearchFragment<D> extends SearchBaseFragment implements C6905a, C25675c<D>, C27005aj, C27276d {

    /* renamed from: v */
    static final /* synthetic */ C7595j[] f71111v = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchFragment.class), "mDoubleBallLoadingView", "getMDoubleBallLoadingView()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchFragment.class), "mAppBarLayout", "getMAppBarLayout()Landroid/support/design/widget/AppBarLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchFragment.class), "mGuideSearchBarView", "getMGuideSearchBarView()Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchFragment.class), "mSearchFilterView", "getMSearchFilterView()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchFragment.class), "searchFilterViewHolder", "getSearchFilterViewHolder()Lcom/ss/android/ugc/aweme/discover/filter/SearchFilterViewHolder;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchFragment.class), "mCorrectContainer", "getMCorrectContainer()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchFragment.class), "statusViewFactory", "getStatusViewFactory()Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory;"))};

    /* renamed from: A */
    public GuideSearchBar f71112A;

    /* renamed from: B */
    public FeedbackGuideView f71113B;

    /* renamed from: C */
    public BaseAdapter<D> f71114C;

    /* renamed from: D */
    public HeaderAndFooterWrapper f71115D;

    /* renamed from: E */
    public boolean f71116E = true;

    /* renamed from: F */
    public boolean f71117F = true;

    /* renamed from: G */
    public boolean f71118G;

    /* renamed from: H */
    private final C7541d f71119H = C27020au.m88776a(new C26940g(this));

    /* renamed from: J */
    private final C7541d f71120J = C27020au.m88776a(new C26941h(this));

    /* renamed from: K */
    private final C7541d f71121K = C7546e.m23569a(new C26947n(this));

    /* renamed from: L */
    private final C7541d f71122L = C27020au.m88776a(new C26938e(this));

    /* renamed from: M */
    private SearchCorrectHeadView f71123M;

    /* renamed from: N */
    private SearchStateViewModel f71124N;

    /* renamed from: O */
    private QueryCorrectInfo f71125O;

    /* renamed from: P */
    private long f71126P;

    /* renamed from: Q */
    private long f71127Q;

    /* renamed from: R */
    private final C7541d f71128R = C27020au.m88776a(new C26949o(this));

    /* renamed from: S */
    private HashMap f71129S;

    /* renamed from: e */
    private final C7541d f71130e = C27020au.m88776a(new C26939f(this));

    /* renamed from: f */
    private final C7541d f71131f = C27020au.m88776a(new C26937d(this));

    /* renamed from: w */
    protected RecyclerView f71132w;

    /* renamed from: x */
    protected DmtStatusView f71133x;

    /* renamed from: y */
    protected SwipeRefreshLayout f71134y;

    /* renamed from: z */
    protected FrameLayout f71135z;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$a */
    static final class C26934a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71136a;

        C26934a(SearchFragment searchFragment) {
            this.f71136a = searchFragment;
        }

        public final void run() {
            if (this.f71136a.isViewValid()) {
                if (C6399b.m19945u()) {
                    this.f71136a.mo69694c(false);
                    return;
                }
                this.f71136a.mo69699t().setRefreshing(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$b */
    static final class C26935b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71137a;

        C26935b(SearchFragment searchFragment) {
            this.f71137a = searchFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71137a.mo68431a(0, (FilterOption) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$c */
    static final class C26936c implements C23386b {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71138a;

        C26936c(SearchFragment searchFragment) {
            this.f71138a = searchFragment;
        }

        /* renamed from: a */
        public final void mo60744a() {
            this.f71138a.mo69672A();
            this.f71138a.f71097p = 1;
            this.f71138a.mo68431a(1, (FilterOption) null);
            this.f71138a.mo69678I();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$d */
    static final class C26937d extends Lambda implements C7561a<AppBarLayout> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71139a;

        C26937d(SearchFragment searchFragment) {
            this.f71139a = searchFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AppBarLayout invoke() {
            return (AppBarLayout) this.f71139a.mo68429a((int) R.id.d0_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$e */
    static final class C26938e extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71140a;

        C26938e(SearchFragment searchFragment) {
            this.f71140a = searchFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f71140a.mo68429a((int) R.id.a3c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$f */
    static final class C26939f extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71141a;

        C26939f(SearchFragment searchFragment) {
            this.f71141a = searchFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return ((ViewStub) this.f71141a.getView().findViewById(R.id.aa1)).inflate();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$g */
    static final class C26940g extends Lambda implements C7561a<GuideSearchHeadView> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71142a;

        C26940g(SearchFragment searchFragment) {
            this.f71142a = searchFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GuideSearchHeadView invoke() {
            GuideSearchHeadView guideSearchHeadView = (GuideSearchHeadView) this.f71142a.mo68429a((int) R.id.atn);
            guideSearchHeadView.setItemClickListener(this.f71142a);
            return guideSearchHeadView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$h */
    static final class C26941h extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71143a;

        C26941h(SearchFragment searchFragment) {
            this.f71143a = searchFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f71143a.mo68429a((int) R.id.akq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$i */
    public static final class C26942i implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71144a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f71145b;

        public final void onGlobalLayout() {
            if (this.f71144a.mo15376T_() && this.f71144a.mo69693a(this.f71145b)) {
                this.f71145b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        C26942i(SearchFragment searchFragment, RecyclerView recyclerView) {
            this.f71144a = searchFragment;
            this.f71145b = recyclerView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$j */
    static final class C26943j<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71146a;

        C26943j(SearchFragment searchFragment) {
            this.f71146a = searchFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                if (!this.f71146a.f71117F && num.intValue() == 2) {
                    this.f71146a.f71117F = true;
                    if (this.f71146a.f71116E) {
                        this.f71146a.m88523a(false, false);
                    }
                } else if (num.intValue() != 2) {
                    this.f71146a.f71117F = false;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$k */
    static final class C26944k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71147a;

        C26944k(SearchFragment searchFragment) {
            this.f71147a = searchFragment;
        }

        public final void run() {
            if (this.f71147a.f71118G) {
                this.f71147a.mo69675E();
            }
            FeedbackGuideView feedbackGuideView = this.f71147a.f71113B;
            if (feedbackGuideView != null && feedbackGuideView.mo70016d()) {
                this.f71147a.mo69682M();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$l */
    static final class C26945l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71148a;

        C26945l(SearchFragment searchFragment) {
            this.f71148a = searchFragment;
        }

        public final void run() {
            if (this.f71148a.isViewValid()) {
                this.f71148a.mo69700u().setExpanded(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$m */
    static final class C26946m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71149a;

        C26946m(SearchFragment searchFragment) {
            this.f71149a = searchFragment;
        }

        public final void run() {
            this.f71149a.mo69681L();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$n */
    static final class C26947n extends Lambda implements C7561a<SearchFilterViewHolder> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71150a;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$n$a */
        public static final class C26948a implements C26637a {

            /* renamed from: a */
            final /* synthetic */ C26947n f71151a;

            C26948a(C26947n nVar) {
                this.f71151a = nVar;
            }
        }

        C26947n(SearchFragment searchFragment) {
            this.f71150a = searchFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SearchFilterViewHolder invoke() {
            SearchFilterViewHolder searchFilterViewHolder = new SearchFilterViewHolder(this.f71150a.mo69702w(), new C26948a(this));
            searchFilterViewHolder.mo68325a(false);
            return searchFilterViewHolder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchFragment$o */
    static final class C26949o extends Lambda implements C7561a<C27092b> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f71152a;

        C26949o(SearchFragment searchFragment) {
            this.f71152a = searchFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27092b invoke() {
            Context context = this.f71152a.getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "context!!");
            return C27093a.m88901a(context, this.f71152a);
        }
    }

    /* renamed from: N */
    private final FrameLayout mo69749N() {
        return (FrameLayout) this.f71122L.getValue();
    }

    /* renamed from: j */
    private View mo68436j() {
        return (View) this.f71130e.getValue();
    }

    /* renamed from: B */
    public final C27092b mo69673B() {
        return (C27092b) this.f71128R.getValue();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        m88513U();
    }

    /* renamed from: a */
    public View mo68429a(int i) {
        if (this.f71129S == null) {
            this.f71129S = new HashMap();
        }
        View view = (View) this.f71129S.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71129S.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo68433a(String str);

    /* renamed from: a */
    public void mo69466a(List<GuideSearchWord> list) {
    }

    public final void aE_() {
        m88513U();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo68434b(boolean z);

    /* renamed from: b_ */
    public abstract boolean mo68435b_(boolean z);

    /* renamed from: c */
    public void mo59110c(List<? extends D> list, boolean z) {
        C7573i.m23587b(list, "list");
    }

    /* renamed from: g */
    public void mo68430g() {
        if (this.f71129S != null) {
            this.f71129S.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo68438l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo68439m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo68440n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo68441o() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final AppBarLayout mo69700u() {
        return (AppBarLayout) this.f71131f.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final GuideSearchHeadView mo69701v() {
        return (GuideSearchHeadView) this.f71119H.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final FrameLayout mo69702w() {
        return (FrameLayout) this.f71120J.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final SearchFilterViewHolder mo69703x() {
        return (SearchFilterViewHolder) this.f71121K.getValue();
    }

    /* renamed from: a */
    public final void mo69686a(BaseAdapter<D> baseAdapter) {
        C7573i.m23587b(baseAdapter, "<set-?>");
        this.f71114C = baseAdapter;
    }

    /* renamed from: a */
    public final void mo69687a(HeaderAndFooterWrapper headerAndFooterWrapper) {
        C7573i.m23587b(headerAndFooterWrapper, "<set-?>");
        this.f71115D = headerAndFooterWrapper;
    }

    /* renamed from: a */
    public void mo69465a(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        mo69653b(searchResultParam);
        String keyword = searchResultParam.getKeyword();
        C7573i.m23582a((Object) keyword, "param.keyword");
        mo69654b(keyword);
        this.f71093l = searchResultParam.getSearchFrom();
        if (8 == this.f71093l) {
            this.f71097p = 0;
        } else {
            this.f71097p = 1;
        }
        String enterFrom = searchResultParam.getEnterFrom();
        C7573i.m23582a((Object) enterFrom, "param.enterFrom");
        mo69657d(enterFrom);
        if (this.f71093l == 2 || this.f71093l == 5) {
            String keyword2 = searchResultParam.getKeyword();
            C7573i.m23582a((Object) keyword2, "param.keyword");
            mo69656c(keyword2);
        }
    }

    /* renamed from: a */
    public final void mo69684a(C10805b bVar) {
        C7573i.m23587b(bVar, "status");
        mo69468p();
        if (mo69704y().f67566v) {
            mo69704y().mo66516d(false);
            mo69704y().notifyDataSetChanged();
        }
        m88510R();
        C27091a aVar = C27090a.f71468a;
        DmtStatusView dmtStatusView = this.f71133x;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        aVar.mo69879a(dmtStatusView, bVar);
        mo68434b(false);
    }

    /* renamed from: a */
    public final boolean mo69693a(RecyclerView recyclerView) {
        C0902i a = C43064dn.m136619a(recyclerView);
        if (!(a.f3154a == null || a.f3155b == null)) {
            Integer num = (Integer) a.f3154a;
            if (num == null || num.intValue() != -1) {
                Integer num2 = (Integer) a.f3155b;
                if (num2 == null || num2.intValue() != -1) {
                    F f = a.f3154a;
                    if (f == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) f, "range.first!!");
                    int intValue = ((Number) f).intValue();
                    S s = a.f3155b;
                    if (s == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) s, "range.second!!");
                    m88519a(intValue, ((Number) s).intValue());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo69692a(String str, String str2, String str3, boolean z, SearchAdInfo searchAdInfo) {
        String str4;
        C7573i.m23587b(str, "labelName");
        C7573i.m23587b(str3, POIService.KEY_KEYWORD);
        if (C7573i.m23585a((Object) "general_search", (Object) str)) {
            str = "general";
        }
        FragmentActivity activity = getActivity();
        String str5 = null;
        SearchEnterParam searchEnterParam = activity != null ? C27244a.m89252a(activity).f71757a : null;
        C22984d a = C22984d.m75611a().mo59973a("search_keyword", str3).mo59973a("request_id", str2).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str2)).mo59973a("search_type", str).mo59973a("enter_from", searchEnterParam != null ? searchEnterParam.getEnterSearchFrom() : null).mo59973a("previous_page", searchEnterParam != null ? searchEnterParam.getPreviousPage() : null);
        String str6 = "group_id";
        if (searchEnterParam != null) {
            str5 = searchEnterParam.getGroupId();
        }
        C22984d a2 = a.mo59973a(str6, str5).mo59970a("is_success", z ? 1 : 0);
        if (!(searchAdInfo == null || searchAdInfo.getEasterEggInfo() == null)) {
            a2.mo59970a("is_bonus", 1);
        }
        if (SearchContext.m87933f() != this.f71096o) {
            a2.mo59973a("enter_method", "switch_tab");
            a2.mo59973a("from_search_subtab", mo69467b(SearchContext.m87933f()));
        } else if (this.f71093l == 2) {
            if (TextUtils.equals(this.f71090i, this.f71091j)) {
                a2.mo59973a("enter_method", this.f71094m);
            } else {
                a2.mo59973a("enter_method", "normal_search");
            }
        } else if (this.f71093l == 7 || this.f71093l == 6) {
            a2.mo59973a("enter_method", this.f71094m);
        } else {
            if (SearchContext.m87926a()) {
                SearchContext.m87925a(false);
                str4 = "click_more_general_list";
            } else {
                str4 = this.f71093l == 1 ? "search_history" : this.f71093l == 3 ? "search_sug" : this.f71093l == 4 ? "related_search_keywords" : this.f71093l == 5 ? "default_search_keyword" : this.f71093l == 9 ? "search_guide" : this.f71093l == 16 ? "recom_search" : "normal_search";
            }
            a2.mo59973a("enter_method", str4);
        }
        C6907h.m21525a("search", C33230ac.m107211a(a2.f60753a));
        C6903bc.m21476Q().mo69859g();
        SearchContext.m87927b(this.f71096o);
    }

    /* renamed from: a */
    public void mo59099a(List<? extends D> list, boolean z) {
        C7573i.m23587b(list, "list");
        if (isViewValid()) {
            m88528e(z);
            mo69704y().mo58045a(list);
            View view = getView();
            if (view == null) {
                C7573i.m23580a();
            }
            view.requestLayout();
            mo68434b(true);
        }
    }

    /* renamed from: a */
    public final void mo69691a(SearchPreventSuicide searchPreventSuicide) {
        if (searchPreventSuicide != null) {
            C42961az.m136380a(searchPreventSuicide);
        }
    }

    /* renamed from: a */
    public final void mo69690a(SearchApiResult searchApiResult) {
        this.f71089h.f69899c = searchApiResult;
    }

    /* renamed from: a */
    public final void mo69689a(QueryCorrectInfo queryCorrectInfo) {
        if (isViewValid()) {
            this.f71125O = queryCorrectInfo;
            if (queryCorrectInfo == null) {
                SearchCorrectHeadView searchCorrectHeadView = this.f71123M;
                if (searchCorrectHeadView != null) {
                    searchCorrectHeadView.setVisibility(8);
                }
                return;
            }
            if (this.f71123M == null) {
                Context context = getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "context!!");
                this.f71123M = new SearchCorrectHeadView(context);
                FrameLayout N = mo69749N();
                SearchCorrectHeadView searchCorrectHeadView2 = this.f71123M;
                if (searchCorrectHeadView2 == null) {
                    C7573i.m23580a();
                }
                N.addView(searchCorrectHeadView2);
            }
            SearchCorrectHeadView searchCorrectHeadView3 = this.f71123M;
            if (searchCorrectHeadView3 == null) {
                C7573i.m23580a();
            }
            searchCorrectHeadView3.mo70056a(queryCorrectInfo, this.f71090i);
        }
    }

    /* renamed from: a */
    public final void mo69685a(SearchAdInfo searchAdInfo) {
        if (!(searchAdInfo == null || searchAdInfo.getEasterEggInfo() == null)) {
            if (mo68435b_(C30538p.m99745a())) {
                EasterEggInfo easterEggInfo = searchAdInfo.getEasterEggInfo();
                C7573i.m23582a((Object) easterEggInfo, "searchAdInfo.easterEggInfo");
                if (easterEggInfo.isH5()) {
                    C6903bc.m21503v().mo58107a(getContext(), searchAdInfo);
                    return;
                }
            }
            EasterEggPageParams easterEggPageParams = new EasterEggPageParams();
            easterEggPageParams.setEasterEggInfo(searchAdInfo.getEasterEggInfo());
            easterEggPageParams.setKeyWords(this.f71090i);
            easterEggPageParams.setEnterFrom(this.f71095n);
            easterEggPageParams.setEnterMethod(this.f71094m);
            C6903bc.m21503v().mo58106a(getActivity(), easterEggPageParams, -1);
        }
    }

    /* renamed from: a */
    public final void mo69688a(GuideSearchWord guideSearchWord) {
        C7573i.m23587b(guideSearchWord, "guideSearchWord");
        if (this.f71088g != null) {
            SearchResultParam searchResultParam = this.f71088g;
            if (searchResultParam == null) {
                C7573i.m23580a();
            }
            String guideSearchBaseWord = searchResultParam.getGuideSearchBaseWord();
            if (TextUtils.isEmpty(guideSearchBaseWord)) {
                guideSearchBaseWord = guideSearchWord.getWord();
            } else if (!guideSearchWord.isAllTab()) {
                StringBuilder sb = new StringBuilder();
                sb.append(guideSearchBaseWord);
                sb.append(' ');
                sb.append(guideSearchWord);
                guideSearchBaseWord = sb.toString();
            }
            SearchResultParam keyword = new SearchResultParam().setKeyword(guideSearchBaseWord);
            SearchResultParam searchResultParam2 = this.f71088g;
            if (searchResultParam2 == null) {
                C7573i.m23580a();
            }
            SearchResultParam searchFrom = keyword.setGuideSearchBaseWord(searchResultParam2.getGuideSearchBaseWord()).setSearchFrom(9);
            C7573i.m23582a((Object) searchFrom, "param");
            mo69655c(searchFrom);
        }
    }

    /* renamed from: V */
    private void m88514V() {
        mo69704y().ag_();
    }

    /* renamed from: Y */
    private void m88517Y() {
        this.f71126P = System.currentTimeMillis();
    }

    /* renamed from: O */
    private HeaderAndFooterWrapper m88507O() {
        HeaderAndFooterWrapper headerAndFooterWrapper = this.f71115D;
        if (headerAndFooterWrapper == null) {
            C7573i.m23583a("mSearchAdapterWrapper");
        }
        return headerAndFooterWrapper;
    }

    /* renamed from: R */
    private void m88510R() {
        mo69704y().mo58045a(null);
    }

    /* renamed from: W */
    private void m88515W() {
        mo69468p();
        mo69704y().mo66507h();
    }

    /* renamed from: Z */
    private final void m88518Z() {
        new Handler().post(new C26946m(this));
    }

    /* renamed from: H */
    public final void mo69677H() {
        mo69684a(mo69673B().mo69880a());
    }

    /* renamed from: K */
    public final void mo69680K() {
        mo69703x().mo68325a(true);
        m88518Z();
    }

    public final void aD_() {
        if (isViewValid()) {
            m88514V();
        }
    }

    public void ae_() {
        if (isViewValid()) {
            mo69677H();
        }
    }

    public final void bd_() {
        if (isViewValid()) {
            mo68438l();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        C42961az.m136383d(this);
        mo68430g();
    }

    public void onResume() {
        super.onResume();
        this.f71127Q = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final RecyclerView mo69697r() {
        RecyclerView recyclerView = this.f71132w;
        if (recyclerView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final DmtStatusView mo69698s() {
        DmtStatusView dmtStatusView = this.f71133x;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        return dmtStatusView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final SwipeRefreshLayout mo69699t() {
        SwipeRefreshLayout swipeRefreshLayout = this.f71134y;
        if (swipeRefreshLayout == null) {
            C7573i.m23583a("mRefreshLayout");
        }
        return swipeRefreshLayout;
    }

    /* renamed from: y */
    public final BaseAdapter<D> mo69704y() {
        BaseAdapter<D> baseAdapter = this.f71114C;
        if (baseAdapter == null) {
            C7573i.m23583a("mSearchAdapter");
        }
        return baseAdapter;
    }

    /* renamed from: F */
    public static void m88505F() {
        C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
        C6907h.m21524a("search_freq_control_show", (Map) C22984d.m75611a().mo59970a("is_login", C42811c.m135867c() ? 1 : 0).f60753a);
    }

    /* renamed from: Q */
    private C1273i m88509Q() {
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        return wrapLinearLayoutManager;
    }

    /* renamed from: X */
    private void m88516X() {
        RecyclerView recyclerView = this.f71132w;
        if (recyclerView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        recyclerView.mo5541b(0);
        mo69700u().postDelayed(new C26945l(this), 400);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo69679J() {
        QueryCorrectInfo queryCorrectInfo = this.f71125O;
        if (queryCorrectInfo == null || queryCorrectInfo.getCorrectedLevel() != 2) {
            return this.f71090i;
        }
        QueryCorrectInfo queryCorrectInfo2 = this.f71125O;
        if (queryCorrectInfo2 == null) {
            C7573i.m23580a();
        }
        String correctedKeyword = queryCorrectInfo2.getCorrectedKeyword();
        C7573i.m23582a((Object) correctedKeyword, "mQueryCorrectInfo!!.correctedKeyword");
        return correctedKeyword;
    }

    /* renamed from: M */
    public final void mo69682M() {
        if (C6399b.m19944t()) {
            FeedbackGuideView feedbackGuideView = this.f71113B;
            if (feedbackGuideView != null) {
                feedbackGuideView.mo70012a();
            }
            FeedbackGuideView feedbackGuideView2 = this.f71113B;
            if (feedbackGuideView2 != null) {
                feedbackGuideView2.mo70015c();
            }
        }
    }

    public void onPause() {
        super.onPause();
        new Handler().postDelayed(new C26944k(this), 500);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69468p() {
        m88518Z();
        new Handler().postDelayed(new C26934a(this), 500);
    }

    /* renamed from: z */
    public final int mo69705z() {
        if ((this.f71093l == 2 || this.f71093l == 5) && TextUtils.equals(this.f71091j, this.f71090i)) {
            return C26932a.m88487a();
        }
        return 0;
    }

    /* renamed from: S */
    private final void m88511S() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C0063u a = C0069x.m159a(activity).mo147a(SearchStateViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f71124N = (SearchStateViewModel) a;
        SearchStateViewModel searchStateViewModel = this.f71124N;
        if (searchStateViewModel == null) {
            C7573i.m23583a("mStateViewModel");
        }
        searchStateViewModel.searchState.observe(this, new C26943j(this));
    }

    /* renamed from: U */
    private void m88513U() {
        FeedbackGuideView feedbackGuideView = this.f71113B;
        if (feedbackGuideView == null || !feedbackGuideView.mo70016d()) {
            RecyclerView recyclerView = this.f71132w;
            if (recyclerView == null) {
                C7573i.m23583a("mRecyclerView");
            }
            if (recyclerView.getChildCount() <= 0) {
                DmtStatusView dmtStatusView = this.f71133x;
                if (dmtStatusView == null) {
                    C7573i.m23583a("mStatusView");
                }
                dmtStatusView.mo25942f();
            } else if (C6399b.m19945u()) {
                mo69694c(true);
            } else {
                SwipeRefreshLayout swipeRefreshLayout = this.f71134y;
                if (swipeRefreshLayout == null) {
                    C7573i.m23583a("mRefreshLayout");
                }
                swipeRefreshLayout.setRefreshing(true);
            }
        }
    }

    /* renamed from: A */
    public final void mo69672A() {
        C6907h.m21524a("search_pull_down_refresh", (Map) C22984d.m75611a().mo59973a("enter_from", mo68437k()).mo59973a("search_keyword", this.f71090i).f60753a);
        if (C7573i.m23585a((Object) mo68437k(), (Object) "general_search")) {
            m88517Y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo69676G() {
        if (mo69704y().f67566v) {
            mo69704y().mo66516d(false);
            mo69704y().notifyDataSetChanged();
        }
        m88510R();
        DmtStatusView dmtStatusView = this.f71133x;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        dmtStatusView.mo25944h();
        C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo69674D() {
        View view;
        C10803a a = C10803a.m31631a(getContext()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C26935b(this));
        if (!C6399b.m19944t()) {
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "context!!");
            view = new C27277e(context, this.f71096o);
        } else {
            MtEmptyView a2 = MtEmptyView.m31657a(getContext());
            C7573i.m23582a((Object) a2, "MtEmptyView.newInstance(context)");
            view = a2;
        }
        a.mo25963b(view);
        DmtStatusView dmtStatusView = this.f71133x;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        dmtStatusView.setBuilder(a);
    }

    /* renamed from: E */
    public final void mo69675E() {
        Integer num;
        String str;
        long uptimeMillis = SystemClock.uptimeMillis() - this.f71127Q;
        SearchResultParam searchResultParam = this.f71088g;
        if (searchResultParam != null) {
            num = Integer.valueOf(searchResultParam.getIndex());
        } else {
            num = null;
        }
        if (num != null) {
            int i = this.f71096o;
            SearchResultParam searchResultParam2 = this.f71088g;
            if (searchResultParam2 == null || i != searchResultParam2.getIndex()) {
                str = C27029ba.m88791a(num.intValue());
                C6907h.m21524a("search_session_finish", (Map) C22984d.m75611a().mo59971a("duration", uptimeMillis).mo59973a("search_type", C27029ba.m88791a(this.f71096o)).mo59973a("log_pb", C28199ae.m92689a().mo71791a(this.f71089h.mo68131d())).mo59973a("impr_id", this.f71089h.mo68131d()).mo59973a("next_tab", str).f60753a);
            }
        }
        str = "";
        C6907h.m21524a("search_session_finish", (Map) C22984d.m75611a().mo59971a("duration", uptimeMillis).mo59973a("search_type", C27029ba.m88791a(this.f71096o)).mo59973a("log_pb", C28199ae.m92689a().mo71791a(this.f71089h.mo68131d())).mo59973a("impr_id", this.f71089h.mo68131d()).mo59973a("next_tab", str).f60753a);
    }

    /* renamed from: I */
    public final void mo69678I() {
        Object obj;
        if (C6399b.m19944t()) {
            FeedbackGuideView feedbackGuideView = this.f71113B;
            if (feedbackGuideView == null) {
                RecyclerView recyclerView = this.f71132w;
                if (recyclerView == null) {
                    C7573i.m23583a("mRecyclerView");
                }
                feedbackGuideView = C27257a.m89289a(recyclerView);
            }
            this.f71113B = feedbackGuideView;
            if (C6399b.m19945u()) {
                mo69694c(false);
            } else {
                SwipeRefreshLayout swipeRefreshLayout = this.f71134y;
                if (swipeRefreshLayout == null) {
                    C7573i.m23583a("mRefreshLayout");
                }
                swipeRefreshLayout.setRefreshing(false);
            }
            Iterable b = m88507O().mo68260b();
            FeedbackGuideView feedbackGuideView2 = this.f71113B;
            View view = null;
            if (feedbackGuideView2 != null) {
                obj = feedbackGuideView2.itemView;
            } else {
                obj = null;
            }
            if (!C7525m.m23496a(b, obj)) {
                HeaderAndFooterWrapper O = m88507O();
                FeedbackGuideView feedbackGuideView3 = this.f71113B;
                if (feedbackGuideView3 != null) {
                    view = feedbackGuideView3.itemView;
                }
                O.mo68257a(0, view);
            }
            if (!feedbackGuideView.mo70016d()) {
                FeedbackGuideView feedbackGuideView4 = this.f71113B;
                if (feedbackGuideView4 != null) {
                    feedbackGuideView4.mo70013a(mo68437k(), this.f71090i);
                }
            } else {
                mo69682M();
            }
        }
    }

    /* renamed from: L */
    public final void mo69681L() {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis() - this.f71126P;
        if (currentTimeMillis > 0 && currentTimeMillis <= C40413c.f105051b) {
            if (C7573i.m23585a((Object) mo68437k(), (Object) "general_search")) {
                str2 = "general_search";
                str = "general";
            } else {
                str2 = "search_result";
                str = mo68437k();
            }
            C6907h.m21524a("search_duration", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("enter_method", this.f71094m).mo59973a("search_keyword", this.f71090i).mo59971a("duration", currentTimeMillis).mo59973a("search_type", str).mo59973a("search_id", this.f71089h.mo68131d()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(this.f71089h.mo68131d())).f60753a);
        }
    }

    /* renamed from: P */
    private final void m88508P() {
        String str;
        int i = this.f71096o;
        if (i == C27029ba.f71321c) {
            str = "search_user_list";
        } else if (i == C27029ba.f71320b) {
            str = "search_video_list";
        } else if (i == C27029ba.f71322d) {
            str = "search_poi_list";
        } else if (i == C27029ba.f71323e) {
            str = "search_music_list";
        } else if (i == C27029ba.f71324f) {
            str = "search_challenge_list";
        } else {
            String name = getClass().getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1205859379) {
                    if (hashCode != -795130379) {
                        if (hashCode != -48079428) {
                            if (hashCode == 280079325 && name.equals("com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchMixFeedFragment")) {
                                str = "search_mix_feed_list";
                            }
                        } else if (name.equals("com.ss.android.ugc.aweme.discover.ui.SearchCommodityFragment")) {
                            str = "search_commodity_list";
                        }
                    } else if (name.equals("com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment")) {
                        str = "search_mix_feed_list";
                    }
                } else if (name.equals("com.ss.android.ugc.aweme.discover.commodity.SearchGridCommodityFragment")) {
                    str = "search_commodity_grid";
                }
            }
            str = "";
        }
        if (!C7573i.m23585a((Object) str, (Object) "")) {
            C42979bl a = C42981a.m136451a(str);
            RecyclerView recyclerView = this.f71132w;
            if (recyclerView == null) {
                C7573i.m23583a("mRecyclerView");
            }
            a.mo104686a(recyclerView);
        }
    }

    /* renamed from: T */
    private void m88512T() {
        if (!TextUtils.isEmpty(this.f71090i)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key_word", this.f71090i);
                if (this.f71093l == 2) {
                    if (TextUtils.equals(this.f71090i, this.f71091j)) {
                        jSONObject.put("enter_from", "hot_search");
                        jSONObject.put("enter_method", this.f71094m);
                    } else {
                        jSONObject.put("enter_from", "normal_search");
                    }
                    jSONObject.put("key_word_type", "general_word");
                } else {
                    if (this.f71093l == 1) {
                        mo69658e("search_history");
                    } else if (this.f71093l == 3) {
                        mo69658e("search_sug");
                    } else {
                        mo69658e("normal_search");
                    }
                    jSONObject.put("enter_from", this.f71095n);
                }
            } catch (JSONException unused) {
            }
            C6907h.onEvent(MobClick.obtain().setEventName("search").setLabelName(mo68437k()).setJsonObject(jSONObject));
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        C7573i.m23587b(exc, "e");
        if (isViewValid()) {
            m88526d(exc);
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        C7573i.m23587b(exc, "e");
        if (isViewValid()) {
            m88515W();
        }
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
        C7573i.m23587b(exc, "e");
        m88526d(exc);
    }

    /* renamed from: b */
    private void m88525b(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        recyclerView.mo5528a((C1281m) new SearchFragment$monitorRecycleShownStatus$1(this));
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C26942i(this, recyclerView));
    }

    /* renamed from: d */
    private final void m88527d(boolean z) {
        if (z) {
            this.f71127Q = SystemClock.uptimeMillis();
        }
        if (this.f71118G && !z) {
            mo69675E();
        }
        this.f71118G = z;
    }

    /* renamed from: f */
    private void m88529f(boolean z) {
        mo69468p();
        if (!z) {
            mo69704y().ah_();
        } else {
            mo69704y().ai_();
        }
    }

    /* renamed from: c */
    public final void mo69694c(boolean z) {
        if (z) {
            mo68436j().setVisibility(0);
        } else {
            mo68436j().setVisibility(8);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        m88523a(true, false);
        if (!z) {
            mo69682M();
        }
        m88527d(z);
    }

    /* renamed from: b */
    private static String mo69467b(int i) {
        if (i == C27029ba.f71319a) {
            return "general_search";
        }
        if (i == C27029ba.f71320b) {
            return "video";
        }
        if (i == C27029ba.f71321c) {
            return "user";
        }
        if (i == C27029ba.f71324f) {
            return "tag";
        }
        if (i == C27029ba.f71323e) {
            return "music";
        }
        if (i == C27029ba.f71322d) {
            return "poi";
        }
        if (i == C27029ba.f71325g) {
            return "ecommerce";
        }
        return "";
    }

    /* renamed from: d */
    private void m88526d(Exception exc) {
        C7573i.m23587b(exc, "e");
        C10805b a = C27092b.m88896a(mo69673B(), null, exc, 1, null);
        if (a != null) {
            mo69684a(a);
            return;
        }
        C22814a.m75244a(getContext(), (Throwable) exc);
        mo69677H();
    }

    /* renamed from: e */
    private void m88528e(boolean z) {
        mo69468p();
        mo69704y().mo66516d(true);
        if (!z) {
            mo69704y().ah_();
        } else {
            mo69704y().ai_();
        }
        DmtStatusView dmtStatusView = this.f71133x;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        dmtStatusView.mo25939d();
    }

    /* renamed from: c */
    public final void mo69655c(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "searchResultParam");
        super.mo69655c(searchResultParam);
        this.f71116E = true;
        if (!isViewValid()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putSerializable(SearchBaseFragment.f71083r, searchResultParam);
                return;
            }
            return;
        }
        mo69465a(searchResultParam);
        mo68433a(this.f71090i);
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) context, "context!!");
        C37387a.m119991a(context, searchResultParam);
        m88523a(false, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(SearchBaseFragment.f71083r);
            if (serializable != null) {
                mo69465a((SearchResultParam) serializable);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            }
        }
        m88511S();
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onJsBroadcastReceiver(C27994k kVar) {
        C7573i.m23587b(kVar, "broadCastEvent");
        try {
            if (TextUtils.equals("search_feedback_success_toast", kVar.f73730b.getString("eventName"))) {
                C10761a.m31409e(C6399b.m19921a(), (int) R.string.arg).mo25750a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m88520a(View view) {
        C7573i.m23587b(view, "view");
        View findViewById = view.findViewById(R.id.bnf);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.list_view)");
        this.f71132w = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.dag);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.status)");
        this.f71133x = (DmtStatusView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cr7);
        C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.refresh_layout)");
        this.f71134y = (SwipeRefreshLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.a2d);
        C7573i.m23582a((Object) findViewById4, "view.findViewById(R.id.content_top_container)");
        this.f71135z = (FrameLayout) findViewById4;
        SwipeRefreshLayout swipeRefreshLayout = this.f71134y;
        if (swipeRefreshLayout == null) {
            C7573i.m23583a("mRefreshLayout");
        }
        RecyclerView recyclerView = this.f71132w;
        if (recyclerView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        new C26604h(swipeRefreshLayout, recyclerView, mo69700u());
        if (C6399b.m19945u()) {
            SwipeRefreshLayout swipeRefreshLayout2 = this.f71134y;
            if (swipeRefreshLayout2 == null) {
                C7573i.m23583a("mRefreshLayout");
            }
            swipeRefreshLayout2.setEnabled(false);
        }
    }

    @C7709l
    public void onSearchAfterLogin(C26578e eVar) {
        C7573i.m23587b(eVar, "searchAfterLoginEvent");
        if (eVar.f70104a && isViewValid()) {
            DmtStatusView dmtStatusView = this.f71133x;
            if (dmtStatusView == null) {
                C7573i.m23583a("mStatusView");
            }
            if (!dmtStatusView.mo25947k()) {
                DmtStatusView dmtStatusView2 = this.f71133x;
                if (dmtStatusView2 == null) {
                    C7573i.m23583a("mStatusView");
                }
                if (!dmtStatusView2.mo25948l()) {
                    DmtStatusView dmtStatusView3 = this.f71133x;
                    if (dmtStatusView3 == null) {
                        C7573i.m23583a("mStatusView");
                    }
                    if (!dmtStatusView3.mo25949m()) {
                        return;
                    }
                }
            }
            DmtStatusView dmtStatusView4 = this.f71133x;
            if (dmtStatusView4 == null) {
                C7573i.m23583a("mStatusView");
            }
            dmtStatusView4.mo25939d();
            this.f71116E = true;
            m88523a(false, false);
        }
    }

    /* renamed from: a */
    public void mo68431a(int i, FilterOption filterOption) {
        C26807z.f70733a.mo68589a(mo68437k(), this.f71090i);
        m88516X();
        SearchResultParam searchResultParam = this.f71088g;
        if (searchResultParam != null) {
            searchResultParam.setFilterOption(filterOption);
        }
        m88517Y();
    }

    /* renamed from: a */
    private void m88519a(int i, int i2) {
        if (i <= i2 && i >= 0) {
            try {
                if (i2 <= mo69704y().mo62312a().size()) {
                    C26807z.m88009a(mo69704y().mo62312a().subList(i, i2));
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m88520a(view);
        mo68432a(view, bundle);
        mo68439m();
        if (this.f71088g != null) {
            SearchResultParam searchResultParam = this.f71088g;
            if (searchResultParam == null) {
                C7573i.m23580a();
            }
            mo69655c(searchResultParam);
        }
        C42961az.m136382c(this);
        m88508P();
    }

    /* renamed from: b */
    public void mo59108b(List<? extends D> list, boolean z) {
        if (isViewValid()) {
            if (list == null || list.isEmpty()) {
                z = false;
            }
            m88529f(z);
            mo69704y().mo61577b(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m88523a(boolean z, boolean z2) {
        CurrentItemMethod currentItemMethod;
        if (isViewValid() && this.mUserVisibleHint && this.f71117F) {
            m88512T();
            if (this.f71116E) {
                C26612d.f70187a.mo68309d(this.f71096o);
                mo68431a(z ? 1 : 0, (FilterOption) null);
                this.f71116E = false;
                if (SearchContext.m87929b()) {
                    this.f71089h.mo68127a(CurrentItemMethod.FROM_GENERAL_SEARCH);
                    SearchContext.m87928b(false);
                } else {
                    C26501r rVar = this.f71089h;
                    if (z) {
                        currentItemMethod = CurrentItemMethod.FROM_OTHERS;
                    } else {
                        currentItemMethod = CurrentItemMethod.FROM_SEARCH_RESULT;
                    }
                    rVar.mo68127a(currentItemMethod);
                }
                if (C37380c.m119974a()) {
                    SearchHistoryManager.inst().recordSearchHistory(new SearchHistory(this.f71090i, SearchHistory.toHistoryType(this.f71092k)));
                }
            } else {
                mo68434b(!C6307b.m19566a((Collection<T>) mo69704y().mo62312a()));
            }
            mo69682M();
        }
    }

    /* renamed from: a */
    public final void mo69683a(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        if (i == 0) {
            mo69693a(recyclerView);
        }
    }

    /* renamed from: a */
    public void mo68432a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        mo69674D();
        RecyclerView recyclerView = this.f71132w;
        if (recyclerView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        recyclerView.setLayoutManager(m88509Q());
        mo68440n();
        mo69687a(new HeaderAndFooterWrapper(mo69704y()));
        mo69704y().f67550q = getResources().getColor(R.color.a53);
        if (C6399b.m19944t()) {
            mo69704y().f67550q = getResources().getColor(R.color.a3z);
        }
        mo69704y().mo66504a((C6905a) this);
        RecyclerView recyclerView2 = this.f71132w;
        if (recyclerView2 == null) {
            C7573i.m23583a("mRecyclerView");
        }
        recyclerView2.setAdapter(m88507O());
        RecyclerView recyclerView3 = this.f71132w;
        if (recyclerView3 == null) {
            C7573i.m23583a("mRecyclerView");
        }
        recyclerView3.setOverScrollMode(2);
        RecyclerView recyclerView4 = this.f71132w;
        if (recyclerView4 == null) {
            C7573i.m23583a("mRecyclerView");
        }
        C1267f itemAnimator = recyclerView4.getItemAnimator();
        if (itemAnimator == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) itemAnimator, "mRecyclerView.itemAnimator!!");
        itemAnimator.f4943l = 0;
        if (VERSION.SDK_INT <= 17) {
            SwipeRefreshLayout swipeRefreshLayout = this.f71134y;
            if (swipeRefreshLayout == null) {
                C7573i.m23583a("mRefreshLayout");
            }
            swipeRefreshLayout.setDoNotCatchException(true);
        }
        RecyclerView recyclerView5 = this.f71132w;
        if (recyclerView5 == null) {
            C7573i.m23583a("mRecyclerView");
        }
        m88525b(recyclerView5);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f71134y;
        if (swipeRefreshLayout2 == null) {
            C7573i.m23583a("mRefreshLayout");
        }
        swipeRefreshLayout2.setOnRefreshListener(new C26936c(this));
        if (mo68441o()) {
            RecyclerView recyclerView6 = this.f71132w;
            if (recyclerView6 == null) {
                C7573i.m23583a("mRecyclerView");
            }
            RecyclerView recyclerView7 = this.f71132w;
            if (recyclerView7 == null) {
                C7573i.m23583a("mRecyclerView");
            }
            recyclerView6.setPadding(0, (int) C9738o.m28708b(recyclerView7.getContext(), 8.0f), 0, 0);
            RecyclerView recyclerView8 = this.f71132w;
            if (recyclerView8 == null) {
                C7573i.m23583a("mRecyclerView");
            }
            recyclerView8.setClipToPadding(false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.qm, viewGroup, false);
    }
}
