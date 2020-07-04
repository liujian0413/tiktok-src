package com.bytedance.crash.p493d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.crash.p493d.p495b.C9880b;

/* renamed from: com.bytedance.crash.d.b */
public final class C9878b extends SQLiteOpenHelper {
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C9878b(Context context) {
        super(context, "npth_log.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        new C9880b().mo24447a(sQLiteDatabase);
    }
}
