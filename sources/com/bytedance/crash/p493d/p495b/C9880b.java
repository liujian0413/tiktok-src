package com.bytedance.crash.p493d.p495b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.crash.p493d.p494a.C9877a;
import java.util.HashMap;

/* renamed from: com.bytedance.crash.d.b.b */
public final class C9880b extends C9879a<C9877a> {
    public C9880b() {
        super("duplicatelog");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<String, String> mo24446a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("path", "TEXT");
        hashMap.put("insert_time", "INTEGER");
        hashMap.put("ext1", "TEXT");
        hashMap.put("ext2", "TEXT");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo24445a(Object obj) {
        return m29142a((C9877a) obj);
    }

    /* renamed from: a */
    private static ContentValues m29142a(C9877a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar.f26948a);
        contentValues.put("insert_time", Long.valueOf(aVar.f26949b));
        return contentValues;
    }

    /* renamed from: a */
    public final void mo24448a(SQLiteDatabase sQLiteDatabase, C9877a aVar) {
        if (aVar != null && !mo24450a(sQLiteDatabase, aVar.f26948a)) {
            super.mo24448a(sQLiteDatabase, aVar);
            try {
                StringBuilder sb = new StringBuilder("delete from ");
                sb.append(this.f26951b);
                sb.append(" where _id");
                sb.append(" in (select _id");
                sb.append(" from ");
                sb.append(this.f26951b);
                sb.append(" order by insert_time");
                sb.append(" desc limit 1000 offset 500");
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo24450a(SQLiteDatabase sQLiteDatabase, String str) {
        int i;
        if (sQLiteDatabase == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            Cursor query = sQLiteDatabase2.query(this.f26951b, null, "path=?", new String[]{str}, null, null, null);
            i = query.getCount();
            try {
                query.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }
}
