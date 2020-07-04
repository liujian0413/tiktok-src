package com.google.android.gms.internal.ads;

final class bim {

    /* renamed from: a */
    private int f42149a = 1000;

    /* renamed from: b */
    private long[] f42150b = new long[this.f42149a];

    /* renamed from: c */
    private int[] f42151c = new int[this.f42149a];

    /* renamed from: d */
    private int[] f42152d = new int[this.f42149a];

    /* renamed from: e */
    private long[] f42153e = new long[this.f42149a];

    /* renamed from: f */
    private byte[][] f42154f = new byte[this.f42149a][];

    /* renamed from: g */
    private int f42155g;

    /* renamed from: h */
    private int f42156h;

    /* renamed from: i */
    private int f42157i;

    /* renamed from: j */
    private int f42158j;

    /* renamed from: a */
    public final void mo40766a() {
        this.f42156h = 0;
        this.f42157i = 0;
        this.f42158j = 0;
        this.f42155g = 0;
    }

    /* renamed from: a */
    public final synchronized boolean mo40768a(bhn bhn, bin bin) {
        if (this.f42155g == 0) {
            return false;
        }
        bhn.f42031e = this.f42153e[this.f42157i];
        bhn.f42029c = this.f42151c[this.f42157i];
        bhn.f42030d = this.f42152d[this.f42157i];
        bin.f42159a = this.f42150b[this.f42157i];
        bin.f42160b = this.f42154f[this.f42157i];
        return true;
    }

    /* renamed from: b */
    public final synchronized long mo40769b() {
        this.f42155g--;
        int i = this.f42157i;
        this.f42157i = i + 1;
        this.f42156h++;
        if (this.f42157i == this.f42149a) {
            this.f42157i = 0;
        }
        if (this.f42155g > 0) {
            return this.f42150b[this.f42157i];
        }
        return ((long) this.f42151c[i]) + this.f42150b[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0069, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo40765a(long r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f42155g     // Catch:{ all -> 0x006a }
            r1 = -1
            if (r0 == 0) goto L_0x0068
            long[] r0 = r9.f42153e     // Catch:{ all -> 0x006a }
            int r3 = r9.f42157i     // Catch:{ all -> 0x006a }
            r3 = r0[r3]     // Catch:{ all -> 0x006a }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0068
        L_0x0012:
            int r0 = r9.f42158j     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0019
            int r0 = r9.f42149a     // Catch:{ all -> 0x006a }
            goto L_0x001b
        L_0x0019:
            int r0 = r9.f42158j     // Catch:{ all -> 0x006a }
        L_0x001b:
            int r0 = r0 + -1
            long[] r3 = r9.f42153e     // Catch:{ all -> 0x006a }
            r4 = r3[r0]     // Catch:{ all -> 0x006a }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            monitor-exit(r9)
            return r1
        L_0x0027:
            r0 = 0
            int r3 = r9.f42157i     // Catch:{ all -> 0x006a }
            r4 = -1
            r0 = -1
            r5 = 0
        L_0x002d:
            int r6 = r9.f42158j     // Catch:{ all -> 0x006a }
            if (r3 == r6) goto L_0x004a
            long[] r6 = r9.f42153e     // Catch:{ all -> 0x006a }
            r7 = r6[r3]     // Catch:{ all -> 0x006a }
            int r6 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x004a
            int[] r6 = r9.f42152d     // Catch:{ all -> 0x006a }
            r6 = r6[r3]     // Catch:{ all -> 0x006a }
            r6 = r6 & 1
            if (r6 == 0) goto L_0x0042
            r0 = r5
        L_0x0042:
            int r3 = r3 + 1
            int r6 = r9.f42149a     // Catch:{ all -> 0x006a }
            int r3 = r3 % r6
            int r5 = r5 + 1
            goto L_0x002d
        L_0x004a:
            if (r0 != r4) goto L_0x004e
            monitor-exit(r9)
            return r1
        L_0x004e:
            int r10 = r9.f42155g     // Catch:{ all -> 0x006a }
            int r10 = r10 - r0
            r9.f42155g = r10     // Catch:{ all -> 0x006a }
            int r10 = r9.f42157i     // Catch:{ all -> 0x006a }
            int r10 = r10 + r0
            int r11 = r9.f42149a     // Catch:{ all -> 0x006a }
            int r10 = r10 % r11
            r9.f42157i = r10     // Catch:{ all -> 0x006a }
            int r10 = r9.f42156h     // Catch:{ all -> 0x006a }
            int r10 = r10 + r0
            r9.f42156h = r10     // Catch:{ all -> 0x006a }
            long[] r10 = r9.f42150b     // Catch:{ all -> 0x006a }
            int r11 = r9.f42157i     // Catch:{ all -> 0x006a }
            r0 = r10[r11]     // Catch:{ all -> 0x006a }
            monitor-exit(r9)
            return r0
        L_0x0068:
            monitor-exit(r9)
            return r1
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bim.mo40765a(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40767a(long r4, int r6, long r7, int r9, byte[] r10) {
        /*
            r3 = this;
            monitor-enter(r3)
            long[] r0 = r3.f42153e     // Catch:{ all -> 0x00a5 }
            int r1 = r3.f42158j     // Catch:{ all -> 0x00a5 }
            r0[r1] = r4     // Catch:{ all -> 0x00a5 }
            long[] r4 = r3.f42150b     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42158j     // Catch:{ all -> 0x00a5 }
            r4[r5] = r7     // Catch:{ all -> 0x00a5 }
            int[] r4 = r3.f42151c     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42158j     // Catch:{ all -> 0x00a5 }
            r4[r5] = r9     // Catch:{ all -> 0x00a5 }
            int[] r4 = r3.f42152d     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42158j     // Catch:{ all -> 0x00a5 }
            r4[r5] = r6     // Catch:{ all -> 0x00a5 }
            byte[][] r4 = r3.f42154f     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42158j     // Catch:{ all -> 0x00a5 }
            r4[r5] = r10     // Catch:{ all -> 0x00a5 }
            int r4 = r3.f42155g     // Catch:{ all -> 0x00a5 }
            int r4 = r4 + 1
            r3.f42155g = r4     // Catch:{ all -> 0x00a5 }
            int r4 = r3.f42155g     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42149a     // Catch:{ all -> 0x00a5 }
            r6 = 0
            if (r4 != r5) goto L_0x0095
            int r4 = r3.f42149a     // Catch:{ all -> 0x00a5 }
            int r4 = r4 + 1000
            long[] r5 = new long[r4]     // Catch:{ all -> 0x00a5 }
            long[] r7 = new long[r4]     // Catch:{ all -> 0x00a5 }
            int[] r8 = new int[r4]     // Catch:{ all -> 0x00a5 }
            int[] r9 = new int[r4]     // Catch:{ all -> 0x00a5 }
            byte[][] r10 = new byte[r4][]     // Catch:{ all -> 0x00a5 }
            int r0 = r3.f42149a     // Catch:{ all -> 0x00a5 }
            int r1 = r3.f42157i     // Catch:{ all -> 0x00a5 }
            int r0 = r0 - r1
            long[] r1 = r3.f42150b     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42157i     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r5, r6, r0)     // Catch:{ all -> 0x00a5 }
            long[] r1 = r3.f42153e     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42157i     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r7, r6, r0)     // Catch:{ all -> 0x00a5 }
            int[] r1 = r3.f42152d     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42157i     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r8, r6, r0)     // Catch:{ all -> 0x00a5 }
            int[] r1 = r3.f42151c     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42157i     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r9, r6, r0)     // Catch:{ all -> 0x00a5 }
            byte[][] r1 = r3.f42154f     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42157i     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r10, r6, r0)     // Catch:{ all -> 0x00a5 }
            int r1 = r3.f42157i     // Catch:{ all -> 0x00a5 }
            long[] r2 = r3.f42150b     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r5, r0, r1)     // Catch:{ all -> 0x00a5 }
            long[] r2 = r3.f42153e     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r7, r0, r1)     // Catch:{ all -> 0x00a5 }
            int[] r2 = r3.f42152d     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r8, r0, r1)     // Catch:{ all -> 0x00a5 }
            int[] r2 = r3.f42151c     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r9, r0, r1)     // Catch:{ all -> 0x00a5 }
            byte[][] r2 = r3.f42154f     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r10, r0, r1)     // Catch:{ all -> 0x00a5 }
            r3.f42150b = r5     // Catch:{ all -> 0x00a5 }
            r3.f42153e = r7     // Catch:{ all -> 0x00a5 }
            r3.f42152d = r8     // Catch:{ all -> 0x00a5 }
            r3.f42151c = r9     // Catch:{ all -> 0x00a5 }
            r3.f42154f = r10     // Catch:{ all -> 0x00a5 }
            r3.f42157i = r6     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42149a     // Catch:{ all -> 0x00a5 }
            r3.f42158j = r5     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42149a     // Catch:{ all -> 0x00a5 }
            r3.f42155g = r5     // Catch:{ all -> 0x00a5 }
            r3.f42149a = r4     // Catch:{ all -> 0x00a5 }
            monitor-exit(r3)
            return
        L_0x0095:
            int r4 = r3.f42158j     // Catch:{ all -> 0x00a5 }
            int r4 = r4 + 1
            r3.f42158j = r4     // Catch:{ all -> 0x00a5 }
            int r4 = r3.f42158j     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42149a     // Catch:{ all -> 0x00a5 }
            if (r4 != r5) goto L_0x00a3
            r3.f42158j = r6     // Catch:{ all -> 0x00a5 }
        L_0x00a3:
            monitor-exit(r3)
            return
        L_0x00a5:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bim.mo40767a(long, int, long, int, byte[]):void");
    }
}
