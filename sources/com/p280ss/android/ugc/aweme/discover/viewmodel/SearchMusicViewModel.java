package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.text.TextUtils;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.p280ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26733e;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26734f;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel */
public final class SearchMusicViewModel extends JediViewModel<SearchMusicListState> {

    /* renamed from: d */
    public static final C27245a f71758d = new C27245a(null);

    /* renamed from: c */
    public final ListMiddleware<SearchMusicListState, SearchMusic, C26733e> f71759c;

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$a */
    public static final class C27245a {
        private C27245a() {
        }

        public /* synthetic */ C27245a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$b */
    static final class C27246b extends Lambda implements C7562b<SearchMusicListState, C7492s<Pair<? extends List<? extends SearchMusic>, ? extends C26733e>>> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicViewModel f71760a;

        C27246b(SearchMusicViewModel searchMusicViewModel) {
            this.f71760a = searchMusicViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<SearchMusic>, C26733e>> invoke(SearchMusicListState searchMusicListState) {
            C7573i.m23587b(searchMusicListState, "state");
            C7492s<Pair<List<SearchMusic>, C26733e>> d = SearchMusicViewModel.m89254a(searchMusicListState.getSearchParam(), ((C26733e) searchMusicListState.getListState().getPayload()).f70445c, 0).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C27246b f71761a;

                {
                    this.f71761a = r1;
                }

                /* access modifiers changed from: private */
                /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
                    if (r2 == null) goto L_0x0016;
                 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public kotlin.Pair<java.util.List<com.p280ss.android.ugc.aweme.discover.model.SearchMusic>, com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26733e> apply(com.p280ss.android.ugc.aweme.discover.model.SearchMusicList r6) {
                    /*
                        r5 = this;
                        java.lang.String r0 = "data"
                        kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                        com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.m89255a(r6)
                        java.util.List<com.ss.android.ugc.aweme.discover.model.SearchMusic> r0 = r6.searchMusicList
                        com.ss.android.ugc.aweme.discover.jedi.viewmodel.e r1 = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.e
                        com.ss.android.ugc.aweme.feed.model.LogPbBean r2 = r6.logPb
                        if (r2 == 0) goto L_0x0016
                        java.lang.String r2 = r2.getImprId()
                        if (r2 != 0) goto L_0x0018
                    L_0x0016:
                        java.lang.String r2 = ""
                    L_0x0018:
                        boolean r3 = r6.hasMore
                        int r4 = r6.cursor
                        com.ss.android.ugc.aweme.discover.model.SearchApiResult r6 = (com.p280ss.android.ugc.aweme.discover.model.SearchApiResult) r6
                        r1.<init>(r2, r3, r4, r6)
                        kotlin.Pair r6 = kotlin.C7579l.m23633a(r0, r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.C27246b.C272471.apply(com.ss.android.ugc.aweme.discover.model.SearchMusicList):kotlin.Pair");
                }
            });
            C7573i.m23582a((Object) d, "searchMusic(state.search…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$c */
    static final class C27248c extends Lambda implements C7562b<SearchMusicListState, C7492s<Pair<? extends List<? extends SearchMusic>, ? extends C26733e>>> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicViewModel f71762a;

        C27248c(SearchMusicViewModel searchMusicViewModel) {
            this.f71762a = searchMusicViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<SearchMusic>, C26733e>> invoke(SearchMusicListState searchMusicListState) {
            C7573i.m23587b(searchMusicListState, "state");
            C7492s<Pair<List<SearchMusic>, C26733e>> d = SearchMusicViewModel.m89254a(searchMusicListState.getSearchParam(), ((C26733e) searchMusicListState.getListState().getPayload()).f70445c, ((C26733e) searchMusicListState.getListState().getPayload()).f31255b).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C27248c f71763a;

                {
                    this.f71763a = r1;
                }

                /* access modifiers changed from: private */
                /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
                    if (r2 == null) goto L_0x0016;
                 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public kotlin.Pair<java.util.List<com.p280ss.android.ugc.aweme.discover.model.SearchMusic>, com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26733e> apply(com.p280ss.android.ugc.aweme.discover.model.SearchMusicList r6) {
                    /*
                        r5 = this;
                        java.lang.String r0 = "data"
                        kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                        com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.m89255a(r6)
                        java.util.List<com.ss.android.ugc.aweme.discover.model.SearchMusic> r0 = r6.searchMusicList
                        com.ss.android.ugc.aweme.discover.jedi.viewmodel.e r1 = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.e
                        com.ss.android.ugc.aweme.feed.model.LogPbBean r2 = r6.logPb
                        if (r2 == 0) goto L_0x0016
                        java.lang.String r2 = r2.getImprId()
                        if (r2 != 0) goto L_0x0018
                    L_0x0016:
                        java.lang.String r2 = ""
                    L_0x0018:
                        boolean r3 = r6.hasMore
                        int r4 = r6.cursor
                        com.ss.android.ugc.aweme.discover.model.SearchApiResult r6 = (com.p280ss.android.ugc.aweme.discover.model.SearchApiResult) r6
                        r1.<init>(r2, r3, r4, r6)
                        kotlin.Pair r6 = kotlin.C7579l.m23633a(r0, r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.C27248c.C272491.apply(com.ss.android.ugc.aweme.discover.model.SearchMusicList):kotlin.Pair");
                }
            });
            C7573i.m23582a((Object) d, "searchMusic(state.search…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$d */
    static final class C27250d extends Lambda implements C7562b<SearchMusicListState, SearchMusicListState> {

        /* renamed from: a */
        final /* synthetic */ C26734f f71764a;

        C27250d(C26734f fVar) {
            this.f71764a = fVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SearchMusicListState invoke(SearchMusicListState searchMusicListState) {
            C7573i.m23587b(searchMusicListState, "$receiver");
            return SearchMusicListState.copy$default(searchMusicListState, null, this.f71764a, 1, null);
        }
    }

    /* renamed from: f */
    private static SearchMusicListState m89256f() {
        return new SearchMusicListState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m89256f();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        new SearchMusicViewModel_MiddlewareBinding().binding(this);
    }

    public SearchMusicViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C27246b(this), new C27248c(this), null, null, 12, null);
        this.f71759c = listMiddleware;
    }

    /* renamed from: a */
    public final void mo69998a(C26734f fVar) {
        C7573i.m23587b(fVar, "param");
        mo29038c(new C27250d(fVar));
    }

    /* renamed from: a */
    public static void m89255a(SearchMusicList searchMusicList) {
        String str;
        if (searchMusicList != null) {
            List<SearchMusic> list = searchMusicList.searchMusicList;
            if (list != null) {
                for (SearchMusic searchMusic : list) {
                    if (!TextUtils.isEmpty(searchMusicList.getRequestId())) {
                        str = searchMusicList.getRequestId();
                    } else {
                        LogPbBean logPbBean = searchMusicList.logPb;
                        if (logPbBean != null) {
                            str = logPbBean.getImprId();
                            if (str != null) {
                            }
                        }
                        str = "";
                    }
                    searchMusic.setRequestId(str);
                }
            }
        }
    }

    /* renamed from: a */
    public static C7492s<SearchMusicList> m89254a(C26734f fVar, String str, int i) {
        C7492s<SearchMusicList> b = SearchApiNew.m87313a(fVar.f70447a, (long) i, 20, fVar.f70448b, fVar.f70450d, str, fVar.f70451e, SearchApiNew.m87311a()).mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "SearchApiNew.searchMusic…scribeOn(Schedulers.io())");
        return b;
    }
}
