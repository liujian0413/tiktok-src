package com.squareup.okhttp.internal.framed;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

public final class FramedStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    public final FramedConnection connection;
    public ErrorCode errorCode = null;

    /* renamed from: id */
    public final int f50643id;
    public final StreamTimeout readTimeout = new StreamTimeout();
    private final List<Header> requestHeaders;
    private List<Header> responseHeaders;
    final FramedDataSink sink;
    private final FramedDataSource source;
    long unacknowledgedBytesRead;
    public final StreamTimeout writeTimeout = new StreamTimeout();

    final class FramedDataSink implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public boolean closed;
        public boolean finished;
        private final Buffer sendBuffer = new Buffer();

        static {
            Class<FramedStream> cls = FramedStream.class;
        }

        public final Timeout timeout() {
            return FramedStream.this.writeTimeout;
        }

        public final void flush() throws IOException {
            synchronized (FramedStream.this) {
                FramedStream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitDataFrame(false);
                FramedStream.this.connection.flush();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            emitDataFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r8.this$0.connection.writeData(r8.this$0.f50643id, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
            r2 = r8.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.closed = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
            r8.this$0.connection.flush();
            r8.this$0.cancelStreamIfNecessary();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.this$0.sink.finished != false) goto L_0x003c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() throws java.io.IOException {
            /*
                r8 = this;
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                monitor-enter(r0)
                boolean r1 = r8.closed     // Catch:{ all -> 0x0052 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedStream$FramedDataSink r0 = r0.sink
                boolean r0 = r0.finished
                r1 = 1
                if (r0 != 0) goto L_0x003c
                okio.Buffer r0 = r8.sendBuffer
                long r2 = r0.size()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                okio.Buffer r0 = r8.sendBuffer
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003c
                r8.emitDataFrame(r1)
                goto L_0x001f
            L_0x002d:
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r0.connection
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                int r3 = r0.f50643id
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L_0x003c:
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this
                monitor-enter(r2)
                r8.closed = r1     // Catch:{ all -> 0x004f }
                monitor-exit(r2)     // Catch:{ all -> 0x004f }
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedConnection r0 = r0.connection
                r0.flush()
                com.squareup.okhttp.internal.framed.FramedStream r0 = com.squareup.okhttp.internal.framed.FramedStream.this
                r0.cancelStreamIfNecessary()
                return
            L_0x004f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004f }
                throw r0
            L_0x0052:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedStream.FramedDataSink.close():void");
        }

        FramedDataSink() {
        }

        /* JADX INFO: finally extract failed */
        private void emitDataFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (FramedStream.this) {
                FramedStream.this.writeTimeout.enter();
                while (FramedStream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && FramedStream.this.errorCode == null) {
                    try {
                        FramedStream.this.waitForIo();
                    } catch (Throwable th) {
                        FramedStream.this.writeTimeout.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                FramedStream.this.writeTimeout.exitAndThrowIfTimedOut();
                FramedStream.this.checkOutNotClosed();
                min = Math.min(FramedStream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                FramedStream.this.bytesLeftInWriteWindow -= min;
            }
            FramedStream.this.writeTimeout.enter();
            try {
                FramedConnection framedConnection = FramedStream.this.connection;
                int i = FramedStream.this.f50643id;
                if (!z || min != this.sendBuffer.size()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                framedConnection.writeData(i, z2, this.sendBuffer, min);
            } finally {
                FramedStream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        public final void write(Buffer buffer, long j) throws IOException {
            this.sendBuffer.write(buffer, j);
            while (this.sendBuffer.size() >= 16384) {
                emitDataFrame(false);
            }
        }
    }

    final class FramedDataSource implements Source {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public boolean closed;
        public boolean finished;
        private final long maxByteCount;
        private final Buffer readBuffer;
        private final Buffer receiveBuffer;

        static {
            Class<FramedStream> cls = FramedStream.class;
        }

        public final Timeout timeout() {
            return FramedStream.this.readTimeout;
        }

        public final void close() throws IOException {
            synchronized (FramedStream.this) {
                this.closed = true;
                this.readBuffer.clear();
                FramedStream.this.notifyAll();
            }
            FramedStream.this.cancelStreamIfNecessary();
        }

        private void checkNotClosed() throws IOException {
            if (this.closed) {
                throw new IOException("stream closed");
            } else if (FramedStream.this.errorCode != null) {
                StringBuilder sb = new StringBuilder("stream was reset: ");
                sb.append(FramedStream.this.errorCode);
                throw new IOException(sb.toString());
            }
        }

        private void waitUntilReadable() throws IOException {
            FramedStream.this.readTimeout.enter();
            while (this.readBuffer.size() == 0 && !this.finished && !this.closed && FramedStream.this.errorCode == null) {
                try {
                    FramedStream.this.waitForIo();
                } finally {
                    FramedStream.this.readTimeout.exitAndThrowIfTimedOut();
                }
            }
        }

        private FramedDataSource(long j) {
            this.receiveBuffer = new Buffer();
            this.readBuffer = new Buffer();
            this.maxByteCount = j;
        }

        /* access modifiers changed from: 0000 */
        public final void receive(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (FramedStream.this) {
                    z = this.finished;
                    z2 = false;
                    if (this.readBuffer.size() + j > this.maxByteCount) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    bufferedSource.skip(j);
                    FramedStream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long read = bufferedSource.read(this.receiveBuffer, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (FramedStream.this) {
                            if (this.readBuffer.size() == 0) {
                                z2 = true;
                            }
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z2) {
                                FramedStream.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
            r11 = r8.this$0.connection;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8.this$0.connection.unacknowledgedBytesRead += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
            if (r8.this$0.connection.unacknowledgedBytesRead < ((long) (r8.this$0.connection.okHttpSettings.getInitialWindowSize(65536) / 2))) goto L_0x009a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
            r8.this$0.connection.writeWindowUpdateLater(0, r8.this$0.connection.unacknowledgedBytesRead);
            r8.this$0.connection.unacknowledgedBytesRead = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
            return r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long read(okio.Buffer r9, long r10) throws java.io.IOException {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00a2
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this
                monitor-enter(r2)
                r8.waitUntilReadable()     // Catch:{ all -> 0x009f }
                r8.checkNotClosed()     // Catch:{ all -> 0x009f }
                okio.Buffer r3 = r8.readBuffer     // Catch:{ all -> 0x009f }
                long r3 = r3.size()     // Catch:{ all -> 0x009f }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x001d
                r9 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x009f }
                return r9
            L_0x001d:
                okio.Buffer r3 = r8.readBuffer     // Catch:{ all -> 0x009f }
                okio.Buffer r4 = r8.readBuffer     // Catch:{ all -> 0x009f }
                long r4 = r4.size()     // Catch:{ all -> 0x009f }
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x009f }
                long r9 = r3.read(r9, r10)     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009f }
                long r3 = r11.unacknowledgedBytesRead     // Catch:{ all -> 0x009f }
                r5 = 0
                long r3 = r3 + r9
                r11.unacknowledgedBytesRead = r3     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009f }
                long r3 = r11.unacknowledgedBytesRead     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedConnection r11 = r11.connection     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.Settings r11 = r11.okHttpSettings     // Catch:{ all -> 0x009f }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.getInitialWindowSize(r5)     // Catch:{ all -> 0x009f }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x009f }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x005f
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedConnection r11 = r11.connection     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedStream r3 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009f }
                int r3 = r3.f50643id     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedStream r4 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009f }
                long r6 = r4.unacknowledgedBytesRead     // Catch:{ all -> 0x009f }
                r11.writeWindowUpdateLater(r3, r6)     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009f }
                r11.unacknowledgedBytesRead = r0     // Catch:{ all -> 0x009f }
            L_0x005f:
                monitor-exit(r2)     // Catch:{ all -> 0x009f }
                com.squareup.okhttp.internal.framed.FramedStream r11 = com.squareup.okhttp.internal.framed.FramedStream.this
                com.squareup.okhttp.internal.framed.FramedConnection r11 = r11.connection
                monitor-enter(r11)
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r2.connection     // Catch:{ all -> 0x009c }
                long r3 = r2.unacknowledgedBytesRead     // Catch:{ all -> 0x009c }
                r6 = 0
                long r3 = r3 + r9
                r2.unacknowledgedBytesRead = r3     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r2.connection     // Catch:{ all -> 0x009c }
                long r2 = r2.unacknowledgedBytesRead     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedStream r4 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedConnection r4 = r4.connection     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.Settings r4 = r4.okHttpSettings     // Catch:{ all -> 0x009c }
                int r4 = r4.getInitialWindowSize(r5)     // Catch:{ all -> 0x009c }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x009c }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x009a
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r2.connection     // Catch:{ all -> 0x009c }
                r3 = 0
                com.squareup.okhttp.internal.framed.FramedStream r4 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedConnection r4 = r4.connection     // Catch:{ all -> 0x009c }
                long r4 = r4.unacknowledgedBytesRead     // Catch:{ all -> 0x009c }
                r2.writeWindowUpdateLater(r3, r4)     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedStream r2 = com.squareup.okhttp.internal.framed.FramedStream.this     // Catch:{ all -> 0x009c }
                com.squareup.okhttp.internal.framed.FramedConnection r2 = r2.connection     // Catch:{ all -> 0x009c }
                r2.unacknowledgedBytesRead = r0     // Catch:{ all -> 0x009c }
            L_0x009a:
                monitor-exit(r11)     // Catch:{ all -> 0x009c }
                return r9
            L_0x009c:
                r9 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x009c }
                throw r9
            L_0x009f:
                r9 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x009f }
                throw r9
            L_0x00a2:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "byteCount < 0: "
                r0.<init>(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedStream.FramedDataSource.read(okio.Buffer, long):long");
        }
    }

    class StreamTimeout extends AsyncTimeout {
        public void timedOut() {
            FramedStream.this.closeLater(ErrorCode.CANCEL);
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        StreamTimeout() {
        }

        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public final FramedConnection getConnection() {
        return this.connection;
    }

    public final int getId() {
        return this.f50643id;
    }

    public final List<Header> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final Source getSource() {
        return this.source;
    }

    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }

    public final synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public final Sink getSink() {
        synchronized (this) {
            if (this.responseHeaders == null) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.sink;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.f50643id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.client == z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.f50643id);
        }
    }

    public final void cancelStreamIfNecessary() throws IOException {
        boolean z;
        boolean isOpen;
        synchronized (this) {
            if (this.source.finished || !this.source.closed || (!this.sink.finished && !this.sink.closed)) {
                z = false;
            } else {
                z = true;
            }
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
            return;
        }
        if (!isOpen) {
            this.connection.removeStream(this.f50643id);
        }
    }

    public final void checkOutNotClosed() throws IOException {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        } else if (this.sink.finished) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            StringBuilder sb = new StringBuilder("stream was reset: ");
            sb.append(this.errorCode);
            throw new IOException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized List<Header> getResponseHeaders() throws IOException {
        this.readTimeout.enter();
        while (this.responseHeaders == null && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (this.responseHeaders != null) {
        } else {
            StringBuilder sb = new StringBuilder("stream was reset: ");
            sb.append(this.errorCode);
            throw new IOException(sb.toString());
        }
        return this.responseHeaders;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.finished || this.source.closed) && ((this.sink.finished || this.sink.closed) && this.responseHeaders != null)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void close(ErrorCode errorCode2) throws IOException {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynReset(this.f50643id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynResetLater(this.f50643id, errorCode2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void receiveRstStream(ErrorCode errorCode2) {
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    private boolean closeInternal(ErrorCode errorCode2) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode2;
            notifyAll();
            this.connection.removeStream(this.f50643id);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void receiveData(BufferedSource bufferedSource, int i) throws IOException {
        this.source.receive(bufferedSource, (long) i);
    }

    public final void reply(List<Header> list, boolean z) throws IOException {
        boolean z2 = false;
        synchronized (this) {
            if (list == null) {
                throw new NullPointerException("responseHeaders == null");
            } else if (this.responseHeaders == null) {
                this.responseHeaders = list;
                if (!z) {
                    this.sink.finished = true;
                    z2 = true;
                }
            } else {
                throw new IllegalStateException("reply already sent");
            }
        }
        this.connection.writeSynReply(this.f50643id, z2, list);
        if (z2) {
            this.connection.flush();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void receiveHeaders(List<Header> list, HeadersMode headersMode) {
        ErrorCode errorCode2 = null;
        boolean z = true;
        synchronized (this) {
            if (this.responseHeaders == null) {
                if (headersMode.failIfHeadersAbsent()) {
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                } else {
                    this.responseHeaders = list;
                    z = isOpen();
                    notifyAll();
                }
            } else if (headersMode.failIfHeadersPresent()) {
                errorCode2 = ErrorCode.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.responseHeaders);
                arrayList.addAll(list);
                this.responseHeaders = arrayList;
            }
        }
        if (errorCode2 != null) {
            closeLater(errorCode2);
            return;
        }
        if (!z) {
            this.connection.removeStream(this.f50643id);
        }
    }

    FramedStream(int i, FramedConnection framedConnection, boolean z, boolean z2, List<Header> list) {
        if (framedConnection == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f50643id = i;
            this.connection = framedConnection;
            this.bytesLeftInWriteWindow = (long) framedConnection.peerSettings.getInitialWindowSize(65536);
            this.source = new FramedDataSource((long) framedConnection.okHttpSettings.getInitialWindowSize(65536));
            this.sink = new FramedDataSink();
            this.source.finished = z2;
            this.sink.finished = z;
            this.requestHeaders = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }
}
