package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b.C7053a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$1 */
final /* synthetic */ class IMService$$Lambda$1 implements C7053a {
    private final C6892b arg$1;

    IMService$$Lambda$1(C6892b bVar) {
        this.arg$1 = bVar;
    }

    public final void onShare(String str) {
        IMService.lambda$showShareDialog$2$IMService(this.arg$1, str);
    }
}
