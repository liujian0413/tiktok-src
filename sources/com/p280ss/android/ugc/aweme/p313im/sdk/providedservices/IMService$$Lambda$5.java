package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$5 */
final /* synthetic */ class IMService$$Lambda$5 implements C6943d {
    private final SharePackage arg$1;
    private final IMUser arg$2;
    private final String arg$3;
    private final C6892b arg$4;

    IMService$$Lambda$5(SharePackage sharePackage, IMUser iMUser, String str, C6892b bVar) {
        this.arg$1 = sharePackage;
        this.arg$2 = iMUser;
        this.arg$3 = str;
        this.arg$4 = bVar;
    }

    public final void sendMsg() {
        IMService.lambda$null$0$IMService(this.arg$1, this.arg$2, this.arg$3, this.arg$4);
    }
}
