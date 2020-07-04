package com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$$special$$inlined$SingleListMiddleware$2 */
public final class DiscoverViewModelV3$$special$$inlined$SingleListMiddleware$2 extends Lambda implements C7562b<DiscoverStateV3, C7492s<Pair<? extends List<? extends DiscoveryCellStructV3>, ? extends C11583n>>> {
    final /* synthetic */ C7562b $loadMore;

    public DiscoverViewModelV3$$special$$inlined$SingleListMiddleware$2(C7562b bVar) {
        this.$loadMore = bVar;
        super(1);
    }

    public final C7492s<Pair<List<DiscoveryCellStructV3>, C11583n>> invoke(DiscoverStateV3 discoverStateV3) {
        C7573i.m23587b(discoverStateV3, "state");
        return ((C7319aa) this.$loadMore.invoke(discoverStateV3)).mo19136b();
    }
}
