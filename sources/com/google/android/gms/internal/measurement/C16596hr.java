package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hr */
public class C16596hr {

    /* renamed from: a */
    private static final C16565gt f46431a = C16565gt.m54081a();

    /* renamed from: b */
    private zzte f46432b;

    /* renamed from: c */
    private volatile C16615ij f46433c;

    /* renamed from: d */
    private volatile zzte f46434d;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16596hr)) {
            return false;
        }
        C16596hr hrVar = (C16596hr) obj;
        C16615ij ijVar = this.f46433c;
        C16615ij ijVar2 = hrVar.f46433c;
        if (ijVar == null && ijVar2 == null) {
            return mo42962c().equals(hrVar.mo42962c());
        }
        if (ijVar != null && ijVar2 != null) {
            return ijVar.equals(ijVar2);
        }
        if (ijVar != null) {
            return ijVar.equals(hrVar.m54199b(ijVar.mo42937l()));
        }
        return m54199b(ijVar2.mo42937l()).equals(ijVar2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.C16615ij m54199b(com.google.android.gms.internal.measurement.C16615ij r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.ij r0 = r1.f46433c
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.ij r0 = r1.f46433c     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f46433c = r2     // Catch:{ zzuv -> 0x0012 }
            com.google.android.gms.internal.measurement.zzte r0 = com.google.android.gms.internal.measurement.zzte.zzbtq     // Catch:{ zzuv -> 0x0012 }
            r1.f46434d = r0     // Catch:{ zzuv -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f46433c = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzte r2 = com.google.android.gms.internal.measurement.zzte.zzbtq     // Catch:{ all -> 0x001a }
            r1.f46434d = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.ij r2 = r1.f46433c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16596hr.m54199b(com.google.android.gms.internal.measurement.ij):com.google.android.gms.internal.measurement.ij");
    }

    /* renamed from: a */
    public final C16615ij mo42960a(C16615ij ijVar) {
        C16615ij ijVar2 = this.f46433c;
        this.f46432b = null;
        this.f46434d = null;
        this.f46433c = ijVar;
        return ijVar2;
    }

    /* renamed from: b */
    public final int mo42961b() {
        if (this.f46434d != null) {
            return this.f46434d.size();
        }
        if (this.f46433c != null) {
            return this.f46433c.mo42933h();
        }
        return 0;
    }

    /* renamed from: c */
    public final zzte mo42962c() {
        if (this.f46434d != null) {
            return this.f46434d;
        }
        synchronized (this) {
            if (this.f46434d != null) {
                zzte zzte = this.f46434d;
                return zzte;
            }
            if (this.f46433c == null) {
                this.f46434d = zzte.zzbtq;
            } else {
                this.f46434d = this.f46433c.mo42726d();
            }
            zzte zzte2 = this.f46434d;
            return zzte2;
        }
    }
}
