package com.twitter.sdk.android.core;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: com.twitter.sdk.android.core.o */
public final class C46966o {

    /* renamed from: a */
    final Context f120499a;

    /* renamed from: b */
    final C46828g f120500b;

    /* renamed from: c */
    final TwitterAuthConfig f120501c;

    /* renamed from: d */
    final ExecutorService f120502d;

    /* renamed from: e */
    final Boolean f120503e;

    /* renamed from: com.twitter.sdk.android.core.o$a */
    public static class C46968a {

        /* renamed from: a */
        private final Context f120504a;

        /* renamed from: b */
        private C46828g f120505b;

        /* renamed from: c */
        private TwitterAuthConfig f120506c;

        /* renamed from: d */
        private ExecutorService f120507d;

        /* renamed from: e */
        private Boolean f120508e;

        /* renamed from: a */
        public final C46966o mo118102a() {
            C46966o oVar = new C46966o(this.f120504a, this.f120505b, this.f120506c, this.f120507d, this.f120508e);
            return oVar;
        }

        /* renamed from: a */
        public final C46968a mo118100a(TwitterAuthConfig twitterAuthConfig) {
            this.f120506c = twitterAuthConfig;
            return this;
        }

        /* renamed from: a */
        public final C46968a mo118101a(boolean z) {
            this.f120508e = Boolean.valueOf(z);
            return this;
        }

        public C46968a(Context context) {
            if (context != null) {
                this.f120504a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    private C46966o(Context context, C46828g gVar, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bool) {
        this.f120499a = context;
        this.f120500b = gVar;
        this.f120501c = twitterAuthConfig;
        this.f120502d = executorService;
        this.f120503e = bool;
    }
}
