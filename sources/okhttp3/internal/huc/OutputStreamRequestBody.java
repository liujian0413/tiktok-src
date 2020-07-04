package okhttp3.internal.huc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Timeout;

abstract class OutputStreamRequestBody extends RequestBody {
    public boolean closed;
    private long expectedContentLength;
    public OutputStream outputStream;
    public Timeout timeout;

    OutputStreamRequestBody() {
    }

    public long contentLength() throws IOException {
        return this.expectedContentLength;
    }

    public final MediaType contentType() {
        return null;
    }

    public Request prepareToSendRequest(Request request) throws IOException {
        return request;
    }

    /* access modifiers changed from: protected */
    public void initOutputStream(final BufferedSink bufferedSink, final long j) {
        this.timeout = bufferedSink.timeout();
        this.expectedContentLength = j;
        this.outputStream = new OutputStream() {
            private long bytesReceived;

            public void flush() throws IOException {
                if (!OutputStreamRequestBody.this.closed) {
                    bufferedSink.flush();
                }
            }

            public void close() throws IOException {
                OutputStreamRequestBody.this.closed = true;
                if (j == -1 || this.bytesReceived >= j) {
                    bufferedSink.close();
                    return;
                }
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(j);
                sb.append(" bytes but received ");
                sb.append(this.bytesReceived);
                throw new ProtocolException(sb.toString());
            }

            public void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }

            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (OutputStreamRequestBody.this.closed) {
                    throw new IOException("closed");
                } else if (j == -1 || this.bytesReceived + ((long) i2) <= j) {
                    this.bytesReceived += (long) i2;
                    try {
                        bufferedSink.write(bArr, i, i2);
                    } catch (InterruptedIOException e) {
                        throw new SocketTimeoutException(e.getMessage());
                    }
                } else {
                    StringBuilder sb = new StringBuilder("expected ");
                    sb.append(j);
                    sb.append(" bytes but received ");
                    sb.append(this.bytesReceived);
                    sb.append(i2);
                    throw new ProtocolException(sb.toString());
                }
            }
        };
    }
}
