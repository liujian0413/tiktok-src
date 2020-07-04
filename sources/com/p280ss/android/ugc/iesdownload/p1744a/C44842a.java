package com.p280ss.android.ugc.iesdownload.p1744a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.ss.android.ugc.iesdownload.a.a */
public final class C44842a extends SQLiteOpenHelper {

    /* renamed from: a */
    public static Context f115332a;

    /* renamed from: com.ss.android.ugc.iesdownload.a.a$a */
    static class C44844a {

        /* renamed from: a */
        public static final C44842a f115333a;

        static {
            C44842a aVar = new C44842a(C44842a.f115332a, "okdownload.db");
            f115333a = aVar;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table downloadinfo (id INTEGER primary key,url TEXT,filePath TEXT,startTime INTEGER,finishTime INTEGER,fileSize INTEGER,status INTEGER)");
    }

    /* renamed from: a */
    public static C44842a m141513a(Context context) {
        if (context == null) {
            return null;
        }
        if (f115332a == null) {
            f115332a = context;
        }
        return C44844a.f115333a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0062, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0056, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0058, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r0 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005f, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x005c A[ExcHandler: all (r7v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107282a(com.p280ss.android.ugc.iesdownload.C44854e r7) {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "url"
            java.lang.String r3 = r7.f115342b     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "filePath"
            java.lang.String r3 = r7.f115343c     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "startTime"
            long r3 = r7.f115344d     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "finishTime"
            long r3 = r7.f115345e     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "fileSize"
            long r3 = r7.f115346f     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "status"
            int r3 = r7.f115348h     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "downloadinfo"
            java.lang.String r3 = "url = ?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r5 = 0
            java.lang.String r7 = r7.f115342b     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r4[r5] = r7     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            int r7 = r0.update(r2, r1, r3, r4)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r0.close()     // Catch:{ Exception -> 0x0064, all -> 0x005c }
            if (r0 == 0) goto L_0x0067
        L_0x0058:
            r0.close()
            goto L_0x0067
        L_0x005c:
            r7 = move-exception
            if (r0 == 0) goto L_0x0062
            r0.close()
        L_0x0062:
            throw r7
        L_0x0063:
            r7 = -1
        L_0x0064:
            if (r0 == 0) goto L_0x0067
            goto L_0x0058
        L_0x0067:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.iesdownload.p1744a.C44842a.mo107282a(com.ss.android.ugc.iesdownload.e):int");
    }

    /* renamed from: b */
    public final int mo107284b(String str, String str2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        String str3 = "downloadinfo";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" = ?");
            writableDatabase.delete(str3, sb.toString(), new String[]{str2});
        } catch (Exception unused) {
        } catch (Throwable th) {
            writableDatabase.close();
            throw th;
        }
        writableDatabase.close();
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009a, code lost:
        if (r1 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r1 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b7, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.iesdownload.C44854e> mo107283a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r5.getWritableDatabase()
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            java.lang.String r4 = "select * from downloadinfo where "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            r3.append(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            java.lang.String r6 = " = ?"
            r3.append(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            r4 = 0
            r3[r4] = r7     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            android.database.Cursor r6 = r1.rawQuery(r6, r3)     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            int r7 = r6.getCount()     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            if (r7 == 0) goto L_0x0095
            boolean r7 = r6.moveToFirst()     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            if (r7 == 0) goto L_0x0095
        L_0x0033:
            com.ss.android.ugc.iesdownload.e r7 = new com.ss.android.ugc.iesdownload.e     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.<init>()     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "id"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            int r2 = r6.getInt(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f115341a = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "url"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = r6.getString(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f115342b = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "filePath"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = r6.getString(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f115343c = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "startTime"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            long r2 = r6.getLong(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f115344d = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "finishTime"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            long r2 = r6.getLong(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f115345e = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "fileSize"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            long r2 = r6.getLong(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f115346f = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "status"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            int r2 = r6.getInt(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f115348h = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r0.add(r7)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            boolean r7 = r6.moveToNext()     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            if (r7 != 0) goto L_0x0033
        L_0x0095:
            if (r6 == 0) goto L_0x009a
            r6.close()
        L_0x009a:
            if (r1 == 0) goto L_0x00b7
            goto L_0x00b4
        L_0x009d:
            r7 = move-exception
            goto L_0x00a1
        L_0x009f:
            r7 = move-exception
            r6 = r2
        L_0x00a1:
            if (r6 == 0) goto L_0x00a6
            r6.close()
        L_0x00a6:
            if (r1 == 0) goto L_0x00ab
            r1.close()
        L_0x00ab:
            throw r7
        L_0x00ac:
            r6 = r2
        L_0x00ad:
            if (r6 == 0) goto L_0x00b2
            r6.close()
        L_0x00b2:
            if (r1 == 0) goto L_0x00b7
        L_0x00b4:
            r1.close()
        L_0x00b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.iesdownload.p1744a.C44842a.mo107283a(java.lang.String, java.lang.String):java.util.List");
    }

    private C44842a(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }
}
