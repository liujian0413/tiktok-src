package com.bytedance.apm.agent.instrumentation.p463io;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;

/* renamed from: com.bytedance.apm.agent.instrumentation.io.CountingInputStream */
public final class CountingInputStream extends InputStream implements StreamCompleteListenerSource {
    private static final AgentLog log = AgentLogManager.getAgentLog();
    private final ByteBuffer buffer;
    private long count;
    private boolean enableBuffering = false;
    private final InputStream impl;
    private final StreamCompleteListenerManager listenerManager = new StreamCompleteListenerManager();

    public final boolean markSupported() {
        return this.impl.markSupported();
    }

    private boolean bufferEmpty() {
        if (this.buffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    private int readBuffer() {
        if (bufferEmpty()) {
            return -1;
        }
        return this.buffer.get();
    }

    public final void close() throws IOException {
        try {
            this.impl.close();
            notifyStreamComplete();
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    private void notifyStreamComplete() {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamComplete(new StreamCompleteEvent(this, this.count));
        }
    }

    public final int available() throws IOException {
        int i;
        if (this.enableBuffering) {
            i = this.buffer.remaining();
        } else {
            i = 0;
        }
        try {
            return i + this.impl.available();
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    public final void reset() throws IOException {
        if (markSupported()) {
            try {
                this.impl.reset();
            } catch (IOException e) {
                notifyStreamError(e);
                throw e;
            }
        }
    }

    public final String getBufferAsString() {
        String str;
        if (this.buffer == null) {
            return "";
        }
        synchronized (this.buffer) {
            byte[] bArr = new byte[this.buffer.limit()];
            for (int i = 0; i < this.buffer.limit(); i++) {
                bArr[i] = this.buffer.get(i);
            }
            str = new String(bArr);
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.enableBuffering
            r1 = 1
            if (r0 == 0) goto L_0x0022
            java.nio.ByteBuffer r0 = r7.buffer
            monitor-enter(r0)
            boolean r3 = r7.bufferHasBytes(r1)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001d
            int r3 = r7.readBuffer()     // Catch:{ all -> 0x001f }
            if (r3 < 0) goto L_0x001b
            long r4 = r7.count     // Catch:{ all -> 0x001f }
            r6 = 0
            long r4 = r4 + r1
            r7.count = r4     // Catch:{ all -> 0x001f }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r3
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            goto L_0x0022
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        L_0x0022:
            java.io.InputStream r0 = r7.impl     // Catch:{ IOException -> 0x0035 }
            int r0 = r0.read()     // Catch:{ IOException -> 0x0035 }
            if (r0 < 0) goto L_0x0031
            long r3 = r7.count     // Catch:{ IOException -> 0x0035 }
            r5 = 0
            long r3 = r3 + r1
            r7.count = r3     // Catch:{ IOException -> 0x0035 }
            goto L_0x0034
        L_0x0031:
            r7.notifyStreamComplete()     // Catch:{ IOException -> 0x0035 }
        L_0x0034:
            return r0
        L_0x0035:
            r0 = move-exception
            r7.notifyStreamError(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.p463io.CountingInputStream.read():int");
    }

    public final void fillBuffer() {
        int i;
        if (this.buffer != null && this.buffer.hasArray()) {
            synchronized (this.buffer) {
                try {
                    i = this.impl.read(this.buffer.array(), 0, this.buffer.capacity());
                } catch (IOException e) {
                    log.error(e.toString());
                    i = 0;
                }
                if (i <= 0) {
                    this.buffer.limit(0);
                } else if (i < this.buffer.capacity()) {
                    this.buffer.limit(i);
                }
            }
        }
    }

    public final void setBufferingEnabled(boolean z) {
        this.enableBuffering = z;
    }

    private int readBufferBytes(byte[] bArr) {
        return readBufferBytes(bArr, 0, bArr.length);
    }

    public final void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.addStreamCompleteListener(streamCompleteListener);
    }

    public final void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.removeStreamCompleteListener(streamCompleteListener);
    }

    private boolean bufferHasBytes(long j) {
        if (((long) this.buffer.remaining()) >= j) {
            return true;
        }
        return false;
    }

    public final void mark(int i) {
        if (markSupported()) {
            this.impl.mark(i);
        }
    }

    private void notifyStreamError(Exception exc) {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamError(new StreamCompleteEvent(this, this.count, exc));
        }
    }

    public CountingInputStream(InputStream inputStream) {
        this.impl = inputStream;
        if (this.enableBuffering) {
            this.buffer = ByteBuffer.allocate(2048);
            fillBuffer();
            return;
        }
        this.buffer = null;
    }

    public final long skip(long j) throws IOException {
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes(j)) {
                    this.buffer.position((int) j);
                    this.count += j;
                    return j;
                }
                j -= (long) this.buffer.remaining();
                if (j > 0) {
                    this.buffer.position(this.buffer.remaining());
                } else {
                    throw new IOException("partial read from buffer (skip) failed");
                }
            }
        }
        try {
            long skip = this.impl.skip(j);
            this.count += skip;
            return skip;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes((long) length)) {
                    int readBufferBytes = readBufferBytes(bArr);
                    if (readBufferBytes >= 0) {
                        this.count += (long) readBufferBytes;
                        return readBufferBytes;
                    }
                    throw new IOException("readBufferBytes failed");
                }
                int remaining = this.buffer.remaining();
                if (remaining > 0) {
                    i = readBufferBytes(bArr, 0, remaining);
                    if (i >= 0) {
                        length -= i;
                        this.count += (long) i;
                    } else {
                        throw new IOException("partial read from buffer failed");
                    }
                }
            }
        }
        try {
            int read = this.impl.read(bArr, i, length);
            if (read >= 0) {
                this.count += (long) read;
                return read + i;
            } else if (i > 0) {
                return i;
            } else {
                notifyStreamComplete();
                return read;
            }
        } catch (IOException e) {
            log.error(e.toString());
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("NOTIFY STREAM ERROR: ");
            sb.append(e);
            printStream.println(sb.toString());
            notifyStreamError(e);
            throw e;
        }
    }

    public CountingInputStream(InputStream inputStream, boolean z) {
        this.impl = inputStream;
        this.enableBuffering = z;
        if (z) {
            this.buffer = ByteBuffer.allocate(2048);
            fillBuffer();
            return;
        }
        this.buffer = null;
    }

    private int readBufferBytes(byte[] bArr, int i, int i2) {
        if (bufferEmpty()) {
            return -1;
        }
        int remaining = this.buffer.remaining();
        this.buffer.get(bArr, i, i2);
        return remaining - this.buffer.remaining();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes((long) i2)) {
                    int readBufferBytes = readBufferBytes(bArr, i, i2);
                    if (readBufferBytes >= 0) {
                        this.count += (long) readBufferBytes;
                        return readBufferBytes;
                    }
                    throw new IOException("readBufferBytes failed");
                }
                int remaining = this.buffer.remaining();
                if (remaining > 0) {
                    i3 = readBufferBytes(bArr, i, remaining);
                    if (i3 >= 0) {
                        i2 -= i3;
                        this.count += (long) i3;
                    } else {
                        throw new IOException("partial read from buffer failed");
                    }
                }
            }
        }
        try {
            int read = this.impl.read(bArr, i + i3, i2);
            if (read >= 0) {
                this.count += (long) read;
                return read + i3;
            } else if (i3 > 0) {
                return i3;
            } else {
                notifyStreamComplete();
                return read;
            }
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }
}
