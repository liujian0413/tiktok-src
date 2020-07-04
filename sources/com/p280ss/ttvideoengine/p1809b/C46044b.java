package com.p280ss.ttvideoengine.p1809b;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.ttvideoengine.p1816i.C46123h;

/* renamed from: com.ss.ttvideoengine.b.b */
public class C46044b {

    /* renamed from: a */
    private static SQLiteDatabase f117625a = null;

    /* renamed from: b */
    private static C46044b f117626b = null;

    /* renamed from: c */
    private static int f117627c = 200;

    /* renamed from: com.ss.ttvideoengine.b.b$a */
    public static class C46045a {

        /* renamed from: a */
        public long f117628a;

        /* renamed from: b */
        public String f117629b;

        /* renamed from: c */
        public String f117630c;
    }

    /* renamed from: a */
    private static int m144251a() {
        if (f117625a == null) {
            return -1;
        }
        int i = 0;
        try {
            Cursor rawQuery = f117625a.rawQuery(C1642a.m8034a("SELECT COUNT(*) FROM %s", new Object[]{"videomodel"}), null);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder("count:");
        sb.append(i);
        C46123h.m144545a("VideoModelDBManager", sb.toString());
        return i;
    }

    /* renamed from: a */
    public static C46044b m144253a(Context context) {
        if (f117626b == null) {
            synchronized (C46044b.class) {
                if (f117626b == null) {
                    f117626b = new C46044b(context);
                }
            }
        }
        return f117626b;
    }

    private C46044b(Context context) {
        if (context != null) {
            C46043a a = C46043a.m144250a(context);
            if (a != null) {
                try {
                    SQLiteDatabase writableDatabase = a.getWritableDatabase();
                    f117625a = writableDatabase;
                    if (writableDatabase != null) {
                        f117625a.execSQL(C1642a.m8034a("CREATE TABLE IF NOT EXISTS %s(vid TEXT PRIMARY KEY,videomodel TEXT,time INTEGER)", new Object[]{"videomodel"}));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static C46045a m144252a(String str) {
        C46045a aVar;
        if (TextUtils.isEmpty(str) || f117625a == null) {
            return null;
        }
        try {
            Cursor rawQuery = f117625a.rawQuery(C1642a.m8034a("SELECT * FROM %s WHERE vid='%s'", new Object[]{"videomodel", str}), null);
            aVar = new C46045a();
            try {
                aVar.f117630c = str;
                if (rawQuery.moveToFirst()) {
                    aVar.f117629b = rawQuery.getString(rawQuery.getColumnIndex("videomodel"));
                    aVar.f117628a = rawQuery.getLong(rawQuery.getColumnIndex("time"));
                }
                rawQuery.close();
                StringBuilder sb = new StringBuilder("query vid:");
                sb.append(str);
                sb.append(" videomodel:");
                sb.append(aVar.f117629b);
                C46123h.m144545a("VideoModelDBManager", sb.toString());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            aVar = null;
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m144254a(String str, String str2) {
        if (f117625a != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("insert vid:");
            sb.append(str);
            sb.append(" videomodel:");
            sb.append(str2);
            C46123h.m144545a("VideoModelDBManager", sb.toString());
            f117625a.beginTransaction();
            boolean z = true;
            try {
                f117625a.execSQL(C1642a.m8034a("REPLACE INTO %s VALUES ('%s','%s',%d)", new Object[]{"videomodel", str, str2, Long.valueOf(System.currentTimeMillis())}));
                f117625a.execSQL(C1642a.m8034a("DELETE FROM %s WHERE vid IN (SELECT vid FROM %s ORDER BY time DESC LIMIT -1 OFFSET %d)", new Object[]{"videomodel", "videomodel", Integer.valueOf(f117627c)}));
                f117625a.setTransactionSuccessful();
            } catch (SQLException unused) {
                f117625a.endTransaction();
            } catch (IllegalStateException unused2) {
            } catch (Throwable th) {
                f117625a.endTransaction();
                throw th;
            }
            f117625a.endTransaction();
            z = false;
            if (z) {
                int a = m144251a();
                if (a > 0) {
                    int i = a - 10;
                    f117627c = i;
                    if (i < 20) {
                        f117627c = 20;
                    }
                }
            }
        }
    }
}
