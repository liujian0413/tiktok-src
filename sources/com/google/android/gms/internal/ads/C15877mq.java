package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.mq */
final class C15877mq extends FilterInputStream {

    /* renamed from: a */
    private final long f44667a;

    /* renamed from: b */
    private long f44668b;

    C15877mq(InputStream inputStream, long j) {
        super(inputStream);
        this.f44667a = j;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f44668b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f44668b += (long) read;
        }
        return read;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo41758a() {
        return this.f44667a - this.f44668b;
    }
}
