package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

final class bgn implements Callback {

    /* renamed from: a */
    private final Handler f41894a;

    /* renamed from: b */
    private final HandlerThread f41895b;

    /* renamed from: c */
    private final Handler f41896c;

    /* renamed from: d */
    private final bgp f41897d;

    /* renamed from: e */
    private final boolean[] f41898e;

    /* renamed from: f */
    private final long f41899f = 2500000;

    /* renamed from: g */
    private final long f41900g = 5000000;

    /* renamed from: h */
    private final List<bhq> f41901h;

    /* renamed from: i */
    private bhq[] f41902i;

    /* renamed from: j */
    private bhq f41903j;

    /* renamed from: k */
    private boolean f41904k;

    /* renamed from: l */
    private boolean f41905l;

    /* renamed from: m */
    private boolean f41906m;

    /* renamed from: n */
    private int f41907n;

    /* renamed from: o */
    private int f41908o;

    /* renamed from: p */
    private int f41909p;

    /* renamed from: q */
    private long f41910q;

    /* renamed from: r */
    private volatile long f41911r;

    /* renamed from: s */
    private volatile long f41912s;

    /* renamed from: t */
    private volatile long f41913t;

    public bgn(Handler handler, boolean z, boolean[] zArr, int i, int i2) {
        this.f41896c = handler;
        this.f41905l = z;
        this.f41898e = new boolean[zArr.length];
        for (int i3 = 0; i3 < zArr.length; i3++) {
            this.f41898e[i3] = zArr[i3];
        }
        this.f41907n = 1;
        this.f41911r = -1;
        this.f41913t = -1;
        this.f41897d = new bgp();
        this.f41901h = new ArrayList(zArr.length);
        this.f41895b = new bkl(String.valueOf(getClass().getSimpleName()).concat(":Handler"), -16);
        this.f41895b.start();
        this.f41894a = new Handler(this.f41895b.getLooper(), this);
    }

    /* renamed from: a */
    public final long mo40622a() {
        return this.f41912s / 1000;
    }

    /* renamed from: b */
    public final long mo40628b() {
        if (this.f41913t == -1) {
            return -1;
        }
        return this.f41913t / 1000;
    }

    /* renamed from: c */
    public final long mo40630c() {
        if (this.f41911r == -1) {
            return -1;
        }
        return this.f41911r / 1000;
    }

    /* renamed from: a */
    public final void mo40627a(bhq... bhqArr) {
        this.f41894a.obtainMessage(1, bhqArr).sendToTarget();
    }

    /* renamed from: a */
    public final void mo40626a(boolean z) {
        this.f41894a.obtainMessage(3, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a */
    public final void mo40624a(long j) {
        this.f41894a.obtainMessage(6, Long.valueOf(j)).sendToTarget();
    }

    /* renamed from: d */
    public final void mo40631d() {
        this.f41894a.sendEmptyMessage(4);
    }

    /* renamed from: a */
    public final void mo40623a(int i, boolean z) {
        this.f41894a.obtainMessage(8, 0, z ? 1 : 0).sendToTarget();
    }

    /* renamed from: a */
    public final void mo40625a(bgi bgi, int i, Object obj) {
        this.f41908o++;
        this.f41894a.obtainMessage(9, 1, 0, Pair.create(bgi, obj)).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|22|19|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x001e, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0026 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40629b(com.google.android.gms.internal.ads.bgi r4, int r5, java.lang.Object r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f41904k     // Catch:{ all -> 0x0030 }
            if (r5 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            int r5 = r3.f41908o     // Catch:{ all -> 0x0030 }
            int r0 = r5 + 1
            r3.f41908o = r0     // Catch:{ all -> 0x0030 }
            android.os.Handler r0 = r3.f41894a     // Catch:{ all -> 0x0030 }
            r1 = 9
            r2 = 0
            android.util.Pair r4 = android.util.Pair.create(r4, r6)     // Catch:{ all -> 0x0030 }
            r6 = 1
            android.os.Message r4 = r0.obtainMessage(r1, r6, r2, r4)     // Catch:{ all -> 0x0030 }
            r4.sendToTarget()     // Catch:{ all -> 0x0030 }
        L_0x001e:
            int r4 = r3.f41909p     // Catch:{ all -> 0x0030 }
            if (r4 > r5) goto L_0x002e
            r3.wait()     // Catch:{ InterruptedException -> 0x0026 }
            goto L_0x001e
        L_0x0026:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0030 }
            r4.interrupt()     // Catch:{ all -> 0x0030 }
            goto L_0x001e
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgn.mo40629b(com.google.android.gms.internal.ads.bgi, int, java.lang.Object):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40632e() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f41904k     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f41894a     // Catch:{ all -> 0x0024 }
            r1 = 5
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f41904k     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f41895b     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgn.mo40632e():void");
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        try {
            switch (message2.what) {
                case 1:
                    bhq[] bhqArr = (bhq[]) message2.obj;
                    m48681j();
                    this.f41902i = bhqArr;
                    for (int i = 0; i < bhqArr.length; i++) {
                        if (bhqArr[i].mo40653a()) {
                            bke.m49060b(this.f41903j == null);
                            this.f41903j = bhqArr[i];
                        }
                    }
                    m48673a(2);
                    this.f41894a.sendEmptyMessage(2);
                    return true;
                case 2:
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = true;
                    for (int i2 = 0; i2 < this.f41902i.length; i2++) {
                        if (this.f41902i[i2].f42035d == 0 && this.f41902i[i2].mo40698c(this.f41912s) == 0) {
                            z = false;
                        }
                    }
                    if (!z) {
                        m48674a(2, elapsedRealtime, 10);
                    } else {
                        long j = 0;
                        boolean z2 = true;
                        boolean z3 = true;
                        for (int i3 = 0; i3 < this.f41902i.length; i3++) {
                            bhq bhq = this.f41902i[i3];
                            if (this.f41898e[i3] && bhq.f42035d == 1) {
                                bhq.mo40697b(this.f41912s, false);
                                this.f41901h.add(bhq);
                                z2 = z2 && bhq.mo40658d();
                                z3 = z3 && m48675a(bhq);
                                if (j != -1) {
                                    long m = bhq.mo40673m();
                                    if (m == -1) {
                                        j = -1;
                                    } else {
                                        if (m != -2) {
                                            j = Math.max(j, m);
                                        }
                                    }
                                }
                            }
                        }
                        this.f41911r = j;
                        if (z2) {
                            m48673a(5);
                        } else {
                            m48673a(z3 ? 4 : 3);
                            if (this.f41905l && this.f41907n == 4) {
                                m48677f();
                            }
                        }
                        this.f41894a.sendEmptyMessage(7);
                    }
                    return true;
                case 3:
                    boolean z4 = message2.arg1 != 0;
                    this.f41906m = false;
                    this.f41905l = z4;
                    if (!z4) {
                        m48678g();
                        m48679h();
                    } else if (this.f41907n == 4) {
                        m48677f();
                        this.f41894a.sendEmptyMessage(7);
                    } else if (this.f41907n == 3) {
                        this.f41894a.sendEmptyMessage(7);
                    }
                    this.f41896c.obtainMessage(2).sendToTarget();
                    return true;
                case 4:
                    m48680i();
                    return true;
                case 5:
                    m48681j();
                    m48673a(1);
                    synchronized (this) {
                        this.f41904k = true;
                        notifyAll();
                    }
                    return true;
                case 6:
                    long longValue = ((Long) message2.obj).longValue();
                    this.f41906m = false;
                    this.f41912s = longValue * 1000;
                    this.f41897d.mo40646b();
                    this.f41897d.mo40645a(this.f41912s);
                    if (this.f41907n != 1) {
                        if (this.f41907n != 2) {
                            for (int i4 = 0; i4 < this.f41901h.size(); i4++) {
                                bhq bhq2 = (bhq) this.f41901h.get(i4);
                                m48676b(bhq2);
                                bhq2.mo40649a(this.f41912s);
                            }
                            m48673a(3);
                            this.f41894a.sendEmptyMessage(7);
                        }
                    }
                    return true;
                case 7:
                    bkm.m49082a("doSomeWork");
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = this.f41911r != -1 ? this.f41911r : Long.MAX_VALUE;
                    m48679h();
                    long j3 = j2;
                    boolean z5 = true;
                    boolean z6 = true;
                    for (int i5 = 0; i5 < this.f41901h.size(); i5++) {
                        bhq bhq3 = (bhq) this.f41901h.get(i5);
                        bhq3.mo40664a(this.f41912s, this.f41910q);
                        z5 = z5 && bhq3.mo40658d();
                        z6 = z6 && m48675a(bhq3);
                        if (j3 != -1) {
                            long m2 = bhq3.mo40673m();
                            long n = bhq3.mo40674n();
                            if (n == -1) {
                                j3 = -1;
                            } else if (n != -3 && (m2 == -1 || m2 == -2 || n < m2)) {
                                j3 = Math.min(j3, n);
                            }
                        }
                    }
                    this.f41913t = j3;
                    if (z5) {
                        m48673a(5);
                        m48678g();
                    } else if (this.f41907n == 3 && z6) {
                        m48673a(4);
                        if (this.f41905l) {
                            m48677f();
                        }
                    } else if (this.f41907n == 4 && !z6) {
                        this.f41906m = this.f41905l;
                        m48673a(3);
                        m48678g();
                    }
                    this.f41894a.removeMessages(7);
                    if ((this.f41905l && this.f41907n == 4) || this.f41907n == 3) {
                        m48674a(7, elapsedRealtime2, 10);
                    } else if (!this.f41901h.isEmpty()) {
                        m48674a(7, elapsedRealtime2, 1000);
                    }
                    bkm.m49081a();
                    return true;
                case 8:
                    int i6 = message2.arg1;
                    boolean z7 = message2.arg2 != 0;
                    if (this.f41898e[i6] != z7) {
                        this.f41898e[i6] = z7;
                        if (this.f41907n != 1) {
                            if (this.f41907n != 2) {
                                bhq bhq4 = this.f41902i[i6];
                                int i7 = bhq4.f42035d;
                                if (i7 == 1 || i7 == 2 || i7 == 3) {
                                    if (z7) {
                                        boolean z8 = this.f41905l && this.f41907n == 4;
                                        bhq4.mo40697b(this.f41912s, z8);
                                        this.f41901h.add(bhq4);
                                        if (z8) {
                                            bhq4.mo40699o();
                                        }
                                        this.f41894a.sendEmptyMessage(7);
                                    } else {
                                        if (bhq4 == this.f41903j) {
                                            this.f41897d.mo40645a(bhq4.mo40660f());
                                        }
                                        m48676b(bhq4);
                                        this.f41901h.remove(bhq4);
                                        bhq4.mo40701q();
                                    }
                                }
                            }
                        }
                    }
                    return true;
                case 9:
                    int i8 = message2.arg1;
                    Pair pair = (Pair) message2.obj;
                    ((bgi) pair.first).mo40619a(i8, pair.second);
                    synchronized (this) {
                        this.f41909p++;
                        notifyAll();
                    }
                    if (!(this.f41907n == 1 || this.f41907n == 2)) {
                        this.f41894a.sendEmptyMessage(7);
                    }
                    return true;
                default:
                    return false;
            }
        } catch (zzgc e) {
            this.f41896c.obtainMessage(3, e).sendToTarget();
            m48680i();
            return true;
        } catch (RuntimeException e2) {
            this.f41896c.obtainMessage(3, new zzgc(e2, true)).sendToTarget();
            m48680i();
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                this.f41909p++;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: a */
    private final void m48673a(int i) {
        if (this.f41907n != i) {
            this.f41907n = i;
            this.f41896c.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: a */
    private final boolean m48675a(bhq bhq) {
        if (bhq.mo40658d()) {
            return true;
        }
        if (!bhq.mo40659e()) {
            return false;
        }
        if (this.f41907n == 4) {
            return true;
        }
        long m = bhq.mo40673m();
        long n = bhq.mo40674n();
        long j = this.f41906m ? this.f41900g : this.f41899f;
        if (j <= 0 || n == -1 || n == -3 || n >= this.f41912s + j || (m != -1 && m != -2 && n >= m)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final void m48677f() throws zzgc {
        this.f41906m = false;
        this.f41897d.mo40644a();
        for (int i = 0; i < this.f41901h.size(); i++) {
            ((bhq) this.f41901h.get(i)).mo40699o();
        }
    }

    /* renamed from: g */
    private final void m48678g() throws zzgc {
        this.f41897d.mo40646b();
        for (int i = 0; i < this.f41901h.size(); i++) {
            m48676b((bhq) this.f41901h.get(i));
        }
    }

    /* renamed from: h */
    private final void m48679h() {
        if (this.f41903j == null || !this.f41901h.contains(this.f41903j) || this.f41903j.mo40658d()) {
            this.f41912s = this.f41897d.mo40647c();
        } else {
            this.f41912s = this.f41903j.mo40660f();
            this.f41897d.mo40645a(this.f41912s);
        }
        this.f41910q = SystemClock.elapsedRealtime() * 1000;
    }

    /* renamed from: a */
    private final void m48674a(int i, long j, long j2) {
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f41894a.sendEmptyMessage(i);
        } else {
            this.f41894a.sendEmptyMessageDelayed(i, elapsedRealtime);
        }
    }

    /* renamed from: i */
    private final void m48680i() {
        m48681j();
        m48673a(1);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m48681j() {
        /*
            r4 = this;
            android.os.Handler r0 = r4.f41894a
            r1 = 7
            r0.removeMessages(r1)
            android.os.Handler r0 = r4.f41894a
            r1 = 2
            r0.removeMessages(r1)
            r0 = 0
            r4.f41906m = r0
            com.google.android.gms.internal.ads.bgp r2 = r4.f41897d
            r2.mo40646b()
            com.google.android.gms.internal.ads.bhq[] r2 = r4.f41902i
            if (r2 != 0) goto L_0x0019
            return
        L_0x0019:
            com.google.android.gms.internal.ads.bhq[] r2 = r4.f41902i
            int r2 = r2.length
            if (r0 >= r2) goto L_0x0032
            com.google.android.gms.internal.ads.bhq[] r2 = r4.f41902i
            r2 = r2[r0]
            m48676b(r2)     // Catch:{ zzgc | RuntimeException -> 0x002c }
            int r3 = r2.f42035d     // Catch:{ zzgc | RuntimeException -> 0x002c }
            if (r3 != r1) goto L_0x002c
            r2.mo40701q()     // Catch:{ zzgc | RuntimeException -> 0x002c }
        L_0x002c:
            r2.mo40702r()     // Catch:{ zzgc | RuntimeException -> 0x002f }
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x0019
        L_0x0032:
            r0 = 0
            r4.f41902i = r0
            r4.f41903j = r0
            java.util.List<com.google.android.gms.internal.ads.bhq> r0 = r4.f41901h
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgn.m48681j():void");
    }

    /* renamed from: b */
    private static void m48676b(bhq bhq) throws zzgc {
        if (bhq.f42035d == 3) {
            bhq.mo40700p();
        }
    }
}
