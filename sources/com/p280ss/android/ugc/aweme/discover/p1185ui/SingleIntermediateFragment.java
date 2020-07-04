package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity.C26686a;
import com.p280ss.android.ugc.aweme.discover.mob.C26806y;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.discover.searchinter.SearchInterMainViewHolder;
import com.p280ss.android.ugc.aweme.discover.searchinter.SearchInterMainViewHolder.C26872a;
import com.p280ss.android.ugc.aweme.discover.searchinter.SearchInterSecondFloorViewHolder;
import com.p280ss.android.ugc.aweme.discover.searchinter.SearchInterSecondFloorViewHolder.C26873a;
import com.p280ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel;
import com.p280ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.C27234a;
import com.p280ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C27244a;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SingleIntermediateFragment */
public class SingleIntermediateFragment extends SearchIntermediateFragment<Object> implements C0043i, C27012a, C27013b {

    /* renamed from: s */
    public static final C26985a f71244s = new C26985a(null);

    /* renamed from: e */
    private HotSearchViewModel f71245e;

    /* renamed from: f */
    private GuessWordsViewModel f71246f;

    /* renamed from: g */
    private SearchInterMainViewHolder f71247g;

    /* renamed from: h */
    private ViewGroup f71248h;

    /* renamed from: i */
    private NestedWebScrollView f71249i;

    /* renamed from: j */
    private boolean f71250j = true;

    /* renamed from: q */
    public SearchStateViewModel f71251q;

    /* renamed from: r */
    protected SearchInterSecondFloorViewHolder f71252r;

    /* renamed from: t */
    private final C0053p<C26568a<List<HotSearchItem>>> f71253t = new C26987c(this);

    /* renamed from: u */
    private final C0053p<C26568a<TypeWords>> f71254u = new C26986b(this);

    /* renamed from: v */
    private final C0053p<C23073b<String, Object>> f71255v = new C26988d(this);

    /* renamed from: w */
    private HashMap f71256w;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SingleIntermediateFragment$a */
    public static final class C26985a {
        private C26985a() {
        }

        public /* synthetic */ C26985a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SingleIntermediateFragment$b */
    static final class C26986b<T> implements C0053p<C26568a<TypeWords>> {

        /* renamed from: a */
        final /* synthetic */ SingleIntermediateFragment f71257a;

        C26986b(SingleIntermediateFragment singleIntermediateFragment) {
            this.f71257a = singleIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C26568a<TypeWords> aVar) {
            if (C26654b.m87573a() || aVar == null) {
                return;
            }
            if (aVar.f70088a) {
                TypeWords typeWords = (TypeWords) aVar.f70089b;
                if (typeWords == null) {
                    C7573i.m23580a();
                }
                List<Word> list = typeWords.words;
                if (list != null && list.size() < 3) {
                    list = null;
                }
                this.f71257a.mo69721o().mo68078b(list);
                return;
            }
            this.f71257a.mo69721o().mo68078b(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SingleIntermediateFragment$c */
    static final class C26987c<T> implements C0053p<C26568a<List<? extends HotSearchItem>>> {

        /* renamed from: a */
        final /* synthetic */ SingleIntermediateFragment f71258a;

        C26987c(SingleIntermediateFragment singleIntermediateFragment) {
            this.f71258a = singleIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C26568a<List<HotSearchItem>> aVar) {
            if (aVar != null) {
                if (aVar.f70088a) {
                    this.f71258a.mo69721o().mo68073a((List) aVar.f70089b);
                    return;
                }
                if (this.f71258a.isViewValid()) {
                    Context context = this.f71258a.getContext();
                    Context context2 = this.f71258a.getContext();
                    if (context2 == null) {
                        C7573i.m23580a();
                    }
                    C10761a.m31403c(context, context2.getString(R.string.c61)).mo25750a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SingleIntermediateFragment$d */
    static final class C26988d<T> implements C0053p<C23073b<String, Object>> {

        /* renamed from: a */
        final /* synthetic */ SingleIntermediateFragment f71259a;

        C26988d(SingleIntermediateFragment singleIntermediateFragment) {
            this.f71259a = singleIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C23073b<String, Object> bVar) {
            C0052o<C23073b<String, Object>> oVar = SingleIntermediateFragment.m88715a(this.f71259a).hotSearchLiveData;
            C7573i.m23582a((Object) oVar, "mSearchStateViewModel.hotSearchLiveData");
            oVar.setValue(bVar);
        }
    }

    /* renamed from: f */
    public void mo69551f() {
        if (this.f71256w != null) {
            this.f71256w.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69551f();
    }

    /* renamed from: e */
    public void mo69550e() {
        super.mo69550e();
        if (!C26654b.m87576d()) {
            mo69577g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final SearchInterSecondFloorViewHolder mo69777u() {
        SearchInterSecondFloorViewHolder searchInterSecondFloorViewHolder = this.f71252r;
        if (searchInterSecondFloorViewHolder == null) {
            C7573i.m23583a("mSearchInterSecondFloorViewHolder");
        }
        return searchInterSecondFloorViewHolder;
    }

    /* renamed from: a */
    public final String mo69547a() {
        return C26806y.m88004b(mo69549d());
    }

    /* renamed from: d */
    public final int mo69549d() {
        Integer num = (Integer) mo69723p().getSearchTabIndex().getValue();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: q */
    public final void mo69724q() {
        super.mo69724q();
        mo69721o().mo68071a((C27013b) this);
        mo69721o().mo68070a((C27012a) this);
    }

    /* renamed from: s */
    public final boolean mo69726s() {
        Integer num = (Integer) mo69723p().getIntermediateState().getValue();
        if (num == null) {
            return false;
        }
        if (num.intValue() == 2 || num.intValue() == 0) {
            NestedWebScrollView nestedWebScrollView = this.f71249i;
            if (nestedWebScrollView != null && nestedWebScrollView.getVisibility() == 0) {
                NestedWebScrollView nestedWebScrollView2 = this.f71249i;
                if (nestedWebScrollView2 != null) {
                    nestedWebScrollView2.setVisibility(4);
                }
            }
        }
        return super.mo69726s();
    }

    /* renamed from: g */
    private final void mo69577g() {
        if (!C26654b.m87573a()) {
            SearchSquareAdapter o = mo69721o();
            if (this.f71250j) {
                if (C26654b.m87578f()) {
                    o.mo68078b(GuessWordsViewHolder.f69487h);
                } else if (C26654b.m87581i()) {
                    o.mo68073a(HotSearchWordViewHolder.f69515g);
                }
            }
            this.f71250j = false;
            o.mo68076a(true);
        }
        if (C26654b.m87578f()) {
            GuessWordsViewModel guessWordsViewModel = this.f71246f;
            if (guessWordsViewModel == null) {
                C7573i.m23583a("mGuessWordsViewModel");
            }
            guessWordsViewModel.mo69984a(C27244a.m89253b(getActivity()));
            return;
        }
        if (C26654b.m87581i()) {
            HotSearchViewModel hotSearchViewModel = this.f71245e;
            if (hotSearchViewModel == null) {
                C7573i.m23583a("mHotSearchViewModel");
            }
            hotSearchViewModel.mo69986a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo69727t() {
        NestedWebScrollView nestedWebScrollView = this.f71249i;
        if (nestedWebScrollView != null) {
            nestedWebScrollView.setVisibility(0);
        }
        super.mo69727t();
        ViewGroup viewGroup = this.f71248h;
        if (viewGroup == null) {
            C7573i.m23583a("mRNFragment");
        }
        if (viewGroup.getChildCount() <= 1 && this.f71249i != null) {
            ViewGroup viewGroup2 = this.f71248h;
            if (viewGroup2 == null) {
                C7573i.m23583a("mRNFragment");
            }
            this.f71252r = C26873a.m88181a(viewGroup2, this, this);
            ViewGroup viewGroup3 = this.f71248h;
            if (viewGroup3 == null) {
                C7573i.m23583a("mRNFragment");
            }
            SearchInterSecondFloorViewHolder searchInterSecondFloorViewHolder = this.f71252r;
            if (searchInterSecondFloorViewHolder == null) {
                C7573i.m23583a("mSearchInterSecondFloorViewHolder");
            }
            viewGroup3.addView(searchInterSecondFloorViewHolder.itemView, 0, new LayoutParams(-1, -2));
        }
    }

    /* renamed from: r */
    public final void mo69725r() {
        super.mo69725r();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C0063u a = C0069x.m159a(activity).mo147a(SearchStateViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f71251q = (SearchStateViewModel) a;
        C0063u a2 = C0069x.m157a((Fragment) this).mo147a(HotSearchViewModel.class);
        HotSearchViewModel hotSearchViewModel = (HotSearchViewModel) a2;
        C0043i iVar = this;
        hotSearchViewModel.f71748a.observe(iVar, this.f71253t);
        hotSearchViewModel.f71749b.observe(iVar, this.f71255v);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(th…archWordBundleObserver) }");
        this.f71245e = hotSearchViewModel;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity2, "activity!!");
        GuessWordsViewModel a3 = C27234a.m89237a(activity2);
        a3.f71742a.observe(iVar, this.f71254u);
        this.f71246f = a3;
        if (C26654b.m87573a()) {
            this.f71247g = C26872a.m88180a(mo69720n(), this);
            HeaderAndFooterWrapper m = mo69719m();
            SearchInterMainViewHolder searchInterMainViewHolder = this.f71247g;
            if (searchInterMainViewHolder == null) {
                C7573i.m23583a("mSearchInterMainViewHolder");
            }
            m.mo68261b(searchInterMainViewHolder.itemView);
        }
        if (!C6399b.m19944t()) {
            this.f71252r = C26873a.m88181a(mo69720n(), this, iVar);
            HeaderAndFooterWrapper m2 = mo69719m();
            SearchInterSecondFloorViewHolder searchInterSecondFloorViewHolder = this.f71252r;
            if (searchInterSecondFloorViewHolder == null) {
                C7573i.m23583a("mSearchInterSecondFloorViewHolder");
            }
            m2.mo68258a(searchInterSecondFloorViewHolder.itemView);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchStateViewModel m88715a(SingleIntermediateFragment singleIntermediateFragment) {
        SearchStateViewModel searchStateViewModel = singleIntermediateFragment.f71251q;
        if (searchStateViewModel == null) {
            C7573i.m23583a("mSearchStateViewModel");
        }
        return searchStateViewModel;
    }

    @C7709l
    public final void onWebViewScrollToTop(C27036bd bdVar) {
        C7573i.m23587b(bdVar, "event");
        NestedWebScrollView nestedWebScrollView = this.f71249i;
        if (nestedWebScrollView != null) {
            nestedWebScrollView.setTop(true);
        }
    }

    public void handleGuessWordItemClick(Word word, int i) {
        C7573i.m23587b(word, "word");
        mo69723p().handleGuessWordItemClick(word, i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView == null) {
            C7573i.m23580a();
        }
        View findViewById = onCreateView.findViewById(R.id.cvg);
        C7573i.m23582a((Object) findViewById, "view!!.findViewById(R.id.rn_fragment)");
        this.f71248h = (ViewGroup) findViewById;
        this.f71249i = (NestedWebScrollView) onCreateView.findViewById(R.id.cve);
        return onCreateView;
    }

    /* renamed from: a */
    public final void mo68315a(HotSearchItem hotSearchItem, int i, String str) {
        String str2;
        C7573i.m23587b(hotSearchItem, "item");
        C7573i.m23587b(str, "enterFrom");
        SearchResultParam keyword = new SearchResultParam().setKeyword(hotSearchItem.getWord());
        HotSearchAdData adData = hotSearchItem.getAdData();
        if (adData != null) {
            str2 = adData.getItemIdList();
        } else {
            str2 = null;
        }
        SearchResultParam openNewSearchContainer = keyword.setItemIdList(str2).setRealSearchWord(hotSearchItem.getRealSearchWord()).setAd(hotSearchItem.isAd()).setSearchFrom(2).setEnterFrom(str).setSource("hot_search_section").setOpenNewSearchContainer(!C6399b.m19944t());
        if (C37380c.m119976c() != 0 || !C26654b.m87575c()) {
            C7573i.m23582a((Object) openNewSearchContainer, "param");
            mo69715a(openNewSearchContainer);
            return;
        }
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) openNewSearchContainer, "param");
        C26686a.m87665a(context, openNewSearchContainer);
    }
}
