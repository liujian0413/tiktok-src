package com.p280ss.android.ugc.aweme.services;

/* renamed from: com.ss.android.ugc.aweme.services.BaseLoginService$$Lambda$0 */
final /* synthetic */ class BaseLoginService$$Lambda$0 implements Runnable {
    private final BaseLoginService arg$1;
    private final boolean arg$2;

    BaseLoginService$$Lambda$0(BaseLoginService baseLoginService, boolean z) {
        this.arg$1 = baseLoginService;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$retryLogin$0$BaseLoginService(this.arg$2);
    }
}
