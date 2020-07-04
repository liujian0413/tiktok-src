package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p280ss.android.ugc.aweme.discover.helper.C26663k;
import com.p280ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView */
public final class SearchIntermediateView extends FrameLayout {

    /* renamed from: d */
    public static final C26958a f71176d = new C26958a(null);

    /* renamed from: a */
    public SearchIntermediateViewModel f71177a;

    /* renamed from: b */
    public C26960c f71178b;

    /* renamed from: c */
    public int f71179c;

    /* renamed from: e */
    private C0608j f71180e;

    /* renamed from: f */
    private Fragment f71181f;

    /* renamed from: g */
    private final C26663k f71182g;

    /* renamed from: h */
    private boolean f71183h;

    /* renamed from: i */
    private LoftNestedRefreshLayout f71184i;

    /* renamed from: j */
    private final C0053p<Integer> f71185j;

    /* renamed from: k */
    private final C0053p<Integer> f71186k;

    /* renamed from: l */
    private int f71187l;

    /* renamed from: m */
    private C26959b f71188m;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$a */
    public static final class C26958a {
        private C26958a() {
        }

        public /* synthetic */ C26958a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$b */
    public interface C26959b {
        /* renamed from: a */
        void mo69741a(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$c */
    public interface C26960c {
        /* renamed from: a */
        void mo69519a(SearchResultParam searchResultParam);

        /* renamed from: b */
        void mo69526b(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$d */
    static final class C26961d<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateView f71189a;

        C26961d(SearchIntermediateView searchIntermediateView) {
            this.f71189a = searchIntermediateView;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                if (this.f71189a.f71179c != num.intValue() && num.intValue() == 0) {
                    SearchResultParam searchResultParam = (SearchResultParam) SearchIntermediateView.m88640a(this.f71189a).getOpenSearchParam().getValue();
                    if (searchResultParam != null) {
                        SearchIntermediateView.m88641b(this.f71189a).mo69519a(searchResultParam);
                    }
                }
                this.f71189a.f71179c = num.intValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$e */
    static final class C26962e<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateView f71190a;

        C26962e(SearchIntermediateView searchIntermediateView) {
            this.f71190a = searchIntermediateView;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                SearchIntermediateView.m88641b(this.f71190a).mo69526b(num.intValue());
            }
        }
    }

    public SearchIntermediateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchIntermediateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getOpenSugFromState() {
        return this.f71187l;
    }

    /* renamed from: a */
    public final void mo69728a() {
        mo69732a(false);
    }

    /* renamed from: e */
    private final void m88644e() {
        C0608j jVar = this.f71180e;
        if (jVar == null) {
            C7573i.m23583a("fragmentManager");
        }
        Fragment a = jVar.mo2644a("RNtag_intermediate");
        if (a != null && (a instanceof RNSingleIntermediateFragment)) {
            ((RNSingleIntermediateFragment) a).mo69648a();
        }
    }

    /* renamed from: b */
    public final boolean mo69734b() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71177a;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("intermediateViewModel");
        }
        Integer num = (Integer) searchIntermediateViewModel.getIntermediateState().getValue();
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo69735c() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71177a;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("intermediateViewModel");
        }
        Integer num = (Integer) searchIntermediateViewModel.getIntermediateState().getValue();
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m88643d() {
        Fragment fragment;
        C0608j jVar = this.f71180e;
        if (jVar == null) {
            C7573i.m23583a("fragmentManager");
        }
        this.f71181f = jVar.mo2644a("tag_intermediate");
        if (this.f71181f == null) {
            if (C37380c.m119974a()) {
                fragment = new TabIntermediateFragment();
            } else if (!C6399b.m19944t()) {
                fragment = new DouyinSingleIntermediateFragment();
            } else {
                fragment = new SingleIntermediateFragment();
            }
            this.f71181f = fragment;
            C0608j jVar2 = this.f71180e;
            if (jVar2 == null) {
                C7573i.m23583a("fragmentManager");
            }
            C0633q a = jVar2.mo2645a();
            C7573i.m23582a((Object) a, "fragmentManager.beginTransaction()");
            Fragment fragment2 = this.f71181f;
            if (fragment2 == null) {
                C7573i.m23580a();
            }
            a.mo2600b(R.id.d11, fragment2, "tag_intermediate").mo2606d();
        } else if ((this.f71181f instanceof TabIntermediateFragment) && !this.f71183h && this.f71179c == 0) {
            Fragment fragment3 = this.f71181f;
            if (fragment3 != null) {
                ((TabIntermediateFragment) fragment3).mo69780d();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.TabIntermediateFragment");
            }
        }
        if ((this.f71181f instanceof DouyinSingleIntermediateFragment) && this.f71184i != null) {
            Fragment fragment4 = this.f71181f;
            if (fragment4 != null) {
                DouyinSingleIntermediateFragment douyinSingleIntermediateFragment = (DouyinSingleIntermediateFragment) fragment4;
                LoftNestedRefreshLayout loftNestedRefreshLayout = this.f71184i;
                if (loftNestedRefreshLayout == null) {
                    C7573i.m23580a();
                }
                douyinSingleIntermediateFragment.mo68279a(loftNestedRefreshLayout);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment");
        }
    }

    public final void setLoft(LoftNestedRefreshLayout loftNestedRefreshLayout) {
        this.f71184i = loftNestedRefreshLayout;
    }

    public final void setOpenSugFromState(int i) {
        this.f71187l = i;
    }

    public final void setOnDispatchTouchEventListener(C26959b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f71188m = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchIntermediateViewModel m88640a(SearchIntermediateView searchIntermediateView) {
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f71177a;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("intermediateViewModel");
        }
        return searchIntermediateViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ C26960c m88641b(SearchIntermediateView searchIntermediateView) {
        C26960c cVar = searchIntermediateView.f71178b;
        if (cVar == null) {
            C7573i.m23583a("responder");
        }
        return cVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        C26959b bVar = this.f71188m;
        if (bVar != null) {
            bVar.mo69741a(motionEvent);
        }
        return dispatchTouchEvent;
    }

    /* renamed from: c */
    private final void m88642c(boolean z) {
        if (z) {
            this.f71182g.mo68369c().mo68349b();
        } else {
            this.f71182g.mo68349b();
        }
    }

    /* renamed from: a */
    public final void mo69731a(String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        m88643d();
        m88642c(false);
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71177a;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("intermediateViewModel");
        }
        searchIntermediateViewModel.openSearchSug(str);
    }

    /* renamed from: b */
    public final void mo69733b(boolean z) {
        this.f71182g.mo68348a(z);
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71177a;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("intermediateViewModel");
        }
        searchIntermediateViewModel.hideIntermediate();
    }

    /* renamed from: a */
    public final void mo69730a(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        if (getVisibility() == 0 && (this.f71181f instanceof TabIntermediateFragment)) {
            Fragment fragment = this.f71181f;
            if (fragment != null) {
                searchResultParam.setIntermediatePageIndex(((TabIntermediateFragment) fragment).mo69781e());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.TabIntermediateFragment");
            }
        }
    }

    /* renamed from: a */
    public final void mo69732a(boolean z) {
        if (!mo69735c()) {
            m88643d();
            m88644e();
            m88642c(z);
            SearchIntermediateViewModel searchIntermediateViewModel = this.f71177a;
            if (searchIntermediateViewModel == null) {
                C7573i.m23583a("intermediateViewModel");
            }
            searchIntermediateViewModel.openSearchSquare();
        }
    }

    /* renamed from: a */
    public final void mo69729a(Fragment fragment, C26960c cVar) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(cVar, "responder");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "fragment.activity!!");
        this.f71178b = cVar;
        this.f71183h = C37385g.f97617a.isSearchResultActivity(fragment.getActivity());
        C0608j childFragmentManager = fragment.getChildFragmentManager();
        C7573i.m23582a((Object) childFragmentManager, "fragment.childFragmentManager");
        this.f71180e = childFragmentManager;
        C0063u a = C0069x.m159a(activity).mo147a(SearchIntermediateViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f71177a = (SearchIntermediateViewModel) a;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71177a;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("intermediateViewModel");
        }
        C0043i iVar = fragment;
        searchIntermediateViewModel.getIntermediateState().observe(iVar, this.f71185j);
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f71177a;
        if (searchIntermediateViewModel2 == null) {
            C7573i.m23583a("intermediateViewModel");
        }
        searchIntermediateViewModel2.getSearchTabIndex().observe(iVar, this.f71186k);
    }

    public SearchIntermediateView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        setVisibility(8);
        this.f71179c = 0;
        this.f71182g = new C26663k(context, this);
        this.f71185j = new C26961d(this);
        this.f71186k = new C26962e(this);
        this.f71187l = 1;
    }

    public /* synthetic */ SearchIntermediateView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
