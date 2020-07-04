package com.p280ss.android.ugc.effectmanager.p1724b;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ugc.effectmanager.b.b */
final class C43695b implements Closeable {

    /* renamed from: a */
    public final Charset f113133a;

    /* renamed from: b */
    private final InputStream f113134b;

    /* renamed from: c */
    private byte[] f113135c;

    /* renamed from: d */
    private int f113136d;

    /* renamed from: e */
    private int f113137e;

    /* renamed from: b */
    public final boolean mo105716b() {
        if (this.f113137e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m138459c() throws IOException {
        int read = this.f113134b.read(this.f113135c, 0, this.f113135c.length);
        if (read != -1) {
            this.f113136d = 0;
            this.f113137e = read;
            return;
        }
        throw new EOFException();
    }

    public final void close() throws IOException {
        synchronized (this.f113134b) {
            if (this.f113135c != null) {
                this.f113135c = null;
                this.f113134b.close();
            }
        }
    }

    /* renamed from: a */
    public final String mo105715a() throws IOException {
        int i;
        int i2;
        synchronized (this.f113134b) {
            if (this.f113135c != null) {
                if (this.f113136d >= this.f113137e) {
                    m138459c();
                }
                for (int i3 = this.f113136d; i3 != this.f113137e; i3++) {
                    if (this.f113135c[i3] == 10) {
                        if (i3 != this.f113136d) {
                            i2 = i3 - 1;
                            if (this.f113135c[i2] == 13) {
                                String str = new String(this.f113135c, this.f113136d, i2 - this.f113136d, this.f113133a.name());
                                this.f113136d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f113135c, this.f113136d, i2 - this.f113136d, this.f113133a.name());
                        this.f113136d = i3 + 1;
                        return str2;
                    }
                }
                C436961 r1 = new ByteArrayOutputStream((this.f113137e - this.f113136d) + 80) {
                    public final String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, C43695b.this.f113133a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f113135c, this.f113136d, this.f113137e - this.f113136d);
                    this.f113137e = -1;
                    m138459c();
                    i = this.f113136d;
                    while (true) {
                        if (i != this.f113137e) {
                            if (this.f113135c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f113136d) {
                    r1.write(this.f113135c, this.f113136d, i - this.f113136d);
                }
                this.f113136d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C43695b(InputStream inputStream, Charset charset) {
        this(inputStream, VideoCacheReadBuffersizeExperiment.DEFAULT, charset);
    }

    private C43695b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(C43697c.f113139a)) {
            this.f113134b = inputStream;
            this.f113133a = charset;
            this.f113135c = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
