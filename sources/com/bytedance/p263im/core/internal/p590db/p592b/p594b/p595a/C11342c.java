package com.bytedance.p263im.core.internal.p590db.p592b.p594b.p595a;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;

/* renamed from: com.bytedance.im.core.internal.db.b.b.a.c */
public final class C11342c implements C11351d {

    /* renamed from: a */
    private SQLiteDatabase f30713a;

    /* renamed from: b */
    public final void mo27368b() {
        this.f30713a.close();
    }

    /* renamed from: c */
    public final boolean mo27369c() {
        return this.f30713a.inTransaction();
    }

    /* renamed from: d */
    public final void mo27370d() {
        this.f30713a.beginTransaction();
    }

    /* renamed from: e */
    public final void mo27371e() {
        this.f30713a.setTransactionSuccessful();
    }

    /* renamed from: f */
    public final void mo27372f() {
        this.f30713a.endTransaction();
    }

    /* renamed from: a */
    public final boolean mo27366a() {
        return this.f30713a.isOpen();
    }

    public C11342c(SQLiteDatabase sQLiteDatabase) {
        this.f30713a = sQLiteDatabase;
    }

    /* renamed from: b */
    public final C11354f mo27367b(String str) throws SQLException {
        return new C11344e(this.f30713a.compileStatement(str));
    }

    /* renamed from: a */
    public final void mo27365a(String str) throws SQLException {
        this.f30713a.execSQL(str);
    }

    /* renamed from: a */
    public final C11339b mo27364a(String str, String[] strArr) {
        return new C11340a(this.f30713a.rawQuery(str, strArr));
    }

    /* renamed from: a */
    public final int mo27362a(String str, String str2, String[] strArr) {
        return this.f30713a.delete(str, str2, strArr);
    }

    /* renamed from: a */
    public final long mo27363a(String str, String str2, ContentValues contentValues) {
        return this.f30713a.insert(str, str2, contentValues);
    }

    /* renamed from: a */
    public final int mo27361a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f30713a.update(str, contentValues, str2, strArr);
    }
}
