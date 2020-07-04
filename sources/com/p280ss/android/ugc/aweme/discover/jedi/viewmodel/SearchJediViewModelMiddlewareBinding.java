package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModelMiddlewareBinding */
public final class SearchJediViewModelMiddlewareBinding implements C11664n<SearchState, SearchJediViewModel> {

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModelMiddlewareBinding$a */
    static final class C26727a extends Lambda implements C7563m<SearchState, ListState<C26754d, C26733e>, SearchState> {

        /* renamed from: a */
        public static final C26727a f70441a = new C26727a();

        C26727a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m87768a((SearchState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static SearchState m87768a(SearchState searchState, ListState<C26754d, C26733e> listState) {
            C7573i.m23587b(searchState, "$receiver");
            C7573i.m23587b(listState, "it");
            return SearchState.copy$default(searchState, listState, null, 2, null);
        }
    }

    public final void binding(SearchJediViewModel searchJediViewModel) {
        C7573i.m23587b(searchJediViewModel, "target");
        bind0(searchJediViewModel);
    }

    private final void bind0(SearchJediViewModel searchJediViewModel) {
        ListMiddleware<SearchState, C26754d, C26733e> listMiddleware = searchJediViewModel.f70431c;
        listMiddleware.mo29186a(C26729a.f70443a, (C7563m<? super S, ? super PROP, ? extends S>) C26727a.f70441a);
        searchJediViewModel.mo29033a(listMiddleware);
    }
}
