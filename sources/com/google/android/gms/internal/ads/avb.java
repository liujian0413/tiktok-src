package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class avb implements apo {

    /* renamed from: a */
    private final avm f41091a;

    /* renamed from: b */
    private final aqb f41092b;

    /* renamed from: c */
    private final int f41093c;

    public avb(avm avm, aqb aqb, int i) {
        this.f41091a = avm;
        this.f41092b = aqb;
        this.f41093c = i;
    }

    /* renamed from: a */
    public final byte[] mo39926a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f41091a.mo40050a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return aum.m47316a(a, this.f41092b.mo39947a(aum.m47316a(bArr2, a, copyOf)));
    }
}
