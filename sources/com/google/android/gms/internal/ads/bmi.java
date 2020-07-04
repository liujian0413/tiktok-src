package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class bmi implements bls {

    /* renamed from: b */
    public int[] f42625b;

    /* renamed from: c */
    private int f42626c = -1;

    /* renamed from: d */
    private int f42627d = -1;

    /* renamed from: e */
    private boolean f42628e;

    /* renamed from: f */
    private int[] f42629f;

    /* renamed from: g */
    private ByteBuffer f42630g = f42532a;

    /* renamed from: h */
    private ByteBuffer f42631h = f42532a;

    /* renamed from: i */
    private boolean f42632i;

    /* renamed from: a */
    public final boolean mo40918a(int i, int i2, int i3) throws zzlx {
        boolean z = !Arrays.equals(this.f42625b, this.f42629f);
        this.f42629f = this.f42625b;
        if (this.f42629f == null) {
            this.f42628e = false;
            return z;
        } else if (i3 != 2) {
            throw new zzlx(i, i2, i3);
        } else if (!z && this.f42627d == i && this.f42626c == i2) {
            return false;
        } else {
            this.f42627d = i;
            this.f42626c = i2;
            this.f42628e = i2 != this.f42629f.length;
            int i4 = 0;
            while (i4 < this.f42629f.length) {
                int i5 = this.f42629f[i4];
                if (i5 < i2) {
                    this.f42628e = (i5 != i4) | this.f42628e;
                    i4++;
                } else {
                    throw new zzlx(i, i2, i3);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo40917a() {
        return this.f42628e;
    }

    /* renamed from: b */
    public final int mo40919b() {
        return this.f42629f == null ? this.f42626c : this.f42629f.length;
    }

    /* renamed from: a */
    public final void mo40916a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f42626c * 2)) * this.f42629f.length) << 1;
        if (this.f42630g.capacity() < length) {
            this.f42630g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f42630g.clear();
        }
        while (position < limit) {
            for (int i : this.f42629f) {
                this.f42630g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f42626c << 1;
        }
        byteBuffer.position(limit);
        this.f42630g.flip();
        this.f42631h = this.f42630g;
    }

    /* renamed from: c */
    public final void mo40920c() {
        this.f42632i = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo40921d() {
        ByteBuffer byteBuffer = this.f42631h;
        this.f42631h = f42532a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final boolean mo40922e() {
        return this.f42632i && this.f42631h == f42532a;
    }

    /* renamed from: f */
    public final void mo40923f() {
        this.f42631h = f42532a;
        this.f42632i = false;
    }

    /* renamed from: g */
    public final void mo40924g() {
        mo40923f();
        this.f42630g = f42532a;
        this.f42626c = -1;
        this.f42627d = -1;
        this.f42629f = null;
        this.f42628e = false;
    }
}
