package com.bytedance.boost_multidex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

class Locker {
    private FileLock cacheLock;
    private FileChannel lockChannel;
    private File lockFile;
    private RandomAccessFile lockRaf;

    Locker(File file) {
        this.lockFile = file;
    }

    /* access modifiers changed from: 0000 */
    public void close() {
        if (this.cacheLock != null) {
            try {
                this.cacheLock.release();
            } catch (IOException unused) {
            }
        }
        Monitor monitor = Monitor.get();
        StringBuilder sb = new StringBuilder("Released lock ");
        sb.append(this.lockFile.getPath());
        monitor.logInfo(sb.toString());
        Utility.closeQuietly(this.lockChannel);
        Utility.closeQuietly(this.lockRaf);
    }

    /* access modifiers changed from: 0000 */
    public void lock() {
        this.lockRaf = new RandomAccessFile(this.lockFile, "rw");
        try {
            this.lockChannel = this.lockRaf.getChannel();
            Monitor monitor = Monitor.get();
            StringBuilder sb = new StringBuilder("Blocking on lock ");
            sb.append(this.lockFile.getPath());
            monitor.logInfo(sb.toString());
            this.cacheLock = this.lockChannel.lock();
            Monitor monitor2 = Monitor.get();
            StringBuilder sb2 = new StringBuilder("Acquired on lock ");
            sb2.append(this.lockFile.getPath());
            monitor2.logInfo(sb2.toString());
        } catch (IOException e) {
            Utility.closeQuietly(this.lockChannel);
            throw e;
        } catch (IOException e2) {
            Utility.closeQuietly(this.lockRaf);
            throw e2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1 = com.bytedance.boost_multidex.Monitor.get();
        r2 = new java.lang.StringBuilder("Aborting on lock ");
        r2.append(r4.lockFile.getPath());
        r1.logInfo(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0075, code lost:
        r1 = com.bytedance.boost_multidex.Monitor.get();
        r2 = new java.lang.StringBuilder("Acquired on lock ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0081, code lost:
        r1 = com.bytedance.boost_multidex.Monitor.get();
        r2 = new java.lang.StringBuilder("Acquired on lock ");
        r2.append(r4.lockFile.getPath());
        r1.logInfo(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean test() {
        /*
            r4 = this;
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.io.File r1 = r4.lockFile
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)
            r4.lockRaf = r0
            java.io.RandomAccessFile r0 = r4.lockRaf
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r4.lockChannel = r0
            r0 = 0
            com.bytedance.boost_multidex.Monitor r1 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ IOException -> 0x005a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005a }
            java.lang.String r3 = "Blocking on lock "
            r2.<init>(r3)     // Catch:{ IOException -> 0x005a }
            java.io.File r3 = r4.lockFile     // Catch:{ IOException -> 0x005a }
            java.lang.String r3 = r3.getPath()     // Catch:{ IOException -> 0x005a }
            r2.append(r3)     // Catch:{ IOException -> 0x005a }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x005a }
            r1.logInfo(r2)     // Catch:{ IOException -> 0x005a }
            java.nio.channels.FileChannel r1 = r4.lockChannel     // Catch:{ IOException -> 0x005a }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ IOException -> 0x005a }
            r4.cacheLock = r1     // Catch:{ IOException -> 0x005a }
            java.nio.channels.FileLock r1 = r4.cacheLock     // Catch:{ IOException -> 0x005a }
            if (r1 == 0) goto L_0x003c
            r0 = 1
        L_0x003c:
            com.bytedance.boost_multidex.Monitor r1 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Acquired on lock "
            r2.<init>(r3)
        L_0x0047:
            java.io.File r3 = r4.lockFile
            java.lang.String r3 = r3.getPath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logInfo(r2)
            return r0
        L_0x0058:
            r0 = move-exception
            goto L_0x0081
        L_0x005a:
            com.bytedance.boost_multidex.Monitor r1 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ all -> 0x0058 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = "Aborting on lock "
            r2.<init>(r3)     // Catch:{ all -> 0x0058 }
            java.io.File r3 = r4.lockFile     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x0058 }
            r2.append(r3)     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0058 }
            r1.logInfo(r2)     // Catch:{ all -> 0x0058 }
            com.bytedance.boost_multidex.Monitor r1 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Acquired on lock "
            r2.<init>(r3)
            goto L_0x0047
        L_0x0081:
            com.bytedance.boost_multidex.Monitor r1 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Acquired on lock "
            r2.<init>(r3)
            java.io.File r3 = r4.lockFile
            java.lang.String r3 = r3.getPath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logInfo(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.Locker.test():boolean");
    }
}
