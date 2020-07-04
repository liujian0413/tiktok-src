package com.p280ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.favorites.adapter.C27733b;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$2 */
public final class PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$2 extends Lambda implements C7562b<PoiCollectListState, C7492s<Pair<? extends List<? extends C27733b>, ? extends C11583n>>> {
    final /* synthetic */ C7562b $loadMore;

    public PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$2(C7562b bVar) {
        this.$loadMore = bVar;
        super(1);
    }

    public final C7492s<Pair<List<C27733b>, C11583n>> invoke(PoiCollectListState poiCollectListState) {
        C7573i.m23587b(poiCollectListState, "state");
        return ((C7319aa) this.$loadMore.invoke(poiCollectListState)).mo19136b();
    }
}
