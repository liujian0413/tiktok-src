package com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi.DiscoverService;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p280ss.android.ugc.aweme.setting.C7213d;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$$special$$inlined$SingleListMiddleware$1 */
public final class DiscoverViewModelV3$$special$$inlined$SingleListMiddleware$1 extends Lambda implements C7562b<DiscoverStateV3, C7492s<Pair<? extends List<? extends DiscoveryCellStructV3>, ? extends C11583n>>> {
    public DiscoverViewModelV3$$special$$inlined$SingleListMiddleware$1() {
        super(1);
    }

    public final C7492s<Pair<List<DiscoveryCellStructV3>, C11583n>> invoke(DiscoverStateV3 discoverStateV3) {
        C7573i.m23587b(discoverStateV3, "it");
        DiscoverService a = DiscoverApi.m87295a();
        C7573i.m23582a((Object) C7213d.m22500a(), "AbTestManager.getInstance()");
        C7319aa a2 = C7319aa.m22929a((C7496w<? extends T>) a.cellListV3(0, 8, C7213d.m22501aV()).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C27140b.f71562a));
        C7573i.m23582a((Object) a2, "Single.fromObservable(\n …r)\n                    })");
        C7492s<Pair<List<DiscoveryCellStructV3>, C11583n>> b = a2.mo19136b();
        C7573i.m23582a((Object) b, "actualRefresh(it).toObservable()");
        return b;
    }
}
