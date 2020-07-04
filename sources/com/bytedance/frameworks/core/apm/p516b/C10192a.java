package com.bytedance.frameworks.core.apm.p516b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.bytedance.frameworks.core.apm.b.a */
public final class C10192a extends SQLiteOpenHelper {
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE local_monitor_log ( _id Integer PRIMARY KEY AUTOINCREMENT, type VARCHAR, type2 VARCHAR, timestamp Integer, version_id Integer, is_sampled Integer DEFAULT 0, data TEXT, delete_flag TEXT, extra1 TEXT, extra2 TEXT, extra3 TEXT, extra4 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE local_monitor_version ( _id INTEGER PRIMARY KEY AUTOINCREMENT, version_code TEXT, version_name TEXT, manifest_version_code TEXT, update_version_code TEXT, app_version TEXT, extra1 TEXT, extra2 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE t_battery ( _id INTEGER PRIMARY KEY AUTOINCREMENT, version_id Integer, front Integer, timestamp Integer, type TEXT, status Integer, scene TEXT, accumulation Integer, source TEXT, delete_flag Integer DEFAULT 0, process TEXT, main_process Integer, sid TEXT, extra1 TEXT, extra2 TEXT, extra3 TEXT, extra4 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE t_traffic ( _id INTEGER PRIMARY KEY AUTOINCREMENT, version_id Integer, timestamp Integer, network_type Integer, front Integer, type TEXT, type2 Integer, value Integer, send Integer, sid Integer, delete_flag Integer DEFAULT 0, content TEXT, extra1 TEXT, extra2 TEXT, extra3 TEXT, extra4 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE t_apiall ( _id INTEGER PRIMARY KEY AUTOINCREMENT, version_id Integer, front Integer, timestamp Integer, hit_rules Integer DEFAULT 0, traffic_value Integer DEFAULT 0, type TEXT, type2 TEXT, type3 TEXT, type4 TEXT, network_type Integer, sid Integer, is_sampled Integer, delete_flag Integer, data TEXT, extra1 TEXT, extra2 TEXT, extra3 TEXT, extra4 TEXT  )");
        } catch (Exception unused) {
        }
    }

    public C10192a(Context context, String str) {
        super(context, str, null, 1);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.setVersion(1);
    }
}
