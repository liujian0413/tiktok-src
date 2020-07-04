package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class bgu extends bhq {

    /* renamed from: A */
    private int f41938A;

    /* renamed from: B */
    private boolean f41939B;

    /* renamed from: C */
    private boolean f41940C;

    /* renamed from: D */
    private boolean f41941D;

    /* renamed from: E */
    private boolean f41942E;

    /* renamed from: F */
    private long f41943F;

    /* renamed from: a */
    public final bge f41944a;

    /* renamed from: b */
    protected final Handler f41945b;

    /* renamed from: c */
    public int f41946c;

    /* renamed from: e */
    private final bhy f41947e;

    /* renamed from: f */
    private final boolean f41948f;

    /* renamed from: g */
    private final bho f41949g;

    /* renamed from: h */
    private final bhn f41950h;

    /* renamed from: i */
    private final bhm f41951i;

    /* renamed from: j */
    private final List<Long> f41952j;

    /* renamed from: k */
    private final BufferInfo f41953k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final bgy f41954l;

    /* renamed from: m */
    private bhl f41955m;

    /* renamed from: n */
    private bhv f41956n;

    /* renamed from: o */
    private MediaCodec f41957o;

    /* renamed from: p */
    private boolean f41958p;

    /* renamed from: q */
    private ByteBuffer[] f41959q;

    /* renamed from: r */
    private ByteBuffer[] f41960r;

    /* renamed from: s */
    private long f41961s;

    /* renamed from: t */
    private int f41962t;

    /* renamed from: u */
    private int f41963u;

    /* renamed from: v */
    private boolean f41964v;

    /* renamed from: w */
    private boolean f41965w;

    /* renamed from: x */
    private int f41966x;

    /* renamed from: y */
    private int f41967y;

    /* renamed from: z */
    private boolean f41968z;

    public bgu(bho bho, bhy bhy, boolean z, Handler handler, bgy bgy) {
        bke.m49060b(bkn.f42386a >= 16);
        this.f41949g = bho;
        this.f41947e = null;
        this.f41948f = true;
        this.f41945b = handler;
        this.f41954l = bgy;
        this.f41944a = new bge();
        this.f41950h = new bhn(0);
        this.f41951i = new bhm();
        this.f41952j = new ArrayList();
        this.f41953k = new BufferInfo();
        this.f41966x = 0;
        this.f41967y = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40652a(bhl bhl, MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo40654a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) throws zzgc;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40666a(MediaCodec mediaCodec, boolean z, bhl bhl, bhl bhl2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40655a(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40656b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40657c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo40667b(long j) throws zzgc {
        try {
            if (!this.f41949g.mo40638a(j)) {
                return 0;
            }
            for (int i = 0; i < this.f41949g.mo40634a(); i++) {
                if (mo40655a(this.f41949g.mo40636a(i).f42033a)) {
                    this.f41938A = i;
                    return 1;
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzgc((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40650a(long j, boolean z) {
        this.f41949g.mo40637a(this.f41938A, j);
        this.f41946c = 0;
        this.f41939B = false;
        this.f41940C = false;
        this.f41941D = false;
        this.f41943F = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bgg mo40648a(String str, boolean z) throws zzgy {
        return bgz.m48760a(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40651a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo40668h() throws zzgc {
        MediaCrypto mediaCrypto;
        bgg bgg;
        if (mo40669i()) {
            String str = this.f41955m.f42012a;
            boolean z = false;
            if (this.f41956n == null) {
                mediaCrypto = null;
            } else if (this.f41947e != null) {
                if (!this.f41964v) {
                    this.f41964v = true;
                }
                int a = this.f41947e.mo40724a();
                if (a == 0) {
                    throw new zzgc((Throwable) this.f41947e.mo40727c());
                } else if (a == 3 || a == 4) {
                    mediaCrypto = this.f41947e.mo40726b();
                    z = this.f41947e.mo40725a(str);
                } else {
                    return;
                }
            } else {
                throw new zzgc("Media requires a DrmSessionManager");
            }
            try {
                bgg = mo40648a(str, z);
            } catch (zzgy e) {
                m48729a(new zzgu(this.f41955m, (Throwable) e, -49998));
                bgg = null;
            }
            if (bgg == null) {
                m48729a(new zzgu(this.f41955m, (Throwable) null, -49999));
            }
            String str2 = bgg.f41884a;
            this.f41958p = bgg.f41885b;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f41957o = MediaCodec.createByCodecName(str2);
                mo40651a(this.f41957o, str2, this.f41955m.mo40691b(), mediaCrypto);
                this.f41957o.start();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j = elapsedRealtime2 - elapsedRealtime;
                if (!(this.f41945b == null || this.f41954l == null)) {
                    Handler handler = this.f41945b;
                    bgx bgx = new bgx(this, str2, elapsedRealtime2, j);
                    handler.post(bgx);
                }
                this.f41959q = this.f41957o.getInputBuffers();
                this.f41960r = this.f41957o.getOutputBuffers();
            } catch (Exception e2) {
                m48729a(new zzgu(this.f41955m, (Throwable) e2, str2));
            }
            this.f41961s = this.f42035d == 3 ? SystemClock.elapsedRealtime() : -1;
            this.f41962t = -1;
            this.f41963u = -1;
            this.f41942E = true;
            this.f41944a.f41870a++;
        }
    }

    /* renamed from: a */
    private final void m48729a(zzgu zzgu) throws zzgc {
        if (!(this.f41945b == null || this.f41954l == null)) {
            this.f41945b.post(new bgv(this, zzgu));
        }
        throw new zzgc((Throwable) zzgu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo40669i() {
        return this.f41957o == null && this.f41955m != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo40670j() {
        return this.f41957o != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo40661g() {
        this.f41955m = null;
        this.f41956n = null;
        try {
            mo40671k();
            try {
                if (this.f41964v) {
                    this.f41964v = false;
                }
            } finally {
                this.f41949g.mo40640b(this.f41938A);
            }
        } catch (Throwable th) {
            if (this.f41964v) {
                this.f41964v = false;
            }
            throw th;
        } finally {
            this.f41949g.mo40640b(this.f41938A);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo40671k() {
        if (this.f41957o != null) {
            this.f41961s = -1;
            this.f41962t = -1;
            this.f41963u = -1;
            this.f41941D = false;
            this.f41952j.clear();
            this.f41959q = null;
            this.f41960r = null;
            this.f41965w = false;
            this.f41968z = false;
            this.f41958p = false;
            this.f41966x = 0;
            this.f41967y = 0;
            this.f41944a.f41871b++;
            try {
                this.f41957o.stop();
                try {
                    this.f41957o.release();
                } finally {
                    this.f41957o = null;
                }
            } catch (Throwable th) {
                this.f41957o.release();
                throw th;
            } finally {
                this.f41957o = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo40672l() {
        this.f41949g.mo40642c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo40660f() {
        return this.f41943F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final long mo40673m() {
        return this.f41949g.mo40636a(this.f41938A).f42034b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final long mo40674n() {
        long b = this.f41949g.mo40639b();
        return (b == -1 || b == -3) ? b : Math.max(b, mo40660f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40649a(long j) throws zzgc {
        this.f41943F = j;
        this.f41949g.mo40643c(j);
        this.f41946c = 0;
        this.f41939B = false;
        this.f41940C = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40664a(long j, long j2) throws zzgc {
        boolean z;
        int i;
        try {
            int i2 = this.f41949g.mo40641b(j) ? this.f41946c == 0 ? 1 : this.f41946c : 0;
            this.f41946c = i2;
            if (this.f41957o != null && this.f41949g.mo40635a(this.f41938A, this.f41943F, this.f41951i, this.f41950h, true) == -5) {
                m48731s();
            }
            if (this.f41955m == null && this.f41949g.mo40635a(this.f41938A, this.f41943F, this.f41951i, this.f41950h, false) == -4) {
                mo40665a(this.f41951i);
            }
            if (this.f41957o == null && mo40669i()) {
                mo40668h();
            }
            if (this.f41957o != null) {
                do {
                    if (!this.f41940C) {
                        if (this.f41963u < 0) {
                            this.f41963u = this.f41957o.dequeueOutputBuffer(this.f41953k, 0);
                        }
                        if (this.f41963u == -2) {
                            mo40652a(this.f41955m, this.f41957o.getOutputFormat());
                            this.f41944a.f41872c++;
                        } else if (this.f41963u == -3) {
                            this.f41960r = this.f41957o.getOutputBuffers();
                            this.f41944a.f41873d++;
                        } else if (this.f41963u >= 0) {
                            if ((this.f41953k.flags & 4) == 0) {
                                long j3 = this.f41953k.presentationTimeUs;
                                int size = this.f41952j.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        i = -1;
                                        break;
                                    } else if (((Long) this.f41952j.get(i3)).longValue() == j3) {
                                        i = i3;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (mo40654a(j, j2, this.f41957o, this.f41960r[this.f41963u], this.f41953k, this.f41963u, i != -1)) {
                                    if (i != -1) {
                                        this.f41952j.remove(i);
                                    } else {
                                        this.f41943F = this.f41953k.presentationTimeUs;
                                    }
                                    this.f41963u = -1;
                                }
                            } else if (this.f41967y == 2) {
                                mo40671k();
                                mo40668h();
                            } else {
                                this.f41940C = true;
                            }
                        }
                        z = true;
                        continue;
                    }
                    z = false;
                    continue;
                } while (z);
                if (m48730a(true)) {
                    do {
                    } while (m48730a(false));
                }
            }
        } catch (IOException e) {
            throw new zzgc((Throwable) e);
        }
    }

    /* renamed from: s */
    private final void m48731s() throws zzgc {
        this.f41961s = -1;
        this.f41962t = -1;
        this.f41963u = -1;
        this.f41942E = true;
        this.f41941D = false;
        this.f41952j.clear();
        if (bkn.f42386a < 18 || this.f41967y != 0) {
            mo40671k();
            mo40668h();
        } else {
            this.f41957o.flush();
            this.f41968z = false;
        }
        if (this.f41965w && this.f41955m != null) {
            this.f41966x = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0124 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0125 A[SYNTHETIC, Splitter:B:79:0x0125] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m48730a(boolean r18) throws java.io.IOException, com.google.android.gms.internal.ads.zzgc {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.f41939B
            r2 = 0
            if (r0 != 0) goto L_0x018e
            int r0 = r1.f41967y
            r3 = 2
            if (r0 != r3) goto L_0x000e
            goto L_0x018e
        L_0x000e:
            int r0 = r1.f41962t
            if (r0 >= 0) goto L_0x0032
            android.media.MediaCodec r0 = r1.f41957o
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r1.f41962t = r0
            int r0 = r1.f41962t
            if (r0 >= 0) goto L_0x0021
            return r2
        L_0x0021:
            com.google.android.gms.internal.ads.bhn r0 = r1.f41950h
            java.nio.ByteBuffer[] r4 = r1.f41959q
            int r5 = r1.f41962t
            r4 = r4[r5]
            r0.f42028b = r4
            com.google.android.gms.internal.ads.bhn r0 = r1.f41950h
            java.nio.ByteBuffer r0 = r0.f42028b
            r0.clear()
        L_0x0032:
            int r0 = r1.f41967y
            r4 = -1
            r5 = 1
            if (r0 != r5) goto L_0x0049
            android.media.MediaCodec r6 = r1.f41957o
            int r7 = r1.f41962t
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 4
            r6.queueInputBuffer(r7, r8, r9, r10, r12)
            r1.f41962t = r4
            r1.f41967y = r3
            return r2
        L_0x0049:
            boolean r0 = r1.f41941D
            r6 = -2
            if (r0 == 0) goto L_0x0050
            r0 = -3
            goto L_0x008e
        L_0x0050:
            int r0 = r1.f41966x
            if (r0 != r5) goto L_0x0075
            r0 = 0
        L_0x0055:
            com.google.android.gms.internal.ads.bhl r7 = r1.f41955m
            java.util.List<byte[]> r7 = r7.f42017f
            int r7 = r7.size()
            if (r0 >= r7) goto L_0x0073
            com.google.android.gms.internal.ads.bhl r7 = r1.f41955m
            java.util.List<byte[]> r7 = r7.f42017f
            java.lang.Object r7 = r7.get(r0)
            byte[] r7 = (byte[]) r7
            com.google.android.gms.internal.ads.bhn r8 = r1.f41950h
            java.nio.ByteBuffer r8 = r8.f42028b
            r8.put(r7)
            int r0 = r0 + 1
            goto L_0x0055
        L_0x0073:
            r1.f41966x = r3
        L_0x0075:
            com.google.android.gms.internal.ads.bho r7 = r1.f41949g
            int r8 = r1.f41938A
            long r9 = r1.f41943F
            com.google.android.gms.internal.ads.bhm r11 = r1.f41951i
            com.google.android.gms.internal.ads.bhn r12 = r1.f41950h
            r13 = 0
            int r0 = r7.mo40635a(r8, r9, r11, r12, r13)
            if (r18 == 0) goto L_0x008e
            int r7 = r1.f41946c
            if (r7 != r5) goto L_0x008e
            if (r0 != r6) goto L_0x008e
            r1.f41946c = r3
        L_0x008e:
            if (r0 != r6) goto L_0x0091
            return r2
        L_0x0091:
            r6 = -5
            if (r0 != r6) goto L_0x0098
            r17.m48731s()
            return r5
        L_0x0098:
            r6 = -4
            if (r0 != r6) goto L_0x00ae
            int r0 = r1.f41966x
            if (r0 != r3) goto L_0x00a8
            com.google.android.gms.internal.ads.bhn r0 = r1.f41950h
            java.nio.ByteBuffer r0 = r0.f42028b
            r0.clear()
            r1.f41966x = r5
        L_0x00a8:
            com.google.android.gms.internal.ads.bhm r0 = r1.f41951i
            r1.mo40665a(r0)
            return r5
        L_0x00ae:
            if (r0 != r4) goto L_0x00d8
            int r0 = r1.f41966x
            if (r0 != r3) goto L_0x00bd
            com.google.android.gms.internal.ads.bhn r0 = r1.f41950h
            java.nio.ByteBuffer r0 = r0.f42028b
            r0.clear()
            r1.f41966x = r5
        L_0x00bd:
            r1.f41939B = r5
            android.media.MediaCodec r6 = r1.f41957o     // Catch:{ CryptoException -> 0x00ce }
            int r7 = r1.f41962t     // Catch:{ CryptoException -> 0x00ce }
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 4
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x00ce }
            r1.f41962t = r4     // Catch:{ CryptoException -> 0x00ce }
            return r2
        L_0x00ce:
            r0 = move-exception
            r1.m48728a(r0)
            com.google.android.gms.internal.ads.zzgc r2 = new com.google.android.gms.internal.ads.zzgc
            r2.<init>(r0)
            throw r2
        L_0x00d8:
            boolean r0 = r1.f41942E
            if (r0 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.bhn r0 = r1.f41950h
            boolean r0 = r0.mo40696b()
            if (r0 != 0) goto L_0x00f2
            com.google.android.gms.internal.ads.bhn r0 = r1.f41950h
            java.nio.ByteBuffer r0 = r0.f42028b
            r0.clear()
            int r0 = r1.f41966x
            if (r0 != r3) goto L_0x00f1
            r1.f41966x = r5
        L_0x00f1:
            return r5
        L_0x00f2:
            r1.f41942E = r2
        L_0x00f4:
            com.google.android.gms.internal.ads.bhn r0 = r1.f41950h
            boolean r0 = r0.mo40695a()
            boolean r3 = r1.f41964v
            if (r3 == 0) goto L_0x011d
            com.google.android.gms.internal.ads.bhy r3 = r1.f41947e
            int r3 = r3.mo40724a()
            if (r3 == 0) goto L_0x0111
            r6 = 4
            if (r3 == r6) goto L_0x011d
            if (r0 != 0) goto L_0x010f
            boolean r3 = r1.f41948f
            if (r3 != 0) goto L_0x011d
        L_0x010f:
            r3 = 1
            goto L_0x011e
        L_0x0111:
            com.google.android.gms.internal.ads.zzgc r0 = new com.google.android.gms.internal.ads.zzgc
            com.google.android.gms.internal.ads.bhy r2 = r1.f41947e
            java.lang.Exception r2 = r2.mo40727c()
            r0.<init>(r2)
            throw r0
        L_0x011d:
            r3 = 0
        L_0x011e:
            r1.f41941D = r3
            boolean r3 = r1.f41941D
            if (r3 == 0) goto L_0x0125
            return r2
        L_0x0125:
            com.google.android.gms.internal.ads.bhn r3 = r1.f41950h     // Catch:{ CryptoException -> 0x0184 }
            java.nio.ByteBuffer r3 = r3.f42028b     // Catch:{ CryptoException -> 0x0184 }
            int r9 = r3.position()     // Catch:{ CryptoException -> 0x0184 }
            com.google.android.gms.internal.ads.bhn r3 = r1.f41950h     // Catch:{ CryptoException -> 0x0184 }
            int r3 = r3.f42029c     // Catch:{ CryptoException -> 0x0184 }
            int r3 = r9 - r3
            com.google.android.gms.internal.ads.bhn r6 = r1.f41950h     // Catch:{ CryptoException -> 0x0184 }
            long r14 = r6.f42031e     // Catch:{ CryptoException -> 0x0184 }
            com.google.android.gms.internal.ads.bhn r6 = r1.f41950h     // Catch:{ CryptoException -> 0x0184 }
            int r6 = r6.f42030d     // Catch:{ CryptoException -> 0x0184 }
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0142
            r6 = 1
            goto L_0x0143
        L_0x0142:
            r6 = 0
        L_0x0143:
            if (r6 == 0) goto L_0x014e
            java.util.List<java.lang.Long> r6 = r1.f41952j     // Catch:{ CryptoException -> 0x0184 }
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch:{ CryptoException -> 0x0184 }
            r6.add(r7)     // Catch:{ CryptoException -> 0x0184 }
        L_0x014e:
            if (r0 == 0) goto L_0x0173
            com.google.android.gms.internal.ads.bhn r0 = r1.f41950h     // Catch:{ CryptoException -> 0x0184 }
            com.google.android.gms.internal.ads.bgf r0 = r0.f42027a     // Catch:{ CryptoException -> 0x0184 }
            android.media.MediaCodec$CryptoInfo r13 = r0.f41880d     // Catch:{ CryptoException -> 0x0184 }
            if (r3 != 0) goto L_0x0159
            goto L_0x0168
        L_0x0159:
            int[] r0 = r13.numBytesOfClearData     // Catch:{ CryptoException -> 0x0184 }
            if (r0 != 0) goto L_0x0161
            int[] r0 = new int[r5]     // Catch:{ CryptoException -> 0x0184 }
            r13.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x0184 }
        L_0x0161:
            int[] r0 = r13.numBytesOfClearData     // Catch:{ CryptoException -> 0x0184 }
            r6 = r0[r2]     // Catch:{ CryptoException -> 0x0184 }
            int r6 = r6 + r3
            r0[r2] = r6     // Catch:{ CryptoException -> 0x0184 }
        L_0x0168:
            android.media.MediaCodec r10 = r1.f41957o     // Catch:{ CryptoException -> 0x0184 }
            int r11 = r1.f41962t     // Catch:{ CryptoException -> 0x0184 }
            r12 = 0
            r16 = 0
            r10.queueSecureInputBuffer(r11, r12, r13, r14, r16)     // Catch:{ CryptoException -> 0x0184 }
            goto L_0x017d
        L_0x0173:
            android.media.MediaCodec r6 = r1.f41957o     // Catch:{ CryptoException -> 0x0184 }
            int r7 = r1.f41962t     // Catch:{ CryptoException -> 0x0184 }
            r8 = 0
            r12 = 0
            r10 = r14
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x0184 }
        L_0x017d:
            r1.f41962t = r4     // Catch:{ CryptoException -> 0x0184 }
            r1.f41968z = r5     // Catch:{ CryptoException -> 0x0184 }
            r1.f41966x = r2     // Catch:{ CryptoException -> 0x0184 }
            return r5
        L_0x0184:
            r0 = move-exception
            r1.m48728a(r0)
            com.google.android.gms.internal.ads.zzgc r2 = new com.google.android.gms.internal.ads.zzgc
            r2.<init>(r0)
            throw r2
        L_0x018e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgu.m48730a(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40665a(bhm bhm) throws zzgc {
        bhl bhl = this.f41955m;
        this.f41955m = bhm.f42025a;
        this.f41956n = bhm.f42026b;
        if (this.f41957o != null && mo40666a(this.f41957o, this.f41958p, bhl, this.f41955m)) {
            this.f41965w = true;
            this.f41966x = 1;
        } else if (this.f41968z) {
            this.f41967y = 1;
        } else {
            mo40671k();
            mo40668h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo40658d() {
        return this.f41940C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo40659e() {
        if (this.f41955m != null && !this.f41941D) {
            if (this.f41946c == 0 && this.f41963u < 0) {
                if (SystemClock.elapsedRealtime() < this.f41961s + 1000) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m48728a(CryptoException cryptoException) {
        if (this.f41945b != null && this.f41954l != null) {
            this.f41945b.post(new bgw(this, cryptoException));
        }
    }
}
