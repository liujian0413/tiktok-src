package com.bytedance.framwork.core.p517a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.framwork.core.sdkmonitor.C10246e;

/* renamed from: com.bytedance.framwork.core.a.a */
public class C10203a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C10203a f27751a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE monitor_log ( _id Integer PRIMARY KEY AUTOINCREMENT, aid Integer, type VARCHAR, type2 VARCHAR, time Integer, data TEXT, data2 TEXT, data3 TEXT  )");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C10203a m30283a(Context context) {
        if (f27751a == null) {
            synchronized (C10203a.class) {
                if (f27751a == null) {
                    String a = C10246e.m30371a(context);
                    StringBuilder sb = new StringBuilder();
                    sb.append(a);
                    sb.append("sdkmon.db");
                    f27751a = new C10203a(context, sb.toString());
                }
            }
        }
        return f27751a;
    }

    private C10203a(Context context, String str) {
        super(context, str, null, 1);
    }
}
