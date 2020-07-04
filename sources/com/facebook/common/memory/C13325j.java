package com.facebook.common.memory;

import com.facebook.common.internal.C13307g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.memory.j */
public final class C13325j {

    /* renamed from: a */
    private final int f35226a;

    /* renamed from: b */
    private final C13316a f35227b;

    public C13325j(C13316a aVar) {
        this(aVar, 16384);
    }

    private C13325j(C13316a aVar, int i) {
        C13307g.m38943a(true);
        this.f35226a = 16384;
        this.f35227b = aVar;
    }

    /* renamed from: a */
    public final long mo32605a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = (byte[]) this.f35227b.mo32581a(this.f35226a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f35226a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.f35227b.mo32582a(bArr);
            }
        }
    }
}
