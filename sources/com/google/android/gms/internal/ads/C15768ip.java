package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ip */
public final class C15768ip {

    /* renamed from: e */
    private static final Comparator<byte[]> f44514e = new C15793jn();

    /* renamed from: a */
    private final List<byte[]> f44515a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f44516b = new ArrayList(64);

    /* renamed from: c */
    private int f44517c = 0;

    /* renamed from: d */
    private final int f44518d = 4096;

    public C15768ip(int i) {
    }

    /* renamed from: a */
    public final synchronized byte[] mo41661a(int i) {
        for (int i2 = 0; i2 < this.f44516b.size(); i2++) {
            byte[] bArr = (byte[]) this.f44516b.get(i2);
            if (bArr.length >= i) {
                this.f44517c -= bArr.length;
                this.f44516b.remove(i2);
                this.f44515a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41660a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f44518d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f44515a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f44516b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f44514e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f44516b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f44517c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f44517c = r0     // Catch:{ all -> 0x002b }
            r2.m51085a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15768ip.mo41660a(byte[]):void");
    }

    /* renamed from: a */
    private final synchronized void m51085a() {
        while (this.f44517c > this.f44518d) {
            byte[] bArr = (byte[]) this.f44515a.remove(0);
            this.f44516b.remove(bArr);
            this.f44517c -= bArr.length;
        }
    }
}
