package com.bytedance.ies.p555c;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.ies.c.c */
class C10716c extends InputStream {

    /* renamed from: a */
    private InputStream f28637a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25597a(IOException iOException) {
    }

    public boolean markSupported() {
        return this.f28637a.markSupported();
    }

    public int available() throws IOException {
        try {
            return this.f28637a.available();
        } catch (IOException e) {
            mo25597a(e);
            throw e;
        }
    }

    public void close() throws IOException {
        try {
            this.f28637a.close();
        } catch (IOException e) {
            mo25597a(e);
            throw e;
        }
    }

    public int read() throws IOException {
        try {
            return this.f28637a.read();
        } catch (IOException e) {
            mo25597a(e);
            throw e;
        }
    }

    public synchronized void reset() throws IOException {
        try {
            this.f28637a.reset();
        } catch (IOException e) {
            mo25597a(e);
            throw e;
        }
    }

    public C10716c(InputStream inputStream) {
        this.f28637a = inputStream;
    }

    public synchronized void mark(int i) {
        this.f28637a.mark(i);
    }

    public long skip(long j) throws IOException {
        try {
            return this.f28637a.skip(j);
        } catch (IOException e) {
            mo25597a(e);
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f28637a.read(bArr);
        } catch (IOException e) {
            mo25597a(e);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f28637a.read(bArr, i, i2);
        } catch (IOException e) {
            mo25597a(e);
            throw e;
        }
    }
}
