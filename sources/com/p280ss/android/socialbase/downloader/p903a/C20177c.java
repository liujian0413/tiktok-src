package com.p280ss.android.socialbase.downloader.p903a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.a.c */
public class C20177c implements C20285j {

    /* renamed from: a */
    public static volatile SQLiteDatabase f54587a;

    /* renamed from: b */
    public C20189d f54588b;

    /* renamed from: c */
    public C20189d f54589c;

    /* renamed from: d */
    public volatile boolean f54590d;

    /* renamed from: a */
    public final DownloadInfo mo54038a(int i) {
        return null;
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo54042a(String str) {
        return null;
    }

    /* renamed from: a */
    public final void mo54047a(int i, List<DownloadChunk> list) {
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo54054b(String str) {
        return null;
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo54061c(String str) {
        return null;
    }

    /* renamed from: c */
    public final void mo54063c(DownloadInfo downloadInfo) {
    }

    /* renamed from: d */
    public final boolean mo54066d() {
        return this.f54590d;
    }

    /* renamed from: e */
    public final boolean mo54067e() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54043a() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = f54587a
            if (r0 != 0) goto L_0x0038
            java.lang.Class<com.ss.android.socialbase.downloader.a.c> r0 = com.p280ss.android.socialbase.downloader.p903a.C20177c.class
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = f54587a     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0033
            com.ss.android.socialbase.downloader.a.a r1 = com.p280ss.android.socialbase.downloader.p903a.C20175a.m66445a()     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x0033 }
            f54587a = r1     // Catch:{ Throwable -> 0x0033 }
            com.ss.android.socialbase.downloader.a.d r1 = new com.ss.android.socialbase.downloader.a.d     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r2 = f54587a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String r3 = "downloader"
            java.lang.String[] r4 = com.p280ss.android.socialbase.downloader.constants.C20193a.f54632a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String[] r5 = com.p280ss.android.socialbase.downloader.constants.C20193a.f54633b     // Catch:{ Throwable -> 0x0033 }
            r1.<init>(r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0033 }
            r6.f54588b = r1     // Catch:{ Throwable -> 0x0033 }
            com.ss.android.socialbase.downloader.a.d r1 = new com.ss.android.socialbase.downloader.a.d     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r2 = f54587a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String r3 = "downloadChunk"
            java.lang.String[] r4 = com.p280ss.android.socialbase.downloader.constants.C20193a.f54634c     // Catch:{ Throwable -> 0x0033 }
            java.lang.String[] r5 = com.p280ss.android.socialbase.downloader.constants.C20193a.f54635d     // Catch:{ Throwable -> 0x0033 }
            r1.<init>(r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0033 }
            r6.f54589c = r1     // Catch:{ Throwable -> 0x0033 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20177c.mo54043a():void");
    }

    /* renamed from: a */
    public final void mo54048a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final C20176b bVar) {
        try {
            C201781 r0 = new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:108:0x0199, code lost:
                    if (r4 != null) goto L_0x0329;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:116:0x01af, code lost:
                    if (r4 == null) goto L_0x01b3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b3, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:163:0x0256, code lost:
                    if (r4 != null) goto L_0x026d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:171:0x026b, code lost:
                    if (r4 == null) goto L_0x0276;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:172:0x026d, code lost:
                    r4.mo54037a();
                    r14.f54594d.f54590d = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:173:0x0276, code lost:
                    throw r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:215:0x0312, code lost:
                    if (r4 == null) goto L_0x0333;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:223:0x0327, code lost:
                    if (r4 == null) goto L_0x0333;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:224:0x0329, code lost:
                    r4.mo54037a();
                    r14.f54594d.f54590d = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:225:0x0332, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:226:0x0333, code lost:
                    return;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:124:0x01bd A[SYNTHETIC, Splitter:B:124:0x01bd] */
                /* JADX WARNING: Removed duplicated region for block: B:131:0x01cd A[Catch:{ Throwable -> 0x0268, all -> 0x0259 }] */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf A[Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }] */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x00cc A[Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r14 = this;
                        com.ss.android.socialbase.downloader.a.c r0 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        r0.mo54043a()
                        android.database.sqlite.SQLiteDatabase r0 = com.p280ss.android.socialbase.downloader.p903a.C20177c.f54587a
                        if (r0 != 0) goto L_0x000a
                        return
                    L_0x000a:
                        com.ss.android.socialbase.downloader.downloader.k r0 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66757p()
                        android.util.SparseArray r1 = new android.util.SparseArray
                        r1.<init>()
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        r3 = 0
                        r4 = 8192(0x2000, float:1.14794E-41)
                        r5 = 0
                        r6 = -3
                        r7 = 1
                        android.database.sqlite.SQLiteDatabase r8 = com.p280ss.android.socialbase.downloader.p903a.C20177c.f54587a     // Catch:{ Throwable -> 0x0277, all -> 0x01b9 }
                        java.lang.String r9 = "SELECT * FROM downloader"
                        android.database.Cursor r8 = r8.rawQuery(r9, r3)     // Catch:{ Throwable -> 0x0277, all -> 0x01b9 }
                    L_0x0026:
                        boolean r3 = r8.moveToNext()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r3 == 0) goto L_0x00fe
                        com.ss.android.socialbase.downloader.model.DownloadInfo r3 = new com.ss.android.socialbase.downloader.model.DownloadInfo     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        r3.<init>(r8)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        boolean r9 = r3.isCanResumeFromBreakPointStatus()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 == 0) goto L_0x003b
                        r9 = -5
                        r3.setStatus(r9)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                    L_0x003b:
                        java.lang.String r9 = r3.getSavePath()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 != 0) goto L_0x00bc
                        java.lang.String r9 = r3.getName()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 == 0) goto L_0x0051
                        goto L_0x00bc
                    L_0x0051:
                        java.io.File r9 = new java.io.File     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        java.lang.String r10 = r3.getSavePath()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        java.lang.String r11 = r3.getName()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        r9.<init>(r10, r11)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        r10 = 131072(0x20000, float:1.83671E-40)
                        boolean r10 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r10)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        r11 = 0
                        if (r10 == 0) goto L_0x0093
                        int r10 = r3.getStatus()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r10 != r6) goto L_0x0074
                        boolean r9 = r9.exists()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 == 0) goto L_0x00bc
                    L_0x0074:
                        int r9 = r3.getStatus()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 != r7) goto L_0x0083
                        long r9 = r3.getCurBytes()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                        if (r13 > 0) goto L_0x0083
                        goto L_0x00bc
                    L_0x0083:
                        int r9 = r3.getStatus()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 == r6) goto L_0x00ba
                        boolean r9 = r3.isFileDataValid()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 != 0) goto L_0x00ba
                        r3.reset()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        goto L_0x00ba
                    L_0x0093:
                        int r10 = r3.getStatus()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r10 != r6) goto L_0x009f
                        boolean r9 = r9.exists()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 == 0) goto L_0x00bc
                    L_0x009f:
                        int r9 = r3.getStatus()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 != r7) goto L_0x00ad
                        long r9 = r3.getCurBytes()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                        if (r13 <= 0) goto L_0x00bc
                    L_0x00ad:
                        int r9 = r3.getStatus()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 == r6) goto L_0x00ba
                        boolean r9 = r3.isFileDataValid()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 != 0) goto L_0x00ba
                        goto L_0x00bc
                    L_0x00ba:
                        r9 = 0
                        goto L_0x00bd
                    L_0x00bc:
                        r9 = 1
                    L_0x00bd:
                        if (r9 == 0) goto L_0x00cc
                        int r3 = r3.getId()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        r2.add(r3)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        goto L_0x0026
                    L_0x00cc:
                        int r9 = r3.getId()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r0 == 0) goto L_0x00df
                        java.lang.String r10 = r3.getUrl()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        java.lang.String r11 = r3.getSavePath()     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        int r10 = r0.mo54402a(r10, r11)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        goto L_0x00e0
                    L_0x00df:
                        r10 = 0
                    L_0x00e0:
                        if (r10 == r9) goto L_0x00e8
                        r3.setId(r10)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        r1.put(r9, r3)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                    L_0x00e8:
                        android.util.SparseArray r9 = r2     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        if (r9 == 0) goto L_0x0026
                        android.util.SparseArray r9 = r2     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        monitor-enter(r9)     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                        android.util.SparseArray r10 = r2     // Catch:{ all -> 0x00fb }
                        int r11 = r3.getId()     // Catch:{ all -> 0x00fb }
                        r10.put(r11, r3)     // Catch:{ all -> 0x00fb }
                        monitor-exit(r9)     // Catch:{ all -> 0x00fb }
                        goto L_0x0026
                    L_0x00fb:
                        r0 = move-exception
                        monitor-exit(r9)     // Catch:{ all -> 0x00fb }
                        throw r0     // Catch:{ Throwable -> 0x01b6, all -> 0x01b4 }
                    L_0x00fe:
                        if (r8 == 0) goto L_0x0103
                        r8.close()     // Catch:{ Throwable -> 0x0103 }
                    L_0x0103:
                        com.ss.android.socialbase.downloader.a.c r0 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        android.util.SparseArray r3 = r2
                        android.util.SparseArray r8 = r3
                        r0.mo54050a(r2, r1, r3, r8)
                        android.util.SparseArray r0 = r2     // Catch:{ Throwable -> 0x01ac, all -> 0x019d }
                        if (r0 == 0) goto L_0x0197
                        android.util.SparseArray r0 = r2     // Catch:{ Throwable -> 0x01ac, all -> 0x019d }
                        monitor-enter(r0)     // Catch:{ Throwable -> 0x01ac, all -> 0x019d }
                        java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0194 }
                        r1.<init>()     // Catch:{ all -> 0x0194 }
                    L_0x0118:
                        android.util.SparseArray r2 = r2     // Catch:{ all -> 0x0194 }
                        int r2 = r2.size()     // Catch:{ all -> 0x0194 }
                        if (r5 >= r2) goto L_0x0178
                        android.util.SparseArray r2 = r2     // Catch:{ all -> 0x0194 }
                        int r2 = r2.keyAt(r5)     // Catch:{ all -> 0x0194 }
                        if (r2 == 0) goto L_0x0175
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x0194 }
                        java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0194 }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p280ss.android.socialbase.downloader.model.DownloadInfo) r2     // Catch:{ all -> 0x0194 }
                        boolean r3 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r4)     // Catch:{ all -> 0x0194 }
                        if (r3 == 0) goto L_0x0159
                        if (r2 == 0) goto L_0x0175
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0194 }
                        if (r3 != 0) goto L_0x0175
                        int r3 = r2.getStatus()     // Catch:{ all -> 0x0194 }
                        if (r3 == r6) goto L_0x0175
                        int r3 = r2.getId()     // Catch:{ all -> 0x0194 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0194 }
                        r1.add(r3)     // Catch:{ all -> 0x0194 }
                        android.util.SparseArray r3 = r3     // Catch:{ all -> 0x0194 }
                        int r2 = r2.getId()     // Catch:{ all -> 0x0194 }
                        r3.remove(r2)     // Catch:{ all -> 0x0194 }
                        goto L_0x0175
                    L_0x0159:
                        if (r2 == 0) goto L_0x0175
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0194 }
                        if (r3 != 0) goto L_0x0175
                        int r3 = r2.getId()     // Catch:{ all -> 0x0194 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0194 }
                        r1.add(r3)     // Catch:{ all -> 0x0194 }
                        android.util.SparseArray r3 = r3     // Catch:{ all -> 0x0194 }
                        int r2 = r2.getId()     // Catch:{ all -> 0x0194 }
                        r3.remove(r2)     // Catch:{ all -> 0x0194 }
                    L_0x0175:
                        int r5 = r5 + 1
                        goto L_0x0118
                    L_0x0178:
                        java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0194 }
                    L_0x017c:
                        boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0194 }
                        if (r2 == 0) goto L_0x0192
                        java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0194 }
                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0194 }
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x0194 }
                        int r2 = r2.intValue()     // Catch:{ all -> 0x0194 }
                        r3.remove(r2)     // Catch:{ all -> 0x0194 }
                        goto L_0x017c
                    L_0x0192:
                        monitor-exit(r0)     // Catch:{ all -> 0x0194 }
                        goto L_0x0197
                    L_0x0194:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0194 }
                        throw r1     // Catch:{ Throwable -> 0x01ac, all -> 0x019d }
                    L_0x0197:
                        com.ss.android.socialbase.downloader.a.b r0 = r4
                        if (r0 == 0) goto L_0x01b3
                        goto L_0x0329
                    L_0x019d:
                        r0 = move-exception
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        if (r1 == 0) goto L_0x01ab
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        r1.mo54037a()
                        com.ss.android.socialbase.downloader.a.c r1 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        r1.f54590d = r7
                    L_0x01ab:
                        throw r0
                    L_0x01ac:
                        com.ss.android.socialbase.downloader.a.b r0 = r4
                        if (r0 == 0) goto L_0x01b3
                        goto L_0x0329
                    L_0x01b3:
                        return
                    L_0x01b4:
                        r0 = move-exception
                        goto L_0x01bb
                    L_0x01b6:
                        r3 = r8
                        goto L_0x0277
                    L_0x01b9:
                        r0 = move-exception
                        r8 = r3
                    L_0x01bb:
                        if (r8 == 0) goto L_0x01c0
                        r8.close()     // Catch:{ Throwable -> 0x01c0 }
                    L_0x01c0:
                        com.ss.android.socialbase.downloader.a.c r3 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        android.util.SparseArray r8 = r2
                        android.util.SparseArray r9 = r3
                        r3.mo54050a(r2, r1, r8, r9)
                        android.util.SparseArray r1 = r2     // Catch:{ Throwable -> 0x0268, all -> 0x0259 }
                        if (r1 == 0) goto L_0x0254
                        android.util.SparseArray r1 = r2     // Catch:{ Throwable -> 0x0268, all -> 0x0259 }
                        monitor-enter(r1)     // Catch:{ Throwable -> 0x0268, all -> 0x0259 }
                        java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0251 }
                        r2.<init>()     // Catch:{ all -> 0x0251 }
                    L_0x01d5:
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x0251 }
                        int r3 = r3.size()     // Catch:{ all -> 0x0251 }
                        if (r5 >= r3) goto L_0x0235
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x0251 }
                        int r3 = r3.keyAt(r5)     // Catch:{ all -> 0x0251 }
                        if (r3 == 0) goto L_0x0232
                        android.util.SparseArray r8 = r2     // Catch:{ all -> 0x0251 }
                        java.lang.Object r3 = r8.get(r3)     // Catch:{ all -> 0x0251 }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.p280ss.android.socialbase.downloader.model.DownloadInfo) r3     // Catch:{ all -> 0x0251 }
                        boolean r8 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r4)     // Catch:{ all -> 0x0251 }
                        if (r8 == 0) goto L_0x0216
                        if (r3 == 0) goto L_0x0232
                        boolean r8 = r3.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0251 }
                        if (r8 != 0) goto L_0x0232
                        int r8 = r3.getStatus()     // Catch:{ all -> 0x0251 }
                        if (r8 == r6) goto L_0x0232
                        int r8 = r3.getId()     // Catch:{ all -> 0x0251 }
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0251 }
                        r2.add(r8)     // Catch:{ all -> 0x0251 }
                        android.util.SparseArray r8 = r3     // Catch:{ all -> 0x0251 }
                        int r3 = r3.getId()     // Catch:{ all -> 0x0251 }
                        r8.remove(r3)     // Catch:{ all -> 0x0251 }
                        goto L_0x0232
                    L_0x0216:
                        if (r3 == 0) goto L_0x0232
                        boolean r8 = r3.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0251 }
                        if (r8 != 0) goto L_0x0232
                        int r8 = r3.getId()     // Catch:{ all -> 0x0251 }
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0251 }
                        r2.add(r8)     // Catch:{ all -> 0x0251 }
                        android.util.SparseArray r8 = r3     // Catch:{ all -> 0x0251 }
                        int r3 = r3.getId()     // Catch:{ all -> 0x0251 }
                        r8.remove(r3)     // Catch:{ all -> 0x0251 }
                    L_0x0232:
                        int r5 = r5 + 1
                        goto L_0x01d5
                    L_0x0235:
                        java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0251 }
                    L_0x0239:
                        boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0251 }
                        if (r3 == 0) goto L_0x024f
                        java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0251 }
                        java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0251 }
                        android.util.SparseArray r4 = r2     // Catch:{ all -> 0x0251 }
                        int r3 = r3.intValue()     // Catch:{ all -> 0x0251 }
                        r4.remove(r3)     // Catch:{ all -> 0x0251 }
                        goto L_0x0239
                    L_0x024f:
                        monitor-exit(r1)     // Catch:{ all -> 0x0251 }
                        goto L_0x0254
                    L_0x0251:
                        r2 = move-exception
                        monitor-exit(r1)     // Catch:{ all -> 0x0251 }
                        throw r2     // Catch:{ Throwable -> 0x0268, all -> 0x0259 }
                    L_0x0254:
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        if (r1 == 0) goto L_0x0276
                        goto L_0x026d
                    L_0x0259:
                        r0 = move-exception
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        if (r1 == 0) goto L_0x0267
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        r1.mo54037a()
                        com.ss.android.socialbase.downloader.a.c r1 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        r1.f54590d = r7
                    L_0x0267:
                        throw r0
                    L_0x0268:
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        if (r1 == 0) goto L_0x0276
                    L_0x026d:
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        r1.mo54037a()
                        com.ss.android.socialbase.downloader.a.c r1 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        r1.f54590d = r7
                    L_0x0276:
                        throw r0
                    L_0x0277:
                        if (r3 == 0) goto L_0x027c
                        r3.close()     // Catch:{ Throwable -> 0x027c }
                    L_0x027c:
                        com.ss.android.socialbase.downloader.a.c r0 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        android.util.SparseArray r3 = r2
                        android.util.SparseArray r8 = r3
                        r0.mo54050a(r2, r1, r3, r8)
                        android.util.SparseArray r0 = r2     // Catch:{ Throwable -> 0x0324, all -> 0x0315 }
                        if (r0 == 0) goto L_0x0310
                        android.util.SparseArray r0 = r2     // Catch:{ Throwable -> 0x0324, all -> 0x0315 }
                        monitor-enter(r0)     // Catch:{ Throwable -> 0x0324, all -> 0x0315 }
                        java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x030d }
                        r1.<init>()     // Catch:{ all -> 0x030d }
                    L_0x0291:
                        android.util.SparseArray r2 = r2     // Catch:{ all -> 0x030d }
                        int r2 = r2.size()     // Catch:{ all -> 0x030d }
                        if (r5 >= r2) goto L_0x02f1
                        android.util.SparseArray r2 = r2     // Catch:{ all -> 0x030d }
                        int r2 = r2.keyAt(r5)     // Catch:{ all -> 0x030d }
                        if (r2 == 0) goto L_0x02ee
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x030d }
                        java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x030d }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p280ss.android.socialbase.downloader.model.DownloadInfo) r2     // Catch:{ all -> 0x030d }
                        boolean r3 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r4)     // Catch:{ all -> 0x030d }
                        if (r3 == 0) goto L_0x02d2
                        if (r2 == 0) goto L_0x02ee
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x030d }
                        if (r3 != 0) goto L_0x02ee
                        int r3 = r2.getStatus()     // Catch:{ all -> 0x030d }
                        if (r3 == r6) goto L_0x02ee
                        int r3 = r2.getId()     // Catch:{ all -> 0x030d }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x030d }
                        r1.add(r3)     // Catch:{ all -> 0x030d }
                        android.util.SparseArray r3 = r3     // Catch:{ all -> 0x030d }
                        int r2 = r2.getId()     // Catch:{ all -> 0x030d }
                        r3.remove(r2)     // Catch:{ all -> 0x030d }
                        goto L_0x02ee
                    L_0x02d2:
                        if (r2 == 0) goto L_0x02ee
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x030d }
                        if (r3 != 0) goto L_0x02ee
                        int r3 = r2.getId()     // Catch:{ all -> 0x030d }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x030d }
                        r1.add(r3)     // Catch:{ all -> 0x030d }
                        android.util.SparseArray r3 = r3     // Catch:{ all -> 0x030d }
                        int r2 = r2.getId()     // Catch:{ all -> 0x030d }
                        r3.remove(r2)     // Catch:{ all -> 0x030d }
                    L_0x02ee:
                        int r5 = r5 + 1
                        goto L_0x0291
                    L_0x02f1:
                        java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x030d }
                    L_0x02f5:
                        boolean r2 = r1.hasNext()     // Catch:{ all -> 0x030d }
                        if (r2 == 0) goto L_0x030b
                        java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x030d }
                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x030d }
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x030d }
                        int r2 = r2.intValue()     // Catch:{ all -> 0x030d }
                        r3.remove(r2)     // Catch:{ all -> 0x030d }
                        goto L_0x02f5
                    L_0x030b:
                        monitor-exit(r0)     // Catch:{ all -> 0x030d }
                        goto L_0x0310
                    L_0x030d:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x030d }
                        throw r1     // Catch:{ Throwable -> 0x0324, all -> 0x0315 }
                    L_0x0310:
                        com.ss.android.socialbase.downloader.a.b r0 = r4
                        if (r0 == 0) goto L_0x0333
                        goto L_0x0329
                    L_0x0315:
                        r0 = move-exception
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        if (r1 == 0) goto L_0x0323
                        com.ss.android.socialbase.downloader.a.b r1 = r4
                        r1.mo54037a()
                        com.ss.android.socialbase.downloader.a.c r1 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        r1.f54590d = r7
                    L_0x0323:
                        throw r0
                    L_0x0324:
                        com.ss.android.socialbase.downloader.a.b r0 = r4
                        if (r0 == 0) goto L_0x0333
                    L_0x0329:
                        com.ss.android.socialbase.downloader.a.b r0 = r4
                        r0.mo54037a()
                        com.ss.android.socialbase.downloader.a.c r0 = com.p280ss.android.socialbase.downloader.p903a.C20177c.this
                        r0.f54590d = r7
                        return
                    L_0x0333:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20177c.C201781.run():void");
                }
            };
            ExecutorService j = C20269b.m66751j();
            if (j != null) {
                j.execute(r0);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00ea */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54050a(java.util.List<java.lang.Integer> r17, android.util.SparseArray<com.p280ss.android.socialbase.downloader.model.DownloadInfo> r18, android.util.SparseArray<com.p280ss.android.socialbase.downloader.model.DownloadInfo> r19, android.util.SparseArray<java.util.List<com.p280ss.android.socialbase.downloader.model.DownloadChunk>> r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            r3 = r20
            int r4 = r18.size()
            if (r4 < 0) goto L_0x00f8
            android.database.sqlite.SQLiteDatabase r5 = f54587a
            if (r5 != 0) goto L_0x0014
            goto L_0x00f8
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r5 = f54587a
            monitor-enter(r5)
            m66457f()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            boolean r6 = r17.isEmpty()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x0044
            java.lang.String r6 = ", "
            r9 = r17
            java.lang.String r6 = android.text.TextUtils.join(r6, r9)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            android.database.sqlite.SQLiteDatabase r9 = f54587a     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.String r10 = "downloader"
            java.lang.String r11 = "_id IN (?)"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r12[r7] = r6     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r9.delete(r10, r11, r12)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            android.database.sqlite.SQLiteDatabase r9 = f54587a     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.String r10 = "downloadChunk"
            java.lang.String r11 = "_id IN (?)"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r12[r7] = r6     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r9.delete(r10, r11, r12)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 >= r4) goto L_0x00b5
            int r9 = r0.keyAt(r6)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.Object r10 = r0.get(r9)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = (com.p280ss.android.socialbase.downloader.model.DownloadInfo) r10     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            android.database.sqlite.SQLiteDatabase r11 = f54587a     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.String r12 = "downloader"
            java.lang.String r13 = "_id = ?"
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.String r15 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r14[r7] = r15     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r11.delete(r12, r13, r14)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            android.database.sqlite.SQLiteDatabase r11 = f54587a     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.String r12 = "downloader"
            android.content.ContentValues r13 = r10.toContentValues()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r14 = 0
            r11.insert(r12, r14, r13)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            int r11 = r10.getChunkCount()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            if (r11 <= r8) goto L_0x00b2
            java.util.List r11 = r1.mo54060c(r9)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            int r12 = r11.size()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            if (r12 <= 0) goto L_0x00b2
            android.database.sqlite.SQLiteDatabase r12 = f54587a     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.String r13 = "downloadChunk"
            java.lang.String r15 = "_id = ?"
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r14[r7] = r9     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r12.delete(r13, r15, r14)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
        L_0x0093:
            boolean r11 = r9.hasNext()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            if (r11 == 0) goto L_0x00b2
            java.lang.Object r11 = r9.next()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            com.ss.android.socialbase.downloader.model.DownloadChunk r11 = (com.p280ss.android.socialbase.downloader.model.DownloadChunk) r11     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            int r12 = r10.getId()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r11.f54919a = r12     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            android.database.sqlite.SQLiteDatabase r12 = f54587a     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            java.lang.String r13 = "downloadChunk"
            android.content.ContentValues r11 = r11.mo54535a()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r14 = 0
            r12.insert(r13, r14, r11)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            goto L_0x0093
        L_0x00b2:
            int r6 = r6 + 1
            goto L_0x0045
        L_0x00b5:
            if (r2 == 0) goto L_0x00e5
            if (r3 == 0) goto L_0x00e5
            monitor-enter(r19)     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            int r0 = r19.size()     // Catch:{ all -> 0x00e2 }
        L_0x00be:
            if (r7 >= r0) goto L_0x00e0
            java.lang.Object r4 = r2.valueAt(r7)     // Catch:{ all -> 0x00e2 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = (com.p280ss.android.socialbase.downloader.model.DownloadInfo) r4     // Catch:{ all -> 0x00e2 }
            int r4 = r4.getId()     // Catch:{ all -> 0x00e2 }
            java.util.List r6 = r1.mo54060c(r4)     // Catch:{ all -> 0x00e2 }
            java.util.List r6 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67546a(r6)     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x00dd
            int r8 = r6.size()     // Catch:{ all -> 0x00e2 }
            if (r8 <= 0) goto L_0x00dd
            r3.put(r4, r6)     // Catch:{ all -> 0x00e2 }
        L_0x00dd:
            int r7 = r7 + 1
            goto L_0x00be
        L_0x00e0:
            monitor-exit(r19)     // Catch:{ all -> 0x00e2 }
            goto L_0x00e5
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
        L_0x00e5:
            android.database.sqlite.SQLiteDatabase r0 = f54587a     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
            r0.setTransactionSuccessful()     // Catch:{ Throwable -> 0x00ea, all -> 0x00ee }
        L_0x00ea:
            m66458g()     // Catch:{ all -> 0x00f5 }
            goto L_0x00f3
        L_0x00ee:
            r0 = move-exception
            m66458g()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r5)     // Catch:{ all -> 0x00f5 }
            return
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00f5 }
            throw r0
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20177c.mo54050a(java.util.List, android.util.SparseArray, android.util.SparseArray, android.util.SparseArray):void");
    }

    /* renamed from: a */
    public final void mo54049a(final DownloadChunk downloadChunk) {
        mo54043a();
        if (f54587a != null && this.f54589c != null) {
            if (C20359e.m67593d()) {
                ExecutorService j = C20269b.m66751j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            try {
                                C20177c.m66452a(downloadChunk, C20177c.this.f54589c.mo54084a());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                m66452a(downloadChunk, this.f54589c.mo54084a());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54046a(int i, int i2, long j) {
        mo54043a();
        if (i != 0 && i2 >= 0 && j >= 0 && f54587a != null && this.f54589c != null) {
            if (C20359e.m67593d()) {
                ExecutorService j2 = C20269b.m66751j();
                if (j2 != null) {
                    final int i3 = i;
                    final int i4 = i2;
                    final long j3 = j;
                    C201856 r1 = new Runnable() {
                        public final void run() {
                            try {
                                C20177c.m66449a(i3, i4, j3, C20177c.this.f54589c.mo54086c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    j2.execute(r1);
                    return;
                }
                return;
            }
            try {
                m66449a(i, i2, j, this.f54589c.mo54086c());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54045a(int i, int i2, int i3, long j) {
        mo54043a();
        if (i != 0 && i2 >= 0 && i3 >= 0 && j >= 0 && f54587a != null && this.f54589c != null) {
            if (C20359e.m67593d()) {
                ExecutorService j2 = C20269b.m66751j();
                if (j2 != null) {
                    final int i4 = i;
                    final int i5 = i2;
                    final int i6 = i3;
                    final long j3 = j;
                    C201867 r1 = new Runnable() {
                        public final void run() {
                            try {
                                C20177c.m66448a(i4, i5, i6, j3, C20177c.this.f54589c.mo54086c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    j2.execute(r1);
                    return;
                }
                return;
            }
            try {
                m66448a(i, i2, i3, j, this.f54589c.mo54086c());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54044a(int i, int i2, int i3, int i4) {
        mo54043a();
        if (i != 0 && i3 >= 0 && i4 != i2 && i4 >= 0 && f54587a != null && this.f54589c != null) {
            if (C20359e.m67593d()) {
                ExecutorService j = C20269b.m66751j();
                if (j != null) {
                    final int i5 = i;
                    final int i6 = i2;
                    final int i7 = i3;
                    final int i8 = i4;
                    C201878 r1 = new Runnable() {
                        public final void run() {
                            try {
                                C20177c.m66447a(i5, i6, i7, i8, C20177c.this.f54589c.mo54086c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    j.execute(r1);
                    return;
                }
                return;
            }
            try {
                m66447a(i, i2, i3, i4, this.f54589c.mo54086c());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|(5:9|10|11|17|16)(0)|5|4) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.socialbase.downloader.model.DownloadInfo mo54039a(int r7, int r8) {
        /*
            r6 = this;
            r6.mo54043a()
            android.database.sqlite.SQLiteDatabase r0 = f54587a
            r1 = 0
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            r0 = 10
        L_0x000b:
            android.database.sqlite.SQLiteDatabase r2 = f54587a     // Catch:{ Throwable -> 0x003e }
            boolean r2 = r2.isDbLockedByCurrentThread()     // Catch:{ Throwable -> 0x003e }
            if (r2 == 0) goto L_0x001d
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001d
            r2 = 5
            java.lang.Thread.sleep(r2)     // Catch:{ Throwable -> 0x000b }
            goto L_0x000b
        L_0x001d:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Throwable -> 0x003e }
            r0.<init>()     // Catch:{ Throwable -> 0x003e }
            java.lang.String r2 = "chunkCount"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x003e }
            r0.put(r2, r8)     // Catch:{ Throwable -> 0x003e }
            android.database.sqlite.SQLiteDatabase r8 = f54587a     // Catch:{ Throwable -> 0x003e }
            java.lang.String r2 = "downloader"
            java.lang.String r3 = "_id = ? "
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x003e }
            r5 = 0
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ Throwable -> 0x003e }
            r4[r5] = r7     // Catch:{ Throwable -> 0x003e }
            r8.update(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x003e }
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20177c.mo54039a(int, int):com.ss.android.socialbase.downloader.model.DownloadInfo");
    }

    /* renamed from: a */
    public final boolean mo54051a(final DownloadInfo downloadInfo) {
        mo54043a();
        if (downloadInfo == null || f54587a == null) {
            return false;
        }
        if (C20359e.m67593d()) {
            ExecutorService j = C20269b.m66751j();
            if (j == null) {
                return false;
            }
            j.execute(new Runnable() {
                public final void run() {
                    C20177c.this.mo54058b(downloadInfo);
                }
            });
        } else {
            mo54058b(downloadInfo);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo54058b(com.p280ss.android.socialbase.downloader.model.DownloadInfo r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0005
            monitor-exit(r1)
            return
        L_0x0005:
            int r0 = r2.getId()     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            boolean r0 = r1.m66459j(r0)     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            if (r0 != 0) goto L_0x0013
            r1.m66456d(r2)     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            goto L_0x0028
        L_0x0013:
            com.ss.android.socialbase.downloader.a.d r0 = r1.f54588b     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            if (r0 != 0) goto L_0x0019
            monitor-exit(r1)
            return
        L_0x0019:
            com.ss.android.socialbase.downloader.a.d r0 = r1.f54588b     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            android.database.sqlite.SQLiteStatement r0 = r0.mo54086c()     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            m66455b(r2, r0)     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            goto L_0x0028
        L_0x0023:
            monitor-exit(r1)
            return
        L_0x0025:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0028:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20177c.mo54058b(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    /* renamed from: a */
    public final DownloadInfo mo54041a(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(3));
        contentValues.put("totalBytes", Long.valueOf(j));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("name", str2);
        }
        m66454b(i, contentValues);
        return null;
    }

    /* renamed from: a */
    public final DownloadInfo mo54040a(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(4));
        contentValues.put("curBytes", Long.valueOf(j));
        m66454b(i, contentValues);
        return null;
    }

    public C20177c() {
        this(false);
    }

    /* renamed from: f */
    private static void m66457f() {
        f54587a.beginTransaction();
    }

    /* renamed from: g */
    private static void m66458g() {
        try {
            if (f54587a != null && f54587a.inTransaction()) {
                f54587a.endTransaction();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final synchronized void mo54062c() {
        try {
            m66457f();
            f54587a.delete("downloader", null, null);
            f54587a.delete("downloadChunk", null, null);
            f54587a.setTransactionSuccessful();
            m66458g();
        } catch (Throwable th) {
            m66458g();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo54055b() {
        mo54043a();
        if (f54587a != null) {
            if (C20359e.m67593d()) {
                ExecutorService j = C20269b.m66751j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            C20177c.this.mo54062c();
                        }
                    });
                    return;
                }
                return;
            }
            mo54062c();
        }
    }

    private C20177c(boolean z) {
    }

    /* renamed from: b */
    public final void mo54057b(DownloadChunk downloadChunk) {
        mo54049a(downloadChunk);
    }

    /* renamed from: j */
    private boolean m66459j(int i) {
        try {
            if (mo54052b(i) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo54068e(int i) {
        mo54043a();
        if (f54587a == null || this.f54588b == null) {
            return false;
        }
        try {
            m66451a(i, this.f54588b.mo54085b());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo54069f(final int i) {
        if (C20359e.m67593d()) {
            ExecutorService j = C20269b.m66751j();
            if (j == null) {
                return false;
            }
            j.execute(new Runnable() {
                public final void run() {
                    C20177c.this.mo54068e(i);
                    C20177c.this.mo54065d(i);
                }
            });
        } else {
            mo54068e(i);
            mo54065d(i);
        }
        return true;
    }

    /* renamed from: h */
    public final DownloadInfo mo54071h(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(1));
        m66454b(i, contentValues);
        return null;
    }

    /* renamed from: i */
    public final DownloadInfo mo54072i(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-7));
        m66454b(i, contentValues);
        return null;
    }

    /* renamed from: d */
    private void m66456d(final DownloadInfo downloadInfo) {
        mo54043a();
        if (f54587a != null && this.f54588b != null) {
            if (C20359e.m67593d()) {
                ExecutorService j = C20269b.m66751j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            try {
                                C20177c.m66453a(downloadInfo, C20177c.this.f54588b.mo54084a());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                m66453a(downloadInfo, this.f54588b.mo54084a());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public final DownloadInfo mo54070g(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(5));
        contentValues.put("isFirstDownload", Integer.valueOf(0));
        m66454b(i, contentValues);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r9 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r9 != null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[SYNTHETIC, Splitter:B:16:0x0049] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.socialbase.downloader.model.DownloadChunk> mo54060c(int r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.mo54043a()
            android.database.sqlite.SQLiteDatabase r1 = f54587a
            if (r1 == 0) goto L_0x0051
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = f54587a     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r3 = "SELECT * FROM %s WHERE %s = ?"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "downloadChunk"
            r6 = 0
            r4[r6] = r5     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "_id"
            r7 = 1
            r4[r7] = r5     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r3 = com.C1642a.m8034a(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r4[r6] = r9     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            android.database.Cursor r9 = r2.rawQuery(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
        L_0x002e:
            boolean r1 = r9.moveToNext()     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            if (r1 == 0) goto L_0x003d
            com.ss.android.socialbase.downloader.model.DownloadChunk r1 = new com.ss.android.socialbase.downloader.model.DownloadChunk     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            r1.<init>(r9)     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            r0.add(r1)     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            goto L_0x002e
        L_0x003d:
            if (r9 == 0) goto L_0x0051
        L_0x003f:
            r9.close()     // Catch:{ Throwable -> 0x0051 }
            goto L_0x0051
        L_0x0043:
            r0 = move-exception
            r1 = r9
            goto L_0x0047
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ Throwable -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r9 = r1
        L_0x004e:
            if (r9 == 0) goto L_0x0051
            goto L_0x003f
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20177c.mo54060c(int):java.util.List");
    }

    /* renamed from: d */
    public final void mo54065d(final int i) {
        mo54043a();
        if (f54587a != null && this.f54589c != null) {
            if (C20359e.m67593d()) {
                ExecutorService j = C20269b.m66751j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            try {
                                C20177c.m66451a(i, C20177c.this.f54589c.mo54085b());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                m66451a(i, this.f54589c.mo54085b());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r8 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r8 != null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[SYNTHETIC, Splitter:B:20:0x0046] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.socialbase.downloader.model.DownloadInfo mo54052b(int r8) {
        /*
            r7 = this;
            r7.mo54043a()
            android.database.sqlite.SQLiteDatabase r0 = f54587a
            r1 = 0
            if (r0 == 0) goto L_0x004e
            android.database.sqlite.SQLiteDatabase r0 = f54587a     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r2 = "SELECT * FROM %s WHERE %s = ?"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r4 = "downloader"
            r5 = 0
            r3[r5] = r4     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r4 = "_id"
            r6 = 1
            r3[r6] = r4     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r2 = com.C1642a.m8034a(r2, r3)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            r3[r5] = r8     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            android.database.Cursor r8 = r0.rawQuery(r2, r3)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            boolean r0 = r8.moveToNext()     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            if (r0 == 0) goto L_0x003a
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = new com.ss.android.socialbase.downloader.model.DownloadInfo     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            r0.<init>(r8)     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            if (r8 == 0) goto L_0x0039
            r8.close()     // Catch:{ Throwable -> 0x0039 }
        L_0x0039:
            return r0
        L_0x003a:
            if (r8 == 0) goto L_0x004e
        L_0x003c:
            r8.close()     // Catch:{ Throwable -> 0x004e }
            goto L_0x004e
        L_0x0040:
            r0 = move-exception
            r1 = r8
            goto L_0x0044
        L_0x0043:
            r0 = move-exception
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            throw r0
        L_0x004a:
            r8 = r1
        L_0x004b:
            if (r8 == 0) goto L_0x004e
            goto L_0x003c
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20177c.mo54052b(int):com.ss.android.socialbase.downloader.model.DownloadInfo");
    }

    /* renamed from: a */
    public static void m66451a(int i, SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    sQLiteStatement.bindLong(1, (long) i);
                    sQLiteStatement.execute();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public final DownloadInfo mo54064d(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-2));
        contentValues.put("curBytes", Long.valueOf(j));
        m66454b(i, contentValues);
        return null;
    }

    /* renamed from: b */
    private void m66454b(final int i, final ContentValues contentValues) {
        mo54043a();
        if (f54587a != null) {
            if (C20359e.m67593d()) {
                ExecutorService j = C20269b.m66751j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            C20177c.m66450a(i, contentValues);
                        }
                    });
                    return;
                }
                return;
            }
            m66450a(i, contentValues);
        }
    }

    /* renamed from: c */
    public final DownloadInfo mo54059c(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-3));
        contentValues.put("curBytes", Long.valueOf(j));
        contentValues.put("isFirstDownload", Integer.valueOf(0));
        contentValues.put("isFirstSuccess", Integer.valueOf(0));
        m66454b(i, contentValues);
        return null;
    }

    /* renamed from: b */
    private static void m66455b(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, (long) downloadInfo.getId());
                    sQLiteStatement.execute();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0002 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66450a(int r5, android.content.ContentValues r6) {
        /*
            r0 = 10
        L_0x0002:
            android.database.sqlite.SQLiteDatabase r1 = f54587a     // Catch:{ Throwable -> 0x0029 }
            boolean r1 = r1.isDbLockedByCurrentThread()     // Catch:{ Throwable -> 0x0029 }
            if (r1 == 0) goto L_0x0014
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0014
            r1 = 5
            java.lang.Thread.sleep(r1)     // Catch:{ Throwable -> 0x0002 }
            goto L_0x0002
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = f54587a     // Catch:{ Throwable -> 0x0028 }
            java.lang.String r1 = "downloader"
            java.lang.String r2 = "_id = ? "
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0028 }
            r4 = 0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x0028 }
            r3[r4] = r5     // Catch:{ Throwable -> 0x0028 }
            r0.update(r1, r6, r2, r3)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20177c.m66450a(int, android.content.ContentValues):void");
    }

    /* renamed from: b */
    public final DownloadInfo mo54053b(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-1));
        contentValues.put("curBytes", Long.valueOf(j));
        if (j > 0) {
            contentValues.put("isFirstDownload", Integer.valueOf(0));
        }
        m66454b(i, contentValues);
        return null;
    }

    /* renamed from: a */
    public static void m66452a(DownloadChunk downloadChunk, SQLiteStatement sQLiteStatement) {
        if (downloadChunk != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadChunk.mo54538a(sQLiteStatement);
                    sQLiteStatement.executeInsert();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m66453a(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.executeInsert();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo54056b(int i, List<DownloadChunk> list) {
        try {
            mo54065d(i);
            if (list != null) {
                for (DownloadChunk downloadChunk : list) {
                    if (downloadChunk != null) {
                        mo54049a(downloadChunk);
                        if (downloadChunk.mo54548f()) {
                            for (DownloadChunk a : downloadChunk.f54925g) {
                                mo54049a(a);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m66449a(int i, int i2, long j, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j));
                f54587a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m66447a(int i, int i2, int i3, int i4, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("chunkIndex", Integer.valueOf(i4));
                f54587a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m66448a(int i, int i2, int i3, long j, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j));
                f54587a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
            }
        } catch (Throwable unused) {
        }
    }
}
