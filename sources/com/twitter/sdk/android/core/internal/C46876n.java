package com.twitter.sdk.android.core.internal;

import android.app.Activity;
import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.internal.C46849a.C46852b;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.n */
public final class C46876n<T extends C46938j> {

    /* renamed from: a */
    protected final C46878a f120197a;

    /* renamed from: b */
    private final C46891q f120198b;

    /* renamed from: c */
    private final C46939k<T> f120199c;

    /* renamed from: d */
    private final ExecutorService f120200d;

    /* renamed from: e */
    private final C46890p f120201e;

    /* renamed from: com.twitter.sdk.android.core.internal.n$a */
    protected static class C46878a {

        /* renamed from: a */
        public boolean f120203a;

        /* renamed from: b */
        public long f120204b;

        /* renamed from: c */
        private final Calendar f120205c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        /* renamed from: b */
        public final synchronized void mo117979b(long j) {
            this.f120203a = false;
            this.f120204b = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            return false;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo117978a(long r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                long r0 = r7.f120204b     // Catch:{ all -> 0x0027 }
                r2 = 0
                long r0 = r8 - r0
                r2 = 21600000(0x1499700, double:1.0671818E-316)
                r4 = 0
                r5 = 1
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L_0x0011
                r0 = 1
                goto L_0x0012
            L_0x0011:
                r0 = 0
            L_0x0012:
                long r1 = r7.f120204b     // Catch:{ all -> 0x0027 }
                boolean r8 = r7.m146630a(r8, r1)     // Catch:{ all -> 0x0027 }
                r8 = r8 ^ r5
                boolean r9 = r7.f120203a     // Catch:{ all -> 0x0027 }
                if (r9 != 0) goto L_0x0025
                if (r0 != 0) goto L_0x0021
                if (r8 == 0) goto L_0x0025
            L_0x0021:
                r7.f120203a = r5     // Catch:{ all -> 0x0027 }
                monitor-exit(r7)
                return r5
            L_0x0025:
                monitor-exit(r7)
                return r4
            L_0x0027:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.internal.C46876n.C46878a.mo117978a(long):boolean");
        }

        /* renamed from: a */
        private boolean m146630a(long j, long j2) {
            this.f120205c.setTimeInMillis(j);
            int i = this.f120205c.get(6);
            int i2 = this.f120205c.get(1);
            this.f120205c.setTimeInMillis(j2);
            int i3 = this.f120205c.get(6);
            int i4 = this.f120205c.get(1);
            if (i == i3 && i2 == i4) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo117977b() {
        for (C46938j a : this.f120199c.mo117916b().values()) {
            this.f120201e.mo118006a(a);
        }
        this.f120197a.mo117979b(this.f120198b.mo117970a());
    }

    /* renamed from: a */
    public final void mo117975a() {
        boolean z;
        C46938j a = this.f120199c.mo117913a();
        long a2 = this.f120198b.mo117970a();
        if (a == null || !this.f120197a.mo117978a(a2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f120200d.submit(new C46879o(this));
        }
    }

    /* renamed from: a */
    public final void mo117976a(C46849a aVar) {
        aVar.mo117949a(new C46852b() {
            /* renamed from: a */
            public final void mo117958a(Activity activity) {
                C46876n.this.mo117975a();
            }
        });
    }

    public C46876n(C46939k<T> kVar, ExecutorService executorService, C46890p<T> pVar) {
        this(kVar, new C46891q(), executorService, new C46878a(), pVar);
    }

    private C46876n(C46939k<T> kVar, C46891q qVar, ExecutorService executorService, C46878a aVar, C46890p pVar) {
        this.f120198b = qVar;
        this.f120199c = kVar;
        this.f120200d = executorService;
        this.f120197a = aVar;
        this.f120201e = pVar;
    }
}
