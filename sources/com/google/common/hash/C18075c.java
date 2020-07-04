package com.google.common.hash;

import com.google.common.base.C17439m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.common.hash.c */
abstract class C18075c extends C18074b {

    /* renamed from: a */
    private final ByteBuffer f49404a;

    /* renamed from: b */
    private final int f49405b;

    /* renamed from: c */
    private final int f49406c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo46678a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C18080e mo46679b();

    /* renamed from: c */
    private void m59785c() {
        this.f49404a.flip();
        while (this.f49404a.remaining() >= this.f49406c) {
            mo46678a(this.f49404a);
        }
        this.f49404a.compact();
    }

    /* renamed from: a */
    public final C18080e mo46677a() {
        m59785c();
        this.f49404a.flip();
        if (this.f49404a.remaining() > 0) {
            mo46680b(this.f49404a);
            this.f49404a.position(this.f49404a.limit());
        }
        return mo46679b();
    }

    protected C18075c(int i) {
        this(16, 16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo46680b(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(this.f49406c + 7);
        while (byteBuffer.position() < this.f49406c) {
            byteBuffer.putLong(0);
        }
        byteBuffer.limit(this.f49406c);
        byteBuffer.flip();
        mo46678a(byteBuffer);
    }

    private C18075c(int i, int i2) {
        boolean z;
        if (i2 % i == 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        this.f49404a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f49405b = i2;
        this.f49406c = i;
    }
}
