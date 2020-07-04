package com.fasterxml.jackson.core.p737io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.io.a */
abstract class C14672a extends Reader {

    /* renamed from: a */
    protected final C14674c f37918a;

    /* renamed from: b */
    protected InputStream f37919b;

    /* renamed from: c */
    protected byte[] f37920c;

    /* renamed from: d */
    protected int f37921d;

    /* renamed from: e */
    protected int f37922e;

    /* renamed from: f */
    protected char[] f37923f;

    /* renamed from: b */
    protected static void m42434b() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    /* renamed from: a */
    public final void mo37191a() {
        byte[] bArr = this.f37920c;
        if (bArr != null) {
            this.f37920c = null;
            this.f37918a.mo37195a(bArr);
        }
    }

    public void close() throws IOException {
        InputStream inputStream = this.f37919b;
        if (inputStream != null) {
            this.f37919b = null;
            mo37191a();
            inputStream.close();
        }
    }

    public int read() throws IOException {
        if (this.f37923f == null) {
            this.f37923f = new char[1];
        }
        if (read(this.f37923f, 0, 1) <= 0) {
            return -1;
        }
        return this.f37923f[0];
    }

    /* renamed from: a */
    protected static void m42433a(char[] cArr, int i, int i2) throws IOException {
        StringBuilder sb = new StringBuilder("read(buf,");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("), cbuf[");
        sb.append(cArr.length);
        sb.append("]");
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    protected C14672a(C14674c cVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f37918a = cVar;
        this.f37919b = inputStream;
        this.f37920c = bArr;
        this.f37921d = i;
        this.f37922e = i2;
    }
}
