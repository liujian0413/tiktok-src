package com.bytedance.p505d.p506a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.bytedance.d.a.a */
public final class C10031a {
    /* renamed from: a */
    public static boolean m29804a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m29805a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
