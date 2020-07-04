package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.util.HashSet;

/* renamed from: com.google.android.gms.tagmanager.o */
final class C17040o extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C17036k f47720a;

    C17040o(C17036k kVar, Context context, String str) {
        this.f47720a = kVar;
        super(context, str, null, 1);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m56559a(java.lang.String r10, android.database.sqlite.SQLiteDatabase r11) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r5 = "name"
            r4[r0] = r5     // Catch:{ SQLiteException -> 0x002a }
            java.lang.String r5 = "name=?"
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x002a }
            r6[r0] = r10     // Catch:{ SQLiteException -> 0x002a }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x002a }
            boolean r1 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0026, all -> 0x0023 }
            if (r11 == 0) goto L_0x0022
            r11.close()
        L_0x0022:
            return r1
        L_0x0023:
            r10 = move-exception
            r1 = r11
            goto L_0x0045
        L_0x0026:
            r1 = r11
            goto L_0x002a
        L_0x0028:
            r10 = move-exception
            goto L_0x0045
        L_0x002a:
            java.lang.String r11 = "Error querying for table "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0028 }
            int r2 = r10.length()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x003a
            r11.concat(r10)     // Catch:{ all -> 0x0028 }
            goto L_0x003f
        L_0x003a:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0028 }
            r10.<init>(r11)     // Catch:{ all -> 0x0028 }
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()
        L_0x0044:
            return r0
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()
        L_0x004a:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C17040o.m56559a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            this.f47720a.f47711c.getDatabasePath("google_tagmanager.db").delete();
            sQLiteDatabase = null;
        }
        return sQLiteDatabase == null ? super.getWritableDatabase() : sQLiteDatabase;
    }

    /* JADX INFO: finally extract failed */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        if (!m56559a("datalayer", sQLiteDatabase)) {
            sQLiteDatabase.execSQL(C17036k.f47709a);
            return;
        }
        Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
        HashSet hashSet = new HashSet();
        try {
            String[] columnNames = rawQuery2.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            rawQuery2.close();
            if (!hashSet.remove("key") || !hashSet.remove("value") || !hashSet.remove("ID") || !hashSet.remove("expires")) {
                throw new SQLiteException("Database column missing");
            } else if (!hashSet.isEmpty()) {
                throw new SQLiteException("Database has extra columns");
            }
        } catch (Throwable th) {
            rawQuery2.close();
            throw th;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C17046u.m56568a(sQLiteDatabase.getPath());
    }
}
