package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.api.client.util.e */
public final class C17359e {

    /* renamed from: com.google.api.client.util.e$a */
    static final class C17360a extends FilterInputStream {

        /* renamed from: a */
        private long f48273a;

        /* renamed from: b */
        private long f48274b = -1;

        public final int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f48273a);
        }

        public final int read() throws IOException {
            if (this.f48273a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f48273a--;
            }
            return read;
        }

        public final synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f48274b != -1) {
                this.in.reset();
                this.f48273a = this.f48274b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public final synchronized void mark(int i) {
            this.in.mark(i);
            this.f48274b = this.f48273a;
        }

        public final long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f48273a));
            this.f48273a -= skip;
            return skip;
        }

        C17360a(InputStream inputStream, long j) {
            boolean z;
            super(inputStream);
            C17384w.m57847a(inputStream);
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C17384w.m57851a(z, (Object) "limit must be non-negative");
            this.f48273a = j;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f48273a == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, this.f48273a));
            if (read != -1) {
                this.f48273a -= (long) read;
            }
            return read;
        }
    }

    /* renamed from: a */
    public static InputStream m57797a(InputStream inputStream, long j) {
        return new C17360a(inputStream, j);
    }

    /* renamed from: a */
    public static long m57796a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C17384w.m57847a(inputStream);
        C17384w.m57847a(outputStream);
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
    public static int m57795a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        C17384w.m57847a(inputStream);
        C17384w.m57847a(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
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
