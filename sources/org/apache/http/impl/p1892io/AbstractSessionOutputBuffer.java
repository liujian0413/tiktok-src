package org.apache.http.impl.p1892io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p1893io.HttpTransportMetrics;
import org.apache.http.p1893io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.AbstractSessionOutputBuffer */
public abstract class AbstractSessionOutputBuffer implements SessionOutputBuffer {
    private static final byte[] CRLF = {13, 10};
    private boolean ascii = true;
    private ByteArrayBuffer buffer;
    private String charset = "US-ASCII";
    private HttpTransportMetricsImpl metrics;
    private OutputStream outstream;

    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public void flush() throws IOException {
        flushBuffer();
        this.outstream.flush();
    }

    /* access modifiers changed from: protected */
    public void flushBuffer() throws IOException {
        int length = this.buffer.length();
        if (length > 0) {
            this.outstream.write(this.buffer.buffer(), 0, length);
            this.buffer.clear();
            this.metrics.incrementBytesTransferred((long) length);
        }
    }

    public void write(byte[] bArr) throws IOException {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
        }
    }

    public void write(int i) throws IOException {
        if (this.buffer.isFull()) {
            flushBuffer();
        }
        this.buffer.append(i);
    }

    public void writeLine(String str) throws IOException {
        if (str != null) {
            if (str.length() > 0) {
                write(str.getBytes(this.charset));
            }
            write(CRLF);
        }
    }

    public void writeLine(CharArrayBuffer charArrayBuffer) throws IOException {
        if (charArrayBuffer != null) {
            if (this.ascii) {
                int i = 0;
                int length = charArrayBuffer.length();
                while (length > 0) {
                    int min = Math.min(this.buffer.capacity() - this.buffer.length(), length);
                    if (min > 0) {
                        this.buffer.append(charArrayBuffer, i, min);
                    }
                    if (this.buffer.isFull()) {
                        flushBuffer();
                    }
                    i += min;
                    length -= min;
                }
            } else {
                write(charArrayBuffer.toString().getBytes(this.charset));
            }
            write(CRLF);
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if (i2 > 256 || i2 > this.buffer.capacity()) {
                flushBuffer();
                this.outstream.write(bArr, i, i2);
                this.metrics.incrementBytesTransferred((long) i2);
                return;
            }
            if (i2 > this.buffer.capacity() - this.buffer.length()) {
                flushBuffer();
            }
            this.buffer.append(bArr, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void init(OutputStream outputStream, int i, HttpParams httpParams) {
        boolean z;
        if (outputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (httpParams != null) {
            this.outstream = outputStream;
            this.buffer = new ByteArrayBuffer(i);
            this.charset = HttpProtocolParams.getHttpElementCharset(httpParams);
            if (this.charset.equalsIgnoreCase("US-ASCII") || this.charset.equalsIgnoreCase("ASCII")) {
                z = true;
            } else {
                z = false;
            }
            this.ascii = z;
            this.metrics = new HttpTransportMetricsImpl();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }
}
