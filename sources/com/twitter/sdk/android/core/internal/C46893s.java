package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.C46965n;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.internal.scribe.C46898a;
import com.twitter.sdk.android.core.internal.scribe.C46904ad;
import com.twitter.sdk.android.core.internal.scribe.C46908e;
import com.twitter.sdk.android.core.internal.scribe.C46908e.C46909a;
import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;

/* renamed from: com.twitter.sdk.android.core.internal.s */
public final class C46893s implements C46890p<C46972t> {

    /* renamed from: a */
    private final C46894a f120235a = new C46894a();

    /* renamed from: b */
    private final C46898a f120236b = C46904ad.m146705a();

    /* renamed from: com.twitter.sdk.android.core.internal.s$a */
    protected static class C46894a {
        protected C46894a() {
        }

        /* renamed from: a */
        public static AccountService m146679a(C46972t tVar) {
            return new C46965n(tVar).mo118095a();
        }
    }

    /* renamed from: a */
    private void m146676a() {
        if (this.f120236b != null) {
            C46908e a = new C46909a().mo118034a("android").mo118036b("credentials").mo118037c("").mo118038d("").mo118039e("").mo118040f("impression").mo118035a();
            this.f120236b.mo118023a(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo118006a(C46972t tVar) {
        AccountService a = C46894a.m146679a(tVar);
        try {
            m146676a();
            a.verifyCredentials(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false)).mo123282a();
        } catch (IOException | RuntimeException unused) {
        }
    }
}
