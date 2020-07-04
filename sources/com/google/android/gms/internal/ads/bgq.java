package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

public final class bgq extends bgu {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final bgt f41930e;

    /* renamed from: f */
    private final bhr f41931f;

    /* renamed from: g */
    private int f41932g;

    /* renamed from: h */
    private long f41933h;

    public bgq(bho bho, Handler handler, bgt bgt) {
        this(bho, null, true, handler, bgt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40653a() {
        return true;
    }

    private bgq(bho bho, bhy bhy, boolean z, Handler handler, bgt bgt) {
        super(bho, null, true, handler, bgt);
        this.f41930e = bgt;
        this.f41931f = new bhr();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bgg mo40648a(String str, boolean z) throws zzgy {
        if (bki.m49068c(str)) {
            return new bgg("OMX.google.raw.decoder", true);
        }
        return super.mo40648a(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40651a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        if ("OMX.google.raw.decoder".equals(str)) {
            String string = mediaFormat.getString("mime");
            mediaFormat.setString("mime", "audio/raw");
            mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
            mediaFormat.setString("mime", string);
            return;
        }
        mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40655a(String str) {
        return bki.m49067b(str) && super.mo40655a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40650a(long j, boolean z) {
        super.mo40650a(j, z);
        this.f41933h = Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40652a(bhl bhl, MediaFormat mediaFormat) {
        if (bki.m49068c(bhl.f42012a)) {
            this.f41931f.mo40707a(bhl.mo40691b(), 0);
        } else {
            this.f41931f.mo40707a(mediaFormat, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40656b() {
        super.mo40656b();
        this.f41931f.mo40709b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo40657c() {
        this.f41931f.mo40713f();
        super.mo40657c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo40658d() {
        return super.mo40658d() && (!this.f41931f.mo40711d() || !this.f41931f.mo40712e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo40659e() {
        return this.f41931f.mo40711d() || (super.mo40659e() && this.f41946c == 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo40660f() {
        long a = this.f41931f.mo40705a(mo40658d());
        if (a == Long.MIN_VALUE) {
            this.f41933h = Math.max(this.f41933h, super.mo40660f());
        } else {
            this.f41933h = Math.max(this.f41933h, a);
        }
        return this.f41933h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo40661g() {
        this.f41932g = 0;
        try {
            this.f41931f.mo40714g();
        } finally {
            super.mo40661g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40649a(long j) throws zzgc {
        super.mo40649a(j);
        this.f41931f.mo40714g();
        this.f41933h = Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40654a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) throws zzgc {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f41944a.f41875f++;
            this.f41931f.mo40710c();
            return true;
        }
        if (!this.f41931f.mo40708a()) {
            try {
                if (this.f41932g != 0) {
                    this.f41931f.mo40703a(this.f41932g);
                } else {
                    this.f41932g = this.f41931f.mo40703a(0);
                }
                if (this.f42035d == 3) {
                    this.f41931f.mo40709b();
                }
            } catch (zzht e) {
                if (!(this.f41945b == null || this.f41930e == null)) {
                    this.f41945b.post(new bgr(this, e));
                }
                throw new zzgc((Throwable) e);
            }
        }
        try {
            int a = this.f41931f.mo40704a(byteBuffer, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs);
            if ((a & 1) != 0) {
                this.f41933h = Long.MIN_VALUE;
            }
            if ((a & 2) == 0) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f41944a.f41874e++;
            return true;
        } catch (zzhu e2) {
            if (!(this.f41945b == null || this.f41930e == null)) {
                this.f41945b.post(new bgs(this, e2));
            }
            throw new zzgc((Throwable) e2);
        }
    }

    /* renamed from: a */
    public final void mo40619a(int i, Object obj) throws zzgc {
        if (i == 1) {
            this.f41931f.mo40706a(((Float) obj).floatValue());
        } else {
            super.mo40619a(i, obj);
        }
    }
}
