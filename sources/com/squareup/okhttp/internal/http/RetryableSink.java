package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.ProtocolException;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

public final class RetryableSink implements Sink {
    private boolean closed;
    private final Buffer content;
    private final int limit;

    public final void flush() throws IOException {
    }

    public final Timeout timeout() {
        return Timeout.NONE;
    }

    public RetryableSink() {
        this(-1);
    }

    public final long contentLength() throws IOException {
        return this.content.size();
    }

    public final void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            if (this.content.size() < ((long) this.limit)) {
                StringBuilder sb = new StringBuilder("content-length promised ");
                sb.append(this.limit);
                sb.append(" bytes, but received ");
                sb.append(this.content.size());
                throw new ProtocolException(sb.toString());
            }
        }
    }

    public RetryableSink(int i) {
        this.content = new Buffer();
        this.limit = i;
    }

    public final void writeToSocket(Sink sink) throws IOException {
        Buffer buffer = new Buffer();
        this.content.copyTo(buffer, 0, this.content.size());
        sink.write(buffer, buffer.size());
    }

    public final void write(Buffer buffer, long j) throws IOException {
        if (!this.closed) {
            Util.checkOffsetAndCount(buffer.size(), 0, j);
            if (this.limit == -1 || this.content.size() <= ((long) this.limit) - j) {
                this.content.write(buffer, j);
                return;
            }
            StringBuilder sb = new StringBuilder("exceeded content-length limit of ");
            sb.append(this.limit);
            sb.append(" bytes");
            throw new ProtocolException(sb.toString());
        }
        throw new IllegalStateException("closed");
    }
}
