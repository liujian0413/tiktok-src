package com.p280ss.android.message.push.connection.p887a;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.message.push.connection.a.b */
public final class C19869b extends FilterInputStream {

    /* renamed from: a */
    protected volatile byte[] f53876a;

    /* renamed from: b */
    protected int f53877b;

    /* renamed from: c */
    protected int f53878c;

    /* renamed from: d */
    protected int f53879d;

    /* renamed from: e */
    protected int f53880e;

    public final boolean markSupported() {
        return true;
    }

    /* renamed from: a */
    private static IOException m65599a() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final void close() throws IOException {
        this.f53876a = null;
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f53876a == null || inputStream == null) {
            throw m65599a();
        }
        return (this.f53877b - this.f53880e) + inputStream.available();
    }

    public final synchronized void reset() throws IOException {
        if (this.f53876a == null) {
            throw new IOException("Stream is closed");
        } else if (this.f53879d != -1) {
            this.f53880e = this.f53879d;
        } else {
            throw new IOException("Mark has been invalidated.");
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x003b=Splitter:B:27:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f53876a     // Catch:{ all -> 0x0040 }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r2 = r5.f53880e     // Catch:{ all -> 0x0040 }
            int r3 = r5.f53877b     // Catch:{ all -> 0x0040 }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.m65598a(r1, r0)     // Catch:{ all -> 0x0040 }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f53876a     // Catch:{ all -> 0x0040 }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f53876a     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m65599a()     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0026:
            int r1 = r5.f53877b     // Catch:{ all -> 0x0040 }
            int r2 = r5.f53880e     // Catch:{ all -> 0x0040 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r5.f53880e     // Catch:{ all -> 0x0040 }
            int r2 = r1 + 1
            r5.f53880e = r2     // Catch:{ all -> 0x0040 }
            byte r0 = r0[r1]     // Catch:{ all -> 0x0040 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0039:
            monitor-exit(r5)
            return r4
        L_0x003b:
            java.io.IOException r0 = m65599a()     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19869b.read():int");
    }

    public C19869b(InputStream inputStream) {
        this(inputStream, VideoCacheReadBuffersizeExperiment.DEFAULT);
    }

    public final synchronized void mark(int i) {
        this.f53878c = i;
        this.f53879d = this.f53880e;
    }

    public final synchronized long skip(long j) throws IOException {
        byte[] bArr = this.f53876a;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw m65599a();
        } else if (j < 1) {
            return 0;
        } else {
            if (inputStream == null) {
                throw m65599a();
            } else if (((long) (this.f53877b - this.f53880e)) >= j) {
                this.f53880e = (int) (((long) this.f53880e) + j);
                return j;
            } else {
                long j2 = (long) (this.f53877b - this.f53880e);
                this.f53880e = this.f53877b;
                if (this.f53879d == -1 || j > ((long) this.f53878c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m65598a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    long j3 = j - j2;
                    if (((long) (this.f53877b - this.f53880e)) >= j3) {
                        this.f53880e = (int) (((long) this.f53880e) + j3);
                        return j;
                    }
                    long j4 = j2 + ((long) (this.f53877b - this.f53880e));
                    this.f53880e = this.f53877b;
                    return j4;
                }
            }
        }
    }

    private C19869b(InputStream inputStream, int i) {
        super(inputStream);
        this.f53879d = -1;
        this.f53876a = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
    }

    /* renamed from: a */
    private int m65598a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        if (this.f53879d == -1 || this.f53880e - this.f53879d >= this.f53878c) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f53879d = -1;
                this.f53880e = 0;
                this.f53877b = read;
            }
            return read;
        }
        if (this.f53879d == 0 && this.f53878c > bArr.length) {
            int length = bArr.length * 2;
            if (length > this.f53878c) {
                length = this.f53878c;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f53876a = bArr2;
            bArr = bArr2;
        } else if (this.f53879d > 0) {
            System.arraycopy(bArr, this.f53879d, bArr, 0, bArr.length - this.f53879d);
        }
        this.f53880e -= this.f53879d;
        this.f53879d = 0;
        this.f53877b = 0;
        int read2 = inputStream.read(bArr, this.f53880e, bArr.length - this.f53880e);
        if (read2 <= 0) {
            i = this.f53880e;
        } else {
            i = this.f53880e + read2;
        }
        this.f53877b = i;
        return read2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f53876a     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x009d
            int r1 = r6.length     // Catch:{ all -> 0x00a2 }
            com.p280ss.android.message.push.connection.p887a.C19862a.m65589a(r1, r7, r8)     // Catch:{ all -> 0x00a2 }
            if (r8 != 0) goto L_0x000e
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x000e:
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x0098
            int r2 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            int r3 = r5.f53877b     // Catch:{ all -> 0x00a2 }
            if (r2 >= r3) goto L_0x003f
            int r2 = r5.f53877b     // Catch:{ all -> 0x00a2 }
            int r3 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            int r2 = r2 - r3
            if (r2 < r8) goto L_0x0021
            r2 = r8
            goto L_0x0026
        L_0x0021:
            int r2 = r5.f53877b     // Catch:{ all -> 0x00a2 }
            int r3 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            int r2 = r2 - r3
        L_0x0026:
            int r3 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            java.lang.System.arraycopy(r0, r3, r6, r7, r2)     // Catch:{ all -> 0x00a2 }
            int r3 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            int r3 = r3 + r2
            r5.f53880e = r3     // Catch:{ all -> 0x00a2 }
            if (r2 == r8) goto L_0x003d
            int r3 = r1.available()     // Catch:{ all -> 0x00a2 }
            if (r3 != 0) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            int r7 = r7 + r2
            int r2 = r8 - r2
            goto L_0x0040
        L_0x003d:
            monitor-exit(r5)
            return r2
        L_0x003f:
            r2 = r8
        L_0x0040:
            int r3 = r5.f53879d     // Catch:{ all -> 0x00a2 }
            r4 = -1
            if (r3 != r4) goto L_0x0055
            int r3 = r0.length     // Catch:{ all -> 0x00a2 }
            if (r2 < r3) goto L_0x0055
            int r3 = r1.read(r6, r7, r2)     // Catch:{ all -> 0x00a2 }
            if (r3 != r4) goto L_0x0088
            if (r2 != r8) goto L_0x0052
            monitor-exit(r5)
            return r4
        L_0x0052:
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0055:
            int r3 = r5.m65598a(r1, r0)     // Catch:{ all -> 0x00a2 }
            if (r3 != r4) goto L_0x0062
            if (r2 != r8) goto L_0x005f
            monitor-exit(r5)
            return r4
        L_0x005f:
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0062:
            byte[] r3 = r5.f53876a     // Catch:{ all -> 0x00a2 }
            if (r0 == r3) goto L_0x0070
            byte[] r0 = r5.f53876a     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            java.io.IOException r6 = m65599a()     // Catch:{ all -> 0x00a2 }
            throw r6     // Catch:{ all -> 0x00a2 }
        L_0x0070:
            int r3 = r5.f53877b     // Catch:{ all -> 0x00a2 }
            int r4 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            int r3 = r3 - r4
            if (r3 < r2) goto L_0x0079
            r3 = r2
            goto L_0x007e
        L_0x0079:
            int r3 = r5.f53877b     // Catch:{ all -> 0x00a2 }
            int r4 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            int r3 = r3 - r4
        L_0x007e:
            int r4 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            java.lang.System.arraycopy(r0, r4, r6, r7, r3)     // Catch:{ all -> 0x00a2 }
            int r4 = r5.f53880e     // Catch:{ all -> 0x00a2 }
            int r4 = r4 + r3
            r5.f53880e = r4     // Catch:{ all -> 0x00a2 }
        L_0x0088:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x008d
            monitor-exit(r5)
            return r8
        L_0x008d:
            int r4 = r1.available()     // Catch:{ all -> 0x00a2 }
            if (r4 != 0) goto L_0x0096
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0096:
            int r7 = r7 + r3
            goto L_0x0040
        L_0x0098:
            java.io.IOException r6 = m65599a()     // Catch:{ all -> 0x00a2 }
            throw r6     // Catch:{ all -> 0x00a2 }
        L_0x009d:
            java.io.IOException r6 = m65599a()     // Catch:{ all -> 0x00a2 }
            throw r6     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19869b.read(byte[], int, int):int");
    }
}
