package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class bmw extends bmq {

    /* renamed from: b */
    public final bmr f42712b = new bmr();

    /* renamed from: c */
    public ByteBuffer f42713c;

    /* renamed from: d */
    public long f42714d;

    /* renamed from: e */
    private final int f42715e = 0;

    public bmw(int i) {
    }

    /* renamed from: c */
    public final void mo40991c(int i) throws IllegalStateException {
        if (this.f42713c == null) {
            this.f42713c = m49402d(i);
            return;
        }
        int capacity = this.f42713c.capacity();
        int position = this.f42713c.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer d = m49402d(i2);
            if (position > 0) {
                this.f42713c.position(0);
                this.f42713c.limit(position);
                d.put(this.f42713c);
            }
            this.f42713c = d;
        }
    }

    /* renamed from: e */
    public final boolean mo40992e() {
        return mo40985b(1073741824);
    }

    /* renamed from: a */
    public final void mo40982a() {
        super.mo40982a();
        if (this.f42713c != null) {
            this.f42713c.clear();
        }
    }

    /* renamed from: d */
    private final ByteBuffer m49402d(int i) {
        int capacity = this.f42713c == null ? 0 : this.f42713c.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
