package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.rl */
final class C16007rl extends FilterInputStream {

    /* renamed from: a */
    private final HttpURLConnection f44932a;

    C16007rl(HttpURLConnection httpURLConnection) {
        super(C15979qk.m51965b(httpURLConnection));
        this.f44932a = httpURLConnection;
    }

    public final void close() throws IOException {
        super.close();
        this.f44932a.disconnect();
    }
}
