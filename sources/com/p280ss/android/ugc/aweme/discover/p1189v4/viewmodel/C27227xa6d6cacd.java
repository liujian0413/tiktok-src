package com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$2 */
public final class C27227xa6d6cacd extends Lambda implements C7562b<DiscoverStateV4, C7492s<Pair<? extends List<? extends DiscoverPlayListStructV4>, ? extends C11583n>>> {
    final /* synthetic */ C7562b $loadMore;

    public C27227xa6d6cacd(C7562b bVar) {
        this.$loadMore = bVar;
        super(1);
    }

    public final C7492s<Pair<List<DiscoverPlayListStructV4>, C11583n>> invoke(DiscoverStateV4 discoverStateV4) {
        C7573i.m23587b(discoverStateV4, "state");
        return ((C7319aa) this.$loadMore.invoke(discoverStateV4)).mo19136b();
    }
}
