package com.p280ss.android.p294e.p869a;

import com.p280ss.android.p294e.p870b.C19538a;

/* renamed from: com.ss.android.e.a.a */
public final class C19537a {

    /* renamed from: a */
    private long f52847a = 2;

    /* renamed from: a */
    private long m64395a(int i) {
        long j = this.f52847a;
        if (i > 5) {
            i = 5;
        }
        if (i == 1) {
            return 60000;
        }
        return ((long) Math.pow((double) j, (double) (i - 1))) * 60 * 1000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo51675b(com.p280ss.android.p294e.p870b.C19538a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            boolean r0 = r6.mo51677b()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "lock "
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r6.mo51682g()     // Catch:{ all -> 0x0044 }
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = " "
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            int r1 = r6.mo51680e()     // Catch:{ all -> 0x0044 }
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = " time for "
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            int r1 = r6.mo51680e()     // Catch:{ all -> 0x0044 }
            long r1 = r5.m64395a(r1)     // Catch:{ all -> 0x0044 }
            r3 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 / r3
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = " min"
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            r0 = 1
            com.p280ss.android.p294e.p871c.C19542b.m64410a(r0, r6)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r5)
            return
        L_0x0044:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p294e.p869a.C19537a.mo51675b(com.ss.android.e.b.a):void");
    }

    /* renamed from: a */
    public final boolean mo51674a(C19538a aVar) {
        if (aVar == null) {
            return false;
        }
        if (!aVar.mo51676a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.mo51682g());
            sb.append(" is available");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - aVar.mo51679d();
        if (currentTimeMillis >= m64395a(aVar.mo51680e())) {
            StringBuilder sb2 = new StringBuilder("unlock ");
            sb2.append(aVar.mo51682g());
            sb2.append(", locked count = ");
            sb2.append(aVar.mo51680e());
            sb2.append(", should lock ");
            sb2.append(m64395a(aVar.mo51680e()) / 60000);
            sb2.append(" min, already locked ");
            sb2.append(currentTimeMillis / 60000);
            sb2.append(" min");
            aVar.mo51678c();
            return true;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(aVar.mo51682g());
        sb3.append(" is locked, locked count = ");
        sb3.append(aVar.mo51680e());
        sb3.append(", should lock ");
        sb3.append(m64395a(aVar.mo51680e()) / 60000);
        sb3.append(" min, already locked ");
        sb3.append(currentTimeMillis / 60000);
        sb3.append(" min");
        return false;
    }
}
