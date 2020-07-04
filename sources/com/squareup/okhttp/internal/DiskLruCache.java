package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.p810io.FileSystem;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

public final class DiskLruCache implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final Sink NULL_SINK = new Sink() {
        public final void close() throws IOException {
        }

        public final void flush() throws IOException {
        }

        public final Timeout timeout() {
            return Timeout.NONE;
        }

        public final void write(Buffer buffer, long j) throws IOException {
            buffer.skip(j);
        }
    };
    private final int appVersion;
    private final Runnable cleanupRunnable = new Runnable() {
        public void run() {
            synchronized (DiskLruCache.this) {
                if (!(!DiskLruCache.this.initialized) && !DiskLruCache.this.closed) {
                    try {
                        DiskLruCache.this.trimToSize();
                        if (DiskLruCache.this.journalRebuildRequired()) {
                            DiskLruCache.this.rebuildJournal();
                            DiskLruCache.this.redundantOpCount = 0;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    };
    public boolean closed;
    public final File directory;
    private final Executor executor;
    public final FileSystem fileSystem;
    public boolean hasJournalErrors;
    public boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private BufferedSink journalWriter;
    public final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    private long nextSequenceNumber = 0;
    public int redundantOpCount;
    private long size;
    public final int valueCount;

    public final class Editor {
        private boolean committed;
        public final Entry entry;
        public boolean hasErrors;
        public final boolean[] written;

        public final void abort() throws IOException {
            synchronized (DiskLruCache.this) {
                DiskLruCache.this.completeEdit(this, false);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:5|6)|7|8) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void abortUnlessCommitted() {
            /*
                r3 = this;
                com.squareup.okhttp.internal.DiskLruCache r0 = com.squareup.okhttp.internal.DiskLruCache.this
                monitor-enter(r0)
                boolean r1 = r3.committed     // Catch:{ all -> 0x000f }
                if (r1 != 0) goto L_0x000d
                com.squareup.okhttp.internal.DiskLruCache r1 = com.squareup.okhttp.internal.DiskLruCache.this     // Catch:{ IOException -> 0x000d }
                r2 = 0
                r1.completeEdit(r3, r2)     // Catch:{ IOException -> 0x000d }
            L_0x000d:
                monitor-exit(r0)     // Catch:{ all -> 0x000f }
                return
            L_0x000f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x000f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.DiskLruCache.Editor.abortUnlessCommitted():void");
        }

        public final void commit() throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.hasErrors) {
                    DiskLruCache.this.completeEdit(this, false);
                    DiskLruCache.this.removeEntry(this.entry);
                } else {
                    DiskLruCache.this.completeEdit(this, true);
                }
                this.committed = true;
            }
        }

        public final Sink newSink(int i) throws IOException {
            C187681 r1;
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor == this) {
                    if (!this.entry.readable) {
                        this.written[i] = true;
                    }
                    try {
                        r1 = new FaultHidingSink(DiskLruCache.this.fileSystem.sink(this.entry.dirtyFiles[i])) {
                            /* access modifiers changed from: protected */
                            public void onException(IOException iOException) {
                                synchronized (DiskLruCache.this) {
                                    Editor.this.hasErrors = true;
                                }
                            }
                        };
                    } catch (FileNotFoundException unused) {
                        return DiskLruCache.NULL_SINK;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return r1;
        }

        public final Source newSource(int i) throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                } else if (!this.entry.readable) {
                    return null;
                } else {
                    try {
                        Source source = DiskLruCache.this.fileSystem.source(this.entry.cleanFiles[i]);
                        return source;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        private Editor(Entry entry2) {
            boolean[] zArr;
            this.entry = entry2;
            if (entry2.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }
    }

    final class Entry {
        public final File[] cleanFiles;
        public Editor currentEditor;
        public final File[] dirtyFiles;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        /* access modifiers changed from: 0000 */
        public final Snapshot snapshot() {
            if (Thread.holdsLock(DiskLruCache.this)) {
                Source[] sourceArr = new Source[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < DiskLruCache.this.valueCount) {
                    try {
                        sourceArr[i2] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < DiskLruCache.this.valueCount && sourceArr[i] != null) {
                            Util.closeQuietly((Closeable) sourceArr[i]);
                            i++;
                        }
                        return null;
                    }
                }
                Snapshot snapshot = new Snapshot(this.key, this.sequenceNumber, sourceArr, jArr);
                return snapshot;
            }
            throw new AssertionError();
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public final void writeLengths(BufferedSink bufferedSink) throws IOException {
            for (long writeDecimalLong : this.lengths) {
                bufferedSink.writeByte(32).writeDecimalLong(writeDecimalLong);
            }
        }

        public final void setLengths(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.valueCount) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        private Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                sb.append(i);
                this.cleanFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.append(".tmp");
                this.dirtyFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public final class Snapshot implements Closeable {
        public final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final Source[] sources;

        public final String key() {
            return this.key;
        }

        public final void close() {
            for (Source closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }

        public final Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final Source getSource(int i) {
            return this.sources[i];
        }

        private Snapshot(String str, long j, Source[] sourceArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.sources = sourceArr;
            this.lengths = jArr;
        }
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new Iterator<Snapshot>() {
            final Iterator<Entry> delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();
            Snapshot nextSnapshot;
            Snapshot removeSnapshot;

            public Snapshot next() {
                if (hasNext()) {
                    this.removeSnapshot = this.nextSnapshot;
                    this.nextSnapshot = null;
                    return this.removeSnapshot;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                if (this.removeSnapshot != null) {
                    try {
                        DiskLruCache.this.remove(this.removeSnapshot.key);
                    } catch (IOException unused) {
                    } finally {
                        this.removeSnapshot = null;
                    }
                } else {
                    throw new IllegalStateException("remove() before next()");
                }
            }

            public boolean hasNext() {
                if (this.nextSnapshot != null) {
                    return true;
                }
                synchronized (DiskLruCache.this) {
                    if (DiskLruCache.this.closed) {
                        return false;
                    }
                    while (this.delegate.hasNext()) {
                        Snapshot snapshot = ((Entry) this.delegate.next()).snapshot();
                        if (snapshot != null) {
                            this.nextSnapshot = snapshot;
                            return true;
                        }
                    }
                    return false;
                }
            }
        };
    }

    private synchronized void checkNotClosed() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private BufferedSink newJournalWriter() throws FileNotFoundException {
        return Okio.buffer((Sink) new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) {
            static final /* synthetic */ boolean $assertionsDisabled = false;

            static {
                Class<DiskLruCache> cls = DiskLruCache.class;
            }

            /* access modifiers changed from: protected */
            public void onException(IOException iOException) {
                DiskLruCache.this.hasJournalErrors = true;
            }
        });
    }

    public final synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            this.journalWriter.flush();
        }
    }

    public final boolean journalRebuildRequired() {
        if (this.redundantOpCount < 2000 || this.redundantOpCount < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            removeEntry((Entry) this.lruEntries.values().iterator().next());
        }
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        for (Entry removeEntry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
            removeEntry(removeEntry);
        }
    }

    private void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int i = 0;
            if (entry.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += entry.lengths[i];
                    i++;
                }
            } else {
                entry.currentEditor = null;
                while (i < this.valueCount) {
                    this.fileSystem.delete(entry.cleanFiles[i]);
                    this.fileSystem.delete(entry.dirtyFiles[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void close() throws IOException {
        Entry[] entryArr;
        if (this.initialized) {
            if (!this.closed) {
                for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
                    if (entry.currentEditor != null) {
                        entry.currentEditor.abort();
                    }
                }
                trimToSize();
                this.journalWriter.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
        }
        this.closed = true;
    }

    public final synchronized void initialize() throws IOException {
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.get();
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.directory);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    platform.logW(sb.toString());
                    delete();
                    this.closed = false;
                }
            }
            rebuildJournal();
            this.initialized = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8.redundantOpCount = r1 - r8.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0.exhausted() == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        rebuildJournal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r8.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0078=Splitter:B:23:0x0078, B:16:0x005b=Splitter:B:16:0x005b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readJournal() throws java.io.IOException {
        /*
            r8 = this;
            com.squareup.okhttp.internal.io.FileSystem r0 = r8.fileSystem
            java.io.File r1 = r8.journalFile
            okio.Source r0 = r0.source(r1)
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            java.lang.String r1 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00a9 }
            if (r6 == 0) goto L_0x0078
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x00a9 }
            if (r6 == 0) goto L_0x0078
            int r6 = r8.appVersion     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x00a9 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0078
            int r3 = r8.valueCount     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x00a9 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0078
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0078
            r1 = 0
        L_0x0051:
            java.lang.String r2 = r0.readUtf8LineStrict()     // Catch:{ EOFException -> 0x005b }
            r8.readJournalLine(r2)     // Catch:{ EOFException -> 0x005b }
            int r1 = r1 + 1
            goto L_0x0051
        L_0x005b:
            java.util.LinkedHashMap<java.lang.String, com.squareup.okhttp.internal.DiskLruCache$Entry> r2 = r8.lruEntries     // Catch:{ all -> 0x00a9 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a9 }
            int r1 = r1 - r2
            r8.redundantOpCount = r1     // Catch:{ all -> 0x00a9 }
            boolean r1 = r0.exhausted()     // Catch:{ all -> 0x00a9 }
            if (r1 != 0) goto L_0x006e
            r8.rebuildJournal()     // Catch:{ all -> 0x00a9 }
            goto L_0x0074
        L_0x006e:
            okio.BufferedSink r1 = r8.newJournalWriter()     // Catch:{ all -> 0x00a9 }
            r8.journalWriter = r1     // Catch:{ all -> 0x00a9 }
        L_0x0074:
            com.squareup.okhttp.internal.Util.closeQuietly(r0)
            return
        L_0x0078:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x00a9 }
            r6.append(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00a9 }
            r6.append(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00a9 }
            r6.append(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00a9 }
            r6.append(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00a9 }
            r3.<init>(r1)     // Catch:{ all -> 0x00a9 }
            throw r3     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            com.squareup.okhttp.internal.Util.closeQuietly(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.DiskLruCache.readJournal():void");
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void rebuildJournal() throws IOException {
        if (this.journalWriter != null) {
            this.journalWriter.close();
        }
        BufferedSink buffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp));
        try {
            buffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
            buffer.writeUtf8("1").writeByte(10);
            buffer.writeDecimalLong((long) this.appVersion).writeByte(10);
            buffer.writeDecimalLong((long) this.valueCount).writeByte(10);
            buffer.writeByte(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    buffer.writeUtf8("DIRTY").writeByte(32);
                    buffer.writeUtf8(entry.key);
                    buffer.writeByte(10);
                } else {
                    buffer.writeUtf8("CLEAN").writeByte(32);
                    buffer.writeUtf8(entry.key);
                    entry.writeLengths(buffer);
                    buffer.writeByte(10);
                }
            }
            buffer.close();
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
        } catch (Throwable th) {
            buffer.close();
            throw th;
        }
    }

    public final Editor edit(String str) throws IOException {
        return edit(str, -1);
    }

    public final synchronized boolean remove(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = (Entry) this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        return removeEntry(entry);
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            this.executor.execute(this.cleanupRunnable);
        }
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.squareup.okhttp.internal.DiskLruCache.Snapshot get(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.initialize()     // Catch:{ all -> 0x0050 }
            r3.checkNotClosed()     // Catch:{ all -> 0x0050 }
            r3.validateKey(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, com.squareup.okhttp.internal.DiskLruCache$Entry> r0 = r3.lruEntries     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            com.squareup.okhttp.internal.DiskLruCache$Entry r0 = (com.squareup.okhttp.internal.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.readable     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            com.squareup.okhttp.internal.DiskLruCache$Snapshot r0 = r0.snapshot()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.redundantOpCount     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.redundantOpCount = r1     // Catch:{ all -> 0x0050 }
            okio.BufferedSink r1 = r3.journalWriter     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            okio.BufferedSink r1 = r1.writeUtf8(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0050 }
            okio.BufferedSink r4 = r1.writeUtf8(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.journalRebuildRequired()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.executor     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.cleanupRunnable     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.DiskLruCache.get(java.lang.String):com.squareup.okhttp.internal.DiskLruCache$Snapshot");
    }

    public final boolean removeEntry(Entry entry) throws IOException {
        if (entry.currentEditor != null) {
            entry.currentEditor.hasErrors = true;
        }
        for (int i = 0; i < this.valueCount; i++) {
            this.fileSystem.delete(entry.cleanFiles[i]);
            this.size -= entry.lengths[i];
            entry.lengths[i] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.writeUtf8("REMOVE").writeByte(32).writeUtf8(entry.key).writeByte(10);
        this.lruEntries.remove(entry.key);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    private void readJournalLine(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            Entry entry = (Entry) this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(str2);
                this.lruEntries.put(str2, entry);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                entry.readable = true;
                entry.currentEditor = null;
                entry.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                entry.currentEditor = new Editor(entry);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                StringBuilder sb = new StringBuilder("unexpected journal line: ");
                sb.append(str);
                throw new IOException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.squareup.okhttp.internal.DiskLruCache.Editor edit(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch:{ all -> 0x0062 }
            r5.checkNotClosed()     // Catch:{ all -> 0x0062 }
            r5.validateKey(r6)     // Catch:{ all -> 0x0062 }
            java.util.LinkedHashMap<java.lang.String, com.squareup.okhttp.internal.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0062 }
            com.squareup.okhttp.internal.DiskLruCache$Entry r0 = (com.squareup.okhttp.internal.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0062 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.sequenceNumber     // Catch:{ all -> 0x0062 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            com.squareup.okhttp.internal.DiskLruCache$Editor r7 = r0.currentEditor     // Catch:{ all -> 0x0062 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            okio.BufferedSink r7 = r5.journalWriter     // Catch:{ all -> 0x0062 }
            java.lang.String r8 = "DIRTY"
            okio.BufferedSink r7 = r7.writeUtf8(r8)     // Catch:{ all -> 0x0062 }
            r8 = 32
            okio.BufferedSink r7 = r7.writeByte(r8)     // Catch:{ all -> 0x0062 }
            okio.BufferedSink r7 = r7.writeUtf8(r6)     // Catch:{ all -> 0x0062 }
            r8 = 10
            r7.writeByte(r8)     // Catch:{ all -> 0x0062 }
            okio.BufferedSink r7 = r5.journalWriter     // Catch:{ all -> 0x0062 }
            r7.flush()     // Catch:{ all -> 0x0062 }
            boolean r7 = r5.hasJournalErrors     // Catch:{ all -> 0x0062 }
            if (r7 == 0) goto L_0x004d
            monitor-exit(r5)
            return r3
        L_0x004d:
            if (r0 != 0) goto L_0x0059
            com.squareup.okhttp.internal.DiskLruCache$Entry r0 = new com.squareup.okhttp.internal.DiskLruCache$Entry     // Catch:{ all -> 0x0062 }
            r0.<init>(r6)     // Catch:{ all -> 0x0062 }
            java.util.LinkedHashMap<java.lang.String, com.squareup.okhttp.internal.DiskLruCache$Entry> r7 = r5.lruEntries     // Catch:{ all -> 0x0062 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0062 }
        L_0x0059:
            com.squareup.okhttp.internal.DiskLruCache$Editor r6 = new com.squareup.okhttp.internal.DiskLruCache$Editor     // Catch:{ all -> 0x0062 }
            r6.<init>(r0)     // Catch:{ all -> 0x0062 }
            r0.currentEditor = r6     // Catch:{ all -> 0x0062 }
            monitor-exit(r5)
            return r6
        L_0x0062:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.DiskLruCache.edit(java.lang.String, long):com.squareup.okhttp.internal.DiskLruCache$Editor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit(com.squareup.okhttp.internal.DiskLruCache.Editor r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.squareup.okhttp.internal.DiskLruCache$Entry r0 = r10.entry     // Catch:{ all -> 0x00f9 }
            com.squareup.okhttp.internal.DiskLruCache$Editor r1 = r0.currentEditor     // Catch:{ all -> 0x00f9 }
            if (r1 != r10) goto L_0x00f3
            r1 = 0
            if (r11 == 0) goto L_0x0044
            boolean r2 = r0.readable     // Catch:{ all -> 0x00f9 }
            if (r2 != 0) goto L_0x0044
            r2 = 0
        L_0x000f:
            int r3 = r9.valueCount     // Catch:{ all -> 0x00f9 }
            if (r2 >= r3) goto L_0x0044
            boolean[] r3 = r10.written     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x002d
            com.squareup.okhttp.internal.io.FileSystem r3 = r9.fileSystem     // Catch:{ all -> 0x00f9 }
            java.io.File[] r4 = r0.dirtyFiles     // Catch:{ all -> 0x00f9 }
            r4 = r4[r2]     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3.exists(r4)     // Catch:{ all -> 0x00f9 }
            if (r3 != 0) goto L_0x002a
            r10.abort()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.abort()     // Catch:{ all -> 0x00f9 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f9 }
            r11.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f9 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x0044:
            int r10 = r9.valueCount     // Catch:{ all -> 0x00f9 }
            if (r1 >= r10) goto L_0x007d
            java.io.File[] r10 = r0.dirtyFiles     // Catch:{ all -> 0x00f9 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x0075
            com.squareup.okhttp.internal.io.FileSystem r2 = r9.fileSystem     // Catch:{ all -> 0x00f9 }
            boolean r2 = r2.exists(r10)     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x007a
            java.io.File[] r2 = r0.cleanFiles     // Catch:{ all -> 0x00f9 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f9 }
            com.squareup.okhttp.internal.io.FileSystem r3 = r9.fileSystem     // Catch:{ all -> 0x00f9 }
            r3.rename(r10, r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.lengths     // Catch:{ all -> 0x00f9 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f9 }
            com.squareup.okhttp.internal.io.FileSystem r10 = r9.fileSystem     // Catch:{ all -> 0x00f9 }
            long r5 = r10.size(r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.lengths     // Catch:{ all -> 0x00f9 }
            r10[r1] = r5     // Catch:{ all -> 0x00f9 }
            long r7 = r9.size     // Catch:{ all -> 0x00f9 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.size = r7     // Catch:{ all -> 0x00f9 }
            goto L_0x007a
        L_0x0075:
            com.squareup.okhttp.internal.io.FileSystem r2 = r9.fileSystem     // Catch:{ all -> 0x00f9 }
            r2.delete(r10)     // Catch:{ all -> 0x00f9 }
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x0044
        L_0x007d:
            int r10 = r9.redundantOpCount     // Catch:{ all -> 0x00f9 }
            r1 = 1
            int r10 = r10 + r1
            r9.redundantOpCount = r10     // Catch:{ all -> 0x00f9 }
            r10 = 0
            r0.currentEditor = r10     // Catch:{ all -> 0x00f9 }
            boolean r10 = r0.readable     // Catch:{ all -> 0x00f9 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b9
            r0.readable = r1     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.journalWriter     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "CLEAN"
            okio.BufferedSink r10 = r10.writeUtf8(r1)     // Catch:{ all -> 0x00f9 }
            r10.writeByte(r3)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.journalWriter     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.key     // Catch:{ all -> 0x00f9 }
            r10.writeUtf8(r1)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.journalWriter     // Catch:{ all -> 0x00f9 }
            r0.writeLengths(r10)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.journalWriter     // Catch:{ all -> 0x00f9 }
            r10.writeByte(r2)     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x00d7
            long r10 = r9.nextSequenceNumber     // Catch:{ all -> 0x00f9 }
            r1 = 1
            long r1 = r1 + r10
            r9.nextSequenceNumber = r1     // Catch:{ all -> 0x00f9 }
            r0.sequenceNumber = r10     // Catch:{ all -> 0x00f9 }
            goto L_0x00d7
        L_0x00b9:
            java.util.LinkedHashMap<java.lang.String, com.squareup.okhttp.internal.DiskLruCache$Entry> r10 = r9.lruEntries     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.key     // Catch:{ all -> 0x00f9 }
            r10.remove(r11)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.journalWriter     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "REMOVE"
            okio.BufferedSink r10 = r10.writeUtf8(r11)     // Catch:{ all -> 0x00f9 }
            r10.writeByte(r3)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.journalWriter     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.key     // Catch:{ all -> 0x00f9 }
            r10.writeUtf8(r11)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.journalWriter     // Catch:{ all -> 0x00f9 }
            r10.writeByte(r2)     // Catch:{ all -> 0x00f9 }
        L_0x00d7:
            okio.BufferedSink r10 = r9.journalWriter     // Catch:{ all -> 0x00f9 }
            r10.flush()     // Catch:{ all -> 0x00f9 }
            long r10 = r9.size     // Catch:{ all -> 0x00f9 }
            long r0 = r9.maxSize     // Catch:{ all -> 0x00f9 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ea
            boolean r10 = r9.journalRebuildRequired()     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x00f1
        L_0x00ea:
            java.util.concurrent.Executor r10 = r9.executor     // Catch:{ all -> 0x00f9 }
            java.lang.Runnable r11 = r9.cleanupRunnable     // Catch:{ all -> 0x00f9 }
            r10.execute(r11)     // Catch:{ all -> 0x00f9 }
        L_0x00f1:
            monitor-exit(r9)
            return
        L_0x00f3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            r10.<init>()     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.DiskLruCache.completeEdit(com.squareup.okhttp.internal.DiskLruCache$Editor, boolean):void");
    }

    public static DiskLruCache create(FileSystem fileSystem2, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true));
            DiskLruCache diskLruCache = new DiskLruCache(fileSystem2, file, i, i2, j, threadPoolExecutor);
            return diskLruCache;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, Executor executor2) {
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
        this.executor = executor2;
    }
}
