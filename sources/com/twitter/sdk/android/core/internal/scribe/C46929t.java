package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C46869g;
import com.twitter.sdk.android.core.internal.C46875m;
import com.twitter.sdk.android.core.internal.C46891q;
import com.twitter.sdk.android.core.internal.p1846b.C46860a;
import com.twitter.sdk.android.core.internal.scribe.C46931v.C46932a;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.t */
public class C46929t {

    /* renamed from: a */
    final ConcurrentHashMap<Long, C46936z> f120331a = new ConcurrentHashMap<>(2);

    /* renamed from: b */
    private final Context f120332b;

    /* renamed from: c */
    private final ScheduledExecutorService f120333c;

    /* renamed from: d */
    private final C46930u f120334d;

    /* renamed from: e */
    private final C46932a f120335e;

    /* renamed from: f */
    private final TwitterAuthConfig f120336f;

    /* renamed from: g */
    private final C46939k<? extends C46938j<TwitterAuthToken>> f120337g;

    /* renamed from: h */
    private final C46825e f120338h;

    /* renamed from: i */
    private final C46875m f120339i;

    /* renamed from: c */
    private static String m146797c(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_se.tap");
        return sb.toString();
    }

    /* renamed from: d */
    private static String m146798d(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_se_to_send");
        return sb.toString();
    }

    /* renamed from: a */
    private C46936z m146795a(long j) throws IOException {
        if (!this.f120331a.containsKey(Long.valueOf(j))) {
            this.f120331a.putIfAbsent(Long.valueOf(j), m146796b(j));
        }
        return (C46936z) this.f120331a.get(Long.valueOf(j));
    }

    /* renamed from: b */
    private C46936z m146796b(long j) throws IOException {
        C46934x xVar = new C46934x(this.f120332b, this.f120335e, new C46891q(), new C46928s(this.f120332b, new C46860a(this.f120332b).mo117959a(), m146797c(j), m146798d(j)), this.f120334d.f120346g);
        return new C46936z(this.f120332b, m146794a(j, xVar), xVar, this.f120333c);
    }

    /* renamed from: a */
    public final boolean mo118077a(C46931v vVar, long j) {
        try {
            m146795a(j).mo118081a(vVar);
            return true;
        } catch (IOException e) {
            C46869g.m146603a(this.f120332b, "Failed to scribe event", (Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    private C46920o<C46931v> m146794a(long j, C46934x xVar) {
        if (this.f120334d.f120340a) {
            C46869g.m146602a(this.f120332b, "Scribe enabled");
            Context context = this.f120332b;
            ScheduledExecutorService scheduledExecutorService = this.f120333c;
            C46930u uVar = this.f120334d;
            ScribeFilesSender scribeFilesSender = new ScribeFilesSender(this.f120332b, this.f120334d, j, this.f120336f, this.f120337g, this.f120338h, this.f120333c, this.f120339i);
            C46907d dVar = new C46907d(context, scheduledExecutorService, xVar, uVar, scribeFilesSender);
            return dVar;
        }
        C46869g.m146602a(this.f120332b, "Scribe disabled");
        return new C46905b();
    }

    public C46929t(Context context, ScheduledExecutorService scheduledExecutorService, C46930u uVar, C46932a aVar, TwitterAuthConfig twitterAuthConfig, C46939k<? extends C46938j<TwitterAuthToken>> kVar, C46825e eVar, C46875m mVar) {
        this.f120332b = context;
        this.f120333c = scheduledExecutorService;
        this.f120334d = uVar;
        this.f120335e = aVar;
        this.f120336f = twitterAuthConfig;
        this.f120337g = kVar;
        this.f120338h = eVar;
        this.f120339i = mVar;
    }
}
