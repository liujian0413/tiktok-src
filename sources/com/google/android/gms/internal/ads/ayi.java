package com.google.android.gms.internal.ads;

public class ayi {

    /* renamed from: a */
    private static final axi f41224a = axi.m47629a();

    /* renamed from: b */
    private zzcce f41225b;

    /* renamed from: c */
    private volatile aza f41226c;

    /* renamed from: d */
    private volatile zzcce f41227d;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayi)) {
            return false;
        }
        ayi ayi = (ayi) obj;
        aza aza = this.f41226c;
        aza aza2 = ayi.f41226c;
        if (aza == null && aza2 == null) {
            return mo40316c().equals(ayi.mo40316c());
        }
        if (aza != null && aza2 != null) {
            return aza.equals(aza2);
        }
        if (aza != null) {
            return aza.equals(ayi.m47760b(aza.mo40288o()));
        }
        return m47760b(aza2.mo40288o()).equals(aza2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.aza m47760b(com.google.android.gms.internal.ads.aza r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.aza r0 = r1.f41226c
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.aza r0 = r1.f41226c     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f41226c = r2     // Catch:{ zzcdx -> 0x0012 }
            com.google.android.gms.internal.ads.zzcce r0 = com.google.android.gms.internal.ads.zzcce.zzfuo     // Catch:{ zzcdx -> 0x0012 }
            r1.f41227d = r0     // Catch:{ zzcdx -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f41226c = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.ads.zzcce r2 = com.google.android.gms.internal.ads.zzcce.zzfuo     // Catch:{ all -> 0x001a }
            r1.f41227d = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.ads.aza r2 = r1.f41226c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ayi.m47760b(com.google.android.gms.internal.ads.aza):com.google.android.gms.internal.ads.aza");
    }

    /* renamed from: a */
    public final aza mo40314a(aza aza) {
        aza aza2 = this.f41226c;
        this.f41225b = null;
        this.f41227d = null;
        this.f41226c = aza;
        return aza2;
    }

    /* renamed from: b */
    public final int mo40315b() {
        if (this.f41227d != null) {
            return this.f41227d.size();
        }
        if (this.f41226c != null) {
            return this.f41226c.mo40285j();
        }
        return 0;
    }

    /* renamed from: c */
    public final zzcce mo40316c() {
        if (this.f41227d != null) {
            return this.f41227d;
        }
        synchronized (this) {
            if (this.f41227d != null) {
                zzcce zzcce = this.f41227d;
                return zzcce;
            }
            if (this.f41226c == null) {
                this.f41227d = zzcce.zzfuo;
            } else {
                this.f41227d = this.f41226c.mo40081f();
            }
            zzcce zzcce2 = this.f41227d;
            return zzcce2;
        }
    }
}
