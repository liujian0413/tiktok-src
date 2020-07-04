package com.bytedance.frameworks.baselib.p511a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

/* renamed from: com.bytedance.frameworks.baselib.a.a */
class C10069a {

    /* renamed from: a */
    static final String[] f27402a = {"_id", "value", "type", "timestamp", "retry_count", "retry_time"};

    /* renamed from: b */
    private static C10069a f27403b;

    /* renamed from: c */
    private SQLiteDatabase f27404c;

    /* renamed from: com.bytedance.frameworks.baselib.a.a$a */
    static class C10070a extends SQLiteOpenHelper {
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C10070a(Context context) {
            super(context, "lib_log_queue.db", null, 1);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            } catch (Exception e) {
                new StringBuilder("create db exception ").append(e);
            }
        }
    }

    /* renamed from: b */
    private synchronized boolean m29917b() {
        if (this.f27404c == null || !this.f27404c.isOpen()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo24722a() {
        if (m29917b()) {
            try {
                this.f27404c.execSQL("DROP TABLE IF EXISTS queue");
                this.f27404c.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            } catch (Exception e) {
                new StringBuilder("recreateTableQueue db exception ").append(e);
            }
        }
    }

    /* renamed from: a */
    private static void m29916a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    private C10069a(Context context) {
        if (context != null) {
            try {
                this.f27404c = new C10070a(context.getApplicationContext()).getWritableDatabase();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static C10069a m29915a(Context context) {
        if (f27403b == null) {
            synchronized (C10069a.class) {
                if (f27403b == null) {
                    f27403b = new C10069a(context);
                }
            }
        }
        return f27403b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized long mo24719a(String str) {
        long j = 0;
        if (!m29917b()) {
            return 0;
        }
        Cursor cursor = null;
        String str2 = "select count(*) from queue";
        try {
            if (!TextUtils.isEmpty(null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" ");
                sb.append(null);
                str2 = sb.toString();
            }
            Cursor rawQuery = this.f27404c.rawQuery(str2, null);
            try {
                if (rawQuery.moveToNext()) {
                    j = rawQuery.getLong(0);
                }
                m29916a(rawQuery);
            } catch (Throwable th) {
                th = th;
                cursor = rawQuery;
                m29916a(cursor);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            m29916a(cursor);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bytedance.frameworks.baselib.a.c] */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r12v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r2v6, types: [com.bytedance.frameworks.baselib.a.c] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r13 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r13 = th;
        r12 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v3
      assigns: []
      uses: []
      mth insns count: 60
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0026] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x007c=Splitter:B:35:0x007c, B:18:0x005d=Splitter:B:18:0x005d} */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.frameworks.baselib.p511a.C10075c mo24721a(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.m29917b()     // Catch:{ all -> 0x0080 }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            monitor-exit(r11)
            return r1
        L_0x000a:
            java.lang.String r9 = "_id ASC"
            java.lang.String r10 = "1"
            java.lang.String r5 = "_id > ?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ Exception -> 0x006a }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x006a }
            r13 = 0
            r6[r13] = r12     // Catch:{ Exception -> 0x006a }
            android.database.sqlite.SQLiteDatabase r2 = r11.f27404c     // Catch:{ Exception -> 0x006a }
            java.lang.String r3 = "queue"
            java.lang.String[] r4 = f27402a     // Catch:{ Exception -> 0x006a }
            r7 = 0
            r8 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x006a }
            boolean r2 = r12.moveToNext()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            if (r2 == 0) goto L_0x005d
            com.bytedance.frameworks.baselib.a.c r2 = new com.bytedance.frameworks.baselib.a.c     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r2.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            long r3 = r12.getLong(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f27412a = r3     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            byte[] r13 = r12.getBlob(r0)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f27413b = r13     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r13 = 2
            java.lang.String r13 = r12.getString(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f27417f = r13     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r13 = 3
            long r0 = r12.getLong(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f27414c = r0     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r13 = 4
            int r13 = r12.getInt(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f27415d = r13     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r13 = 5
            long r0 = r12.getLong(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f27416e = r0     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r1 = r2
            goto L_0x005d
        L_0x005b:
            r13 = move-exception
            goto L_0x0065
        L_0x005d:
            m29916a(r12)     // Catch:{ all -> 0x0080 }
            goto L_0x007a
        L_0x0061:
            r13 = move-exception
            goto L_0x007c
        L_0x0063:
            r13 = move-exception
            r2 = r1
        L_0x0065:
            r1 = r12
            goto L_0x006c
        L_0x0067:
            r13 = move-exception
            r12 = r1
            goto L_0x007c
        L_0x006a:
            r13 = move-exception
            r2 = r1
        L_0x006c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "getLog exception "
            r12.<init>(r0)     // Catch:{ all -> 0x0067 }
            r12.append(r13)     // Catch:{ all -> 0x0067 }
            m29916a(r1)     // Catch:{ all -> 0x0080 }
            r1 = r2
        L_0x007a:
            monitor-exit(r11)
            return r1
        L_0x007c:
            m29916a(r12)     // Catch:{ all -> 0x0080 }
            throw r13     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.p511a.C10069a.mo24721a(long):com.bytedance.frameworks.baselib.a.c");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized long mo24720a(String str, byte[] bArr) {
        if (m29917b() && bArr != null) {
            if (bArr.length > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", bArr);
                contentValues.put("type", str);
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("retry_count", Integer.valueOf(0));
                contentValues.put("retry_time", Long.valueOf(0));
                return this.f27404c.insert("queue", null, contentValues);
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo24723a(String str, int i, long j) {
        String[] strArr;
        String str2;
        if (m29917b()) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (TextUtils.isEmpty(str)) {
                str2 = "timestamp <= ? ";
                strArr = new String[]{String.valueOf(currentTimeMillis)};
            } else {
                StringBuilder sb = new StringBuilder("(timestamp <= ? OR retry_count > ");
                sb.append(i);
                sb.append(") and type");
                sb.append(" = ?");
                String sb2 = sb.toString();
                String[] strArr2 = {String.valueOf(currentTimeMillis), str};
                str2 = sb2;
                strArr = strArr2;
            }
            try {
                this.f27404c.delete("queue", str2, strArr);
            } catch (Exception e) {
                new StringBuilder("delete expire log error:").append(e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ab */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2 A[SYNTHETIC, Splitter:B:45:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo24724a(long r16, boolean r18, long r19, int r21) {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            monitor-enter(r15)
            boolean r0 = r15.m29917b()     // Catch:{ all -> 0x00bb }
            r4 = 0
            if (r0 == 0) goto L_0x00b9
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0013
            goto L_0x00b9
        L_0x0013:
            r0 = 1
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x00bb }
            r13[r4] = r5     // Catch:{ all -> 0x00bb }
            if (r18 != 0) goto L_0x00a0
            r14 = 0
            r5 = 2
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "timestamp"
            r7[r4] = r5     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "retry_count"
            r7[r0] = r5     // Catch:{ Exception -> 0x008c }
            android.database.sqlite.SQLiteDatabase r5 = r1.f27404c     // Catch:{ Exception -> 0x008c }
            java.lang.String r6 = "queue"
            java.lang.String r8 = "_id = ?"
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r13
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x008c }
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            if (r6 != 0) goto L_0x0043
            m29916a(r5)     // Catch:{ all -> 0x00bb }
            monitor-exit(r15)
            return r4
        L_0x0043:
            long r6 = r5.getLong(r4)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            int r8 = r5.getInt(r0)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r11 = 0
            long r6 = r9 - r6
            int r14 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r14 >= 0) goto L_0x0080
            r6 = r21
            if (r8 >= r6) goto L_0x0080
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r6.<init>()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r7 = "retry_count"
            int r8 = r8 + r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r7 = "retry_time"
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            android.database.sqlite.SQLiteDatabase r7 = r1.f27404c     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r8 = "queue"
            java.lang.String r9 = "_id = ?"
            r7.update(r8, r6, r9, r13)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            m29916a(r5)     // Catch:{ all -> 0x00bb }
            monitor-exit(r15)
            return r0
        L_0x0080:
            m29916a(r5)     // Catch:{ all -> 0x00bb }
            goto L_0x00a0
        L_0x0084:
            r0 = move-exception
            goto L_0x009c
        L_0x0086:
            r0 = move-exception
            r14 = r5
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            r5 = r14
            goto L_0x009c
        L_0x008c:
            r0 = move-exception
        L_0x008d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "onLogSent exception: "
            r5.<init>(r6)     // Catch:{ all -> 0x0089 }
            r5.append(r0)     // Catch:{ all -> 0x0089 }
            m29916a(r14)     // Catch:{ all -> 0x00bb }
            r0 = 0
            goto L_0x00a0
        L_0x009c:
            m29916a(r5)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00a0:
            if (r0 == 0) goto L_0x00b7
            android.database.sqlite.SQLiteDatabase r0 = r1.f27404c     // Catch:{ Throwable -> 0x00ab }
            java.lang.String r5 = "queue"
            java.lang.String r6 = "_id = ?"
            r0.delete(r5, r6, r13)     // Catch:{ Throwable -> 0x00ab }
        L_0x00ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = "delete app_log: "
            r0.<init>(r5)     // Catch:{ all -> 0x00bb }
            r0.append(r2)     // Catch:{ all -> 0x00bb }
            monitor-exit(r15)
            return r4
        L_0x00b7:
            monitor-exit(r15)
            return r4
        L_0x00b9:
            monitor-exit(r15)
            return r4
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.p511a.C10069a.mo24724a(long, boolean, long, int):boolean");
    }
}
