package com.p280ss.optimizer.live.sdk.dns;

import com.p280ss.optimizer.live.sdk.base.C45889d;
import com.p280ss.optimizer.live.sdk.base.model.C45898a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.optimizer.live.sdk.dns.c */
public final class C45913c implements Callable<C45898a> {

    /* renamed from: a */
    private final String f117367a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C45898a call() throws Exception {
        return new C45898a(C45889d.m143985a().f117307b.mo111163a("/video/live/qos/v2/ipSettings", (Object) this.f117367a));
    }

    C45913c(String str) {
        this.f117367a = str;
    }
}
