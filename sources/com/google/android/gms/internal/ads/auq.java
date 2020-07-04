package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class auq implements apo {

    /* renamed from: a */
    private final auo f41047a;

    /* renamed from: b */
    private final auo f41048b;

    public auq(byte[] bArr) throws InvalidKeyException {
        this.f41047a = mo40055a(bArr, 1);
        this.f41048b = mo40055a(bArr, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract auo mo40055a(byte[] bArr, int i) throws InvalidKeyException;

    /* renamed from: a */
    public byte[] mo39926a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= (Integer.MAX_VALUE - this.f41047a.mo40051a()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f41047a.mo40051a() + 16);
            if (allocate.remaining() >= bArr.length + this.f41047a.mo40051a() + 16) {
                int position = allocate.position();
                this.f41047a.mo40054a(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f41047a.mo40051a()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f41048b.mo40053a(bArr3, 0).get(bArr4);
                int length = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length);
                order.put(allocate);
                order.position(i2);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                byte[] a = avo.m47380a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
