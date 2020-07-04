package com.p280ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import android.app.Activity;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.AliPayAuth$$Lambda$0 */
final /* synthetic */ class AliPayAuth$$Lambda$0 implements Callable {
    private final AliPayAuth arg$1;
    private final Activity arg$2;
    private final String arg$3;

    AliPayAuth$$Lambda$0(AliPayAuth aliPayAuth, Activity activity, String str) {
        this.arg$1 = aliPayAuth;
        this.arg$2 = activity;
        this.arg$3 = str;
    }

    public final Object call() {
        return this.arg$1.lambda$auth$0$AliPayAuth(this.arg$2, this.arg$3);
    }
}
