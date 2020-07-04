package com.p280ss.android.message.push.connection.p887a;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.ss.android.message.push.connection.a.c */
public final class C19870c extends FilterOutputStream {

    /* renamed from: a */
    protected byte[] f53881a;

    /* renamed from: b */
    protected int f53882b;

    /* renamed from: a */
    private void m65600a() throws IOException {
        if (this.f53881a == null) {
            throw new IOException("BufferedOutputStream is closed");
        }
    }

    /* renamed from: b */
    private void m65601b() throws IOException {
        if (this.f53882b > 0) {
            this.out.write(this.f53881a, 0, this.f53882b);
            this.f53882b = 0;
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f53881a != null) {
            try {
                super.close();
            } finally {
                this.f53881a = null;
            }
        }
    }

    public final synchronized void flush() throws IOException {
        m65600a();
        m65601b();
        this.out.flush();
    }

    public C19870c(OutputStream outputStream) {
        this(outputStream, VideoCacheReadBuffersizeExperiment.DEFAULT);
    }

    public final synchronized void write(int i) throws IOException {
        m65600a();
        if (this.f53882b == this.f53881a.length) {
            this.out.write(this.f53881a, 0, this.f53882b);
            this.f53882b = 0;
        }
        byte[] bArr = this.f53881a;
        int i2 = this.f53882b;
        this.f53882b = i2 + 1;
        bArr[i2] = (byte) i;
    }

    private C19870c(OutputStream outputStream, int i) {
        super(outputStream);
        this.f53881a = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
    }

    public final synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        m65600a();
        if (bArr != null) {
            byte[] bArr2 = this.f53881a;
            if (i2 >= bArr2.length) {
                m65601b();
                this.out.write(bArr, i, i2);
                return;
            }
            C19862a.m65589a(bArr.length, i, i2);
            if (i2 > bArr2.length - this.f53882b) {
                m65601b();
            }
            System.arraycopy(bArr, i, bArr2, this.f53882b, i2);
            this.f53882b += i2;
            return;
        }
        throw new NullPointerException("buffer == null");
    }
}
