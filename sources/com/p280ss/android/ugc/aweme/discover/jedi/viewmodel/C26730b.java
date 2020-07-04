package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.b */
public final class C26730b {
    /* renamed from: a */
    public static final void m87770a(SearchJediViewModel searchJediViewModel) {
        C7573i.m23587b(searchJediViewModel, "$this$listLoadMore");
        searchJediViewModel.f70431c.mo29085c();
    }

    /* renamed from: b */
    public static final void m87773b(SearchJediViewModel searchJediViewModel) {
        C7573i.m23587b(searchJediViewModel, "$this$listRefresh");
        searchJediViewModel.f70431c.mo29082b();
    }

    /* renamed from: a */
    public static final <RECEIVER extends C11501d> void m87771a(SearchJediViewModel searchJediViewModel, C11502e<? extends RECEIVER> eVar, C11554a<C26754d> aVar, C11557c<C26754d, RECEIVER> cVar, C11557c<C26754d, RECEIVER> cVar2, C7563m<? super RECEIVER, ? super Boolean, C7581n> mVar) {
        SearchJediViewModel searchJediViewModel2 = searchJediViewModel;
        C7573i.m23587b(searchJediViewModel, "$this$listSubscribe");
        C11502e<? extends RECEIVER> eVar2 = eVar;
        C7573i.m23587b(eVar2, "subscriber");
        C11554a<C26754d> aVar2 = aVar;
        C7573i.m23587b(aVar2, "adapter");
        ListMiddleware.m33938a(searchJediViewModel2.f70431c, eVar2, aVar2, false, eVar.mo29068c(), cVar, cVar2, mVar, null, null, null, 896, null);
    }
}
