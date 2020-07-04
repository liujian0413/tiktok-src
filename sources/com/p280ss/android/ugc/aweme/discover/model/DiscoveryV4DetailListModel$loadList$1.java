package com.p280ss.android.ugc.aweme.discover.model;

import bolts.C1591g;
import bolts.C1592h;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel$loadList$1 */
final class DiscoveryV4DetailListModel$loadList$1<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {
    public static final DiscoveryV4DetailListModel$loadList$1 INSTANCE = new DiscoveryV4DetailListModel$loadList$1();

    DiscoveryV4DetailListModel$loadList$1() {
    }

    public final DiscoveryV4CellDetailResponse then(C1592h<DiscoveryV4CellDetailResponse> hVar) {
        C7573i.m23582a((Object) hVar, "it");
        if (hVar.mo6887c()) {
            return null;
        }
        if (!hVar.mo6889d()) {
            return (DiscoveryV4CellDetailResponse) hVar.mo6890e();
        }
        Exception f = hVar.mo6891f();
        C7573i.m23582a((Object) f, "it.error");
        throw f;
    }
}
