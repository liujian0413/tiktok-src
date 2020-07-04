package com.bytedance.common.wschannel.channel.p486a.p487a.p489b;

import okio.Buffer.UnsafeCursor;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.d */
public final class C9785d {
    /* renamed from: b */
    static void m28848b(int i) {
        String a = m28846a(i);
        if (a != null) {
            throw new IllegalArgumentException(a);
        }
    }

    /* renamed from: a */
    static String m28846a(int i) {
        if (i < 1000 || i >= 5000) {
            StringBuilder sb = new StringBuilder("Code must be in range [1000,5000): ");
            sb.append(i);
            return sb.toString();
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder("Code ");
            sb2.append(i);
            sb2.append(" is reserved and may not be used.");
            return sb2.toString();
        }
    }

    /* renamed from: a */
    static void m28847a(UnsafeCursor unsafeCursor, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i2 = unsafeCursor.start;
            int i3 = unsafeCursor.end;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (unsafeCursor.next() != -1);
    }
}
