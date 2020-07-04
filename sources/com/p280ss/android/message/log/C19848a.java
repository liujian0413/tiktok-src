package com.p280ss.android.message.log;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.C6319n;

/* renamed from: com.ss.android.message.log.a */
public final class C19848a {

    /* renamed from: a */
    static final String[] f53817a = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json"};

    /* renamed from: b */
    private static final Object f53818b = new Object();

    /* renamed from: c */
    private static C19848a f53819c;

    /* renamed from: d */
    private SQLiteDatabase f53820d;

    /* renamed from: com.ss.android.message.log.a$a */
    static class C19849a extends SQLiteOpenHelper {
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C19849a(Context context) {
            super(context, "ss_push_log.db", null, 1);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT )");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private synchronized void m65549b() {
        try {
            if (this.f53820d != null && this.f53820d.isOpen()) {
                this.f53820d.close();
                this.f53820d = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m65547a() {
        synchronized (f53818b) {
            if (f53819c != null) {
                f53819c.m65549b();
            }
            f53819c = null;
        }
    }

    private C19848a(Context context) {
        this.f53820d = new C19849a(context).getWritableDatabase();
    }

    /* renamed from: a */
    private static void m65548a(Cursor cursor) {
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
    public static C19848a m65546a(Context context) {
        synchronized (f53818b) {
            if (f53819c == null) {
                f53819c = new C19848a(context.getApplicationContext());
            }
        }
        return f53819c;
    }

    /* renamed from: a */
    public final synchronized long mo53210a(C19850b bVar) {
        if (this.f53820d != null) {
            if (this.f53820d.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", bVar.f53821a);
                contentValues.put("tag", bVar.f53822b);
                if (!C6319n.m19593a(bVar.f53823c)) {
                    contentValues.put("label", bVar.f53823c);
                }
                contentValues.put("value", Long.valueOf(bVar.f53824d));
                contentValues.put("ext_value", Long.valueOf(bVar.f53825e));
                if (!C6319n.m19593a(bVar.f53826f)) {
                    contentValues.put("ext_json", bVar.f53826f);
                }
                return this.f53820d.insert("event", null, contentValues);
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo53212a(long r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.f53820d     // Catch:{ all -> 0x002a }
            r1 = 0
            if (r0 == 0) goto L_0x0028
            android.database.sqlite.SQLiteDatabase r0 = r4.f53820d     // Catch:{ all -> 0x002a }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x002a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x002a }
            r2[r1] = r5     // Catch:{ all -> 0x002a }
            android.database.sqlite.SQLiteDatabase r5 = r4.f53820d     // Catch:{ all -> 0x002a }
            java.lang.String r6 = "event"
            java.lang.String r3 = "_id = ?"
            int r5 = r5.delete(r6, r3, r2)     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x0026
            monitor-exit(r4)
            return r0
        L_0x0026:
            monitor-exit(r4)
            return r1
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.log.C19848a.mo53212a(long):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONArray mo53211a(long r19, int r21) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            java.lang.String r9 = "_id ASC"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r0.<init>()     // Catch:{ all -> 0x00da }
            r11 = 5
            r0.append(r11)     // Catch:{ all -> 0x00da }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x00da }
            java.lang.String r5 = "_id > ? "
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x00da }
            java.lang.String r2 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x00da }
            r12 = 0
            r6[r12] = r2     // Catch:{ all -> 0x00da }
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ all -> 0x00da }
            r13.<init>()     // Catch:{ all -> 0x00da }
            android.database.sqlite.SQLiteDatabase r2 = r1.f53820d     // Catch:{ Throwable -> 0x00d0, all -> 0x00ca }
            java.lang.String r3 = "event"
            java.lang.String[] r4 = f53817a     // Catch:{ Throwable -> 0x00d0, all -> 0x00ca }
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x00d0, all -> 0x00ca }
            r3 = 0
        L_0x0030:
            boolean r4 = r2.moveToNext()     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            if (r4 == 0) goto L_0x00c4
            long r4 = r2.getLong(r12)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            java.lang.String r6 = r2.getString(r0)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            r7 = 2
            java.lang.String r7 = r2.getString(r7)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            r8 = 3
            boolean r9 = r2.isNull(r8)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            if (r9 != 0) goto L_0x004f
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            goto L_0x0050
        L_0x004f:
            r8 = 0
        L_0x0050:
            r9 = 4
            boolean r10 = r2.isNull(r9)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            if (r10 != 0) goto L_0x005c
            long r9 = r2.getLong(r9)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            goto L_0x005e
        L_0x005c:
            r9 = 0
        L_0x005e:
            boolean r16 = r2.isNull(r11)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            if (r16 != 0) goto L_0x006b
            long r16 = r2.getLong(r11)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            r11 = r16
            goto L_0x006d
        L_0x006b:
            r11 = 0
        L_0x006d:
            r0 = 6
            boolean r16 = r2.isNull(r0)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            if (r16 != 0) goto L_0x0079
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            r14.<init>()     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            java.lang.String r15 = "_id"
            r14.put(r15, r4)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            if (r4 != 0) goto L_0x008f
            java.lang.String r4 = "ext_json"
            r14.put(r4, r0)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
        L_0x008f:
            java.lang.String r0 = "category"
            r14.put(r0, r6)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            java.lang.String r0 = "tag"
            r14.put(r0, r7)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "label"
            r14.put(r0, r8)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
        L_0x00a4:
            r4 = 0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = "value"
            r14.put(r0, r9)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
        L_0x00af:
            r4 = 0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "ext_value"
            r14.put(r0, r11)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
        L_0x00ba:
            r13.put(r14)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c8 }
            int r3 = r3 + 1
            r0 = 1
            r11 = 5
            r12 = 0
            goto L_0x0030
        L_0x00c4:
            m65548a(r2)     // Catch:{ all -> 0x00da }
            goto L_0x00d3
        L_0x00c8:
            r0 = move-exception
            goto L_0x00cc
        L_0x00ca:
            r0 = move-exception
            r2 = 0
        L_0x00cc:
            m65548a(r2)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00d0:
            r2 = 0
            r3 = 0
            goto L_0x00c4
        L_0x00d3:
            if (r3 <= 0) goto L_0x00d7
            monitor-exit(r18)
            return r13
        L_0x00d7:
            monitor-exit(r18)
            r2 = 0
            return r2
        L_0x00da:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.log.C19848a.mo53211a(long, int):org.json.JSONArray");
    }
}
