package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class bci extends bcg implements aan {

    /* renamed from: a */
    private int f41450a;

    /* renamed from: b */
    private int f41451b;

    protected bci(String str) {
        super(str);
    }

    /* renamed from: c */
    public final int mo40494c() {
        if (!this.f41437c) {
            mo40491b();
        }
        return this.f41450a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo40493b(ByteBuffer byteBuffer) {
        this.f41450a = C16223zm.m52628a(byteBuffer.get());
        this.f41451b = (C16223zm.m52630b(byteBuffer) << 8) + 0 + C16223zm.m52628a(byteBuffer.get());
        return 4;
    }
}
