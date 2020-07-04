package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.util.q */
public final class C17376q extends FilterInputStream {

    /* renamed from: a */
    public final C17375p f48321a;

    public final void close() throws IOException {
        this.f48321a.close();
        super.close();
    }

    public final int read() throws IOException {
        int read = super.read();
        this.f48321a.write(read);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f48321a.write(bArr, i, read);
        }
        return read;
    }

    public C17376q(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.f48321a = new C17375p(logger, level, i);
    }
}
