package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class bhf extends bgu {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final bhj f41987e;

    /* renamed from: f */
    private final long f41988f;

    /* renamed from: g */
    private final int f41989g;

    /* renamed from: h */
    private final int f41990h;

    /* renamed from: i */
    private Surface f41991i;

    /* renamed from: j */
    private boolean f41992j;

    /* renamed from: k */
    private boolean f41993k;

    /* renamed from: l */
    private long f41994l;

    /* renamed from: m */
    private long f41995m;

    /* renamed from: n */
    private int f41996n;

    /* renamed from: o */
    private int f41997o;

    /* renamed from: p */
    private int f41998p;

    /* renamed from: q */
    private float f41999q;

    /* renamed from: r */
    private int f42000r;

    /* renamed from: s */
    private int f42001s;

    /* renamed from: t */
    private float f42002t;

    public bhf(bho bho, int i, long j, Handler handler, bhj bhj, int i2) {
        this(bho, null, true, 1, 0, null, handler, bhj, -1);
    }

    private bhf(bho bho, bhy bhy, boolean z, int i, long j, bhk bhk, Handler handler, bhj bhj, int i2) {
        super(bho, null, true, handler, bhj);
        this.f41989g = 1;
        this.f41987e = bhj;
        this.f41990h = -1;
        this.f41994l = -1;
        this.f41997o = -1;
        this.f41998p = -1;
        this.f41999q = -1.0f;
        this.f42000r = -1;
        this.f42001s = -1;
        this.f42002t = -1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40655a(String str) {
        return bki.m49066a(str).equals("video") && super.mo40655a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40650a(long j, boolean z) {
        super.mo40650a(j, z);
        this.f41993k = false;
        if (z && this.f41988f > 0) {
            this.f41994l = (SystemClock.elapsedRealtime() * 1000) + this.f41988f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40649a(long j) throws zzgc {
        super.mo40649a(j);
        this.f41993k = false;
        this.f41994l = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo40659e() {
        if (super.mo40659e() && (this.f41993k || !mo40670j() || this.f41946c == 2)) {
            this.f41994l = -1;
            return true;
        } else if (this.f41994l == -1) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() * 1000 < this.f41994l) {
                return true;
            }
            this.f41994l = -1;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40656b() {
        super.mo40656b();
        this.f41996n = 0;
        this.f41995m = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo40657c() {
        this.f41994l = -1;
        m48787u();
        super.mo40657c();
    }

    /* renamed from: g */
    public final void mo40661g() {
        this.f41997o = -1;
        this.f41998p = -1;
        this.f41999q = -1.0f;
        this.f42000r = -1;
        this.f42001s = -1;
        this.f42002t = -1.0f;
        super.mo40661g();
    }

    /* renamed from: a */
    public final void mo40619a(int i, Object obj) throws zzgc {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.f41991i != surface) {
                this.f41991i = surface;
                this.f41992j = false;
                int i2 = this.f42035d;
                if (i2 == 2 || i2 == 3) {
                    mo40671k();
                    mo40668h();
                }
            }
            return;
        }
        super.mo40619a(i, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo40669i() {
        return super.mo40669i() && this.f41991i != null && this.f41991i.isValid();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40651a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, this.f41991i, mediaCrypto, 0);
        mediaCodec.setVideoScalingMode(this.f41989g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40665a(bhm bhm) throws zzgc {
        float f;
        super.mo40665a(bhm);
        if (bhm.f42025a.f42016e == -1.0f) {
            f = 1.0f;
        } else {
            f = bhm.f42025a.f42016e;
        }
        this.f41999q = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40652a(bhl bhl, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f41997o = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f41998p = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40666a(MediaCodec mediaCodec, boolean z, bhl bhl, bhl bhl2) {
        return bhl2.f42012a.equals(bhl.f42012a) && (z || (bhl.f42014c == bhl2.f42014c && bhl.f42015d == bhl2.f42015d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40654a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) {
        if (z) {
            bkm.m49082a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            bkm.m49081a();
            this.f41944a.f41875f++;
            return true;
        }
        long elapsedRealtime = (bufferInfo.presentationTimeUs - j) - ((SystemClock.elapsedRealtime() * 1000) - j2);
        long nanoTime = System.nanoTime() + (elapsedRealtime * 1000);
        if (elapsedRealtime < -30000) {
            bkm.m49082a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            bkm.m49081a();
            this.f41944a.f41876g++;
            this.f41996n++;
            if (this.f41996n == this.f41990h) {
                m48787u();
            }
            return true;
        } else if (!this.f41993k) {
            m48784a(mediaCodec, i);
            return true;
        } else if (this.f42035d != 3) {
            return false;
        } else {
            if (bkn.f42386a >= 21) {
                if (elapsedRealtime < 50000) {
                    m48785s();
                    bkm.m49082a("releaseOutputBufferTimed");
                    mediaCodec.releaseOutputBuffer(i, nanoTime);
                    bkm.m49081a();
                    this.f41944a.f41874e++;
                    this.f41993k = true;
                    m48786t();
                    return true;
                }
            } else if (elapsedRealtime < 30000) {
                if (elapsedRealtime > 11000) {
                    try {
                        Thread.sleep((elapsedRealtime - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m48784a(mediaCodec, i);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m48784a(MediaCodec mediaCodec, int i) {
        m48785s();
        bkm.m49082a("renderVideoBufferImmediate");
        mediaCodec.releaseOutputBuffer(i, true);
        bkm.m49081a();
        this.f41944a.f41874e++;
        this.f41993k = true;
        m48786t();
    }

    /* renamed from: s */
    private final void m48785s() {
        if (this.f41945b != null && this.f41987e != null && (this.f42000r != this.f41997o || this.f42001s != this.f41998p || this.f42002t != this.f41999q)) {
            int i = this.f41997o;
            int i2 = this.f41998p;
            float f = this.f41999q;
            this.f41945b.post(new bhg(this, i, i2, f));
            this.f42000r = i;
            this.f42001s = i2;
            this.f42002t = f;
        }
    }

    /* renamed from: t */
    private final void m48786t() {
        if (this.f41945b != null && this.f41987e != null && !this.f41992j) {
            this.f41945b.post(new bhh(this, this.f41991i));
            this.f41992j = true;
        }
    }

    /* renamed from: u */
    private final void m48787u() {
        if (this.f41945b != null && this.f41987e != null && this.f41996n != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f41945b.post(new bhi(this, this.f41996n, elapsedRealtime - this.f41995m));
            this.f41996n = 0;
            this.f41995m = elapsedRealtime;
        }
    }
}
