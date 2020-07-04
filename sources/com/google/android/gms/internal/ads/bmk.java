package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

public final class bmk extends bov implements brv {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final blu f42636f;

    /* renamed from: g */
    private final bmc f42637g;

    /* renamed from: h */
    private boolean f42638h;

    /* renamed from: i */
    private boolean f42639i;

    /* renamed from: j */
    private MediaFormat f42640j;

    /* renamed from: k */
    private int f42641k;

    /* renamed from: l */
    private int f42642l;

    /* renamed from: m */
    private long f42643m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f42644n;

    public bmk(bow bow) {
        this(bow, null, true);
    }

    /* renamed from: c */
    public final brv mo40834c() {
        return this;
    }

    private bmk(bow bow, bna<Object> bna, boolean z) {
        this(bow, null, true, null, null);
    }

    private bmk(bow bow, bna<Object> bna, boolean z, Handler handler, blt blt) {
        this(bow, null, true, null, null, null, new bls[0]);
    }

    private bmk(bow bow, bna<Object> bna, boolean z, Handler handler, blt blt, blr blr, bls... blsArr) {
        super(1, bow, null, true);
        this.f42637g = new bmc(null, blsArr, new bmm(this));
        this.f42636f = new blu(null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40966a(bow bow, zzlg zzlg) throws zzpj {
        String str = zzlg.f45713c;
        if (!brw.m49887a(str)) {
            return 0;
        }
        int i = bsf.f43399a >= 21 ? 16 : 0;
        int i2 = 3;
        if (m49337a(str) && bow.mo41069a() != null) {
            return i | 4 | 3;
        }
        bou a = bow.mo41070a(str, false);
        boolean z = true;
        if (a == null) {
            return 1;
        }
        if (bsf.f43399a >= 21 && ((zzlg.f45723m != -1 && !a.mo41059a(zzlg.f45723m)) || (zzlg.f45722l != -1 && !a.mo41062b(zzlg.f45722l)))) {
            z = false;
        }
        if (!z) {
            i2 = 2;
        }
        return i | 4 | i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bou mo40968a(bow bow, zzlg zzlg, boolean z) throws zzpj {
        if (m49337a(zzlg.f45713c)) {
            bou a = bow.mo41069a();
            if (a != null) {
                this.f42638h = true;
                return a;
            }
        }
        this.f42638h = false;
        return super.mo40968a(bow, zzlg, z);
    }

    /* renamed from: a */
    private final boolean m49337a(String str) {
        return this.f42637g.mo40943a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40970a(bou bou, MediaCodec mediaCodec, zzlg zzlg, MediaCrypto mediaCrypto) {
        this.f42639i = bsf.f43399a < 24 && "OMX.SEC.aac.dec".equals(bou.f43063a) && "samsung".equals(bsf.f43401c) && (bsf.f43400b.startsWith("zeroflte") || bsf.f43400b.startsWith("herolte") || bsf.f43400b.startsWith("heroqlte"));
        if (this.f42638h) {
            this.f42640j = zzlg.mo42354b();
            this.f42640j.setString("mime", "audio/raw");
            mediaCodec.configure(this.f42640j, null, null, 0);
            this.f42640j.setString("mime", zzlg.f45713c);
            return;
        }
        mediaCodec.configure(zzlg.mo42354b(), null, null, 0);
        this.f42640j = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40971a(String str, long j, long j2) {
        this.f42636f.mo40929a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40973b(zzlg zzlg) throws zzkt {
        super.mo40973b(zzlg);
        this.f42636f.mo40928a(zzlg);
        this.f42641k = "audio/raw".equals(zzlg.f45713c) ? zzlg.f45724n : 2;
        this.f42642l = zzlg.f45722l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40969a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzkt {
        int[] iArr;
        boolean z = this.f42640j != null;
        String string = z ? this.f42640j.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.f42640j;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f42639i || integer != 6 || this.f42642l >= 6) {
            iArr = null;
        } else {
            iArr = new int[this.f42642l];
            for (int i = 0; i < this.f42642l; i++) {
                iArr[i] = i;
            }
        }
        try {
            this.f42637g.mo40942a(string, integer, integer2, this.f42641k, 0, iArr);
        } catch (zzmk e) {
            throw zzkt.zza(e, this.f42391b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40829a(boolean z) throws zzkt {
        super.mo40829a(z);
        this.f42636f.mo40927a(this.f43087e);
        int i = this.f42390a.f42505b;
        if (i != 0) {
            this.f42637g.mo40946b(i);
        } else {
            this.f42637g.mo40950f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40827a(long j, boolean z) throws zzkt {
        super.mo40827a(j, z);
        this.f42637g.mo40952h();
        this.f42643m = j;
        this.f42644n = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo40844m() {
        super.mo40844m();
        this.f42637g.mo40939a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo40845n() {
        this.f42637g.mo40951g();
        super.mo40845n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo40846o() {
        try {
            this.f42637g.mo40953i();
            try {
                super.mo40846o();
            } finally {
                this.f42636f.mo40930b(this.f43087e);
            }
        } catch (Throwable th) {
            super.mo40846o();
            throw th;
        } finally {
            this.f42636f.mo40930b(this.f43087e);
        }
    }

    /* renamed from: r */
    public final boolean mo40898r() {
        return super.mo40898r() && this.f42637g.mo40948d();
    }

    /* renamed from: q */
    public final boolean mo40897q() {
        return this.f42637g.mo40949e() || super.mo40897q();
    }

    /* renamed from: s */
    public final long mo40974s() {
        long a = this.f42637g.mo40937a(mo40898r());
        if (a != Long.MIN_VALUE) {
            if (!this.f42644n) {
                a = Math.max(this.f42643m, a);
            }
            this.f42643m = a;
            this.f42644n = false;
        }
        return this.f42643m;
    }

    /* renamed from: a */
    public final bli mo40967a(bli bli) {
        return this.f42637g.mo40938a(bli);
    }

    /* renamed from: t */
    public final bli mo40975t() {
        return this.f42637g.f42577a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40972a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzkt {
        if (this.f42638h && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f43087e.f42709e++;
            this.f42637g.mo40945b();
            return true;
        } else {
            try {
                if (!this.f42637g.mo40944a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f43087e.f42708d++;
                return true;
            } catch (zzml | zzmo e) {
                throw zzkt.zza(e, this.f42391b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo40976u() throws zzkt {
        try {
            this.f42637g.mo40947c();
        } catch (zzmo e) {
            throw zzkt.zza(e, this.f42391b);
        }
    }

    /* renamed from: a */
    public final void mo40825a(int i, Object obj) throws zzkt {
        switch (i) {
            case 2:
                this.f42637g.mo40940a(((Float) obj).floatValue());
                return;
            case 3:
                this.f42637g.mo40941a(((Integer) obj).intValue());
                return;
            default:
                super.mo40825a(i, obj);
                return;
        }
    }
}
