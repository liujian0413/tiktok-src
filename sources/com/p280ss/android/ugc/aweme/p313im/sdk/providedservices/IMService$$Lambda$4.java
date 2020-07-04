package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$4 */
final /* synthetic */ class IMService$$Lambda$4 implements Callable {
    private final String arg$1;

    IMService$$Lambda$4(String str) {
        this.arg$1 = str;
    }

    public final Object call() {
        return IMService.lambda$addGroupByPassword$5$IMService(this.arg$1);
    }
}
