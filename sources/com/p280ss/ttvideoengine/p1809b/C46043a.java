package com.p280ss.ttvideoengine.p1809b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.ss.ttvideoengine.b.a */
public class C46043a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C46043a f117624a;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private C46043a(Context context) {
        super(context, "fangqing.db", null, 1);
    }

    /* renamed from: a */
    public static C46043a m144250a(Context context) {
        if (f117624a == null) {
            synchronized (C46043a.class) {
                if (f117624a == null) {
                    f117624a = new C46043a(context);
                }
            }
        }
        return f117624a;
    }
}
