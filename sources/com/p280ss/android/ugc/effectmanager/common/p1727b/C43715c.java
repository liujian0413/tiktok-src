package com.p280ss.android.ugc.effectmanager.common.p1727b;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.c */
final class C43715c implements Closeable {

    /* renamed from: a */
    public final Charset f113211a;

    /* renamed from: b */
    private final InputStream f113212b;

    /* renamed from: c */
    private byte[] f113213c;

    /* renamed from: d */
    private int f113214d;

    /* renamed from: e */
    private int f113215e;

    /* renamed from: b */
    public final boolean mo105764b() {
        if (this.f113215e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m138545c() throws IOException {
        int read = this.f113212b.read(this.f113213c, 0, this.f113213c.length);
        if (read != -1) {
            this.f113214d = 0;
            this.f113215e = read;
            return;
        }
        throw new EOFException();
    }

    public final void close() throws IOException {
        synchronized (this.f113212b) {
            if (this.f113213c != null) {
                this.f113213c = null;
                this.f113212b.close();
            }
        }
    }

    /* renamed from: a */
    public final String mo105763a() throws IOException {
        int i;
        int i2;
        synchronized (this.f113212b) {
            if (this.f113213c != null) {
                if (this.f113214d >= this.f113215e) {
                    m138545c();
                }
                for (int i3 = this.f113214d; i3 != this.f113215e; i3++) {
                    if (this.f113213c[i3] == 10) {
                        if (i3 != this.f113214d) {
                            i2 = i3 - 1;
                            if (this.f113213c[i2] == 13) {
                                String str = new String(this.f113213c, this.f113214d, i2 - this.f113214d, this.f113211a.name());
                                this.f113214d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f113213c, this.f113214d, i2 - this.f113214d, this.f113211a.name());
                        this.f113214d = i3 + 1;
                        return str2;
                    }
                }
                C437161 r1 = new ByteArrayOutputStream((this.f113215e - this.f113214d) + 80) {
                    public final String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, C43715c.this.f113211a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f113213c, this.f113214d, this.f113215e - this.f113214d);
                    this.f113215e = -1;
                    m138545c();
                    i = this.f113214d;
                    while (true) {
                        if (i != this.f113215e) {
                            if (this.f113213c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f113214d) {
                    r1.write(this.f113213c, this.f113214d, i - this.f113214d);
                }
                this.f113214d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C43715c(InputStream inputStream, Charset charset) {
        this(inputStream, VideoCacheReadBuffersizeExperiment.DEFAULT, charset);
    }

    private C43715c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(C43717d.f113217a)) {
            this.f113212b = inputStream;
            this.f113211a = charset;
            this.f113213c = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
