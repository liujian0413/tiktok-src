package com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$$special$$inlined$SingleListMiddleware$2 */
public final class DiscoverV4ListViewModel$$special$$inlined$SingleListMiddleware$2 extends Lambda implements C7562b<DiscoverV4ListState, C7492s<Pair<? extends List<? extends DiscoverCategoryStructV4>, ? extends C11583n>>> {
    final /* synthetic */ C7562b $loadMore;

    public DiscoverV4ListViewModel$$special$$inlined$SingleListMiddleware$2(C7562b bVar) {
        this.$loadMore = bVar;
        super(1);
    }

    public final C7492s<Pair<List<DiscoverCategoryStructV4>, C11583n>> invoke(DiscoverV4ListState discoverV4ListState) {
        C7573i.m23587b(discoverV4ListState, "state");
        return ((C7319aa) this.$loadMore.invoke(discoverV4ListState)).mo19136b();
    }
}
