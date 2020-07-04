package com.p280ss.android.ugc.trill.p1757a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.a.a */
public class C44972a extends SQLiteOpenHelper {

    /* renamed from: c */
    private static C44972a f115646c;

    /* renamed from: a */
    public SQLiteDatabase f115647a = getWritableDatabase();

    /* renamed from: b */
    public SQLiteDatabase f115648b = getReadableDatabase();

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private C44972a() {
        super(C6399b.m19921a(), "TIKTOK.db", null, 1);
    }

    /* renamed from: a */
    public static C44972a m141913a() {
        if (f115646c == null) {
            synchronized (C44972a.class) {
                if (f115646c == null) {
                    f115646c = new C44972a();
                }
            }
        }
        return f115646c;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `app_open` (\n\t`open_time`\tINTEGER UNIQUE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `like_dialog_open` (\n\t`open_time`\tINTEGER,\n\t`version`\tINTEGER\n);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            C10761a.m31399c((Context) AwemeApplication.m21341a(), (int) R.string.fk5).mo25750a();
            System.exit(0);
        }
    }
}
