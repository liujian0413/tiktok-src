package com.p280ss.android.ugc.aweme.friends.model;

import bolts.C1592h;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel$$Lambda$5 */
final /* synthetic */ class ThirdPartyFriendModel$$Lambda$5 implements Callable {
    private final C1592h arg$1;

    private ThirdPartyFriendModel$$Lambda$5(C1592h hVar) {
        this.arg$1 = hVar;
    }

    static Callable get$Lambda(C1592h hVar) {
        return new ThirdPartyFriendModel$$Lambda$5(hVar);
    }

    public final Object call() {
        return this.arg$1.mo6890e();
    }
}
