package com.google.android.gms.internal.ads;

import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public final class bmc {

    /* renamed from: A */
    private long f42551A;

    /* renamed from: B */
    private long f42552B;

    /* renamed from: C */
    private boolean f42553C;

    /* renamed from: D */
    private long f42554D;

    /* renamed from: E */
    private Method f42555E;

    /* renamed from: F */
    private int f42556F;

    /* renamed from: G */
    private long f42557G;

    /* renamed from: H */
    private long f42558H;

    /* renamed from: I */
    private int f42559I;

    /* renamed from: J */
    private long f42560J;

    /* renamed from: K */
    private long f42561K;

    /* renamed from: L */
    private int f42562L;

    /* renamed from: M */
    private int f42563M;

    /* renamed from: N */
    private long f42564N;

    /* renamed from: O */
    private long f42565O;

    /* renamed from: P */
    private long f42566P;

    /* renamed from: Q */
    private float f42567Q;

    /* renamed from: R */
    private bls[] f42568R;

    /* renamed from: S */
    private ByteBuffer[] f42569S;

    /* renamed from: T */
    private ByteBuffer f42570T;

    /* renamed from: U */
    private ByteBuffer f42571U;

    /* renamed from: V */
    private byte[] f42572V;

    /* renamed from: W */
    private int f42573W;

    /* renamed from: X */
    private int f42574X;

    /* renamed from: Y */
    private boolean f42575Y;

    /* renamed from: Z */
    private boolean f42576Z;

    /* renamed from: a */
    public bli f42577a;

    /* renamed from: aa */
    private int f42578aa;

    /* renamed from: ab */
    private boolean f42579ab;

    /* renamed from: ac */
    private boolean f42580ac;

    /* renamed from: ad */
    private long f42581ad;

    /* renamed from: b */
    private final blr f42582b;

    /* renamed from: c */
    private final bmi f42583c;

    /* renamed from: d */
    private final bmp f42584d;

    /* renamed from: e */
    private final bls[] f42585e;

    /* renamed from: f */
    private final bmg f42586f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ConditionVariable f42587g = new ConditionVariable(true);

    /* renamed from: h */
    private final long[] f42588h;

    /* renamed from: i */
    private final bme f42589i;

    /* renamed from: j */
    private final LinkedList<bmh> f42590j;

    /* renamed from: k */
    private AudioTrack f42591k;

    /* renamed from: l */
    private int f42592l;

    /* renamed from: m */
    private int f42593m;

    /* renamed from: n */
    private int f42594n;

    /* renamed from: o */
    private int f42595o;

    /* renamed from: p */
    private int f42596p;

    /* renamed from: q */
    private boolean f42597q;

    /* renamed from: r */
    private int f42598r;

    /* renamed from: s */
    private long f42599s;

    /* renamed from: t */
    private bli f42600t;

    /* renamed from: u */
    private long f42601u;

    /* renamed from: v */
    private long f42602v;

    /* renamed from: w */
    private ByteBuffer f42603w;

    /* renamed from: x */
    private int f42604x;

    /* renamed from: y */
    private int f42605y;

    /* renamed from: z */
    private int f42606z;

    public bmc(blr blr, bls[] blsArr, bmg bmg) {
        this.f42586f = bmg;
        if (bsf.f43399a >= 18) {
            try {
                this.f42555E = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (bsf.f43399a >= 19) {
            this.f42589i = new bmf();
        } else {
            this.f42589i = new bme(null);
        }
        this.f42583c = new bmi();
        this.f42584d = new bmp();
        this.f42585e = new bls[(blsArr.length + 3)];
        this.f42585e[0] = new bmn();
        this.f42585e[1] = this.f42583c;
        System.arraycopy(blsArr, 0, this.f42585e, 2, blsArr.length);
        this.f42585e[blsArr.length + 2] = this.f42584d;
        this.f42588h = new long[10];
        this.f42567Q = 1.0f;
        this.f42563M = 0;
        this.f42596p = 3;
        this.f42578aa = 0;
        this.f42577a = bli.f42500a;
        this.f42574X = -1;
        this.f42568R = new bls[0];
        this.f42569S = new ByteBuffer[0];
        this.f42590j = new LinkedList<>();
    }

    /* renamed from: a */
    public final boolean mo40943a(String str) {
        return this.f42582b != null && this.f42582b.mo40912a(m49279b(str));
    }

    /* renamed from: a */
    public final long mo40937a(boolean z) {
        long j;
        long j2;
        long j3;
        if (!(m49286m() && this.f42563M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f42591k.getPlayState() == 3) {
            long c = this.f42589i.mo40959c();
            if (c != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f42552B >= 30000) {
                    this.f42588h[this.f42605y] = c - nanoTime;
                    this.f42605y = (this.f42605y + 1) % 10;
                    if (this.f42606z < 10) {
                        this.f42606z++;
                    }
                    this.f42552B = nanoTime;
                    this.f42551A = 0;
                    for (int i = 0; i < this.f42606z; i++) {
                        this.f42551A += this.f42588h[i] / ((long) this.f42606z);
                    }
                }
                if (!m49289p() && nanoTime - this.f42554D >= 500000) {
                    this.f42553C = this.f42589i.mo40960d();
                    if (this.f42553C) {
                        long e = this.f42589i.mo40961e() / 1000;
                        long f = this.f42589i.mo40962f();
                        if (e < this.f42565O) {
                            this.f42553C = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(f);
                            sb.append(", ");
                            sb.append(e);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(c);
                            this.f42553C = false;
                        } else if (Math.abs(m49280b(f) - c) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(f);
                            sb2.append(", ");
                            sb2.append(e);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(c);
                            this.f42553C = false;
                        }
                    }
                    if (this.f42555E != null && !this.f42597q) {
                        try {
                            this.f42566P = (((long) ((Integer) this.f42555E.invoke(this.f42591k, null)).intValue()) * 1000) - this.f42599s;
                            this.f42566P = Math.max(this.f42566P, 0);
                            if (this.f42566P > 5000000) {
                                this.f42566P = 0;
                            }
                        } catch (Exception unused) {
                            this.f42555E = null;
                        }
                    }
                    this.f42554D = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f42553C) {
            j = m49280b(this.f42589i.mo40962f() + m49282c(nanoTime2 - (this.f42589i.mo40961e() / 1000)));
        } else {
            if (this.f42606z == 0) {
                j3 = this.f42589i.mo40959c();
            } else {
                j3 = nanoTime2 + this.f42551A;
            }
            j = j3;
            if (!z) {
                j -= this.f42566P;
            }
        }
        long j4 = this.f42564N;
        while (!this.f42590j.isEmpty() && j >= ((bmh) this.f42590j.getFirst()).f42624c) {
            bmh bmh = (bmh) this.f42590j.remove();
            this.f42577a = bmh.f42622a;
            this.f42602v = bmh.f42624c;
            this.f42601u = bmh.f42623b - this.f42564N;
        }
        if (this.f42577a.f42501b == 1.0f) {
            j2 = (j + this.f42601u) - this.f42602v;
        } else if (!this.f42590j.isEmpty() || this.f42584d.f42677c < 1024) {
            long j5 = this.f42601u;
            double d = (double) this.f42577a.f42501b;
            double d2 = (double) (j - this.f42602v);
            Double.isNaN(d);
            Double.isNaN(d2);
            j2 = ((long) (d * d2)) + j5;
        } else {
            j2 = bsf.m49936a(j - this.f42602v, this.f42584d.f42676b, this.f42584d.f42677c) + this.f42601u;
        }
        return j4 + j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0140  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40942a(java.lang.String r9, int r10, int r11, int r12, int r13, int[] r14) throws com.google.android.gms.internal.ads.zzmk {
        /*
            r8 = this;
            java.lang.String r13 = "audio/raw"
            boolean r13 = r13.equals(r9)
            r0 = 1
            r13 = r13 ^ r0
            if (r13 == 0) goto L_0x000f
            int r9 = m49279b(r9)
            goto L_0x0010
        L_0x000f:
            r9 = r12
        L_0x0010:
            r1 = 0
            r2 = 2
            if (r13 != 0) goto L_0x004c
            int r12 = com.google.android.gms.internal.ads.bsf.m49943b(r12, r10)
            r8.f42556F = r12
            com.google.android.gms.internal.ads.bmi r12 = r8.f42583c
            r12.f42625b = r14
            com.google.android.gms.internal.ads.bls[] r12 = r8.f42585e
            int r14 = r12.length
            r4 = r9
            r3 = r10
            r9 = 0
            r10 = 0
        L_0x0025:
            if (r9 >= r14) goto L_0x0043
            r5 = r12[r9]
            boolean r6 = r5.mo40918a(r11, r3, r4)     // Catch:{ zzlx -> 0x003c }
            r10 = r10 | r6
            boolean r6 = r5.mo40917a()
            if (r6 == 0) goto L_0x0039
            int r3 = r5.mo40919b()
            r4 = 2
        L_0x0039:
            int r9 = r9 + 1
            goto L_0x0025
        L_0x003c:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzmk r10 = new com.google.android.gms.internal.ads.zzmk
            r10.<init>(r9)
            throw r10
        L_0x0043:
            if (r10 == 0) goto L_0x0048
            r8.m49283j()
        L_0x0048:
            r12 = r10
            r10 = r3
            r9 = r4
            goto L_0x004d
        L_0x004c:
            r12 = 0
        L_0x004d:
            r14 = 252(0xfc, float:3.53E-43)
            r3 = 12
            switch(r10) {
                case 1: goto L_0x0082;
                case 2: goto L_0x007f;
                case 3: goto L_0x007c;
                case 4: goto L_0x0079;
                case 5: goto L_0x0076;
                case 6: goto L_0x0073;
                case 7: goto L_0x0070;
                case 8: goto L_0x006d;
                default: goto L_0x0054;
            }
        L_0x0054:
            com.google.android.gms.internal.ads.zzmk r9 = new com.google.android.gms.internal.ads.zzmk
            r11 = 38
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Unsupported channel count: "
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r9.<init>(r10)
            throw r9
        L_0x006d:
            int r4 = com.google.android.gms.internal.ads.bkr.f42398a
            goto L_0x0083
        L_0x0070:
            r4 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0083
        L_0x0073:
            r4 = 252(0xfc, float:3.53E-43)
            goto L_0x0083
        L_0x0076:
            r4 = 220(0xdc, float:3.08E-43)
            goto L_0x0083
        L_0x0079:
            r4 = 204(0xcc, float:2.86E-43)
            goto L_0x0083
        L_0x007c:
            r4 = 28
            goto L_0x0083
        L_0x007f:
            r4 = 12
            goto L_0x0083
        L_0x0082:
            r4 = 4
        L_0x0083:
            int r5 = com.google.android.gms.internal.ads.bsf.f43399a
            r6 = 23
            r7 = 5
            if (r5 > r6) goto L_0x00aa
            java.lang.String r5 = "foster"
            java.lang.String r6 = com.google.android.gms.internal.ads.bsf.f43400b
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00aa
            java.lang.String r5 = "NVIDIA"
            java.lang.String r6 = com.google.android.gms.internal.ads.bsf.f43401c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00aa
            r5 = 3
            if (r10 == r5) goto L_0x00ab
            if (r10 == r7) goto L_0x00ab
            r14 = 7
            if (r10 == r14) goto L_0x00a7
            goto L_0x00aa
        L_0x00a7:
            int r14 = com.google.android.gms.internal.ads.bkr.f42398a
            goto L_0x00ab
        L_0x00aa:
            r14 = r4
        L_0x00ab:
            int r4 = com.google.android.gms.internal.ads.bsf.f43399a
            r5 = 25
            if (r4 > r5) goto L_0x00c1
            java.lang.String r4 = "fugu"
            java.lang.String r5 = com.google.android.gms.internal.ads.bsf.f43400b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            if (r13 == 0) goto L_0x00c1
            if (r10 != r0) goto L_0x00c1
            r14 = 12
        L_0x00c1:
            if (r12 != 0) goto L_0x00d6
            boolean r12 = r8.m49286m()
            if (r12 == 0) goto L_0x00d6
            int r12 = r8.f42594n
            if (r12 != r9) goto L_0x00d6
            int r12 = r8.f42592l
            if (r12 != r11) goto L_0x00d6
            int r12 = r8.f42593m
            if (r12 != r14) goto L_0x00d6
            return
        L_0x00d6:
            r8.mo40952h()
            r8.f42594n = r9
            r8.f42597q = r13
            r8.f42592l = r11
            r8.f42593m = r14
            if (r13 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r9 = 2
        L_0x00e5:
            r8.f42595o = r9
            int r9 = com.google.android.gms.internal.ads.bsf.m49943b(r2, r10)
            r8.f42559I = r9
            if (r13 == 0) goto L_0x0100
            int r9 = r8.f42595o
            if (r9 == r7) goto L_0x00fd
            int r9 = r8.f42595o
            r10 = 6
            if (r9 != r10) goto L_0x00f9
            goto L_0x00fd
        L_0x00f9:
            r9 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0136
        L_0x00fd:
            r9 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0136
        L_0x0100:
            int r9 = r8.f42595o
            int r9 = android.media.AudioTrack.getMinBufferSize(r11, r14, r9)
            r10 = -2
            if (r9 == r10) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r0 = 0
        L_0x010b:
            com.google.android.gms.internal.ads.brr.m49873b(r0)
            int r10 = r9 << 2
            r11 = 250000(0x3d090, double:1.235164E-318)
            long r11 = r8.m49282c(r11)
            int r11 = (int) r11
            int r12 = r8.f42559I
            int r11 = r11 * r12
            long r0 = (long) r9
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r8.m49282c(r2)
            int r9 = r8.f42559I
            long r4 = (long) r9
            long r2 = r2 * r4
            long r0 = java.lang.Math.max(r0, r2)
            int r9 = (int) r0
            if (r10 >= r11) goto L_0x0132
            r9 = r11
            goto L_0x0136
        L_0x0132:
            if (r10 <= r9) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r9 = r10
        L_0x0136:
            r8.f42598r = r9
            if (r13 == 0) goto L_0x0140
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x014a
        L_0x0140:
            int r9 = r8.f42598r
            int r10 = r8.f42559I
            int r9 = r9 / r10
            long r9 = (long) r9
            long r9 = r8.m49280b(r9)
        L_0x014a:
            r8.f42599s = r9
            com.google.android.gms.internal.ads.bli r9 = r8.f42577a
            r8.mo40938a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmc.mo40942a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: j */
    private final void m49283j() {
        bls[] blsArr;
        ArrayList arrayList = new ArrayList();
        for (bls bls : this.f42585e) {
            if (bls.mo40917a()) {
                arrayList.add(bls);
            } else {
                bls.mo40923f();
            }
        }
        int size = arrayList.size();
        this.f42568R = (bls[]) arrayList.toArray(new bls[size]);
        this.f42569S = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            bls bls2 = this.f42568R[i];
            bls2.mo40923f();
            this.f42569S[i] = bls2.mo40921d();
        }
    }

    /* renamed from: a */
    public final void mo40939a() {
        this.f42576Z = true;
        if (m49286m()) {
            this.f42565O = System.nanoTime() / 1000;
            this.f42591k.play();
        }
    }

    /* renamed from: b */
    public final void mo40945b() {
        if (this.f42563M == 1) {
            this.f42563M = 2;
        }
    }

    /* renamed from: a */
    public final boolean mo40944a(ByteBuffer byteBuffer, long j) throws zzml, zzmo {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        brr.m49871a(this.f42570T == null || byteBuffer2 == this.f42570T);
        if (!m49286m()) {
            this.f42587g.block();
            if (this.f42579ab) {
                AudioTrack audioTrack = new AudioTrack(new Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f42593m).setEncoding(this.f42595o).setSampleRate(this.f42592l).build(), this.f42598r, 1, this.f42578aa);
                this.f42591k = audioTrack;
            } else if (this.f42578aa == 0) {
                AudioTrack audioTrack2 = new AudioTrack(this.f42596p, this.f42592l, this.f42593m, this.f42595o, this.f42598r, 1);
                this.f42591k = audioTrack2;
            } else {
                AudioTrack audioTrack3 = new AudioTrack(this.f42596p, this.f42592l, this.f42593m, this.f42595o, this.f42598r, 1, this.f42578aa);
                this.f42591k = audioTrack3;
            }
            int state = this.f42591k.getState();
            if (state == 1) {
                int audioSessionId = this.f42591k.getAudioSessionId();
                if (this.f42578aa != audioSessionId) {
                    this.f42578aa = audioSessionId;
                    this.f42586f.mo40964a(audioSessionId);
                }
                this.f42589i.mo40957a(this.f42591k, m49289p());
                m49285l();
                this.f42580ac = false;
                if (this.f42576Z) {
                    mo40939a();
                }
            } else {
                try {
                    this.f42591k.release();
                } catch (Exception unused) {
                } finally {
                    this.f42591k = null;
                }
                throw new zzml(state, this.f42592l, this.f42593m, this.f42598r);
            }
        }
        if (m49289p()) {
            if (this.f42591k.getPlayState() == 2) {
                this.f42580ac = false;
                return false;
            } else if (this.f42591k.getPlayState() == 1 && this.f42589i.mo40958b() != 0) {
                return false;
            }
        }
        boolean z = this.f42580ac;
        this.f42580ac = mo40949e();
        if (z && !this.f42580ac && this.f42591k.getPlayState() != 1) {
            this.f42586f.mo40965a(this.f42598r, bkr.m49118a(this.f42599s), SystemClock.elapsedRealtime() - this.f42581ad);
        }
        if (this.f42570T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f42597q && this.f42562L == 0) {
                int i3 = this.f42595o;
                if (i3 == 7 || i3 == 8) {
                    i2 = bmj.m49334a(byteBuffer);
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    i2 = blq.m49253a(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.f42562L = i2;
            }
            if (this.f42600t != null) {
                if (!m49284k()) {
                    return false;
                }
                LinkedList<bmh> linkedList = this.f42590j;
                bmh bmh = r11;
                bmh bmh2 = new bmh(this.f42600t, Math.max(0, j2), m49280b(m49287n()), null);
                linkedList.add(bmh);
                this.f42600t = null;
                m49283j();
            }
            if (this.f42563M == 0) {
                this.f42564N = Math.max(0, j2);
                this.f42563M = 1;
            } else {
                long b = this.f42564N + m49280b(this.f42597q ? this.f42558H : this.f42557G / ((long) this.f42556F));
                if (this.f42563M != 1 || Math.abs(b - j2) <= 200000) {
                    i = 2;
                } else {
                    i = 2;
                    this.f42563M = 2;
                }
                if (this.f42563M == i) {
                    this.f42564N += j2 - b;
                    this.f42563M = 1;
                    this.f42586f.mo40963a();
                }
            }
            if (this.f42597q) {
                this.f42558H += (long) this.f42562L;
            } else {
                this.f42557G += (long) byteBuffer.remaining();
            }
            this.f42570T = byteBuffer2;
        }
        if (this.f42597q) {
            m49281b(this.f42570T, j2);
        } else {
            m49278a(j2);
        }
        if (this.f42570T.hasRemaining()) {
            return false;
        }
        this.f42570T = null;
        return true;
    }

    /* renamed from: a */
    private final void m49278a(long j) throws zzmo {
        int length = this.f42568R.length;
        int i = length;
        while (i >= 0) {
            ByteBuffer byteBuffer = i > 0 ? this.f42569S[i - 1] : this.f42570T != null ? this.f42570T : bls.f42532a;
            if (i == length) {
                m49281b(byteBuffer, j);
            } else {
                bls bls = this.f42568R[i];
                bls.mo40916a(byteBuffer);
                ByteBuffer d = bls.mo40921d();
                this.f42569S[i] = d;
                if (d.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        if (r11 < r10) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m49281b(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zzmo {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f42571U
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x001a
            java.nio.ByteBuffer r0 = r8.f42571U
            if (r0 != r9) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.brr.m49871a(r0)
            goto L_0x003f
        L_0x001a:
            r8.f42571U = r9
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a
            if (r0 >= r2) goto L_0x003f
            int r0 = r9.remaining()
            byte[] r4 = r8.f42572V
            if (r4 == 0) goto L_0x002d
            byte[] r4 = r8.f42572V
            int r4 = r4.length
            if (r4 >= r0) goto L_0x0031
        L_0x002d:
            byte[] r4 = new byte[r0]
            r8.f42572V = r4
        L_0x0031:
            int r4 = r9.position()
            byte[] r5 = r8.f42572V
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f42573W = r3
        L_0x003f:
            int r0 = r9.remaining()
            int r4 = com.google.android.gms.internal.ads.bsf.f43399a
            if (r4 >= r2) goto L_0x007d
            long r10 = r8.f42560J
            com.google.android.gms.internal.ads.bme r2 = r8.f42589i
            long r4 = r2.mo40958b()
            int r2 = r8.f42559I
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r10 = (int) r10
            int r11 = r8.f42598r
            int r11 = r11 - r10
            if (r11 <= 0) goto L_0x007a
            int r10 = java.lang.Math.min(r0, r11)
            android.media.AudioTrack r11 = r8.f42591k
            byte[] r2 = r8.f42572V
            int r4 = r8.f42573W
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f6
            int r11 = r8.f42573W
            int r11 = r11 + r10
            r8.f42573W = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f6
        L_0x007a:
            r10 = 0
            goto L_0x00f6
        L_0x007d:
            boolean r2 = r8.f42579ab
            if (r2 == 0) goto L_0x00f0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x008c
            r2 = 1
            goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            com.google.android.gms.internal.ads.brr.m49873b(r2)
            android.media.AudioTrack r2 = r8.f42591k
            java.nio.ByteBuffer r4 = r8.f42603w
            if (r4 != 0) goto L_0x00ad
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f42603w = r4
            java.nio.ByteBuffer r4 = r8.f42603w
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f42603w
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00ad:
            int r4 = r8.f42604x
            if (r4 != 0) goto L_0x00c9
            java.nio.ByteBuffer r4 = r8.f42603w
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f42603w
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f42603w
            r10.position(r3)
            r8.f42604x = r0
        L_0x00c9:
            java.nio.ByteBuffer r10 = r8.f42603w
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00e0
            java.nio.ByteBuffer r11 = r8.f42603w
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00dd
            r8.f42604x = r3
            r10 = r11
            goto L_0x00f6
        L_0x00dd:
            if (r11 >= r10) goto L_0x00e0
            goto L_0x007a
        L_0x00e0:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e9
            r8.f42604x = r3
            goto L_0x00ee
        L_0x00e9:
            int r10 = r8.f42604x
            int r10 = r10 - r9
            r8.f42604x = r10
        L_0x00ee:
            r10 = r9
            goto L_0x00f6
        L_0x00f0:
            android.media.AudioTrack r10 = r8.f42591k
            int r10 = r10.write(r9, r0, r1)
        L_0x00f6:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f42581ad = r4
            if (r10 < 0) goto L_0x011b
            boolean r9 = r8.f42597q
            if (r9 != 0) goto L_0x0108
            long r4 = r8.f42560J
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f42560J = r4
        L_0x0108:
            if (r10 != r0) goto L_0x011a
            boolean r9 = r8.f42597q
            if (r9 == 0) goto L_0x0116
            long r9 = r8.f42561K
            int r11 = r8.f42562L
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f42561K = r9
        L_0x0116:
            r9 = 0
            r8.f42571U = r9
            return r1
        L_0x011a:
            return r3
        L_0x011b:
            com.google.android.gms.internal.ads.zzmo r9 = new com.google.android.gms.internal.ads.zzmo
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmc.m49281b(java.nio.ByteBuffer, long):boolean");
    }

    /* renamed from: c */
    public final void mo40947c() throws zzmo {
        if (!this.f42575Y && m49286m() && m49284k()) {
            this.f42589i.mo40956a(m49287n());
            this.f42604x = 0;
            this.f42575Y = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m49284k() throws com.google.android.gms.internal.ads.zzmo {
        /*
            r8 = this;
            int r0 = r8.f42574X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r8.f42597q
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.bls[] r0 = r8.f42568R
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r8.f42574X = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r8.f42574X
            com.google.android.gms.internal.ads.bls[] r5 = r8.f42568R
            int r5 = r5.length
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r5) goto L_0x003c
            com.google.android.gms.internal.ads.bls[] r4 = r8.f42568R
            int r5 = r8.f42574X
            r4 = r4[r5]
            if (r0 == 0) goto L_0x002c
            r4.mo40920c()
        L_0x002c:
            r8.m49278a(r6)
            boolean r0 = r4.mo40922e()
            if (r0 != 0) goto L_0x0036
            return r3
        L_0x0036:
            int r0 = r8.f42574X
            int r0 = r0 + r2
            r8.f42574X = r0
            goto L_0x0012
        L_0x003c:
            java.nio.ByteBuffer r0 = r8.f42571U
            if (r0 == 0) goto L_0x004a
            java.nio.ByteBuffer r0 = r8.f42571U
            r8.m49281b(r0, r6)
            java.nio.ByteBuffer r0 = r8.f42571U
            if (r0 == 0) goto L_0x004a
            return r3
        L_0x004a:
            r8.f42574X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmc.m49284k():boolean");
    }

    /* renamed from: d */
    public final boolean mo40948d() {
        return !m49286m() || (this.f42575Y && !mo40949e());
    }

    /* renamed from: e */
    public final boolean mo40949e() {
        if (m49286m()) {
            if (m49287n() <= this.f42589i.mo40958b()) {
                if (m49289p() && this.f42591k.getPlayState() == 2 && this.f42591k.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final bli mo40938a(bli bli) {
        bli bli2;
        if (this.f42597q) {
            this.f42577a = bli.f42500a;
            return this.f42577a;
        }
        bli bli3 = new bli(this.f42584d.mo40980a(bli.f42501b), this.f42584d.mo40981b(bli.f42502c));
        if (this.f42600t != null) {
            bli2 = this.f42600t;
        } else if (!this.f42590j.isEmpty()) {
            bli2 = ((bmh) this.f42590j.getLast()).f42622a;
        } else {
            bli2 = this.f42577a;
        }
        if (!bli3.equals(bli2)) {
            if (m49286m()) {
                this.f42600t = bli3;
            } else {
                this.f42577a = bli3;
            }
        }
        return this.f42577a;
    }

    /* renamed from: a */
    public final void mo40941a(int i) {
        if (this.f42596p != i) {
            this.f42596p = i;
            if (!this.f42579ab) {
                mo40952h();
                this.f42578aa = 0;
            }
        }
    }

    /* renamed from: b */
    public final void mo40946b(int i) {
        brr.m49873b(bsf.f43399a >= 21);
        if (!this.f42579ab || this.f42578aa != i) {
            this.f42579ab = true;
            this.f42578aa = i;
            mo40952h();
        }
    }

    /* renamed from: f */
    public final void mo40950f() {
        if (this.f42579ab) {
            this.f42579ab = false;
            this.f42578aa = 0;
            mo40952h();
        }
    }

    /* renamed from: a */
    public final void mo40940a(float f) {
        if (this.f42567Q != f) {
            this.f42567Q = f;
            m49285l();
        }
    }

    /* renamed from: l */
    private final void m49285l() {
        if (m49286m()) {
            if (bsf.f43399a >= 21) {
                this.f42591k.setVolume(this.f42567Q);
                return;
            }
            AudioTrack audioTrack = this.f42591k;
            float f = this.f42567Q;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: g */
    public final void mo40951g() {
        this.f42576Z = false;
        if (m49286m()) {
            m49288o();
            this.f42589i.mo40955a();
        }
    }

    /* renamed from: h */
    public final void mo40952h() {
        if (m49286m()) {
            this.f42557G = 0;
            this.f42558H = 0;
            this.f42560J = 0;
            this.f42561K = 0;
            this.f42562L = 0;
            if (this.f42600t != null) {
                this.f42577a = this.f42600t;
                this.f42600t = null;
            } else if (!this.f42590j.isEmpty()) {
                this.f42577a = ((bmh) this.f42590j.getLast()).f42622a;
            }
            this.f42590j.clear();
            this.f42601u = 0;
            this.f42602v = 0;
            this.f42570T = null;
            this.f42571U = null;
            for (int i = 0; i < this.f42568R.length; i++) {
                bls bls = this.f42568R[i];
                bls.mo40923f();
                this.f42569S[i] = bls.mo40921d();
            }
            this.f42575Y = false;
            this.f42574X = -1;
            this.f42603w = null;
            this.f42604x = 0;
            this.f42563M = 0;
            this.f42566P = 0;
            m49288o();
            if (this.f42591k.getPlayState() == 3) {
                this.f42591k.pause();
            }
            AudioTrack audioTrack = this.f42591k;
            this.f42591k = null;
            this.f42589i.mo40957a(null, false);
            this.f42587g.close();
            new bmd(this, audioTrack).start();
        }
    }

    /* renamed from: i */
    public final void mo40953i() {
        mo40952h();
        for (bls g : this.f42585e) {
            g.mo40924g();
        }
        this.f42578aa = 0;
        this.f42576Z = false;
    }

    /* renamed from: m */
    private final boolean m49286m() {
        return this.f42591k != null;
    }

    /* renamed from: b */
    private final long m49280b(long j) {
        return (j * 1000000) / ((long) this.f42592l);
    }

    /* renamed from: c */
    private final long m49282c(long j) {
        return (j * ((long) this.f42592l)) / 1000000;
    }

    /* renamed from: n */
    private final long m49287n() {
        return this.f42597q ? this.f42561K : this.f42560J / ((long) this.f42559I);
    }

    /* renamed from: o */
    private final void m49288o() {
        this.f42551A = 0;
        this.f42606z = 0;
        this.f42605y = 0;
        this.f42552B = 0;
        this.f42553C = false;
        this.f42554D = 0;
    }

    /* renamed from: p */
    private final boolean m49289p() {
        return bsf.f43399a < 23 && (this.f42595o == 5 || this.f42595o == 6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m49279b(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1095064472(0xffffffffbebaa468, float:-0.36453557)
            r2 = 0
            if (r0 == r1) goto L_0x0038
            r1 = 187078296(0xb269698, float:3.208373E-32)
            if (r0 == r1) goto L_0x002e
            r1 = 1504578661(0x59ae0c65, float:6.1237842E15)
            if (r0 == r1) goto L_0x0024
            r1 = 1505942594(0x59c2dc42, float:6.8560402E15)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 3
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "audio/eac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "audio/ac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 2
            goto L_0x0043
        L_0x0042:
            r3 = -1
        L_0x0043:
            switch(r3) {
                case 0: goto L_0x004e;
                case 1: goto L_0x004c;
                case 2: goto L_0x004a;
                case 3: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            return r2
        L_0x0047:
            r3 = 8
            return r3
        L_0x004a:
            r3 = 7
            return r3
        L_0x004c:
            r3 = 6
            return r3
        L_0x004e:
            r3 = 5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmc.m49279b(java.lang.String):int");
    }
}
