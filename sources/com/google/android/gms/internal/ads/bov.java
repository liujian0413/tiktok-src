package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class bov extends bkq {

    /* renamed from: f */
    private static final byte[] f43069f = bsf.m49947d("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private ByteBuffer[] f43070A;

    /* renamed from: B */
    private ByteBuffer[] f43071B;

    /* renamed from: C */
    private long f43072C;

    /* renamed from: D */
    private int f43073D;

    /* renamed from: E */
    private int f43074E;

    /* renamed from: F */
    private boolean f43075F;

    /* renamed from: G */
    private boolean f43076G;

    /* renamed from: H */
    private int f43077H;

    /* renamed from: I */
    private int f43078I;

    /* renamed from: J */
    private boolean f43079J;

    /* renamed from: K */
    private boolean f43080K;

    /* renamed from: L */
    private boolean f43081L;

    /* renamed from: M */
    private boolean f43082M;

    /* renamed from: N */
    private boolean f43083N;

    /* renamed from: O */
    private boolean f43084O;

    /* renamed from: c */
    public MediaCodec f43085c;

    /* renamed from: d */
    public bou f43086d;

    /* renamed from: e */
    protected bmv f43087e;

    /* renamed from: g */
    private final bow f43088g;

    /* renamed from: h */
    private final bna<Object> f43089h;

    /* renamed from: i */
    private final boolean f43090i;

    /* renamed from: j */
    private final bmw f43091j;

    /* renamed from: k */
    private final bmw f43092k;

    /* renamed from: l */
    private final blg f43093l;

    /* renamed from: m */
    private final List<Long> f43094m;

    /* renamed from: n */
    private final BufferInfo f43095n;

    /* renamed from: o */
    private zzlg f43096o;

    /* renamed from: p */
    private bmz<Object> f43097p;

    /* renamed from: q */
    private bmz<Object> f43098q;

    /* renamed from: r */
    private boolean f43099r;

    /* renamed from: s */
    private boolean f43100s;

    /* renamed from: t */
    private boolean f43101t;

    /* renamed from: u */
    private boolean f43102u;

    /* renamed from: v */
    private boolean f43103v;

    /* renamed from: w */
    private boolean f43104w;

    /* renamed from: x */
    private boolean f43105x;

    /* renamed from: y */
    private boolean f43106y;

    /* renamed from: z */
    private boolean f43107z;

    public bov(int i, bow bow, bna<Object> bna, boolean z) {
        super(i);
        brr.m49873b(bsf.f43399a >= 16);
        this.f43088g = (bow) brr.m49869a(bow);
        this.f43089h = bna;
        this.f43090i = z;
        this.f43091j = new bmw(0);
        this.f43092k = new bmw(0);
        this.f43093l = new blg();
        this.f43094m = new ArrayList();
        this.f43095n = new BufferInfo();
        this.f43077H = 0;
        this.f43078I = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo40966a(bow bow, zzlg zzlg) throws zzpj;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40969a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzkt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41064a(bmw bmw) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40970a(bou bou, MediaCodec mediaCodec, zzlg zzlg, MediaCrypto mediaCrypto) throws zzpj;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40971a(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo40972a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzkt;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo41065a(MediaCodec mediaCodec, boolean z, zzlg zzlg, zzlg zzlg2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo41066a(bou bou) {
        return true;
    }

    /* renamed from: l */
    public final int mo40843l() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo40844m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo40845n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo40976u() throws zzkt {
    }

    /* renamed from: a */
    public final int mo40899a(zzlg zzlg) throws zzkt {
        try {
            return mo40966a(this.f43088g, zzlg);
        } catch (zzpj e) {
            throw zzkt.zza(e, this.f42391b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bou mo40968a(bow bow, zzlg zzlg, boolean z) throws zzpj {
        return bow.mo41070a(zzlg.f45713c, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo41067v() throws zzkt {
        if (this.f43085c == null && this.f43096o != null) {
            this.f43097p = this.f43098q;
            if (this.f43097p != null) {
                int a = this.f43097p.mo40997a();
                if (a == 0) {
                    throw zzkt.zza(this.f43097p.mo40998b(), this.f42391b);
                } else if (a == 3 || a == 4) {
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.f43086d == null) {
                    try {
                        this.f43086d = mo40968a(this.f43088g, this.f43096o, false);
                    } catch (zzpj e) {
                        m49575a(new zzpe(this.f43096o, (Throwable) e, false, -49998));
                    }
                    if (this.f43086d == null) {
                        m49575a(new zzpe(this.f43096o, (Throwable) null, false, -49999));
                    }
                }
                if (mo41066a(this.f43086d)) {
                    String str = this.f43086d.f43063a;
                    this.f43099r = bsf.f43399a < 21 && this.f43096o.f45715e.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                    this.f43100s = bsf.f43399a < 18 || (bsf.f43399a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (bsf.f43399a == 19 && bsf.f43402d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
                    this.f43101t = bsf.f43399a < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(bsf.f43400b) || "flounder_lte".equals(bsf.f43400b) || "grouper".equals(bsf.f43400b) || "tilapia".equals(bsf.f43400b));
                    this.f43102u = bsf.f43399a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
                    this.f43103v = (bsf.f43399a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (bsf.f43399a <= 19 && "hb2000".equals(bsf.f43400b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
                    this.f43104w = bsf.f43399a == 21 && "OMX.google.aac.decoder".equals(str);
                    this.f43105x = bsf.f43399a <= 18 && this.f43096o.f45722l == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str2 = "createCodec:";
                        String valueOf = String.valueOf(str);
                        bse.m49930a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        this.f43085c = MediaCodec.createByCodecName(str);
                        bse.m49929a();
                        bse.m49930a("configureCodec");
                        mo40970a(this.f43086d, this.f43085c, this.f43096o, (MediaCrypto) null);
                        bse.m49929a();
                        bse.m49930a("startCodec");
                        this.f43085c.start();
                        bse.m49929a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        mo40971a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.f43070A = this.f43085c.getInputBuffers();
                        this.f43071B = this.f43085c.getOutputBuffers();
                    } catch (Exception e2) {
                        m49575a(new zzpe(this.f43096o, (Throwable) e2, false, str));
                    }
                    this.f43072C = mo40835d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.f43073D = -1;
                    this.f43074E = -1;
                    this.f43084O = true;
                    this.f43087e.f42705a++;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m49575a(zzpe zzpe) throws zzkt {
        throw zzkt.zza(zzpe, this.f42391b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40829a(boolean z) throws zzkt {
        this.f43087e = new bmv();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40827a(long j, boolean z) throws zzkt {
        this.f43081L = false;
        this.f43082M = false;
        if (this.f43085c != null) {
            this.f43072C = -9223372036854775807L;
            this.f43073D = -1;
            this.f43074E = -1;
            this.f43084O = true;
            this.f43083N = false;
            this.f43075F = false;
            this.f43094m.clear();
            this.f43106y = false;
            this.f43107z = false;
            if (this.f43100s || (this.f43103v && this.f43080K)) {
                mo41068w();
                mo41067v();
            } else if (this.f43078I != 0) {
                mo41068w();
                mo41067v();
            } else {
                this.f43085c.flush();
                this.f43079J = false;
            }
            if (this.f43076G && this.f43096o != null) {
                this.f43077H = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo40846o() {
        this.f43096o = null;
        try {
            mo41068w();
        } finally {
            this.f43097p = null;
            this.f43098q = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo41068w() {
        this.f43072C = -9223372036854775807L;
        this.f43073D = -1;
        this.f43074E = -1;
        this.f43083N = false;
        this.f43075F = false;
        this.f43094m.clear();
        this.f43070A = null;
        this.f43071B = null;
        this.f43086d = null;
        this.f43076G = false;
        this.f43079J = false;
        this.f43099r = false;
        this.f43100s = false;
        this.f43101t = false;
        this.f43102u = false;
        this.f43103v = false;
        this.f43105x = false;
        this.f43106y = false;
        this.f43107z = false;
        this.f43080K = false;
        this.f43077H = 0;
        this.f43078I = 0;
        this.f43091j.f42713c = null;
        if (this.f43085c != null) {
            this.f43087e.f42706b++;
            try {
                this.f43085c.stop();
                try {
                    this.f43085c.release();
                } finally {
                    this.f43085c = null;
                    if (!(this.f43097p == null || this.f43098q == this.f43097p)) {
                        this.f43097p = null;
                    }
                }
            } catch (Throwable th) {
                this.f43085c = null;
                if (!(this.f43097p == null || this.f43098q == this.f43097p)) {
                    this.f43097p = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo40896a(long j, long j2) throws zzkt {
        if (this.f43082M) {
            mo40976u();
            return;
        }
        if (this.f43096o == null) {
            this.f43092k.mo40982a();
            int a = mo40823a(this.f43093l, this.f43092k, true);
            if (a == -5) {
                mo40973b(this.f43093l.f42499a);
            } else if (a == -4) {
                brr.m49873b(this.f43092k.mo40986c());
                this.f43081L = true;
                mo40975t();
                return;
            } else {
                return;
            }
        }
        mo41067v();
        if (this.f43085c != null) {
            bse.m49930a("drainAndFeed");
            do {
            } while (m49576b(j, j2));
            do {
            } while (mo40974s());
            bse.m49929a();
            return;
        }
        mo40833b(j);
        this.f43092k.mo40982a();
        int a2 = mo40823a(this.f43093l, this.f43092k, false);
        if (a2 == -5) {
            mo40973b(this.f43093l.f42499a);
            return;
        }
        if (a2 == -4) {
            brr.m49873b(this.f43092k.mo40986c());
            this.f43081L = true;
            mo40975t();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x014f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0150  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean mo40974s() throws com.google.android.gms.internal.ads.zzkt {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.f43085c
            r1 = 0
            if (r0 == 0) goto L_0x01d6
            int r0 = r14.f43078I
            r2 = 2
            if (r0 == r2) goto L_0x01d6
            boolean r0 = r14.f43081L
            if (r0 == 0) goto L_0x0010
            goto L_0x01d6
        L_0x0010:
            int r0 = r14.f43073D
            if (r0 >= 0) goto L_0x0032
            android.media.MediaCodec r0 = r14.f43085c
            r3 = 0
            int r0 = r0.dequeueInputBuffer(r3)
            r14.f43073D = r0
            int r0 = r14.f43073D
            if (r0 >= 0) goto L_0x0023
            return r1
        L_0x0023:
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            java.nio.ByteBuffer[] r3 = r14.f43070A
            int r4 = r14.f43073D
            r3 = r3[r4]
            r0.f42713c = r3
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            r0.mo40982a()
        L_0x0032:
            int r0 = r14.f43078I
            r3 = -1
            r4 = 1
            if (r0 != r4) goto L_0x004f
            boolean r0 = r14.f43102u
            if (r0 != 0) goto L_0x004c
            r14.f43080K = r4
            android.media.MediaCodec r5 = r14.f43085c
            int r6 = r14.f43073D
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.f43073D = r3
        L_0x004c:
            r14.f43078I = r2
            return r1
        L_0x004f:
            boolean r0 = r14.f43106y
            if (r0 == 0) goto L_0x0071
            r14.f43106y = r1
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            java.nio.ByteBuffer r0 = r0.f42713c
            byte[] r1 = f43069f
            r0.put(r1)
            android.media.MediaCodec r5 = r14.f43085c
            int r6 = r14.f43073D
            r7 = 0
            byte[] r0 = f43069f
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.f43073D = r3
            r14.f43079J = r4
            return r4
        L_0x0071:
            boolean r0 = r14.f43083N
            if (r0 == 0) goto L_0x0078
            r0 = -4
            r5 = 0
            goto L_0x00b0
        L_0x0078:
            int r0 = r14.f43077H
            if (r0 != r4) goto L_0x009d
            r0 = 0
        L_0x007d:
            com.google.android.gms.internal.ads.zzlg r5 = r14.f43096o
            java.util.List<byte[]> r5 = r5.f45715e
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x009b
            com.google.android.gms.internal.ads.zzlg r5 = r14.f43096o
            java.util.List<byte[]> r5 = r5.f45715e
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.bmw r6 = r14.f43091j
            java.nio.ByteBuffer r6 = r6.f42713c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x007d
        L_0x009b:
            r14.f43077H = r2
        L_0x009d:
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            java.nio.ByteBuffer r0 = r0.f42713c
            int r0 = r0.position()
            com.google.android.gms.internal.ads.blg r5 = r14.f43093l
            com.google.android.gms.internal.ads.bmw r6 = r14.f43091j
            int r5 = r14.mo40823a(r5, r6, r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00b0:
            r6 = -3
            if (r0 != r6) goto L_0x00b4
            return r1
        L_0x00b4:
            r6 = -5
            if (r0 != r6) goto L_0x00ca
            int r0 = r14.f43077H
            if (r0 != r2) goto L_0x00c2
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            r0.mo40982a()
            r14.f43077H = r4
        L_0x00c2:
            com.google.android.gms.internal.ads.blg r0 = r14.f43093l
            com.google.android.gms.internal.ads.zzlg r0 = r0.f42499a
            r14.mo40973b(r0)
            return r4
        L_0x00ca:
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            boolean r0 = r0.mo40986c()
            if (r0 == 0) goto L_0x0104
            int r0 = r14.f43077H
            if (r0 != r2) goto L_0x00dd
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            r0.mo40982a()
            r14.f43077H = r4
        L_0x00dd:
            r14.f43081L = r4
            boolean r0 = r14.f43079J
            if (r0 != 0) goto L_0x00e7
            r14.mo40975t()
            return r1
        L_0x00e7:
            boolean r0 = r14.f43102u     // Catch:{ CryptoException -> 0x00fc }
            if (r0 != 0) goto L_0x00fb
            r14.f43080K = r4     // Catch:{ CryptoException -> 0x00fc }
            android.media.MediaCodec r5 = r14.f43085c     // Catch:{ CryptoException -> 0x00fc }
            int r6 = r14.f43073D     // Catch:{ CryptoException -> 0x00fc }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00fc }
            r14.f43073D = r3     // Catch:{ CryptoException -> 0x00fc }
        L_0x00fb:
            return r1
        L_0x00fc:
            r0 = move-exception
            int r1 = r14.f42391b
            com.google.android.gms.internal.ads.zzkt r0 = com.google.android.gms.internal.ads.zzkt.zza(r0, r1)
            throw r0
        L_0x0104:
            boolean r0 = r14.f43084O
            if (r0 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            boolean r0 = r0.mo40987d()
            if (r0 != 0) goto L_0x011c
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            r0.mo40982a()
            int r0 = r14.f43077H
            if (r0 != r2) goto L_0x011b
            r14.f43077H = r4
        L_0x011b:
            return r4
        L_0x011c:
            r14.f43084O = r1
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j
            boolean r0 = r0.mo40992e()
            com.google.android.gms.internal.ads.bmz<java.lang.Object> r2 = r14.f43097p
            if (r2 == 0) goto L_0x0148
            com.google.android.gms.internal.ads.bmz<java.lang.Object> r2 = r14.f43097p
            int r2 = r2.mo40997a()
            if (r2 == 0) goto L_0x013b
            r6 = 4
            if (r2 == r6) goto L_0x0148
            if (r0 != 0) goto L_0x0139
            boolean r2 = r14.f43090i
            if (r2 != 0) goto L_0x0148
        L_0x0139:
            r2 = 1
            goto L_0x0149
        L_0x013b:
            com.google.android.gms.internal.ads.bmz<java.lang.Object> r0 = r14.f43097p
            com.google.android.gms.internal.ads.zznh r0 = r0.mo40998b()
            int r1 = r14.f42391b
            com.google.android.gms.internal.ads.zzkt r0 = com.google.android.gms.internal.ads.zzkt.zza(r0, r1)
            throw r0
        L_0x0148:
            r2 = 0
        L_0x0149:
            r14.f43083N = r2
            boolean r2 = r14.f43083N
            if (r2 == 0) goto L_0x0150
            return r1
        L_0x0150:
            boolean r2 = r14.f43099r
            if (r2 == 0) goto L_0x016a
            if (r0 != 0) goto L_0x016a
            com.google.android.gms.internal.ads.bmw r2 = r14.f43091j
            java.nio.ByteBuffer r2 = r2.f42713c
            com.google.android.gms.internal.ads.brx.m49891a(r2)
            com.google.android.gms.internal.ads.bmw r2 = r14.f43091j
            java.nio.ByteBuffer r2 = r2.f42713c
            int r2 = r2.position()
            if (r2 != 0) goto L_0x0168
            return r4
        L_0x0168:
            r14.f43099r = r1
        L_0x016a:
            com.google.android.gms.internal.ads.bmw r2 = r14.f43091j     // Catch:{ CryptoException -> 0x01ce }
            long r10 = r2.f42714d     // Catch:{ CryptoException -> 0x01ce }
            com.google.android.gms.internal.ads.bmw r2 = r14.f43091j     // Catch:{ CryptoException -> 0x01ce }
            boolean r2 = r2.mo40984b()     // Catch:{ CryptoException -> 0x01ce }
            if (r2 == 0) goto L_0x017f
            java.util.List<java.lang.Long> r2 = r14.f43094m     // Catch:{ CryptoException -> 0x01ce }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01ce }
            r2.add(r6)     // Catch:{ CryptoException -> 0x01ce }
        L_0x017f:
            com.google.android.gms.internal.ads.bmw r2 = r14.f43091j     // Catch:{ CryptoException -> 0x01ce }
            java.nio.ByteBuffer r2 = r2.f42713c     // Catch:{ CryptoException -> 0x01ce }
            r2.flip()     // Catch:{ CryptoException -> 0x01ce }
            com.google.android.gms.internal.ads.bmw r2 = r14.f43091j     // Catch:{ CryptoException -> 0x01ce }
            r14.mo41064a(r2)     // Catch:{ CryptoException -> 0x01ce }
            if (r0 == 0) goto L_0x01af
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j     // Catch:{ CryptoException -> 0x01ce }
            com.google.android.gms.internal.ads.bmr r0 = r0.f42712b     // Catch:{ CryptoException -> 0x01ce }
            android.media.MediaCodec$CryptoInfo r9 = r0.f42691d     // Catch:{ CryptoException -> 0x01ce }
            if (r5 != 0) goto L_0x0196
            goto L_0x01a5
        L_0x0196:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01ce }
            if (r0 != 0) goto L_0x019e
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01ce }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01ce }
        L_0x019e:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01ce }
            r2 = r0[r1]     // Catch:{ CryptoException -> 0x01ce }
            int r2 = r2 + r5
            r0[r1] = r2     // Catch:{ CryptoException -> 0x01ce }
        L_0x01a5:
            android.media.MediaCodec r6 = r14.f43085c     // Catch:{ CryptoException -> 0x01ce }
            int r7 = r14.f43073D     // Catch:{ CryptoException -> 0x01ce }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01ce }
            goto L_0x01c0
        L_0x01af:
            android.media.MediaCodec r6 = r14.f43085c     // Catch:{ CryptoException -> 0x01ce }
            int r7 = r14.f43073D     // Catch:{ CryptoException -> 0x01ce }
            r8 = 0
            com.google.android.gms.internal.ads.bmw r0 = r14.f43091j     // Catch:{ CryptoException -> 0x01ce }
            java.nio.ByteBuffer r0 = r0.f42713c     // Catch:{ CryptoException -> 0x01ce }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01ce }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01ce }
        L_0x01c0:
            r14.f43073D = r3     // Catch:{ CryptoException -> 0x01ce }
            r14.f43079J = r4     // Catch:{ CryptoException -> 0x01ce }
            r14.f43077H = r1     // Catch:{ CryptoException -> 0x01ce }
            com.google.android.gms.internal.ads.bmv r0 = r14.f43087e     // Catch:{ CryptoException -> 0x01ce }
            int r1 = r0.f42707c     // Catch:{ CryptoException -> 0x01ce }
            int r1 = r1 + r4
            r0.f42707c = r1     // Catch:{ CryptoException -> 0x01ce }
            return r4
        L_0x01ce:
            r0 = move-exception
            int r1 = r14.f42391b
            com.google.android.gms.internal.ads.zzkt r0 = com.google.android.gms.internal.ads.zzkt.zza(r0, r1)
            throw r0
        L_0x01d6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bov.mo40974s():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40973b(zzlg zzlg) throws zzkt {
        Object obj;
        zzlg zzlg2 = this.f43096o;
        this.f43096o = zzlg;
        zznd zznd = this.f43096o.f45716f;
        if (zzlg2 == null) {
            obj = null;
        } else {
            obj = zzlg2.f45716f;
        }
        boolean a = bsf.m49941a((Object) zznd, obj);
        boolean z = true;
        if (!a) {
            if (this.f43096o.f45716f == null) {
                this.f43098q = null;
            } else if (this.f43089h != null) {
                this.f43098q = this.f43089h.mo40999a(Looper.myLooper(), this.f43096o.f45716f);
                bmz<Object> bmz = this.f43098q;
                bmz<Object> bmz2 = this.f43097p;
            } else {
                throw zzkt.zza(new IllegalStateException("Media requires a DrmSessionManager"), this.f42391b);
            }
        }
        if (this.f43098q == this.f43097p && this.f43085c != null && mo41065a(this.f43085c, this.f43086d.f43064b, zzlg2, this.f43096o)) {
            this.f43076G = true;
            this.f43077H = 1;
            if (!(this.f43101t && this.f43096o.f45717g == zzlg2.f45717g && this.f43096o.f45718h == zzlg2.f45718h)) {
                z = false;
            }
            this.f43106y = z;
        } else if (this.f43079J) {
            this.f43078I = 1;
        } else {
            mo41068w();
            mo41067v();
        }
    }

    /* renamed from: r */
    public boolean mo40898r() {
        return this.f43082M;
    }

    /* renamed from: q */
    public boolean mo40897q() {
        return this.f43096o != null && !this.f43083N && (mo40847p() || this.f43074E >= 0 || (this.f43072C != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f43072C));
    }

    /* renamed from: b */
    private final boolean m49576b(long j, long j2) throws zzkt {
        boolean z;
        boolean z2;
        if (this.f43074E < 0) {
            if (!this.f43104w || !this.f43080K) {
                this.f43074E = this.f43085c.dequeueOutputBuffer(this.f43095n, 0);
            } else {
                try {
                    this.f43074E = this.f43085c.dequeueOutputBuffer(this.f43095n, 0);
                } catch (IllegalStateException unused) {
                    mo40975t();
                    if (this.f43082M) {
                        mo41068w();
                    }
                    return false;
                }
            }
            if (this.f43074E >= 0) {
                if (this.f43107z) {
                    this.f43107z = false;
                    this.f43085c.releaseOutputBuffer(this.f43074E, false);
                    this.f43074E = -1;
                    return true;
                } else if ((this.f43095n.flags & 4) != 0) {
                    mo40975t();
                    this.f43074E = -1;
                    return false;
                } else {
                    ByteBuffer byteBuffer = this.f43071B[this.f43074E];
                    if (byteBuffer != null) {
                        byteBuffer.position(this.f43095n.offset);
                        byteBuffer.limit(this.f43095n.offset + this.f43095n.size);
                    }
                    long j3 = this.f43095n.presentationTimeUs;
                    int size = this.f43094m.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z2 = false;
                            break;
                        } else if (((Long) this.f43094m.get(i)).longValue() == j3) {
                            this.f43094m.remove(i);
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    this.f43075F = z2;
                }
            } else if (this.f43074E == -2) {
                MediaFormat outputFormat = this.f43085c.getOutputFormat();
                if (this.f43101t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f43107z = true;
                } else {
                    if (this.f43105x) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    mo40969a(this.f43085c, outputFormat);
                }
                return true;
            } else if (this.f43074E == -3) {
                this.f43071B = this.f43085c.getOutputBuffers();
                return true;
            } else {
                if (this.f43102u && (this.f43081L || this.f43078I == 2)) {
                    mo40975t();
                }
                return false;
            }
        }
        if (!this.f43104w || !this.f43080K) {
            z = mo40972a(j, j2, this.f43085c, this.f43071B[this.f43074E], this.f43074E, this.f43095n.flags, this.f43095n.presentationTimeUs, this.f43075F);
        } else {
            try {
                z = mo40972a(j, j2, this.f43085c, this.f43071B[this.f43074E], this.f43074E, this.f43095n.flags, this.f43095n.presentationTimeUs, this.f43075F);
            } catch (IllegalStateException unused2) {
                mo40975t();
                if (this.f43082M) {
                    mo41068w();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        long j4 = this.f43095n.presentationTimeUs;
        this.f43074E = -1;
        return true;
    }

    /* renamed from: t */
    private final void mo40975t() throws zzkt {
        if (this.f43078I == 2) {
            mo41068w();
            mo41067v();
            return;
        }
        this.f43082M = true;
        mo40976u();
    }
}
