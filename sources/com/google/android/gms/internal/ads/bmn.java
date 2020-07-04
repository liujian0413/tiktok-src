package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class bmn implements bls {

    /* renamed from: b */
    private int f42646b = -1;

    /* renamed from: c */
    private int f42647c = -1;

    /* renamed from: d */
    private int f42648d;

    /* renamed from: e */
    private ByteBuffer f42649e = f42532a;

    /* renamed from: f */
    private ByteBuffer f42650f = f42532a;

    /* renamed from: g */
    private boolean f42651g;

    /* renamed from: a */
    public final boolean mo40918a(int i, int i2, int i3) throws zzlx {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new zzlx(i, i2, i3);
        } else if (this.f42646b == i && this.f42647c == i2 && this.f42648d == i3) {
            return false;
        } else {
            this.f42646b = i;
            this.f42647c = i2;
            this.f42648d = i3;
            if (i3 == 2) {
                this.f42649e = f42532a;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo40917a() {
        return (this.f42648d == 0 || this.f42648d == 2) ? false : true;
    }

    /* renamed from: b */
    public final int mo40919b() {
        return this.f42647c;
    }

    /* renamed from: a */
    public final void mo40916a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f42648d;
        if (i3 == Integer.MIN_VALUE) {
            i = (i2 / 3) << 1;
        } else if (i3 == 3) {
            i = i2 << 1;
        } else if (i3 == 1073741824) {
            i = i2 / 2;
        } else {
            throw new IllegalStateException();
        }
        if (this.f42649e.capacity() < i) {
            this.f42649e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f42649e.clear();
        }
        int i4 = this.f42648d;
        if (i4 == Integer.MIN_VALUE) {
            while (position < limit) {
                this.f42649e.put(byteBuffer.get(position + 1));
                this.f42649e.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i4 == 3) {
            while (position < limit) {
                this.f42649e.put(0);
                this.f42649e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i4 == 1073741824) {
            while (position < limit) {
                this.f42649e.put(byteBuffer.get(position + 2));
                this.f42649e.put(byteBuffer.get(position + 3));
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        this.f42649e.flip();
        this.f42650f = this.f42649e;
    }

    /* renamed from: c */
    public final void mo40920c() {
        this.f42651g = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo40921d() {
        ByteBuffer byteBuffer = this.f42650f;
        this.f42650f = f42532a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final boolean mo40922e() {
        return this.f42651g && this.f42650f == f42532a;
    }

    /* renamed from: f */
    public final void mo40923f() {
        this.f42650f = f42532a;
        this.f42651g = false;
    }

    /* renamed from: g */
    public final void mo40924g() {
        mo40923f();
        this.f42649e = f42532a;
        this.f42646b = -1;
        this.f42647c = -1;
        this.f42648d = 0;
    }
}
