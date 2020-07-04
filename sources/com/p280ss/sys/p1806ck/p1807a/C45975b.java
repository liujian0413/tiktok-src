package com.p280ss.sys.p1806ck.p1807a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.ss.sys.ck.a.b */
public final class C45975b extends SQLiteOpenHelper {
    public C45975b(Context context) {
        super(context, "cms_log.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS SCCheckLog ( _id INTEGER PRIMARY KEY , tag TEXT , timestamp INTEGER, log TEXT  ) ");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
