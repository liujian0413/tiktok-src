package com.bytedance.framwork.core.p517a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.framwork.core.p517a.p519b.C10208a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.framwork.core.a.c */
public final class C10209c {

    /* renamed from: a */
    static boolean f27768a = false;

    /* renamed from: b */
    static long f27769b = 5000;

    /* renamed from: c */
    static final String[] f27770c = {"_id", "data"};

    /* renamed from: i */
    private static C10209c f27771i;

    /* renamed from: j */
    private static String f27772j = "SELECT count(*) FROM monitor_log WHERE aid = ?";

    /* renamed from: k */
    private static String f27773k = "SELECT count(*) FROM monitor_log";

    /* renamed from: d */
    String f27774d = "INSERT INTO monitor_log(aid,type,type2,time,data) VALUES ( ?, ?, ?, ?, ?)";

    /* renamed from: e */
    private Map<String, Integer> f27775e = new HashMap(2);

    /* renamed from: f */
    private int f27776f = 0;

    /* renamed from: g */
    private C10203a f27777g;

    /* renamed from: h */
    private SQLiteDatabase f27778h;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24925a(java.lang.String r7, java.util.List<com.bytedance.framwork.core.p517a.p519b.C10208a> r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.database.sqlite.SQLiteDatabase r0 = r6.f27778h     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0089
            boolean r0 = com.bytedance.framwork.core.p517a.p522e.C10231c.m30354a(r8)     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x000d
            goto L_0x0089
        L_0x000d:
            r6.m30309b()     // Catch:{ all -> 0x008b }
            android.database.sqlite.SQLiteDatabase r0 = r6.f27778h     // Catch:{ all -> 0x008b }
            r0.beginTransaction()     // Catch:{ all -> 0x008b }
            android.database.sqlite.SQLiteDatabase r0 = r6.f27778h     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.lang.String r1 = r6.f27774d     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0021:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            com.bytedance.framwork.core.a.b.a r2 = (com.bytedance.framwork.core.p517a.p519b.C10208a) r2     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 1
            java.lang.String r4 = r2.f27763b     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 2
            java.lang.String r4 = r2.f27764c     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = ""
            goto L_0x0041
        L_0x003f:
            java.lang.String r4 = r2.f27764c     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0041:
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 3
            java.lang.String r4 = r2.f27765d     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x004c
            java.lang.String r4 = ""
            goto L_0x004e
        L_0x004c:
            java.lang.String r4 = r2.f27765d     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x004e:
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 4
            long r4 = r2.f27767f     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.bindLong(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 5
            java.lang.String r4 = r2.f27766e     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x005f
            java.lang.String r2 = ""
            goto L_0x0061
        L_0x005f:
            java.lang.String r2 = r2.f27766e     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0061:
            r0.bindString(r3, r2)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.executeInsert()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            goto L_0x0021
        L_0x0068:
            android.database.sqlite.SQLiteDatabase r0 = r6.f27778h     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r6.m30307a(r7, r8)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            android.database.sqlite.SQLiteDatabase r7 = r6.f27778h     // Catch:{ all -> 0x008b }
            r7.endTransaction()     // Catch:{ all -> 0x008b }
            monitor-exit(r6)
            return
        L_0x007b:
            r7 = move-exception
            android.database.sqlite.SQLiteDatabase r8 = r6.f27778h     // Catch:{ all -> 0x008b }
            r8.endTransaction()     // Catch:{ all -> 0x008b }
            throw r7     // Catch:{ all -> 0x008b }
        L_0x0082:
            android.database.sqlite.SQLiteDatabase r7 = r6.f27778h     // Catch:{ all -> 0x008b }
            r7.endTransaction()     // Catch:{ all -> 0x008b }
            monitor-exit(r6)
            return
        L_0x0089:
            monitor-exit(r6)
            return
        L_0x008b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p517a.C10209c.mo24925a(java.lang.String, java.util.List):void");
    }

    /* renamed from: b */
    private synchronized void m30309b() {
        if (!f27768a) {
            f27768a = true;
            if (((long) m30303a()) >= f27769b) {
                m30305a(500);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m30303a() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.f27778h     // Catch:{ all -> 0x003a }
            r1 = -1
            if (r0 == 0) goto L_0x0038
            android.database.sqlite.SQLiteDatabase r0 = r4.f27778h     // Catch:{ all -> 0x003a }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.f27778h     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            java.lang.String r3 = f27773k     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            android.database.Cursor r2 = r2.rawQuery(r3, r0)     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
            if (r0 == 0) goto L_0x0024
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
            r1 = r0
        L_0x0024:
            m30306a(r2)     // Catch:{ all -> 0x003a }
            goto L_0x0036
        L_0x0028:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x002f
        L_0x002c:
            r0 = r2
            goto L_0x0033
        L_0x002e:
            r1 = move-exception
        L_0x002f:
            m30306a(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x0033:
            m30306a(r0)     // Catch:{ all -> 0x003a }
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p517a.C10209c.m30303a():int");
    }

    /* renamed from: a */
    private static void m30306a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static C10209c m30304a(Context context) {
        if (f27771i == null) {
            synchronized (C10203a.class) {
                if (f27771i == null) {
                    f27771i = new C10209c(context);
                }
            }
        }
        return f27771i;
    }

    private C10209c(Context context) {
        this.f27777g = C10203a.m30283a(context);
        this.f27778h = this.f27777g.getWritableDatabase();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        return -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0029 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m30308b(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.database.sqlite.SQLiteDatabase r0 = r7.f27778h     // Catch:{ all -> 0x003d }
            r1 = -1
            if (r0 == 0) goto L_0x003b
            android.database.sqlite.SQLiteDatabase r0 = r7.f27778h     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x000f
            goto L_0x003b
        L_0x000f:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.f27778h     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            java.lang.String r3 = f27772j     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            r5 = 0
            r4[r5] = r8     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            android.database.Cursor r8 = r2.rawQuery(r3, r4)     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            boolean r0 = r8.moveToNext()     // Catch:{ Exception -> 0x0029, all -> 0x002d }
            if (r0 == 0) goto L_0x0029
            int r0 = r8.getInt(r5)     // Catch:{ Exception -> 0x0029, all -> 0x002d }
            r1 = r0
        L_0x0029:
            m30306a(r8)     // Catch:{ all -> 0x003d }
            goto L_0x0039
        L_0x002d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0033
        L_0x0032:
            r8 = move-exception
        L_0x0033:
            m30306a(r0)     // Catch:{ all -> 0x003d }
            throw r8     // Catch:{ all -> 0x003d }
        L_0x0037:
            r8 = r0
            goto L_0x0029
        L_0x0039:
            monitor-exit(r7)
            return r1
        L_0x003b:
            monitor-exit(r7)
            return r1
        L_0x003d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p517a.C10209c.m30308b(java.lang.String):int");
    }

    /* renamed from: a */
    private synchronized void m30305a(long j) {
        if (this.f27778h != null) {
            try {
                StringBuilder sb = new StringBuilder(" DELETE FROM monitor_log WHERE _id IN (SELECT _id FROM monitor_log ORDER BY _id ASC LIMIT ");
                sb.append(500);
                sb.append(")");
                this.f27778h.execSQL(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized int mo24922a(String str) {
        int i;
        if (this.f27776f <= 10) {
            if (this.f27775e.containsKey(str)) {
                i = ((Integer) this.f27775e.get(str)).intValue();
                this.f27776f++;
            }
        }
        int b = m30308b(str);
        this.f27775e.put(str, Integer.valueOf(b));
        this.f27776f = 0;
        i = b;
        return i;
    }

    /* renamed from: a */
    private void m30307a(String str, int i) {
        if (this.f27775e.containsKey(str) || i <= 0) {
            this.f27775e.put(str, Integer.valueOf(Math.max(0, i + ((Integer) this.f27775e.get(str)).intValue())));
            return;
        }
        this.f27775e.put(str, Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo24923a(java.lang.String r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.f27778h     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002a
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            java.lang.String r0 = "aid = ? AND _id<= ? "
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x002d }
            r2 = 0
            r1[r2] = r4     // Catch:{ all -> 0x002d }
            r2 = 1
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x002d }
            r1[r2] = r5     // Catch:{ all -> 0x002d }
            android.database.sqlite.SQLiteDatabase r5 = r3.f27778h     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "monitor_log"
            int r5 = r5.delete(r6, r0, r1)     // Catch:{ all -> 0x002d }
            int r6 = r5 * -1
            r3.m30307a(r4, r6)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r5
        L_0x002a:
            monitor-exit(r3)
            r4 = -1
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p517a.C10209c.mo24923a(java.lang.String, long):int");
    }

    /* renamed from: a */
    public final List<C10208a> mo24924a(int i, int i2) {
        Cursor cursor;
        try {
            String[] strArr = {String.valueOf(i)};
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            cursor = this.f27778h.query("monitor_log", f27770c, "aid= ?", strArr, null, null, "_id ASC ", sb.toString());
            try {
                if (cursor.getCount() == 0) {
                    m30306a(cursor);
                    return null;
                }
                LinkedList linkedList = new LinkedList();
                while (cursor.moveToNext()) {
                    linkedList.add(new C10208a(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("data"))));
                }
                m30306a(cursor);
                return linkedList;
            } catch (Throwable th) {
                th = th;
                m30306a(cursor);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            m30306a(cursor);
            throw th;
        }
    }
}
