package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding */
public final class SearchMusicViewModel_MiddlewareBinding implements C11664n<SearchMusicListState, SearchMusicViewModel> {

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding$a */
    static final class C26728a extends Lambda implements C7563m<SearchMusicListState, ListState<SearchMusic, C26733e>, SearchMusicListState> {

        /* renamed from: a */
        public static final C26728a f70442a = new C26728a();

        C26728a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m87769a((SearchMusicListState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static SearchMusicListState m87769a(SearchMusicListState searchMusicListState, ListState<SearchMusic, C26733e> listState) {
            C7573i.m23587b(searchMusicListState, "$receiver");
            C7573i.m23587b(listState, "it");
            return SearchMusicListState.copy$default(searchMusicListState, listState, null, 2, null);
        }
    }

    public final void binding(SearchMusicViewModel searchMusicViewModel) {
        C7573i.m23587b(searchMusicViewModel, "target");
        bind_0(searchMusicViewModel);
    }

    private final void bind_0(SearchMusicViewModel searchMusicViewModel) {
        ListMiddleware<SearchMusicListState, SearchMusic, C26733e> listMiddleware = searchMusicViewModel.f71759c;
        listMiddleware.mo29186a(C26731c.f70444a, (C7563m<? super S, ? super PROP, ? extends S>) C26728a.f70442a);
        searchMusicViewModel.mo29033a(listMiddleware);
    }
}
