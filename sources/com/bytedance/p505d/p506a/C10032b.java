package com.bytedance.p505d.p506a;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.bytedance.d.a.b */
public class C10032b extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C10032b f27308a;

    /* renamed from: b */
    private String f27309b;

    /* renamed from: c */
    private String f27310c;

    /* renamed from: d */
    private String f27311d;

    /* renamed from: e */
    private String f27312e;

    private C10032b(Context context) {
        super(context, "gecko_local_info.db", null, 3);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(this.f27312e);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C10032b m29806a(Context context) {
        if (f27308a == null) {
            synchronized (C10032b.class) {
                if (f27308a == null) {
                    f27308a = new C10032b(context);
                }
            }
        }
        return f27308a;
    }

    /* renamed from: b */
    private boolean m29811b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return m29809a(new File(str));
    }

    /* renamed from: a */
    private void m29807a(SQLiteDatabase sQLiteDatabase) {
        String str = this.f27309b;
        int lastIndexOf = str.lastIndexOf("_");
        if (lastIndexOf > 0) {
            str = str.substring(0, lastIndexOf);
        }
        m29808a(sQLiteDatabase, this.f27310c, str);
        try {
            StringBuilder sb = new StringBuilder("DROP TABLE ");
            sb.append(this.f27309b);
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Exception unused) {
        }
        if (!m29810a(this.f27311d)) {
            new File(this.f27311d).mkdirs();
        }
        sQLiteDatabase.execSQL(this.f27312e);
    }

    /* renamed from: a */
    private boolean m29809a(File file) {
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return file.delete();
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                m29809a(listFiles[i]);
            } else {
                listFiles[i].delete();
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    private static boolean m29810a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m29807a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                m29807a(sQLiteDatabase);
                break;
            case 2:
                break;
        }
        try {
            StringBuilder sb = new StringBuilder("alter table ");
            sb.append(this.f27309b);
            sb.append(" add package_type");
            sb.append(" integer default -1");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    private boolean m29808a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder("DROP TABLE ");
            sb.append(str2);
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Exception unused) {
        }
        return m29811b(str);
    }

    /* renamed from: a */
    public final void mo24663a(String str, String str2, String str3) {
        this.f27309b = str;
        this.f27311d = str3;
        this.f27310c = str2;
        StringBuilder sb = new StringBuilder("create table if not exists ");
        sb.append(str);
        sb.append(" (id integer primary key autoincrement,channel");
        sb.append(" text,version");
        sb.append(" integer,update_when_launch");
        sb.append(" integer,zip");
        sb.append(" text,package_dir");
        sb.append(" text,patch_zip");
        sb.append(" text,update_done");
        sb.append(" integer,update_zip");
        sb.append(" text,update_zip_dir");
        sb.append(" text,extra");
        sb.append(" text,package_type");
        sb.append(" integer)");
        this.f27312e = sb.toString();
        getWritableDatabase().execSQL(this.f27312e);
    }
}
