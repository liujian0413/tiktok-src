package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import java.lang.reflect.Method;

public final class bhr {

    /* renamed from: A */
    private boolean f42036A;

    /* renamed from: B */
    private int f42037B;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ConditionVariable f42038a = new ConditionVariable(true);

    /* renamed from: b */
    private final long[] f42039b;

    /* renamed from: c */
    private final bht f42040c;

    /* renamed from: d */
    private AudioTrack f42041d;

    /* renamed from: e */
    private int f42042e;

    /* renamed from: f */
    private int f42043f;

    /* renamed from: g */
    private int f42044g;

    /* renamed from: h */
    private int f42045h;

    /* renamed from: i */
    private int f42046i;

    /* renamed from: j */
    private int f42047j;

    /* renamed from: k */
    private int f42048k;

    /* renamed from: l */
    private int f42049l;

    /* renamed from: m */
    private long f42050m;

    /* renamed from: n */
    private long f42051n;

    /* renamed from: o */
    private boolean f42052o;

    /* renamed from: p */
    private long f42053p;

    /* renamed from: q */
    private Method f42054q;

    /* renamed from: r */
    private long f42055r;

    /* renamed from: s */
    private int f42056s;

    /* renamed from: t */
    private long f42057t;

    /* renamed from: u */
    private long f42058u;

    /* renamed from: v */
    private long f42059v;

    /* renamed from: w */
    private float f42060w;

    /* renamed from: x */
    private byte[] f42061x;

    /* renamed from: y */
    private int f42062y;

    /* renamed from: z */
    private int f42063z;

    public bhr() {
        if (bkn.f42386a >= 18) {
            try {
                this.f42054q = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (bkn.f42386a >= 19) {
            this.f42040c = new bhu();
        } else {
            this.f42040c = new bht(null);
        }
        this.f42039b = new long[10];
        this.f42060w = 1.0f;
        this.f42056s = 0;
    }

    /* renamed from: a */
    public final boolean mo40708a() {
        return this.f42041d != null;
    }

    /* renamed from: a */
    public final long mo40705a(boolean z) {
        long j;
        long j2;
        if (!(mo40708a() && this.f42057t != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f42041d.getPlayState() == 3) {
            long c = this.f42040c.mo40719c();
            if (c != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f42051n >= 30000) {
                    this.f42039b[this.f42048k] = c - nanoTime;
                    this.f42048k = (this.f42048k + 1) % 10;
                    if (this.f42049l < 10) {
                        this.f42049l++;
                    }
                    this.f42051n = nanoTime;
                    this.f42050m = 0;
                    for (int i = 0; i < this.f42049l; i++) {
                        this.f42050m += this.f42039b[i] / ((long) this.f42049l);
                    }
                }
                if (!this.f42036A && nanoTime - this.f42053p >= 500000) {
                    this.f42052o = this.f42040c.mo40720d();
                    if (this.f42052o) {
                        long e = this.f42040c.mo40721e() / 1000;
                        long f = this.f42040c.mo40722f();
                        if (e < this.f42058u) {
                            this.f42052o = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            this.f42052o = false;
                        } else if (Math.abs(m48849b(f) - c) > 5000000) {
                            this.f42052o = false;
                        }
                    }
                    if (this.f42054q != null) {
                        try {
                            this.f42059v = (((long) ((Integer) this.f42054q.invoke(this.f42041d, null)).intValue()) * 1000) - m48849b(m48847a((long) this.f42047j));
                            this.f42059v = Math.max(this.f42059v, 0);
                            if (this.f42059v > 5000000) {
                                this.f42059v = 0;
                            }
                        } catch (Exception unused) {
                            this.f42054q = null;
                        }
                    }
                    this.f42053p = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f42052o) {
            j = m48849b(this.f42040c.mo40722f() + m48850c(nanoTime2 - (this.f42040c.mo40721e() / 1000))) + this.f42057t;
        } else {
            if (this.f42049l == 0) {
                j2 = this.f42040c.mo40719c() + this.f42057t;
            } else {
                j2 = nanoTime2 + this.f42050m + this.f42057t;
            }
            j = j2;
            if (!z) {
                j -= this.f42059v;
            }
        }
        return j;
    }

    /* renamed from: a */
    public final int mo40703a(int i) throws zzht {
        this.f42038a.block();
        if (i == 0) {
            AudioTrack audioTrack = new AudioTrack(3, this.f42042e, this.f42043f, this.f42044g, this.f42047j, 1);
            this.f42041d = audioTrack;
        } else {
            AudioTrack audioTrack2 = new AudioTrack(3, this.f42042e, this.f42043f, this.f42044g, this.f42047j, 1, i);
            this.f42041d = audioTrack2;
        }
        int state = this.f42041d.getState();
        if (state == 1) {
            int audioSessionId = this.f42041d.getAudioSessionId();
            this.f42040c.mo40716a(this.f42041d, this.f42036A);
            mo40706a(this.f42060w);
            return audioSessionId;
        }
        try {
            this.f42041d.release();
        } catch (Exception unused) {
        } finally {
            this.f42041d = null;
        }
        throw new zzht(state, this.f42042e, this.f42043f, this.f42047j);
    }

    /* renamed from: a */
    public final void mo40707a(MediaFormat mediaFormat, int i) {
        int i2;
        int integer = mediaFormat.getInteger("channel-count");
        if (integer == 6) {
            i2 = 252;
        } else if (integer != 8) {
            switch (integer) {
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 12;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unsupported channel count: ");
                    sb.append(integer);
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            i2 = 1020;
        }
        int integer2 = mediaFormat.getInteger("sample-rate");
        String string = mediaFormat.getString("mime");
        int i3 = "audio/ac3".equals(string) ? 5 : "audio/eac3".equals(string) ? 6 : bki.m49067b(string) ? 2 : 0;
        boolean z = true;
        boolean z2 = i3 == 5 || i3 == 6;
        if (!mo40708a() || this.f42042e != integer2 || this.f42043f != i2 || this.f42036A || z2) {
            mo40714g();
            this.f42044g = i3;
            this.f42042e = integer2;
            this.f42043f = i2;
            this.f42036A = z2;
            this.f42037B = 0;
            this.f42045h = integer * 2;
            this.f42046i = AudioTrack.getMinBufferSize(integer2, i2, i3);
            if (this.f42046i == -2) {
                z = false;
            }
            bke.m49060b(z);
            int i4 = this.f42046i << 2;
            int c = ((int) m48850c(250000)) * this.f42045h;
            int max = (int) Math.max((long) this.f42046i, m48850c(750000) * ((long) this.f42045h));
            if (i4 < c) {
                i4 = c;
            } else if (i4 > max) {
                i4 = max;
            }
            this.f42047j = i4;
        }
    }

    /* renamed from: b */
    public final void mo40709b() {
        if (mo40708a()) {
            this.f42058u = System.nanoTime() / 1000;
            this.f42041d.play();
        }
    }

    /* renamed from: c */
    public final void mo40710c() {
        if (this.f42056s == 1) {
            this.f42056s = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo40704a(java.nio.ByteBuffer r11, int r12, int r13, long r14) throws com.google.android.gms.internal.ads.zzhu {
        /*
            r10 = this;
            r0 = 2
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = com.google.android.gms.internal.ads.bkn.f42386a
            r2 = 22
            r3 = 0
            r5 = 1
            r6 = 0
            if (r1 > r2) goto L_0x002e
            boolean r1 = r10.f42036A
            if (r1 == 0) goto L_0x002e
            android.media.AudioTrack r1 = r10.f42041d
            int r1 = r1.getPlayState()
            if (r1 != r0) goto L_0x001b
            return r6
        L_0x001b:
            android.media.AudioTrack r1 = r10.f42041d
            int r1 = r1.getPlayState()
            if (r1 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.bht r1 = r10.f42040c
            long r1 = r1.mo40718b()
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x002e
            return r6
        L_0x002e:
            int r1 = r10.f42063z
            if (r1 != 0) goto L_0x0089
            boolean r1 = r10.f42036A
            if (r1 == 0) goto L_0x0042
            int r1 = r10.f42037B
            if (r1 != 0) goto L_0x0042
            int r1 = r10.f42042e
            int r1 = com.google.android.gms.internal.ads.bkd.m49054a(r13, r1)
            r10.f42037B = r1
        L_0x0042:
            long r1 = (long) r13
            long r1 = r10.m48847a(r1)
            long r1 = r10.m48849b(r1)
            long r14 = r14 - r1
            long r1 = r10.f42057t
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x005b
            long r14 = java.lang.Math.max(r3, r14)
            r10.f42057t = r14
            r10.f42056s = r5
            goto L_0x0089
        L_0x005b:
            long r1 = r10.f42057t
            long r3 = r10.f42055r
            long r3 = r10.m48847a(r3)
            long r3 = r10.m48849b(r3)
            long r1 = r1 + r3
            int r3 = r10.f42056s
            if (r3 != r5) goto L_0x007b
            long r3 = r1 - r14
            long r3 = java.lang.Math.abs(r3)
            r7 = 200000(0x30d40, double:9.8813E-319)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x007b
            r10.f42056s = r0
        L_0x007b:
            int r3 = r10.f42056s
            if (r3 != r0) goto L_0x0089
            long r3 = r10.f42057t
            long r14 = r14 - r1
            long r3 = r3 + r14
            r10.f42057t = r3
            r10.f42056s = r5
            r14 = 1
            goto L_0x008a
        L_0x0089:
            r14 = 0
        L_0x008a:
            int r15 = r10.f42063z
            r0 = 21
            if (r15 != 0) goto L_0x00ad
            r10.f42063z = r13
            r11.position(r12)
            int r12 = com.google.android.gms.internal.ads.bkn.f42386a
            if (r12 >= r0) goto L_0x00ad
            byte[] r12 = r10.f42061x
            if (r12 == 0) goto L_0x00a2
            byte[] r12 = r10.f42061x
            int r12 = r12.length
            if (r12 >= r13) goto L_0x00a6
        L_0x00a2:
            byte[] r12 = new byte[r13]
            r10.f42061x = r12
        L_0x00a6:
            byte[] r12 = r10.f42061x
            r11.get(r12, r6, r13)
            r10.f42062y = r6
        L_0x00ad:
            int r12 = com.google.android.gms.internal.ads.bkn.f42386a
            if (r12 >= r0) goto L_0x00dd
            long r11 = r10.f42055r
            com.google.android.gms.internal.ads.bht r13 = r10.f42040c
            long r0 = r13.mo40718b()
            int r13 = r10.f42045h
            long r2 = (long) r13
            long r0 = r0 * r2
            long r11 = r11 - r0
            int r11 = (int) r11
            int r12 = r10.f42047j
            int r12 = r12 - r11
            if (r12 <= 0) goto L_0x00e5
            int r11 = r10.f42063z
            int r11 = java.lang.Math.min(r11, r12)
            android.media.AudioTrack r12 = r10.f42041d
            byte[] r13 = r10.f42061x
            int r15 = r10.f42062y
            int r6 = r12.write(r13, r15, r11)
            if (r6 < 0) goto L_0x00e5
            int r11 = r10.f42062y
            int r11 = r11 + r6
            r10.f42062y = r11
            goto L_0x00e5
        L_0x00dd:
            android.media.AudioTrack r12 = r10.f42041d
            int r13 = r10.f42063z
            int r6 = r12.write(r11, r13, r5)
        L_0x00e5:
            if (r6 < 0) goto L_0x00f9
            int r11 = r10.f42063z
            int r11 = r11 - r6
            r10.f42063z = r11
            long r11 = r10.f42055r
            long r0 = (long) r6
            long r11 = r11 + r0
            r10.f42055r = r11
            int r11 = r10.f42063z
            if (r11 != 0) goto L_0x00f8
            r14 = r14 | 2
        L_0x00f8:
            return r14
        L_0x00f9:
            com.google.android.gms.internal.ads.zzhu r11 = new com.google.android.gms.internal.ads.zzhu
            r11.<init>(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhr.mo40704a(java.nio.ByteBuffer, int, int, long):int");
    }

    /* renamed from: d */
    public final boolean mo40711d() {
        return mo40708a() && (m48847a(this.f42055r) > this.f42040c.mo40718b() || this.f42040c.mo40717a());
    }

    /* renamed from: e */
    public final boolean mo40712e() {
        return this.f42055r > ((long) ((this.f42046i * 3) / 2));
    }

    /* renamed from: a */
    public final void mo40706a(float f) {
        this.f42060w = f;
        if (mo40708a()) {
            if (bkn.f42386a >= 21) {
                this.f42041d.setVolume(f);
                return;
            }
            this.f42041d.setStereoVolume(f, f);
        }
    }

    /* renamed from: f */
    public final void mo40713f() {
        if (mo40708a()) {
            m48851h();
            this.f42041d.pause();
        }
    }

    /* renamed from: g */
    public final void mo40714g() {
        if (mo40708a()) {
            this.f42055r = 0;
            this.f42063z = 0;
            this.f42057t = 0;
            this.f42059v = 0;
            m48851h();
            if (this.f42041d.getPlayState() == 3) {
                this.f42041d.pause();
            }
            AudioTrack audioTrack = this.f42041d;
            this.f42041d = null;
            this.f42040c.mo40716a(null, false);
            this.f42038a.close();
            new bhs(this, audioTrack).start();
        }
    }

    /* renamed from: a */
    private final long m48847a(long j) {
        if (!this.f42036A) {
            return j / ((long) this.f42045h);
        }
        if (this.f42037B == 0) {
            return 0;
        }
        return ((j << 3) * ((long) this.f42042e)) / ((long) (this.f42037B * 1000));
    }

    /* renamed from: b */
    private final long m48849b(long j) {
        return (j * 1000000) / ((long) this.f42042e);
    }

    /* renamed from: c */
    private final long m48850c(long j) {
        return (j * ((long) this.f42042e)) / 1000000;
    }

    /* renamed from: h */
    private final void m48851h() {
        this.f42050m = 0;
        this.f42049l = 0;
        this.f42048k = 0;
        this.f42051n = 0;
        this.f42052o = false;
        this.f42053p = 0;
    }
}
