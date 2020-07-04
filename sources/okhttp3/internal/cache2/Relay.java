package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

final class Relay {
    static final ByteString PREFIX_CLEAN = ByteString.encodeUtf8("OkHttp cache v1\n");
    static final ByteString PREFIX_DIRTY = ByteString.encodeUtf8("OkHttp DIRTY :(\n");
    final Buffer buffer = new Buffer();
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    public final ByteString metadata;
    int sourceCount;
    Source upstream;
    final Buffer upstreamBuffer = new Buffer();
    long upstreamPos;
    Thread upstreamReader;

    class RelaySource implements Source {
        private FileOperator fileOperator = new FileOperator(Relay.this.file.getChannel());
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        public Timeout timeout() {
            return this.timeout;
        }

        public void close() throws IOException {
            if (this.fileOperator != null) {
                Closeable closeable = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay.this.sourceCount--;
                    if (Relay.this.sourceCount == 0) {
                        RandomAccessFile randomAccessFile = Relay.this.file;
                        Relay.this.file = null;
                        closeable = randomAccessFile;
                    }
                }
                if (closeable != null) {
                    Util.closeQuietly(closeable);
                }
            }
        }

        RelaySource() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r5 = r7 - r1.this$0.buffer.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
            if (r1.sourcePos >= r5) goto L_0x0120;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r2 = java.lang.Math.min(r2, r7 - r1.sourcePos);
            r1.this$0.buffer.copyTo(r22, r1.sourcePos - r5, r2);
            r1.sourcePos += r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x013e, code lost:
            return r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(okio.Buffer r22, long r23) throws java.io.IOException {
            /*
                r21 = this;
                r1 = r21
                r2 = r23
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                if (r0 == 0) goto L_0x0142
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r4)
            L_0x000b:
                long r5 = r1.sourcePos     // Catch:{ all -> 0x013f }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x013f }
                long r7 = r0.upstreamPos     // Catch:{ all -> 0x013f }
                r0 = 2
                r9 = -1
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 != 0) goto L_0x0039
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x013f }
                boolean r5 = r5.complete     // Catch:{ all -> 0x013f }
                if (r5 == 0) goto L_0x0020
                monitor-exit(r4)     // Catch:{ all -> 0x013f }
                return r9
            L_0x0020:
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x013f }
                java.lang.Thread r5 = r5.upstreamReader     // Catch:{ all -> 0x013f }
                if (r5 == 0) goto L_0x002e
                okio.Timeout r0 = r1.timeout     // Catch:{ all -> 0x013f }
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x013f }
                r0.waitUntilNotified(r5)     // Catch:{ all -> 0x013f }
                goto L_0x000b
            L_0x002e:
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x013f }
                java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x013f }
                r5.upstreamReader = r6     // Catch:{ all -> 0x013f }
                r5 = 1
                monitor-exit(r4)     // Catch:{ all -> 0x013f }
                goto L_0x004c
            L_0x0039:
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x013f }
                okio.Buffer r5 = r5.buffer     // Catch:{ all -> 0x013f }
                long r5 = r5.size()     // Catch:{ all -> 0x013f }
                r11 = 0
                long r5 = r7 - r5
                long r11 = r1.sourcePos     // Catch:{ all -> 0x013f }
                int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r13 >= 0) goto L_0x0120
                monitor-exit(r4)     // Catch:{ all -> 0x013f }
                r5 = 2
            L_0x004c:
                r11 = 32
                if (r5 != r0) goto L_0x006a
                long r4 = r1.sourcePos
                long r7 = r7 - r4
                long r2 = java.lang.Math.min(r2, r7)
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator
                long r4 = r1.sourcePos
                long r14 = r4 + r11
                r16 = r22
                r17 = r2
                r13.read(r14, r16, r17)
                long r4 = r1.sourcePos
                long r4 = r4 + r2
                r1.sourcePos = r4
                return r2
            L_0x006a:
                r4 = 0
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010e }
                okio.Source r0 = r0.upstream     // Catch:{ all -> 0x010e }
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010e }
                okio.Buffer r5 = r5.upstreamBuffer     // Catch:{ all -> 0x010e }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010e }
                long r13 = r6.bufferMaxSize     // Catch:{ all -> 0x010e }
                long r5 = r0.read(r5, r13)     // Catch:{ all -> 0x010e }
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x0095
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010e }
                r0.commit(r7)     // Catch:{ all -> 0x010e }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0092 }
                r0.upstreamReader = r4     // Catch:{ all -> 0x0092 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0092 }
                r0.notifyAll()     // Catch:{ all -> 0x0092 }
                monitor-exit(r2)     // Catch:{ all -> 0x0092 }
                return r9
            L_0x0092:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0092 }
                throw r0
            L_0x0095:
                long r2 = java.lang.Math.min(r5, r2)     // Catch:{ all -> 0x010e }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010e }
                okio.Buffer r13 = r0.upstreamBuffer     // Catch:{ all -> 0x010e }
                r15 = 0
                r14 = r22
                r17 = r2
                r13.copyTo(r14, r15, r17)     // Catch:{ all -> 0x010e }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x010e }
                r0 = 0
                long r9 = r9 + r2
                r1.sourcePos = r9     // Catch:{ all -> 0x010e }
                okhttp3.internal.cache2.FileOperator r15 = r1.fileOperator     // Catch:{ all -> 0x010e }
                r0 = 0
                long r16 = r7 + r11
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010e }
                okio.Buffer r0 = r0.upstreamBuffer     // Catch:{ all -> 0x010e }
                okio.Buffer r18 = r0.clone()     // Catch:{ all -> 0x010e }
                r19 = r5
                r15.write(r16, r18, r19)     // Catch:{ all -> 0x010e }
                okhttp3.internal.cache2.Relay r7 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010e }
                monitor-enter(r7)     // Catch:{ all -> 0x010e }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010b }
                okio.Buffer r0 = r0.buffer     // Catch:{ all -> 0x010b }
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010b }
                okio.Buffer r8 = r8.upstreamBuffer     // Catch:{ all -> 0x010b }
                r0.write(r8, r5)     // Catch:{ all -> 0x010b }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010b }
                okio.Buffer r0 = r0.buffer     // Catch:{ all -> 0x010b }
                long r8 = r0.size()     // Catch:{ all -> 0x010b }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010b }
                long r10 = r0.bufferMaxSize     // Catch:{ all -> 0x010b }
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 <= 0) goto L_0x00f1
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010b }
                okio.Buffer r0 = r0.buffer     // Catch:{ all -> 0x010b }
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010b }
                okio.Buffer r8 = r8.buffer     // Catch:{ all -> 0x010b }
                long r8 = r8.size()     // Catch:{ all -> 0x010b }
                okhttp3.internal.cache2.Relay r10 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010b }
                long r10 = r10.bufferMaxSize     // Catch:{ all -> 0x010b }
                r12 = 0
                long r8 = r8 - r10
                r0.skip(r8)     // Catch:{ all -> 0x010b }
            L_0x00f1:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x010b }
                long r8 = r0.upstreamPos     // Catch:{ all -> 0x010b }
                r10 = 0
                long r8 = r8 + r5
                r0.upstreamPos = r8     // Catch:{ all -> 0x010b }
                monitor-exit(r7)     // Catch:{ all -> 0x010b }
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r5)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0108 }
                r0.upstreamReader = r4     // Catch:{ all -> 0x0108 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0108 }
                r0.notifyAll()     // Catch:{ all -> 0x0108 }
                monitor-exit(r5)     // Catch:{ all -> 0x0108 }
                return r2
            L_0x0108:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0108 }
                throw r0
            L_0x010b:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x010b }
                throw r0     // Catch:{ all -> 0x010e }
            L_0x010e:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x011d }
                r3.upstreamReader = r4     // Catch:{ all -> 0x011d }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x011d }
                r3.notifyAll()     // Catch:{ all -> 0x011d }
                monitor-exit(r2)     // Catch:{ all -> 0x011d }
                throw r0
            L_0x011d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x011d }
                throw r0
            L_0x0120:
                long r9 = r1.sourcePos     // Catch:{ all -> 0x013f }
                r0 = 0
                long r7 = r7 - r9
                long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x013f }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x013f }
                okio.Buffer r9 = r0.buffer     // Catch:{ all -> 0x013f }
                long r7 = r1.sourcePos     // Catch:{ all -> 0x013f }
                r0 = 0
                long r11 = r7 - r5
                r10 = r22
                r13 = r2
                r9.copyTo(r10, r11, r13)     // Catch:{ all -> 0x013f }
                long r5 = r1.sourcePos     // Catch:{ all -> 0x013f }
                r0 = 0
                long r5 = r5 + r2
                r1.sourcePos = r5     // Catch:{ all -> 0x013f }
                monitor-exit(r4)     // Catch:{ all -> 0x013f }
                return r2
            L_0x013f:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x013f }
                throw r0
            L_0x0142:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.Buffer, long):long");
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    private void writeMetadata(long j) throws IOException {
        Buffer buffer2 = new Buffer();
        buffer2.write(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, buffer2, (long) this.metadata.size());
    }

    /* access modifiers changed from: 0000 */
    public final void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.size());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly((Closeable) this.upstream);
        this.upstream = null;
    }

    public static Relay read(File file2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        Buffer buffer2 = new Buffer();
        fileOperator.read(0, buffer2, 32);
        if (buffer2.readByteString((long) PREFIX_CLEAN.size()).equals(PREFIX_CLEAN)) {
            long readLong = buffer2.readLong();
            long readLong2 = buffer2.readLong();
            Buffer buffer3 = new Buffer();
            fileOperator.read(readLong + 32, buffer3, readLong2);
            Relay relay = new Relay(randomAccessFile, null, readLong, buffer3.readByteString(), 0);
            return relay;
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(ByteString byteString, long j, long j2) throws IOException {
        Buffer buffer2 = new Buffer();
        buffer2.write(byteString);
        buffer2.writeLong(j);
        buffer2.writeLong(j2);
        if (buffer2.size() == 32) {
            new FileOperator(this.file.getChannel()).write(0, buffer2, 32);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Relay edit(File file2, Source source, ByteString byteString, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        Relay relay = new Relay(randomAccessFile, source, 0, byteString, j);
        randomAccessFile.setLength(0);
        relay.writeHeader(PREFIX_DIRTY, -1, -1);
        return relay;
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2) {
        boolean z;
        this.file = randomAccessFile;
        this.upstream = source;
        if (source == null) {
            z = true;
        } else {
            z = false;
        }
        this.complete = z;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
    }
}
