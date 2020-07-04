package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.api.client.util.d */
final class C17358d extends OutputStream {

    /* renamed from: a */
    long f48272a;

    C17358d() {
    }

    public final void write(int i) throws IOException {
        this.f48272a++;
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f48272a += (long) i2;
    }
}
