package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

final class bwi extends PushbackInputStream {

    /* renamed from: a */
    private final /* synthetic */ bwe f44055a;

    bwi(bwe bwe, InputStream inputStream, int i) {
        this.f44055a = bwe;
        super(inputStream, 1);
    }

    public final synchronized void close() throws IOException {
        this.f44055a.f44042a.m50193a();
        super.close();
    }
}
