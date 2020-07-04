package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.d */
public final class C26732d {
    /* renamed from: a */
    public static final void m87774a(SearchMusicViewModel searchMusicViewModel) {
        C7573i.m23587b(searchMusicViewModel, "$this$listLoadMore");
        searchMusicViewModel.f71759c.mo29085c();
    }

    /* renamed from: b */
    public static final void m87777b(SearchMusicViewModel searchMusicViewModel) {
        C7573i.m23587b(searchMusicViewModel, "$this$listRefresh");
        searchMusicViewModel.f71759c.mo29082b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <RECEIVER extends C11501d> void m87775a(SearchMusicViewModel searchMusicViewModel, C11502e<? extends RECEIVER> eVar, C11554a<SearchMusic> aVar, C11557c<SearchMusic, RECEIVER> cVar, C11557c<SearchMusic, RECEIVER> cVar2, C7563m<? super RECEIVER, ? super Boolean, C7581n> mVar) {
        SearchMusicViewModel searchMusicViewModel2 = searchMusicViewModel;
        C7573i.m23587b(searchMusicViewModel, "$this$listSubscribe");
        C11502e<? extends RECEIVER> eVar2 = eVar;
        C7573i.m23587b(eVar2, "subscriber");
        C11554a<SearchMusic> aVar2 = aVar;
        C7573i.m23587b(aVar2, "adapter");
        ListMiddleware.m33938a(searchMusicViewModel2.f71759c, eVar2, aVar2, false, eVar.mo29068c(), cVar, cVar2, mVar, null, null, null, 896, null);
    }
}
