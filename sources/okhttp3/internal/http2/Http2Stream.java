package okhttp3.internal.http2;

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

public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    public final Http2Connection connection;
    ErrorCode errorCode = null;
    private boolean hasResponseHeaders;

    /* renamed from: id */
    public final int f20937id;
    public final StreamTimeout readTimeout = new StreamTimeout();
    public final List<Header> requestHeaders;
    private List<Header> responseHeaders;
    final FramingSink sink;
    public final FramingSource source;
    long unacknowledgedBytesRead;
    public final StreamTimeout writeTimeout = new StreamTimeout();

    final class FramingSink implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final Buffer sendBuffer = new Buffer();

        static {
            Class<Http2Stream> cls = Http2Stream.class;
        }

        public final Timeout timeout() {
            return Http2Stream.this.writeTimeout;
        }

        public final void flush() throws IOException {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r8.this$0.connection.writeData(r8.this$0.f20937id, true, null, 0);
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
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r8.closed     // Catch:{ all -> 0x0052 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.sink
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
                r8.emitFrame(r1)
                goto L_0x001f
            L_0x002d:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r2 = r0.connection
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r3 = r0.f20937id
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L_0x003c:
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r2)
                r8.closed = r1     // Catch:{ all -> 0x004f }
                monitor-exit(r2)     // Catch:{ all -> 0x004f }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
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
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        FramingSink() {
        }

        /* JADX INFO: finally extract failed */
        private void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    try {
                        Http2Stream.this.waitForIo();
                    } catch (Throwable th) {
                        Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                Http2Stream.this.bytesLeftInWriteWindow -= min;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Connection http2Connection = Http2Stream.this.connection;
                int i = Http2Stream.this.f20937id;
                if (!z || min != this.sendBuffer.size()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                http2Connection.writeData(i, z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        public final void write(Buffer buffer, long j) throws IOException {
            this.sendBuffer.write(buffer, j);
            while (this.sendBuffer.size() >= 16384) {
                emitFrame(false);
            }
        }
    }

    final class FramingSource implements Source {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final Buffer readBuffer = new Buffer();
        private final Buffer receiveBuffer = new Buffer();

        static {
            Class<Http2Stream> cls = Http2Stream.class;
        }

        public final Timeout timeout() {
            return Http2Stream.this.readTimeout;
        }

        private void checkNotClosed() throws IOException {
            if (this.closed) {
                throw new IOException("stream closed");
            } else if (Http2Stream.this.errorCode != null) {
                throw new StreamResetException(Http2Stream.this.errorCode);
            }
        }

        public final void close() throws IOException {
            synchronized (Http2Stream.this) {
                this.closed = true;
                this.readBuffer.clear();
                Http2Stream.this.notifyAll();
            }
            Http2Stream.this.cancelStreamIfNecessary();
        }

        private void waitUntilReadable() throws IOException {
            Http2Stream.this.readTimeout.enter();
            while (this.readBuffer.size() == 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                try {
                    Http2Stream.this.waitForIo();
                } finally {
                    Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                }
            }
        }

        FramingSource(long j) {
            this.maxByteCount = j;
        }

        /* access modifiers changed from: 0000 */
        public final void receive(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (Http2Stream.this) {
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
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long read = bufferedSource.read(this.receiveBuffer, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (Http2Stream.this) {
                            if (this.readBuffer.size() == 0) {
                                z2 = true;
                            }
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z2) {
                                Http2Stream.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
            r10 = r7.this$0.connection;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r7.this$0.connection.unacknowledgedBytesRead += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
            if (r7.this$0.connection.unacknowledgedBytesRead < ((long) (r7.this$0.connection.okHttpSettings.getInitialWindowSize() / 2))) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
            r7.this$0.connection.writeWindowUpdateLater(0, r7.this$0.connection.unacknowledgedBytesRead);
            r7.this$0.connection.unacknowledgedBytesRead = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
            monitor-exit(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0099, code lost:
            return r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long read(okio.Buffer r8, long r9) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00a0
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r2)
                r7.waitUntilReadable()     // Catch:{ all -> 0x009d }
                r7.checkNotClosed()     // Catch:{ all -> 0x009d }
                okio.Buffer r3 = r7.readBuffer     // Catch:{ all -> 0x009d }
                long r3 = r3.size()     // Catch:{ all -> 0x009d }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x001d
                r8 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x009d }
                return r8
            L_0x001d:
                okio.Buffer r3 = r7.readBuffer     // Catch:{ all -> 0x009d }
                okio.Buffer r4 = r7.readBuffer     // Catch:{ all -> 0x009d }
                long r4 = r4.size()     // Catch:{ all -> 0x009d }
                long r9 = java.lang.Math.min(r9, r4)     // Catch:{ all -> 0x009d }
                long r8 = r3.read(r8, r9)     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Stream r10 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009d }
                long r3 = r10.unacknowledgedBytesRead     // Catch:{ all -> 0x009d }
                r5 = 0
                long r3 = r3 + r8
                r10.unacknowledgedBytesRead = r3     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Stream r10 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009d }
                long r3 = r10.unacknowledgedBytesRead     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Stream r10 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Connection r10 = r10.connection     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Settings r10 = r10.okHttpSettings     // Catch:{ all -> 0x009d }
                int r10 = r10.getInitialWindowSize()     // Catch:{ all -> 0x009d }
                int r10 = r10 / 2
                long r5 = (long) r10     // Catch:{ all -> 0x009d }
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 < 0) goto L_0x005d
                okhttp3.internal.http2.Http2Stream r10 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Connection r10 = r10.connection     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Stream r3 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009d }
                int r3 = r3.f20937id     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Stream r4 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009d }
                long r4 = r4.unacknowledgedBytesRead     // Catch:{ all -> 0x009d }
                r10.writeWindowUpdateLater(r3, r4)     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Stream r10 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009d }
                r10.unacknowledgedBytesRead = r0     // Catch:{ all -> 0x009d }
            L_0x005d:
                monitor-exit(r2)     // Catch:{ all -> 0x009d }
                okhttp3.internal.http2.Http2Stream r10 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r10 = r10.connection
                monitor-enter(r10)
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Connection r2 = r2.connection     // Catch:{ all -> 0x009a }
                long r3 = r2.unacknowledgedBytesRead     // Catch:{ all -> 0x009a }
                r5 = 0
                long r3 = r3 + r8
                r2.unacknowledgedBytesRead = r3     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Connection r2 = r2.connection     // Catch:{ all -> 0x009a }
                long r2 = r2.unacknowledgedBytesRead     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Stream r4 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Connection r4 = r4.connection     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Settings r4 = r4.okHttpSettings     // Catch:{ all -> 0x009a }
                int r4 = r4.getInitialWindowSize()     // Catch:{ all -> 0x009a }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x009a }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x0098
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Connection r2 = r2.connection     // Catch:{ all -> 0x009a }
                r3 = 0
                okhttp3.internal.http2.Http2Stream r4 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Connection r4 = r4.connection     // Catch:{ all -> 0x009a }
                long r4 = r4.unacknowledgedBytesRead     // Catch:{ all -> 0x009a }
                r2.writeWindowUpdateLater(r3, r4)     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x009a }
                okhttp3.internal.http2.Http2Connection r2 = r2.connection     // Catch:{ all -> 0x009a }
                r2.unacknowledgedBytesRead = r0     // Catch:{ all -> 0x009a }
            L_0x0098:
                monitor-exit(r10)     // Catch:{ all -> 0x009a }
                return r8
            L_0x009a:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x009a }
                throw r8
            L_0x009d:
                r8 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x009d }
                throw r8
            L_0x00a0:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "byteCount < 0: "
                r0.<init>(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(okio.Buffer, long):long");
        }
    }

    class StreamTimeout extends AsyncTimeout {
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
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

    public final synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    /* access modifiers changed from: 0000 */
    public final void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public final Sink getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.sink;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.f20937id & 1) == 1) {
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
            this.connection.removeStream(this.f20937id);
        }
    }

    /* access modifiers changed from: 0000 */
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
            this.connection.removeStream(this.f20937id);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void checkOutNotClosed() throws IOException {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        } else if (this.sink.finished) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            throw new StreamResetException(this.errorCode);
        }
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.finished || this.source.closed) && ((this.sink.finished || this.sink.closed) && this.hasResponseHeaders)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized List<Header> takeResponseHeaders() throws IOException {
        List<Header> list;
        if (isLocallyInitiated()) {
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
            list = this.responseHeaders;
            if (list != null) {
                this.responseHeaders = null;
            } else {
                throw new StreamResetException(this.errorCode);
            }
        } else {
            throw new IllegalStateException("servers cannot read response headers");
        }
        return list;
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
            this.connection.writeSynReset(this.f20937id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynResetLater(this.f20937id, errorCode2);
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
            this.connection.removeStream(this.f20937id);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void receiveHeaders(List<Header> list) {
        boolean z;
        synchronized (this) {
            z = true;
            this.hasResponseHeaders = true;
            if (this.responseHeaders == null) {
                this.responseHeaders = list;
                z = isOpen();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.responseHeaders);
                arrayList.add(null);
                arrayList.addAll(list);
                this.responseHeaders = arrayList;
            }
        }
        if (!z) {
            this.connection.removeStream(this.f20937id);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void receiveData(BufferedSource bufferedSource, int i) throws IOException {
        this.source.receive(bufferedSource, (long) i);
    }

    public final void sendResponseHeaders(List<Header> list, boolean z) throws IOException {
        if (list != null) {
            boolean z2 = false;
            synchronized (this) {
                this.hasResponseHeaders = true;
                if (!z) {
                    this.sink.finished = true;
                    z2 = true;
                }
            }
            this.connection.writeSynReply(this.f20937id, z2, list);
            if (z2) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("responseHeaders == null");
    }

    Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, List<Header> list) {
        if (http2Connection == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f20937id = i;
            this.connection = http2Connection;
            this.bytesLeftInWriteWindow = (long) http2Connection.peerSettings.getInitialWindowSize();
            this.source = new FramingSource((long) http2Connection.okHttpSettings.getInitialWindowSize());
            this.sink = new FramingSink();
            this.source.finished = z2;
            this.sink.finished = z;
            this.requestHeaders = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }
}
