package com.facebook.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.internal.a */
public final class C13299a {
    /* renamed from: a */
    public static long m38925a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C13307g.m38940a(inputStream);
        C13307g.m38940a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static int m38924a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        C13307g.m38940a(inputStream);
        C13307g.m38940a(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3 + 0, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
