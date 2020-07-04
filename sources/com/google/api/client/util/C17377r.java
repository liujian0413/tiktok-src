package com.google.api.client.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.util.r */
public final class C17377r extends FilterOutputStream {

    /* renamed from: a */
    public final C17375p f48322a;

    public final void close() throws IOException {
        this.f48322a.close();
        super.close();
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        this.f48322a.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f48322a.write(bArr, i, i2);
    }

    public C17377r(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.f48322a = new C17375p(logger, level, i);
    }
}
