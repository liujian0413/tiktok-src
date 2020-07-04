package com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$$special$$inlined$SingleListMiddleware$1 */
public final class DiscoverV4ListViewModel$$special$$inlined$SingleListMiddleware$1 extends Lambda implements C7562b<DiscoverV4ListState, C7492s<Pair<? extends List<? extends DiscoverCategoryStructV4>, ? extends C11583n>>> {
    public DiscoverV4ListViewModel$$special$$inlined$SingleListMiddleware$1() {
        super(1);
    }

    public final C7492s<Pair<List<DiscoverCategoryStructV4>, C11583n>> invoke(DiscoverV4ListState discoverV4ListState) {
        C7573i.m23587b(discoverV4ListState, "it");
        C7319aa a = C7319aa.m22929a((C7496w<? extends T>) DiscoverApi.m87295a().categoryListV4(0).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C27209b.f71703a));
        C7573i.m23582a((Object) a, "Single.fromObservable(\n …                       })");
        C7492s<Pair<List<DiscoverCategoryStructV4>, C11583n>> b = a.mo19136b();
        C7573i.m23582a((Object) b, "actualRefresh(it).toObservable()");
        return b;
    }
}
