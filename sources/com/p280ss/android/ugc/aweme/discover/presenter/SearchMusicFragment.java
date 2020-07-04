package com.p280ss.android.ugc.aweme.discover.presenter;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25694b;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter;
import com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel$SearchStateListener$$CC;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchObserver;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchStateListener;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchOriginalFragment;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchMusicFragment */
public final class SearchMusicFragment extends SearchOriginalFragment<SearchMusic> {

    /* renamed from: H */
    private HashMap f70754H;

    /* renamed from: e */
    private MusicPlayHelper f70755e;

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchMusicFragment$a */
    public static final class C26810a implements C25694b {

        /* renamed from: a */
        final /* synthetic */ SearchMusicFragment f70756a;

        C26810a(SearchMusicFragment searchMusicFragment) {
            this.f70756a = searchMusicFragment;
        }

        /* renamed from: a */
        public final Object mo66583a(int i) {
            List a = this.f70756a.mo69704y().mo62312a();
            if (a == null || i < 0 || i >= a.size()) {
                return null;
            }
            return (SearchMusic) a.get(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchMusicFragment$b */
    static final class C26811b implements SearchStateListener {

        /* renamed from: a */
        final /* synthetic */ SearchMusicFragment f70757a;

        C26811b(SearchMusicFragment searchMusicFragment) {
            this.f70757a = searchMusicFragment;
        }

        public final void onPageHidden() {
            SearchStateViewModel$SearchStateListener$$CC.onPageHidden(this);
        }

        public final void onPageResume() {
            SearchStateViewModel$SearchStateListener$$CC.onPageResume(this);
        }

        public final void onContentVisible(boolean z) {
            if (!z) {
                this.f70757a.mo69472e();
            }
        }
    }

    /* renamed from: a */
    public final View mo68429a(int i) {
        if (this.f70754H == null) {
            this.f70754H = new HashMap();
        }
        View view = (View) this.f70754H.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f70754H.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo68435b_(boolean z) {
        return z;
    }

    /* renamed from: g */
    public final void mo68430g() {
        if (this.f70754H != null) {
            this.f70754H.clear();
        }
    }

    /* renamed from: k */
    public final String mo68437k() {
        return "music";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo68430g();
    }

    public final void onPause() {
        super.onPause();
        mo69472e();
    }

    /* renamed from: e */
    public final void mo69472e() {
        if (this.f70755e != null) {
            MusicPlayHelper musicPlayHelper = this.f70755e;
            if (musicPlayHelper == null) {
                C7573i.m23580a();
            }
            musicPlayHelper.mo68326a();
        }
    }

    public final void ae_() {
        super.ae_();
        C6907h.m21524a("music_search_feedback_show", (Map) C22984d.m75611a().mo59973a("enter_from", "music_search_result").f60753a);
    }

    /* renamed from: m */
    public final void mo68439m() {
        mo69750a((C26827i<?>) new C26837o<Object>());
        C26827i N = mo69749N();
        if (N != null) {
            ((C26837o) N).mo66536a(new C26835n());
            mo69749N().mo66537a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchMusicPresenter");
    }

    /* renamed from: n */
    public final void mo68440n() {
        mo69686a((BaseAdapter<D>) new SearchMusicAdapter<D>(this.f70755e, new C26501r(false), this.f71090i));
        C25692c.m84440a(mo69697r(), new C26810a(this));
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            mo69472e();
        }
    }

    /* renamed from: a */
    public final void mo68433a(String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        BaseAdapter y = mo69704y();
        if (y != null) {
            ((SearchMusicAdapter) y).f69666f = str;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        this.f70755e = (MusicPlayHelper) C0069x.m159a(activity).mo147a(MusicPlayHelper.class);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C7573i.m23580a();
        }
        C0063u a = C0069x.m159a(activity2).mo147a(SearchStateViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) a;
        SearchObserver searchObserver = new SearchObserver();
        searchObserver.setListener(new C26811b(this));
        searchStateViewModel.searchState.observe(this, searchObserver);
        super.onViewCreated(view, bundle);
    }
}
