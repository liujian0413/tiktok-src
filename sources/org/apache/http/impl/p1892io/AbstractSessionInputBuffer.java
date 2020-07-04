package org.apache.http.impl.p1892io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p1893io.HttpTransportMetrics;
import org.apache.http.p1893io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.AbstractSessionInputBuffer */
public abstract class AbstractSessionInputBuffer implements SessionInputBuffer {
    private boolean ascii = true;
    private byte[] buffer;
    private int bufferlen;
    private int bufferpos;
    private String charset = "US-ASCII";
    private InputStream instream;
    private ByteArrayBuffer linebuffer;
    private int maxLineLen = -1;
    private HttpTransportMetricsImpl metrics;

    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    /* access modifiers changed from: protected */
    public boolean hasBufferedData() {
        if (this.bufferpos < this.bufferlen) {
            return true;
        }
        return false;
    }

    private int locateLF() {
        for (int i = this.bufferpos; i < this.bufferlen; i++) {
            if (this.buffer[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    public int read() throws IOException {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.buffer;
        int i = this.bufferpos;
        this.bufferpos = i + 1;
        return bArr[i] & 255;
    }

    /* access modifiers changed from: protected */
    public int fillBuffer() throws IOException {
        if (this.bufferpos > 0) {
            int i = this.bufferlen - this.bufferpos;
            if (i > 0) {
                System.arraycopy(this.buffer, this.bufferpos, this.buffer, 0, i);
            }
            this.bufferpos = 0;
            this.bufferlen = i;
        }
        int i2 = this.bufferlen;
        int read = this.instream.read(this.buffer, i2, this.buffer.length - i2);
        if (read == -1) {
            return -1;
        }
        this.bufferlen = i2 + read;
        this.metrics.incrementBytesTransferred((long) read);
        return read;
    }

    private int lineFromLineBuffer(CharArrayBuffer charArrayBuffer) throws IOException {
        int length = this.linebuffer.length();
        if (length > 0) {
            if (this.linebuffer.byteAt(length - 1) == 10) {
                length--;
                this.linebuffer.setLength(length);
            }
            if (length > 0 && this.linebuffer.byteAt(length - 1) == 13) {
                this.linebuffer.setLength(length - 1);
            }
        }
        int length2 = this.linebuffer.length();
        if (this.ascii) {
            charArrayBuffer.append(this.linebuffer, 0, length2);
        } else {
            charArrayBuffer.append(new String(this.linebuffer.buffer(), 0, length2, this.charset));
        }
        return length2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r2 == -1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readLine(org.apache.http.util.CharArrayBuffer r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0079
            org.apache.http.util.ByteArrayBuffer r0 = r7.linebuffer
            r0.clear()
            r0 = 1
            r1 = 0
            r2 = 0
        L_0x000a:
            r3 = -1
            if (r0 == 0) goto L_0x0069
            int r4 = r7.locateLF()
            if (r4 == r3) goto L_0x0033
            org.apache.http.util.ByteArrayBuffer r0 = r7.linebuffer
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0020
            int r8 = r7.lineFromReadBuffer(r8, r4)
            return r8
        L_0x0020:
            int r4 = r4 + 1
            int r0 = r7.bufferpos
            int r0 = r4 - r0
            org.apache.http.util.ByteArrayBuffer r3 = r7.linebuffer
            byte[] r5 = r7.buffer
            int r6 = r7.bufferpos
            r3.append(r5, r6, r0)
            r7.bufferpos = r4
        L_0x0031:
            r0 = 0
            goto L_0x0052
        L_0x0033:
            boolean r2 = r7.hasBufferedData()
            if (r2 == 0) goto L_0x004b
            int r2 = r7.bufferlen
            int r4 = r7.bufferpos
            int r2 = r2 - r4
            org.apache.http.util.ByteArrayBuffer r4 = r7.linebuffer
            byte[] r5 = r7.buffer
            int r6 = r7.bufferpos
            r4.append(r5, r6, r2)
            int r2 = r7.bufferlen
            r7.bufferpos = r2
        L_0x004b:
            int r2 = r7.fillBuffer()
            if (r2 != r3) goto L_0x0052
            goto L_0x0031
        L_0x0052:
            int r3 = r7.maxLineLen
            if (r3 <= 0) goto L_0x000a
            org.apache.http.util.ByteArrayBuffer r3 = r7.linebuffer
            int r3 = r3.length()
            int r4 = r7.maxLineLen
            if (r3 >= r4) goto L_0x0061
            goto L_0x000a
        L_0x0061:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r8.<init>(r0)
            throw r8
        L_0x0069:
            if (r2 != r3) goto L_0x0074
            org.apache.http.util.ByteArrayBuffer r0 = r7.linebuffer
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0074
            return r3
        L_0x0074:
            int r8 = r7.lineFromLineBuffer(r8)
            return r8
        L_0x0079:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Char array buffer may not be null"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.p1892io.AbstractSessionInputBuffer.readLine(org.apache.http.util.CharArrayBuffer):int");
    }

    private int lineFromReadBuffer(CharArrayBuffer charArrayBuffer, int i) throws IOException {
        int i2 = this.bufferpos;
        this.bufferpos = i + 1;
        if (i > 0 && this.buffer[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.ascii) {
            charArrayBuffer.append(this.buffer, i2, i3);
        } else {
            charArrayBuffer.append(new String(this.buffer, i2, i3, this.charset));
        }
        return i3;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        int i3 = this.bufferlen - this.bufferpos;
        if (i3 <= i2) {
            i2 = i3;
        }
        System.arraycopy(this.buffer, this.bufferpos, bArr, i, i2);
        this.bufferpos += i2;
        return i2;
    }

    /* access modifiers changed from: protected */
    public void init(InputStream inputStream, int i, HttpParams httpParams) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (httpParams != null) {
            this.instream = inputStream;
            this.buffer = new byte[i];
            boolean z = false;
            this.bufferpos = 0;
            this.bufferlen = 0;
            this.linebuffer = new ByteArrayBuffer(i);
            this.charset = HttpProtocolParams.getHttpElementCharset(httpParams);
            if (this.charset.equalsIgnoreCase("US-ASCII") || this.charset.equalsIgnoreCase("ASCII")) {
                z = true;
            }
            this.ascii = z;
            this.maxLineLen = httpParams.getIntParameter("http.connection.max-line-length", -1);
            this.metrics = new HttpTransportMetricsImpl();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }
}
