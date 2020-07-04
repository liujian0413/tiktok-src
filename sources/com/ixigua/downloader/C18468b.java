package com.ixigua.downloader;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C9737m;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import com.ixigua.downloader.p797a.C18463a;
import com.ixigua.downloader.p797a.C18464b;
import com.ixigua.downloader.p797a.C18465c;
import com.ixigua.downloader.p797a.C18466d;
import com.ixigua.downloader.p797a.C18467e;
import com.ixigua.downloader.pojo.BlockInfo;
import com.ixigua.downloader.pojo.BlockItem;
import com.ixigua.downloader.pojo.Task;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/* renamed from: com.ixigua.downloader.b */
public final class C18468b extends C18488m implements C6310a, Runnable {

    /* renamed from: a */
    public volatile Task f50061a;

    /* renamed from: b */
    public final String f50062b;

    /* renamed from: c */
    public final String f50063c;

    /* renamed from: d */
    public volatile BlockInfo f50064d;

    /* renamed from: e */
    public volatile int f50065e;

    /* renamed from: f */
    public volatile boolean f50066f;

    /* renamed from: g */
    public volatile long f50067g;

    /* renamed from: h */
    final ReadLock f50068h = this.f50075o.readLock();

    /* renamed from: i */
    final WriteLock f50069i = this.f50075o.writeLock();

    /* renamed from: j */
    private String f50070j;

    /* renamed from: k */
    private final List<C18471a> f50071k;

    /* renamed from: l */
    private final C6309f f50072l;

    /* renamed from: m */
    private final C18486k f50073m;

    /* renamed from: n */
    private volatile long f50074n;

    /* renamed from: o */
    private final ReentrantReadWriteLock f50075o = new ReentrantReadWriteLock();

    /* renamed from: p */
    private long f50076p;

    /* renamed from: q */
    private long f50077q;

    /* renamed from: com.ixigua.downloader.b$a */
    class C18471a extends C18488m implements Runnable {

        /* renamed from: a */
        public volatile boolean f50081a;

        /* renamed from: b */
        public long f50082b;

        /* renamed from: c */
        public volatile boolean f50083c;

        /* renamed from: d */
        public final long f50084d = this.f50086f.getDownloadedSize();

        /* renamed from: f */
        private final BlockItem f50086f;

        /* renamed from: g */
        private long f50087g;

        /* renamed from: h */
        private final boolean f50088h;

        /* renamed from: i */
        private volatile RandomAccessFile f50089i;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Task mo47948a() {
            return C18468b.this.f50061a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final long mo47968b() {
            return this.f50087g - this.f50082b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo47970d() {
            if (Thread.currentThread().isAlive()) {
                this.f50081a = true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:3|4|(1:8)|9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo47969c() {
            /*
                r3 = this;
                java.io.RandomAccessFile r0 = r3.f50089i
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                java.io.FileDescriptor r1 = r0.getFD()     // Catch:{ Throwable -> 0x002b }
                r1.sync()     // Catch:{ Throwable -> 0x002b }
                com.ixigua.downloader.b r1 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x002b }
                boolean r1 = r1.mo47956e()     // Catch:{ Throwable -> 0x002b }
                if (r1 != 0) goto L_0x001c
                com.ixigua.downloader.b r1 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x002b }
                boolean r1 = r1.mo47957f()     // Catch:{ Throwable -> 0x002b }
                if (r1 == 0) goto L_0x002b
            L_0x001c:
                com.ixigua.downloader.b r1 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x002b }
                java.lang.String r1 = r1.mo47953b()     // Catch:{ Throwable -> 0x002b }
                com.ixigua.downloader.b r2 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x002b }
                com.ixigua.downloader.pojo.BlockInfo r2 = r2.mo47954c()     // Catch:{ Throwable -> 0x002b }
                com.ixigua.downloader.p797a.C18465c.m60820a(r1, r2)     // Catch:{ Throwable -> 0x002b }
            L_0x002b:
                r0.close()     // Catch:{ Throwable -> 0x002f }
                return
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ixigua.downloader.C18468b.C18471a.mo47969c():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d7, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x01e0, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e1, code lost:
            r20 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x01f3, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x01f4, code lost:
            r23 = r5;
            r12 = r2;
            r14 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x01fc, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x01ff, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0200, code lost:
            r21 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0207, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0209, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x020a, code lost:
            r21 = r3;
            r23 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0214, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0215, code lost:
            r20 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0217, code lost:
            r2 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0235, code lost:
            com.bytedance.common.utility.p482io.C9734a.m28682a((java.io.Closeable) r11);
            mo47969c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x023b, code lost:
            if (r12 != null) goto L_0x023d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x023d, code lost:
            r12.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0255, code lost:
            r12.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x0258, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x025a, code lost:
            com.bytedance.common.utility.p482io.C9734a.m28682a((java.io.Closeable) r20);
            mo47969c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0260, code lost:
            if (r2 != null) goto L_0x0262;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0262, code lost:
            r2.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x0265, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
            r12 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x010b, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x010c, code lost:
            r12 = r2;
            r14 = r4;
            r23 = r5;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x01e0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:77:0x0120] */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x01fc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:37:0x00a5] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0207 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0055] */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x0225 A[SYNTHETIC, Splitter:B:159:0x0225] */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x0255  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x0262  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r25 = this;
                r1 = r25
                r2 = 0
                r1.f50083c = r2
                long r3 = java.lang.System.currentTimeMillis()
                r1.f50082b = r3
                com.ixigua.downloader.pojo.BlockItem r0 = r1.f50086f
                long r3 = r0.getStart()
                com.ixigua.downloader.pojo.BlockItem r0 = r1.f50086f
                long r5 = r0.getEnd()
                com.ixigua.downloader.pojo.BlockItem r0 = r1.f50086f
                long r7 = r0.getDownloadedSize()
                com.ixigua.downloader.pojo.Task r0 = r25.mo47948a()
                int r9 = r0.autoRetryTimes
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
            L_0x0027:
                r15 = 0
                r0 = 1
                int r17 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
                if (r17 <= 0) goto L_0x004e
                long r17 = r7 + r3
                int r19 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
                if (r19 <= 0) goto L_0x004e
                r1.f50083c = r0     // Catch:{ Throwable -> 0x0047 }
                com.ixigua.downloader.b r0 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x0047 }
                r0.mo47961j()     // Catch:{ Throwable -> 0x0047 }
                com.bytedance.common.utility.p482io.C9734a.m28682a(r11)
                r25.mo47969c()
                if (r12 == 0) goto L_0x0046
                r12.disconnect()
            L_0x0046:
                return
            L_0x0047:
                r0 = move-exception
                r21 = r3
                r23 = r5
                goto L_0x0220
            L_0x004e:
                java.lang.String r17 = "download_conn"
                r14 = 0
                r20 = r11
                long r10 = r3 + r7
                boolean r14 = r1.f50088h     // Catch:{ Throwable -> 0x0209, all -> 0x0207 }
                if (r14 == 0) goto L_0x0063
                int r14 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
                if (r14 > 0) goto L_0x0061
                int r14 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
                if (r14 <= 0) goto L_0x0063
            L_0x0061:
                r14 = 1
                goto L_0x0064
            L_0x0063:
                r14 = 0
            L_0x0064:
                if (r14 == 0) goto L_0x0098
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                java.lang.String r2 = "bytes="
                r0.<init>(r2)     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                r0.append(r10)     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                int r2 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
                if (r2 <= 0) goto L_0x0083
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                java.lang.String r15 = "-"
                r2.<init>(r15)     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                r2.append(r5)     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                goto L_0x0085
            L_0x0083:
                java.lang.String r2 = "-"
            L_0x0085:
                r0.append(r2)     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x008d, all -> 0x0207 }
                goto L_0x0099
            L_0x008d:
                r0 = move-exception
                r21 = r3
            L_0x0090:
                r23 = r5
                r14 = r17
            L_0x0094:
                r11 = r20
                goto L_0x0220
            L_0x0098:
                r0 = 0
            L_0x0099:
                com.ixigua.downloader.b r2 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x0209, all -> 0x0207 }
                com.ixigua.downloader.pojo.Task r2 = r2.f50061a     // Catch:{ Throwable -> 0x0209, all -> 0x0207 }
                java.lang.String r2 = r2.url     // Catch:{ Throwable -> 0x0209, all -> 0x0207 }
                java.lang.String r15 = "GET"
                java.net.HttpURLConnection r2 = com.ixigua.downloader.C18468b.m60834a(r2, r0, r15)     // Catch:{ Throwable -> 0x0209, all -> 0x0207 }
                int r0 = r2.getResponseCode()     // Catch:{ Throwable -> 0x01ff, all -> 0x01fc }
                r12 = 200(0xc8, float:2.8E-43)
                r15 = 206(0xce, float:2.89E-43)
                r21 = r3
                r3 = 25
                if (r0 == r15) goto L_0x00c3
                if (r0 != r12) goto L_0x00b6
                goto L_0x00c3
            L_0x00b6:
                com.ixigua.downloader.DownloadException r4 = new com.ixigua.downloader.DownloadException     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                r4.<init>(r3, r0)     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                throw r4     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
            L_0x00c0:
                r0 = move-exception
                r12 = r2
                goto L_0x0090
            L_0x00c3:
                if (r0 != r15) goto L_0x00d2
                if (r14 == 0) goto L_0x00c8
                goto L_0x00d2
            L_0x00c8:
                com.ixigua.downloader.DownloadException r4 = new com.ixigua.downloader.DownloadException     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                r4.<init>(r3, r0)     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                throw r4     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
            L_0x00d2:
                if (r0 != r12) goto L_0x00e1
                if (r14 != 0) goto L_0x00d7
                goto L_0x00e1
            L_0x00d7:
                com.ixigua.downloader.DownloadException r4 = new com.ixigua.downloader.DownloadException     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                r4.<init>(r3, r0)     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                throw r4     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
            L_0x00e1:
                com.ixigua.downloader.b r0 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01fa, all -> 0x01fc }
                java.lang.String r0 = r0.f50063c     // Catch:{ Throwable -> 0x01fa, all -> 0x01fc }
                boolean r0 = com.ixigua.downloader.p797a.C18464b.m60809b(r0)     // Catch:{ Throwable -> 0x01fa, all -> 0x01fc }
                if (r0 != 0) goto L_0x00f2
                com.ixigua.downloader.b r0 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                java.lang.String r0 = r0.f50063c     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
                com.ixigua.downloader.p797a.C18464b.m60813d(r0)     // Catch:{ Throwable -> 0x00c0, all -> 0x01fc }
            L_0x00f2:
                java.lang.String r3 = "randomaccessfile_open"
                java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x01f3, all -> 0x01fc }
                com.ixigua.downloader.b r4 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01f3, all -> 0x01fc }
                java.lang.String r4 = r4.f50063c     // Catch:{ Throwable -> 0x01f3, all -> 0x01fc }
                java.lang.String r12 = "rw"
                r0.<init>(r4, r12)     // Catch:{ Throwable -> 0x01f3, all -> 0x01fc }
                r1.f50089i = r0     // Catch:{ Throwable -> 0x01f3, all -> 0x01fc }
                java.lang.String r4 = "randomaccessfile_seek"
                if (r14 == 0) goto L_0x0111
                java.io.RandomAccessFile r0 = r1.f50089i     // Catch:{ Throwable -> 0x010b, all -> 0x01fc }
                r0.seek(r10)     // Catch:{ Throwable -> 0x010b, all -> 0x01fc }
                goto L_0x0111
            L_0x010b:
                r0 = move-exception
                r12 = r2
                r14 = r4
                r23 = r5
                goto L_0x0094
            L_0x0111:
                java.lang.String r3 = "download_inputstream"
                java.io.InputStream r11 = com.ixigua.downloader.C18473c.m60871a(r2)     // Catch:{ Throwable -> 0x01f3, all -> 0x01fc }
                r0 = 8192(0x2000, float:1.14794E-41)
                byte[] r0 = new byte[r0]     // Catch:{ Throwable -> 0x01e5, all -> 0x01e0 }
                java.lang.String r4 = "download_read"
                r10 = r4
                r3 = 0
                r4 = 0
            L_0x0120:
                boolean r12 = r1.f50081a     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                r14 = -1
                if (r12 != 0) goto L_0x01b8
                com.ixigua.downloader.b r12 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                boolean r12 = r12.mo47955d()     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                if (r12 != 0) goto L_0x01b8
                com.ixigua.downloader.b r12 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                boolean r12 = r12.mo47956e()     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                if (r12 != 0) goto L_0x01b8
                com.ixigua.downloader.b r12 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                boolean r12 = r12.mo47957f()     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                if (r12 != 0) goto L_0x01b8
                int r3 = r11.read(r0)     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                if (r3 == r14) goto L_0x01b8
                com.ixigua.downloader.b r12 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r12 = r12.f50068h     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                r12.lock()     // Catch:{ Throwable -> 0x01d9, all -> 0x01e0 }
                com.ixigua.downloader.b r12 = com.ixigua.downloader.C18468b.this     // Catch:{ all -> 0x01ac }
                boolean r12 = r12.mo47955d()     // Catch:{ all -> 0x01ac }
                if (r12 != 0) goto L_0x019e
                java.lang.String r12 = "randomaccessfile_write"
                java.io.RandomAccessFile r10 = r1.f50089i     // Catch:{ all -> 0x0198 }
                r15 = 0
                r10.write(r0, r15, r3)     // Catch:{ all -> 0x0194 }
                r23 = r5
                long r5 = (long) r3
                long r7 = r7 + r5
                int r4 = r4 + 1
                int r5 = r4 % 10
                if (r5 != 0) goto L_0x018b
                java.lang.String r10 = "randomaccessfile_sync"
                java.io.RandomAccessFile r4 = r1.f50089i     // Catch:{ all -> 0x0190 }
                java.io.FileDescriptor r4 = r4.getFD()     // Catch:{ all -> 0x0190 }
                r4.sync()     // Catch:{ all -> 0x0190 }
                com.ixigua.downloader.pojo.BlockItem r4 = r1.f50086f     // Catch:{ all -> 0x0190 }
                r4.setDownloadedSize(r7)     // Catch:{ all -> 0x0190 }
                java.lang.String r4 = "metafile_write"
                com.ixigua.downloader.b r5 = com.ixigua.downloader.C18468b.this     // Catch:{ all -> 0x0188 }
                java.lang.String r5 = r5.mo47953b()     // Catch:{ all -> 0x0188 }
                com.ixigua.downloader.b r6 = com.ixigua.downloader.C18468b.this     // Catch:{ all -> 0x0188 }
                com.ixigua.downloader.pojo.BlockInfo r6 = r6.mo47954c()     // Catch:{ all -> 0x0188 }
                com.ixigua.downloader.p797a.C18465c.m60820a(r5, r6)     // Catch:{ all -> 0x0188 }
                r10 = r4
                r4 = 0
                goto L_0x018c
            L_0x0188:
                r0 = move-exception
                r10 = r4
                goto L_0x01b0
            L_0x018b:
                r10 = r12
            L_0x018c:
                java.lang.String r5 = "download_read"
                r10 = r5
                goto L_0x01a1
            L_0x0190:
                r0 = move-exception
                goto L_0x01b0
            L_0x0192:
                r0 = move-exception
                goto L_0x019c
            L_0x0194:
                r0 = move-exception
                r23 = r5
                goto L_0x019c
            L_0x0198:
                r0 = move-exception
                r23 = r5
                r15 = 0
            L_0x019c:
                r10 = r12
                goto L_0x01b0
            L_0x019e:
                r23 = r5
                r15 = 0
            L_0x01a1:
                com.ixigua.downloader.b r5 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.f50068h     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                r5.unlock()     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                r5 = r23
                goto L_0x0120
            L_0x01ac:
                r0 = move-exception
                r23 = r5
                r15 = 0
            L_0x01b0:
                com.ixigua.downloader.b r3 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.f50068h     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                r3.unlock()     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                throw r0     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
            L_0x01b8:
                r23 = r5
                r15 = 0
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                r1.f50087g = r4     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                if (r3 != r14) goto L_0x01cb
                r0 = 1
                r1.f50083c = r0     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                com.ixigua.downloader.b r0 = com.ixigua.downloader.C18468b.this     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
                r0.mo47961j()     // Catch:{ Throwable -> 0x01d7, all -> 0x01e0 }
            L_0x01cb:
                com.bytedance.common.utility.p482io.C9734a.m28682a(r11)
                r25.mo47969c()
                if (r2 == 0) goto L_0x0259
                r2.disconnect()
                return
            L_0x01d7:
                r0 = move-exception
                goto L_0x01dd
            L_0x01d9:
                r0 = move-exception
                r23 = r5
                r15 = 0
            L_0x01dd:
                r12 = r2
                r14 = r10
                goto L_0x0221
            L_0x01e0:
                r0 = move-exception
                r20 = r11
                goto L_0x025a
            L_0x01e5:
                r0 = move-exception
                r23 = r5
                r15 = 0
                r12 = r2
                r14 = r3
                goto L_0x0221
            L_0x01ec:
                r0 = move-exception
                r23 = r5
                r15 = 0
                r12 = r2
                r14 = r4
                goto L_0x0211
            L_0x01f3:
                r0 = move-exception
                r23 = r5
                r15 = 0
                r12 = r2
                r14 = r3
                goto L_0x0211
            L_0x01fa:
                r0 = move-exception
                goto L_0x0202
            L_0x01fc:
                r0 = move-exception
                goto L_0x025a
            L_0x01ff:
                r0 = move-exception
                r21 = r3
            L_0x0202:
                r23 = r5
                r15 = 0
                r12 = r2
                goto L_0x020f
            L_0x0207:
                r0 = move-exception
                goto L_0x0217
            L_0x0209:
                r0 = move-exception
                r21 = r3
                r23 = r5
                r15 = 0
            L_0x020f:
                r14 = r17
            L_0x0211:
                r11 = r20
                goto L_0x0221
            L_0x0214:
                r0 = move-exception
                r20 = r11
            L_0x0217:
                r2 = r12
                goto L_0x025a
            L_0x0219:
                r0 = move-exception
                r21 = r3
                r23 = r5
                r20 = r11
            L_0x0220:
                r15 = 0
            L_0x0221:
                int r2 = r13 + 1
                if (r13 >= r9) goto L_0x0248
                boolean r3 = r0 instanceof org.apache.http.conn.ConnectTimeoutException     // Catch:{ all -> 0x0214 }
                if (r3 != 0) goto L_0x0235
                boolean r3 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x0214 }
                if (r3 != 0) goto L_0x0235
                boolean r3 = r0 instanceof java.net.SocketException     // Catch:{ all -> 0x0214 }
                if (r3 != 0) goto L_0x0235
                boolean r3 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0214 }
                if (r3 == 0) goto L_0x0248
            L_0x0235:
                com.bytedance.common.utility.p482io.C9734a.m28682a(r11)
                r25.mo47969c()
                if (r12 == 0) goto L_0x0240
                r12.disconnect()
            L_0x0240:
                r13 = r2
                r3 = r21
                r5 = r23
                r2 = 0
                goto L_0x0027
            L_0x0248:
                com.ixigua.downloader.b r2 = com.ixigua.downloader.C18468b.this     // Catch:{ all -> 0x0214 }
                r2.mo47951a(r1, r0, r14)     // Catch:{ all -> 0x0214 }
                com.bytedance.common.utility.p482io.C9734a.m28682a(r11)
                r25.mo47969c()
                if (r12 == 0) goto L_0x0259
                r12.disconnect()
                return
            L_0x0259:
                return
            L_0x025a:
                com.bytedance.common.utility.p482io.C9734a.m28682a(r20)
                r25.mo47969c()
                if (r2 == 0) goto L_0x0265
                r2.disconnect()
            L_0x0265:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ixigua.downloader.C18468b.C18471a.run():void");
        }

        C18471a(BlockItem blockItem, boolean z) {
            this.f50086f = blockItem;
            this.f50088h = z;
        }
    }

    /* renamed from: com.ixigua.downloader.b$b */
    static class C18472b {

        /* renamed from: a */
        final long f50090a;

        /* renamed from: b */
        final long f50091b;

        /* renamed from: c */
        final int f50092c;

        /* renamed from: d */
        final float f50093d;

        C18472b(long j, long j2, int i, float f) {
            this.f50090a = j;
            this.f50091b = j2;
            this.f50092c = i;
            this.f50093d = f;
        }
    }

    /* renamed from: a */
    private static float m60829a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0.0f;
        }
        return (((float) j) / 1024.0f) / (((float) j2) / 1000.0f);
    }

    /* renamed from: b */
    private static int m60837b(long j, long j2) {
        if (j <= 0) {
            return 0;
        }
        if (j2 > j) {
            j2 = j;
        }
        return (int) (((((float) j2) * 1.0f) / ((float) j)) * 100.0f);
    }

    /* renamed from: a */
    public final Task mo47948a() {
        return this.f50061a;
    }

    /* renamed from: a */
    public final void mo47950a(int i, Object obj) {
        this.f50065e = i;
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        if (C9738o.m28706a()) {
            handleMsg(obtain);
        } else {
            this.f50072l.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    public final void mo47952a(boolean z) {
        m60848v();
        BlockInfo c = mo47954c();
        if (c != null && c.getBlockSize() > 0) {
            int blockSize = c.getBlockSize();
            ArrayList arrayList = new ArrayList(blockSize);
            synchronized (this.f50071k) {
                int i = 0;
                while (i < blockSize) {
                    try {
                        BlockItem blockItemByIdx = c.getBlockItemByIdx(i);
                        if (blockItemByIdx != null) {
                            C18471a aVar = new C18471a(blockItemByIdx, z);
                            arrayList.add(aVar);
                            this.f50071k.add(aVar);
                        }
                        i++;
                    } finally {
                        while (true) {
                        }
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    C18462a.m60789a().mo47944b().execute((C18471a) it.next());
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo47951a(C18471a aVar, Throwable th, String str) {
        if (!aVar.f50081a && mo47958g()) {
            mo47950a(6, (Object) mo47949a(C18479f.m60892a(th), str, th instanceof DownloadException ? ((DownloadException) th).getErrorMessage() : null));
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo47949a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", "0.1.15");
        hashMap.put("network_type", String.valueOf(C18466d.m60822a(C18462a.m60789a().f50054a)));
        hashMap.put("result_code", String.valueOf(i));
        hashMap.put("url", this.f50061a.url);
        hashMap.put("path", this.f50061a.path);
        hashMap.put("support_multi_thread", this.f50061a.isSupportMultiThread ? "1" : "0");
        hashMap.put("is_only_wifi", this.f50061a.isOnlyWifi ? "1" : "0");
        hashMap.put("priority", String.valueOf(this.f50061a.priority));
        hashMap.put("is_support_progress_update", this.f50061a.isSupportProgressUpdate ? "1" : "0");
        hashMap.put("total_size", String.valueOf(m60845s()));
        hashMap.put("completed_size", String.valueOf(m60844r()));
        hashMap.put("task_id", this.f50070j);
        hashMap.put("download_start_time", String.valueOf(this.f50074n));
        hashMap.put("download_end_time", String.valueOf(System.currentTimeMillis()));
        if (i == 0) {
            hashMap.put("duration", String.valueOf(m60846t()));
            hashMap.put("real_size", String.valueOf(C18464b.m60799a(this.f50062b)));
        }
        if (i != 0 && !TextUtils.isEmpty(str)) {
            hashMap.put("fail_stage", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("extra", str2);
        }
        hashMap.put("is_sdcard_available", C18464b.m60805a() ? "1" : "0");
        BlockInfo c = mo47954c();
        hashMap.put("thread_num", String.valueOf(c != null ? c.getBlockSize() : 0));
        hashMap.put("is_breakPoint", this.f50066f ? "1" : "0");
        return hashMap;
    }

    /* renamed from: m */
    private boolean m60839m() {
        if (this.f50065e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo47953b() {
        return this.f50061a.getMetaPath();
    }

    /* renamed from: c */
    public final synchronized BlockInfo mo47954c() {
        return this.f50064d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo47959h() {
        m60835a(1);
    }

    public final String toString() {
        return this.f50061a.toString();
    }

    /* renamed from: d */
    public final boolean mo47955d() {
        if (this.f50065e == 7) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo47956e() {
        if (this.f50065e == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo47957f() {
        if (this.f50065e == 6) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo47958g() {
        if (this.f50065e == 2 || this.f50065e == 5) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo47960i() {
        mo47950a(6, (Object) mo47949a(30, (String) null, (String) null));
    }

    /* renamed from: u */
    private void m60847u() {
        final BlockInfo c = mo47954c();
        if (c != null && c.isBlockAvailable()) {
            new C6304f(new Runnable() {
                public final void run() {
                    C18465c.m60820a(C18468b.this.mo47953b(), c);
                }
            }, "downloader", true).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo47962k() {
        synchronized (this.f50071k) {
            for (C18471a c : this.f50071k) {
                c.mo47969c();
            }
        }
    }

    /* renamed from: l */
    private String m60838l() {
        StringBuilder sb = new StringBuilder();
        String a = C18463a.m60798a(C18462a.m60789a().f50054a);
        if (!TextUtils.isEmpty(a)) {
            sb.append(a);
        }
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(this.f50061a.url);
        return C9737m.m28688a(sb.toString(), "MD5");
    }

    /* renamed from: o */
    private long m60841o() {
        Long l;
        synchronized (this.f50071k) {
            l = null;
            for (C18471a aVar : this.f50071k) {
                long j = aVar.f50082b;
                if (j > 0) {
                    if (l == null) {
                        l = Long.valueOf(j);
                    } else if (l.longValue() > j) {
                        l = Long.valueOf(j);
                    }
                }
            }
        }
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: p */
    private int m60842p() {
        int i;
        synchronized (this.f50071k) {
            i = 0;
            for (C18471a aVar : this.f50071k) {
                i = (int) (((long) i) + aVar.f50084d);
            }
        }
        return i;
    }

    /* renamed from: q */
    private boolean m60843q() {
        synchronized (this.f50071k) {
            for (C18471a aVar : this.f50071k) {
                if (!aVar.f50083c) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: r */
    private long m60844r() {
        long j;
        BlockInfo c = mo47954c();
        int i = 0;
        if (c != null && c.getBlockSize() > 0) {
            int blockSize = c.getBlockSize();
            int i2 = 0;
            while (i < blockSize) {
                BlockItem blockItemByIdx = c.getBlockItemByIdx(i);
                long j2 = (long) i2;
                if (blockItemByIdx != null) {
                    j = blockItemByIdx.getDownloadedSize();
                } else {
                    j = 0;
                }
                i2 = (int) (j2 + j);
                i++;
            }
            i = i2;
        }
        return (long) i;
    }

    /* renamed from: s */
    private long m60845s() {
        BlockInfo c = mo47954c();
        long j = 0;
        if (c != null && c.getBlockSize() > 0) {
            int blockSize = c.getBlockSize();
            long j2 = 0;
            for (int i = 0; i < blockSize; i++) {
                BlockItem blockItemByIdx = c.getBlockItemByIdx(i);
                if (blockItemByIdx.getEnd() <= 0) {
                    return -1;
                }
                j2 += (blockItemByIdx.getEnd() - blockItemByIdx.getStart()) + 1;
            }
            j = j2;
        }
        return j;
    }

    /* renamed from: t */
    private long m60846t() {
        long j;
        long j2 = 0;
        if (this.f50067g <= 0 || this.f50074n <= 0) {
            j = 0;
        } else {
            j = this.f50067g - this.f50074n;
        }
        long j3 = j + 0;
        synchronized (this.f50071k) {
            for (C18471a aVar : this.f50071k) {
                if (aVar != null) {
                    j2 = Math.max(j2, aVar.mo47968b());
                }
            }
        }
        return j3 + j2;
    }

    /* renamed from: v */
    private void m60848v() {
        synchronized (this.f50071k) {
            for (C18471a d : this.f50071k) {
                d.mo47970d();
            }
            this.f50071k.clear();
        }
    }

    /* renamed from: n */
    private synchronized void m60840n() {
        if (mo47958g()) {
            long s = m60845s();
            long r = m60844r();
            if (s > 0 && r >= 0) {
                if (this.f50076p == 0) {
                    this.f50076p = m60841o();
                    this.f50077q = (long) m60842p();
                }
                long currentTimeMillis = System.currentTimeMillis();
                C18472b bVar = new C18472b(s, r, m60837b(s, r), m60829a(r - this.f50077q, currentTimeMillis - this.f50076p));
                mo47950a(5, (Object) bVar);
                this.f50076p = currentTimeMillis;
                this.f50077q = r;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo47961j() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.mo47958g()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0069
            boolean r0 = r6.m60843q()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0069
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r6.f50063c     // Catch:{ all -> 0x006b }
            r0.<init>(r1)     // Catch:{ all -> 0x006b }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x006b }
            r2 = 31
            r3 = 6
            r4 = 0
            if (r1 == 0) goto L_0x0060
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x006b }
            java.lang.String r5 = r6.f50062b     // Catch:{ all -> 0x006b }
            r1.<init>(r5)     // Catch:{ all -> 0x006b }
            boolean r5 = r1.exists()     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x003d
            boolean r5 = r1.delete()     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x0032
            goto L_0x003d
        L_0x0032:
            java.lang.String r0 = "file_real_delete"
            java.util.Map r0 = r6.mo47949a(r2, r0, r4)     // Catch:{ all -> 0x006b }
            r6.mo47950a(r3, r0)     // Catch:{ all -> 0x006b }
            monitor-exit(r6)
            return
        L_0x003d:
            boolean r0 = r0.renameTo(r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0056
            com.ixigua.downloader.pojo.Task r0 = r6.f50061a     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r0.getMetaPath()     // Catch:{ all -> 0x006b }
            com.ixigua.downloader.p797a.C18464b.m60817f(r0)     // Catch:{ all -> 0x006b }
            r0 = 4
            r1 = 0
            java.util.Map r1 = r6.mo47949a(r1, r4, r4)     // Catch:{ all -> 0x006b }
            r6.mo47950a(r0, r1)     // Catch:{ all -> 0x006b }
            goto L_0x0069
        L_0x0056:
            java.lang.String r0 = "file_temp_rename"
            java.util.Map r0 = r6.mo47949a(r2, r0, r4)     // Catch:{ all -> 0x006b }
            r6.mo47950a(r3, r0)     // Catch:{ all -> 0x006b }
            goto L_0x0069
        L_0x0060:
            java.lang.String r0 = "file_temp_not_exist"
            java.util.Map r0 = r6.mo47949a(r2, r0, r4)     // Catch:{ all -> 0x006b }
            r6.mo47950a(r3, r0)     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r6)
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ixigua.downloader.C18468b.mo47961j():void");
    }

    public final void run() {
        int i;
        if (m60839m()) {
            if (TextUtils.isEmpty(this.f50070j)) {
                this.f50070j = m60838l();
            }
            this.f50066f = false;
            this.f50074n = System.currentTimeMillis();
            this.f50067g = -1;
            m60835a(2);
            if (C18464b.m60809b(this.f50062b) || C18464b.m60811c(this.f50062b)) {
                m60835a(4);
            } else if (C18467e.m60827a(this.f50061a)) {
                m60836a((C18483h) new C18483h() {
                    /* renamed from: a */
                    public final void mo47966a(Throwable th) {
                        String str;
                        C18468b bVar = C18468b.this;
                        C18468b bVar2 = C18468b.this;
                        int a = C18479f.m60892a(th);
                        String str2 = "connect_parse";
                        if (th instanceof DownloadException) {
                            str = ((DownloadException) th).getErrorMessage();
                        } else {
                            str = null;
                        }
                        bVar.mo47950a(6, (Object) bVar2.mo47949a(a, str2, str));
                    }

                    /* renamed from: a */
                    public final void mo47965a(long j, boolean z) {
                        int i;
                        if (!C18468b.this.f50061a.isSupportMultiThread || j <= 0 || !z) {
                            i = 1;
                        } else {
                            i = C18468b.m60830a(j);
                        }
                        BlockInfo c = C18468b.this.mo47954c();
                        if (j <= 0 || !z) {
                            c = C18468b.m60833a(j, i);
                        } else {
                            if (c == null) {
                                c = C18465c.m60819a(C18468b.this.f50061a.getMetaPath());
                            }
                            if (c == null || c.getBlockSize() == 0 || !c.isBlockAvailable() || !C18464b.m60809b(C18468b.this.f50063c)) {
                                c = C18468b.m60833a(j, i);
                            } else {
                                C18468b.this.f50066f = true;
                            }
                        }
                        C18468b.this.f50064d = c;
                        C18468b.this.f50067g = System.currentTimeMillis();
                        C18468b.this.mo47952a(z);
                    }
                });
            } else {
                if (!C18466d.m60825b(C18462a.m60789a().f50054a)) {
                    i = 12;
                } else {
                    i = 30;
                }
                mo47950a(6, (Object) mo47949a(i, (String) null, (String) null));
            }
        }
    }

    /* renamed from: a */
    private void m60835a(int i) {
        mo47950a(i, (Object) null);
    }

    /* renamed from: a */
    public static int m60830a(long j) {
        return (int) Math.max(Math.min(3, j / 2097152), 1);
    }

    /* renamed from: a */
    private static long m60832a(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection == null) {
            return -1;
        }
        if (httpURLConnection.getResponseCode() == 200) {
            return (long) httpURLConnection.getContentLength();
        }
        if (httpURLConnection.getResponseCode() == 206) {
            String headerField = httpURLConnection.getHeaderField("Content-Range");
            if (!TextUtils.isEmpty(headerField)) {
                int lastIndexOf = headerField.lastIndexOf("/");
                if (lastIndexOf >= 0 && lastIndexOf < headerField.length() - 1) {
                    return m60831a(headerField.substring(lastIndexOf + 1), -1);
                }
            }
        }
        return -1;
    }

    public final void handleMsg(Message message) {
        int i = message.what;
        if (i != 100) {
            Map map = null;
            switch (i) {
                case 2:
                    if (this.f50073m != null) {
                        this.f50073m.mo47975a(this);
                    }
                    if (this.f50061a.isSupportProgressUpdate) {
                        this.f50072l.removeMessages(100);
                        this.f50072l.sendEmptyMessageDelayed(100, this.f50061a.progressUpdateInterval);
                        return;
                    }
                    break;
                case 3:
                    if (this.f50061a.isSupportProgressUpdate) {
                        this.f50072l.removeMessages(100);
                    }
                    m60847u();
                    if (this.f50073m != null) {
                        this.f50073m.mo47979b(this);
                        return;
                    }
                    break;
                case 4:
                    if (this.f50061a.isSupportProgressUpdate) {
                        this.f50072l.removeMessages(100);
                    }
                    if (this.f50073m != null) {
                        C18486k kVar = this.f50073m;
                        if (message.obj instanceof Map) {
                            map = (Map) message.obj;
                        }
                        kVar.mo47978a(this, map);
                        return;
                    }
                    break;
                case 5:
                    if (this.f50073m != null && (message.obj instanceof C18472b)) {
                        C18472b bVar = (C18472b) message.obj;
                        this.f50073m.mo47977a(this, bVar.f50090a, bVar.f50091b, bVar.f50092c, bVar.f50093d);
                        return;
                    }
                case 6:
                    if (this.f50061a.isSupportProgressUpdate) {
                        this.f50072l.removeMessages(100);
                    }
                    m60847u();
                    if (this.f50073m != null) {
                        if (message.obj instanceof Map) {
                            map = (Map) message.obj;
                        }
                        int i2 = 18;
                        if (map != null && !TextUtils.isEmpty((CharSequence) map.get("result_code"))) {
                            try {
                                i2 = Integer.parseInt((String) map.get("result_code"));
                            } catch (Throwable unused) {
                            }
                        }
                        this.f50073m.mo47976a(this, i2, map);
                        return;
                    }
                    break;
                case 7:
                    if (this.f50061a.isSupportProgressUpdate) {
                        this.f50072l.removeMessages(100);
                    }
                    if (this.f50073m != null) {
                        this.f50073m.mo47980c(this);
                        return;
                    }
                    break;
            }
        } else if (this.f50061a.isSupportProgressUpdate) {
            m60840n();
            this.f50072l.sendEmptyMessageDelayed(100, this.f50061a.progressUpdateInterval);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m60836a(com.ixigua.downloader.C18483h r6) {
        /*
            r5 = this;
            r0 = 0
            com.ixigua.downloader.pojo.Task r1 = r5.f50061a     // Catch:{ Throwable -> 0x003d, all -> 0x003a }
            java.lang.String r1 = r1.url     // Catch:{ Throwable -> 0x003d, all -> 0x003a }
            java.lang.String r2 = "bytes=0-1"
            java.lang.String r3 = "GET"
            java.net.HttpURLConnection r1 = m60834a(r1, r2, r3)     // Catch:{ Throwable -> 0x003d, all -> 0x003a }
            int r0 = r1.getResponseCode()     // Catch:{ Throwable -> 0x0038 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 206(0xce, float:2.89E-43)
            if (r0 == r2) goto L_0x0026
            if (r0 != r3) goto L_0x001a
            goto L_0x0026
        L_0x001a:
            com.ixigua.downloader.DownloadException r2 = new com.ixigua.downloader.DownloadException     // Catch:{ Throwable -> 0x0038 }
            r3 = 25
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x0038 }
            r2.<init>(r3, r0)     // Catch:{ Throwable -> 0x0038 }
            throw r2     // Catch:{ Throwable -> 0x0038 }
        L_0x0026:
            if (r0 != r3) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            long r2 = m60832a(r1)     // Catch:{ Throwable -> 0x0038 }
            r6.mo47965a(r2, r0)     // Catch:{ Throwable -> 0x0038 }
            if (r1 == 0) goto L_0x004a
            r1.disconnect()
            return
        L_0x0038:
            r0 = move-exception
            goto L_0x0041
        L_0x003a:
            r6 = move-exception
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0041:
            r6.mo47966a(r0)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004a
            r1.disconnect()
            return
        L_0x004a:
            return
        L_0x004b:
            r6 = move-exception
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.disconnect()
        L_0x0051:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ixigua.downloader.C18468b.m60836a(com.ixigua.downloader.h):void");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo47947a(C18488m mVar) {
        return super.compareTo(mVar);
    }

    /* renamed from: a */
    private static long m60831a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    C18468b(Task task, C18486k kVar) {
        this.f50061a = task;
        this.f50073m = kVar;
        this.f50071k = new ArrayList();
        this.f50062b = this.f50061a.path;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f50062b);
        sb.append(".temp");
        this.f50063c = sb.toString();
        this.f50072l = new C6309f(Looper.getMainLooper(), this);
        m60835a(1);
    }

    /* renamed from: a */
    public static BlockInfo m60833a(long j, int i) {
        long j2;
        long j3 = j / ((long) i);
        BlockInfo blockInfo = new BlockInfo();
        for (int i2 = 0; i2 < i; i2++) {
            long j4 = ((long) i2) * j3;
            if (i2 == i - 1) {
                j2 = j - 1;
            } else {
                j2 = (((long) (i2 + 1)) * j3) - 1;
            }
            BlockItem blockItem = new BlockItem(j4, j2, 0);
            blockInfo.addBlock(blockItem);
        }
        return blockInfo;
    }

    /* renamed from: a */
    public static HttpURLConnection m60834a(String str, String str2, String str3) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
        httpURLConnection.setConnectTimeout(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
        httpURLConnection.setRequestMethod(str3);
        if (!TextUtils.isEmpty(str2)) {
            C18474d.m60872a(httpURLConnection, "Range", str2);
        }
        return httpURLConnection;
    }
}
