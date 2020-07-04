package com.p280ss.android.ugc.aweme;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.h */
final /* synthetic */ class C21756h implements Callable {

    /* renamed from: a */
    private final StringBuilder f58266a;

    C21756h(StringBuilder sb) {
        this.f58266a = sb;
    }

    public final Object call() {
        return AccountUserService.lambda$logoutAllBackgroundUser$5$AccountUserService(this.f58266a);
    }
}
