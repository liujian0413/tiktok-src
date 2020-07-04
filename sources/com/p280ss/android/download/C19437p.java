package com.p280ss.android.download;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* renamed from: com.ss.android.download.p */
final class C19437p {

    /* renamed from: a */
    public final File f52618a;

    /* renamed from: b */
    private final File f52619b = Environment.getExternalStorageDirectory();

    /* renamed from: c */
    private final File f52620c = Environment.getDownloadCacheDirectory();

    /* renamed from: d */
    private int f52621d;

    /* renamed from: e */
    private final Context f52622e;

    /* renamed from: f */
    private int f52623f;

    /* renamed from: g */
    private Thread f52624g;

    /* renamed from: e */
    private synchronized void m63920e() {
        this.f52621d = 0;
    }

    /* renamed from: d */
    private synchronized void m63919d() {
        if (this.f52624g == null || !this.f52624g.isAlive()) {
            this.f52624g = new Thread() {
                public final void run() {
                    C19437p.this.mo51479b();
                    C19437p.this.mo51481c();
                }
            };
            this.f52624g.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo51477a() {
        int i = this.f52623f + 1;
        this.f52623f = i;
        if (i % 250 == 0) {
            m63919d();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51479b() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0068 }
            r0.<init>()     // Catch:{ Exception -> 0x0068 }
            java.io.File r1 = r9.f52620c     // Catch:{ Exception -> 0x0068 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0014
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0068 }
            r0.addAll(r1)     // Catch:{ Exception -> 0x0068 }
        L_0x0014:
            java.io.File r1 = r9.f52618a     // Catch:{ Exception -> 0x0068 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0023
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0068 }
            r0.addAll(r1)     // Catch:{ Exception -> 0x0068 }
        L_0x0023:
            int r1 = r0.size()     // Catch:{ Exception -> 0x0068 }
            if (r1 != 0) goto L_0x002a
            return
        L_0x002a:
            android.content.Context r1 = r9.f52622e     // Catch:{ Exception -> 0x0068 }
            com.ss.android.download.f r2 = com.p280ss.android.download.C19422f.m63833a(r1)     // Catch:{ Exception -> 0x0068 }
            android.net.Uri r3 = com.p280ss.android.download.p861b.C19405c.C19406a.f52513a     // Catch:{ Exception -> 0x0068 }
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "_data"
            r8 = 0
            r4[r8] = r1     // Catch:{ Exception -> 0x0068 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r2.mo51451a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0063
        L_0x0043:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0063
            java.lang.String r2 = r1.getString(r8)     // Catch:{ all -> 0x005c }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x005c }
            if (r3 != 0) goto L_0x0043
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x005c }
            r3.<init>(r2)     // Catch:{ all -> 0x005c }
            r0.remove(r3)     // Catch:{ all -> 0x005c }
            goto L_0x0043
        L_0x005c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            throw r0     // Catch:{ Exception -> 0x0068 }
        L_0x0063:
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19437p.mo51479b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[SYNTHETIC, Splitter:B:30:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c A[SYNTHETIC, Splitter:B:36:0x006c] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51481c() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.f52622e     // Catch:{ SQLiteException -> 0x006a, all -> 0x0060 }
            com.ss.android.download.f r2 = com.p280ss.android.download.C19422f.m63833a(r1)     // Catch:{ SQLiteException -> 0x006a, all -> 0x0060 }
            android.net.Uri r3 = com.p280ss.android.download.p861b.C19405c.C19406a.f52513a     // Catch:{ SQLiteException -> 0x006a, all -> 0x0060 }
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x006a, all -> 0x0060 }
            r1 = 0
            java.lang.String r5 = "_id"
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x006a, all -> 0x0060 }
            java.lang.String r5 = "status >= '200'"
            r6 = 0
            java.lang.String r7 = "lastmod"
            android.database.Cursor r1 = r2.mo51451a(r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x006a, all -> 0x0060 }
            if (r1 != 0) goto L_0x0024
            if (r1 == 0) goto L_0x0023
            r1.close()     // Catch:{ Exception -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            return
        L_0x0023:
            return
        L_0x0024:
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            if (r2 == 0) goto L_0x0054
            int r2 = r1.getCount()     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            int r2 = r2 + -1000
            java.lang.String r3 = "_id"
            int r3 = r1.getColumnIndexOrThrow(r3)     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
        L_0x0036:
            if (r2 <= 0) goto L_0x0054
            android.net.Uri r4 = com.p280ss.android.download.p861b.C19405c.C19406a.f52513a     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            long r5 = r1.getLong(r3)     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r4, r5)     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            android.content.Context r5 = r9.f52622e     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            com.ss.android.download.f r5 = com.p280ss.android.download.C19422f.m63833a(r5)     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            r5.mo51450a(r4, r0, r0)     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            boolean r4 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x005e, all -> 0x005c }
            if (r4 == 0) goto L_0x0054
            int r2 = r2 + -1
            goto L_0x0036
        L_0x0054:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ Exception -> 0x005a }
            goto L_0x005b
        L_0x005a:
            return
        L_0x005b:
            return
        L_0x005c:
            r0 = move-exception
            goto L_0x0064
        L_0x005e:
            r0 = r1
            goto L_0x006a
        L_0x0060:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0064:
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            throw r0
        L_0x006a:
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ Exception -> 0x0070 }
            goto L_0x0071
        L_0x0070:
            return
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19437p.mo51481c():void");
    }

    /* renamed from: a */
    private static File m63916a(Context context) {
        return context.getCacheDir();
    }

    /* renamed from: a */
    private synchronized int m63913a(long j) {
        this.f52621d = (int) (((long) this.f52621d) + j);
        return this.f52621d;
    }

    public C19437p(Context context) {
        this.f52622e = context;
        this.f52618a = m63916a(context);
        m63919d();
    }

    /* renamed from: a */
    private static long m63915a(File file) {
        File[] listFiles = file.listFiles();
        long j = 104857600;
        if (listFiles == null) {
            return 104857600;
        }
        for (File length : listFiles) {
            j -= length.length();
        }
        return j;
    }

    /* renamed from: b */
    private static long m63918b(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
    }

    /* JADX WARNING: Incorrect condition in loop: B:7:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m63914a(int r7, long r8) {
        /*
            r6 = this;
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r8 = 1
            java.lang.String[] r4 = new java.lang.String[r8]
            r8 = 0
            r4[r8] = r7
            android.content.Context r7 = r6.f52622e
            com.ss.android.download.f r0 = com.p280ss.android.download.C19422f.m63833a(r7)
            android.net.Uri r1 = com.p280ss.android.download.p861b.C19405c.C19406a.f52513a
            java.lang.String r3 = "( status = '200' AND destination = ? )"
            java.lang.String r5 = "lastmod"
            r2 = 0
            android.database.Cursor r7 = r0.mo51451a(r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0020
            return r8
        L_0x0020:
            java.lang.String r0 = "_data"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x006c }
        L_0x0026:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0066
            r1 = 10485760(0xa00000, double:5.180654E-317)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0066
            java.lang.String r1 = r7.getString(r0)     // Catch:{ all -> 0x006c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x006c }
            if (r2 != 0) goto L_0x0026
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x006c }
            r2.<init>(r1)     // Catch:{ all -> 0x006c }
            long r3 = r2.length()     // Catch:{ all -> 0x006c }
            r1 = 0
            long r8 = r8 + r3
            r2.delete()     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "_id"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ all -> 0x006c }
            long r1 = r7.getLong(r1)     // Catch:{ all -> 0x006c }
            android.content.Context r3 = r6.f52622e     // Catch:{ all -> 0x006c }
            com.ss.android.download.f r3 = com.p280ss.android.download.C19422f.m63833a(r3)     // Catch:{ all -> 0x006c }
            android.net.Uri r4 = com.p280ss.android.download.p861b.C19405c.C19406a.f52513a     // Catch:{ all -> 0x006c }
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r4, r1)     // Catch:{ all -> 0x006c }
            r2 = 0
            r3.mo51450a(r1, r2, r2)     // Catch:{ all -> 0x006c }
            goto L_0x0026
        L_0x0066:
            if (r7 == 0) goto L_0x006b
            r7.close()     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            return r8
        L_0x006c:
            r8 = move-exception
            if (r7 == 0) goto L_0x0072
            r7.close()     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19437p.m63914a(int, long):long");
    }

    /* renamed from: a */
    private synchronized void m63917a(File file, long j, int i) throws C19436o {
        if (j != 0) {
            if (i == 1 || i == 0) {
                if (!Environment.getExternalStorageState().equals("mounted")) {
                    throw new C19436o(199, "external media not mounted");
                }
            }
            long b = m63918b(file);
            if (b < 10485760) {
                m63914a(i, 10485760);
                mo51479b();
                b = m63918b(file);
                if (b < 10485760) {
                    if (!file.equals(this.f52620c)) {
                        StringBuilder sb = new StringBuilder("space in the filesystem rooted at: ");
                        sb.append(file);
                        sb.append(" is below 10% availability. stopping this download.");
                        throw new C19436o(198, sb.toString());
                    }
                }
            }
            if (file.equals(this.f52618a)) {
                b = m63915a(this.f52618a);
                if (b < j) {
                    m63914a(i, 10485760);
                    mo51479b();
                    b = m63915a(this.f52618a);
                }
            }
            if (b < j) {
                StringBuilder sb2 = new StringBuilder("not enough free space in the filesystem rooted at: ");
                sb2.append(file);
                sb2.append(" and unable to free any more");
                throw new C19436o(198, sb2.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51480b(int r2, java.lang.String r3, long r4) throws com.p280ss.android.download.C19436o {
        /*
            r1 = this;
            r1.m63920e()
            if (r3 == 0) goto L_0x005c
            switch(r2) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0039
        L_0x0009:
            java.io.File r0 = r1.f52619b
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0018
            java.io.File r0 = r1.f52619b
            goto L_0x003a
        L_0x0018:
            java.io.File r0 = r1.f52618a
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0027
            java.io.File r0 = r1.f52618a
            goto L_0x003a
        L_0x0027:
            java.io.File r0 = r1.f52620c
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0039
            java.io.File r0 = r1.f52620c
            goto L_0x003a
        L_0x0036:
            java.io.File r0 = r1.f52619b
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            r1.m63917a(r0, r4, r2)
            return
        L_0x0040:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "invalid combination of destination: "
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r2 = ", path: "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            throw r4
        L_0x005c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "path can't be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19437p.mo51480b(int, java.lang.String, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final File mo51476a(String str, int i, long j) throws C19436o {
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f52619b.getPath());
            sb.append(C19357a.f52375a);
            File file = new File(sb.toString());
            if (file.isDirectory() || file.mkdir()) {
                return file;
            }
            StringBuilder sb2 = new StringBuilder("unable to create external downloads directory ");
            sb2.append(file.getPath());
            throw new C19436o(492, sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("unexpected value for destination: ");
        sb3.append(i);
        throw new IllegalStateException(sb3.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51478a(int i, String str, long j) throws C19436o {
        if (m63913a(j) >= 1048576) {
            mo51480b(i, str, j);
        }
    }
}
