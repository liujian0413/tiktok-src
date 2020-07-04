package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class bmp implements bls {

    /* renamed from: b */
    public long f42676b;

    /* renamed from: c */
    public long f42677c;

    /* renamed from: d */
    private int f42678d = -1;

    /* renamed from: e */
    private int f42679e = -1;

    /* renamed from: f */
    private bmo f42680f;

    /* renamed from: g */
    private float f42681g = 1.0f;

    /* renamed from: h */
    private float f42682h = 1.0f;

    /* renamed from: i */
    private ByteBuffer f42683i = f42532a;

    /* renamed from: j */
    private ShortBuffer f42684j = this.f42683i.asShortBuffer();

    /* renamed from: k */
    private ByteBuffer f42685k = f42532a;

    /* renamed from: l */
    private boolean f42686l;

    /* renamed from: a */
    public final float mo40980a(float f) {
        this.f42681g = bsf.m49931a(f, 0.1f, 8.0f);
        return this.f42681g;
    }

    /* renamed from: b */
    public final float mo40981b(float f) {
        this.f42682h = bsf.m49931a(f, 0.1f, 8.0f);
        return f;
    }

    /* renamed from: a */
    public final boolean mo40918a(int i, int i2, int i3) throws zzlx {
        if (i3 != 2) {
            throw new zzlx(i, i2, i3);
        } else if (this.f42679e == i && this.f42678d == i2) {
            return false;
        } else {
            this.f42679e = i;
            this.f42678d = i2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo40917a() {
        return Math.abs(this.f42681g - 1.0f) >= 0.01f || Math.abs(this.f42682h - 1.0f) >= 0.01f;
    }

    /* renamed from: b */
    public final int mo40919b() {
        return this.f42678d;
    }

    /* renamed from: a */
    public final void mo40916a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f42676b += (long) remaining;
            this.f42680f.mo40978a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i = (this.f42680f.f42654c * this.f42678d) << 1;
        if (i > 0) {
            if (this.f42683i.capacity() < i) {
                this.f42683i = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f42684j = this.f42683i.asShortBuffer();
            } else {
                this.f42683i.clear();
                this.f42684j.clear();
            }
            this.f42680f.mo40979b(this.f42684j);
            this.f42677c += (long) i;
            this.f42683i.limit(i);
            this.f42685k = this.f42683i;
        }
    }

    /* renamed from: c */
    public final void mo40920c() {
        this.f42680f.mo40977a();
        this.f42686l = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo40921d() {
        ByteBuffer byteBuffer = this.f42685k;
        this.f42685k = f42532a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final boolean mo40922e() {
        return this.f42686l && (this.f42680f == null || this.f42680f.f42654c == 0);
    }

    /* renamed from: f */
    public final void mo40923f() {
        this.f42680f = new bmo(this.f42679e, this.f42678d);
        this.f42680f.f42652a = this.f42681g;
        this.f42680f.f42653b = this.f42682h;
        this.f42685k = f42532a;
        this.f42676b = 0;
        this.f42677c = 0;
        this.f42686l = false;
    }

    /* renamed from: g */
    public final void mo40924g() {
        this.f42680f = null;
        this.f42683i = f42532a;
        this.f42684j = this.f42683i.asShortBuffer();
        this.f42685k = f42532a;
        this.f42678d = -1;
        this.f42679e = -1;
        this.f42676b = 0;
        this.f42677c = 0;
        this.f42686l = false;
    }
}
