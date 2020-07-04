package com.bytedance.ies.geckoclient.p571e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.ies.geckoclient.model.PackageStatisticModel;
import com.bytedance.p505d.p506a.C10031a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.geckoclient.e.c */
public class C10866c extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C10866c f29401a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public final List<PackageStatisticModel> mo26195a() {
        Cursor cursor;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = getWritableDatabase().query("gecko_clean_statistic", null, null, null, null, null, null);
            if (cursor == null) {
                return arrayList;
            }
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(cursor.getColumnIndex("access_key"));
                    String string2 = cursor.getString(cursor.getColumnIndex("channel"));
                    int i = cursor.getInt(cursor.getColumnIndex("clean_type"));
                    int i2 = cursor.getInt(cursor.getColumnIndex("status"));
                    int i3 = cursor.getInt(cursor.getColumnIndex("pkg_id"));
                    int i4 = cursor.getInt(cursor.getColumnIndex("err_code"));
                    String string3 = cursor.getString(cursor.getColumnIndex("err_msg"));
                    int i5 = cursor.getInt(cursor.getColumnIndex("clean_strategy"));
                    long j = cursor.getLong(cursor.getColumnIndex("clean_duration"));
                    PackageStatisticModel packageStatisticModel = new PackageStatisticModel();
                    packageStatisticModel.setAccessKey(string);
                    packageStatisticModel.setChannel(string2);
                    packageStatisticModel.setStatsType(Integer.valueOf(i2));
                    packageStatisticModel.setId(Integer.valueOf(i3));
                    if (i4 == 0) {
                        str = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i4);
                        str = sb.toString();
                    }
                    packageStatisticModel.setErrCode(str);
                    packageStatisticModel.setErrMsg(string3);
                    packageStatisticModel.setCleanType(Integer.valueOf(i));
                    packageStatisticModel.setCleanDuration(Long.valueOf(j));
                    packageStatisticModel.setCleanStrategy(Integer.valueOf(i5));
                    arrayList.add(packageStatisticModel);
                } catch (Exception unused) {
                }
            }
            getWritableDatabase().delete("gecko_clean_statistic", null, null);
            C10031a.m29804a(cursor);
            return arrayList;
        } catch (Exception unused2) {
            cursor = null;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists gecko_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    /* renamed from: a */
    public static C10866c m31876a(Context context) {
        if (f29401a == null) {
            synchronized (C10866c.class) {
                if (f29401a == null) {
                    f29401a = new C10866c(context.getApplicationContext(), "gecko_clean_statistic.db", null, 1);
                }
            }
        }
        return f29401a;
    }

    private C10866c(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, null, 1);
    }

    /* renamed from: a */
    public final void mo26196a(String str, String str2, int i, int i2, int i3, int i4, String str3, long j, int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put("channel", str2);
        contentValues.put("clean_type", Integer.valueOf(i));
        contentValues.put("status", Integer.valueOf(i2));
        contentValues.put("pkg_id", Integer.valueOf(i3));
        contentValues.put("err_code", Integer.valueOf(i4));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j));
        contentValues.put("clean_strategy", Integer.valueOf(1));
        try {
            getWritableDatabase().insert("gecko_clean_statistic", null, contentValues);
        } catch (Exception unused) {
        }
    }
}
