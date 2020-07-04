package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class bso extends bov {

    /* renamed from: g */
    private static final int[] f43422g = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A */
    private int f43423A;

    /* renamed from: B */
    private int f43424B;

    /* renamed from: C */
    private int f43425C;

    /* renamed from: D */
    private float f43426D;

    /* renamed from: E */
    private int f43427E;

    /* renamed from: F */
    private int f43428F;

    /* renamed from: G */
    private int f43429G;

    /* renamed from: H */
    private float f43430H;

    /* renamed from: I */
    private boolean f43431I;

    /* renamed from: J */
    private int f43432J;

    /* renamed from: K */
    private long f43433K;

    /* renamed from: L */
    private int f43434L;

    /* renamed from: f */
    bsr f43435f;

    /* renamed from: h */
    private final Context f43436h;

    /* renamed from: i */
    private final bss f43437i;

    /* renamed from: j */
    private final bsv f43438j;

    /* renamed from: k */
    private final long f43439k;

    /* renamed from: l */
    private final int f43440l;

    /* renamed from: m */
    private final boolean f43441m;

    /* renamed from: n */
    private final long[] f43442n;

    /* renamed from: o */
    private zzlg[] f43443o;

    /* renamed from: p */
    private bsq f43444p;

    /* renamed from: q */
    private Surface f43445q;

    /* renamed from: r */
    private Surface f43446r;

    /* renamed from: s */
    private int f43447s;

    /* renamed from: t */
    private boolean f43448t;

    /* renamed from: u */
    private long f43449u;

    /* renamed from: v */
    private long f43450v;

    /* renamed from: w */
    private int f43451w;

    /* renamed from: x */
    private int f43452x;

    /* renamed from: y */
    private int f43453y;

    /* renamed from: z */
    private float f43454z;

    public bso(Context context, bow bow, long j, Handler handler, bsu bsu, int i) {
        this(context, bow, 0, null, false, handler, bsu, -1);
    }

    /* renamed from: c */
    private static boolean m49965c(long j) {
        return j < -30000;
    }

    private bso(Context context, bow bow, long j, bna<Object> bna, boolean z, Handler handler, bsu bsu, int i) {
        boolean z2 = false;
        super(2, bow, null, false);
        this.f43440l = -1;
        this.f43436h = context.getApplicationContext();
        this.f43437i = new bss(context);
        this.f43438j = new bsv(handler, bsu);
        if (bsf.f43399a <= 22 && "foster".equals(bsf.f43400b) && "NVIDIA".equals(bsf.f43401c)) {
            z2 = true;
        }
        this.f43441m = z2;
        this.f43442n = new long[10];
        this.f43433K = -9223372036854775807L;
        this.f43449u = -9223372036854775807L;
        this.f43423A = -1;
        this.f43424B = -1;
        this.f43426D = -1.0f;
        this.f43454z = -1.0f;
        this.f43447s = 1;
        m49969y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40966a(bow bow, zzlg zzlg) throws zzpj {
        boolean z;
        String str = zzlg.f45713c;
        int i = 0;
        if (!brw.m49888b(str)) {
            return 0;
        }
        zznd zznd = zzlg.f45716f;
        if (zznd != null) {
            z = false;
            for (int i2 = 0; i2 < zznd.f45737a; i2++) {
                z |= zznd.mo42360a(i2).f45740a;
            }
        } else {
            z = false;
        }
        bou a = bow.mo41070a(str, z);
        if (a == null) {
            return 1;
        }
        boolean b = a.mo41063b(zzlg.f45712b);
        if (b && zzlg.f45717g > 0 && zzlg.f45718h > 0) {
            b = bsf.f43399a >= 21 ? a.mo41060a(zzlg.f45717g, zzlg.f45718h, (double) zzlg.f45719i) : zzlg.f45717g * zzlg.f45718h <= boy.m49611b();
        }
        int i3 = a.f43064b ? 8 : 4;
        if (a.f43065c) {
            i = 16;
        }
        return (b ? 3 : 2) | i3 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40829a(boolean z) throws zzkt {
        super.mo40829a(z);
        this.f43432J = this.f42390a.f42505b;
        this.f43431I = this.f43432J != 0;
        this.f43438j.mo41264a(this.f43087e);
        this.f43437i.mo41255a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40830a(zzlg[] zzlgArr, long j) throws zzkt {
        this.f43443o = zzlgArr;
        if (this.f43433K == -9223372036854775807L) {
            this.f43433K = j;
        } else {
            if (this.f43434L != this.f43442n.length) {
                this.f43434L++;
            }
            this.f43442n[this.f43434L - 1] = j;
        }
        super.mo40830a(zzlgArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40827a(long j, boolean z) throws zzkt {
        super.mo40827a(j, z);
        m49968x();
        this.f43452x = 0;
        if (this.f43434L != 0) {
            this.f43433K = this.f43442n[this.f43434L - 1];
            this.f43434L = 0;
        }
        if (z) {
            m49967t();
        } else {
            this.f43449u = -9223372036854775807L;
        }
    }

    /* renamed from: q */
    public final boolean mo40897q() {
        if (super.mo40897q() && (this.f43448t || ((this.f43446r != null && this.f43445q == this.f43446r) || this.f43085c == null))) {
            this.f43449u = -9223372036854775807L;
            return true;
        } else if (this.f43449u == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f43449u) {
                return true;
            }
            this.f43449u = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo40844m() {
        super.mo40844m();
        this.f43451w = 0;
        this.f43450v = SystemClock.elapsedRealtime();
        this.f43449u = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo40845n() {
        m49957B();
        super.mo40845n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo40846o() {
        this.f43423A = -1;
        this.f43424B = -1;
        this.f43426D = -1.0f;
        this.f43454z = -1.0f;
        this.f43433K = -9223372036854775807L;
        this.f43434L = 0;
        m49969y();
        m49968x();
        this.f43437i.mo41256b();
        this.f43435f = null;
        this.f43431I = false;
        try {
            super.mo40846o();
        } finally {
            this.f43438j.mo41267b(this.f43087e);
        }
    }

    /* renamed from: a */
    public final void mo40825a(int i, Object obj) throws zzkt {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                if (this.f43446r != null) {
                    surface = this.f43446r;
                } else {
                    bou bou = this.f43086d;
                    if (bou != null && m49963b(bou.f43066d)) {
                        this.f43446r = zztc.m53208a(this.f43436h, bou.f43066d);
                        surface = this.f43446r;
                    }
                }
            }
            if (this.f43445q != surface) {
                this.f43445q = surface;
                int d = mo40835d();
                if (d == 1 || d == 2) {
                    MediaCodec mediaCodec = this.f43085c;
                    if (bsf.f43399a < 23 || mediaCodec == null || surface == null) {
                        mo41068w();
                        mo41067v();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f43446r) {
                    m49969y();
                    m49968x();
                } else {
                    m49956A();
                    m49968x();
                    if (d == 2) {
                        m49967t();
                        return;
                    }
                }
                return;
            }
            if (!(surface == null || surface == this.f43446r)) {
                m49956A();
                if (this.f43448t) {
                    this.f43438j.mo41263a(this.f43445q);
                }
            }
        } else if (i == 4) {
            this.f43447s = ((Integer) obj).intValue();
            MediaCodec mediaCodec2 = this.f43085c;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(this.f43447s);
            }
        } else {
            super.mo40825a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo41066a(bou bou) {
        return this.f43445q != null || m49963b(bou.f43066d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40970a(bou bou, MediaCodec mediaCodec, zzlg zzlg, MediaCrypto mediaCrypto) throws zzpj {
        bsq bsq;
        Point point;
        bou bou2 = bou;
        MediaCodec mediaCodec2 = mediaCodec;
        zzlg zzlg2 = zzlg;
        zzlg[] zzlgArr = this.f43443o;
        int i = zzlg2.f45717g;
        int i2 = zzlg2.f45718h;
        int c = m49964c(zzlg);
        if (zzlgArr.length == 1) {
            bsq = new bsq(i, i2, c);
        } else {
            int i3 = i2;
            int i4 = c;
            boolean z = false;
            int i5 = i;
            for (zzlg zzlg3 : zzlgArr) {
                if (m49961a(bou2.f43064b, zzlg2, zzlg3)) {
                    z |= zzlg3.f45717g == -1 || zzlg3.f45718h == -1;
                    i5 = Math.max(i5, zzlg3.f45717g);
                    int max = Math.max(i3, zzlg3.f45718h);
                    i4 = Math.max(i4, m49964c(zzlg3));
                    i3 = max;
                }
            }
            if (z) {
                boolean z2 = zzlg2.f45718h > zzlg2.f45717g;
                int i6 = z2 ? zzlg2.f45718h : zzlg2.f45717g;
                int i7 = z2 ? zzlg2.f45717g : zzlg2.f45718h;
                float f = ((float) i7) / ((float) i6);
                int[] iArr = f43422g;
                int length = iArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    int i9 = iArr[i8];
                    int i10 = (int) (((float) i9) * f);
                    if (i9 <= i6 || i10 <= i7) {
                        break;
                    }
                    int i11 = i6;
                    int i12 = i7;
                    if (bsf.f43399a >= 21) {
                        int i13 = z2 ? i10 : i9;
                        if (!z2) {
                            i9 = i10;
                        }
                        Point a = bou2.mo41058a(i13, i9);
                        Point point2 = a;
                        if (bou2.mo41060a(a.x, a.y, (double) zzlg2.f45719i)) {
                            point = point2;
                            break;
                        }
                    } else {
                        int a2 = bsf.m49933a(i9, 16) << 4;
                        int a3 = bsf.m49933a(i10, 16) << 4;
                        if (a2 * a3 <= boy.m49611b()) {
                            int i14 = z2 ? a3 : a2;
                            if (z2) {
                                a3 = a2;
                            }
                            point = new Point(i14, a3);
                        }
                    }
                    i8++;
                    i6 = i11;
                    i7 = i12;
                }
                point = null;
                if (point != null) {
                    i5 = Math.max(i5, point.x);
                    i3 = Math.max(i3, point.y);
                    i4 = Math.max(i4, m49958a(zzlg2.f45713c, i5, i3));
                }
            }
            bsq = new bsq(i5, i3, i4);
        }
        this.f43444p = bsq;
        bsq bsq2 = this.f43444p;
        boolean z3 = this.f43441m;
        int i15 = this.f43432J;
        MediaFormat b = zzlg.mo42354b();
        b.setInteger("max-width", bsq2.f43455a);
        b.setInteger("max-height", bsq2.f43456b);
        if (bsq2.f43457c != -1) {
            b.setInteger("max-input-size", bsq2.f43457c);
        }
        if (z3) {
            b.setInteger("auto-frc", 0);
        }
        if (i15 != 0) {
            b.setFeatureEnabled("tunneled-playback", true);
            b.setInteger("audio-session-id", i15);
        }
        if (this.f43445q == null) {
            brr.m49873b(m49963b(bou2.f43066d));
            if (this.f43446r == null) {
                this.f43446r = zztc.m53208a(this.f43436h, bou2.f43066d);
            }
            this.f43445q = this.f43446r;
        }
        mediaCodec2.configure(b, this.f43445q, null, 0);
        if (bsf.f43399a >= 23 && this.f43431I) {
            this.f43435f = new bsr(this, mediaCodec2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo41068w() {
        try {
            super.mo41068w();
        } finally {
            if (this.f43446r != null) {
                if (this.f43445q == this.f43446r) {
                    this.f43445q = null;
                }
                this.f43446r.release();
                this.f43446r = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40971a(String str, long j, long j2) {
        this.f43438j.mo41266a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40973b(zzlg zzlg) throws zzkt {
        super.mo40973b(zzlg);
        this.f43438j.mo41265a(zzlg);
        this.f43454z = zzlg.f45721k == -1.0f ? 1.0f : zzlg.f45721k;
        this.f43453y = m49966d(zzlg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41064a(bmw bmw) {
        if (bsf.f43399a < 23 && this.f43431I) {
            mo40974s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40969a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f43423A = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f43424B = i2;
        this.f43426D = this.f43454z;
        if (bsf.f43399a < 21) {
            this.f43425C = this.f43453y;
        } else if (this.f43453y == 90 || this.f43453y == 270) {
            int i3 = this.f43423A;
            this.f43423A = this.f43424B;
            this.f43424B = i3;
            this.f43426D = 1.0f / this.f43426D;
        }
        mediaCodec.setVideoScalingMode(this.f43447s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo41065a(MediaCodec mediaCodec, boolean z, zzlg zzlg, zzlg zzlg2) {
        return m49961a(z, zzlg, zzlg2) && zzlg2.f45717g <= this.f43444p.f43455a && zzlg2.f45718h <= this.f43444p.f43456b && zzlg2.f45714d <= this.f43444p.f43457c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40972a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (this.f43434L != 0 && j4 >= this.f43442n[0]) {
            this.f43433K = this.f43442n[0];
            this.f43434L--;
            System.arraycopy(this.f43442n, 1, this.f43442n, 0, this.f43434L);
        }
        long j5 = j4 - this.f43433K;
        if (z) {
            m49959a(mediaCodec2, i3, j5);
            return true;
        }
        long j6 = j4 - j;
        if (this.f43445q == this.f43446r) {
            if (!m49965c(j6)) {
                return false;
            }
            m49959a(mediaCodec2, i3, j5);
            return true;
        } else if (!this.f43448t) {
            if (bsf.f43399a >= 21) {
                m49960a(mediaCodec, i, j5, System.nanoTime());
            } else {
                m49962b(mediaCodec2, i3, j5);
            }
            return true;
        } else if (mo40835d() != 2) {
            return false;
        } else {
            long elapsedRealtime = j6 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long a = this.f43437i.mo41254a(j4, (elapsedRealtime * 1000) + nanoTime);
            long j7 = (a - nanoTime) / 1000;
            if (m49965c(j7)) {
                bse.m49930a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                bse.m49929a();
                this.f43087e.f42710f++;
                this.f43451w++;
                this.f43452x++;
                this.f43087e.f42711g = Math.max(this.f43452x, this.f43087e.f42711g);
                if (this.f43451w == this.f43440l) {
                    m49957B();
                }
                return true;
            }
            if (bsf.f43399a >= 21) {
                if (j7 < 50000) {
                    m49960a(mediaCodec, i, j5, a);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m49962b(mediaCodec2, i3, j5);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m49959a(MediaCodec mediaCodec, int i, long j) {
        bse.m49930a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        bse.m49929a();
        this.f43087e.f42709e++;
    }

    /* renamed from: b */
    private final void m49962b(MediaCodec mediaCodec, int i, long j) {
        m49970z();
        bse.m49930a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        bse.m49929a();
        this.f43087e.f42708d++;
        this.f43452x = 0;
        mo40974s();
    }

    /* renamed from: a */
    private final void m49960a(MediaCodec mediaCodec, int i, long j, long j2) {
        m49970z();
        bse.m49930a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        bse.m49929a();
        this.f43087e.f42708d++;
        this.f43452x = 0;
        mo40974s();
    }

    /* renamed from: b */
    private final boolean m49963b(boolean z) {
        return bsf.f43399a >= 23 && !this.f43431I && (!z || zztc.m53209a(this.f43436h));
    }

    /* renamed from: t */
    private final void m49967t() {
        this.f43449u = this.f43439k > 0 ? SystemClock.elapsedRealtime() + this.f43439k : -9223372036854775807L;
    }

    /* renamed from: x */
    private final void m49968x() {
        this.f43448t = false;
        if (bsf.f43399a >= 23 && this.f43431I) {
            MediaCodec mediaCodec = this.f43085c;
            if (mediaCodec != null) {
                this.f43435f = new bsr(this, mediaCodec);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final void mo40974s() {
        if (!this.f43448t) {
            this.f43448t = true;
            this.f43438j.mo41263a(this.f43445q);
        }
    }

    /* renamed from: y */
    private final void m49969y() {
        this.f43427E = -1;
        this.f43428F = -1;
        this.f43430H = -1.0f;
        this.f43429G = -1;
    }

    /* renamed from: z */
    private final void m49970z() {
        if (this.f43427E != this.f43423A || this.f43428F != this.f43424B || this.f43429G != this.f43425C || this.f43430H != this.f43426D) {
            this.f43438j.mo41261a(this.f43423A, this.f43424B, this.f43425C, this.f43426D);
            this.f43427E = this.f43423A;
            this.f43428F = this.f43424B;
            this.f43429G = this.f43425C;
            this.f43430H = this.f43426D;
        }
    }

    /* renamed from: A */
    private final void m49956A() {
        if (this.f43427E != -1 || this.f43428F != -1) {
            this.f43438j.mo41261a(this.f43423A, this.f43424B, this.f43425C, this.f43426D);
        }
    }

    /* renamed from: B */
    private final void m49957B() {
        if (this.f43451w > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f43438j.mo41262a(this.f43451w, elapsedRealtime - this.f43450v);
            this.f43451w = 0;
            this.f43450v = elapsedRealtime;
        }
    }

    /* renamed from: c */
    private static int m49964c(zzlg zzlg) {
        if (zzlg.f45714d != -1) {
            return zzlg.f45714d;
        }
        return m49958a(zzlg.f45713c, zzlg.f45717g, zzlg.f45718h);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m49958a(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x007e
            if (r7 != r0) goto L_0x0007
            goto L_0x007e
        L_0x0007:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 4
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x0044;
                case -1662541442: goto L_0x003a;
                case 1187890754: goto L_0x0030;
                case 1331836730: goto L_0x0026;
                case 1599127256: goto L_0x001c;
                case 1599127257: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004e
        L_0x0012:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 5
            goto L_0x004f
        L_0x001c:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 3
            goto L_0x004f
        L_0x0026:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 2
            goto L_0x004f
        L_0x0030:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 4
            goto L_0x004f
        L_0x0044:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 0
            goto L_0x004f
        L_0x004e:
            r5 = -1
        L_0x004f:
            switch(r5) {
                case 0: goto L_0x0075;
                case 1: goto L_0x0075;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                case 4: goto L_0x0053;
                case 5: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            return r0
        L_0x0053:
            int r6 = r6 * r7
            goto L_0x0078
        L_0x0056:
            int r6 = r6 * r7
            goto L_0x0077
        L_0x0059:
            java.lang.String r5 = "BRAVIA 4K 2015"
            java.lang.String r1 = com.google.android.gms.internal.ads.bsf.f43402d
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0064
            return r0
        L_0x0064:
            r5 = 16
            int r6 = com.google.android.gms.internal.ads.bsf.m49933a(r6, r5)
            int r5 = com.google.android.gms.internal.ads.bsf.m49933a(r7, r5)
            int r6 = r6 * r5
            int r5 = r6 << 4
            int r6 = r5 << 4
            goto L_0x0077
        L_0x0075:
            int r6 = r6 * r7
        L_0x0077:
            r3 = 2
        L_0x0078:
            int r6 = r6 * 3
            int r3 = r3 * 2
            int r6 = r6 / r3
            return r6
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bso.m49958a(java.lang.String, int, int):int");
    }

    /* renamed from: a */
    private static boolean m49961a(boolean z, zzlg zzlg, zzlg zzlg2) {
        return zzlg.f45713c.equals(zzlg2.f45713c) && m49966d(zzlg) == m49966d(zzlg2) && (z || (zzlg.f45717g == zzlg2.f45717g && zzlg.f45718h == zzlg2.f45718h));
    }

    /* renamed from: d */
    private static int m49966d(zzlg zzlg) {
        if (zzlg.f45720j == -1) {
            return 0;
        }
        return zzlg.f45720j;
    }
}
