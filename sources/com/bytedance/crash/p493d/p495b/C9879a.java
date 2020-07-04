package com.bytedance.crash.p493d.p495b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.crash.C9875d;
import java.util.HashMap;

/* renamed from: com.bytedance.crash.d.b.a */
public abstract class C9879a<T> {

    /* renamed from: a */
    protected final String f26950a = "_id";

    /* renamed from: b */
    protected final String f26951b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ContentValues mo24445a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<String, String> mo24446a();

    protected C9879a(String str) {
        this.f26951b = str;
    }

    /* renamed from: a */
    public final void mo24447a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f26951b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap a = mo24446a();
            for (String str : a.keySet()) {
                sb.append(str);
                sb.append(" ");
                sb.append((String) a.get(str));
                sb.append(",");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public void mo24448a(SQLiteDatabase sQLiteDatabase, T t) {
        if (!(sQLiteDatabase == null || t == null)) {
            try {
                sQLiteDatabase.insert(this.f26951b, null, mo24445a(t));
            } catch (Throwable unused) {
            }
        }
    }
}
